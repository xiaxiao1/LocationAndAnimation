package com.example.xiaxiao.locationandanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class main_activity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1, tv2;
    Button btn1, btn2;
    ImageView img1, img2;
    private Button rotateButton = null;
    private Button scaleButton = null;
    private Button alphaButton = null;
    private Button translateButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiaxiao);
        initViews();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.tv1:

                break;
            case R.id.tv2:

                break;
            case R.id.btn1:
                img1.setVisibility(View.INVISIBLE);
                showAnimation(R.anim.double_ani,img1);
                break;
            case R.id.btn2:

                break;
            case R.id.img1:

                break;
            case R.id.img2:

                break;
            case R.id.alphaButton:
                showAnimation(R.anim.alpha,btn1);
                break;
            case R.id.rotateButton:
                showAnimation(R.anim.rotate,rotateButton);
                break;
            case R.id.scaleButton:
                showAnimation(R.anim.scale,scaleButton);
                break;
            case R.id.translateButton:
                showAnimation(R.anim.translate,translateButton);
                break;
            default:
                break;
        }
    }

    public void initViews() {
        tv1 = (TextView) findViewById(R.id.tv1);
        btn1 = (Button) findViewById(R.id.btn1);
        img1 = (ImageView) findViewById(R.id.img1);

        tv2 = (TextView) findViewById(R.id.tv2);
        btn2 = (Button) findViewById(R.id.btn2);
        img2 = (ImageView) findViewById(R.id.img2);

        rotateButton = (Button) findViewById(R.id.rotateButton);
        scaleButton = (Button) findViewById(R.id.scaleButton);
        alphaButton = (Button) findViewById(R.id.alphaButton);
        translateButton = (Button) findViewById(R.id.translateButton);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        rotateButton.setOnClickListener(this);
        scaleButton.setOnClickListener(this);
        alphaButton.setOnClickListener(this);
        translateButton.setOnClickListener(this);
    }


    public void showAnimation(int animationId,View view) {
        Animation animation = AnimationUtils.loadAnimation(this,animationId );
        view.startAnimation(animation);
    }
}
