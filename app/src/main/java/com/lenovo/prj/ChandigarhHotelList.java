package com.lenovo.prj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ChandigarhHotelList extends AppCompatActivity implements AdapterView.OnItemClickListener  {

    ListView listView;
    ArrayList<LudhianaHotelListBean> foodList;
    LudhianaHotelListAdapter adapter;
    LudhianaHotelListBean food;
    int pos;
    void initViews(){
        listView = (ListView)findViewById(R.id.fooditemlistView);
        foodList= new ArrayList<>();


        foodList.add(new LudhianaHotelListBean(R.drawable.kitchenknight,"THE KITCHEN KNIGHT","North Indian,Pan-Asian"));
        foodList.add(new LudhianaHotelListBean(R.drawable.hotnfrsh,"HOT N FRESH","Biryani,Chinese,Mexican,Italian"));
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
        setContentView(R.layout.activity_chandigarh_hotel_list);
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
                Intent a2=new Intent(this,KitchenKnightMenu.class);
                startActivity(a2);
                break;


//            case 1:
//                Intent a3=new Intent(this,YellowChilliMenu.class);
//                startActivity(a3);
//                break;
           case 1:
                Intent a4=new Intent(this,SinghMenu.class);

               startActivity(a4);
                break;
           // case 3:
            //    Intent a41=new Intent(this,SinghMenu.class);

//                startActivity(a41);
  //              break;


        }

    }

//    void showOptions(){
//        String[] items ={"About Us","Menu"};
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setItems(items, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                switch(i){
//                    case 0:
//
//                        break;
//
//                    case 1:
////                        Intent i1=new Intent(LudhianaHotelList.this,Tab.class);
////                        startActivity(i1);
//                        Intent i2=new Intent(LudhianaHotelList.this,YellowChilliMenu.class);
//                        startActivity(i2);
//
//
//                        break;
//
//                    case 2:
//
//
//                        break;
//                }
//
//            }
//        });
//        builder.create().show();
//
//    }
//
//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//        pos = position;
//
//        food = foodList.get(position);
//        showOptions();
//
//
//    }
}
