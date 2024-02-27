package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.b;
import hl.h;
import il.c;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jl.d;
import ll.g;

public abstract class a extends b {
    private c A;
    private Runnable B;
    private Runnable C = null;
    private float D;
    private float E;
    private int F = 0;
    private int G = 0;
    private long H = 500;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final RectF f22688w = new RectF();

    /* renamed from: x  reason: collision with root package name */
    private final Matrix f22689x = new Matrix();

    /* renamed from: y  reason: collision with root package name */
    private float f22690y;

    /* renamed from: z  reason: collision with root package name */
    private float f22691z = 10.0f;

    /* renamed from: com.yalantis.ucrop.view.a$a  reason: collision with other inner class name */
    private static class C0280a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference f22692e;

        /* renamed from: f  reason: collision with root package name */
        private final long f22693f;

        /* renamed from: g  reason: collision with root package name */
        private final long f22694g = System.currentTimeMillis();

        /* renamed from: h  reason: collision with root package name */
        private final float f22695h;

        /* renamed from: i  reason: collision with root package name */
        private final float f22696i;

        /* renamed from: j  reason: collision with root package name */
        private final float f22697j;

        /* renamed from: k  reason: collision with root package name */
        private final float f22698k;

        /* renamed from: l  reason: collision with root package name */
        private final float f22699l;

        /* renamed from: m  reason: collision with root package name */
        private final float f22700m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f22701n;

        public C0280a(a aVar, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f22692e = new WeakReference(aVar);
            this.f22693f = j10;
            this.f22695h = f10;
            this.f22696i = f11;
            this.f22697j = f12;
            this.f22698k = f13;
            this.f22699l = f14;
            this.f22700m = f15;
            this.f22701n = z10;
        }

