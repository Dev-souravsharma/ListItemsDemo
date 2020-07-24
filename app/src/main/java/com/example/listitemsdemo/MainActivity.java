package com.example.listitemsdemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.edtItem1);
        textView2 = findViewById(R.id.edtItem2);
        textView3 = findViewById(R.id.edtItem3);
        textView4 = findViewById(R.id.edtItem4);
        textView5 = findViewById(R.id.edtitem5);

    }

    public void onClick(View view) {
        if (view.getId() == R.id.edtItem1) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivityForResult(intent, 100);
        }
        if (view.getId() == R.id.edtItem2) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivityForResult(intent, 101);
        }
        if (view.getId() == R.id.edtItem3) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivityForResult(intent, 102);
        }
        if (view.getId() == R.id.edtItem4) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivityForResult(intent, 103);
        }
        if (view.getId() == R.id.edtitem5) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivityForResult(intent, 104);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100 && resultCode == RESULT_OK) {
            assert data != null;
            String fruitValue = data.getStringExtra("data");
            textView1.setText(fruitValue);
        }
        if (requestCode == 101 && resultCode == RESULT_OK) {
            assert data != null;
            String fruitValue = data.getStringExtra("data");
            textView2.setText(fruitValue);
        }
        if (requestCode == 102 && resultCode == RESULT_OK) {
            assert data != null;
            String fruitValue = data.getStringExtra("data");
            textView3.setText(fruitValue);
        }
        if (requestCode == 103 && resultCode == RESULT_OK) {
            assert data != null;
            String fruitValue = data.getStringExtra("data");
            textView4.setText(fruitValue);
        }
        if (requestCode == 104 && resultCode == RESULT_OK) {
            assert data != null;
            String fruitValue = data.getStringExtra("data");
            textView5.setText(fruitValue);
        }
    }
}