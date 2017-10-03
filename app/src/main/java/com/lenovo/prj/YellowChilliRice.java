package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowChilliRice extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener  {

    ListView listView;
    ArrayList<YelloChilliStartersBean> yelloChilliStartersBeans;
    YelloChilliStartersAdapter yelloChilliStartersAdapter;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_chilli_rice);
        listView=(ListView)findViewById(R.id.happy);
        yelloChilliStartersBeans =new ArrayList<>();
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Nizami Tarkari Biryani","Aromatic Vegetable biryani,served sealed", "Rs",  370));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Sada Chawal","Streamed Rice", "Rs",                 210));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Taka Tak Fried Rice","Our own Taka tak speciality,experimented with basmati rice and oriental flavours", "Rs",            245));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Amchi Mumbai Rustami Biryani","Inspired By a secret Parsi household recipe of Mumbai,blend of spiced lamb and rice","Rs",380));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Green Peas Zera ","","Rs",210));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Cumin Matar Pulao","","Rs.",345));
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


        if(v.getId() == R.id.buttonshow) {

                Intent ne = new Intent(this, showCart.class);
                startActivity(ne);
            }


        }
    }
