package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.d0;
import androidx.core.view.accessibility.y;
import androidx.core.view.m0;
import c0.d;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* renamed from: e  reason: collision with root package name */
    c0.d f5572e;

    /* renamed from: f  reason: collision with root package name */
    c f5573f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f5574g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f5575h;

    /* renamed from: i  reason: collision with root package name */
    private float f5576i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5577j;

    /* renamed from: k  reason: collision with root package name */
    int f5578k = 2;

    /* renamed from: l  reason: collision with root package name */
    float f5579l = 0.5f;

    /* renamed from: m  reason: collision with root package name */
    float f5580m = 0.0f;

    /* renamed from: n  reason: collision with root package name */
    float f5581n = 0.5f;

    /* renamed from: o  reason: collision with root package name */
    private final d.c f5582o = new a();

    class a extends d.c {

        /* renamed from: a  reason: collision with root package name */
        private int f5583a;

        /* renamed from: b  reason: collision with root package name */
        private int f5584b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
            if (i10 != 0) {
                boolean z10 = m0.B(view) == 1;
                int i11 = SwipeDismissBehavior.this.f5578k;
                if (i11 == 2) {
                    return true;
                }
                if (i11 == 0) {
                    if (z10) {
                        if (f10 >= 0.0f) {
                            return false;
                        }
                    } else if (i10 <= 0) {
                        return false;
                    }
                    return true;
                } else if (i11 != 1) {
                    return false;
                } else {
                    if (z10) {
                        if (i10 <= 0) {
                            return false;
                        }
                    } else if (f10 >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                return Math.abs(view.getLeft() - this.f5583a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f5579l);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r5 != false) goto L_0x001c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            if (r5 != false) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            r5 = r2.f5583a;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.m0.B(r3)
                r0 = 1
                if (r5 != r0) goto L_0x0009
                r5 = r0
                goto L_0x000a
            L_0x0009:
                r5 = 0
            L_0x000a:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f5578k
                if (r1 != 0) goto L_0x0024
                if (r5 == 0) goto L_0x001c
            L_0x0012:
                int r5 = r2.f5583a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f5583a
                goto L_0x0037
            L_0x001c:
                int r5 = r2.f5583a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0037
            L_0x0024:
                if (r1 != r0) goto L_0x0029
                if (r5 == 0) goto L_0x0012
                goto L_0x001c
            L_0x0029:
                int r5 = r2.f5583a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f5583a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0037:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.L(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i10) {
            this.f5584b = i10;
            this.f5583a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                boolean unused = SwipeDismissBehavior.this.f5575h = true;
                parent.requestDisallowInterceptTouchEvent(true);
                boolean unused2 = SwipeDismissBehavior.this.f5575h = false;
            }
        }

        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f5573f;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = ((float) view.getWidth()) * SwipeDismissBehavior.this.f5580m;
            float width2 = ((float) view.getWidth()) * SwipeDismissBehavior.this.f5581n;
            float abs = (float) Math.abs(i10 - this.f5583a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, abs), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
            r4 = r3.getLeft();
            r0 = r2.f5583a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f5584b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L_0x0023
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L_0x001d
                int r4 = r3.getLeft()
                int r0 = r2.f5583a
                if (r4 >= r0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                int r0 = r0 + r5
                goto L_0x0021
            L_0x001d:
                int r4 = r2.f5583a
                int r0 = r4 - r5
            L_0x0021:
                r4 = 1
                goto L_0x0026
            L_0x0023:
                int r0 = r2.f5583a
                r4 = 0
            L_0x0026:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                c0.d r5 = r5.f5572e
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L_0x003f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                androidx.core.view.m0.i0(r3, r5)
                goto L_0x004a
            L_0x003f:
                if (r4 == 0) goto L_0x004a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f5573f
                if (r4 == 0) goto L_0x004a
                r4.a(r3)
            L_0x004a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        public boolean m(View view, int i10) {
            int i11 = this.f5584b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }
    }

    class b implements d0 {
        b() {
        }

        public boolean a(View view, d0.a aVar) {
            boolean z10 = false;
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            if (m0.B(view) == 1) {
                z10 = true;
            }
            int i10 = SwipeDismissBehavior.this.f5578k;
            m0.a0(view, ((i10 != 0 || !z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f5573f;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final View f5587e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f5588f;

        d(View view, boolean z10) {
            this.f5587e = view;
            this.f5588f = z10;
        }

        public void run() {
            c cVar;
            c0.d dVar = SwipeDismissBehavior.this.f5572e;
            if (dVar != null && dVar.m(true)) {
                m0.i0(this.f5587e, this);
            } else if (this.f5588f && (cVar = SwipeDismissBehavior.this.f5573f) != null) {
                cVar.a(this.f5587e);
            }
        }
    }

    static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void M(ViewGroup viewGroup) {
        if (this.f5572e == null) {
            this.f5572e = this.f5577j ? c0.d.n(viewGroup, this.f5576i, this.f5582o) : c0.d.o(viewGroup, this.f5582o);
        }
    }

    static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void S(View view) {
        m0.k0(view, 1048576);
        if (J(view)) {
            m0.m0(view, y.a.f2554y, (CharSequence) null, new b());
        }
    }

    public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f5572e == null) {
            return false;
        }
        if (this.f5575h && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5572e.F(motionEvent);
        return true;
    }

    public boolean J(View view) {
        return true;
    }

    public void O(float f10) {
        this.f5581n = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.f5573f = cVar;
    }

    public void Q(float f10) {
        this.f5580m = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f5578k = i10;
    }

    public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z10 = this.f5574g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5574g = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5574g = false;
        }
        if (!z10) {
            return false;
        }
        M(coordinatorLayout);
        return !this.f5575h && this.f5572e.P(motionEvent);
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean p10 = super.p(coordinatorLayout, view, i10);
        if (m0.z(view) == 0) {
            m0.B0(view, 1);
            S(view);
        }
        return p10;
    }
}
