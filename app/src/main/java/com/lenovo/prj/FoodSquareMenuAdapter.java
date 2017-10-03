package com.lenovo.prj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 8/13/2016.
 */
public class FoodSquareMenuAdapter extends ArrayAdapter<FoodSquareMenuBean> {

    Context cxt;
    int res;
    ArrayList<FoodSquareMenuBean> personList;


    public FoodSquareMenuAdapter(Context context, int resource, ArrayList<FoodSquareMenuBean> objects) {
        super(context, resource, objects);

        cxt = context;
        res = resource;
        personList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem;

        listItem = LayoutInflater.from(cxt).inflate(res, parent, false);
        TextView txtName = (TextView) listItem.findViewById(R.id.textView100);
        FoodSquareMenuBean foodSquareMenuBean = personList.get(position);

        txtName.setText(foodSquareMenuBean.getName());





        return listItem;

    }
}
