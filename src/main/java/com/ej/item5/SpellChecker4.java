package com.ej.item5;

import java.util.function.Supplier;

// Dependency injection by passing resource factory to the constructor
public class SpellChecker4 {

	private Tile tile;

	public SpellChecker4(Supplier<? extends Tile> tileFactory) {
		tile = tileFactory.get();
	}

	public String getTileInfo() {
		return tile.toString();
	}

	public static void main(String[] args) {
		SpellChecker4 spellChecker = new SpellChecker4(() -> {
			return new Tile1("tile");
		});

		System.out.println(spellChecker.getTileInfo());
	}
}
