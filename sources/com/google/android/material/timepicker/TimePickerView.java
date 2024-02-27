package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import q4.f;
import q4.h;

class TimePickerView extends ConstraintLayout {
    private final Chip C;
    private final Chip D;
    private final ClockHandView E;
    private final ClockFaceView F;
    private final MaterialButtonToggleGroup G;
    private final View.OnClickListener H;

    class a implements View.OnClickListener {
        a() {
        }

        public void onClick(View view) {
            e unused = TimePickerView.this.getClass();
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            d unused = TimePickerView.this.getClass();
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ GestureDetector f6570e;

        c(GestureDetector gestureDetector) {
            this.f6570e = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f6570e.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
    }

    private void F() {
        Chip chip = this.C;
        int i10 = f.selection_type;
        chip.setTag(i10, 12);
        this.D.setTag(i10, 10);
        this.C.setOnClickListener(this.H);
        this.D.setOnClickListener(this.H);
        this.C.setAccessibilityClassName("android.view.View");
        this.D.setAccessibilityClassName("android.view.View");
    }

    private void G() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.C.setOnTouchListener(cVar);
        this.D.setOnTouchListener(cVar);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.D.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.H = new a();
        LayoutInflater.from(context).inflate(h.material_timepicker, this);
        this.F = (ClockFaceView) findViewById(f.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(f.material_clock_period_toggle);
        this.G = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new f(this));
        this.C = (Chip) findViewById(f.material_minute_tv);
        this.D = (Chip) findViewById(f.material_hour_tv);
        this.E = (ClockHandView) findViewById(f.material_clock_hand);
        G();
        F();
    }
}
