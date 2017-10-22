package interpreter;
import java.util.*;
import java.io.*;
public class Client{
	public static void main(String[] args){
		try{
			BufferedReader reader = new BufferedReader(new FileReader("prog.txt"));
			String text;
			text = reader.readLine();
			System.out.println(text);
			Node node = new ProgramNode();
			node.parse(new Context(text));
			System.out.println("node = " + node);
			node.execute();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Usage java interpreter.Client!");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
