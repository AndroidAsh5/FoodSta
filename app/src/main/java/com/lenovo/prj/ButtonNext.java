package com.lenovo.prj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ButtonNext extends AppCompatActivity implements View.OnClickListener{

    Button button;

    EditText e1,e2,e3;
    String str1,str2,str3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_next);

        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText3);
        e3=(EditText)findViewById(R.id.editText6);
        button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(this);
     }

    boolean validateFields(){

        boolean check=true;
        if (str1.isEmpty()) {

            e1.setError("This Field is Mandatory!");
            check = false;
        }
            if (str2.isEmpty()){

                e2.setError("This Field is Mandatory!");
                check=false;

            }if (str3.isEmpty()) {

            e3.setError("Please Enter Mobile Number");
            check = false;
        }else {
            if (str3.length()!=10){
                e3.setError("Please Enter Valid Number");
                check=false;
            }
        }





            return check;

    }

    @Override
    public void onClick(View v) {

        str1=e1.getText().toString().trim();
        str2=e2.getText().toString().trim();
       str3=e3.getText().toString().trim();
        e1.setText("");
        e2.setText("");
e3.setText("");
        if (validateFields()){

        Intent i=new Intent(this,PaymentMethod.class);
       startActivity(i);

    }}}
