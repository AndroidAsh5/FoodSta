package com.lenovo.prj;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 8/5/2016.
 */
public class YelloChilliStartersAdapter extends ArrayAdapter<YelloChilliStartersBean>
{

    Context cxt;
    int res;
    ArrayList<YelloChilliStartersBean> yelloChilliStartersBeans;


    public YelloChilliStartersAdapter(Context context, int resource, List<YelloChilliStartersBean> objects) {
        super(context, resource, objects);
    cxt=context;
        res=resource;
        yelloChilliStartersBeans =(ArrayList<YelloChilliStartersBean>) objects;

    }
    int pos;

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItem;
        pos=position;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        final Button button=(Button)listItem.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                YelloChilliStartersBean hb= yelloChilliStartersBeans.get(position);
                YelloChilliUtil.yelloChilliStartersBeans.add(hb);
                button.setText("ADDED");



            }
        });

        TextView txtname =(TextView)listItem.findViewById(R.id.textView12);
        TextView txtr=(TextView)listItem.findViewById(R.id.textView19);
        TextView txtprice =(TextView)listItem.findViewById(R.id.textView11);
        YelloChilliStartersBean hb = yelloChilliStartersBeans.get(position);

        txtname.setText(hb.getName());
        txtr.setText(hb.getR1());

        txtprice.setText(String.valueOf(hb.getPrice()));


        return listItem;
    }
}
