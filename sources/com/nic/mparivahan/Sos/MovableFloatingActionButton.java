package com.nic.mparivahan.Sos;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MovableFloatingActionButton extends FloatingActionButton implements View.OnTouchListener {

    /* renamed from: w  reason: collision with root package name */
    private float f9611w;

    /* renamed from: x  reason: collision with root package name */
    private float f9612x;

    /* renamed from: y  reason: collision with root package name */
    private float f9613y;

    /* renamed from: z  reason: collision with root package name */
    private float f9614z;

    public MovableFloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n();
    }

    private void n() {
        setOnTouchListener(this);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9611w = motionEvent.getRawX();
            this.f9612x = motionEvent.getRawY();
            this.f9613y = view.getX() - this.f9611w;
            this.f9614z = view.getY() - this.f9612x;
            return true;
        } else if (action == 2) {
            int width = view.getWidth();
            int height = view.getHeight();
            View view2 = (View) view.getParent();
            int width2 = view2.getWidth();
            int height2 = view2.getHeight();
            float min = Math.min((float) (width2 - width), Math.max(0.0f, motionEvent.getRawX() + this.f9613y));
            view.animate().x(min).y(Math.min((float) (height2 - height), Math.max(0.0f, motionEvent.getRawY() + this.f9614z))).setDuration(0).start();
            return true;
        } else if (action != 1) {
            return super.onTouchEvent(motionEvent);
        } else {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f10 = rawX - this.f9611w;
            float f11 = rawY - this.f9612x;
            if (Math.abs(f10) >= 10.0f || Math.abs(f11) >= 10.0f) {
                return true;
            }
            return performClick();
        }
    }
}
