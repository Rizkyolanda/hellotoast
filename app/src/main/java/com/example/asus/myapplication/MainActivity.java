package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast = findViewById(R.id.button_toast);
        btnCount = findViewById(R.id.button_count);
        tcCount = findViewById(R.id.show_count)

        public void onClick(View view){
            Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT).show();

            mCount = 0;
            tvCount.setText(Integer.toString(mCount));

        }
    });
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCount++;
                tvCount.setText(Integer.toString(mCount));

            }
    });
    }
}
