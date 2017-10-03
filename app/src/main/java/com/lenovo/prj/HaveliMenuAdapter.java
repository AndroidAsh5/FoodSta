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
public class HaveliMenuAdapter extends ArrayAdapter<HaveliMenuBean>{
    Context cxt;
    int res;
    ArrayList<HaveliMenuBean> personList;


    public HaveliMenuAdapter(Context context, int resource, ArrayList<HaveliMenuBean> objects) {
        super(context, resource, objects);

        cxt = context;
        res = resource;
        personList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem;

        listItem = LayoutInflater.from(cxt).inflate(res, parent, false);
        TextView txtName = (TextView) listItem.findViewById(R.id.textView1000);
        HaveliMenuBean haveliMenuBean = personList.get(position);

        txtName.setText(haveliMenuBean.getName());





        return listItem;

    }
}
