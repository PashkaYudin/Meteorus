package com.example.broso.meteor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String MainCity = "Барнаул";
    TextView CityHeader;
    String temp = "+23°";
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);
        MyAdapter adapter = new MyAdapter(getHeader(), getListItems());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void CityChange(View view) {
        //Toast.makeText(this, "Ты нажал, все норм", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, CityList.class);
        startActivity(intent);
    }

    public  Header getHeader()
    {
        Bundle extras = getIntent().getExtras();
        String MainCity;
        if (extras != null) {
            MainCity = extras.getString("city_name");
        }
        else {
            MainCity = "Барнаул";
        }

        Random r = new Random();
        int t = r.nextInt(29 - 10) + 10;
        temp = "+"+String.valueOf(t)+"°";
        Header header = new Header();
        header.setHeader(MainCity);
        header.setTemp(temp);

        return header;
    }

    public List<ListItem> getListItems()
    {
        List<ListItem> listItems = new ArrayList<ListItem>();

        ListItem item = new ListItem("Сб, 4.06", "+19", "+8", R.drawable.rain);
        listItems.add(item);
        item = new ListItem("Вс, 5.06", "+27", "+11", R.drawable.sun);
        listItems.add(item);
        item = new ListItem("Пн, 6.06", "+22", "+13",  R.drawable.sun_cloud);
        listItems.add(item);
        item = new ListItem("Вт, 7.06", "+18", "+8", R.drawable.rain);
        listItems.add(item);
        item = new ListItem("Ср, 8.06", "+23", "+9",  R.drawable.wind);
        listItems.add(item);
        item = new ListItem("Чт, 9.06", "+19", "+8",  R.drawable.sun_cloud);
        listItems.add(item);
        item = new ListItem("Пт, 10.06", "+25", "+12",  R.drawable.sun);
        listItems.add(item);

        return listItems;
    }
}
