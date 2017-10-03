package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SinghVegRolls extends AppCompatActivity implements View.OnClickListener    {
    ListView listView;
    ArrayList<SinghPopularProductsBean> singhPopularProductsBeans;
    SinghPopularProductsAdapter singhPopularProductsAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singh_veg_rolls);
        listView=(ListView)findViewById(R.id.happy2);
        singhPopularProductsBeans =new ArrayList<>();
        singhPopularProductsBeans .add(new SinghPopularProductsBean("Afghani Chicken", "Chicken Chunks marinated in yogurt,cream,peanut and cashew nut paste", "Rs", 137));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Roasted Chicken Malai Tikka", "", "Rs", 210));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Kadhai Chicken", "Chicken chunks cooked in a tomato-onion gravy with bell peppers", "Rs", 142));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Chicken Biryani", "Served with gravy", "Rs", 280));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Chicken Rara", "Chicken pieces coated with spices,cooked in a dry cardamom gravy with yogurt", "Rs", 220));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Chicken Seekh Kabab", "Minced chicken mixed with onion,cornflour and spices,grilled over charcoal", "Rs", 220));
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