        public void run() {
            a aVar = (a) this.f22692e.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f22693f, System.currentTimeMillis() - this.f22694g);
                float b10 = ll.b.b(min, 0.0f, this.f22697j, (float) this.f22693f);
                float b11 = ll.b.b(min, 0.0f, this.f22698k, (float) this.f22693f);
                float a10 = ll.b.a(min, 0.0f, this.f22700m, (float) this.f22693f);
                if (min < ((float) this.f22693f)) {
                    float[] fArr = aVar.f22710i;
                    aVar.m(b10 - (fArr[0] - this.f22695h), b11 - (fArr[1] - this.f22696i));
                    if (!this.f22701n) {
                        aVar.D(this.f22699l + a10, aVar.f22688w.centerX(), aVar.f22688w.centerY());
                    }
                    if (!aVar.v()) {
                        aVar.post(this);
                    }
                }
            }
        }
    }

    private static class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final WeakReference f22702e;

        /* renamed from: f  reason: collision with root package name */
        private final long f22703f;

        /* renamed from: g  reason: collision with root package name */
        private final long f22704g = System.currentTimeMillis();

        /* renamed from: h  reason: collision with root package name */
        private final float f22705h;

        /* renamed from: i  reason: collision with root package name */
        private final float f22706i;

        /* renamed from: j  reason: collision with root package name */
        private final float f22707j;

        /* renamed from: k  reason: collision with root package name */
        private final float f22708k;

        public b(a aVar, long j10, float f10, float f11, float f12, float f13) {
            this.f22702e = new WeakReference(aVar);
            this.f22703f = j10;
            this.f22705h = f10;
            this.f22706i = f11;
            this.f22707j = f12;
            this.f22708k = f13;
        }

        public void run() {
            a aVar = (a) this.f22702e.get();
            if (aVar != null) {
                float min = (float) Math.min(this.f22703f, System.currentTimeMillis() - this.f22704g);
                float a10 = ll.b.a(min, 0.0f, this.f22706i, (float) this.f22703f);
                if (min < ((float) this.f22703f)) {
                    aVar.D(this.f22705h + a10, this.f22707j, this.f22708k);
                    aVar.post(this);
                    return;
                }
                aVar.z();
            }
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    private void A(float f10, float f11) {
        float width = this.f22688w.width();
        float height = this.f22688w.height();
        float max = Math.max(this.f22688w.width() / f10, this.f22688w.height() / f11);
        RectF rectF = this.f22688w;
        float f12 = ((height - (f11 * max)) / 2.0f) + rectF.top;
        this.f22712k.reset();
        this.f22712k.postScale(max, max);
        this.f22712k.postTranslate(((width - (f10 * max)) / 2.0f) + rectF.left, f12);
        setImageMatrix(this.f22712k);
    }

    private float[] q() {
        this.f22689x.reset();
        this.f22689x.setRotate(-getCurrentAngle());
        float[] fArr = this.f22709h;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] b10 = g.b(this.f22688w);
        this.f22689x.mapPoints(copyOf);
        this.f22689x.mapPoints(b10);
        RectF d10 = g.d(copyOf);
        RectF d11 = g.d(b10);
        float f10 = d10.left - d11.left;
        float f11 = d10.top - d11.top;
        float f12 = d10.right - d11.right;
        float f13 = d10.bottom - d11.bottom;
        float[] fArr2 = new float[4];
        if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        fArr2[0] = f10;
        if (f11 <= 0.0f) {
            f11 = 0.0f;
        }
        fArr2[1] = f11;
        if (f12 >= 0.0f) {
            f12 = 0.0f;
        }
        fArr2[2] = f12;
        if (f13 >= 0.0f) {
            f13 = 0.0f;
        }
        fArr2[3] = f13;
        this.f22689x.reset();
        this.f22689x.setRotate(getCurrentAngle());
        this.f22689x.mapPoints(fArr2);
        return fArr2;
    }

    private void r() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            s((float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        }
    }

    private void s(float f10, float f11) {
        float min = Math.min(Math.min(this.f22688w.width() / f10, this.f22688w.width() / f11), Math.min(this.f22688w.height() / f11, this.f22688w.height() / f10));
        this.E = min;
        this.D = min * this.f22691z;
    }

    /* access modifiers changed from: protected */
    public void B(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.C = bVar;
        post(bVar);
    }

    public void C(float f10) {
        D(f10, this.f22688w.centerX(), this.f22688w.centerY());
    }

    public void D(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            l(f10 / getCurrentScale(), f11, f12);
        }
    }

    public void E(float f10) {
        F(f10, this.f22688w.centerX(), this.f22688w.centerY());
    }

    public void F(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            l(f10 / getCurrentScale(), f11, f12);
        }
    }

    public c getCropBoundsChangeListener() {
        return this.A;
    }

    public float getMaxScale() {
        return this.D;
    }

    public float getMinScale() {
        return this.E;
    }

    public float getTargetAspectRatio() {
        return this.f22690y;
    }

    /* access modifiers changed from: protected */
    public void j() {
        super.j();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            if (this.f22690y == 0.0f) {
                this.f22690y = intrinsicWidth / intrinsicHeight;
            }
            int i10 = this.f22713l;
            float f10 = this.f22690y;
            int i11 = (int) (((float) i10) / f10);
            int i12 = this.f22714m;
            if (i11 > i12) {
                int i13 = (int) (((float) i12) * f10);
                int i14 = (i10 - i13) / 2;
                this.f22688w.set((float) i14, 0.0f, (float) (i13 + i14), (float) i12);
            } else {
                int i15 = (i12 - i11) / 2;
                this.f22688w.set(0.0f, (float) i15, (float) i10, (float) (i11 + i15));
            }
            s(intrinsicWidth, intrinsicHeight);
            A(intrinsicWidth, intrinsicHeight);
            c cVar = this.A;
            if (cVar != null) {
                cVar.a(this.f22690y);
            }
            b.C0281b bVar = this.f22715n;
            if (bVar != null) {
                bVar.b(getCurrentScale());
                this.f22715n.c(getCurrentAngle());
            }
        }
    }

    public void l(float f10, float f11, float f12) {
        if ((f10 > 1.0f && getCurrentScale() * f10 <= getMaxScale()) || (f10 < 1.0f && getCurrentScale() * f10 >= getMinScale())) {
            super.l(f10, f11, f12);
        }
    }

    public void setCropBoundsChangeListener(c cVar) {
        this.A = cVar;
    }

    public void setCropRect(RectF rectF) {
        this.f22690y = rectF.width() / rectF.height();
        this.f22688w.set(rectF.left - ((float) getPaddingLeft()), rectF.top - ((float) getPaddingTop()), rectF.right - ((float) getPaddingRight()), rectF.bottom - ((float) getPaddingBottom()));
        r();
        z();
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float f11;
        float f12;
        if (this.f22719r && !v()) {
            float[] fArr = this.f22710i;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float currentScale = getCurrentScale();
            float centerX = this.f22688w.centerX() - f13;
            float centerY = this.f22688w.centerY() - f14;
            this.f22689x.reset();
            this.f22689x.setTranslate(centerX, centerY);
            float[] fArr2 = this.f22709h;
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            this.f22689x.mapPoints(copyOf);
            boolean w10 = w(copyOf);
            if (w10) {
                float[] q10 = q();
                f11 = -(q10[1] + q10[3]);
                f12 = -(q10[0] + q10[2]);
                f10 = 0.0f;
            } else {
                RectF rectF = new RectF(this.f22688w);
                this.f22689x.reset();
                this.f22689x.setRotate(getCurrentAngle());
                this.f22689x.mapRect(rectF);
                float[] c10 = g.c(this.f22709h);
                f12 = centerX;
                f10 = (Math.max(rectF.width() / c10[0], rectF.height() / c10[1]) * currentScale) - currentScale;
                f11 = centerY;
            }
            if (z10) {
                C0280a aVar = new C0280a(this, this.H, f13, f14, f12, f11, currentScale, f10, w10);
                this.B = aVar;
                post(aVar);
                return;
            }
            m(f12, f11);
            if (!w10) {
                D(currentScale + f10, this.f22688w.centerX(), this.f22688w.centerY());
            }
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j10) {
        if (j10 > 0) {
            this.H = j10;
            return;
        }
        throw new IllegalArgumentException("Animation duration cannot be negative value.");
    }

    public void setMaxResultImageSizeX(int i10) {
        this.F = i10;
    }

    public void setMaxResultImageSizeY(int i10) {
        this.G = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.f22691z = f10;
    }

    public void setTargetAspectRatio(float f10) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.f22690y = f10;
            return;
        }
        if (f10 == 0.0f) {
            f10 = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        }
        this.f22690y = f10;
        c cVar = this.A;
        if (cVar != null) {
            cVar.a(this.f22690y);
        }
    }

    public void t() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
    }

    public void u(Bitmap.CompressFormat compressFormat, int i10, il.a aVar) {
        t();
        setImageToWrapCropBounds(false);
        new kl.a(getContext(), getViewBitmap(), new d(this.f22688w, g.d(this.f22709h), getCurrentScale(), getCurrentAngle()), new jl.b(this.F, this.G, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo()), aVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: protected */
    public boolean v() {
        return w(this.f22709h);
    }

    /* access modifiers changed from: protected */
    public boolean w(float[] fArr) {
        this.f22689x.reset();
        this.f22689x.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f22689x.mapPoints(copyOf);
        float[] b10 = g.b(this.f22688w);
        this.f22689x.mapPoints(b10);
        return g.d(copyOf).contains(g.d(b10));
    }

    public void x(float f10) {
        k(f10, this.f22688w.centerX(), this.f22688w.centerY());
    }

    /* access modifiers changed from: protected */
    public void y(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(h.V, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(h.W, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f22690y = 0.0f;
        } else {
            this.f22690y = abs / abs2;
        }
    }

    public void z() {
        setImageToWrapCropBounds(true);
    }
}
