package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodSquareMenu extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView listview;
    FoodSquareMenuAdapter adapter;
    ArrayList<FoodSquareMenuBean> personlist;

    int pos;

    void initViews() {

        listview = (ListView) findViewById(R.id.foodsquare);
        personlist = new ArrayList<>();
        personlist.add(new FoodSquareMenuBean("Indian Main Course"));
        //personlist.add(new YellowChilliMenuBean("Dal : Rajma : Chholay"));
        personlist.add(new FoodSquareMenuBean("Breads"));
        personlist.add(new FoodSquareMenuBean("Kathi Rolls"));
        personlist.add(new FoodSquareMenuBean("Rice"));

        personlist.add(new FoodSquareMenuBean("Desserts"));

        adapter = new FoodSquareMenuAdapter(this, R.layout.foodsquare, personlist);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_square_menu);
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        // YellowChilliMenuBean food=personlist .get(position);
        switch (position) {
            case 0:
                Intent z = new Intent(this, FoodSquareIndianMainCourse.class);
                startActivity(z);
                break;


            case 1:
               Intent a3 = new Intent(this, YellowChilliMeals.class);
                startActivity(a3);
                break;
//
           case 2:
                Intent a4 = new Intent(this, FoodSquareKathiRolls.class);
                startActivity(a4);
               break;
//
            case 3:
                Intent a5 = new Intent(this, YellowChilliRice.class);
                startActivity(a5);
                break;
//
            case 4:
               Intent a6 = new Intent(this, FoodSquareDesserts.class);
                startActivity(a6);
                break;
//            case 5:
//                Intent a2 = new Intent(YellowChilliMenu.this, YellowChilliDal.class);
//                startActivity(a2);
//                break;


        }
    }
}