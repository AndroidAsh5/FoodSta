package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class HaveliIndianCourse extends AppCompatActivity implements View.OnClickListener  {
    ListView listView;
    ArrayList<HaveliIndianCourseBean> haveliIndianCourseBeans;
    HaveliIndianCourseAdapter haveliIndianCourseAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haveli_indian_course);

        listView=(ListView)findViewById(R.id.happy2);
        haveliIndianCourseBeans =new ArrayList<>();
         haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Garlic Bread with Cheese", "Bread baked in oven,infused with garlic flavour and topped with cheese", "Rs", 79));
        haveliIndianCourseBeans.add(new HaveliIndianCourseBean("French Fries", "Deep fried potato batons,seasoned with salt", "Rs", 76));
        //haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Soya Makhani","Soya Chunks prepared in a thick gravy of cream and tomato,topped with butter", "Rs",            142));
      //  haveliIndianCourseBeans.add(new HaveliIndianCourseBean("Paneer Amritsari", "Marinated cottage cheese deep-fried in oil and sauteed with onion,ginger,garlic and carom seeds", "Rs", 280));
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
