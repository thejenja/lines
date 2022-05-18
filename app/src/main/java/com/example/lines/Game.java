package com.example.lines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Game extends AppCompatActivity {

    private GridView gridView;
    private GameAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        final GridView g = (GridView) findViewById(R.id.gridView);
        mAdapter = new GameAdapter(getApplicationContext(), android.R.layout.simple_list_item_1);
        g.setAdapter(mAdapter);

        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                String beforeBall = mAdapter.getItem(position);

                    String changedBall = beforeBall.toString().concat("1");

                    mAdapter.remove(beforeBall);
                    mAdapter.insert(new ClipData.Item(changedBall), position);

            }
        });
    }
    /*@Override
    public void onItemSelected(AdapterView<?> parent, View v, int position,
                               long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }*/
}

