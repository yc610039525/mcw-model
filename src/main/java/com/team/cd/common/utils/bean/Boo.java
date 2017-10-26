package com.team.cd.common.utils.bean;

public class Boo extends Aoo implements ICoo{
	public String boo;
	public String address;
	public Boo(){
		super("", "");
		System.out.println("Boo()");
	}
	public Boo(String boo, String address) {
		super(boo, address);
		this.boo = boo;
		this.address = address;
		System.out.println("Boo(String boo, String address)");
	}
	public String getBoo() {
		return boo;
	}
	public void setBoo(String boo) {
		this.boo = boo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public void coo() {
		
	}
	public void sayBoo(String K){
		System.out.println("Boo:"+K+","+this.address);
	}
}
