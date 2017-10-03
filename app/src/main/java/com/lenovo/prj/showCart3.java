package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class showCart3 extends AppCompatActivity implements View.OnClickListener  {

    ListView listView;
    TextView textView;
    TextView result;
    Button button;


    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cart3);
        button=(Button)findViewById(R.id.buttonAdd10);
        button.setOnClickListener(this);

        listView=(ListView)findViewById(R.id.qw10);
        ArrayAdapter<HaveliIndianCourseBean> adapter=new ArrayAdapter<HaveliIndianCourseBean>(this,R.layout.shoow10,HaveliUtil.haveliIndianCourseBeans);
        listView.setAdapter(adapter);
        textView=(TextView)findViewById(R.id.textView1330);
        result=(TextView)findViewById(R.id.textView1550);

        int sum=0;
        for(i=0;i< HaveliUtil.haveliIndianCourseBeans.size();i++){
            sum = sum+ HaveliUtil.haveliIndianCourseBeans.get(i).getPrice();

        }
        result.setText("Rs."+sum +"/-");






    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.buttonAdd10){
            Intent i=new Intent(this,DeliveryType.class);
            startActivity(i);


        }
    }}

