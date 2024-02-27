package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.m0;
import androidx.core.view.o0;

class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o  reason: collision with root package name */
    private static d1 f1348o;

    /* renamed from: p  reason: collision with root package name */
    private static d1 f1349p;

    /* renamed from: e  reason: collision with root package name */
    private final View f1350e;

    /* renamed from: f  reason: collision with root package name */
    private final CharSequence f1351f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1352g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f1353h = new b1(this);

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f1354i = new c1(this);

    /* renamed from: j  reason: collision with root package name */
    private int f1355j;

    /* renamed from: k  reason: collision with root package name */
    private int f1356k;

    /* renamed from: l  reason: collision with root package name */
    private e1 f1357l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1358m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f1359n;

    private d1(View view, CharSequence charSequence) {
        this.f1350e = view;
        this.f1351f = charSequence;
        this.f1352g = o0.d(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1350e.removeCallbacks(this.f1353h);
    }

    private void c() {
        this.f1359n = true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1350e.postDelayed(this.f1353h, (long) ViewConfiguration.getLongPressTimeout());
    }

    private static void g(d1 d1Var) {
        d1 d1Var2 = f1348o;
        if (d1Var2 != null) {
            d1Var2.b();
        }
        f1348o = d1Var;
        if (d1Var != null) {
            d1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        d1 d1Var = f1348o;
        if (d1Var != null && d1Var.f1350e == view) {
            g((d1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            d1 d1Var2 = f1349p;
            if (d1Var2 != null && d1Var2.f1350e == view) {
                d1Var2.d();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new d1(view, charSequence);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1359n && Math.abs(x10 - this.f1355j) <= this.f1352g && Math.abs(y10 - this.f1356k) <= this.f1352g) {
            return false;
        }
        this.f1355j = x10;
        this.f1356k = y10;
        this.f1359n = false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (f1349p == this) {
            f1349p = null;
            e1 e1Var = this.f1357l;
            if (e1Var != null) {
                e1Var.c();
                this.f1357l = null;
                c();
                this.f1350e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1348o == this) {
            g((d1) null);
        }
        this.f1350e.removeCallbacks(this.f1354i);
    }

    /* access modifiers changed from: package-private */
    public void i(boolean z10) {
        long j10;
        long longPressTimeout;
        long j11;
        if (m0.T(this.f1350e)) {
            g((d1) null);
            d1 d1Var = f1349p;
            if (d1Var != null) {
                d1Var.d();
            }
            f1349p = this;
            this.f1358m = z10;
            e1 e1Var = new e1(this.f1350e.getContext());
            this.f1357l = e1Var;
            e1Var.e(this.f1350e, this.f1355j, this.f1356k, this.f1358m, this.f1351f);
            this.f1350e.addOnAttachStateChangeListener(this);
            if (this.f1358m) {
                j10 = 2500;
            } else {
                if ((m0.M(this.f1350e) & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j11 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j11 = 15000;
                }
                j10 = j11 - longPressTimeout;
            }
            this.f1350e.removeCallbacks(this.f1354i);
            this.f1350e.postDelayed(this.f1354i, j10);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1357l != null && this.f1358m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1350e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1350e.isEnabled() && this.f1357l == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1355j = view.getWidth() / 2;
        this.f1356k = view.getHeight() / 2;
        i(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
