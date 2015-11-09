package com.takeoffandroid.materialpercentdrawer;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Created by Chandru-MacBook on 11/9/15.
 */
public class AnimationUtils {

    public static Animation slideInAnimation() {

        Animation inFromRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, +1.0f, Animation.RELATIVE_TO_PARENT, 0.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f
        );
        inFromRight.setDuration(500);
        inFromRight.setInterpolator(new AccelerateDecelerateInterpolator());
        return inFromRight;
    }

    public static Animation slideOutAnimation() {
        Animation outtoRight = new TranslateAnimation(
                Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, +1.0f,
                Animation.RELATIVE_TO_PARENT, 0.0f, Animation.RELATIVE_TO_PARENT, 0.0f
        );
        outtoRight.setDuration(500);
        outtoRight.setInterpolator(new AccelerateDecelerateInterpolator());
        return outtoRight;
    }

}
