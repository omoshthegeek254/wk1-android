package com.moringaschool.moviepapentertainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayGenreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_genre);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String genre1 = intent.getStringExtra("genre1");
        String genre2 = intent.getStringExtra("genre2");
        String genre3 = intent.getStringExtra("genre3");


        // Capture the layout's TextView and set the string as its text

        TextView genre1View = findViewById(R.id.genre1View);
        genre1View.setText(genre1);

        TextView genre2View = findViewById(R.id.genre2View);
        genre2View.setText(genre2);

        TextView genre3View = findViewById(R.id.genre3View);
        genre3View.setText(genre3);
    }
}
