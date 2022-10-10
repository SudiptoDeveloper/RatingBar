package com.example.basicratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv);

        final RatingBar ratingBar = findViewById(R.id.rb1);
        if (ratingBar != null){
            Button bt = findViewById(R.id.btn);
        if (bt != null){
            bt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String msg = String.valueOf(ratingBar.getRating());
                    textView.setText(msg);
                    Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();
                }
            });
        }
        }

    }
}