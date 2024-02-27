package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import hl.b;

public class HorizontalProgressWheelView extends View {

    /* renamed from: e  reason: collision with root package name */
    private final Rect f22733e;

    /* renamed from: f  reason: collision with root package name */
    private a f22734f;

    /* renamed from: g  reason: collision with root package name */
    private float f22735g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f22736h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f22737i;

    /* renamed from: j  reason: collision with root package name */
    private int f22738j;

    /* renamed from: k  reason: collision with root package name */
    private int f22739k;

    /* renamed from: l  reason: collision with root package name */
    private int f22740l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f22741m;

    /* renamed from: n  reason: collision with root package name */
    private float f22742n;

    /* renamed from: o  reason: collision with root package name */
    private int f22743o;

    public interface a {
        void a(float f10, float f11);

        void b();

        void c();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.f22743o = androidx.core.content.a.c(getContext(), hl.a.ucrop_color_widget_rotate_mid_line);
        this.f22738j = getContext().getResources().getDimensionPixelSize(b.ucrop_width_horizontal_wheel_progress_line);
        this.f22739k = getContext().getResources().getDimensionPixelSize(b.ucrop_height_horizontal_wheel_progress_line);
        this.f22740l = getContext().getResources().getDimensionPixelSize(b.ucrop_margin_horizontal_wheel_progress_line);
        Paint paint = new Paint(1);
        this.f22736h = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f22736h.setStrokeWidth((float) this.f22738j);
        this.f22736h.setColor(getResources().getColor(hl.a.ucrop_color_progress_wheel_line));
        Paint paint2 = new Paint(this.f22736h);
        this.f22737i = paint2;
        paint2.setColor(this.f22743o);
        this.f22737i.setStrokeCap(Paint.Cap.ROUND);
        this.f22737i.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(b.ucrop_width_middle_wheel_progress_line));
    }

    private void b(MotionEvent motionEvent, float f10) {
        this.f22742n -= f10;
        postInvalidate();
        this.f22735g = motionEvent.getX();
        a aVar = this.f22734f;
        if (aVar != null) {
            aVar.a(-f10, this.f22742n);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f10;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f22733e);
        int width = this.f22733e.width();
        int i10 = this.f22738j;
        int i11 = this.f22740l;
        int i12 = width / (i10 + i11);
        float f11 = this.f22742n % ((float) (i11 + i10));
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i12 / 4;
            if (i13 < i14) {
                paint = this.f22736h;
                f10 = (float) i13;
            } else if (i13 > (i12 * 3) / 4) {
                paint = this.f22736h;
                f10 = (float) (i12 - i13);
            } else {
                this.f22736h.setAlpha(255);
                float f12 = -f11;
                Rect rect = this.f22733e;
                float f13 = ((float) rect.left) + f12 + ((float) ((this.f22738j + this.f22740l) * i13));
                float centerY = ((float) rect.centerY()) - (((float) this.f22739k) / 4.0f);
                Rect rect2 = this.f22733e;
                canvas.drawLine(f13, centerY, f12 + ((float) rect2.left) + ((float) ((this.f22738j + this.f22740l) * i13)), ((float) rect2.centerY()) + (((float) this.f22739k) / 4.0f), this.f22736h);
            }
            paint.setAlpha((int) ((f10 / ((float) i14)) * 255.0f));
            float f122 = -f11;
            Rect rect3 = this.f22733e;
            float f132 = ((float) rect3.left) + f122 + ((float) ((this.f22738j + this.f22740l) * i13));
            float centerY2 = ((float) rect3.centerY()) - (((float) this.f22739k) / 4.0f);
            Rect rect22 = this.f22733e;
            canvas.drawLine(f132, centerY2, f122 + ((float) rect22.left) + ((float) ((this.f22738j + this.f22740l) * i13)), ((float) rect22.centerY()) + (((float) this.f22739k) / 4.0f), this.f22736h);
        }
        float centerX = (float) this.f22733e.centerX();
        float centerY3 = ((float) this.f22733e.centerY()) - (((float) this.f22739k) / 2.0f);
        Canvas canvas2 = canvas;
        float f14 = centerY3;
        canvas2.drawLine(centerX, f14, (float) this.f22733e.centerX(), (((float) this.f22739k) / 2.0f) + ((float) this.f22733e.centerY()), this.f22737i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f22735g = motionEvent.getX();
        } else if (action == 1) {
            a aVar = this.f22734f;
            if (aVar != null) {
                this.f22741m = false;
                aVar.b();
            }
        } else if (action == 2) {
            float x10 = motionEvent.getX() - this.f22735g;
            if (x10 != 0.0f) {
                if (!this.f22741m) {
                    this.f22741m = true;
                    a aVar2 = this.f22734f;
                    if (aVar2 != null) {
                        aVar2.c();
                    }
                }
                b(motionEvent, x10);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i10) {
        this.f22743o = i10;
        this.f22737i.setColor(i10);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f22734f = aVar;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22733e = new Rect();
        a();
    }
}
