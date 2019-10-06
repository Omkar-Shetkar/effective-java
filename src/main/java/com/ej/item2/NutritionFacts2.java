package com.ej.item2;

/**
 * JavaBeans Pattern - allows incosistency, mandates mutability
 *
 */
public class NutritionFacts2 {

	// Parameters initialized to default values (if any)
	private int servingSize = -1; // Required; no default value
	private int servings = -1; // Required; no default value
	private int calories = 0;
	private int fat = 0;
	private int sodium = 0;
	private int carbohydrate = 0;

	public NutritionFacts2() {
	}

	public void setServingSize(int servingSize) {
		this.servingSize = servingSize;
	}

	public void setServings(int servings) {
		this.servings = servings;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public void setSodium(int sodium) {
		this.sodium = sodium;
	}

	public void setCarbohydrate(int carbohydrate) {
		this.carbohydrate = carbohydrate;
	}
	
	public static void main(String[] args) {
		NutritionFacts2 nutritionFacts = new NutritionFacts2();
		
		nutritionFacts.setServingSize(10);
		nutritionFacts.setServings(12);
		nutritionFacts.setCalories(2);
		nutritionFacts.setFat(2);
	}

}
