package edu.utsa.cs3443.myfitlife;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MainController implements View.OnClickListener{
    MainActivity mainActivity;
    public MainController(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    @Override
    public void onClick(View view) {
        mainActivity.startActivity(new Intent(mainActivity, WorkoutList.class));
    }
}
