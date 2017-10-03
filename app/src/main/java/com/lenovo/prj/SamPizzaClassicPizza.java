package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SamPizzaClassicPizza extends AppCompatActivity implements View.OnClickListener   {
    ListView listView;
    ArrayList<HaveliIndianCourseBean> haveliIndianCourseBeans;
    HaveliIndianCourseAdapter haveliIndianCourseAdapter;

    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_pizza_classic_pizza);
        listView=(ListView)findViewById(R.id.happy2);
        haveliIndianCourseBeans =new ArrayList<>();
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Caponito Pizza", "Capsicum,onion,tomato and cheese", "Rs", 108));
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Tomchi Pizza", "Tomato,onion,chilli and cheese", "Rs", 108));
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Mushoni Pizza","Mushroom,onion,chilli and cheese", "Rs",            142));
          haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Popeye Pizza", "Spinach,onion,tomato and cheese", "Rs", 180));
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
