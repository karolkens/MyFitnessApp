package com.example.myfitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchComposeView(){
        Intent i = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(i);
    }


    public void onClick(View view){

        TextView textPerson = (TextView)findViewById(R.id.editTextTextPersonName);
        TextView textPassword = (TextView)findViewById(R.id.editTextTextPassword);


        if((textPerson.getText().toString().equals("karol")) && (textPassword.getText().toString().equals("01234"))){
            view.getId();
            launchComposeView();
        }

    }


}