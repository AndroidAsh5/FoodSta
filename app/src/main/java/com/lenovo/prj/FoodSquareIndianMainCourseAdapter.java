package com.lenovo.prj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 8/13/2016.
 */
public class FoodSquareIndianMainCourseAdapter extends ArrayAdapter<FoodSquareIndianMainCourseBean>{

    Context cxt;
    int res;
    ArrayList<FoodSquareIndianMainCourseBean> foodSquareIndianMainCourseBeans;

    public FoodSquareIndianMainCourseAdapter(Context context, int resource, List<FoodSquareIndianMainCourseBean> objects) {
        super(context, resource, objects);
        cxt=context;
        res=resource;
        foodSquareIndianMainCourseBeans= (ArrayList<FoodSquareIndianMainCourseBean>) objects;
    }
    int pos;



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

       View listItem;
        pos=position;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        final Button button=(Button)listItem.findViewById(R.id.button33);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FoodSquareIndianMainCourseBean hb1=foodSquareIndianMainCourseBeans.get(position);
                FoodSquareUtil.foodSquareIndianMainCourseBeans.add(hb1);
                button.setText("ADDED");

            }
        });

        TextView txtname1 =(TextView)listItem.findViewById(R.id.textView122);
        TextView txtr1=(TextView)listItem.findViewById(R.id.textView199);
        TextView txtprice1 =(TextView)listItem.findViewById(R.id.textView111);
        FoodSquareIndianMainCourseBean hb = foodSquareIndianMainCourseBeans.get(position);

        txtname1.setText(hb.getName());
        txtr1.setText(hb.getR1());

        txtprice1.setText(String.valueOf(hb.getPrice()));






        return listItem;
    }
}
