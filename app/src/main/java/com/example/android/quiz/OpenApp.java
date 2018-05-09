package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OpenApp extends AppCompatActivity {

    Button mopenNext;
/*

    EditText edt =findViewById(R.id.name);
    EditText txt =findViewById(R.id.lastname);
*/

    /*String msg=edt.getText().toString();
    String lst=txt.getText().toString();
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_app);



        mopenNext = (Button)findViewById(R.id.openNext);



        mopenNext.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {

                EditText edt =findViewById(R.id.name);
                EditText surname = (EditText)findViewById(R.id.lastname);

               Intent intent = new Intent(OpenApp.this,MainActivity.class);
               intent.putExtra("name",edt.getText().toString());
               intent.putExtra("surname",surname.getText().toString());
               startActivity(intent);
           }
        });
    }
}
