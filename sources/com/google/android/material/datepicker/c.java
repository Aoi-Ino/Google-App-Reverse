package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import f5.b;
import q4.k;

final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f5880a;

    /* renamed from: b  reason: collision with root package name */
    final b f5881b;

    /* renamed from: c  reason: collision with root package name */
    final b f5882c;

    /* renamed from: d  reason: collision with root package name */
    final b f5883d;

    /* renamed from: e  reason: collision with root package name */
    final b f5884e;

    /* renamed from: f  reason: collision with root package name */
    final b f5885f;

    /* renamed from: g  reason: collision with root package name */
    final b f5886g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f5887h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.d(context, q4.b.materialCalendarStyle, i.class.getCanonicalName()), k.f14991c3);
        this.f5880a = b.a(context, obtainStyledAttributes.getResourceId(k.f15031g3, 0));
        this.f5886g = b.a(context, obtainStyledAttributes.getResourceId(k.f15011e3, 0));
        this.f5881b = b.a(context, obtainStyledAttributes.getResourceId(k.f15021f3, 0));
        this.f5882c = b.a(context, obtainStyledAttributes.getResourceId(k.f15041h3, 0));
        ColorStateList a10 = f5.c.a(context, obtainStyledAttributes, k.f15051i3);
        this.f5883d = b.a(context, obtainStyledAttributes.getResourceId(k.f15071k3, 0));
        this.f5884e = b.a(context, obtainStyledAttributes.getResourceId(k.f15061j3, 0));
        this.f5885f = b.a(context, obtainStyledAttributes.getResourceId(k.f15081l3, 0));
        Paint paint = new Paint();
        this.f5887h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
