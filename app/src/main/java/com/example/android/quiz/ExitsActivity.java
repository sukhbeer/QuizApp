package com.example.android.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ExitsActivity extends AppCompatActivity {

    Button mnewGame, mExits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exits);

        mnewGame = (Button) findViewById(R.id.newGame);

        TextView textView = (TextView) findViewById(R.id.textview);
        Bundle bb;
        bb = getIntent().getExtras();
        textView.setText(bb.getString("name"));

        TextView textView2 = (TextView) findViewById(R.id.textview2);
        Bundle bb2;
        bb2 = getIntent().getExtras();
        textView2.setText(bb.getString("surname"));


        mnewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExitsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
