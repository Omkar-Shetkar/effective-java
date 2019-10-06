package com.ej.item6;
import java.util.stream.IntStream;

public class StringCheck {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(System.identityHashCode(s));

		IntStream.range(0, 5).forEach(x -> {
			String s1 = "hello";
			String obj = new String(s1);
			System.out.format("s1: %d obj: %d\n", System.identityHashCode(s1), System.identityHashCode(obj));
		});
	}
}