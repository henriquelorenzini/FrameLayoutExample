package com.example.framelayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick(View view){
        Button buttonLoading = findViewById(R.id.buttonLoading);
        buttonLoading.setVisibility(View.INVISIBLE);
        buttonLoading.setTextColor((0x55FFFF));
    }
}
