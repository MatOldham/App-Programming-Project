package edu.utsa.cs3443.myfitlife.model;

import androidx.annotation.NonNull;

public class Pushup extends Workout {
    private String workoutName;

    public Pushup(int calPerRep, int numReps) {
        super(calPerRep, numReps);
        this.workoutName = "Pushups";
    }

    public double pushup_calPerRep(double pushup_userIn) {
        return pushup_userIn * .32;
    }

    @NonNull
    public static String getDesc() {
        return "Push-ups are an exercise in which a person, keeping a prone position, with the hands palms down under the shoulders, the balls of the feet on the ground, and the back straight, pushes the body up and lets it down by an alternate straightening and bending of the arms.";
    }
}
