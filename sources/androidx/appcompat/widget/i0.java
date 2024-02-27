package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.p;

public abstract class i0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: e  reason: collision with root package name */
    private final float f1420e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1421f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1422g;

    /* renamed from: h  reason: collision with root package name */
    final View f1423h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f1424i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f1425j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1426k;

    /* renamed from: l  reason: collision with root package name */
    private int f1427l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f1428m = new int[2];

    private class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = i0.this.f1423h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        public void run() {
            i0.this.e();
        }
    }

    public i0(View view) {
        this.f1423h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1420e = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1421f = tapTimeout;
        this.f1422g = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f1425j;
        if (runnable != null) {
            this.f1423h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1424i;
        if (runnable2 != null) {
            this.f1423h.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        g0 g0Var;
        View view = this.f1423h;
        p b10 = b();
        if (b10 == null || !b10.d() || (g0Var = (g0) b10.h()) == null || !g0Var.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        i(view, obtainNoHistory);
        j(g0Var, obtainNoHistory);
        boolean e10 = g0Var.e(obtainNoHistory, this.f1427l);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return e10 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1423h
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1427l
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1420e
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1427l = r6
            java.lang.Runnable r6 = r5.f1424i
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.i0$a r6 = new androidx.appcompat.widget.i0$a
            r6.<init>()
            r5.f1424i = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1424i
            int r1 = r5.f1421f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1425j
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.i0$b r6 = new androidx.appcompat.widget.i0$b
            r6.<init>()
            r5.f1425j = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1425j
            int r1 = r5.f1422g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i0.g(android.view.MotionEvent):boolean");
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1428m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1428m;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract p b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public boolean d() {
        p b10 = b();
        if (b10 == null || !b10.d()) {
            return true;
        }
        b10.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        a();
        View view = this.f1423h;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1426k = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f1426k;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1423h.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1426k = z10;
        return z10 || z11;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1426k = false;
        this.f1427l = -1;
        Runnable runnable = this.f1424i;
        if (runnable != null) {
            this.f1423h.removeCallbacks(runnable);
        }
    }
}
