package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SinghPopularProducts extends AppCompatActivity implements View.OnClickListener   {

    ListView listView;
    ArrayList<SinghPopularProductsBean> singhPopularProductsBeans;
    SinghPopularProductsAdapter singhPopularProductsAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singh_popular_products);
        button=(Button)findViewById(R.id.buttonshow4);
        assert button != null;
        button.setOnClickListener(this);
        listView=(ListView)findViewById(R.id.happy2);
        singhPopularProductsBeans =new ArrayList<>();
        singhPopularProductsBeans .add(new SinghPopularProductsBean("Malai Paneer Tikka Roll", "Malai paneer tikka with sauce and spices wrapped in a thin flatbread", "Rs", 137));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Malai Chaap Roll", "Soya chaap mixed with cream and spices,wrapped in a thin flatbread", "Rs", 210));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Special Tandoori Chaap Roll", "", "Rs", 142));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Paneer Tikka Roll", "Marinated cottage cheese grilled over charcoal,wrapped in a thin flatbread with spices", "Rs", 280));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Special Tandoori Chaap Roll", "", "Rs", 220));
        singhPopularProductsBeans.add(new SinghPopularProductsBean("Adhraki Chaap Roll", "Double", "Rs", 220));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kadhai Paneer","Spiced cottage cheese cooked in a tomato-onion gravy with bell peppers","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Lahori","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Veg Red Pasta","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("veg White Pasta","","Rs.",345));
//        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        singhPopularProductsAdapter=new SinghPopularProductsAdapter(this,R.layout.happiness4, singhPopularProductsBeans);
        listView.setAdapter(singhPopularProductsAdapter);


        //button =(Button)findViewById(R.id.buttonshow4);
        //button.setOnClickListener( this);



    }



    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow4){

            Intent ne =new Intent(this,showCart4.class);
            startActivity(ne);
        }


    }
    }

