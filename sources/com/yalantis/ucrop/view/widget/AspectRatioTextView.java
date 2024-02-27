package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import hl.b;
import hl.h;
import java.util.Locale;

public class AspectRatioTextView extends AppCompatTextView {

    /* renamed from: l  reason: collision with root package name */
    private final float f22725l;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f22726m;

    /* renamed from: n  reason: collision with root package name */
    private Paint f22727n;

    /* renamed from: o  reason: collision with root package name */
    private int f22728o;

    /* renamed from: p  reason: collision with root package name */
    private float f22729p;

    /* renamed from: q  reason: collision with root package name */
    private String f22730q;

    /* renamed from: r  reason: collision with root package name */
    private float f22731r;

    /* renamed from: s  reason: collision with root package name */
    private float f22732s;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void r(int i10) {
        Paint paint = this.f22727n;
        if (paint != null) {
            paint.setColor(i10);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i10, a.c(getContext(), hl.a.ucrop_color_widget)}));
    }

    private void t(TypedArray typedArray) {
        setGravity(1);
        this.f22730q = typedArray.getString(h.R);
        this.f22731r = typedArray.getFloat(h.S, 0.0f);
        float f10 = typedArray.getFloat(h.T, 0.0f);
        this.f22732s = f10;
        float f11 = this.f22731r;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.f22729p = 0.0f;
        } else {
            this.f22729p = f11 / f10;
        }
        this.f22728o = getContext().getResources().getDimensionPixelSize(b.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.f22727n = paint;
        paint.setStyle(Paint.Style.FILL);
        u();
        r(getResources().getColor(hl.a.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void u() {
        setText(!TextUtils.isEmpty(this.f22730q) ? this.f22730q : String.format(Locale.US, "%d:%d", new Object[]{Integer.valueOf((int) this.f22731r), Integer.valueOf((int) this.f22732s)}));
    }

    private void v() {
        if (this.f22729p != 0.0f) {
            float f10 = this.f22731r;
            float f11 = this.f22732s;
            this.f22731r = f11;
            this.f22732s = f10;
            this.f22729p = f11 / f10;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f22726m);
            Rect rect = this.f22726m;
            float f10 = ((float) rect.bottom) - (((float) rect.top) / 2.0f);
            int i10 = this.f22728o;
            canvas.drawCircle(((float) (rect.right - rect.left)) / 2.0f, f10 - (((float) i10) * 1.5f), ((float) i10) / 2.0f, this.f22727n);
        }
    }

    public float s(boolean z10) {
        if (z10) {
            v();
            u();
        }
        return this.f22729p;
    }

    public void setActiveColor(int i10) {
        r(i10);
        invalidate();
    }

    public void setAspectRatio(jl.a aVar) {
        this.f22730q = aVar.c();
        this.f22731r = aVar.d();
        float e10 = aVar.e();
        this.f22732s = e10;
        float f10 = this.f22731r;
        if (f10 == 0.0f || e10 == 0.0f) {
            this.f22729p = 0.0f;
        } else {
            this.f22729p = f10 / e10;
        }
        u();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22725l = 1.5f;
        this.f22726m = new Rect();
        t(context.obtainStyledAttributes(attributeSet, h.Q));
    }
}
