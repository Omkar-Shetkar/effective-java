package com.ej.item3;

public enum SingletonWithEnum {

	INSTANCE;

	public void leaveTheBuilding() {
		System.out.println("SingletonWithEnum.leaveTheBuilding() called...");
	}

	public static void main(String[] args) {
		SingletonWithEnum.INSTANCE.leaveTheBuilding();
	}
}
