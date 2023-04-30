package edu.utsa.cs3443.myfitlife;

import android.content.Intent;
import android.view.View;

import edu.utsa.cs3443.myfitlife.model.Burpees;
import edu.utsa.cs3443.myfitlife.model.Situp;
import edu.utsa.cs3443.myfitlife.model.Workout;

public class WorkoutController implements View.OnClickListener {

    WorkoutList workoutList;
    public WorkoutController(WorkoutList workoutList) {
        this.workoutList = workoutList;
    }

    @Override
    public void onClick(View view) {
        //Intent to switch activities, will be used to add extras/input to change text
        Intent intent = new Intent(workoutList, WorkoutDetail.class);
        String alias = null;

        //Depending on which button is pressed, pass different information to detail screen
        switch(view.getId()) {
            case R.id.button:
                alias = "Burpees";
                //put a description and a name into the intent
                intent.putExtra("workDesc", Burpees.getDesc());
                intent.putExtra("workName", alias);

                //Will return information to onActivityResult in main activity class
                workoutList.startActivityForResult(intent, 0);
                break;
            case R.id.button2:
                alias = "Situps";
                //put a description and a name into the intent
                intent.putExtra("workDesc", Situp.getDesc());
                intent.putExtra("workName", alias);

                //Will return information to onActivityResult in main activity class
                workoutList.startActivityForResult(intent,0);
                break;
                //Other workout
            //case R.id.button3:
           //     alias = "";
            //    break;
        }
    }


}
