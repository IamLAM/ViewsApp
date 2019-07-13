package com.developing.iamlam.viewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answerText=findViewById(R.id.answer);
        final EditText ageText=findViewById(R.id.age);

        Button buttonAction=findViewById(R.id.button);
        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userAge=ageText.getText().toString();
                int dogAge=Integer.parseInt(userAge);
                answerText.setText("Mi edad es "+dogAge*6);

            }
        });
    }
}
