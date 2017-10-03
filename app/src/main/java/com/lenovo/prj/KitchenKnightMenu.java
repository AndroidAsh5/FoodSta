package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class KitchenKnightMenu extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    ListView listview;
    KitchenKnightMenuAdapter adapter;
    ArrayList<KitchenKnightMenuBean> personlist;

    int pos;
    void initViews() {

        listview = (ListView) findViewById(R.id.foodsquare);
        personlist = new ArrayList<>();
        personlist.add(new KitchenKnightMenuBean("Tandoori Starters"));
        personlist.add(new KitchenKnightMenuBean("Asian Main Course"));
        personlist.add(new KitchenKnightMenuBean("Asian Starters"));
        personlist.add(new KitchenKnightMenuBean("Special Combos"));
      //  personlist.add(new KitchenKnightMenuBean("Accompaniments"));

        personlist.add(new KitchenKnightMenuBean("Fried Rice & Noodles"));

        adapter = new KitchenKnightMenuAdapter(this, R.layout.kitchenknight, personlist);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchnen_knight_menu);
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


        // YellowChilliMenuBean food=personlist .get(position);
        switch (position) {
            case 0:
                Intent z = new Intent(this, KitchenKnightTandooriStarters.class);
                startActivity(z);
                break;


            case 1:
                Intent a3 = new Intent(this, KitchenKnightAsianMain.class);
                startActivity(a3);
                break;
//
            case 2:
                Intent a4 = new Intent(this, KitchenKnightAsianStarters.class);
                startActivity(a4);
                break;
//
            case 3:
                Intent a5 = new Intent(this, KitchenKnightSpecial.class);
                startActivity(a5);
                break;
//
            case 4:
                Intent a6 = new Intent(this, KitchenKnightAcc.class);
                startActivity(a6);
                break;
//            case 5:
//                Intent a2 = new Intent(YellowChilliMenu.this, YellowChilliDal.class);
//                startActivity(a2);
//                break;


        }
    }
}
