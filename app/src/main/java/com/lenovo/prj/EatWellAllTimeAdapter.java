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
public class EatWellAllTimeAdapter extends ArrayAdapter<EatWellAllTimeBean> {

    Context cxt;
    int res;
    ArrayList<EatWellAllTimeBean> eatWellAllTimeBeans;


    public EatWellAllTimeAdapter(Context context, int resource, List<EatWellAllTimeBean> objects) {
        super(context, resource, objects);
        cxt=context;
        res=resource;
        eatWellAllTimeBeans= (ArrayList<EatWellAllTimeBean>) objects;
    }
    int pos;
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItem;
        pos=position;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        final Button button=(Button)listItem.findViewById(R.id.button3366e);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EatWellAllTimeBean hb161=eatWellAllTimeBeans.get(position);
                EatWellUtil.eatWellAllTimeBeans.add(hb161);
                button.setText("ADDED");

            }
        });

        TextView txtname1 =(TextView)listItem.findViewById(R.id.textView12266e);
        TextView txtr1=(TextView)listItem.findViewById(R.id.textView19966e);
        TextView txtprice1 =(TextView)listItem.findViewById(R.id.textView11166e);
        EatWellAllTimeBean hb6e = eatWellAllTimeBeans.get(position);

        txtname1.setText(hb6e.getName());
        txtr1.setText(hb6e.getR1());

        txtprice1.setText(String.valueOf(hb6e.getPrice()));






        return listItem;
    }



}

