package c0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.m0;
import java.util.Arrays;

public class d {

    /* renamed from: x  reason: collision with root package name */
    private static final Interpolator f4571x = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f4572a;

    /* renamed from: b  reason: collision with root package name */
    private int f4573b;

    /* renamed from: c  reason: collision with root package name */
    private int f4574c = -1;

    /* renamed from: d  reason: collision with root package name */
    private float[] f4575d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f4576e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f4577f;

    /* renamed from: g  reason: collision with root package name */
    private float[] f4578g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f4579h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f4580i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f4581j;

    /* renamed from: k  reason: collision with root package name */
    private int f4582k;

    /* renamed from: l  reason: collision with root package name */
    private VelocityTracker f4583l;

    /* renamed from: m  reason: collision with root package name */
    private float f4584m;

    /* renamed from: n  reason: collision with root package name */
    private float f4585n;

    /* renamed from: o  reason: collision with root package name */
    private int f4586o;

    /* renamed from: p  reason: collision with root package name */
    private final int f4587p;

    /* renamed from: q  reason: collision with root package name */
    private int f4588q;

    /* renamed from: r  reason: collision with root package name */
    private OverScroller f4589r;

    /* renamed from: s  reason: collision with root package name */
    private final c f4590s;

    /* renamed from: t  reason: collision with root package name */
    private View f4591t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4592u;

    /* renamed from: v  reason: collision with root package name */
    private final ViewGroup f4593v;

    /* renamed from: w  reason: collision with root package name */
    private final Runnable f4594w = new b();

