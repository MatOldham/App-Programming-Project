package edu.utsa.cs3443.myfitlife.model;

import androidx.annotation.NonNull;

public class Situp extends Workout {
    public Situp(int calPerRep, String workoutName) {
        super(calPerRep, workoutName);
    }
    public double situp_calPerRep(double situp_userIn){
        return situp_userIn * .5;
    }

    @NonNull
    public static String getDesc() {
        return " Situps are classic abdominal exercises done by " +
                "lying on your back and lifting your torso. " +
                "They use your body weight to strengthen and tone the core-stabilizing abdominal muscles. " +
                "Situps work the rectus abdominis, transverse abdominis, " +
                "and obliques in addition to your hip flexors, chest, and neck.";
    }
}
