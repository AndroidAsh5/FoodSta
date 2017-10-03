package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SousChinese extends AppCompatActivity implements View.OnClickListener   {

    ListView listView;
    ArrayList<SousSnacksBean> sousSnacksBeans;
    SousSnacksAdapter sousSnacksAdapter;

    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sous_chinese);
        listView=(ListView)findViewById(R.id.happy2);
        sousSnacksBeans =new ArrayList<>();
        sousSnacksBeans .add(new SousSnacksBean("Chicken Manchurian", "Deep-fried chicken balls sauteed with ginger-garlic paste,chilli sauce and chopped vegetables", "Rs", 304));
        sousSnacksBeans.add(new SousSnacksBean("Chicken Fried Rice", "Rice stir-fried with soy sauce,vinegar and chicken chunks", "Rs", 210));
        sousSnacksBeans.add(new SousSnacksBean("Chicken Noodle", "", "Rs", 142));
        sousSnacksBeans.add(new SousSnacksBean("Chicken Wings", "", "Rs", 280));
        sousSnacksBeans.add(new SousSnacksBean("Garlic Chicken", "Marinated chicken chunks sauteed with chilli sauce,soy sauce,garlic paste and spices", "Rs", 220));
        sousSnacksBeans.add(new SousSnacksBean("Lemon Chicken", "Marinated chicken sauteed with lemon juice,garlic,butter and mild spices", "Rs", 220));
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
