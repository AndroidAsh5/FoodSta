package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class KitchenKnightAsianStarters extends AppCompatActivity implements View.OnClickListener     {

    ListView listView;
    ArrayList<KitchenKnightTandooriStartersBean> kitchenKnightTandooriStartersBeans;
    KitchenKnightTandooriStartersAdapter kitchenKnightTandooriStartersAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen_knight_asian_starters);
        listView=(ListView)findViewById(R.id.happy2);
        kitchenKnightTandooriStartersBeans =new ArrayList<>();
        kitchenKnightTandooriStartersBeans .add(new KitchenKnightTandooriStartersBean("Veg. Manchurian Dry", "", "Rs", 304));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chilli Paneer Dry", "", "Rs", 210));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Garlic Chicken","Marinated  chicken chunks sauteed with chilli sauce,soy sauce,garlic paste and spices", "Rs",            142));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chicken Lollipop","Chicken wings coated with a batter of flour,yogurt and ginger-garlic paste fried in oil","Rs",280));

        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chicken 65","Deep fried chicken chunks,sauteed with red chilli powder and spices","Rs",220));
        kitchenKnightTandooriStartersBeans.add(new KitchenKnightTandooriStartersBean("Chilli Chicken Dry","","Rs",240));
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
