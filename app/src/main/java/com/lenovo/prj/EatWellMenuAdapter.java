package com.lenovo.prj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lenovo on 8/20/2016.
 */
public class EatWellMenuAdapter extends ArrayAdapter<EatWellMenuBean> {


    Context cxt;
    int res;
    ArrayList<EatWellMenuBean> personList;



    public EatWellMenuAdapter(Context context, int resource, ArrayList<EatWellMenuBean> objects) {
        super(context, resource, objects);
        cxt = context;
        res = resource;
        personList = objects;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem;

        listItem = LayoutInflater.from(cxt).inflate(res, parent, false);
        TextView txtName = (TextView) listItem.findViewById(R.id.textView100axe);
        EatWellMenuBean eatWellMenuBean = personList.get(position);

        txtName.setText(eatWellMenuBean.getName());





        return listItem;

    }
}
