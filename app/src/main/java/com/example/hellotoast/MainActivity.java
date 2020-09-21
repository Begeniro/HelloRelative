package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView showCount;
    int mCount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showCount=findViewById(R.id.numberCount);
    }
    public void showToast(View view){
        Toast.makeText(this,"Holla Toast!",Toast.LENGTH_LONG).show();
    }
    public void showCount(View view){
        mCount++;
        if(showCount!=null){
            showCount.setText(mCount+"");
        }
    }
}