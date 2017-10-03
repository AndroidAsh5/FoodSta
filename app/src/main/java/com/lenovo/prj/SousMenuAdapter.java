package com.lenovo.prj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 8/17/2016.
 */
public class SousMenuAdapter extends ArrayAdapter<SousMenuBean>{


    Context cxt;
    int res;
    ArrayList<SousMenuBean> personList;


    public SousMenuAdapter(Context context, int resource, ArrayList<SousMenuBean> objects) {
        super(context, resource, objects);
        cxt = context;
        res = resource;
        personList = objects;



    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem;

        listItem = LayoutInflater.from(cxt).inflate(res, parent, false);
        TextView txtName = (TextView) listItem.findViewById(R.id.textView100ax);
        SousMenuBean sousMenuBean = personList.get(position);

        txtName.setText(sousMenuBean.getName());





        return listItem;

    }

}
