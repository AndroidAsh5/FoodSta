package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowChilliMeals extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener {

    ListView listView;
    ArrayList<YelloChilliStartersBean> yelloChilliStartersBeans;
    YelloChilliStartersAdapter yelloChilliStartersAdapter;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_chilli_meals);

        listView=(ListView)findViewById(R.id.happy);
        yelloChilliStartersBeans =new ArrayList<>();
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Mint Parantha","Parantha flavoured with fresh mint", "Rs",  70));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Lachha Parantha","Multi layered flatbread made with whole wheat flour", "Rs",                 70));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Potato Stuffed Kulcha","", "Rs",            80));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Stuffed Kulcha","Crisp and soft Leavened breads stuffed with spiced paneer filling","Rs",80));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Butter Naan","Soft and fluffy flatbread made with salt,a yeast culture and yogurt,and topped with buttter","Rs",465));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Plain Tandoori Roti","","Rs.",45));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
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

