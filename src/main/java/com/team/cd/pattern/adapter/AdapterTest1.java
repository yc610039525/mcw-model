package com.team.cd.pattern.adapter;

public class AdapterTest1 {

	public static void main(String[] args) {
		Target target = new Adapter1();
		target.provide25();
	}

}
