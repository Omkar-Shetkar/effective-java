package com.ej.item5;

import java.util.List;

//Inappropriate use of singleton - inflexible & untestable!
public class SpellChecker2 {

	private final Lexicon dictionary = new OxfordDictionary();

	private SpellChecker2() {
	}

	public static SpellChecker2 INSTANCE = new SpellChecker2();

	public boolean isValid(String word) {
		return false;
		// ...
	}

	public List<String> suggestions(String typo) {
		return null;
		// ...
	}
}
