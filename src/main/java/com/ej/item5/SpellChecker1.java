package com.ej.item5;

import java.util.List;

// Inappropriate use of static utility - inflexible & untestable!
public class SpellChecker1 {

	private static final Lexicon dictionary = new OxfordDictionary();

	private SpellChecker1() {
	} // Noninstantiable

	public static boolean isValid(String word) {
		return false;
		// ...
	}

	public static List<String> suggestions(String typo) {
		return null;
		// ...
	}
}
