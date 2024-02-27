package com.facebook.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: v  reason: collision with root package name */
    private static final PorterDuffXfermode f5029v = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* renamed from: e  reason: collision with root package name */
    private Paint f5030e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f5031f;

    /* renamed from: g  reason: collision with root package name */
    private d f5032g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public g f5033h;

    /* renamed from: i  reason: collision with root package name */
    private Bitmap f5034i;

    /* renamed from: j  reason: collision with root package name */
    private Bitmap f5035j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f5036k;

    /* renamed from: l  reason: collision with root package name */
    private int f5037l;

    /* renamed from: m  reason: collision with root package name */
    private int f5038m;

    /* renamed from: n  reason: collision with root package name */
    private int f5039n;

    /* renamed from: o  reason: collision with root package name */
    private int f5040o;

    /* renamed from: p  reason: collision with root package name */
    private int f5041p;

    /* renamed from: q  reason: collision with root package name */
    private int f5042q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public boolean f5043r;

    /* renamed from: s  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f5044s;

    /* renamed from: t  reason: collision with root package name */
    protected ValueAnimator f5045t;

    /* renamed from: u  reason: collision with root package name */
    protected Bitmap f5046u;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            boolean a10 = ShimmerFrameLayout.this.f5043r;
            ShimmerFrameLayout.this.l();
            if (ShimmerFrameLayout.this.f5036k || a10) {
                ShimmerFrameLayout.this.o();
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float max = Math.max(0.0f, Math.min(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            ShimmerFrameLayout shimmerFrameLayout = ShimmerFrameLayout.this;
            float f10 = 1.0f - max;
            shimmerFrameLayout.setMaskOffsetX((int) ((((float) shimmerFrameLayout.f5033h.f5068a) * f10) + (((float) ShimmerFrameLayout.this.f5033h.f5070c) * max)));
            ShimmerFrameLayout shimmerFrameLayout2 = ShimmerFrameLayout.this;
            shimmerFrameLayout2.setMaskOffsetY((int) ((((float) shimmerFrameLayout2.f5033h.f5069b) * f10) + (((float) ShimmerFrameLayout.this.f5033h.f5071d) * max)));
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f5049a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f5050b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|5|6|7|8|(2:9|10)|11|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0028 */
        static {
            /*
                com.facebook.shimmer.ShimmerFrameLayout$e[] r0 = com.facebook.shimmer.ShimmerFrameLayout.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5050b = r0
                r1 = 1
                com.facebook.shimmer.ShimmerFrameLayout$e r2 = com.facebook.shimmer.ShimmerFrameLayout.e.CW_0     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5050b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.shimmer.ShimmerFrameLayout$e r3 = com.facebook.shimmer.ShimmerFrameLayout.e.CW_90     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f5050b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.shimmer.ShimmerFrameLayout$e r3 = com.facebook.shimmer.ShimmerFrameLayout.e.CW_180     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r2 = f5050b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.shimmer.ShimmerFrameLayout$e r3 = com.facebook.shimmer.ShimmerFrameLayout.e.CW_270     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.facebook.shimmer.ShimmerFrameLayout$f[] r2 = com.facebook.shimmer.ShimmerFrameLayout.f.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f5049a = r2
                com.facebook.shimmer.ShimmerFrameLayout$f r3 = com.facebook.shimmer.ShimmerFrameLayout.f.LINEAR     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f5049a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.facebook.shimmer.ShimmerFrameLayout$f r2 = com.facebook.shimmer.ShimmerFrameLayout.f.RADIAL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.c.<clinit>():void");
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public e f5051a;

        /* renamed from: b  reason: collision with root package name */
        public float f5052b;

        /* renamed from: c  reason: collision with root package name */
        public float f5053c;

        /* renamed from: d  reason: collision with root package name */
        public int f5054d;

        /* renamed from: e  reason: collision with root package name */
        public int f5055e;

        /* renamed from: f  reason: collision with root package name */
        public float f5056f;

        /* renamed from: g  reason: collision with root package name */
        public float f5057g;

        /* renamed from: h  reason: collision with root package name */
        public float f5058h;

        /* renamed from: i  reason: collision with root package name */
        public f f5059i;

        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        public int[] a() {
            return c.f5049a[this.f5059i.ordinal()] != 2 ? new int[]{0, -16777216, -16777216, 0} : new int[]{-16777216, -16777216, 0};
        }

        public float[] b() {
            if (c.f5049a[this.f5059i.ordinal()] != 2) {
                return new float[]{Math.max(((1.0f - this.f5056f) - this.f5053c) / 2.0f, 0.0f), Math.max((1.0f - this.f5056f) / 2.0f, 0.0f), Math.min((this.f5056f + 1.0f) / 2.0f, 1.0f), Math.min(((this.f5056f + 1.0f) + this.f5053c) / 2.0f, 1.0f)};
            }
            return new float[]{0.0f, Math.min(this.f5056f, 1.0f), Math.min(this.f5056f + this.f5053c, 1.0f)};
        }

        public int c(int i10) {
            int i11 = this.f5055e;
            return i11 > 0 ? i11 : (int) (((float) i10) * this.f5058h);
        }

        public int d(int i10) {
            int i11 = this.f5054d;
            return i11 > 0 ? i11 : (int) (((float) i10) * this.f5057g);
        }
    }

    public enum e {
        CW_0,
        CW_90,
        CW_180,
        CW_270
    }

    public enum f {
        LINEAR,
        RADIAL
    }

    private static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f5068a;

        /* renamed from: b  reason: collision with root package name */
        public int f5069b;

        /* renamed from: c  reason: collision with root package name */
        public int f5070c;

        /* renamed from: d  reason: collision with root package name */
        public int f5071d;

        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        public void a(int i10, int i11, int i12, int i13) {
            this.f5068a = i10;
            this.f5069b = i11;
            this.f5070c = i12;
            this.f5071d = i13;
        }
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static float g(float f10, float f11, float f12) {
        return Math.min(f11, Math.max(f10, f12));
    }

    private ViewTreeObserver.OnGlobalLayoutListener getLayoutListener() {
        return new a();
    }

    /* JADX WARNING: type inference failed for: r19v1 */
    /* JADX WARNING: type inference failed for: r9v11, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r11v2, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap getMaskBitmap() {
        /*
            r20 = this;
            r0 = r20
            android.graphics.Bitmap r1 = r0.f5046u
            if (r1 == 0) goto L_0x0007
            return r1
        L_0x0007:
            com.facebook.shimmer.ShimmerFrameLayout$d r1 = r0.f5032g
            int r2 = r20.getWidth()
            int r1 = r1.d(r2)
            com.facebook.shimmer.ShimmerFrameLayout$d r2 = r0.f5032g
            int r3 = r20.getHeight()
            int r2 = r2.c(r3)
            android.graphics.Bitmap r3 = h(r1, r2)
            r0.f5046u = r3
            android.graphics.Canvas r4 = new android.graphics.Canvas
            android.graphics.Bitmap r3 = r0.f5046u
            r4.<init>(r3)
            int[] r3 = com.facebook.shimmer.ShimmerFrameLayout.c.f5049a
            com.facebook.shimmer.ShimmerFrameLayout$d r5 = r0.f5032g
            com.facebook.shimmer.ShimmerFrameLayout$f r5 = r5.f5059i
            int r5 = r5.ordinal()
            r3 = r3[r5]
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r7 = 2
            if (r3 == r7) goto L_0x007a
            int[] r3 = com.facebook.shimmer.ShimmerFrameLayout.c.f5050b
            com.facebook.shimmer.ShimmerFrameLayout$d r8 = r0.f5032g
            com.facebook.shimmer.ShimmerFrameLayout$e r8 = r8.f5051a
            int r8 = r8.ordinal()
            r3 = r3[r8]
            r8 = 0
            if (r3 == r7) goto L_0x005b
            r9 = 3
            if (r3 == r9) goto L_0x0056
            r9 = 4
            if (r3 == r9) goto L_0x0052
            r9 = r1
            r3 = r8
            r10 = r3
            goto L_0x005e
        L_0x0052:
            r3 = r2
            r9 = r8
            r10 = r9
            goto L_0x005e
        L_0x0056:
            r3 = r8
            r9 = r3
            r10 = r9
            r8 = r1
            goto L_0x005e
        L_0x005b:
            r10 = r2
            r3 = r8
            r9 = r3
        L_0x005e:
            android.graphics.LinearGradient r19 = new android.graphics.LinearGradient
            float r12 = (float) r8
            float r13 = (float) r3
            float r14 = (float) r9
            float r15 = (float) r10
            com.facebook.shimmer.ShimmerFrameLayout$d r3 = r0.f5032g
            int[] r16 = r3.a()
            com.facebook.shimmer.ShimmerFrameLayout$d r3 = r0.f5032g
            float[] r17 = r3.b()
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.REPEAT
            r11 = r19
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
        L_0x0077:
            r3 = r19
            goto L_0x00a1
        L_0x007a:
            int r3 = r1 / 2
            int r8 = r2 / 2
            android.graphics.RadialGradient r19 = new android.graphics.RadialGradient
            float r10 = (float) r3
            float r11 = (float) r8
            int r3 = java.lang.Math.max(r1, r2)
            double r8 = (double) r3
            double r12 = java.lang.Math.sqrt(r5)
            double r8 = r8 / r12
            float r12 = (float) r8
            com.facebook.shimmer.ShimmerFrameLayout$d r3 = r0.f5032g
            int[] r13 = r3.a()
            com.facebook.shimmer.ShimmerFrameLayout$d r3 = r0.f5032g
            float[] r14 = r3.b()
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.REPEAT
            r9 = r19
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L_0x0077
        L_0x00a1:
            com.facebook.shimmer.ShimmerFrameLayout$d r8 = r0.f5032g
            float r8 = r8.f5052b
            int r9 = r1 / 2
            float r9 = (float) r9
            int r10 = r2 / 2
            float r10 = (float) r10
            r4.rotate(r8, r9, r10)
            android.graphics.Paint r9 = new android.graphics.Paint
            r9.<init>()
            r9.setShader(r3)
            double r5 = java.lang.Math.sqrt(r5)
            int r3 = java.lang.Math.max(r1, r2)
            double r10 = (double) r3
            double r5 = r5 * r10
            int r3 = (int) r5
            int r3 = r3 / r7
            int r5 = -r3
            float r6 = (float) r5
            int r1 = r1 + r3
            float r7 = (float) r1
            int r2 = r2 + r3
            float r8 = (float) r2
            r5 = r6
            r4.drawRect(r5, r6, r7, r8, r9)
            android.graphics.Bitmap r1 = r0.f5046u
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout.getMaskBitmap():android.graphics.Bitmap");
    }

    private Animator getShimmerAnimation() {
        ValueAnimator valueAnimator = this.f5045t;
        if (valueAnimator != null) {
            return valueAnimator;
        }
        int width = getWidth();
        int height = getHeight();
        int i10 = c.f5049a[this.f5032g.f5059i.ordinal()];
        int i11 = c.f5050b[this.f5032g.f5051a.ordinal()];
        if (i11 == 2) {
            this.f5033h.a(0, -height, 0, height);
        } else if (i11 == 3) {
            this.f5033h.a(width, 0, -width, 0);
        } else if (i11 != 4) {
            this.f5033h.a(-width, 0, width, 0);
        } else {
            this.f5033h.a(0, height, 0, -height);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (((float) this.f5039n) / ((float) this.f5037l)) + 1.0f});
        this.f5045t = ofFloat;
        ofFloat.setDuration((long) (this.f5037l + this.f5039n));
        this.f5045t.setRepeatCount(this.f5038m);
        this.f5045t.setRepeatMode(this.f5040o);
        this.f5045t.addUpdateListener(new b());
        return this.f5045t;
    }

    protected static Bitmap h(int i10, int i11) {
        try {
            return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            System.gc();
            return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        }
    }

    private boolean i(Canvas canvas) {
        Bitmap s10 = s();
        Bitmap r10 = r();
        if (s10 == null || r10 == null) {
            return false;
        }
        k(new Canvas(s10));
        canvas.drawBitmap(s10, 0.0f, 0.0f, this.f5030e);
        j(new Canvas(r10));
        canvas.drawBitmap(r10, 0.0f, 0.0f, (Paint) null);
        return true;
    }

    private void j(Canvas canvas) {
        Bitmap maskBitmap = getMaskBitmap();
        if (maskBitmap != null) {
            int i10 = this.f5041p;
            canvas.clipRect(i10, this.f5042q, maskBitmap.getWidth() + i10, this.f5042q + maskBitmap.getHeight());
            super.dispatchDraw(canvas);
            canvas.drawBitmap(maskBitmap, (float) this.f5041p, (float) this.f5042q, this.f5031f);
        }
    }

    private void k(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: private */
    public void l() {
        p();
        m();
        n();
    }

    private void m() {
        Bitmap bitmap = this.f5046u;
        if (bitmap != null) {
            bitmap.recycle();
            this.f5046u = null;
        }
    }

    private void n() {
        Bitmap bitmap = this.f5035j;
        if (bitmap != null) {
            bitmap.recycle();
            this.f5035j = null;
        }
        Bitmap bitmap2 = this.f5034i;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.f5034i = null;
        }
    }

    private Bitmap q() {
        int width = getWidth();
        int height = getHeight();
        try {
            return h(width, height);
        } catch (OutOfMemoryError unused) {
            StringBuilder sb2 = new StringBuilder("ShimmerFrameLayout failed to create working bitmap");
            sb2.append(" (width = ");
            sb2.append(width);
            sb2.append(", height = ");
            sb2.append(height);
            sb2.append(")\n\n");
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                sb2.append(stackTraceElement.toString());
                sb2.append("\n");
            }
            Log.d("ShimmerFrameLayout", sb2.toString());
            return null;
        }
    }

    private Bitmap r() {
        if (this.f5034i == null) {
            this.f5034i = q();
        }
        return this.f5034i;
    }

    private Bitmap s() {
        if (this.f5035j == null) {
            this.f5035j = q();
        }
        return this.f5035j;
    }

    /* access modifiers changed from: private */
    public void setMaskOffsetX(int i10) {
        if (this.f5041p != i10) {
            this.f5041p = i10;
            invalidate();
        }
    }

    /* access modifiers changed from: private */
    public void setMaskOffsetY(int i10) {
        if (this.f5042q != i10) {
            this.f5042q = i10;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.f5043r || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
        } else {
            i(canvas);
        }
    }

    public e getAngle() {
        return this.f5032g.f5051a;
    }

    public float getBaseAlpha() {
        return ((float) this.f5030e.getAlpha()) / 255.0f;
    }

    public float getDropoff() {
        return this.f5032g.f5053c;
    }

    public int getDuration() {
        return this.f5037l;
    }

    public int getFixedHeight() {
        return this.f5032g.f5055e;
    }

    public int getFixedWidth() {
        return this.f5032g.f5054d;
    }

    public float getIntensity() {
        return this.f5032g.f5056f;
    }

    public f getMaskShape() {
        return this.f5032g.f5059i;
    }

    public float getRelativeHeight() {
        return this.f5032g.f5058h;
    }

    public float getRelativeWidth() {
        return this.f5032g.f5057g;
    }

    public int getRepeatCount() {
        return this.f5038m;
    }

    public int getRepeatDelay() {
        return this.f5039n;
    }

    public int getRepeatMode() {
        return this.f5040o;
    }

    public float getTilt() {
        return this.f5032g.f5052b;
    }

    public void o() {
        if (!this.f5043r) {
            getShimmerAnimation().start();
            this.f5043r = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5044s == null) {
            this.f5044s = getLayoutListener();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f5044s);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        p();
        if (this.f5044s != null) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f5044s);
            this.f5044s = null;
        }
        super.onDetachedFromWindow();
    }

    public void p() {
        ValueAnimator valueAnimator = this.f5045t;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f5045t.removeAllUpdateListeners();
            this.f5045t.cancel();
        }
        this.f5045t = null;
        this.f5043r = false;
    }

    public void setAngle(e eVar) {
        this.f5032g.f5051a = eVar;
        l();
    }

    public void setAutoStart(boolean z10) {
        this.f5036k = z10;
        l();
    }

    public void setBaseAlpha(float f10) {
        this.f5030e.setAlpha((int) (g(0.0f, 1.0f, f10) * 255.0f));
        l();
    }

    public void setDropoff(float f10) {
        this.f5032g.f5053c = f10;
        l();
    }

    public void setDuration(int i10) {
        this.f5037l = i10;
        l();
    }

    public void setFixedHeight(int i10) {
        this.f5032g.f5055e = i10;
        l();
    }

    public void setFixedWidth(int i10) {
        this.f5032g.f5054d = i10;
        l();
    }

    public void setIntensity(float f10) {
        this.f5032g.f5056f = f10;
        l();
    }

    public void setMaskShape(f fVar) {
        this.f5032g.f5059i = fVar;
        l();
    }

    public void setRelativeHeight(int i10) {
        this.f5032g.f5058h = (float) i10;
        l();
    }

    public void setRelativeWidth(int i10) {
        this.f5032g.f5057g = (float) i10;
        l();
    }

    public void setRepeatCount(int i10) {
        this.f5038m = i10;
        l();
    }

    public void setRepeatDelay(int i10) {
        this.f5039n = i10;
        l();
    }

    public void setRepeatMode(int i10) {
        this.f5040o = i10;
        l();
    }

    public void setTilt(float f10) {
        this.f5032g.f5052b = f10;
        l();
    }

    public void t() {
        setAutoStart(false);
        setDuration(1000);
        setRepeatCount(-1);
        setRepeatDelay(0);
        setRepeatMode(1);
        d dVar = this.f5032g;
        dVar.f5051a = e.CW_0;
        dVar.f5059i = f.LINEAR;
        dVar.f5053c = 0.5f;
        dVar.f5054d = 0;
        dVar.f5055e = 0;
        dVar.f5056f = 0.0f;
        dVar.f5057g = 1.0f;
        dVar.f5058h = 1.0f;
        dVar.f5052b = 20.0f;
        this.f5033h = new g((a) null);
        setBaseAlpha(0.3f);
        l();
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        d dVar;
        f fVar;
        d dVar2;
        e eVar;
        setWillNotDraw(false);
        this.f5032g = new d((a) null);
        this.f5030e = new Paint();
        Paint paint = new Paint();
        this.f5031f = paint;
        paint.setAntiAlias(true);
        this.f5031f.setDither(true);
        this.f5031f.setFilterBitmap(true);
        this.f5031f.setXfermode(f5029v);
        t();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m2.a.f13729a, 0, 0);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    setAutoStart(obtainStyledAttributes.getBoolean(0, false));
                }
                if (obtainStyledAttributes.hasValue(1)) {
                    setBaseAlpha(obtainStyledAttributes.getFloat(1, 0.0f));
                }
                if (obtainStyledAttributes.hasValue(2)) {
                    setDuration(obtainStyledAttributes.getInt(2, 0));
                }
                if (obtainStyledAttributes.hasValue(3)) {
                    setRepeatCount(obtainStyledAttributes.getInt(3, 0));
                }
                if (obtainStyledAttributes.hasValue(4)) {
                    setRepeatDelay(obtainStyledAttributes.getInt(4, 0));
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    setRepeatMode(obtainStyledAttributes.getInt(5, 0));
                }
                if (obtainStyledAttributes.hasValue(6)) {
                    int i11 = obtainStyledAttributes.getInt(6, 0);
                    if (i11 == 90) {
                        dVar2 = this.f5032g;
                        eVar = e.CW_90;
                    } else if (i11 == 180) {
                        dVar2 = this.f5032g;
                        eVar = e.CW_180;
                    } else if (i11 != 270) {
                        dVar2 = this.f5032g;
                        eVar = e.CW_0;
                    } else {
                        dVar2 = this.f5032g;
                        eVar = e.CW_270;
                    }
                    dVar2.f5051a = eVar;
                }
                if (obtainStyledAttributes.hasValue(13)) {
                    if (obtainStyledAttributes.getInt(13, 0) != 1) {
                        dVar = this.f5032g;
                        fVar = f.LINEAR;
                    } else {
                        dVar = this.f5032g;
                        fVar = f.RADIAL;
                    }
                    dVar.f5059i = fVar;
                }
                if (obtainStyledAttributes.hasValue(7)) {
                    this.f5032g.f5053c = obtainStyledAttributes.getFloat(7, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(8)) {
                    this.f5032g.f5054d = obtainStyledAttributes.getDimensionPixelSize(8, 0);
                }
                if (obtainStyledAttributes.hasValue(9)) {
                    this.f5032g.f5055e = obtainStyledAttributes.getDimensionPixelSize(9, 0);
                }
                if (obtainStyledAttributes.hasValue(10)) {
                    this.f5032g.f5056f = obtainStyledAttributes.getFloat(10, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(11)) {
                    this.f5032g.f5057g = obtainStyledAttributes.getFloat(11, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(12)) {
                    this.f5032g.f5058h = obtainStyledAttributes.getFloat(12, 0.0f);
                }
                if (obtainStyledAttributes.hasValue(14)) {
                    this.f5032g.f5052b = obtainStyledAttributes.getFloat(14, 0.0f);
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
    }
}
