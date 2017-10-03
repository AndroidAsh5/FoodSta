package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class showCart7 extends AppCompatActivity implements View.OnClickListener  {
    ListView listView;
    TextView textView;
    TextView result;
    Button button;


    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cart7);
        button=(Button)findViewById(R.id.buttonAdd166e);
        button.setOnClickListener(this);

        listView=(ListView)findViewById(R.id.qw1);
        ArrayAdapter<EatWellAllTimeBean> adapter=new ArrayAdapter<EatWellAllTimeBean>(this,R.layout.shoow166e,EatWellUtil.eatWellAllTimeBeans);
        listView.setAdapter(adapter);
        textView=(TextView)findViewById(R.id.textView13366e);
        result=(TextView)findViewById(R.id.textView15566e);

        int sum=0;
        for(i=0;i< EatWellUtil.eatWellAllTimeBeans.size();i++){
            sum = sum+ EatWellUtil.eatWellAllTimeBeans.get(i).getPrice();

        }
        result.setText("Rs."+sum +"/-");






    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.buttonAdd166e){
            Intent i=new Intent(this,DeliveryType.class);
            startActivity(i);


        }
    }
    }

