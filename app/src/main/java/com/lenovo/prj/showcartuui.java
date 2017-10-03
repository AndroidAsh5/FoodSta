package com.lenovo.prj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class showcartuui extends AppCompatActivity implements View.OnClickListener  {
    ListView listView;
    TextView textView;
    TextView result;


    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showcartuui);
        listView=(ListView)findViewById(R.id.qw1);
        ArrayAdapter<SinghPopularProductsBean> adapter=new ArrayAdapter<SinghPopularProductsBean>(this,R.layout.shoow1au,SinghUtil.singhPopularProductsBeans);
        listView.setAdapter(adapter);
        textView=(TextView)findViewById(R.id.textView133au);
        result=(TextView)findViewById(R.id.textView155au);

        int sum=0;
        for(i=0;i< SinghUtil.singhPopularProductsBeans.size();i++){
            sum = sum+ SinghUtil.singhPopularProductsBeans.get(i).getPrice();

        }
        result.setText("Rs."+sum +"/-");






    }

    @Override
    public void onClick(View v) {

    }

}

