package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class EatWellIdli extends AppCompatActivity implements View.OnClickListener     {

    ListView listView;
    ArrayList<EatWellAllTimeBean> eatWellAllTimeBeans;
    EatWellAllTimeAdapter eatWellAllTimeAdapter;

    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat_well_idli);
        listView=(ListView)findViewById(R.id.happy2);
        eatWellAllTimeBeans =new ArrayList<>();
        eatWellAllTimeBeans .add(new EatWellAllTimeBean("Medu Vada", "Doughnut-shaped,fried snack made from urad dal and mild spices", "Rs", 304));
        eatWellAllTimeBeans.add(new EatWellAllTimeBean("Rasam Vada", "", "Rs", 210));
        eatWellAllTimeBeans.add(new EatWellAllTimeBean("Onion Vada", "Fried doughnuts prepared with lentils,black grams and chopped onions", "Rs", 142));
        eatWellAllTimeBeans.add(new EatWellAllTimeBean("Steamed Idli", "", "Rs", 280));
        eatWellAllTimeBeans.add(new EatWellAllTimeBean("Idli Vada", "", "Rs", 220));
        // eatWellAllTimeBeans.add(new EatWellAllTimeBean("Chicken Malai Tikka", "Chicken chunks marinated in milk cream and cashew nut paste,grilled over charcoal", "Rs", 220));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kadhai Paneer","Spiced cottage cheese cooked in a tomato-onion gravy with bell peppers","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Lahori","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Veg Red Pasta","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("veg White Pasta","","Rs.",345));
//        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        eatWellAllTimeAdapter =new EatWellAllTimeAdapter(this,R.layout.happiness7, eatWellAllTimeBeans);
        listView.setAdapter(eatWellAllTimeAdapter);


        button =(Button)findViewById(R.id.buttonshow46e);
        button.setOnClickListener( this);



    }



    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow46e){

            Intent ne =new Intent(this,showCart7.class);
            startActivity(ne);
        }



    }
}
