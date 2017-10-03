package com.lenovo.prj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class YellowChilliStarters extends AppCompatActivity implements AdapterView.OnItemClickListener,View.OnClickListener{


    ListView listView;
    ArrayList<YelloChilliStartersBean> yelloChilliStartersBeans;
    YelloChilliStartersAdapter yelloChilliStartersAdapter;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yellochillistarters);
        listView=(ListView)findViewById(R.id.happy);
        yelloChilliStartersBeans =new ArrayList<>();
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kasoori Paneer","A unique blend of curry pasta with delighted saucage blended inside fresh cheese", "Rs",  325));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Shabnam Ke Moti","Mushrooms stuffed and coated with a cheese mixture and pan fried ", "Rs",                 330));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Sandwich Kabaab","Potato mixture sandwiched between slices of paneer,coated in a batter and fried", "Rs",            345));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Karara Subz Roll","Marinated vegetables grilled over charcoal,wrapped in a thin flatbread with spices","Rs",325));
        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Mixed Grill","Grilled vegetables tossed with onion,bell pepper,letteuce and mayonnise","Rs",465));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
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
