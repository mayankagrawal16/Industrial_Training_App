package com.mayank.industrial_training_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StudentUpload extends AppCompatActivity {

    TextView head;
    Button but1,but2,but3,but4,but5,but6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_upload);
        head=findViewById(R.id.textView3);
        but1=findViewById(R.id.button3);
        but2=findViewById(R.id.button4);
        but3=findViewById(R.id.button5);
        but4=findViewById(R.id.button6);
        but5=findViewById(R.id.button7);
        but6=findViewById(R.id.button8);
    }
}
