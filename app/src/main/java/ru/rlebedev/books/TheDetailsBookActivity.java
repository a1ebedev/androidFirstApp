package ru.rlebedev.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TheDetailsBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_details_book);
    }

    public void closeDetails(View view) {
        Intent intent = new Intent(TheDetailsBookActivity.this, SearchActivity.class);
        startActivity(intent);
    }
}