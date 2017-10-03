package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class showCart5 extends AppCompatActivity implements View.OnClickListener  {

    ListView listView;
    TextView textView;
    TextView result;
    Button button;


    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cart5);
        button=(Button)findViewById(R.id.b2);
        button.setOnClickListener(this);

        listView=(ListView)findViewById(R.id.qw1);
        ArrayAdapter<KitchenKnightTandooriStartersBean> adapter=new ArrayAdapter<KitchenKnightTandooriStartersBean>(this,R.layout.shoow1m,KitchenKnightUtil.kitchenKnightTandooriStartersBeans);
        listView.setAdapter(adapter);
        textView=(TextView)findViewById(R.id.textView133m);
        result=(TextView)findViewById(R.id.textView155m);

        int sum=0;
        for(i=0;i< KitchenKnightUtil.kitchenKnightTandooriStartersBeans.size();i++){
            sum = sum+ KitchenKnightUtil.kitchenKnightTandooriStartersBeans.get(i).getPrice();

        }
        result.setText("Rs."+sum +"/-");






    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.b2){
            Intent i=new Intent(this,DeliveryType.class);
            startActivity(i);




        }
    }}

