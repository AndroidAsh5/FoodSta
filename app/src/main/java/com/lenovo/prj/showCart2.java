package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class showCart2 extends AppCompatActivity implements View.OnClickListener {

    ListView listView;
    TextView textView;
    TextView result;
    Button button;


    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cart2);
        button=(Button)findViewById(R.id.buttonAdd1);
        button.setOnClickListener(this);

        listView=(ListView)findViewById(R.id.qw1);
        ArrayAdapter<FoodSquareIndianMainCourseBean> adapter=new ArrayAdapter<FoodSquareIndianMainCourseBean>(this,R.layout.shoow1,FoodSquareUtil.foodSquareIndianMainCourseBeans);
        listView.setAdapter(adapter);
        textView=(TextView)findViewById(R.id.textView133);
        result=(TextView)findViewById(R.id.textView155);

        int sum=0;
        for(i=0;i< FoodSquareUtil.foodSquareIndianMainCourseBeans.size();i++){
            sum = sum+ FoodSquareUtil.foodSquareIndianMainCourseBeans.get(i).getPrice();

        }
        result.setText("Rs."+sum +"/-");






    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.buttonAdd1){
            Intent i=new Intent(this,DeliveryType.class);
            startActivity(i);


        }
}}
