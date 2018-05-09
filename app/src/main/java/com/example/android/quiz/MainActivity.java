package com.example.android.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView question;
/*
    EditText edt =findViewById(R.id.name);
    EditText txt =findViewById(R.id.lastname);
*/

  /*  String msg=edt.getText().toString();
    String lst=txt.getText().toString();
*/
    Random r;
    public Questions mQuestions = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();


        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);

        question = findViewById(R.id.question);
        // score =  findViewById(R.id.score);
        // score.setText(mScore);


        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    // score.setText(mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(MainActivity.this, "Your answer is correct", Toast.LENGTH_SHORT).show();
                } else {
                    //   gameOver();
                    Intent intent = new Intent(MainActivity.this, ExitsActivity.class);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(MainActivity)
                }

            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    // score.setText( mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(MainActivity.this, "Your answer is correct", Toast.LENGTH_SHORT).show();
                } else {
                    //gameOver();
                    Intent intent = new Intent(MainActivity.this, ExitsActivity.class);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    //   score.setText(mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(MainActivity.this, "Your answer is correct", Toast.LENGTH_SHORT).show();
                } else {
                    // gameOver();

                    Intent intent = new Intent(MainActivity.this, ExitsActivity.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    // score.setText(mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                    Toast.makeText(MainActivity.this, "Your answer is correct", Toast.LENGTH_SHORT).show();
                } else {
                    //  gameOver();
                    Intent intent = new Intent(MainActivity.this, ExitsActivity.class);
                    startActivity(intent);


                    Toast.makeText(MainActivity.this, "Your answer is wrong", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }


    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);


    }
    public void gameOver(){

        Intent intent  = new Intent(MainActivity.this,ExitsActivity.class);
        startActivity(intent);

    }
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(R.string.app_name);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to Exit ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}




