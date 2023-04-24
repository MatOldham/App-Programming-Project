package edu.utsa.cs3443.myfitlife;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//hello world
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //colette


        //Main Button/Controller
        Button mainButton = findViewById(R.id.button3);
        MainController mainController = new MainController(this);

        mainButton.setOnClickListener(mainController);

    }
}