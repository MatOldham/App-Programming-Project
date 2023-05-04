package edu.utsa.cs3443.myfitlife;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Iterator;

import edu.utsa.cs3443.myfitlife.model.Workout;

public class ReceiptController implements View.OnClickListener{
    WorkoutList workoutList;
    public ReceiptController(WorkoutList workoutList) {
        this.workoutList = workoutList;
    }
    @Override
    public void onClick(View view) {        //current activity, started activity

        Intent intent = new Intent(workoutList, Receipt.class);

        HashMap<String, Integer> calMap = new HashMap<String, Integer>();
        calMap.put("Burpees", 0);
        calMap.put("Situps", 0);
        calMap.put("Pushups", 0);
        calMap.put("Pullups", 0);
        calMap.put("Dips", 0);

        int calToAdd;

        for(Iterator<Workout> iter = WorkoutList.workoutArray.iterator(); iter.hasNext();){
            Workout work = iter.next();
            switch(work.getWorkoutName()) {
                case "Burpees":
                    calToAdd = work.getCalorieCalc() * work.getNumReps();
                    calMap.put("Burpees", calMap.get("Burpees") + calToAdd);
                    break;
                case "Situps":
                    calToAdd = work.getCalorieCalc() * work.getNumReps();
                    calMap.put("Situps", calMap.get("Situps") + calToAdd);

                    break;
                case "Pushups":
                    calToAdd = work.getCalorieCalc() * work.getNumReps();
                    calMap.put("Pushups", calMap.get("Pushups") + calToAdd);
                    break;
                case "Pullups":
                    calToAdd = work.getCalorieCalc() * work.getNumReps();
                    calMap.put("Pullups", calMap.get("Pullups") + calToAdd);
                    break;
                case "Dips":
                    calToAdd = work.getCalorieCalc() * work.getNumReps();
                    calMap.put("Dips", calMap.get("Dips") + calToAdd);
                    break;
                default:
                        Log.d("calcError","Couldnt add calories to calMap");

                }

            }
        intent.putExtra("calMap", calMap);
        workoutList.startActivity(intent);
        }



}