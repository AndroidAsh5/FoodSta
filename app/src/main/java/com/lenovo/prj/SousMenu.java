 package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SousMenu extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listview;
    SousMenuAdapter adapter;
    ArrayList<SousMenuBean> personlist;

    int pos;
    void initViews() {

        listview = (ListView) findViewById(R.id.singh);
        personlist = new ArrayList<>();
        personlist.add(new SousMenuBean("Snacks"));
        //personlist.add(new YellowChilliMenuBean("Dal : Rajma : Chholay"));
        personlist.add(new SousMenuBean("Rice & Biryani"));
        personlist.add(new SousMenuBean("Indian Main Course"));
        personlist.add(new SousMenuBean("Chinese"));

        personlist.add(new SousMenuBean("Tandoori Bread"));
        personlist.add(new SousMenuBean("Desserts"));

        adapter = new SousMenuAdapter(this, R.layout.sous, personlist);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sous_menu);
        initViews();
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        // YellowChilliMenuBean food=personlist .get(position);
        switch (position) {
            case 0:
                Intent z = new Intent(this, SousSnacks.class);
                startActivity(z);
                break;


          case 1:
                Intent a3 = new Intent(this, SousRiceAndBiryani.class);
                startActivity(a3);
               break;
////
           case 2:
                Intent a4 = new Intent(this, SousIndianMainCourse.class);
                startActivity(a4);
                break;
////
           case 3:
               Intent a5 = new Intent(this, SousChinese.class);
                startActivity(a5);
//                break;
////
            case 4:
                Intent a6 = new Intent(this, SousTandooriBread.class);
                startActivity(a6);
                break;
           case 5:
                Intent a2 = new Intent(this,SousDesserts.class);
               startActivity(a2);
                break;


        }
    }

}
