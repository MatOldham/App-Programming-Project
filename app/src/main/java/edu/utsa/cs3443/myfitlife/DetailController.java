package edu.utsa.cs3443.myfitlife;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


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

        Intent intent = new Intent(workoutDetail, WorkoutList.class);
        intent.putExtra("workName", name);
        intent.putExtra("workReps", numReps);
        workoutDetail.setResult(Activity.RESULT_OK, intent);
        workoutDetail.finish();
    }
}
