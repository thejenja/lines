package com.example.lines;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GameAdapter extends ArrayAdapter<String> {

    private static final String[] balls = { "0", "1", "0",
            "1", "0", "1", "0", "1", "0",
            "1", "0", "1", "0", "1", "0",
            "1", "0", "1", "0", "1", "0",
            "1", "0", "1", "0", "1" };

    Context mContext;

    // Конструктор
    public GameAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId, balls);
        // TODO Auto-generated constructor stub
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        TextView label = (TextView) convertView;

        if (convertView == null) {
            convertView = new TextView(mContext);
            label = (TextView) convertView;
        }
        label.setText(balls[position]);
        return (convertView);
    }

    // возвращает содержимое выделенного элемента списка
    public String getItem(int position) {
        return balls[position];
    }

}