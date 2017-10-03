package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HaveliMenu extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listview;
    HaveliMenuAdapter adapter;
    ArrayList<HaveliMenuBean> personlist;

    int pos;
    void initViews() {

        listview = (ListView) findViewById(R.id.haveli);
        personlist = new ArrayList<>();
        personlist.add(new HaveliMenuBean("Popular Products"));
        //personlist.add(new YellowChilliMenuBean("Dal : Rajma : Chholay"));
        personlist.add(new HaveliMenuBean("Breads"));
        personlist.add(new HaveliMenuBean("Classic Pizza"));
        personlist.add(new HaveliMenuBean("Premium Pizza"));

        personlist.add(new HaveliMenuBean("Pizza Combos"));
        personlist.add(new HaveliMenuBean("Supreme Pizza"));

        adapter = new HaveliMenuAdapter(this, R.layout.haveli, personlist);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haveli_menu);

    initViews();

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        // YellowChilliMenuBean food=personlist .get(position);
        switch (position) {
            case 0:
                Intent z = new Intent(this, HaveliIndianCourse.class);
                startActivity(z);
                break;


            case 1:
                Intent a3 = new Intent(this, SamPizzaBreads.class);
                startActivity(a3);
                break;
//
         case 2:
             Intent a4 = new Intent(this, SamPizzaClassicPizza.class);
                startActivity(a4);
                break;
//
            case 3:
                Intent a5 = new Intent(this, SamPizzaPremiumPizza.class);
                startActivity(a5);
                break;
//
            case 4:
                Intent a6 = new Intent(this, SamPizzaPizzaCombos.class);
                startActivity(a6);
                break;
          case 5:
                Intent a2 = new Intent(this, SamPizzaSupremePizza.class);
                startActivity(a2);
                break;


        }
    }
}
