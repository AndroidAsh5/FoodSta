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
 * Created by lenovo on 8/13/2016.
 */
public class SinghPopularProductsAdapter extends ArrayAdapter<SinghPopularProductsBean>{

    Context cxt;
    int res;
    ArrayList<SinghPopularProductsBean> singhPopularProductsBeans;


    public SinghPopularProductsAdapter(Context context, int resource, List<SinghPopularProductsBean> objects) {
        super(context, resource, objects);

        cxt=context;
        res=resource;
        singhPopularProductsBeans= (ArrayList<SinghPopularProductsBean>) objects;
    }
    int pos;
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItem;
        pos=position;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        final Button button=(Button)listItem.findViewById(R.id.button33a);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SinghPopularProductsBean hb1a=singhPopularProductsBeans.get(position);
                SinghUtil.singhPopularProductsBeans.add(hb1a);
                button.setText("ADDED");

            }
        });

        TextView txtname1a =(TextView)listItem.findViewById(R.id.textView122a);
        TextView txtr1a=(TextView)listItem.findViewById(R.id.textView199a);
        TextView txtprice1a =(TextView)listItem.findViewById(R.id.textView111a);
        SinghPopularProductsBean hba = singhPopularProductsBeans.get(position);

        txtname1a.setText(hba.getName());
        txtr1a.setText(hba.getR1());

        txtprice1a.setText(String.valueOf(hba.getPrice()));






        return listItem;
    }


    }

