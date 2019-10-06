package com.ej.item3;

public class SingletonWithPublicStaticFactoryMethod {

	private static final SingletonWithPublicStaticFactoryMethod INSTANCE = new SingletonWithPublicStaticFactoryMethod();

	private SingletonWithPublicStaticFactoryMethod() {
	}

	public static SingletonWithPublicStaticFactoryMethod getInstance() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {
		System.out.println("SingletonWithPublicStaticFactoryMethod.leaveTheBuilding()");
	}

	public static void main(String[] args) {
		SingletonWithPublicStaticFactoryMethod instance = SingletonWithPublicStaticFactoryMethod.getInstance();
		instance.leaveTheBuilding();
	}
}
