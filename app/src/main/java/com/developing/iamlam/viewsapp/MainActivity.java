package com.developing.iamlam.viewsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView answerText=findViewById(R.id.answer);
        final EditText ageText=findViewById(R.id.age);
        Log.d(TAG,"La aplicación es creada");
        Button buttonAction=findViewById(R.id.button);
        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userAge=ageText.getText().toString();
                String getAnswer=getString(R.string.respuesta);
                try {
                    int dogAge = Integer.parseInt(userAge);
                    answerText.setText(getAnswer + dogAge * 6);
                    Log.i(TAG,"Un valor fue insertado");
                }
                catch(NumberFormatException e){
                  //  answerText.setText("Por favor incluye un numero entero");

                    Toast.makeText(MainActivity.this,getString(R.string.error),Toast.LENGTH_SHORT).show();
                    Log.e(TAG,"No se pudo insertar ningun valor");

                }
            }
        });
    }
}
