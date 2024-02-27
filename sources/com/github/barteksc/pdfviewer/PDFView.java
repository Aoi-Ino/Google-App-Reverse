package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import o2.e;
import o2.f;
import o2.g;
import o2.h;

public class PDFView extends RelativeLayout {
    private static final String T = "PDFView";
    private c A;
    private final HandlerThread B = new HandlerThread("PDF renderer");
    f C;
    private e D;
    private Paint E;
    private Paint F;
    private int G = -1;
    private int H = 0;
    /* access modifiers changed from: private */
    public boolean I = true;
    private PdfiumCore J;
    private com.shockwave.pdfium.a K;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = true;
    private PaintFlagsDrawFilter Q = new PaintFlagsDrawFilter(0, 3);
    private int R = 0;
    private List S = new ArrayList(10);

    /* renamed from: e  reason: collision with root package name */
    private float f5072e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    private float f5073f = 1.75f;

    /* renamed from: g  reason: collision with root package name */
    private float f5074g = 3.0f;

    /* renamed from: h  reason: collision with root package name */
    private c f5075h = c.NONE;

    /* renamed from: i  reason: collision with root package name */
    b f5076i;

    /* renamed from: j  reason: collision with root package name */
    private a f5077j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public d f5078k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f5079l;

    /* renamed from: m  reason: collision with root package name */
    private int[] f5080m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f5081n;

    /* renamed from: o  reason: collision with root package name */
    private int f5082o;

    /* renamed from: p  reason: collision with root package name */
    private int f5083p;

    /* renamed from: q  reason: collision with root package name */
    private int f5084q;

    /* renamed from: r  reason: collision with root package name */
    private int f5085r;

    /* renamed from: s  reason: collision with root package name */
    private int f5086s;

    /* renamed from: t  reason: collision with root package name */
    private float f5087t;

    /* renamed from: u  reason: collision with root package name */
    private float f5088u;

    /* renamed from: v  reason: collision with root package name */
    private float f5089v = 0.0f;

    /* renamed from: w  reason: collision with root package name */
    private float f5090w = 0.0f;

    /* renamed from: x  reason: collision with root package name */
    private float f5091x = 1.0f;

    /* renamed from: y  reason: collision with root package name */
    private boolean f5092y = true;

    /* renamed from: z  reason: collision with root package name */
    private d f5093z = d.DEFAULT;

    public class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final r2.a f5094a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int[] f5095b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5096c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5097d;

        /* renamed from: e  reason: collision with root package name */
        private int f5098e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5099f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f5100g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public String f5101h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f5102i;

        /* renamed from: j  reason: collision with root package name */
        private int f5103j;

