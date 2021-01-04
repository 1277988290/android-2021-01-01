package com.example.petsoftware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Xilie3 extends AppCompatActivity {
    private Button btn_xl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xilie3);
        btn_xl = findViewById(R.id.btn_xl);
        btn_xl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //创建Intent 对象
                Intent intent = new Intent(Xilie3.this, Classification.class);
                //启动Activity
                startActivity(intent);
            }
        });
    }
}