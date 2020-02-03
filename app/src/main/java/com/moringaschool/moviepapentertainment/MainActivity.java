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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        /** Called when the user taps the Send button */
        public void goToPostGenre(View view) {
            // Do something in response to button
            Intent intent = new Intent(this, PostGenreActivity.class);
            startActivity(intent);

        }
    }
