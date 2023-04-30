package edu.utsa.cs3443.myfitlife.model;

import androidx.annotation.NonNull;

public class Dips extends Workout {
    private String workoutName;

    public Dips(int calPerRep, int numReps) {
        super(calPerRep, numReps);
        this.workoutName = "Dips";
    }

    public double dips_calPerRep(double dips_userIn) {
        return dips_userIn * 2;
    }

    @NonNull
    public static String getDesc() {
        return "Dips are a bodyweight exercise that develops the triceps and other upper-body muscles. The exercise begins when you hold on to parallel bars with your arms straight. You then bend your elbows until your upper arms are parallel to the ground before driving up to the starting position.";
    }
}