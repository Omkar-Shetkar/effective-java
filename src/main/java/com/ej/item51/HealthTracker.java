package com.ej.item51;

public class HealthTracker {


    public static Activity activity() {
        return new HealthTracker.Activity();
    }

    public int caloriesBurnt(int steps) {
        int calories = caloriesBurnt(steps, 0, 0);
        return calories;
    }

    public int caloriesBurnt(int steps, int runDistanceInKm) {
        int calories = caloriesBurnt(steps, runDistanceInKm, 0);
        return calories;
    }

    public int caloriesBurnt(int steps, int runDistanceInKm, int cyclingDistanceInKm) {
        int calories = steps * 1 + runDistanceInKm * 500 + cyclingDistanceInKm * 250;
        return calories;
    }

    public int caloriesBurnt(Activity activity) {
        int calories = activity.steps * 1 + activity.runDistanceInKm * 500 + activity.cyclingDistanceInKm * 250;
        return calories;
    }

    public static class Activity {

        private int steps;
        private int runDistanceInKm;
        private int cyclingDistanceInKm;

        public Activity steps(int steps) {
            this.steps = steps;
            return this;
        }

        public Activity run(int distanceInKm) {
            this.runDistanceInKm = distanceInKm;
            return this;
        }

        public Activity cycling(int distanceInKm) {
            this.cyclingDistanceInKm = distanceInKm;
            return this;
        }

        public int execute() {
            HealthTracker healthTracker = new HealthTracker();
            return healthTracker.caloriesBurnt(this);
        }
    }


    public static void main(String[] args) {
        int calories = HealthTracker.activity()
                .steps(5000)
                .run(2)
                .cycling(10)
                .execute();
        System.out.println("Total calories burnt: " + calories);
    }
}
