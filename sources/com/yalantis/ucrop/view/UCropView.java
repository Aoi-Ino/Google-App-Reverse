package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import hl.e;
import hl.h;
import il.c;
import il.d;

public class UCropView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public GestureCropImageView f22684e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final OverlayView f22685f;

    class a implements c {
        a() {
        }

        public void a(float f10) {
            UCropView.this.f22685f.setTargetAspectRatio(f10);
        }
    }

    class b implements d {
        b() {
        }

        public void a(RectF rectF) {
            UCropView.this.f22684e.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        this.f22684e.setCropBoundsChangeListener(new a());
        this.f22685f.setOverlayViewChangeListener(new b());
    }

    public GestureCropImageView getCropImageView() {
        return this.f22684e;
    }

    public OverlayView getOverlayView() {
        return this.f22685f;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(e.ucrop_view, this, true);
        this.f22684e = (GestureCropImageView) findViewById(hl.d.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(hl.d.view_overlay);
        this.f22685f = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.U);
        overlayView.g(obtainStyledAttributes);
        this.f22684e.y(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        c();
    }
}
