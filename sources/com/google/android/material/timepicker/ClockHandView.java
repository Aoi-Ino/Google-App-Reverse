package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.m0;
import com.google.android.material.internal.u;
import d5.h;
import java.util.ArrayList;
import java.util.List;
import q4.d;
import q4.j;
import q4.k;

class ClockHandView extends View {

    /* renamed from: e  reason: collision with root package name */
    private final int f6547e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f6548f;

    /* renamed from: g  reason: collision with root package name */
    private final ValueAnimator f6549g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6550h;

    /* renamed from: i  reason: collision with root package name */
    private float f6551i;

    /* renamed from: j  reason: collision with root package name */
    private float f6552j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6553k;

    /* renamed from: l  reason: collision with root package name */
    private final int f6554l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6555m;

    /* renamed from: n  reason: collision with root package name */
    private final List f6556n;

    /* renamed from: o  reason: collision with root package name */
    private final int f6557o;

    /* renamed from: p  reason: collision with root package name */
    private final float f6558p;

    /* renamed from: q  reason: collision with root package name */
    private final Paint f6559q;

    /* renamed from: r  reason: collision with root package name */
    private final RectF f6560r;

    /* renamed from: s  reason: collision with root package name */
    private final int f6561s;

    /* renamed from: t  reason: collision with root package name */
    private float f6562t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6563u;

    /* renamed from: v  reason: collision with root package name */
    private double f6564v;

    /* renamed from: w  reason: collision with root package name */
    private int f6565w;

    /* renamed from: x  reason: collision with root package name */
    private int f6566x;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q4.b.materialClockStyle);
    }

    private void c(float f10, float f11) {
        int i10 = 2;
        if (c5.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + u.c(getContext(), 12)) {
            i10 = 1;
        }
        this.f6566x = i10;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int h10 = h(this.f6566x);
        float f10 = (float) width;
        float f11 = (float) h10;
        float f12 = (float) height;
        this.f6559q.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f6564v)) * f11) + f10, (f11 * ((float) Math.sin(this.f6564v))) + f12, (float) this.f6557o, this.f6559q);
        double sin = Math.sin(this.f6564v);
        double cos = Math.cos(this.f6564v);
        double d10 = (double) ((float) (h10 - this.f6557o));
        float f13 = (float) (width + ((int) (cos * d10)));
        float f14 = (float) (height + ((int) (d10 * sin)));
        this.f6559q.setStrokeWidth((float) this.f6561s);
        canvas.drawLine(f10, f12, f13, f14, this.f6559q);
        canvas.drawCircle(f10, f12, this.f6558p, this.f6559q);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2((double) (f11 - ((float) (getHeight() / 2))), (double) (f10 - ((float) (getWidth() / 2)))));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(((float) this.f6565w) * 0.66f) : this.f6565w;
    }

    private Pair j(float f10) {
        float g10 = g();
        if (Math.abs(g10 - f10) > 180.0f) {
            if (g10 > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (g10 < 180.0f && f10 > 180.0f) {
                g10 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g10), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = (float) f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f6550h) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f6562t = f11;
        this.f6564v = Math.toRadians((double) (f11 - 90.0f));
        float h10 = (float) h(this.f6566x);
        float width = ((float) (getWidth() / 2)) + (((float) Math.cos(this.f6564v)) * h10);
        float height = ((float) (getHeight() / 2)) + (h10 * ((float) Math.sin(this.f6564v)));
        RectF rectF = this.f6560r;
        int i10 = this.f6557o;
        rectF.set(width - ((float) i10), height - ((float) i10), width + ((float) i10), height + ((float) i10));
        for (b a10 : this.f6556n) {
            a10.a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f6556n.add(bVar);
    }

    public RectF e() {
        return this.f6560r;
    }

    public float g() {
        return this.f6562t;
    }

    public int i() {
        return this.f6557o;
    }

    public void m(int i10) {
        this.f6565w = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f6549g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair j10 = j(f10);
        this.f6549g.setFloatValues(new float[]{((Float) j10.first).floatValue(), ((Float) j10.second).floatValue()});
        this.f6549g.setDuration((long) this.f6547e);
        this.f6549g.setInterpolator(this.f6548f);
        this.f6549g.addUpdateListener(new a(this));
        this.f6549g.addListener(new a());
        this.f6549g.start();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f6549g.isRunning()) {
            n(g());
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f6551i = x10;
            this.f6552j = y10;
            this.f6553k = true;
            this.f6563u = false;
            z11 = true;
            z12 = false;
            z10 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f6551i);
            int i11 = (int) (y10 - this.f6552j);
            this.f6553k = (i10 * i10) + (i11 * i11) > this.f6554l;
            z12 = this.f6563u;
            boolean z13 = actionMasked == 1;
            if (this.f6555m) {
                c(x10, y10);
            }
            z10 = z13;
            z11 = false;
        } else {
            z12 = false;
            z11 = false;
            z10 = false;
        }
        this.f6563u |= k(x10, y10, z12, z11, z10);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void q(boolean z10) {
        if (this.f6555m && !z10) {
            this.f6566x = 1;
        }
        this.f6555m = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6549g = new ValueAnimator();
        this.f6556n = new ArrayList();
        Paint paint = new Paint();
        this.f6559q = paint;
        this.f6560r = new RectF();
        this.f6566x = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f15049i1, i10, j.Widget_MaterialComponents_TimePicker_Clock);
        this.f6547e = h.f(context, q4.b.motionDurationLong2, 200);
        this.f6548f = h.g(context, q4.b.motionEasingEmphasizedInterpolator, r4.a.f15583b);
        this.f6565w = obtainStyledAttributes.getDimensionPixelSize(k.f15069k1, 0);
        this.f6557o = obtainStyledAttributes.getDimensionPixelSize(k.f15079l1, 0);
        Resources resources = getResources();
        this.f6561s = resources.getDimensionPixelSize(d.material_clock_hand_stroke_width);
        this.f6558p = (float) resources.getDimensionPixelSize(d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(k.f15059j1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f6554l = ViewConfiguration.get(context).getScaledTouchSlop();
        m0.B0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
