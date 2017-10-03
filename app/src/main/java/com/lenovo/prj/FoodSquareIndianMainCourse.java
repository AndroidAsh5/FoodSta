package com.lenovo.prj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodSquareIndianMainCourse extends AppCompatActivity implements View.OnClickListener  {

    ListView listView;
    ArrayList<FoodSquareIndianMainCourseBean> foodSquareIndianMainCourseBeans;
    FoodSquareIndianMainCourseAdapter foodSquareIndianMainCourseAdapter;

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_square_indian_main_course);

        listView=(ListView)findViewById(R.id.happy2);
        foodSquareIndianMainCourseBeans =new ArrayList<>();
       foodSquareIndianMainCourseBeans .add(new FoodSquareIndianMainCourseBean("Murg Chaap","", "Rs",  304));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Mushroom Butter Masala","", "Rs",                 210));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Soya Makhani","Soya Chunks prepared in a thick gravy of cream and tomato,topped with butter", "Rs",            142));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Paneer Amritsari","Marinated cottage cheese deep-fried in oil and sauteed with onion,ginger,garlic and carom seeds","Rs",280));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Paneer Lababdar","Cottage cheese simmered in a creamy tomato gravy with spices","Rs",220));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Kadhai Paneer","Spiced cottage cheese cooked in a tomato-onion gravy with bell peppers","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Paneer Lahori","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("Veg Red Pasta","","Rs.",345));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("veg White Pasta","","Rs.",345));
//        //yelloChilliStartersBeans.add(new YelloChilliStartersBean("Tomato Naan","","Rs.",80));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));
//        yelloChilliStartersBeans.add(new YelloChilliStartersBean("manchurian",121));

        foodSquareIndianMainCourseAdapter =new FoodSquareIndianMainCourseAdapter(this,R.layout.happiness2, foodSquareIndianMainCourseBeans);
        listView.setAdapter(foodSquareIndianMainCourseAdapter);


        button =(Button)findViewById(R.id.buttonshow4);
        button.setOnClickListener( this);



    }



    @Override
    public void onClick(View v) {



        if(v.getId()==R.id.buttonshow4){

            Intent ne =new Intent(this,showCart2.class);
            startActivity(ne);
        }


    }
}
