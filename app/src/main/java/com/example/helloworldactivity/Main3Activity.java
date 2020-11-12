package com.example.helloworldactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        String msg = getIntent().getStringExtra("msg");
        Toast.makeText(Main3Activity.this,msg,Toast.LENGTH_LONG).show();

        Button button3=(Button) this.findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.activity_main);
                Intent intent=new Intent();
                intent.putExtra("return_msg","这是返回的信息");
                setResult(-1, intent);
                finish();
            }
        });


    }


}
