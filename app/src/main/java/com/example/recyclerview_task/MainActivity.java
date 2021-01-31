package com.example.recyclerview_task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.Recyclerview);


        final ArrayList<model> data = new ArrayList<>();
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 1 ",R.drawable.img1 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 2 ",R.drawable.img2 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 3 ",R.drawable.img3 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 4 ",R.drawable.img4 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 5 ",R.drawable.img5 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 6 ",R.drawable.img6 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 7 ",R.drawable.img7 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 8 ",R.drawable.img8 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 9 ",R.drawable.img9 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 10 ",R.drawable.img10 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 11 ",R.drawable.img11 ));
        data.add(new model(R.drawable.user , "Mohamed Mamdouh" , "Recycler View photo 12 ",R.drawable.img12 ));

        RecyclerAdapter adapter = new RecyclerAdapter(data , getApplicationContext());
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);



    }
}