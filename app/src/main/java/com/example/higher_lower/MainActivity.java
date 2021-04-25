package com.example.higher_lower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    public void guessFunction(View view){
        EditText editGuess =(EditText) findViewById(R.id.editGuess);

        int user_guess=Integer.parseInt(editGuess.getText().toString());
        if(randomNumber<user_guess) {
            makeToast("Lower!");
        }
        else if(randomNumber>user_guess){
            makeToast("Higher!");
        }
        else{
            makeToast("That's Right! Try Again!");
            Random r= new Random();
            randomNumber=r.nextInt(20)+1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}