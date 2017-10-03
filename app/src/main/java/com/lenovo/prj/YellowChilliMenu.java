package com.lenovo.prj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowChilliMenu extends AppCompatActivity implements AdapterView.OnItemClickListener{


    ListView listview;
    YellowChilliMenuAdapter adapter;
    ArrayList<YellowChilliMenuBean> personlist;

    int pos;


    void initViews() {

        listview = (ListView) findViewById(R.id.yellow);
        personlist = new ArrayList<>();
        personlist.add(new YellowChilliMenuBean("Starters"));
        //personlist.add(new YellowChilliMenuBean("Dal : Rajma : Chholay"));
        personlist.add(new YellowChilliMenuBean("Breads"));
        personlist.add(new YellowChilliMenuBean("Soups"));
        personlist.add(new YellowChilliMenuBean("Rice"));
        personlist.add(new YellowChilliMenuBean("Salads and Raita"));
        personlist.add(new YellowChilliMenuBean("Desserts"));

        adapter = new YellowChilliMenuAdapter(this,R.layout.yellowchilli,personlist);

        listview.setAdapter(adapter);
listview.setOnItemClickListener(this);
    }


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yellochillimenu);
            initViews();
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


       // YellowChilliMenuBean food=personlist .get(position);
        switch (position) {
            case 0:
                Intent z= new Intent(YellowChilliMenu.this, YellowChilliStarters.class);
                startActivity(z);
                break;
            case 5:
              Intent a2 = new Intent(YellowChilliMenu.this, YellowChilliDal.class);
               startActivity(a2);
                break;

            case 1:
                Intent a3 = new Intent(YellowChilliMenu.this, YellowChilliMeals.class);
                startActivity(a3);
                break;

            case 2:
                Intent a4 = new Intent(YellowChilliMenu.this, YellowChilliSoups.class);
                startActivity(a4);
                break;

            case 3:
                Intent a5 = new Intent(YellowChilliMenu.this, YellowChilliRice.class);
                startActivity(a5);
                break;

            case 4:
                Intent a6 = new Intent(YellowChilliMenu.this, YellowChilliSaladsAndRaita.class);
                startActivity(a6);
                break;



        }
        }
}
