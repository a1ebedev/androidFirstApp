package ru.rlebedev.books;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {
    private LayoutInflater lif;
    private int resource;
    private List<Book> books;

    public BookAdapter(@NonNull Context context, int resource, List<Book> books) {
        super(context, resource, books);
        this.lif = LayoutInflater.from(context);
        this.resource = resource;
        this.books = books;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = lif.inflate(this.resource, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Book b = books.get(position);
        viewHolder.authorView.setText("" + b.getAuthor());
        viewHolder.titleView.setText("" + b.getTitle());

        return convertView;

    }

    private class ViewHolder {
        final TextView authorView, titleView;

        public ViewHolder(View view) {
            authorView = view.findViewById(R.id.tv_author_book);
            titleView = view.findViewById(R.id.tv_title_book);
        }

    }
}
