package ru.rlebedev.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    private ListView searchBooks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Лебедев А. А.", "Java для Начинающих"));
        books.add(new Book("Карл Маркс", "Капитал"));
        books.add(new Book("Фридрих Ницше", "Заратустра"));
        books.add(new Book("Островский", "Как закалялась сталь"));
        books.add(new Book("Лебедев А. А.", "Java для Начинающих"));
        books.add(new Book("Карл Маркс", "Капитал"));
        books.add(new Book("Фридрих Ницше", "Заратустра"));
        books.add(new Book("Островский", "Как закалялась сталь"));

        searchBooks = findViewById(R.id.lv_search_list);
        BookAdapter adapter = new BookAdapter(this, R.layout.fragment_list_item, books);
        searchBooks.setAdapter(adapter);

        searchBooks.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SearchActivity.this, TheDetailsBookActivity.class);
                startActivity(intent);

            }
        });



    }
}