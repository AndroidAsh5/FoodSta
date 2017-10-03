package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SamPizzaPremiumPizza extends AppCompatActivity implements View.OnClickListener   {

    ListView listView;
    ArrayList<HaveliIndianCourseBean> haveliIndianCourseBeans;
    HaveliIndianCourseAdapter haveliIndianCourseAdapter;

    Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_pizza_premium_pizza);
        listView=(ListView)findViewById(R.id.happy2);
        haveliIndianCourseBeans =new ArrayList<>();
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Part Lover's Pizza", "Capsicum,sweet corn,tomato and cheese", "Rs", 122));
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Mexican Passion Pizza", "Sweet corn,tomato,olives,jalapenos and cheese", "Rs", 76));
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Veggie Pizza","Onion,capsicum,mushroom,tomato,peppy paneer and cheese", "Rs",            142));
          haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Hawaiian Ecstasy Pizza", "Paneer,Pineapple,chilly and cheese", "Rs", 280));
        //    haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Paneer Lababdar", "Cottage cheese simmered in a creamy tomato gravy with spices", "Rs", 220));
        haveliIndianCourseAdapter =new HaveliIndianCourseAdapter(this,R.layout.happiness3, haveliIndianCourseBeans);
        listView.setAdapter(haveliIndianCourseAdapter);


        button =(Button)findViewById(R.id.buttonshow40);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow40){

            Intent ne =new Intent(this,showCart3.class);
            startActivity(ne);
        }

    }
}
