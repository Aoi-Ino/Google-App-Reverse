package c0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.b0;
import androidx.core.view.accessibility.c0;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import c0.b;
import java.util.ArrayList;
import java.util.List;
import o.h;

public abstract class a extends androidx.core.view.a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f4553n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a f4554o = new C0088a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.C0089b f4555p = new b();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f4556d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f4557e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f4558f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f4559g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f4560h;

    /* renamed from: i  reason: collision with root package name */
    private final View f4561i;

    /* renamed from: j  reason: collision with root package name */
    private c f4562j;

    /* renamed from: k  reason: collision with root package name */
    int f4563k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    int f4564l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    private int f4565m = Integer.MIN_VALUE;

    /* renamed from: c0.a$a  reason: collision with other inner class name */
    class C0088a implements b.a {
        C0088a() {
        }

        /* renamed from: b */
        public void a(y yVar, Rect rect) {
            yVar.m(rect);
        }
    }

    class b implements b.C0089b {
        b() {
        }

        /* renamed from: c */
        public y a(h hVar, int i10) {
            return (y) hVar.r(i10);
        }

        /* renamed from: d */
        public int b(h hVar) {
            return hVar.q();
        }
    }

    private class c extends b0 {
        c() {
        }

        public y b(int i10) {
            return y.b0(a.this.H(i10));
        }

        public y d(int i10) {
            int i11 = i10 == 2 ? a.this.f4563k : a.this.f4564l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f4561i = view;
            this.f4560h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (m0.z(view) == 0) {
                m0.B0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
        } else if (i10 == 33) {
            rect.set(0, height, width, height);
        } else if (i10 == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i10 == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean E(android.graphics.Rect r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0032
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x000a
            goto L_0x0032
        L_0x000a:
            android.view.View r4 = r3.f4561i
            int r4 = r4.getWindowVisibility()
            if (r4 == 0) goto L_0x0013
            return r0
        L_0x0013:
            android.view.View r4 = r3.f4561i
        L_0x0015:
            android.view.ViewParent r4 = r4.getParent()
            boolean r1 = r4 instanceof android.view.View
            if (r1 == 0) goto L_0x002f
            android.view.View r4 = (android.view.View) r4
            float r1 = r4.getAlpha()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x002e
            int r1 = r4.getVisibility()
            if (r1 == 0) goto L_0x0015
        L_0x002e:
            return r0
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r0 = 1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.a.E(android.graphics.Rect):boolean");
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        Object d10;
        h y10 = y();
        int i11 = this.f4564l;
        int i12 = Integer.MIN_VALUE;
        y yVar = i11 == Integer.MIN_VALUE ? null : (y) y10.e(i11);
        if (i10 == 1 || i10 == 2) {
            d10 = b.d(y10, f4555p, f4554o, yVar, i10, m0.B(this.f4561i) == 1, false);
        } else if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
            Rect rect2 = new Rect();
            int i13 = this.f4564l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f4561i, i10, rect2);
            }
            d10 = b.c(y10, f4555p, f4554o, yVar, rect2, i10);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        y yVar2 = (y) d10;
        if (yVar2 != null) {
            i12 = y10.j(y10.h(yVar2));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return T(i10);
        }
        if (i11 == 2) {
            return o(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? J(i10, i11, bundle) : n(i10);
        }
        return S(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return m0.f0(this.f4561i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f4560h.isEnabled() || !this.f4560h.isTouchExplorationEnabled() || (i11 = this.f4563k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f4563k = i10;
        this.f4561i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f4565m;
        if (i11 != i10) {
            this.f4565m = i10;
            U(i10, 128);
            U(i11, 256);
        }
    }

    private boolean n(int i10) {
        if (this.f4563k != i10) {
            return false;
        }
        this.f4563k = Integer.MIN_VALUE;
        this.f4561i.invalidate();
        U(i10, 65536);
        return true;
    }

    private boolean p() {
        int i10 = this.f4564l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, (Bundle) null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        y H = H(i10);
        obtain.getText().add(H.B());
        obtain.setContentDescription(H.t());
        obtain.setScrollable(H.U());
        obtain.setPassword(H.T());
        obtain.setEnabled(H.N());
        obtain.setChecked(H.K());
        L(i10, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.q());
            c0.c(obtain, this.f4561i, i10);
            obtain.setPackageName(this.f4561i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f4561i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private y t(int i10) {
        y Z = y.Z();
        Z.s0(true);
        Z.u0(true);
        Z.m0("android.view.View");
        Rect rect = f4553n;
        Z.i0(rect);
        Z.j0(rect);
        Z.C0(this.f4561i);
        N(i10, Z);
        if (Z.B() == null && Z.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Z.m(this.f4557e);
        if (!this.f4557e.equals(rect)) {
            int k10 = Z.k();
            if ((k10 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k10 & 128) == 0) {
                Z.A0(this.f4561i.getContext().getPackageName());
                Z.J0(this.f4561i, i10);
                if (this.f4563k == i10) {
                    Z.g0(true);
                    Z.a(128);
                } else {
                    Z.g0(false);
                    Z.a(64);
                }
                boolean z10 = this.f4564l == i10;
                if (z10) {
                    Z.a(2);
                } else if (Z.O()) {
                    Z.a(1);
                }
                Z.v0(z10);
                this.f4561i.getLocationOnScreen(this.f4559g);
                Z.n(this.f4556d);
                if (this.f4556d.equals(rect)) {
                    Z.m(this.f4556d);
                    if (Z.f2532b != -1) {
                        y Z2 = y.Z();
                        for (int i11 = Z.f2532b; i11 != -1; i11 = Z2.f2532b) {
                            Z2.D0(this.f4561i, -1);
                            Z2.i0(f4553n);
                            N(i11, Z2);
                            Z2.m(this.f4557e);
                            Rect rect2 = this.f4556d;
                            Rect rect3 = this.f4557e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        Z2.d0();
                    }
                    this.f4556d.offset(this.f4559g[0] - this.f4561i.getScrollX(), this.f4559g[1] - this.f4561i.getScrollY());
                }
                if (this.f4561i.getLocalVisibleRect(this.f4558f)) {
                    this.f4558f.offset(this.f4559g[0] - this.f4561i.getScrollX(), this.f4559g[1] - this.f4561i.getScrollY());
                    if (this.f4556d.intersect(this.f4558f)) {
                        Z.j0(this.f4556d);
                        if (E(this.f4556d)) {
                            Z.N0(true);
                        }
                    }
                }
                return Z;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    private y u() {
        y a02 = y.a0(this.f4561i);
        m0.d0(this.f4561i, a02);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (a02.p() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a02.d(this.f4561i, ((Integer) arrayList.get(i10)).intValue());
            }
            return a02;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private h y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h hVar = new h();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hVar.k(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return hVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).m(rect);
    }

    public final int A() {
        return this.f4564l;
    }

    /* access modifiers changed from: protected */
    public abstract int B(float f10, float f11);

    /* access modifiers changed from: protected */
    public abstract void C(List list);

    /* access modifiers changed from: package-private */
    public y H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f4564l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean J(int i10, int i11, Bundle bundle);

    /* access modifiers changed from: protected */
    public void K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public void L(int i10, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    public abstract void M(y yVar);

    /* access modifiers changed from: protected */
    public abstract void N(int i10, y yVar);

    /* access modifiers changed from: protected */
    public abstract void O(int i10, boolean z10);

    /* access modifiers changed from: package-private */
    public boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f4561i.isFocused() && !this.f4561i.requestFocus()) || (i11 = this.f4564l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f4564l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f4560h.isEnabled() || (parent = this.f4561i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f4561i, q(i10, i11));
    }

    public b0 b(View view) {
        if (this.f4562j == null) {
            this.f4562j = new c();
        }
        return this.f4562j;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    public void g(View view, y yVar) {
        super.g(view, yVar);
        M(yVar);
    }

    public final boolean o(int i10) {
        if (this.f4564l != i10) {
            return false;
        }
        this.f4564l = Integer.MIN_VALUE;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f4560h.isEnabled() || !this.f4560h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = B(motionEvent.getX(), motionEvent.getY());
            V(B);
            return B != Integer.MIN_VALUE;
        } else if (action != 10 || this.f4565m == Integer.MIN_VALUE) {
            return false;
        } else {
            V(Integer.MIN_VALUE);
            return true;
        }
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && G(F, (Rect) null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return G(1, (Rect) null);
            }
            return false;
        }
    }

    public final int x() {
        return this.f4563k;
    }
}
