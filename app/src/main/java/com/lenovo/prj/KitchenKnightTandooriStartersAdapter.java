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
 * Created by lenovo on 8/14/2016.
 */
public class KitchenKnightTandooriStartersAdapter extends ArrayAdapter<KitchenKnightTandooriStartersBean> {


    Context cxt;
    int res;
    ArrayList<KitchenKnightTandooriStartersBean> kitchenKnightTandooriStartersBeans;

    public KitchenKnightTandooriStartersAdapter(Context context, int resource, List<KitchenKnightTandooriStartersBean> objects) {
        super(context, resource, objects);

        cxt=context;
        res=resource;
        kitchenKnightTandooriStartersBeans= (ArrayList<KitchenKnightTandooriStartersBean>) objects;

    }

    int pos;



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItem;
        pos=position;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        final Button button=(Button)listItem.findViewById(R.id.button33m);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KitchenKnightTandooriStartersBean hb1=kitchenKnightTandooriStartersBeans.get(position);
                KitchenKnightUtil.kitchenKnightTandooriStartersBeans.add(hb1);
                button.setText("ADDED");

            }
        });

        TextView txtname1 =(TextView)listItem.findViewById(R.id.textView122m);
        TextView txtr1=(TextView)listItem.findViewById(R.id.textView199m);
        TextView txtprice1 =(TextView)listItem.findViewById(R.id.textView111m);
        KitchenKnightTandooriStartersBean hb = kitchenKnightTandooriStartersBeans.get(position);

        txtname1.setText(hb.getName());
        txtr1.setText(hb.getR1());

        txtprice1.setText(String.valueOf(hb.getPrice()));






        return listItem;
    }
}
