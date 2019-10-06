package com.ej.item3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonWithSerializable implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final SingletonWithSerializable INSTANCE = new SingletonWithSerializable();

	private SingletonWithSerializable() {
		if (INSTANCE != null)
			throw new RuntimeException("Singleton instance already exists!");
	}

	private Object readResolve() {
		return INSTANCE;
	}

	public void leaveTheBuilding() {
		System.out.println("SingletonWithPublicFinalField.leaveTheBuilding() called...");
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SingletonWithSerializable instance = SingletonWithSerializable.INSTANCE;

		System.out.println("Before serialization: " + instance);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1.ser"))) {
			out.writeObject(instance);
		}

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("file1.ser"))) {
			SingletonWithSerializable readObject = (SingletonWithSerializable) in.readObject();
			System.out.println("After deserialization: " + readObject);
		}

	}

}
