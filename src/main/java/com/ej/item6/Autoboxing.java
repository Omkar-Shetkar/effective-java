package com.ej.item6;

import org.junit.jupiter.api.Test;

public class Autoboxing {
	@Test
	public void testAutoboxing() {
		Long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++) {
			sum += i;
		}
	}

	@Test
	public void testNoAutoboxing() {
		long sum = 0;
		for (long i = 0; i <= Integer.MAX_VALUE; i++) {
			sum += i;
		}
	}
}
