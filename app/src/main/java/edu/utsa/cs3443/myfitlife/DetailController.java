package edu.utsa.cs3443.myfitlife;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class DetailController implements View.OnClickListener{
    WorkoutDetail workoutDetail;
    public DetailController(WorkoutDetail workoutDetail) {
        this.workoutDetail = workoutDetail;
    }

    @Override
    public void onClick(View view) {
        EditText text = (EditText) workoutDetail.findViewById(R.id.editTextText);
        TextView workName = (TextView) workoutDetail.findViewById(R.id.textView3);
        String editText = text.getText().toString();
        String name = workName.getText().toString();

        int numReps = Integer.parseInt(editText);
        Intent intent = new Intent();
        intent.putExtra("resultName", name);
        intent.putExtra("resultReps", numReps);
        workoutDetail.setResult(Activity.RESULT_OK, intent);
        workoutDetail.finish();
    }
}
