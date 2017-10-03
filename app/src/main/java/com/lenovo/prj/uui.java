package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class uui extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    ListView listview;
    SinghMenuAdapter adapter;
    ArrayList<SinghMenuBean> personlist;

    int pos;
    void initViews() {

        listview = (ListView) findViewById(R.id.singh);
        personlist = new ArrayList<>();
        personlist.add(new SinghMenuBean("Popular "));
        //personlist.add(new YellowChilliMenuBean("Dal : Rajma : Chholay"));
        personlist.add(new SinghMenuBean("Singh Ke Veg. Rolls"));
        personlist.add(new SinghMenuBean("Singh Ki Veg. Curries"));
        personlist.add(new SinghMenuBean("Singh Ki Non-Veg Curries"));

        personlist.add(new SinghMenuBean("Singh Ke Breads"));
        personlist.add(new SinghMenuBean("Singh Ke Gyms Special"));

        adapter = new SinghMenuAdapter(this, R.layout.singh, personlist);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uui);
        initViews();
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        // YellowChilliMenuBean food=personlist .get(position);
        switch (position) {
            case 0:
                Intent z = new Intent(this, uuipopular.class);
                startActivity(z);
                break;


//            case 0:
//                Intent a3 = new Intent(this, SinghVegRolls.class);
//                startActivity(a3);
//                break;
////
//            case 2:
//                Intent a4 = new Intent(this, SinghVegCurries.class);
//                startActivity(a4);
//                break;
////
//            case 3:
//                Intent a5 = new Intent(this, SinghNonVegCurries.class);
//                startActivity(a5);
//                break;
////
//            case 4:
//                Intent a6 = new Intent(this, YellowChilliMeals.class);
//                startActivity(a6);
//                break;
//            case 5:
//                Intent a2 = new Intent(this, SinghGymSpl.class);
//                startActivity(a2);
//                break;


        }
    }
}
