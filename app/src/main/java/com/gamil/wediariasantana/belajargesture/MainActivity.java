package com.gamil.wediariasantana.belajargesture;

import android.graphics.Color;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{
    private TextView gestureText;
    private GestureDetectorCompat gDetector;
    RelativeLayout ly;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gestureText =(TextView)findViewById(R.id.gestureStatusText);
        ly=(RelativeLayout)findViewById(R.id.activity_main);
        this.gDetector = new GestureDetectorCompat(this, this);
        gDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        gestureText.setText("onSinggleTap");
        ly.setBackgroundColor(Color.BLUE);
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gestureText.setText("onDoubleTap");
        ly.setBackgroundColor(Color.RED);
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        gestureText.setText("onDoubleTapEvent");
        ly.setBackgroundColor(Color.GREEN);
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        gestureText.setText("onDown");
        ly.setBackgroundColor(Color.GRAY);
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gestureText.setText("onSwhwPress");
        ly.setBackgroundColor(Color.YELLOW);

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        gestureText.setText("onSinggleTapUp");
        ly.setBackgroundColor(Color.DKGRAY);
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        gestureText.setText("onDScroll");
        ly.setBackgroundColor(Color.WHITE);
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        gestureText.setText("onShowPress");
        ly.setBackgroundColor(Color.BLACK);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        gestureText.setText("onFling");
        ly.setBackgroundColor(Color.BLUE);
        return true;
    }
    @Override
    public boolean
    onTouchEvent(MotionEvent event) {this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
