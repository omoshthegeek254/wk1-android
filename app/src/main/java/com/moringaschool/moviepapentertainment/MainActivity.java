package com.moringaschool.moviepapentertainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.postGenresButton)
    Button mPostGenresButton;
    @BindView(R.id.introTextView)
    TextView mIntroTextView;
    @BindView(R.id.introTitleTextView)
    TextView mIntroTitleTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mPostGenresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PostGenreActivity.class);
                startActivity(intent);

            }
        });
    }
}
