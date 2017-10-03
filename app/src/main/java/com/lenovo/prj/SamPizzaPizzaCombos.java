package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SamPizzaPizzaCombos extends AppCompatActivity implements View.OnClickListener   {

    ListView listView;
    ArrayList<HaveliIndianCourseBean> haveliIndianCourseBeans;
    HaveliIndianCourseAdapter haveliIndianCourseAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sam_pizza_pizza_combos);
        listView=(ListView)findViewById(R.id.happy2);
        haveliIndianCourseBeans =new ArrayList<>();
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Double trouble", "1 regular pizza,1 salad tin,2 pc garlic bread or Jain bread and a 500ml coke", "Rs", 340));
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Triple Treat", "1 medium pizza,1 salad tin,3 pc garlic bread or Jain bread a a 1 litre coke", "Rs", 420));
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Fun for Four","1 large pizza,1 salad tin,4 pc garlic bread or Jain bread and 1.5 litre coke", "Rs",            540));
          haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Family Pack", "1 Large pizza,1 medium pizza,2 salad tins,6 pc garlic bread or Jain bread and 2 litres coke", "Rs", 610));
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
