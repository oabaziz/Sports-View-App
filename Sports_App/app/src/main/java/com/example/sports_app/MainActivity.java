package com.example.sports_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Card> arr = new ArrayList<>();
    int [] imgs ={R.drawable.football ,R.drawable.basketball ,R.drawable.volley ,R.drawable.ping ,R.drawable.tennis};
    String [] txts ={"Football" ,"Basketball","Volleyball","Ping Pong","Tennis"};
    RecyclerView recycle ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle =findViewById(R.id.recyclerView);
        for(int i=0; i<5 ;i++){
            Card card =new Card(imgs[i] ,txts[i]);
            arr.add(card);
        }
        MyAdapter adapter =new MyAdapter(arr);
        recycle.setAdapter(adapter);
        LinearLayoutManager linlay =new LinearLayoutManager(this);
        recycle.setLayoutManager(linlay);
    }
}