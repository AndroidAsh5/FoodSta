package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EatWellMenu extends AppCompatActivity implements AdapterView.OnItemClickListener  {


    ListView listview;
    EatWellMenuAdapter adapter;
    ArrayList<EatWellMenuBean> personlist;

    int pos;
    void initViews() {


        listview = (ListView) findViewById(R.id.singh);
        personlist = new ArrayList<>();
        personlist.add(new EatWellMenuBean("All Time Favourite"));
        //personlist.add(new YellowChilliMenuBean("Dal : Rajma : Chholay"));
        personlist.add(new EatWellMenuBean("Dashing Dosaz"));
        personlist.add(new EatWellMenuBean("Idli and Vada"));
        personlist.add(new EatWellMenuBean("Ravishing Rawa"));

        personlist.add(new EatWellMenuBean("Rice"));
       // personlist.add(new EatWellMenuBean("Desserts"));

        adapter = new EatWellMenuAdapter(this, R.layout.eatwell, personlist);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }







        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_well_menu);
            initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        // YellowChilliMenuBean food=personlist .get(position);
        switch (position) {
            case 0:
                Intent z = new Intent(this, EatWellAllTime.class);
                startActivity(z);
                break;


         case 1:
                Intent a3 = new Intent(this, EatWellDosa.class);
                startActivity(a3);
                break;
//////
          case 2:
                Intent a4 = new Intent(this, EatWellIdli.class);
                startActivity(a4);
                break;
//////
           case 3:
                Intent a5 = new Intent(this, EatWellRawa.class);
                startActivity(a5);
                break;
//////
            case 4:
                Intent a6 = new Intent(this, EatWellRice.class);
                startActivity(a6);
                break;
//            case 5:
//                Intent a2 = new Intent(this,SousDesserts.class);
//                startActivity(a2);
//                break;


        }
    }


}
