package edu.utsa.cs3443.myfitlife;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import edu.utsa.cs3443.myfitlife.model.Workout;

public class ReceiptController implements View.OnClickListener{
    WorkoutList workoutList;
    public ReceiptController(WorkoutList workoutList) {
        this.workoutList = workoutList;
    }
    @Override
    public void onClick(View view) {        //current activity, started activity
        Intent intent = new Intent(workoutList, Receipt.class);

    }
}