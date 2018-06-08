package com.example.dell.getbetter;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView txt1;
TextView txt2;
TextView txt3,points, score;
Button img1,img2, img3, img4, start;
public int a,b,c,btn_num,success = 0,attempts = 0;
Random rand1,rand2,rand3,rand4;

    public void click(View view) {
int id1 = img1.getId();
int id2 = img2.getId();
int id3 = img3.getId();
int id4 = img4.getId();
if (btn_num == 1){
    if(view.getId() == img1.getId())
        success++;
}
        if (btn_num == 2){
            if(view.getId() == img2.getId())
                success++;
        }
        if (btn_num == 3){
            if(view.getId() == img3.getId())
                success++;
        }
        if (btn_num == 4){
            if(view.getId() == img4.getId())
                success++;
        }
        attempts++;
        points.setText(Integer.toString(success)+ "/" + Integer.toString(attempts));
niw();



    /*
    int i = (Integer)view.getId();
if (id1 == i){
img1.setText("i am clicked");
}else if (id2 == i){
    img2.setText("i am clicked");

}else if (id3 == i){
    img3.setText("i am clicked");
}else if (id4 == i){
    img4.setText("i am clicked");

}*/



    }
    public void niw() {

        Random rand1 = new Random();
        Random rand2 = new Random();

        a = rand1.nextInt(30) + 1;
        b = rand2.nextInt(30) + 1;
c = a + b;
        txt1.setText(Integer.toString(a));
        txt2.setText(Integer.toString(b));

        rand3 = new Random();
         btn_num = rand3.nextInt(4) + 1;

        rand4 = new Random();
        int rand = rand4.nextInt(60) + 1;
        rand4 = new Random();
        int othnum1 = rand4.nextInt(60) + 1;
        rand4 = new Random();
        int othnum2 = rand4.nextInt(60) + 1;
        if(btn_num == 1) {
            img1.setText(Integer.toString(c));
            img2.setText(Integer.toString(rand));
            img3.setText(Integer.toString(othnum1));
            img4.setText(Integer.toString(othnum2));
        }
        if(btn_num == 2) {
            img2.setText(Integer.toString(c));
            img1.setText(Integer.toString(rand));
            img3.setText(Integer.toString(othnum1));
            img4.setText(Integer.toString(othnum2));
        }
        if(btn_num == 3) {
            img3.setText(Integer.toString(c));
            img2.setText(Integer.toString(rand));
            img1.setText(Integer.toString(othnum1));
            img4.setText(Integer.toString(othnum2));
        }
        if(btn_num == 4) {
            img4.setText(Integer.toString(c));
            img2.setText(Integer.toString(rand));
            img3.setText(Integer.toString(othnum1));
            img1.setText(Integer.toString(othnum2));
        }
            /*   c = a + b;
        txt3.setText(Integer.toString(c));  */
    }

    public void timer(){

        new CountDownTimer(10000 + 200, 1000){

            @Override
            public void onTick(long l) {
        display((int)l/1000);
            }

            @Override
            public void onFinish() {
                txt3.setText("0");
                img1.setEnabled(false);
                img2.setEnabled(false);
                img3.setEnabled(false);
                img4.setEnabled(false);
                score.setVisibility(View.VISIBLE);
                score.setText("your score : " + Integer.toString(success));
                start.setEnabled(true);
            }
        }.start();

    }
    public void display(int timeleft){

        txt3.setText(Integer.toString(timeleft));
    }

    public void neew(View view) {

    img1.setEnabled(true);
        img2.setEnabled(true);
        img3.setEnabled(true);
        img4.setEnabled(true);

    }


    public void start(View view) {
        img1.setEnabled(true);
        img2.setEnabled(true);
        img3.setEnabled(true);
        img4.setEnabled(true);
        start.setEnabled(false);
attempts = 0;
success = 0;
        niw();
        timer();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    txt1 = (TextView)findViewById(R.id.adder);
    txt2 = (TextView)findViewById(R.id.addend);
    txt3 = (TextView)findViewById(R.id.answer);
    score  = (TextView)findViewById(R.id.score);
        img1 = (Button)findViewById(R.id.i1);
        img2 = (Button)findViewById(R.id.i2);
        img3 = (Button)findViewById(R.id.i3);
        img4 = (Button)findViewById(R.id.i4);
        start = (Button)findViewById(R.id.shownew);
points = (TextView)findViewById(R.id.points);
points.setText("0");
txt1.setText(Integer.toString(0));
        txt2.setText(Integer.toString(0));
    score.setVisibility(View.INVISIBLE);
img1.setText("0");
        img2.setText("0");
        img3.setText("0");
        img4.setText("0");
        //numbersettin();
    }



}
