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
public class HaveliIndianCourseAdapter extends ArrayAdapter<HaveliIndianCourseBean>{
    Context cxt;
    int res;
    ArrayList<HaveliIndianCourseBean> haveliIndianCourseBeans;

    public HaveliIndianCourseAdapter(Context context, int resource, List<HaveliIndianCourseBean> objects) {
        super(context, resource, objects);
        cxt=context;
        res=resource;
        haveliIndianCourseBeans= (ArrayList<HaveliIndianCourseBean>) objects;
    }
    int pos;
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItem;
        pos=position;
        listItem= LayoutInflater.from(cxt).inflate(res,parent,false);
        final Button button=(Button)listItem.findViewById(R.id.button330);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HaveliIndianCourseBean hb10=haveliIndianCourseBeans.get(position);
                HaveliUtil.haveliIndianCourseBeans.add(hb10);
                button.setText("ADDED");

            }
        });

        TextView txtname10 =(TextView)listItem.findViewById(R.id.textView1220);
        TextView txtr10=(TextView)listItem.findViewById(R.id.textView1990);
        TextView txtprice10 =(TextView)listItem.findViewById(R.id.textView1110);
        HaveliIndianCourseBean hbq = haveliIndianCourseBeans.get(position);

        txtname10.setText(hbq.getName());
        txtr10.setText(hbq.getR1());

        txtprice10.setText(String.valueOf(hbq.getPrice()));






        return listItem;
    }


}
