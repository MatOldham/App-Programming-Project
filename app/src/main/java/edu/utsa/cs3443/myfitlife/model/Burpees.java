package edu.utsa.cs3443.myfitlife.model;

import androidx.annotation.NonNull;

public class Burpees extends Workout{
    public Burpees(int calPerRep, String workoutName) {
        super(calPerRep, workoutName);
    }
    public double burpees_calPerRep(double burpees_userIn){
        return burpees_userIn / (200 * 60);
    }

    @NonNull
    public String toString() {
        return " A burpee is essentially a two-part exercise: " +
                "a pushup followed by a leap in the air. " +
                "Doing several burpees in a row can be tiring, " +
                "but this versatile exercise may be worth the payoff, " +
                "especially if you're looking for a way to build strength and endurance, " +
                "while burning calories, and boosting your cardio fitness.";
    }
}
