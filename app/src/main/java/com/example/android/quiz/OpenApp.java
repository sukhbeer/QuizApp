package com.example.android.quiz;

import android.content.Intent;
//import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OpenApp extends AppCompatActivity {

    Button mopenNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_app);



        mopenNext = findViewById(R.id.openNext);



        mopenNext.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {

                EditText edt = findViewById(R.id.name);


                String msg=edt.getText().toString();



               Intent intent = new Intent(OpenApp.this,MainActivity.class);
               intent.putExtra("name", msg);
               startActivity(intent);
               finish();
           }
        });
    }
}
