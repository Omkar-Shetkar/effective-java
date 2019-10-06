package com.ej.item6;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class IsRomanNumeral {

	@Test
	public void withNoOptimization() {
		IntStream.range(0, 100000).forEach(x -> {
			String number = "XXI";
			number.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
		});

	}

	@Test
	public void withOptimization() {
		final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
		IntStream.range(0, 100000).forEach(x -> {
			String number = "XXI";
			ROMAN.matcher(number).matches();
		});
	}
}