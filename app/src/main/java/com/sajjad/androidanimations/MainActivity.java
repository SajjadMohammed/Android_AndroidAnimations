package com.sajjad.androidanimations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Toolbar mainToolbar ;
    private TextView item;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }
    private void initViews() {
        mainToolbar=findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);
        item=findViewById(R.id.item);
    }

    void animateItem(int animationId,View view){
        animation= AnimationUtils.loadAnimation(this,animationId);
        view.startAnimation(animation);
    }

    public void doAlpha(View view) {
        animateItem(R.anim.alpha_animation, item);
    }

    public void rotateItem(View view) {
        animateItem(R.anim.rotate_animation, item);

    }

    public void scaleDownItem(View view) {
        animateItem(R.anim.scale, item);

    }

    public void scaleUpItem(View view) {
        animateItem(R.anim.scale_up, item);
    }
//
    public void scaleRightItem(View view) {
        animateItem(R.anim.scale_right, item);
    }
//
    public void scaleLeftItem(View view) {
        animateItem(R.anim.scale_left, item);
    }
//
//    public void translateFromDown(View view) {
//        animateItem(R.anim.translate_from_down, item);
//    }
//
//    public void translateFromUp(View view) {
//        animateItem(R.anim.translate_from_up, item);
//    }
//
//    public void translateFromRight(View view) {
//        animateItem(R.anim.translate_from_right, item);
//    }
//
//    public void translateFromLeft(View view) {
//        animateItem(R.anim.translate_from_left, item);
//    }
//
//    public void translateFromUpRight(View view) {
//        animateItem(R.anim.translate_from_upright, item);
//    }
//
//    public void multiAnimation(View view) {
//        animateItem(R.anim.multi_anim, item);
//    }

}
