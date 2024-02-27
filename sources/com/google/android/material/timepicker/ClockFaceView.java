package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import com.google.android.material.timepicker.ClockHandView;
import f5.c;
import java.util.Arrays;
import q4.d;
import q4.f;
import q4.h;
import q4.j;
import q4.k;

class ClockFaceView extends d implements ClockHandView.b {
    /* access modifiers changed from: private */
    public final ClockHandView F;
    /* access modifiers changed from: private */
    public final Rect G;
    private final RectF H;
    private final Rect I;
    /* access modifiers changed from: private */
    public final SparseArray J;
    private final androidx.core.view.a K;
    private final int[] L;
    private final float[] M;
    /* access modifiers changed from: private */
    public final int N;
    private final int O;
    private final int P;
    private final int Q;
    private String[] R;
    private float S;
    private final ColorStateList T;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.F(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.F.i()) - ClockFaceView.this.N);
            return true;
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        public void g(View view, y yVar) {
            super.g(view, yVar);
            int intValue = ((Integer) view.getTag(f.material_value_index)).intValue();
            if (intValue > 0) {
                yVar.M0((View) ClockFaceView.this.J.get(intValue - 1));
            }
            yVar.p0(y.g.a(0, 1, intValue, 1, false, view.isSelected()));
            yVar.n0(true);
            yVar.b(y.a.f2538i);
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 16) {
                return super.j(view, i10, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.G);
            long j10 = uptimeMillis;
            float centerX = (float) ClockFaceView.this.G.centerX();
            float centerY = (float) ClockFaceView.this.G.centerY();
            ClockFaceView.this.F.onTouchEvent(MotionEvent.obtain(uptimeMillis, j10, 0, centerX, centerY, 0));
            ClockFaceView.this.F.onTouchEvent(MotionEvent.obtain(uptimeMillis, j10, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.materialClockStyle);
    }

    private void N() {
        RectF e10 = this.F.e();
        TextView P2 = P(e10);
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            TextView textView = (TextView) this.J.get(i10);
            if (textView != null) {
                textView.setSelected(textView == P2);
                textView.getPaint().setShader(O(e10, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient O(RectF rectF, TextView textView) {
        textView.getHitRect(this.G);
        this.H.set(this.G);
        textView.getLineBounds(0, this.I);
        RectF rectF2 = this.H;
        Rect rect = this.I;
        rectF2.inset((float) rect.left, (float) rect.top);
        if (!RectF.intersects(rectF, this.H)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.H.left, rectF.centerY() - this.H.top, rectF.width() * 0.5f, this.L, this.M, Shader.TileMode.CLAMP);
    }

    private TextView P(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            TextView textView2 = (TextView) this.J.get(i10);
            if (textView2 != null) {
                textView2.getHitRect(this.G);
                this.H.set(this.G);
                this.H.union(rectF);
                float width = this.H.width() * this.H.height();
                if (width < f10) {
                    textView = textView2;
                    f10 = width;
                }
            }
        }
        return textView;
    }

    private static float Q(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void S(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.J.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < Math.max(this.R.length, size); i11++) {
            TextView textView = (TextView) this.J.get(i11);
            if (i11 >= this.R.length) {
                removeView(textView);
                this.J.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.material_clockface_textview, this, false);
                    this.J.put(i11, textView);
                    addView(textView);
                }
                textView.setText(this.R[i11]);
                textView.setTag(f.material_value_index, Integer.valueOf(i11));
                int i12 = (i11 / 12) + 1;
                textView.setTag(f.material_clock_level, Integer.valueOf(i12));
                if (i12 > 1) {
                    z10 = true;
                }
                m0.q0(textView, this.K);
                textView.setTextColor(this.T);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, new Object[]{this.R[i11]}));
                }
            }
        }
        this.F.q(z10);
    }

    public void F(int i10) {
        if (i10 != E()) {
            super.F(i10);
            this.F.m(E());
        }
    }

    /* access modifiers changed from: protected */
    public void H() {
        super.H();
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            ((TextView) this.J.get(i10)).setVisibility(0);
        }
    }

    public void R(String[] strArr, int i10) {
        this.R = strArr;
        S(i10);
    }

    public void a(float f10, boolean z10) {
        if (Math.abs(this.S - f10) > 0.001f) {
            this.S = f10;
            N();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y.P0(accessibilityNodeInfo).o0(y.f.b(1, this.R.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        N();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int Q2 = (int) (((float) this.Q) / Q(((float) this.O) / ((float) displayMetrics.heightPixels), ((float) this.P) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Q2, 1073741824);
        setMeasuredDimension(Q2, Q2);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.G = new Rect();
        this.H = new RectF();
        this.I = new Rect();
        this.J = new SparseArray();
        this.M = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f15019f1, i10, j.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a10 = c.a(context, obtainStyledAttributes, k.f15039h1);
        this.T = a10;
        LayoutInflater.from(context).inflate(h.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.material_clock_hand);
        this.F = clockHandView;
        this.N = resources.getDimensionPixelSize(d.material_clock_hand_padding);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.L = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = g.a.a(context, q4.c.material_timepicker_clockface).getDefaultColor();
        ColorStateList a11 = c.a(context, obtainStyledAttributes, k.f15029g1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.K = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        R(strArr, 0);
        this.O = resources.getDimensionPixelSize(d.material_time_picker_minimum_screen_height);
        this.P = resources.getDimensionPixelSize(d.material_time_picker_minimum_screen_width);
        this.Q = resources.getDimensionPixelSize(d.material_clock_size);
    }
}
