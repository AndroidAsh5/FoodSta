package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowChilliDal extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener {

    ListView listView;
    ArrayList<YelloChilliStartersBean> yelloChilliStartersBeans;
    YelloChilliStartersAdapter yelloChilliStartersAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tandoori);

        listView=(ListView)findViewById(R.id.tandoori);
        yelloChilliStartersBeans =new ArrayList<>();
      yelloChilliStartersBeans.add(new YelloChilliStartersBean("Fruit Cream","Combination of ich fuits dipped in milky rich cream", "Rs",  150));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Gulab E Gulkand","New Avatar of the traditional gulab jamun,soft,condensedmilk balls stuffed with candied rose petals", "Rs",                 115));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kesari Kulfi With Rabdi","Saffron flavoured indian ice cream with creamy,silky rabdi", "Rs",            135));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Maha Razma Masala","Rs",265));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Martban Ke Chholay","Rs", 295 ));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        yelloChilliStartersAdapter =new YelloChilliStartersAdapter(this,R.layout.happiness1, yelloChilliStartersBeans);
        listView.setAdapter(yelloChilliStartersAdapter);
        listView.setOnItemClickListener(this);

        button =(Button)findViewById(R.id.buttonshow);
        button.setOnClickListener( this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow){

            Intent ne =new Intent(this,showCart.class);
            startActivity(ne);
        }



    }
    }

