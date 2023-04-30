package edu.utsa.cs3443.myfitlife.model;

import androidx.annotation.NonNull;

public class Pullup extends Workout {
    private String workoutName;

    public Pullup(int calPerRep, int numReps) {
        super(calPerRep, numReps);
        this.workoutName = "Pullups";
    }

    public double pullup_calPerRep(double pullup_userIn) {
        return pullup_userIn * 1;
    }

    @NonNull
    public static String getDesc() {
        return "A pull-up is an upper-body exercise that involves hanging from a pull-up bar by your hands with your palms facing away from you, and lifting your entire body up with your arm and back muscles until your chest touches the bar.";
    }
}
