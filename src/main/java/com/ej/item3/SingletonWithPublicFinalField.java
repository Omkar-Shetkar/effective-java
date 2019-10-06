package com.ej.item3;

import java.lang.reflect.Constructor;

public class SingletonWithPublicFinalField {

	public static final SingletonWithPublicFinalField INSTANCE = new SingletonWithPublicFinalField();

	private SingletonWithPublicFinalField() {
		if (INSTANCE != null)
			throw new RuntimeException("Singleton instance already exists!");
	}

	public void leaveTheBuilding() {
		System.out.println("SingletonWithPublicFinalField.leaveTheBuilding() called...");
	}

	public static void main(String[] args) throws InstantiationException, Exception, ClassNotFoundException {
		SingletonWithPublicFinalField instance1 = SingletonWithPublicFinalField.INSTANCE;
		System.out.println(instance1);

		Constructor.setAccessible(SingletonWithPublicFinalField.class.getConstructors(), true);
		Object instance2 = Class.forName(SingletonWithPublicFinalField.class.getName()).newInstance();
		System.out.println(instance2);
	}

}
