package edu.utsa.cs3443.myfitlife.model;

import androidx.annotation.NonNull;

public class Situp extends Workout {
    private String workoutName;
    public Situp(int calPerRep, int numReps) {
        super(calPerRep, numReps);
        this.workoutName = "Situps";
    }
    public double situp_calPerRep(double situp_userIn){
        return situp_userIn * .5;
    }

    @NonNull
    public static String getDesc() {
        return " Situps are classic abdominal exercises done by " +
                "lying on your back and lifting your torso. " +
                "They use your body weight to strengthen and tone the core-stabilizing abdominal muscles.";
    }
}
