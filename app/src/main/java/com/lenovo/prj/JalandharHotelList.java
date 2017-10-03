package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class JalandharHotelList extends AppCompatActivity implements AdapterView.OnItemClickListener   {

    ListView listView;
    ArrayList<LudhianaHotelListBean> foodList;
    LudhianaHotelListAdapter adapter;
    LudhianaHotelListBean food;
    int pos;
    void initViews(){
        listView = (ListView)findViewById(R.id.fooditemlistView);
        foodList= new ArrayList<>();


        foodList.add(new LudhianaHotelListBean(R.drawable.sous,"SOUS","Biryani,Chinese,Fast Food"));
        foodList.add(new LudhianaHotelListBean(R.drawable.eat,"EAT WELL HOUSE","South Indian"));
        //foodList.add(new LudhianaHotelListBean(R.drawable.ccc,"uui","Italian,Pizza,Snacks"));
        //foodList.add(new LudhianaHotelListBean(R.drawable.zzz,"SINGH-O-SINGH","Biryani,Kebab,North Indian,Wraps"));
//        foodList.add(new LudhianaHotelListBean(R.drawable.qqqq,"BOOSTER JUICE"));
//      foodList.add(new LudhianaHotelListBean(R.drawable.aa,"HAVELI"));
//       foodList.add(new LudhianaHotelListBean(R.drawable.kkk,""));
//     foodList.add(new LudhianaHotelListBean(R.drawable.dd,""));

        adapter = new LudhianaHotelListAdapter(this,R.layout.listviewitem,foodList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener( this);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jalandhar_hotel_list);
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        LudhianaHotelListBean ludhianaHotelListBean =foodList.get(position);
        switch (position){
            //case 0:
            // Intent a1=new Intent(LudhianaHotelList.this,Tab.class);
            //startActivity(a1);
            //break;
            case 0:
                Intent a2=new Intent(this,SousMenu.class);
                startActivity(a2);
                break;


        case 1:
                Intent a3=new Intent(this,EatWellMenu.class);
                startActivity(a3);
//                break;
//            case 2:
//                Intent a4=new Intent(this,SinghMenu.class);
//
//                startActivity(a4);
//                break;
//            // case 3:
            //    Intent a41=new Intent(this,SinghMenu.class);

//                startActivity(a41);
            //              break;


        }

}}
