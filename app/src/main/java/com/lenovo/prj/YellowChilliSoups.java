package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowChilliSoups extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener  {


    ListView listView;
    ArrayList<YelloChilliStartersBean> yelloChilliStartersBeans;
    YelloChilliStartersAdapter yelloChilliStartersAdapter;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_chilli_soups);

        listView=(ListView)findViewById(R.id.happy);
        yelloChilliStartersBeans =new ArrayList<>();
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Basil Shorba","For Tomato soup lovers,basil adds a healthy,herbal touch to the Indian Tomato Soup", "Rs",  85));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Veg. Sweet Corn Soup","Eternal favourite,thick cream of sweet corn", "Rs",                 85));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Chicken Sweet Corn Soup","Eternal favourite,thick cream oof soft corn", "Rs",            80));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Coconut Zaffrani Shorba","Smooth coconut milk soup with fennel and the rich warmth of saffron","Rs",95));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Murg Yakhni","Chicken soup with the goodness of kashmiri cuisine","Rs",95));
        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Plain Tandoori Roti","","Rs.",45));
        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        yelloChilliStartersAdapter =new YelloChilliStartersAdapter(this,R.layout.happiness1, yelloChilliStartersBeans);
        listView.setAdapter(yelloChilliStartersAdapter);
        listView.setOnItemClickListener(this);

        button =(Button)findViewById(R.id.buttonshow);
        button.setOnClickListener( this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow){

            Intent ne =new Intent(this,showCart.class);
            startActivity(ne);
        }



    }
    }

