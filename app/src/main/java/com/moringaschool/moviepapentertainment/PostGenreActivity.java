package com.moringaschool.moviepapentertainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PostGenreActivity extends AppCompatActivity {
    @BindView(R.id.buttonPostGenre) Button mButtonPostGenre;
    @BindView(R.id.genreText) EditText mGenreText;
    @BindView(R.id.genreText2) EditText mGenreText2;
    @BindView(R.id.genreText3) EditText mGenreText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_genre);
        ButterKnife.bind(this);
        mButtonPostGenre.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String genre1 = mGenreText.getText().toString();
        String genre2 = mGenreText2.getText().toString();
        String genre3 = mGenreText3.getText().toString();
        Intent intent = new Intent(PostGenreActivity.this, DispalyGenresActivity.class);
        intent.putExtra("genre1,", genre1);
        intent.putExtra("genre2,", genre2);
        intent.putExtra("genre3,", genre3);
        startActivity(intent);
}}
