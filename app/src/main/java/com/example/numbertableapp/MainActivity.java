package com.example.numbertableapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public void generateTables(int i,ArrayList numbers, ListView listView){
        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, numbers);
        Log.i("numbers", String.valueOf(i + 1));

            numbers.clear();
            for (int start = 1; start <= 10; start++) {
                numbers.add(start * i);

            }
            listView.setAdapter(arrayAdapter);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ListView listView = findViewById(R.id.listView);


        SeekBar seekBar = findViewById(R.id.seekBar);

        seekBar.setMax(100);



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                generateTables(i,numbers,listView);
//                 else if (i == 2) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                } else if (i == 3) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                } else if (i == 4) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                } else if (i == 5) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                } else if (i == 6) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                } else if (i == 7) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                } else if (i == 8) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                } else if (i == 9) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                }
//                else if (i == 10) {
//                    numbers.clear();
//                    for (int start = 1; start <= 10; start++) {
//
//                        numbers.add(start * i);
//
//                    }
//                    listView.setAdapter(arrayAdapter);
//                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}