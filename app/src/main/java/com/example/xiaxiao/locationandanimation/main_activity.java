package com.example.xiaxiao.locationandanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class main_activity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1, tv2;
    Button btn1, btn2;
    ImageView img1, img2;

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

                break;
            case R.id.btn2:

                break;
            case R.id.img1:

                break;
            case R.id.img2:

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
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
    }


}
