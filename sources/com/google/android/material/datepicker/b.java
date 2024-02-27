package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.g;
import androidx.core.view.m0;
import f5.c;
import i5.k;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f5874a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f5875b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f5876c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f5877d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5878e;

    /* renamed from: f  reason: collision with root package name */
    private final k f5879f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, k kVar, Rect rect) {
        g.d(rect.left);
        g.d(rect.top);
        g.d(rect.right);
        g.d(rect.bottom);
        this.f5874a = rect;
        this.f5875b = colorStateList2;
        this.f5876c = colorStateList;
        this.f5877d = colorStateList3;
        this.f5878e = i10;
        this.f5879f = kVar;
    }

    static b a(Context context, int i10) {
        g.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, q4.k.f15091m3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(q4.k.f15101n3, 0), obtainStyledAttributes.getDimensionPixelOffset(q4.k.f15120p3, 0), obtainStyledAttributes.getDimensionPixelOffset(q4.k.f15111o3, 0), obtainStyledAttributes.getDimensionPixelOffset(q4.k.f15129q3, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, q4.k.f15138r3);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, q4.k.f15183w3);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, q4.k.f15165u3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(q4.k.f15174v3, 0);
        k m10 = k.b(context, obtainStyledAttributes.getResourceId(q4.k.f15147s3, 0), obtainStyledAttributes.getResourceId(q4.k.f15156t3, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    /* access modifiers changed from: package-private */
    public void b(TextView textView) {
        c(textView, (ColorStateList) null, (ColorStateList) null);
    }

    /* access modifiers changed from: package-private */
    public void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        i5.g gVar = new i5.g();
        i5.g gVar2 = new i5.g();
        gVar.setShapeAppearanceModel(this.f5879f);
        gVar2.setShapeAppearanceModel(this.f5879f);
        if (colorStateList == null) {
            colorStateList = this.f5876c;
        }
        gVar.W(colorStateList);
        gVar.d0((float) this.f5878e, this.f5877d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f5875b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f5875b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f5874a;
        m0.u0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
