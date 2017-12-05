package com.utsppb.ppbuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity2 extends AppCompatActivity{
    Button btnlistpesan;
    Button btnpesanmakanan;
    Button btnabout;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnlistpesan = (Button) findViewById(R.id.btnlistpesan);
        btnlistpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(i);
            }
        });
        btnabout = (Button) findViewById(R.id.btnabout);
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                i = new Intent(MainActivity2.this, MainActivity4.class);
                MainActivity2.this.startActivity(i);
            }
        });
    }
    public void keluar (View view) {
        finish();
    }
}

