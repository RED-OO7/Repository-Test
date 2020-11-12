package com.example.helloworldactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button2=(Button) this.findViewById(R.id.button2_1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.activity_main);
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}
