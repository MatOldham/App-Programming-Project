package edu.utsa.cs3443.myfitlife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class WorkoutList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_list);

        Button receiptButton = findViewById(R.id.button22);
        ReceiptController receiptController = new ReceiptController(this);

        receiptButton.setOnClickListener(receiptController);
    }
}