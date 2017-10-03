package com.lenovo.prj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DeliveryType extends AppCompatActivity implements View.OnClickListener{

    Button button;
    RadioGroup radioGroup,radioGroup2;
    RadioButton items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_type);
      radioGroup=(RadioGroup)findViewById(R.id.radiopgroup);





        button=(Button)findViewById(R.id.button3);
        button.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {



int selectid=radioGroup.getCheckedRadioButtonId();
      if(selectid==-1) {
          Toast.makeText(this,"Please select one option",Toast.LENGTH_LONG).show();
      }

      //  items=(RadioButton)findViewById(selectid);
else {
        Intent i=new Intent(this,ButtonNext.class);
         startActivity(i);






       // if (R.id.radioButton){



    }}}

