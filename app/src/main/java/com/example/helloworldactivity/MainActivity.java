package com.example.helloworldactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) this.findViewById(R.id.button1_1);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                setContentView(R.layout.activity_main3);
                        Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                        intent.putExtra("msg","main1传了信息到main3");
                        startActivityForResult(intent, 1);
            }
        });

        Button button2 = (Button) this.findViewById(R.id.button2_1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.activity_main3);
                Intent intent=new Intent("com.example.helloworldactivity.testAction2");
                finish();
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1 && resultCode == -1) {
            String msg = data.getStringExtra("return_msg");
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }


}
