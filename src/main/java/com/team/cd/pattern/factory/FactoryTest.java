package com.team.cd.pattern.factory;

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IFruitFactory factory = new AppleFactory();
		factory.getFruit();
	}

}
