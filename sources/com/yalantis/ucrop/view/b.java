package com.yalantis.ucrop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import jl.c;
import ll.d;
import ll.g;

public abstract class b extends AppCompatImageView {

    /* renamed from: h  reason: collision with root package name */
    protected final float[] f22709h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    protected final float[] f22710i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    private final float[] f22711j = new float[9];

    /* renamed from: k  reason: collision with root package name */
    protected Matrix f22712k = new Matrix();

    /* renamed from: l  reason: collision with root package name */
    protected int f22713l;

    /* renamed from: m  reason: collision with root package name */
    protected int f22714m;

    /* renamed from: n  reason: collision with root package name */
    protected C0281b f22715n;

    /* renamed from: o  reason: collision with root package name */
    private float[] f22716o;

    /* renamed from: p  reason: collision with root package name */
    private float[] f22717p;

    /* renamed from: q  reason: collision with root package name */
    protected boolean f22718q = false;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f22719r = false;

    /* renamed from: s  reason: collision with root package name */
    private int f22720s = 0;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public String f22721t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public String f22722u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public c f22723v;

    class a implements il.b {
        a() {
        }

        public void a(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            C0281b bVar = b.this.f22715n;
            if (bVar != null) {
                bVar.a(exc);
            }
        }

        public void b(Bitmap bitmap, c cVar, String str, String str2) {
            String unused = b.this.f22721t = str;
            String unused2 = b.this.f22722u = str2;
            c unused3 = b.this.f22723v = cVar;
            b bVar = b.this;
            bVar.f22718q = true;
            bVar.setImageBitmap(bitmap);
        }
    }

    /* renamed from: com.yalantis.ucrop.view.b$b  reason: collision with other inner class name */
    public interface C0281b {
        void a(Exception exc);

        void b(float f10);

        void c(float f10);

        void d();
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i();
    }

    private void o() {
        this.f22712k.mapPoints(this.f22709h, this.f22716o);
        this.f22712k.mapPoints(this.f22710i, this.f22717p);
    }

    public float f(Matrix matrix) {
        return (float) (-(Math.atan2((double) h(matrix, 1), (double) h(matrix, 0)) * 57.29577951308232d));
    }

    public float g(Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) h(matrix, 0), 2.0d) + Math.pow((double) h(matrix, 3), 2.0d));
    }

    public float getCurrentAngle() {
        return f(this.f22712k);
    }

    public float getCurrentScale() {
        return g(this.f22712k);
    }

    public c getExifInfo() {
        return this.f22723v;
    }

    public String getImageInputPath() {
        return this.f22721t;
    }

    public String getImageOutputPath() {
        return this.f22722u;
    }

    public int getMaxBitmapSize() {
        if (this.f22720s <= 0) {
            this.f22720s = ll.a.b(getContext());
        }
        return this.f22720s;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof d)) {
            return null;
        }
        return ((d) getDrawable()).a();
    }

    /* access modifiers changed from: protected */
    public float h(Matrix matrix, int i10) {
        matrix.getValues(this.f22711j);
        return this.f22711j[i10];
    }

    /* access modifiers changed from: protected */
    public void i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public void j() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Log.d("TransformImageView", String.format("Image size: [%d:%d]", new Object[]{Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)}));
            RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            this.f22716o = g.b(rectF);
            this.f22717p = g.a(rectF);
            this.f22719r = true;
            C0281b bVar = this.f22715n;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    public void k(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f22712k.postRotate(f10, f11, f12);
            setImageMatrix(this.f22712k);
            C0281b bVar = this.f22715n;
            if (bVar != null) {
                bVar.c(f(this.f22712k));
            }
        }
    }

    public void l(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f22712k.postScale(f10, f10, f11, f12);
            setImageMatrix(this.f22712k);
            C0281b bVar = this.f22715n;
            if (bVar != null) {
                bVar.b(g(this.f22712k));
            }
        }
    }

    public void m(float f10, float f11) {
        if (f10 != 0.0f || f11 != 0.0f) {
            this.f22712k.postTranslate(f10, f11);
            setImageMatrix(this.f22712k);
        }
    }

    public void n(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        ll.a.d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.f22718q && !this.f22719r)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            this.f22713l = (getWidth() - getPaddingRight()) - paddingLeft;
            this.f22714m = (getHeight() - getPaddingBottom()) - paddingTop;
            j();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new d(bitmap));
    }

    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f22712k.set(matrix);
        o();
    }

    public void setMaxBitmapSize(int i10) {
        this.f22720s = i10;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(C0281b bVar) {
        this.f22715n = bVar;
    }
}
