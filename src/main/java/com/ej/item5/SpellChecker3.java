package com.ej.item5;

import java.util.List;
import java.util.Objects;

// Dependency injection provides flexibility and testability

public class SpellChecker3 {

	private final Lexicon dictionary;

	public SpellChecker3(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}

	public boolean isValid(String word) {
		return false;
		// ...
	}

	public List<String> suggestions(String typo) {
		return null;
		// ...
	}
}
