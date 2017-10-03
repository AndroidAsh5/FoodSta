package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class KitchenKnightAcc extends AppCompatActivity implements View.OnClickListener     {

    ListView listView;
    ArrayList<KitchenKnightTandooriStartersBean> kitchenKnightTandooriStartersBeans;
    KitchenKnightTandooriStartersAdapter kitchenKnightTandooriStartersAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_knight_acc);

        listView=(ListView)findViewById(R.id.happy2);
        kitchenKnightTandooriStartersBeans =new ArrayList<>();
        kitchenKnightTandooriStartersBeans .add(new KitchenKnightTandooriStartersBean("Chicken Singapore Noodles", "Boiled noodles stir-fried with soy-sauce,vinegar,curry powder and assorted vegetables", "Rs", 304));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chicken Chop Suey", "Crispy noodles sauteed with chicken chunks,vegetables and spices", "Rs", 210));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Egg Fried Rice","", "Rs",            142));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Veg. Chop Suey","","Rs",280));

        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chicken Fried Rice","","Rs",220));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chicken Noodles","","Rs",220));
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
