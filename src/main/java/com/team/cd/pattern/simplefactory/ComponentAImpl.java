package com.team.cd.pattern.simplefactory;

public class ComponentAImpl implements IComponent {

	@Override
	public String getName() {
		return "康佳";
	}

	@Override
	public int getPrice() {
		return 800;
	}

}
