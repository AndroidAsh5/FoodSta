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
public class SinghMenuAdapter extends ArrayAdapter<SinghMenuBean>{



    Context cxt;
    int res;
    ArrayList<SinghMenuBean> personList;


    public SinghMenuAdapter(Context context, int resource, ArrayList<SinghMenuBean> objects) {
        super(context, resource, objects);

        cxt = context;
        res = resource;
        personList = objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem;

        listItem = LayoutInflater.from(cxt).inflate(res, parent, false);
        TextView txtName = (TextView) listItem.findViewById(R.id.textView100a);
        SinghMenuBean singhMenuBean = personList.get(position);

        txtName.setText(singhMenuBean.getName());





        return listItem;

    }
}