        /* renamed from: k  reason: collision with root package name */
        private int f5104k;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f5095b != null) {
                    b bVar = b.this;
                    PDFView pDFView = PDFView.this;
                    r2.a b10 = bVar.f5094a;
                    String c10 = b.this.f5101h;
                    o2.c unused = b.this.getClass();
                    o2.b unused2 = b.this.getClass();
                    pDFView.H(b10, c10, (o2.c) null, (o2.b) null, b.this.f5095b);
                    return;
                }
                b bVar2 = b.this;
                PDFView pDFView2 = PDFView.this;
                r2.a b11 = bVar2.f5094a;
                String c11 = b.this.f5101h;
                o2.c unused3 = b.this.getClass();
                o2.b unused4 = b.this.getClass();
                pDFView2.G(b11, c11, (o2.c) null, (o2.b) null);
            }
        }

        private b(r2.a aVar) {
            this.f5095b = null;
            this.f5096c = true;
            this.f5097d = true;
            this.f5098e = 0;
            this.f5099f = false;
            this.f5100g = false;
            this.f5101h = null;
            this.f5102i = true;
            this.f5103j = 0;
            this.f5104k = -1;
            this.f5094a = aVar;
        }

        public b f(boolean z10) {
            this.f5096c = z10;
            return this;
        }

        public void g() {
            PDFView.this.R();
            PDFView.this.setOnDrawListener((o2.a) null);
            PDFView.this.setOnDrawAllListener((o2.a) null);
            PDFView.this.setOnPageChangeListener((o2.d) null);
            PDFView.this.setOnPageScrollListener((f) null);
            PDFView.this.setOnRenderListener((g) null);
            PDFView.this.setOnTapListener((h) null);
            PDFView.this.setOnPageErrorListener((e) null);
            PDFView.this.z(this.f5096c);
            PDFView.this.y(this.f5097d);
            PDFView.this.setDefaultPage(this.f5098e);
            PDFView.this.setSwipeVertical(!this.f5099f);
            PDFView.this.w(this.f5100g);
            PDFView.this.setScrollHandle((q2.a) null);
            PDFView.this.x(this.f5102i);
            PDFView.this.setSpacing(this.f5103j);
            PDFView.this.setInvalidPageColor(this.f5104k);
            PDFView.this.f5078k.f(PDFView.this.I);
            PDFView.this.post(new a());
        }

        public b h(boolean z10) {
            this.f5099f = z10;
            return this;
        }
    }

    enum c {
        NONE,
        START,
        END
    }

    private enum d {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            this.f5076i = new b();
            a aVar = new a(this);
            this.f5077j = aVar;
            this.f5078k = new d(this, aVar);
            this.E = new Paint();
            Paint paint = new Paint();
            this.F = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.J = new PdfiumCore(context);
            setWillNotDraw(false);
        }
    }

    /* access modifiers changed from: private */
    public void G(r2.a aVar, String str, o2.c cVar, o2.b bVar) {
        H(aVar, str, cVar, bVar, (int[]) null);
    }

    /* access modifiers changed from: private */
    public void H(r2.a aVar, String str, o2.c cVar, o2.b bVar, int[] iArr) {
        if (this.f5092y) {
            if (iArr != null) {
                this.f5079l = iArr;
                this.f5080m = s2.a.b(iArr);
                this.f5081n = s2.a.a(this.f5079l);
            }
            int[] iArr2 = this.f5079l;
            int i10 = iArr2 != null ? iArr2[0] : 0;
            this.f5092y = false;
            c cVar2 = new c(aVar, str, this, this.J, i10);
            this.A = cVar2;
            cVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
    }

    private void q() {
        if (this.f5093z != d.DEFAULT && getWidth() != 0) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            float f10 = ((float) this.f5085r) / ((float) this.f5086s);
            float floor = (float) Math.floor((double) (width / f10));
            if (floor > height) {
                width = (float) Math.floor((double) (f10 * height));
            } else {
                height = floor;
            }
            this.f5087t = width;
            this.f5088u = height;
        }
    }

    private float r(int i10) {
        float f10;
        float f11;
        if (this.I) {
            f10 = (float) i10;
            f11 = this.f5088u;
        } else {
            f10 = (float) i10;
            f11 = this.f5087t;
        }
        return W((f10 * f11) + ((float) (i10 * this.R)));
    }

    private int s(int i10) {
        if (i10 <= 0) {
            return 0;
        }
        int[] iArr = this.f5079l;
        if (iArr == null) {
            int i11 = this.f5082o;
            if (i10 >= i11) {
                return i11 - 1;
            }
        } else if (i10 >= iArr.length) {
            return iArr.length - 1;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public void setDefaultPage(int i10) {
        this.H = i10;
    }

    /* access modifiers changed from: private */
    public void setInvalidPageColor(int i10) {
        this.G = i10;
    }

    /* access modifiers changed from: private */
    public void setOnDrawAllListener(o2.a aVar) {
    }

    /* access modifiers changed from: private */
    public void setOnDrawListener(o2.a aVar) {
    }

    /* access modifiers changed from: private */
    public void setOnPageChangeListener(o2.d dVar) {
    }

    /* access modifiers changed from: private */
    public void setOnPageErrorListener(e eVar) {
    }

    /* access modifiers changed from: private */
    public void setOnPageScrollListener(f fVar) {
    }

    /* access modifiers changed from: private */
    public void setOnRenderListener(g gVar) {
    }

    /* access modifiers changed from: private */
    public void setOnTapListener(h hVar) {
    }

    /* access modifiers changed from: private */
    public void setScrollHandle(q2.a aVar) {
    }

    /* access modifiers changed from: private */
    public void setSpacing(int i10) {
        this.R = s2.d.a(getContext(), i10);
    }

    private void u(Canvas canvas, p2.a aVar) {
        float f10;
        float f11;
        RectF d10 = aVar.d();
        Bitmap e10 = aVar.e();
        if (!e10.isRecycled()) {
            if (this.I) {
                f10 = r(aVar.f());
                f11 = 0.0f;
            } else {
                f11 = r(aVar.f());
                f10 = 0.0f;
            }
            canvas.translate(f11, f10);
            Rect rect = new Rect(0, 0, e10.getWidth(), e10.getHeight());
            float W = W(d10.left * this.f5087t);
            float W2 = W(d10.top * this.f5088u);
            RectF rectF = new RectF((float) ((int) W), (float) ((int) W2), (float) ((int) (W + W(d10.width() * this.f5087t))), (float) ((int) (W2 + W(d10.height() * this.f5088u))));
            float f12 = this.f5089v + f11;
            float f13 = this.f5090w + f10;
            if (rectF.left + f12 < ((float) getWidth()) && f12 + rectF.right > 0.0f && rectF.top + f13 < ((float) getHeight()) && f13 + rectF.bottom > 0.0f) {
                canvas.drawBitmap(e10, rect, rectF, this.E);
                if (s2.b.f15877a) {
                    this.F.setColor(aVar.f() % 2 == 0 ? -65536 : -16776961);
                    canvas.drawRect(rectF, this.F);
                }
            }
            canvas.translate(-f11, -f10);
        }
    }

    private void v(Canvas canvas, int i10, o2.a aVar) {
        float f10;
        if (aVar != null) {
            float f11 = 0.0f;
            if (this.I) {
                f10 = r(i10);
            } else {
                f11 = r(i10);
                f10 = 0.0f;
            }
            canvas.translate(f11, f10);
            aVar.a(canvas, W(this.f5087t), W(this.f5088u), i10);
            canvas.translate(-f11, -f10);
        }
    }

    public b A(File file) {
        return new b(new r2.b(file));
    }

    public boolean B() {
        return this.N;
    }

    public boolean C() {
        return this.M;
    }

    public boolean D() {
        return this.I;
    }

    public boolean E() {
        return this.f5091x != this.f5072e;
    }

    public void F(int i10, boolean z10) {
        float f10 = -r(i10);
        if (this.I) {
            if (z10) {
                this.f5077j.g(this.f5090w, f10);
            } else {
                N(this.f5089v, f10);
            }
        } else if (z10) {
            this.f5077j.f(this.f5089v, f10);
        } else {
            N(f10, this.f5090w);
        }
        V(i10);
    }

    /* access modifiers changed from: package-private */
    public void I(com.shockwave.pdfium.a aVar, int i10, int i11) {
        this.f5093z = d.LOADED;
        this.f5082o = this.J.d(aVar);
        this.K = aVar;
        this.f5085r = i10;
        this.f5086s = i11;
        q();
        this.D = new e(this);
        if (!this.B.isAlive()) {
            this.B.start();
        }
        f fVar = new f(this.B.getLooper(), this, this.J, aVar);
        this.C = fVar;
        fVar.e();
        F(this.H, false);
    }

    /* access modifiers changed from: package-private */
    public void J(Throwable th2) {
        this.f5093z = d.ERROR;
        R();
        invalidate();
        Log.e(T, "load pdf error", th2);
    }

    /* access modifiers changed from: package-private */
    public void K() {
        float f10;
        float f11;
        int width;
        if (getPageCount() != 0) {
            int i10 = this.R;
            float pageCount = (float) (i10 - (i10 / getPageCount()));
            if (this.I) {
                f10 = this.f5090w;
                f11 = this.f5088u + pageCount;
                width = getHeight();
            } else {
                f10 = this.f5089v;
                f11 = this.f5087t + pageCount;
                width = getWidth();
            }
            int floor = (int) Math.floor((double) ((Math.abs(f10) + (((float) width) / 2.0f)) / W(f11)));
            if (floor < 0 || floor > getPageCount() - 1 || floor == getCurrentPage()) {
                L();
            } else {
                V(floor);
            }
        }
    }

    public void L() {
        f fVar;
        if (this.f5087t != 0.0f && this.f5088u != 0.0f && (fVar = this.C) != null) {
            fVar.removeMessages(1);
            this.f5076i.h();
            this.D.e();
            S();
        }
    }

    public void M(float f10, float f11) {
        N(this.f5089v + f10, this.f5090w + f11);
    }

    public void N(float f10, float f11) {
        O(f10, f11, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r6 > r7) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r7 = com.github.barteksc.pdfviewer.PDFView.c.f5108f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r7 = com.github.barteksc.pdfviewer.PDFView.c.f5107e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r5 > r7) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void O(float r5, float r6, boolean r7) {
        /*
            r4 = this;
            boolean r7 = r4.I
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 0
            if (r7 == 0) goto L_0x007a
            float r7 = r4.f5087t
            float r7 = r4.W(r7)
            int r2 = r4.getWidth()
            float r2 = (float) r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            int r5 = r4.getWidth()
            int r5 = r5 / 2
            float r5 = (float) r5
            float r7 = r7 / r0
        L_0x001e:
            float r5 = r5 - r7
            goto L_0x0037
        L_0x0020:
            int r2 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0026
            r5 = r1
            goto L_0x0037
        L_0x0026:
            float r2 = r5 + r7
            int r3 = r4.getWidth()
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0037
            int r5 = r4.getWidth()
            float r5 = (float) r5
            goto L_0x001e
        L_0x0037:
            float r7 = r4.p()
            int r2 = r4.getHeight()
            float r2 = (float) r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x004c
            int r6 = r4.getHeight()
            float r6 = (float) r6
            float r6 = r6 - r7
            float r6 = r6 / r0
            goto L_0x0064
        L_0x004c:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0052
            r6 = r1
            goto L_0x0064
        L_0x0052:
            float r0 = r6 + r7
            int r1 = r4.getHeight()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0064
            float r6 = -r7
            int r7 = r4.getHeight()
            float r7 = (float) r7
            float r6 = r6 + r7
        L_0x0064:
            float r7 = r4.f5090w
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
        L_0x006a:
            com.github.barteksc.pdfviewer.PDFView$c r7 = com.github.barteksc.pdfviewer.PDFView.c.END
        L_0x006c:
            r4.f5075h = r7
            goto L_0x00e3
        L_0x0070:
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0077
        L_0x0074:
            com.github.barteksc.pdfviewer.PDFView$c r7 = com.github.barteksc.pdfviewer.PDFView.c.START
            goto L_0x006c
        L_0x0077:
            com.github.barteksc.pdfviewer.PDFView$c r7 = com.github.barteksc.pdfviewer.PDFView.c.NONE
            goto L_0x006c
        L_0x007a:
            float r7 = r4.f5088u
            float r7 = r4.W(r7)
            int r2 = r4.getHeight()
            float r2 = (float) r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0093
            int r6 = r4.getHeight()
            int r6 = r6 / 2
            float r6 = (float) r6
            float r7 = r7 / r0
        L_0x0091:
            float r6 = r6 - r7
            goto L_0x00aa
        L_0x0093:
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0099
            r6 = r1
            goto L_0x00aa
        L_0x0099:
            float r2 = r6 + r7
            int r3 = r4.getHeight()
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00aa
            int r6 = r4.getHeight()
            float r6 = (float) r6
            goto L_0x0091
        L_0x00aa:
            float r7 = r4.p()
            int r2 = r4.getWidth()
            float r2 = (float) r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x00bf
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r5 = r5 - r7
            float r5 = r5 / r0
            goto L_0x00d7
        L_0x00bf:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c5
            r5 = r1
            goto L_0x00d7
        L_0x00c5:
            float r0 = r5 + r7
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
            float r5 = -r7
            int r7 = r4.getWidth()
            float r7 = (float) r7
            float r5 = r5 + r7
        L_0x00d7:
            float r7 = r4.f5089v
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00de
            goto L_0x006a
        L_0x00de:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0077
            goto L_0x0074
        L_0x00e3:
            r4.f5089v = r5
            r4.f5090w = r6
            r4.getPositionOffset()
            r4.S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.O(float, float, boolean):void");
    }

    public void P(p2.a aVar) {
        if (this.f5093z == d.LOADED) {
            this.f5093z = d.SHOWN;
        }
        if (aVar.h()) {
            this.f5076i.b(aVar);
        } else {
            this.f5076i.a(aVar);
        }
        S();
    }

    /* access modifiers changed from: package-private */
    public void Q(n2.a aVar) {
        String str = T;
        Log.e(str, "Cannot open page " + aVar.a(), aVar.getCause());
    }

    public void R() {
        com.shockwave.pdfium.a aVar;
        this.f5077j.i();
        f fVar = this.C;
        if (fVar != null) {
            fVar.f();
            this.C.removeMessages(1);
        }
        c cVar = this.A;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f5076i.i();
        PdfiumCore pdfiumCore = this.J;
        if (!(pdfiumCore == null || (aVar = this.K) == null)) {
            pdfiumCore.a(aVar);
        }
        this.C = null;
        this.f5079l = null;
        this.f5080m = null;
        this.f5081n = null;
        this.K = null;
        this.L = false;
        this.f5090w = 0.0f;
        this.f5089v = 0.0f;
        this.f5091x = 1.0f;
        this.f5092y = true;
        this.f5093z = d.DEFAULT;
    }

    /* access modifiers changed from: package-private */
    public void S() {
        invalidate();
    }

    public void T() {
        a0(this.f5072e);
    }

    public void U(float f10, boolean z10) {
        if (this.I) {
            O(this.f5089v, ((-p()) + ((float) getHeight())) * f10, z10);
        } else {
            O(((-p()) + ((float) getWidth())) * f10, this.f5090w, z10);
        }
        K();
    }

    /* access modifiers changed from: package-private */
    public void V(int i10) {
        if (!this.f5092y) {
            int s10 = s(i10);
            this.f5083p = s10;
            this.f5084q = s10;
            int[] iArr = this.f5081n;
            if (iArr != null && s10 >= 0 && s10 < iArr.length) {
                this.f5084q = iArr[s10];
            }
            L();
        }
    }

    public float W(float f10) {
        return f10 * this.f5091x;
    }

    public void X(float f10, PointF pointF) {
        Y(this.f5091x * f10, pointF);
    }

    public void Y(float f10, PointF pointF) {
        float f11 = f10 / this.f5091x;
        Z(f10);
        float f12 = pointF.x;
        float f13 = pointF.y;
        N((this.f5089v * f11) + (f12 - (f12 * f11)), (this.f5090w * f11) + (f13 - (f11 * f13)));
    }

    public void Z(float f10) {
        this.f5091x = f10;
    }

    public void a0(float f10) {
        this.f5077j.h((float) (getWidth() / 2), (float) (getHeight() / 2), this.f5091x, f10);
    }

    public void b0(float f10, float f11, float f12) {
        this.f5077j.h(f10, f11, this.f5091x, f12);
    }

    public boolean canScrollHorizontally(int i10) {
        if (this.I) {
            if (i10 >= 0 || this.f5089v >= 0.0f) {
                return i10 > 0 && this.f5089v + W(this.f5087t) > ((float) getWidth());
            }
            return true;
        } else if (i10 >= 0 || this.f5089v >= 0.0f) {
            return i10 > 0 && this.f5089v + p() > ((float) getWidth());
        } else {
            return true;
        }
    }

    public boolean canScrollVertically(int i10) {
        if (this.I) {
            if (i10 >= 0 || this.f5090w >= 0.0f) {
                return i10 > 0 && this.f5090w + p() > ((float) getHeight());
            }
            return true;
        } else if (i10 >= 0 || this.f5090w >= 0.0f) {
            return i10 > 0 && this.f5090w + W(this.f5088u) > ((float) getHeight());
        } else {
            return true;
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (!isInEditMode()) {
            this.f5077j.c();
        }
    }

    public int getCurrentPage() {
        return this.f5083p;
    }

    public float getCurrentXOffset() {
        return this.f5089v;
    }

    public float getCurrentYOffset() {
        return this.f5090w;
    }

    public a.b getDocumentMeta() {
        com.shockwave.pdfium.a aVar = this.K;
        if (aVar == null) {
            return null;
        }
        return this.J.b(aVar);
    }

    /* access modifiers changed from: package-private */
    public int getDocumentPageCount() {
        return this.f5082o;
    }

    /* access modifiers changed from: package-private */
    public int[] getFilteredUserPageIndexes() {
        return this.f5081n;
    }

    /* access modifiers changed from: package-private */
    public int[] getFilteredUserPages() {
        return this.f5080m;
    }

    public int getInvalidPageColor() {
        return this.G;
    }

    public float getMaxZoom() {
        return this.f5074g;
    }

    public float getMidZoom() {
        return this.f5073f;
    }

    public float getMinZoom() {
        return this.f5072e;
    }

    /* access modifiers changed from: package-private */
    public o2.d getOnPageChangeListener() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public f getOnPageScrollListener() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public g getOnRenderListener() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public h getOnTapListener() {
        return null;
    }

    public float getOptimalPageHeight() {
        return this.f5088u;
    }

    public float getOptimalPageWidth() {
        return this.f5087t;
    }

    /* access modifiers changed from: package-private */
    public int[] getOriginalUserPages() {
        return this.f5079l;
    }

    public int getPageCount() {
        int[] iArr = this.f5079l;
        return iArr != null ? iArr.length : this.f5082o;
    }

    public float getPositionOffset() {
        float f10;
        float p10;
        int width;
        if (this.I) {
            f10 = -this.f5090w;
            p10 = p();
            width = getHeight();
        } else {
            f10 = -this.f5089v;
            p10 = p();
            width = getWidth();
        }
        return s2.c.c(f10 / (p10 - ((float) width)), 0.0f, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public c getScrollDir() {
        return this.f5075h;
    }

    /* access modifiers changed from: package-private */
    public q2.a getScrollHandle() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int getSpacingPx() {
        return this.R;
    }

    public List<a.C0277a> getTableOfContents() {
        com.shockwave.pdfium.a aVar = this.K;
        return aVar == null ? new ArrayList() : this.J.g(aVar);
    }

    public float getZoom() {
        return this.f5091x;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        R();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (!isInEditMode()) {
            if (this.P) {
                canvas.setDrawFilter(this.Q);
            }
            Drawable background = getBackground();
            if (background == null) {
                canvas.drawColor(-1);
            } else {
                background.draw(canvas);
            }
            if (!this.f5092y && this.f5093z == d.SHOWN) {
                float f10 = this.f5089v;
                float f11 = this.f5090w;
                canvas.translate(f10, f11);
                for (p2.a u10 : this.f5076i.f()) {
                    u(canvas, u10);
                }
                for (p2.a u11 : this.f5076i.e()) {
                    u(canvas, u11);
                }
                for (Integer intValue : this.S) {
                    v(canvas, intValue.intValue(), (o2.a) null);
                }
                this.S.clear();
                v(canvas, this.f5083p, (o2.a) null);
                canvas.translate(-f10, -f11);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        if (!isInEditMode() && this.f5093z == d.SHOWN) {
            this.f5077j.i();
            q();
            if (this.I) {
                f10 = this.f5089v;
                f11 = -r(this.f5083p);
            } else {
                f10 = -r(this.f5083p);
                f11 = this.f5090w;
            }
            N(f10, f11);
            K();
        }
    }

    /* access modifiers changed from: package-private */
    public float p() {
        float f10;
        float f11;
        int pageCount = getPageCount();
        if (this.I) {
            f10 = (float) pageCount;
            f11 = this.f5088u;
        } else {
            f10 = (float) pageCount;
            f11 = this.f5087t;
        }
        return W((f10 * f11) + ((float) ((pageCount - 1) * this.R)));
    }

    public void setMaxZoom(float f10) {
        this.f5074g = f10;
    }

    public void setMidZoom(float f10) {
        this.f5073f = f10;
    }

    public void setMinZoom(float f10) {
        this.f5072e = f10;
    }

    public void setPositionOffset(float f10) {
        U(f10, true);
    }

    public void setSwipeVertical(boolean z10) {
        this.I = z10;
    }

    public boolean t() {
        return this.O;
    }

    public void w(boolean z10) {
        this.N = z10;
    }

    public void x(boolean z10) {
        this.P = z10;
    }

    public void y(boolean z10) {
        this.f5078k.a(z10);
    }

    public void z(boolean z10) {
        this.f5078k.e(z10);
    }
}
