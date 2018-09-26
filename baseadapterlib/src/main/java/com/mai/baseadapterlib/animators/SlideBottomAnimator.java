package com.mai.baseadapterlib.animators;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

import com.mai.baseadapterlib.listener.RBaseAnimator;


/**
 * Created by mai on 16/6/1.
 */
public class SlideBottomAnimator implements RBaseAnimator {

    @Override
    public Animator getAnimator(View view) {
        ObjectAnimator animtor = ObjectAnimator.ofFloat(view, "translationY", view.getMeasuredHeight(), 0);
        animtor.setDuration(300);
        return animtor;
    }
}
