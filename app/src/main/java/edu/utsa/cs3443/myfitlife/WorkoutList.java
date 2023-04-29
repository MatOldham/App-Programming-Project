package edu.utsa.cs3443.myfitlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import edu.utsa.cs3443.myfitlife.model.Burpees;
import edu.utsa.cs3443.myfitlife.model.Situp;
import edu.utsa.cs3443.myfitlife.model.Workout;

public class WorkoutList extends AppCompatActivity {
    public static ArrayList<Workout> workoutList;
    private static final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_list);

        Button receiptButton = findViewById(R.id.button22);
        Button burpeesButton = findViewById(R.id.button);
        Button situpsButton = findViewById(R.id.button2);
        ReceiptController receiptController = new ReceiptController(this);
        WorkoutController workoutController = new WorkoutController(this);

        burpeesButton.setOnClickListener(workoutController);
        situpsButton.setOnClickListener(workoutController);
        receiptButton.setOnClickListener(receiptController);
    }

    //Collects the information returned from the workout detail page. Adds to an array list
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String workoutName = data.getStringExtra("workName");
                int numReps = data.getIntExtra("workReps", 0);

                switch(workoutName){
                    case "Burpees":
                        //Adds burpees to a workoutlist arrayList, 200 calories per rep (will change)
                        workoutList.add(new Burpees(200, numReps));
                        break;
                    case "Situps":
                        workoutList.add(new Situp(100, numReps));
                        Toast toast = Toast.makeText(this, "gaming", Toast.LENGTH_SHORT);
                        toast.show();
                        break;

                }
            }
        }
    }
}