package com.team.cd.pattern.simplefactory;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		IComponent component = ComponentFactory.createComponent(1);
		System.out.println(component.getName());
	}

}
