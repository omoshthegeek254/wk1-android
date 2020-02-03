package com.moringaschool.moviepapentertainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PostGenreActivity extends AppCompatActivity {
//    public static final String EXTRA_MESSAGE = "placeholder messsage";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_genre);
    }

    /** Called when the user taps the Send button */
    public void postGenre(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayGenreActivity.class);
        EditText genre1Text = (EditText) findViewById(R.id.genre1Text);
        EditText genre2Text = (EditText) findViewById(R.id.genre2Text);
        EditText genre3Text = (EditText) findViewById(R.id.genre3Text);
        String genre1 = genre1Text.getText().toString();
        String genre2 = genre2Text.getText().toString();
        String genre3 = genre3Text.getText().toString();
        intent.putExtra("genre1" ,genre1);
        intent.putExtra("genre2", genre2);
        intent.putExtra("genre3", genre3);
        startActivity(intent);
    }
}

