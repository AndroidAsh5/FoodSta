package com.lenovo.prj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 7/20/2016.
 */
public class LudhianaHotelListAdapter extends ArrayAdapter<LudhianaHotelListBean> {

    Context cxt;
    int res;
    ArrayList<LudhianaHotelListBean> foodList;




    public LudhianaHotelListAdapter(Context context, int resource, ArrayList<LudhianaHotelListBean> objects) {


        super(context, resource, objects);

        cxt = context;
        res = resource;
        foodList = objects;



    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        ImageView ivIcon=(ImageView)listItem.findViewById(R.id.imageView2);
        TextView txtName=(TextView)listItem.findViewById(R.id.textView2) ;
        TextView txtText=(TextView)listItem.findViewById(R.id.textView18);
        // RatingBar bar =(RatingBar)listItem.findViewById(R.id.ratingBar);
        LudhianaHotelListBean fb=foodList.get(position);
        ivIcon.setBackgroundResource(fb.getIcon());
        txtName.setText(fb.getName());
        txtText.setText(fb.getText());
        // bar.setNumStars(zz);
        return listItem;
    }
}
