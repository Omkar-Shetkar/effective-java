package com.ej.item2;

interface BuilderType<T> {
	public T build();
}

public class NutritionFacts4 {

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder implements BuilderType<NutritionFacts4> {
		// Required parameters
		private final int servingSize;
		private final int servings;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int sodium = 0;
		private int carbohydrate = 0;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public NutritionFacts4 build() {
			NutritionFacts4 nutritionFacts4 = new NutritionFacts4(this);
			if (nutritionFacts4.servingSize < 0)
				throw new IllegalStateException("Serving size should be grater than zero!");
			return nutritionFacts4;
		}

	}

	private NutritionFacts4(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

}

class NutritionFactsFactory {
	NutritionFacts4 buildNutritionFacts(BuilderType<? extends NutritionFacts4> builder) {
		return builder.build();
	}
}