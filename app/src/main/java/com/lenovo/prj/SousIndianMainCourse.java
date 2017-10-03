package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SousIndianMainCourse extends AppCompatActivity implements View.OnClickListener    {


    ListView listView;
    ArrayList<SousSnacksBean> sousSnacksBeans;
    SousSnacksAdapter sousSnacksAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sous_indian_main_course);
        listView=(ListView)findViewById(R.id.happy2);
        sousSnacksBeans =new ArrayList<>();
        sousSnacksBeans .add(new SousSnacksBean("Dal Makhani", "Black lentil delicacy prepared with a rich tomato gravy,cream and butter", "Rs", 304));
        sousSnacksBeans.add(new SousSnacksBean("Adarki Gobi", "", "Rs", 210));
        sousSnacksBeans.add(new SousSnacksBean("Chana Masala", "Boiled chickpeas cooked in a thick gravy with spices,onion and tomato", "Rs", 142));
        sousSnacksBeans.add(new SousSnacksBean("Tawa Chicken", "Chicken chunks tossed on a griddle with dry spices and a red tomato gravy", "Rs", 280));
        sousSnacksBeans.add(new SousSnacksBean("Mutton Curry", "", "Rs", 220));
        sousSnacksBeans.add(new SousSnacksBean("Mutton Masala", "", "Rs", 220));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kadhai Paneer","Spiced cottage cheese cooked in a tomato-onion gravy with bell peppers","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Lahori","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Veg Red Pasta","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("veg White Pasta","","Rs.",345));
//        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        sousSnacksAdapter =new SousSnacksAdapter(this,R.layout.happiness6, sousSnacksBeans);
        listView.setAdapter(sousSnacksAdapter);


        button =(Button)findViewById(R.id.buttonshow46);
        button.setOnClickListener( this);



    }



    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow46){

            Intent ne =new Intent(this,showCart6.class);
            startActivity(ne);
        }


    }
}
