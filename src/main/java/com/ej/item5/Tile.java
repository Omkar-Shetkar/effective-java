package com.ej.item5;

public class Tile {

	private final String name;

	public Tile(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Tile with name '%s' and type '%s' created.", this.name, this.getClass().getName());
	}
}

class Tile1 extends Tile {

	public Tile1(String name) {
		super(name);
	}

}