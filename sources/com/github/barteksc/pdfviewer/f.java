package com.github.barteksc.pdfviewer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseBooleanArray;
import com.shockwave.pdfium.PdfiumCore;

class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private PdfiumCore f5170a;

    /* renamed from: b  reason: collision with root package name */
    private com.shockwave.pdfium.a f5171b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public PDFView f5172c;

    /* renamed from: d  reason: collision with root package name */
    private RectF f5173d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private Rect f5174e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private Matrix f5175f = new Matrix();

    /* renamed from: g  reason: collision with root package name */
    private final SparseBooleanArray f5176g = new SparseBooleanArray();

    /* renamed from: h  reason: collision with root package name */
    private boolean f5177h = false;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p2.a f5178e;

        a(p2.a aVar) {
            this.f5178e = aVar;
        }

        public void run() {
            f.this.f5172c.P(this.f5178e);
        }
    }

    class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n2.a f5180e;

        b(n2.a aVar) {
            this.f5180e = aVar;
        }

        public void run() {
            f.this.f5172c.Q(this.f5180e);
        }
    }

    private class c {

        /* renamed from: a  reason: collision with root package name */
        float f5182a;

        /* renamed from: b  reason: collision with root package name */
        float f5183b;

        /* renamed from: c  reason: collision with root package name */
        RectF f5184c;

        /* renamed from: d  reason: collision with root package name */
        int f5185d;

        /* renamed from: e  reason: collision with root package name */
        int f5186e;

        /* renamed from: f  reason: collision with root package name */
        boolean f5187f;

        /* renamed from: g  reason: collision with root package name */
        int f5188g;

        /* renamed from: h  reason: collision with root package name */
        boolean f5189h;

        /* renamed from: i  reason: collision with root package name */
        boolean f5190i;

        c(float f10, float f11, RectF rectF, int i10, int i11, boolean z10, int i12, boolean z11, boolean z12) {
            this.f5185d = i11;
            this.f5182a = f10;
            this.f5183b = f11;
            this.f5184c = rectF;
            this.f5186e = i10;
            this.f5187f = z10;
            this.f5188g = i12;
            this.f5189h = z11;
            this.f5190i = z12;
        }
    }

    f(Looper looper, PDFView pDFView, PdfiumCore pdfiumCore, com.shockwave.pdfium.a aVar) {
        super(looper);
        this.f5172c = pDFView;
        this.f5170a = pdfiumCore;
        this.f5171b = aVar;
    }

    private void c(int i10, int i11, RectF rectF) {
        this.f5175f.reset();
        float f10 = (float) i10;
        float f11 = (float) i11;
        this.f5175f.postTranslate((-rectF.left) * f10, (-rectF.top) * f11);
        this.f5175f.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f5173d.set(0.0f, 0.0f, f10, f11);
        this.f5175f.mapRect(this.f5173d);
        this.f5173d.round(this.f5174e);
    }

    private p2.a d(c cVar) {
        if (this.f5176g.indexOfKey(cVar.f5185d) < 0) {
            try {
                this.f5170a.i(this.f5171b, cVar.f5185d);
                this.f5176g.put(cVar.f5185d, true);
            } catch (Exception e10) {
                this.f5176g.put(cVar.f5185d, false);
                throw new n2.a(cVar.f5185d, e10);
            }
        }
        int round = Math.round(cVar.f5182a);
        int round2 = Math.round(cVar.f5183b);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(round, round2, cVar.f5189h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            c(round, round2, cVar.f5184c);
            if (this.f5176g.get(cVar.f5185d)) {
                PdfiumCore pdfiumCore = this.f5170a;
                com.shockwave.pdfium.a aVar = this.f5171b;
                int i10 = cVar.f5185d;
                Rect rect = this.f5174e;
                pdfiumCore.k(aVar, createBitmap, i10, rect.left, rect.top, rect.width(), this.f5174e.height(), cVar.f5190i);
            } else {
                createBitmap.eraseColor(this.f5172c.getInvalidPageColor());
            }
            return new p2.a(cVar.f5186e, cVar.f5185d, createBitmap, cVar.f5182a, cVar.f5183b, cVar.f5184c, cVar.f5187f, cVar.f5188g);
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i10, int i11, float f10, float f11, RectF rectF, boolean z10, int i12, boolean z11, boolean z12) {
        sendMessage(obtainMessage(1, new c(f10, f11, rectF, i10, i11, z10, i12, z11, z12)));
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f5177h = true;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f5177h = false;
    }

    public void handleMessage(Message message) {
        try {
            p2.a d10 = d((c) message.obj);
            if (d10 == null) {
                return;
            }
            if (this.f5177h) {
                this.f5172c.post(new a(d10));
            } else {
                d10.e().recycle();
            }
        } catch (n2.a e10) {
            this.f5172c.post(new b(e10));
        }
    }
}
