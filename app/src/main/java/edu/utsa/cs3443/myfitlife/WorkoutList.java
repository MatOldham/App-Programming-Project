package edu.utsa.cs3443.myfitlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import edu.utsa.cs3443.myfitlife.model.Burpees;
import edu.utsa.cs3443.myfitlife.model.Dips;
import edu.utsa.cs3443.myfitlife.model.Pullup;
import edu.utsa.cs3443.myfitlife.model.Pushup;
import edu.utsa.cs3443.myfitlife.model.Situp;
import edu.utsa.cs3443.myfitlife.model.Workout;

public class WorkoutList extends AppCompatActivity {
    public static ArrayList<Workout> workoutArray = new ArrayList<>();
    private static final int REQUEST_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_list);

        Button receiptButton = findViewById(R.id.button22);
        Button burpeesButton = findViewById(R.id.button);
        Button situpsButton = findViewById(R.id.button2);
        Button pushupsButton = findViewById(R.id.button3);
        Button pullupsButton = findViewById(R.id.button4);
        Button dipsButton = findViewById(R.id.button5);
        ReceiptController receiptController = new ReceiptController(this);
        WorkoutController workoutController = new WorkoutController(this);

        burpeesButton.setOnClickListener(workoutController);
        situpsButton.setOnClickListener(workoutController);
        pushupsButton.setOnClickListener(workoutController);
        pullupsButton.setOnClickListener(workoutController);
        dipsButton.setOnClickListener(workoutController);
        receiptButton.setOnClickListener(receiptController);
    }

    //Collects the information returned from the workout detail page. Adds to an array list

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                String workoutName = data.getStringExtra("resultName");
                Log.d("name", workoutName + "");
                int numReps = data.getIntExtra("resultReps", 0);
                switch (workoutName) {
                    case "Burpees":
                        //Adds burpees to a workoutlist arrayList, 200 calories per rep (will change)
                        workoutArray.add(new Burpees(200, numReps));


                        break;
                    case "Situps":
                        Situp newWorkout = new Situp(100, numReps);
                        workoutArray.add(newWorkout);

                        break;
                    case "Pushups":
                        Pushup pushups = new Pushup(100, numReps);
                        workoutArray.add(pushups);

                        break;
                    case "Pullups":
                        Pullup pullups = new Pullup(100, numReps);
                        workoutArray.add(pullups);

                        break;
                    case "Dips":
                        Dips dips = new Dips(100, numReps);
                        workoutArray.add(dips);

                        break;
                }
            }
        }
    }
}