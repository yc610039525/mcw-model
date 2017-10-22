package com.team.cd.pattern.simplefactory;

public class ComponentBImpl implements IComponent {

	@Override
	public String getName() {
		return "创维";
	}

	@Override
	public int getPrice() {
		return 900;
	}

}
