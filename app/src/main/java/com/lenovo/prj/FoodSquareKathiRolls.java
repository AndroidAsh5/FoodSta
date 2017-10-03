package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodSquareKathiRolls extends AppCompatActivity  implements View.OnClickListener  {


    ListView listView;
    ArrayList<FoodSquareIndianMainCourseBean> foodSquareIndianMainCourseBeans;
    FoodSquareIndianMainCourseAdapter foodSquareIndianMainCourseAdapter;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_square_kathi_rolls);
        listView=(ListView)findViewById(R.id.happy2);
        foodSquareIndianMainCourseBeans =new ArrayList<>();
        foodSquareIndianMainCourseBeans .add(new FoodSquareIndianMainCourseBean("Potato Lemon Roll","", "Rs",  80));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Paneer Tikka Roll","Marinated cottage cheese grilled over charcoal,wrapped  in a thin flatbread with sauces and spices", "Rs",                 144));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Mushroom Kali Mirch Roll","", "Rs",            142));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Egg Lemon Roll","","Rs",80));
        foodSquareIndianMainCourseBeans.add(new FoodSquareIndianMainCourseBean("Chicken Seekh Roll","Minced chicken pressed over a skewer and grilled over charcoal,wrapped in a thin flatbread","Rs",220));
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
