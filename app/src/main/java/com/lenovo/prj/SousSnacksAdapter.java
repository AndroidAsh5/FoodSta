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
 * Created by lenovo on 8/20/2016.
 */
public class SousSnacksAdapter extends ArrayAdapter<SousSnacksBean>{

    Context cxt;
    int res;
    ArrayList<SousSnacksBean> sousSnacksBeans;



    public SousSnacksAdapter(Context context, int resource, List<SousSnacksBean> objects) {
        super(context, resource, objects);

        cxt=context;
        res=resource;
        sousSnacksBeans= (ArrayList<SousSnacksBean>) objects;
    }
    int pos;

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItem;
        pos=position;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        final Button button=(Button)listItem.findViewById(R.id.button3366);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SousSnacksBean hb16=sousSnacksBeans.get(position);
                SousUtil.sousSnacksBeans.add(hb16);
                button.setText("ADDED");

            }
        });

        TextView txtname1 =(TextView)listItem.findViewById(R.id.textView12266);
        TextView txtr1=(TextView)listItem.findViewById(R.id.textView19966);
        TextView txtprice1 =(TextView)listItem.findViewById(R.id.textView11166);
        SousSnacksBean hb6 = sousSnacksBeans.get(position);

        txtname1.setText(hb6.getName());
        txtr1.setText(hb6.getR1());

        txtprice1.setText(String.valueOf(hb6.getPrice()));






        return listItem;
    }


}

