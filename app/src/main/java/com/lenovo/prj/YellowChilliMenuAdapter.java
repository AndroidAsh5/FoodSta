package com.lenovo.prj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 7/23/2016.
 */
public class YellowChilliMenuAdapter extends ArrayAdapter<YellowChilliMenuBean>{


    Context cxt;
    int res;
    ArrayList<YellowChilliMenuBean> personList;

    public YellowChilliMenuAdapter(Context context, int resource, ArrayList<YellowChilliMenuBean> objects) {
        super(context, resource, objects);

        cxt = context;
        res = resource;
        personList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem;

        listItem = LayoutInflater.from(cxt).inflate(res, parent, false);
        TextView txtName = (TextView) listItem.findViewById(R.id.textView3);
        YellowChilliMenuBean yb = personList.get(position);

        txtName.setText(yb.getName());





        return listItem;
    }
}
