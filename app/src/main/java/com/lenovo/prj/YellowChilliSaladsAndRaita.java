package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowChilliSaladsAndRaita extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener   {
    ListView listView;
    ArrayList<YelloChilliStartersBean> yelloChilliStartersBeans;
    YelloChilliStartersAdapter yelloChilliStartersAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellow_chilli_salads_and_raita);
        listView=(ListView)findViewById(R.id.happy);
        yelloChilliStartersBeans =new ArrayList<>();
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Boondi Raita","Boondi in beaten curd with cumin seeds and chat masala", "Rs",  170));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Pineapple Raita","Chopped pineapples and sugar in beaten curd", "Rs",                 130));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Cucumber Raita","Finely chopped cucumber mixed with beaten curd,cumin seeds and spices", "Rs",            120));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Mint Raita","","Rs",145));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Green Salad","Garden Fresh,crunchy vegetable salad","Rs",125));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Crispy Lady Finger Raita","","Rs.",145));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Curd Onion Salad","Rings of onion dipped with curd","Rs.",65));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Papaya Peanut Kachumber","Green papaya juiciness,cuccumbers,carrots,onions tossed with roaseted","Rs.",145));
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
