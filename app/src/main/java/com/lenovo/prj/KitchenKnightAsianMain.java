package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class KitchenKnightAsianMain extends AppCompatActivity implements View.OnClickListener    {

    ListView listView;
    ArrayList<KitchenKnightTandooriStartersBean> kitchenKnightTandooriStartersBeans;
    KitchenKnightTandooriStartersAdapter kitchenKnightTandooriStartersAdapter;

    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_knight_asian_main);
        listView=(ListView)findViewById(R.id.happy2);
        kitchenKnightTandooriStartersBeans =new ArrayList<>();
        kitchenKnightTandooriStartersBeans .add(new KitchenKnightTandooriStartersBean("Chilli Mushroom Gravy", "", "Rs", 304));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chilli Soya", "Marinated Soya Chunks sauteed with schezwan sauce,soy sauce,onion and capsicum", "Rs", 210));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Soya Manchurian","Deep fried soya balls sauteed with ginger garliic paste,chilli sauce and chopped vegetables", "Rs",            142));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Honey Chilli Soya Sauce","","Rs",280));

        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chicken Manchurian Gravy","","Rs",220));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chili Fish Gravy","","Rs",220));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kadhai Paneer","Spiced cottage cheese cooked in a tomato-onion gravy with bell peppers","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Lahori","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Veg Red Pasta","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("veg White Pasta","","Rs.",345));
//        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        kitchenKnightTandooriStartersAdapter =new KitchenKnightTandooriStartersAdapter(this,R.layout.happiness5, kitchenKnightTandooriStartersBeans);
        listView.setAdapter(kitchenKnightTandooriStartersAdapter);


        button =(Button)findViewById(R.id.buttonshow4);
        button.setOnClickListener( this);



    }



    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow4){

            Intent ne =new Intent(this,showCart5.class);
            startActivity(ne);
        }



    }
}
