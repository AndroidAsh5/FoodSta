package com.lenovo.prj;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class showCart extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemClickListener{

    ListView listView;

    ArrayList<ShowCartBean> showCartBeans;
    ShowCartBean showCartBean;




    TextView textView;
    TextView result;
    Button button;
    int pos;


    int i;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cart);
        listView=(ListView)findViewById(R.id.qw);
        button=(Button)findViewById(R.id.buttonAdd);
        button.setOnClickListener(this);

        ArrayAdapter<YelloChilliStartersBean> adapter=new ArrayAdapter<YelloChilliStartersBean>(this,R.layout.shoow, YelloChilliUtil.yelloChilliStartersBeans);
        listView.setAdapter(adapter);
        textView=(TextView)findViewById(R.id.textView13);

        result = (TextView)findViewById(R.id.textView15);

        int sum=0;
        for(i=0;i< YelloChilliUtil.yelloChilliStartersBeans.size();i++){
            sum = sum+ YelloChilliUtil.yelloChilliStartersBeans.get(i).getPrice();

        }
        result.setText("Rs."+sum +"/-");






    }

    void showOptions(){
String[] items={"Delete"};
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){

                    case 0:
                        //deleteProduct();
                }
            }
        });
        builder.create().show();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.buttonAdd){
            Intent i=new Intent(this,DeliveryType.class);
            startActivity(i);

        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        pos=position;

        showCartBean=showCartBeans.get(position);
        showOptions();

    }
}
