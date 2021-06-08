package com.emersonnj.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String f1[],f2[];
    int[] img = {R.drawable.angular2,R.drawable.vue,R.drawable.adonis,R.drawable.bootstrap,R.drawable.materalize,
            R.drawable.laravel,R.drawable.codeigniter,R.drawable.spring2,R.drawable.rubyrails,R.drawable.symfony};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        f1 = getResources().getStringArray(R.array.frame_work);
        f2 = getResources().getStringArray((R.array.description));

        MyAdapter MyAdapter = new MyAdapter(this,f1,f2,img);
        recyclerView.setAdapter(MyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));

    }
}