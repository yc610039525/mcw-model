package com.team.cd.pattern.algorithm;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

import com.team.cd.common.utils.file.FileHelper;
import com.team.cd.common.utils.security.Base64DecodingException;

public class Base64 {
	private static final int END_OF_INPUT = -1;
	private static final int NON_BASE_64 = -1;
	private static final int NON_BASE_64_WHITESPACE = -2;
	private static final int NON_BASE_64_PADDING = -3;
	private Base64(){
	}
	protected static final byte[] base64Chars = {
		'A','B','C','D','E','F','G','H',
		'I','J','K','L','M','N','O','P',
		'Q','R','S','T','U','V','W','X',
		'Y','Z','a','b','c','d','e','f',
		'g','h','i','j','k','l','m','n',
		'o','p','q','r','s','t','u','v',
		'w','x','y','z','0','1','2','3',
		'4','5','6','7','8','9','+','/',
	};
	protected static final byte[] reverseBase64Chars = new byte[0x100];
	static {
		for (int i=0; i<reverseBase64Chars.length; i++){
			reverseBase64Chars[i] = NON_BASE_64;
		}
		for (byte i=0; i < base64Chars.length; i++){
			reverseBase64Chars[base64Chars[i]] = i;
		}
		reverseBase64Chars[' '] = NON_BASE_64_WHITESPACE;
		reverseBase64Chars['\n'] = NON_BASE_64_WHITESPACE;
		reverseBase64Chars['\r'] = NON_BASE_64_WHITESPACE;
		reverseBase64Chars['\t'] = NON_BASE_64_WHITESPACE;
		reverseBase64Chars['\f'] = NON_BASE_64_WHITESPACE;
		reverseBase64Chars['='] = NON_BASE_64_PADDING;
	}
	public static final String version = "1.2";
	protected static ResourceBundle labels = ResourceBundle.getBundle("com.Ostermiller.util.Base64",  Locale.getDefault());
	public static String encode(String string){
		return new String(encode(string.getBytes()));
	}
	public static String encode(String string, String enc) throws UnsupportedEncodingException {
		return new String(encode(string.getBytes(enc)), enc);
	}
	public static String encodeToString(byte[] bytes){
		return encodeToString(bytes, false);
	}
	public static String encodeToString(byte[] bytes, boolean lineBreaks){
		try {
			return new String(encode(bytes, lineBreaks), "ASCII");
		} catch (UnsupportedEncodingException iex){
			throw new RuntimeException(iex);
		}
	}
	public static byte[] encode(byte[] bytes){
		return encode(bytes, false);
	}
	public static byte[] encode(byte[] bytes, boolean lineBreaks){
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		int mod;
		int length = bytes.length;
		if ((mod = length % 3) != 0){
			length += 3 - mod;
		}
		length = length * 4 / 3;
		ByteArrayOutputStream out = new ByteArrayOutputStream(length);
		try {
			encode(in, out, lineBreaks);
		} catch (IOException x){
			throw new RuntimeException(x);
		}
		return out.toByteArray();
	}
	public static void encode(File fIn) throws IOException {
		encode(fIn, fIn, true);
	}
	public static void encode(File fIn, boolean lineBreaks) throws IOException {
		encode(fIn, fIn, lineBreaks);
	}
	public static void encode(File fIn, File fOut) throws IOException {
		encode(fIn, fOut, true);
	}
	public static void encode(File fIn, File fOut, boolean lineBreaks) throws IOException {
		File temp = null;
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(fIn));
			temp = File.createTempFile("Base64", null, null);
			out = new BufferedOutputStream(new FileOutputStream(temp));
			encode(in, out, lineBreaks);
			in.close();
			in = null;
			out.flush();
			out.close();
			out = null;
			FileHelper.move(temp, fOut, true);
		} finally {
			if (in != null){
				in.close();
				in = null;
			}
			if (out != null){
				out.flush();
				out.close();
				out = null;
			}
		}
	}
	public static void encode(InputStream in, OutputStream out) throws IOException {
		encode(in, out, true);
	}
	public static void encode(InputStream in, OutputStream out, boolean lineBreaks) throws IOException {
		int[] inBuffer = new int[3];
		int lineCount = 0;
		boolean done = false;
		while (!done && (inBuffer[0] = in.read()) != END_OF_INPUT){
			inBuffer[1] = in.read();
			inBuffer[2] = in.read();
			out.write(base64Chars[ inBuffer[0] >> 2 ]);
			if (inBuffer[1] != END_OF_INPUT){
				out.write(base64Chars [(( inBuffer[0] << 4 ) & 0x30) | (inBuffer[1] >> 4) ]);
				if (inBuffer[2] != END_OF_INPUT){					
					out.write(base64Chars [((inBuffer[1] << 2) & 0x3c) | (inBuffer[2] >> 6) ]);
					out.write(base64Chars [inBuffer[2] & 0x3F]);
				} else {
					out.write(base64Chars [((inBuffer[1] << 2) & 0x3c)]);
					out.write('=');
					done = true;
				}
			} else {
				out.write(base64Chars [(( inBuffer[0] << 4 ) & 0x30)]);
				out.write('=');
				out.write('=');
				done = true;
			}
			lineCount += 4;
			if (lineBreaks && lineCount >= 76){
				out.write('\n');
				lineCount = 0;
			}
		}
		if (lineBreaks && lineCount >= 1){
			out.write('\n');
			lineCount = 0;
		}
		out.flush();
	}
	public static String decode(String string){
		return new String(decode(string.getBytes()));
	}
	public static String decode(String string, String enc) throws UnsupportedEncodingException {
		return new String(decode(string.getBytes(enc)), enc);
	}
	public static String decode(String string, String encIn, String encOut) throws UnsupportedEncodingException {
		return new String(decode(string.getBytes(encIn)), encOut);
	}
	public static String decodeToString(String string){
		return new String(decode(string.getBytes()));
	}
	public static String decodeToString(String string, String enc) throws UnsupportedEncodingException {
		return new String(decode(string.getBytes(enc)), enc);
	}
	public static String decodeToString(String string, String encIn, String encOut) throws UnsupportedEncodingException {
		return new String(decode(string.getBytes(encIn)), encOut);
	}
	public static void decodeToStream(String string, OutputStream out) throws IOException {
		decode(new ByteArrayInputStream(string.getBytes()), out);
	}
	public static void decodeToStream(String string, String enc, OutputStream out) throws UnsupportedEncodingException, IOException {
		decode(new ByteArrayInputStream(string.getBytes(enc)), out);
	}
	public static byte[] decodeToBytes(String string){
		return decode(string.getBytes());
	}
	public static byte[] decodeToBytes(String string, String enc) throws UnsupportedEncodingException {
		return decode(string.getBytes(enc));
	}
	public static String decodeToString(byte[] bytes){
		return new String(decode(bytes));
	}
	public static String decodeToString(byte[] bytes, String enc) throws UnsupportedEncodingException {
		return new String(decode(bytes), enc);
	}
	public static byte[] decodeToBytes(byte[] bytes){
		return decode(bytes);
	}
	public static byte[] decode(byte[] bytes){
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		int mod;
		int length = bytes.length;
		if ((mod = length % 4) != 0){
			length += 4 - mod;
		}
		length = length * 3 / 4;
		ByteArrayOutputStream out = new ByteArrayOutputStream(length);
		try {
			decode(in, out, false);
		} catch (IOException x){
			
			 throw new RuntimeException(x);
		}
		return out.toByteArray();
	}
	public static void decode(byte[] bytes, OutputStream out) throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		decode(in, out, false);
	}
	public static void decodeToStream(byte[] bytes, OutputStream out) throws IOException {
		ByteArrayInputStream in = new ByteArrayInputStream(bytes);
		decode(in, out, false);
	}
	public static void decode(File fIn) throws IOException {
		decode(fIn, fIn, true);
	}
	public static void decode(File fIn, boolean throwExceptions) throws IOException {
		decode(fIn, fIn, throwExceptions);
	}
	public static void decode(File fIn, File fOut) throws IOException {
		decode(fIn, fOut, true);
	}
	public static void decode(File fIn, File fOut, boolean throwExceptions) throws IOException {
		File temp = null;
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new BufferedInputStream(new FileInputStream(fIn));
			temp = File.createTempFile("Base64", null, null);
			out = new BufferedOutputStream(new FileOutputStream(temp));
			decode(in, out, throwExceptions);
			in.close();
			in = null;
			out.flush();
			out.close();
			out = null;
			FileHelper.move(temp, fOut, true);
		} finally {
			if (in != null){
				try {
					in.close();
				} catch (IOException ignore){
					 if (throwExceptions) throw ignore;
				}
				in = null;
			}
			if (out != null){
				try {
					out.flush();
					out.close();
				} catch (IOException ignore){
					 if (throwExceptions) throw ignore;
				}
				out = null;
			}
		}
	}
	private static final int readBase64(InputStream in, boolean throwExceptions) throws IOException {
		int read;
		int numPadding = 0;
		do {
			read = in.read();
			if (read == END_OF_INPUT) return END_OF_INPUT;
			read = reverseBase64Chars[(byte)read];
			if (throwExceptions && (read == NON_BASE_64 || (numPadding > 0 && read > NON_BASE_64))){
				throw new Base64DecodingException (
					MessageFormat.format(
						labels.getString("unexpectedchar"),
						(Object[])new String[] {
							"'" + (char)read + "' (0x" + Integer.toHexString(read) + ")"
						}
					),
					(char)read
				);
			}
			if (read == NON_BASE_64_PADDING){
				numPadding++;
			}
		} while (read <= NON_BASE_64);
		return read;
	}
	public static byte[] decodeToBytes(InputStream in) throws IOException {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		decode(in, out, false);
		return out.toByteArray();
	}
	public static String decodeToString(InputStream in) throws IOException {
		return new String(decodeToBytes(in));
	}
	public static String decodeToString(InputStream in, String enc) throws IOException {
		return new String(decodeToBytes(in), enc);
	}
	public static void decode(InputStream in, OutputStream out) throws IOException {
		decode(in, out, true);
	}
	public static void decode(InputStream in, OutputStream out, boolean throwExceptions) throws IOException {
		int[] inBuffer = new int[4];
		boolean done = false;
		while (!done && (inBuffer[0] = readBase64(in, throwExceptions)) != END_OF_INPUT
			&& (inBuffer[1] = readBase64(in, throwExceptions)) != END_OF_INPUT){
			inBuffer[2] = readBase64(in, throwExceptions);
			inBuffer[3] = readBase64(in, throwExceptions);
			out.write(inBuffer[0] << 2 | inBuffer[1] >> 4);
			if (inBuffer[2] != END_OF_INPUT){
				out.write(inBuffer[1] << 4 | inBuffer[2] >> 2);
				if (inBuffer[3] != END_OF_INPUT){
					out.write(inBuffer[2] << 6 | inBuffer[3]);
				} else {
					done = true;
				}
			} else {
				done = true;
			}
		}
		out.flush();
	}
	public static boolean isBase64(byte[] bytes){
		try {
			return isBase64(new ByteArrayInputStream(bytes));
		} catch (IOException x){
			return false;
		}
	}
	public static boolean isBase64(String string){
		return isBase64(string.getBytes());
	}
	public static boolean isBase64(String string, String enc) throws UnsupportedEncodingException {
		return isBase64(string.getBytes(enc));
	}
	public static boolean isBase64(File fIn) throws IOException {
		return isBase64(new BufferedInputStream(new FileInputStream(fIn)));
	}
	public static boolean isBase64(InputStream in) throws IOException {
		long numBase64Chars = 0;
		int numPadding = 0;
		int read;
		while ((read = in.read()) != -1){
			read = reverseBase64Chars[read];
			if (read == NON_BASE_64){
				return false;
			} else if (read == NON_BASE_64_WHITESPACE){
			} else if (read == NON_BASE_64_PADDING){
				numPadding++;
				numBase64Chars++;
			} else if (numPadding > 0){
				return false;
			} else {
				numBase64Chars++;
			}
		}
		if (numBase64Chars == 0) return false;
		if (numBase64Chars % 4 != 0) return false;
		return true;
	}
}

