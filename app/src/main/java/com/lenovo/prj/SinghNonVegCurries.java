package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SinghNonVegCurries extends AppCompatActivity implements View.OnClickListener    {

    ListView listView;
    ArrayList<SinghPopularProductsBean> singhPopularProductsBeans;
    SinghPopularProductsAdapter singhPopularProductsAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singh_non_veg_curries);
        listView=(ListView)findViewById(R.id.happy2);
        singhPopularProductsBeans =new ArrayList<>();
        singhPopularProductsBeans .add(new SinghPopularProductsBean("Handi Chicken", "Chicken and diced capsicum cooked in a yogurt gravy with spices", "Rs", 137));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Egg Curry", "Boiled eggs cooked in a tomato-onion gravy with ginger-garlic paste and spices", "Rs", 210));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Cream Chicken", "White Gravy", "Rs", 142));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Special Chicken Dahi Wala", "", "Rs", 280));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Chicken Tangdi Masala", "", "Rs", 220));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Chicken Seekh Kabab Masala", "", "Rs", 220));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kadhai Paneer","Spiced cottage cheese cooked in a tomato-onion gravy with bell peppers","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Lahori","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Veg Red Pasta","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("veg White Pasta","","Rs.",345));
//        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        singhPopularProductsAdapter=new SinghPopularProductsAdapter(this,R.layout.happiness4, singhPopularProductsBeans);
        listView.setAdapter(singhPopularProductsAdapter);


        button =(Button)findViewById(R.id.buttonshow4);
        button.setOnClickListener( this);



    }



    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow4){

            Intent ne =new Intent(this,showCart4.class);
            startActivity(ne);
        }


    }
}
