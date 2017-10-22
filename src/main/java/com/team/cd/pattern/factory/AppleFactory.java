package com.team.cd.pattern.factory;

public class AppleFactory implements IFruitFactory {

	@Override
	public Fruit getFruit() {
		System.out.println("create Apple");
		return new Apple();
	}

}