    class a implements Interpolator {
        a() {
        }

        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            d.this.K(0);
        }
    }

    public static abstract class c {
        public abstract int a(View view, int i10, int i11);

        public abstract int b(View view, int i10, int i11);

        public int c(int i10) {
            return i10;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i10, int i11) {
        }

        public boolean g(int i10) {
            return false;
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public abstract void j(int i10);

        public abstract void k(View view, int i10, int i11, int i12, int i13);

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);
    }

    private d(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f4593v = viewGroup;
            this.f4590s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f4587p = i10;
            this.f4586o = i10;
            this.f4573b = viewConfiguration.getScaledTouchSlop();
            this.f4584m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4585n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4589r = new OverScroller(context, f4571x);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    private boolean D(int i10) {
        if (C(i10)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f4583l.computeCurrentVelocity(1000, this.f4584m);
        p(g(this.f4583l.getXVelocity(this.f4574c), this.f4585n, this.f4584m), g(this.f4583l.getYVelocity(this.f4574c), this.f4585n, this.f4584m));
    }

    private void H(float f10, float f11, int i10) {
        boolean c10 = c(f10, f11, i10, 1);
        if (c(f11, f10, i10, 4)) {
            c10 |= true;
        }
        if (c(f10, f11, i10, 2)) {
            c10 |= true;
        }
        if (c(f11, f10, i10, 8)) {
            c10 |= true;
        }
        if (c10) {
            int[] iArr = this.f4580i;
            iArr[i10] = iArr[i10] | c10;
            this.f4590s.f(c10 ? 1 : 0, i10);
        }
    }

    private void I(float f10, float f11, int i10) {
        s(i10);
        float[] fArr = this.f4575d;
        this.f4577f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f4576e;
        this.f4578g[i10] = f11;
        fArr2[i10] = f11;
        this.f4579h[i10] = y((int) f10, (int) f11);
        this.f4582k |= 1 << i10;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (D(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f4577f[pointerId] = x10;
                this.f4578g[pointerId] = y10;
            }
        }
    }

    private boolean c(float f10, float f11, int i10, int i11) {
        float abs = Math.abs(f10);
        float abs2 = Math.abs(f11);
        if ((this.f4579h[i10] & i11) != i11 || (this.f4588q & i11) == 0 || (this.f4581j[i10] & i11) == i11 || (this.f4580i[i10] & i11) == i11) {
            return false;
        }
        int i12 = this.f4573b;
        if (abs <= ((float) i12) && abs2 <= ((float) i12)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f4590s.g(i11)) {
            return (this.f4580i[i10] & i11) == 0 && abs > ((float) this.f4573b);
        }
        int[] iArr = this.f4581j;
        iArr[i10] = iArr[i10] | i11;
        return false;
    }

    private boolean f(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f4590s.d(view) > 0;
        boolean z11 = this.f4590s.e(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f4573b) : z11 && Math.abs(f11) > ((float) this.f4573b);
        }
        int i10 = this.f4573b;
        return (f10 * f10) + (f11 * f11) > ((float) (i10 * i10));
    }

    private float g(float f10, float f11, float f12) {
        float abs = Math.abs(f10);
        if (abs < f11) {
            return 0.0f;
        }
        if (abs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    private int h(int i10, int i11, int i12) {
        int abs = Math.abs(i10);
        if (abs < i11) {
            return 0;
        }
        if (abs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    private void i() {
        float[] fArr = this.f4575d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4576e, 0.0f);
            Arrays.fill(this.f4577f, 0.0f);
            Arrays.fill(this.f4578g, 0.0f);
            Arrays.fill(this.f4579h, 0);
            Arrays.fill(this.f4580i, 0);
            Arrays.fill(this.f4581j, 0);
            this.f4582k = 0;
        }
    }

    private void j(int i10) {
        if (this.f4575d != null && C(i10)) {
            this.f4575d[i10] = 0.0f;
            this.f4576e[i10] = 0.0f;
            this.f4577f[i10] = 0.0f;
            this.f4578g[i10] = 0.0f;
            this.f4579h[i10] = 0;
            this.f4580i[i10] = 0;
            this.f4581j[i10] = 0;
            this.f4582k = (~(1 << i10)) & this.f4582k;
        }
    }

    private int k(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f4593v.getWidth();
        float f10 = (float) (width / 2);
        float q10 = f10 + (q(Math.min(1.0f, ((float) Math.abs(i10)) / ((float) width))) * f10);
        int abs = Math.abs(i11);
        return Math.min(abs > 0 ? Math.round(Math.abs(q10 / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i10)) / ((float) i12)) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int h10 = h(i12, (int) this.f4585n, (int) this.f4584m);
        int h11 = h(i13, (int) this.f4585n, (int) this.f4584m);
        int abs = Math.abs(i10);
        int abs2 = Math.abs(i11);
        int abs3 = Math.abs(h10);
        int abs4 = Math.abs(h11);
        int i14 = abs3 + abs4;
        int i15 = abs + abs2;
        if (h10 != 0) {
            f10 = (float) abs3;
            f11 = (float) i14;
        } else {
            f10 = (float) abs;
            f11 = (float) i15;
        }
        float f14 = f10 / f11;
        if (h11 != 0) {
            f12 = (float) abs4;
            f13 = (float) i14;
        } else {
            f12 = (float) abs2;
            f13 = (float) i15;
        }
        float f15 = f12 / f13;
        return (int) ((((float) k(i10, h10, this.f4590s.d(view))) * f14) + (((float) k(i11, h11, this.f4590s.e(view))) * f15));
    }

    public static d n(ViewGroup viewGroup, float f10, c cVar) {
        d o10 = o(viewGroup, cVar);
        o10.f4573b = (int) (((float) o10.f4573b) * (1.0f / f10));
        return o10;
    }

    public static d o(ViewGroup viewGroup, c cVar) {
        return new d(viewGroup.getContext(), viewGroup, cVar);
    }

    private void p(float f10, float f11) {
        this.f4592u = true;
        this.f4590s.l(this.f4591t, f10, f11);
        this.f4592u = false;
        if (this.f4572a == 1) {
            K(0);
        }
    }

    private float q(float f10) {
        return (float) Math.sin((double) ((f10 - 0.5f) * 0.47123894f));
    }

    private void r(int i10, int i11, int i12, int i13) {
        int left = this.f4591t.getLeft();
        int top = this.f4591t.getTop();
        if (i12 != 0) {
            i10 = this.f4590s.a(this.f4591t, i10, i12);
            m0.a0(this.f4591t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f4590s.b(this.f4591t, i11, i13);
            m0.b0(this.f4591t, i11 - top);
        }
        int i15 = i11;
        if (i12 != 0 || i13 != 0) {
            this.f4590s.k(this.f4591t, i14, i15, i14 - left, i15 - top);
        }
    }

    private void s(int i10) {
        float[] fArr = this.f4575d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4576e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4577f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4578g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4579h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4580i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4581j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4575d = fArr2;
            this.f4576e = fArr3;
            this.f4577f = fArr4;
            this.f4578g = fArr5;
            this.f4579h = iArr;
            this.f4580i = iArr2;
            this.f4581j = iArr3;
        }
    }

    private boolean u(int i10, int i11, int i12, int i13) {
        int left = this.f4591t.getLeft();
        int top = this.f4591t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f4589r.abortAnimation();
            K(0);
            return false;
        }
        this.f4589r.startScroll(left, top, i14, i15, l(this.f4591t, i14, i15, i12, i13));
        K(2);
        return true;
    }

    private int y(int i10, int i11) {
        int i12 = i10 < this.f4593v.getLeft() + this.f4586o ? 1 : 0;
        if (i11 < this.f4593v.getTop() + this.f4586o) {
            i12 |= 4;
        }
        if (i10 > this.f4593v.getRight() - this.f4586o) {
            i12 |= 2;
        }
        return i11 > this.f4593v.getBottom() - this.f4586o ? i12 | 8 : i12;
    }

    public int A() {
        return this.f4572a;
    }

    public boolean B(int i10, int i11) {
        return E(this.f4591t, i10, i11);
    }

    public boolean C(int i10) {
        return ((1 << i10) & this.f4582k) != 0;
    }

    public boolean E(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r9.f4574c == -1) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        G();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getActionMasked()
            int r1 = r10.getActionIndex()
            if (r0 != 0) goto L_0x000d
            r9.a()
        L_0x000d:
            android.view.VelocityTracker r2 = r9.f4583l
            if (r2 != 0) goto L_0x0017
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r9.f4583l = r2
        L_0x0017:
            android.view.VelocityTracker r2 = r9.f4583l
            r2.addMovement(r10)
            r2 = 0
            if (r0 == 0) goto L_0x014a
            r3 = 1
            if (r0 == r3) goto L_0x0141
            r4 = 2
            if (r0 == r4) goto L_0x00be
            r4 = 3
            if (r0 == r4) goto L_0x00b1
            r4 = 5
            if (r0 == r4) goto L_0x0074
            r4 = 6
            if (r0 == r4) goto L_0x0030
            goto L_0x0172
        L_0x0030:
            int r0 = r10.getPointerId(r1)
            int r1 = r9.f4572a
            if (r1 != r3) goto L_0x006f
            int r1 = r9.f4574c
            if (r0 != r1) goto L_0x006f
            int r1 = r10.getPointerCount()
        L_0x0040:
            if (r2 >= r1) goto L_0x006c
            int r3 = r10.getPointerId(r2)
            int r4 = r9.f4574c
            if (r3 != r4) goto L_0x004b
            goto L_0x0069
        L_0x004b:
            float r4 = r10.getX(r2)
            float r5 = r10.getY(r2)
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.t(r4, r5)
            android.view.View r5 = r9.f4591t
            if (r4 != r5) goto L_0x0069
            boolean r3 = r9.R(r5, r3)
            if (r3 == 0) goto L_0x0069
            int r10 = r9.f4574c
            r1 = -1
            if (r10 != r1) goto L_0x006f
            goto L_0x006c
        L_0x0069:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x006c:
            r9.G()
        L_0x006f:
            r9.j(r0)
            goto L_0x0172
        L_0x0074:
            int r0 = r10.getPointerId(r1)
            float r2 = r10.getX(r1)
            float r10 = r10.getY(r1)
            r9.I(r2, r10, r0)
            int r1 = r9.f4572a
            if (r1 != 0) goto L_0x00a2
            int r1 = (int) r2
            int r10 = (int) r10
            android.view.View r10 = r9.t(r1, r10)
            r9.R(r10, r0)
            int[] r10 = r9.f4579h
            r10 = r10[r0]
            int r1 = r9.f4588q
            r2 = r10 & r1
            if (r2 == 0) goto L_0x0172
            c0.d$c r2 = r9.f4590s
            r10 = r10 & r1
            r2.h(r10, r0)
            goto L_0x0172
        L_0x00a2:
            int r1 = (int) r2
            int r10 = (int) r10
            boolean r10 = r9.B(r1, r10)
            if (r10 == 0) goto L_0x0172
            android.view.View r10 = r9.f4591t
            r9.R(r10, r0)
            goto L_0x0172
        L_0x00b1:
            int r10 = r9.f4572a
            if (r10 != r3) goto L_0x00b9
            r10 = 0
            r9.p(r10, r10)
        L_0x00b9:
            r9.a()
            goto L_0x0172
        L_0x00be:
            int r0 = r9.f4572a
            if (r0 != r3) goto L_0x00fe
            int r0 = r9.f4574c
            boolean r0 = r9.D(r0)
            if (r0 != 0) goto L_0x00cc
            goto L_0x0172
        L_0x00cc:
            int r0 = r9.f4574c
            int r0 = r10.findPointerIndex(r0)
            float r1 = r10.getX(r0)
            float r0 = r10.getY(r0)
            float[] r2 = r9.f4577f
            int r3 = r9.f4574c
            r2 = r2[r3]
            float r1 = r1 - r2
            int r1 = (int) r1
            float[] r2 = r9.f4578g
            r2 = r2[r3]
            float r0 = r0 - r2
            int r0 = (int) r0
            android.view.View r2 = r9.f4591t
            int r2 = r2.getLeft()
            int r2 = r2 + r1
            android.view.View r3 = r9.f4591t
            int r3 = r3.getTop()
            int r3 = r3 + r0
            r9.r(r2, r3, r1, r0)
        L_0x00f9:
            r9.J(r10)
            goto L_0x0172
        L_0x00fe:
            int r0 = r10.getPointerCount()
        L_0x0102:
            if (r2 >= r0) goto L_0x00f9
            int r1 = r10.getPointerId(r2)
            boolean r4 = r9.D(r1)
            if (r4 != 0) goto L_0x010f
            goto L_0x013e
        L_0x010f:
            float r4 = r10.getX(r2)
            float r5 = r10.getY(r2)
            float[] r6 = r9.f4575d
            r6 = r6[r1]
            float r6 = r4 - r6
            float[] r7 = r9.f4576e
            r7 = r7[r1]
            float r7 = r5 - r7
            r9.H(r6, r7, r1)
            int r8 = r9.f4572a
            if (r8 != r3) goto L_0x012b
            goto L_0x00f9
        L_0x012b:
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.t(r4, r5)
            boolean r5 = r9.f(r4, r6, r7)
            if (r5 == 0) goto L_0x013e
            boolean r1 = r9.R(r4, r1)
            if (r1 == 0) goto L_0x013e
            goto L_0x00f9
        L_0x013e:
            int r2 = r2 + 1
            goto L_0x0102
        L_0x0141:
            int r10 = r9.f4572a
            if (r10 != r3) goto L_0x00b9
            r9.G()
            goto L_0x00b9
        L_0x014a:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r10 = r10.getPointerId(r2)
            int r2 = (int) r0
            int r3 = (int) r1
            android.view.View r2 = r9.t(r2, r3)
            r9.I(r0, r1, r10)
            r9.R(r2, r10)
            int[] r0 = r9.f4579h
            r0 = r0[r10]
            int r1 = r9.f4588q
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0172
            c0.d$c r2 = r9.f4590s
            r0 = r0 & r1
            r2.h(r0, r10)
        L_0x0172:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.F(android.view.MotionEvent):void");
    }

    /* access modifiers changed from: package-private */
    public void K(int i10) {
        this.f4593v.removeCallbacks(this.f4594w);
        if (this.f4572a != i10) {
            this.f4572a = i10;
            this.f4590s.j(i10);
            if (this.f4572a == 0) {
                this.f4591t = null;
            }
        }
    }

    public void L(int i10) {
        this.f4586o = i10;
    }

    public void M(int i10) {
        this.f4588q = i10;
    }

    public void N(float f10) {
        this.f4585n = f10;
    }

    public boolean O(int i10, int i11) {
        if (this.f4592u) {
            return u(i10, i11, (int) this.f4583l.getXVelocity(this.f4574c), (int) this.f4583l.getYVelocity(this.f4574c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f4583l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f4583l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f4583l
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0104
            if (r2 == r6) goto L_0x00ff
            if (r2 == r4) goto L_0x0070
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003c
            r4 = 6
            if (r2 == r4) goto L_0x0034
        L_0x0031:
            r5 = 0
            goto L_0x0135
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.j(r1)
            goto L_0x0031
        L_0x003c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.I(r7, r1, r2)
            int r3 = r0.f4572a
            if (r3 != 0) goto L_0x0060
            int[] r1 = r0.f4579h
            r1 = r1[r2]
            int r3 = r0.f4588q
            r4 = r1 & r3
            if (r4 == 0) goto L_0x0031
            c0.d$c r4 = r0.f4590s
            r1 = r1 & r3
            r4.h(r1, r2)
            goto L_0x0031
        L_0x0060:
            if (r3 != r4) goto L_0x0031
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.t(r3, r1)
            android.view.View r3 = r0.f4591t
            if (r1 != r3) goto L_0x0031
            r0.R(r1, r2)
            goto L_0x0031
        L_0x0070:
            float[] r2 = r0.f4575d
            if (r2 == 0) goto L_0x0031
            float[] r2 = r0.f4576e
            if (r2 != 0) goto L_0x0079
            goto L_0x0031
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.D(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f4575d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f4576e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.t(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.f(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = r6
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            c0.d$c r14 = r0.f4590s
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            c0.d$c r5 = r0.f4590s
            int r5 = r5.b(r7, r15, r14)
            c0.d$c r14 = r0.f4590s
            int r14 = r14.d(r7)
            c0.d$c r15 = r0.f4590s
            int r15 = r15.e(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fa
            if (r15 <= 0) goto L_0x00e6
            if (r5 != r13) goto L_0x00e6
            goto L_0x00fa
        L_0x00e6:
            r0.H(r9, r10, r4)
            int r5 = r0.f4572a
            if (r5 != r6) goto L_0x00ee
            goto L_0x00fa
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.R(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fa
        L_0x00f7:
            int r3 = r3 + 1
            goto L_0x007e
        L_0x00fa:
            r16.J(r17)
            goto L_0x0031
        L_0x00ff:
            r16.a()
            goto L_0x0031
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.I(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.t(r2, r3)
            android.view.View r3 = r0.f4591t
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f4572a
            if (r3 != r4) goto L_0x0125
            r0.R(r2, r1)
        L_0x0125:
            int[] r2 = r0.f4579h
            r2 = r2[r1]
            int r3 = r0.f4588q
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0135
            c0.d$c r4 = r0.f4590s
            r2 = r2 & r3
            r4.h(r2, r1)
        L_0x0135:
            int r1 = r0.f4572a
            if (r1 != r6) goto L_0x013a
            r5 = r6
        L_0x013a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.P(android.view.MotionEvent):boolean");
    }

    public boolean Q(View view, int i10, int i11) {
        this.f4591t = view;
        this.f4574c = -1;
        boolean u10 = u(i10, i11, 0, 0);
        if (!u10 && this.f4572a == 0 && this.f4591t != null) {
            this.f4591t = null;
        }
        return u10;
    }

    /* access modifiers changed from: package-private */
    public boolean R(View view, int i10) {
        if (view == this.f4591t && this.f4574c == i10) {
            return true;
        }
        if (view == null || !this.f4590s.m(view, i10)) {
            return false;
        }
        this.f4574c = i10;
        b(view, i10);
        return true;
    }

    public void a() {
        this.f4574c = -1;
        i();
        VelocityTracker velocityTracker = this.f4583l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4583l = null;
        }
    }

    public void b(View view, int i10) {
        if (view.getParent() == this.f4593v) {
            this.f4591t = view;
            this.f4574c = i10;
            this.f4590s.i(view, i10);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f4593v + ")");
    }

    public boolean d(int i10) {
        int length = this.f4575d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (e(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i10, int i11) {
        if (!C(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f4577f[i11] - this.f4575d[i11];
        float f11 = this.f4578g[i11] - this.f4576e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f4573b) : z11 && Math.abs(f11) > ((float) this.f4573b);
        }
        int i12 = this.f4573b;
        return (f10 * f10) + (f11 * f11) > ((float) (i12 * i12));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r0 == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.f4572a
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x006a
            android.widget.OverScroller r0 = r11.f4589r
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r11.f4589r
            int r3 = r3.getCurrX()
            android.widget.OverScroller r4 = r11.f4589r
            int r10 = r4.getCurrY()
            android.view.View r4 = r11.f4591t
            int r4 = r4.getLeft()
            int r8 = r3 - r4
            android.view.View r4 = r11.f4591t
            int r4 = r4.getTop()
            int r9 = r10 - r4
            if (r8 == 0) goto L_0x002f
            android.view.View r4 = r11.f4591t
            androidx.core.view.m0.a0(r4, r8)
        L_0x002f:
            if (r9 == 0) goto L_0x0036
            android.view.View r4 = r11.f4591t
            androidx.core.view.m0.b0(r4, r9)
        L_0x0036:
            if (r8 != 0) goto L_0x003a
            if (r9 == 0) goto L_0x0043
        L_0x003a:
            c0.d$c r4 = r11.f4590s
            android.view.View r5 = r11.f4591t
            r6 = r3
            r7 = r10
            r4.k(r5, r6, r7, r8, r9)
        L_0x0043:
            if (r0 == 0) goto L_0x005b
            android.widget.OverScroller r4 = r11.f4589r
            int r4 = r4.getFinalX()
            if (r3 != r4) goto L_0x005b
            android.widget.OverScroller r3 = r11.f4589r
            int r3 = r3.getFinalY()
            if (r10 != r3) goto L_0x005b
            android.widget.OverScroller r0 = r11.f4589r
            r0.abortAnimation()
            goto L_0x005d
        L_0x005b:
            if (r0 != 0) goto L_0x006a
        L_0x005d:
            if (r12 == 0) goto L_0x0067
            android.view.ViewGroup r12 = r11.f4593v
            java.lang.Runnable r0 = r11.f4594w
            r12.post(r0)
            goto L_0x006a
        L_0x0067:
            r11.K(r1)
        L_0x006a:
            int r12 = r11.f4572a
            if (r12 != r2) goto L_0x006f
            r1 = 1
        L_0x006f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.d.m(boolean):boolean");
    }

    public View t(int i10, int i11) {
        for (int childCount = this.f4593v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f4593v.getChildAt(this.f4590s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f4591t;
    }

    public int w() {
        return this.f4587p;
    }

    public int x() {
        return this.f4586o;
    }

    public int z() {
        return this.f4573b;
    }
}
