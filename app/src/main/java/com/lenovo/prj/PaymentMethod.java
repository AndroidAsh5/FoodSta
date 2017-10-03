package com.lenovo.prj;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PaymentMethod extends AppCompatActivity implements View.OnClickListener {

    Button button;
    NotificationCompat.Builder notification;
    private static final int uniqueID=11;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
        notification=new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
        button=(Button)findViewById(R.id.button4);
        button.setOnClickListener(this);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.myanim);
        button.startAnimation(animation);

        radioGroup=(RadioGroup)findViewById(R.id.radiopgroup1);
    }

    public void onBackPressed(){
        createDialog();

    }

    private void createDialog() {

        AlertDialog.Builder alertDlg=new AlertDialog.Builder(this);
        alertDlg.setMessage("Are you sure you want to quit?");
        alertDlg.setCancelable(true);
        alertDlg.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                PaymentMethod.super.onBackPressed();


            }
        });

        alertDlg.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDlg.create().show();


    }


//    @Override
//    public void onClick(View v) {
//
//        Toast.makeText(this,"Your Order has been booked.Thanks for using our app!",Toast.LENGTH_LONG).show();
//    }

//    public void notification(View view) {
//
//        notification.setSmallIcon(R.drawable.test);
//        notification.setTicker("Thank you for booking your order with us");
//        notification.setWhen(System.currentTimeMillis());
//        notification.setContentTitle("FoodSta");
//        notification.setContentText("Your Order is on the way!....");
//        Intent intent=new Intent(this,PaymentMethod.class);
//        PendingIntent p=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
//        notification.setContentIntent(p);
//        notification.setDefaults(NotificationCompat.DEFAULT_SOUND);
//
//        NotificationManager nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
//        nm.notify(uniqueID,notification.build());
//
//
//
//    }

    @Override
    public void onClick(View v) {

        int selectid = radioGroup.getCheckedRadioButtonId();
        if (selectid == -1) {
            Toast.makeText(this, "Please select Cash Payment option", Toast.LENGTH_LONG).show();
        } else {

            if (selectid==R.id.radioButton6) {


                // public void notification(View view) {

                notification.setSmallIcon(R.drawable.test);
                notification.setTicker("Thank you for booking your order with us");
                notification.setWhen(System.currentTimeMillis());
                notification.setContentTitle("FoodSta");
                notification.setContentText("Your Order is on the way!....");
                Intent intent = new Intent(this, PaymentMethod.class);
                PendingIntent p = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
                notification.setContentIntent(p);
                notification.setDefaults(NotificationCompat.DEFAULT_SOUND);

                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nm.notify(uniqueID, notification.build());


            }
            if (selectid==R.id.radioButton3){
                Toast.makeText(this,"This option is not available yet",Toast.LENGTH_SHORT).show();
            }
            if (selectid==R.id.radioButton4){
                Toast.makeText(this,"This option is not available yet",Toast.LENGTH_SHORT).show();
            }
            if (selectid==R.id.radioButton5){
                Toast.makeText(this,"This option is not available yet",Toast.LENGTH_SHORT).show();
            }


        }


    }}

