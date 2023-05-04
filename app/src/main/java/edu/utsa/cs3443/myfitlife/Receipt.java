package edu.utsa.cs3443.myfitlife;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;

import edu.utsa.cs3443.myfitlife.model.Workout;

public class Receipt extends AppCompatActivity {
    WorkoutList workoutList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        Button back = findViewById(R.id.button8);
        Button exit = findViewById(R.id.button10);




        String workName = getIntent().getStringExtra("workName");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

    }

    protected void onStart() {
        super.onStart();


        TextView burpeesText = findViewById(R.id.textView17);
        TextView dipsText = findViewById(R.id.textView10);
        TextView pullupText = findViewById(R.id.textView7);
        TextView pushupText = findViewById(R.id.textView8);
        TextView situpText = findViewById(R.id.textView9);
        HashMap<String, Integer> calMap = (HashMap<String, Integer>) getIntent().getSerializableExtra("calMap");

        burpeesText.setText(calMap.get("Burpees") + "");
        dipsText.setText(calMap.get("Dips") + "");
        pullupText.setText(calMap.get("Pullups") + "");
        pushupText.setText(calMap.get("Pushups") + "");
        situpText.setText(calMap.get("Situps") + "");


    }
}