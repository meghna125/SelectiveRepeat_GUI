package com.meghna125.selectiverepeat;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // sheetal chnages
    private int  flag = 0;

    //

    Button p1;
    Button p2;
    Button p3;
    Button p4;
    Button p5;
    Button p6;
    Button a1;
    Button a2;
    Button a3;
    Button a4;
    Button a5;
    Button a6;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    boolean stop1;
    boolean stop2;
    boolean stop3;
    boolean stop4;
    boolean stop5;
    boolean stop6;

    int windowSize=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1= (Button)findViewById(R.id.p1);
        p2= (Button)findViewById(R.id.p2);
        p3= (Button)findViewById(R.id.p3);
        p4= (Button)findViewById(R.id.p4);
        p5= (Button)findViewById(R.id.p5);
        p6= (Button)findViewById(R.id.p6);
        a1= (Button)findViewById(R.id.a1);
        a2= (Button)findViewById(R.id.a2);
        a3= (Button)findViewById(R.id.a3);
        a4= (Button)findViewById(R.id.a4);
        a5= (Button)findViewById(R.id.a5);
        a6= (Button)findViewById(R.id.a6);
        t1=(TextView)findViewById(R.id.t1);
        t2=(TextView)findViewById(R.id.t2);
        t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4);
        t5=(TextView)findViewById(R.id.t5);
        t6=(TextView)findViewById(R.id.t6);

        p1.setBackgroundColor(Color.CYAN);
        p2.setBackgroundColor(Color.CYAN);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stop1=false;
                timer1();
                Toast.makeText(getApplicationContext(),"Packet 1 sent! 20s Timer starts..",Toast.LENGTH_SHORT).show();
                p1.animate().translationYBy(1150f).setDuration(5000);

          //      t1.setText("heelo heelo ");

                if(t1.getText().toString().equals("15s")){
                    a1.setBackgroundColor(Color.RED);
                }
            }
        });


        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                flag=1;

                stop1=true;
                t1.setText("20s");

                if(flag == 1){
                    p1.setBackgroundColor(Color.YELLOW);
                    p2.setBackgroundColor(Color.CYAN);
                    p3.setBackgroundColor(Color.CYAN);

                }
                p1.animate().translationYBy(-1150f);

             //   p1.setBackgroundColor(Color.YELLOW);
               // p3.setBackgroundColor(Color.CYAN);
              //  p2.setBackgroundColor(Color.CYAN));
                Toast.makeText(getApplicationContext(),"Acknowledgment of packet 1 received!!",Toast.LENGTH_SHORT).show();
                //p3.setBackgroundColor(Color.RED);
            }
        });

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stop2=false;
                timer2();
                Toast.makeText(getApplicationContext(),"Packet 2 sent! 20s Timer starts..",Toast.LENGTH_SHORT).show();
                p2.animate().translationYBy(1150f).setDuration(5000);

                a2.setBackgroundColor(Color.RED);

            }
        });

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(flag ==1){
                    flag = 2;
                    if(flag == 2){
                        p2.setBackgroundColor(Color.YELLOW);
                        p3.setBackgroundColor(Color.CYAN);
                        p4.setBackgroundColor(Color.CYAN);
                    }
                }

                stop2=true;
                t2.setText("20s");
                p2.animate().translationYBy(-1150f);

                p2.setBackgroundColor(Color.YELLOW);
                p3.setBackgroundColor(Color.CYAN);
                p1.setBackgroundColor(Color.CYAN);
                Toast.makeText(getApplicationContext(),"Acknowledgment of packet 2 received!!",Toast.LENGTH_SHORT).show();
               //p4.setBackgroundColor(Color.RED);
            }
        });



        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                stop3=false;
                timer3();
                Toast.makeText(getApplicationContext(),"Packet 3 sent! 20s Timer starts..",Toast.LENGTH_SHORT).show();
                p3.animate().translationYBy(1150f).setDuration(5000);

                a3.setBackgroundColor(Color.RED);
            }
        });

        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                stop3=true;
                t3.setText("20s");
                p3.animate().translationYBy(-1150f);

                p3.setBackgroundColor(Color.YELLOW);
                Toast.makeText(getApplicationContext(),"Acknowledgment of packet 3 received!!",Toast.LENGTH_SHORT).show();
                //p5.setBackgroundColor(Color.RED);
            }
        });
        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stop4=false;
                timer4();
                Toast.makeText(getApplicationContext(),"Packet 4 sent! 20s Timer starts..",Toast.LENGTH_SHORT).show();
                p4.animate().translationYBy(1150f).setDuration(5000);

                a4.setBackgroundColor(Color.RED);

            }
        });

        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                stop4=true;
                t4.setText("20s");
                p4.animate().translationYBy(-1150f);

                p4.setBackgroundColor(Color.YELLOW);
                Toast.makeText(getApplicationContext(),"Acknowledgment of packet 4 received!!",Toast.LENGTH_SHORT).show();
                //p6.setBackgroundColor(Color.RED);
            }
        });


        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stop5=false;
                timer5();
                Toast.makeText(getApplicationContext(),"Packet 5 sent! 20s Timer starts..",Toast.LENGTH_SHORT).show();
                p5.animate().translationYBy(1150f).setDuration(5000);

                a5.setBackgroundColor(Color.RED);

            }
        });

        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stop5=true;
                t5.setText("20s");
                p5.animate().translationYBy(-1150f);

                p5.setBackgroundColor(Color.YELLOW);
                Toast.makeText(getApplicationContext(),"Acknowledgment of packet 5 received!!",Toast.LENGTH_SHORT).show();
            }
        });
        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stop6=false;
                timer6();
                Toast.makeText(getApplicationContext(),"Packet 6 sent! 20s Timer starts..",Toast.LENGTH_SHORT).show();
                p6.animate().translationYBy(1150f).setDuration(5000);

                a6.setBackgroundColor(Color.RED);

            }
        });

        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stop6=true;
                t6.setText("20s");
                p6.animate().translationYBy(-1150f);

                p6.setBackgroundColor(Color.YELLOW);
                Toast.makeText(getApplicationContext(),"Acknowledgment of packet 6 received!!",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void timer1(){
        new CountDownTimer(20100, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(stop1){
                    cancel();
                }
                else {
                    t1.setText(String.valueOf(millisUntilFinished/1000)+ "s");
                    if(t1.getText().toString().equals("15s")){
                        a1.setBackgroundColor(Color.RED);
                    }
                }
            }
            @Override
            public void onFinish() {

                t1.setText("0s");
                Toast.makeText(getApplicationContext(),"Packet 1 is lost...",Toast.LENGTH_SHORT).show();

                a1.setBackgroundColor(Color.GRAY);
                p1.animate().translationYBy(-1150f);

                Toast.makeText(getApplicationContext(),"Sending negative ack for Packet 1 ",Toast.LENGTH_LONG).show();
                p1.setBackgroundColor(Color.BLACK);
                t1.setText("20s");
            }
        }.start();
    }
    public void timer2(){
        new CountDownTimer(20100, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(stop2){
                    cancel();
                }
                else {
                    t2.setText(String.valueOf(millisUntilFinished/1000)+ "s");
                }
            }
            @Override
            public void onFinish() {

                t2.setText("0s");
                Toast.makeText(getApplicationContext(),"Packet 2 is lost...",Toast.LENGTH_SHORT).show();

                a2.setBackgroundColor(Color.GRAY);
                p2.animate().translationYBy(-1150f);

                Toast.makeText(getApplicationContext(),"Sending negative ack for Packet 2 ",Toast.LENGTH_LONG).show();
                p2.setBackgroundColor(Color.BLACK);
                t2.setText("20s");
            }
        }.start();
    }
    public void timer3(){
        new CountDownTimer(20100, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(stop3){
                    cancel();
                }
                else {
                    t3.setText(String.valueOf(millisUntilFinished/1000)+ "s");
                }
            }
            @Override
            public void onFinish() {

                t3.setText("0s");
                Toast.makeText(getApplicationContext(),"Packet 3 is lost...",Toast.LENGTH_SHORT).show();

                a3.setBackgroundColor(Color.GRAY);
                p3.animate().translationYBy(-1150f);

                Toast.makeText(getApplicationContext(),"Sending negative ack for Packet 3 ",Toast.LENGTH_LONG).show();
                p3.setBackgroundColor(Color.BLACK);
                t3.setText("20s");
            }
        }.start();
    }
    public void timer4(){
        new CountDownTimer(20100, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(stop4){
                    cancel();
                }
                else {
                    t4.setText(String.valueOf(millisUntilFinished/1000)+ "s");
                }
            }
            @Override
            public void onFinish() {

                t4.setText("0s");
                Toast.makeText(getApplicationContext(),"Packet 4 is lost...",Toast.LENGTH_SHORT).show();

                a4.setBackgroundColor(Color.GRAY);
                p4.animate().translationYBy(-1150f);

                Toast.makeText(getApplicationContext(),"Sending negative ack for Packet 4 ",Toast.LENGTH_LONG).show();
                p4.setBackgroundColor(Color.BLACK);
                t4.setText("20s");
            }
        }.start();
    }
    public void timer5(){
        new CountDownTimer(20100, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(stop5){
                    cancel();
                }
                else {
                    t5.setText(String.valueOf(millisUntilFinished/1000)+ "s");
                }
            }
            @Override
            public void onFinish() {

                t5.setText("0s");
                Toast.makeText(getApplicationContext(),"Packet 5 is lost...",Toast.LENGTH_SHORT).show();

                a5.setBackgroundColor(Color.GRAY);
                p5.animate().translationYBy(-1150f);

                Toast.makeText(getApplicationContext(),"Sending negative ack for Packet 5 ",Toast.LENGTH_LONG).show();
                p5.setBackgroundColor(Color.BLACK);
                t5.setText("20s");
            }
        }.start();
    }
    public void timer6(){
        new CountDownTimer(20100, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                if(stop6){
                    cancel();
                }
                else {
                    t6.setText(String.valueOf(millisUntilFinished/1000)+ "s");
                }
            }
            @Override
            public void onFinish() {

                t6.setText("0s");
                Toast.makeText(getApplicationContext(),"Packet 6 is lost...",Toast.LENGTH_SHORT).show();

                a6.setBackgroundColor(Color.GRAY);
                p6.animate().translationYBy(-1150f);

                Toast.makeText(getApplicationContext(),"Sending negative ack for Packet 6 ",Toast.LENGTH_LONG).show();
                p6.setBackgroundColor(Color.BLACK);
                t6.setText("20s");
            }
        }.start();
    }




}
