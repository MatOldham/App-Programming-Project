package edu.utsa.cs3443.myfitlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class WorkoutDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_detail);

        Button confirmButton = findViewById(R.id.button4);
        DetailController detailController = new DetailController(this);

        confirmButton.setOnClickListener(detailController);

    }

    //called when the activity is shown to the user, changes text here
    protected void onStart() {
        super.onStart();
        //retrieves intents placed in workoutController
        String workName = getIntent().getStringExtra("workName");
        String workDesc = getIntent().getStringExtra("workDesc");

        //Finds the text boxes to change
        TextView title = (TextView)findViewById(R.id.textView3);
        TextView desc = (TextView)findViewById(R.id.textView4);
        TextView numOf = (TextView)findViewById(R.id.textView5);

        //Sets all of the text correctly
        title.setText(workName);
        desc.setText(workDesc);
        String numOfWorkout = "# of " + workName;
        numOf.setText(numOfWorkout);

    }


}