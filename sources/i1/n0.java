package i1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import i1.l;

public abstract class n0 extends l {
    private static final String[] N = {"android:visibility:visibility", "android:visibility:parent"};
    private int M = 3;

    class a extends m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f12198a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f12199b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f12200c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f12198a = viewGroup;
            this.f12199b = view;
            this.f12200c = view2;
        }

        public void b(l lVar) {
            x.a(this.f12198a).c(this.f12199b);
        }

        public void d(l lVar) {
            if (this.f12199b.getParent() == null) {
                x.a(this.f12198a).a(this.f12199b);
            } else {
                n0.this.cancel();
            }
        }

        public void e(l lVar) {
            this.f12200c.setTag(i.save_overlay_view, (Object) null);
            x.a(this.f12198a).c(this.f12199b);
            lVar.W(this);
        }
    }

    private static class b extends AnimatorListenerAdapter implements l.f {

        /* renamed from: a  reason: collision with root package name */
        private final View f12202a;

        /* renamed from: b  reason: collision with root package name */
        private final int f12203b;

        /* renamed from: c  reason: collision with root package name */
        private final ViewGroup f12204c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f12205d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f12206e;

        /* renamed from: f  reason: collision with root package name */
        boolean f12207f = false;

        b(View view, int i10, boolean z10) {
            this.f12202a = view;
            this.f12203b = i10;
            this.f12204c = (ViewGroup) view.getParent();
            this.f12205d = z10;
            g(true);
        }

        private void f() {
            if (!this.f12207f) {
                a0.h(this.f12202a, this.f12203b);
                ViewGroup viewGroup = this.f12204c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z10) {
            ViewGroup viewGroup;
            if (this.f12205d && this.f12206e != z10 && (viewGroup = this.f12204c) != null) {
                this.f12206e = z10;
                x.c(viewGroup, z10);
            }
        }

        public void a(l lVar) {
        }

        public void b(l lVar) {
            g(false);
        }

        public void c(l lVar) {
        }

        public void d(l lVar) {
            g(true);
        }

        public void e(l lVar) {
            f();
            lVar.W(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f12207f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f12207f) {
                a0.h(this.f12202a, this.f12203b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f12207f) {
                a0.h(this.f12202a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f12208a;

        /* renamed from: b  reason: collision with root package name */
        boolean f12209b;

        /* renamed from: c  reason: collision with root package name */
        int f12210c;

        /* renamed from: d  reason: collision with root package name */
        int f12211d;

        /* renamed from: e  reason: collision with root package name */
        ViewGroup f12212e;

        /* renamed from: f  reason: collision with root package name */
        ViewGroup f12213f;

        c() {
        }
    }

    private void l0(s sVar) {
        sVar.f12221a.put("android:visibility:visibility", Integer.valueOf(sVar.f12222b.getVisibility()));
        sVar.f12221a.put("android:visibility:parent", sVar.f12222b.getParent());
        int[] iArr = new int[2];
        sVar.f12222b.getLocationOnScreen(iArr);
        sVar.f12221a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r9 == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r0.f12212e == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0092, code lost:
        if (r0.f12210c == 0) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i1.n0.c m0(i1.s r8, i1.s r9) {
        /*
            r7 = this;
            i1.n0$c r0 = new i1.n0$c
            r0.<init>()
            r1 = 0
            r0.f12208a = r1
            r0.f12209b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map r6 = r8.f12221a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map r6 = r8.f12221a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f12210c = r6
            java.util.Map r6 = r8.f12221a
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f12212e = r6
            goto L_0x0037
        L_0x0033:
            r0.f12210c = r3
            r0.f12212e = r2
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map r6 = r9.f12221a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map r2 = r9.f12221a
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f12211d = r2
            java.util.Map r2 = r9.f12221a
            java.lang.Object r2 = r2.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x0057:
            r0.f12213f = r2
            goto L_0x005d
        L_0x005a:
            r0.f12211d = r3
            goto L_0x0057
        L_0x005d:
            r2 = 1
            if (r8 == 0) goto L_0x0087
            if (r9 == 0) goto L_0x0087
            int r8 = r0.f12210c
            int r9 = r0.f12211d
            if (r8 != r9) goto L_0x006f
            android.view.ViewGroup r3 = r0.f12212e
            android.view.ViewGroup r4 = r0.f12213f
            if (r3 != r4) goto L_0x006f
            return r0
        L_0x006f:
            if (r8 == r9) goto L_0x007d
            if (r8 != 0) goto L_0x0078
        L_0x0073:
            r0.f12209b = r1
        L_0x0075:
            r0.f12208a = r2
            goto L_0x0095
        L_0x0078:
            if (r9 != 0) goto L_0x0095
        L_0x007a:
            r0.f12209b = r2
            goto L_0x0075
        L_0x007d:
            android.view.ViewGroup r8 = r0.f12213f
            if (r8 != 0) goto L_0x0082
            goto L_0x0073
        L_0x0082:
            android.view.ViewGroup r8 = r0.f12212e
            if (r8 != 0) goto L_0x0095
            goto L_0x007a
        L_0x0087:
            if (r8 != 0) goto L_0x008e
            int r8 = r0.f12211d
            if (r8 != 0) goto L_0x008e
            goto L_0x007a
        L_0x008e:
            if (r9 != 0) goto L_0x0095
            int r8 = r0.f12210c
            if (r8 != 0) goto L_0x0095
            goto L_0x0073
        L_0x0095:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.n0.m0(i1.s, i1.s):i1.n0$c");
    }

    public String[] K() {
        return N;
    }

    public boolean M(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f12221a.containsKey("android:visibility:visibility") != sVar.f12221a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m02 = m0(sVar, sVar2);
        if (m02.f12208a) {
            return m02.f12210c == 0 || m02.f12211d == 0;
        }
        return false;
    }

    public void f(s sVar) {
        l0(sVar);
    }

    public void i(s sVar) {
        l0(sVar);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator o0(ViewGroup viewGroup, s sVar, int i10, s sVar2, int i11) {
        if ((this.M & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f12222b.getParent();
            if (m0(w(view, false), L(view, false)).f12208a) {
                return null;
            }
        }
        return n0(viewGroup, sVar2.f12222b, sVar, sVar2);
    }

    public Animator p(ViewGroup viewGroup, s sVar, s sVar2) {
        c m02 = m0(sVar, sVar2);
        if (!m02.f12208a) {
            return null;
        }
        if (m02.f12212e == null && m02.f12213f == null) {
            return null;
        }
        if (m02.f12209b) {
            return o0(viewGroup, sVar, m02.f12210c, sVar2, m02.f12211d);
        }
        return q0(viewGroup, sVar, m02.f12210c, sVar2, m02.f12211d);
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r0.f12180z != false) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator q0(android.view.ViewGroup r18, i1.s r19, int r20, i1.s r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.M
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f12222b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f12222b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = i1.i.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = r12
            goto L_0x0094
        L_0x002d:
            if (r8 == 0) goto L_0x0044
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0044
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0040
        L_0x003c:
            r10 = r8
            r13 = r11
            r8 = r7
            goto L_0x0048
        L_0x0040:
            r8 = r7
            r10 = r8
            r13 = r12
            goto L_0x0048
        L_0x0044:
            if (r8 == 0) goto L_0x0040
            r10 = r7
            r13 = r11
        L_0x0048:
            if (r13 == 0) goto L_0x0073
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x0091
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x0073
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            i1.s r14 = r0.L(r13, r12)
            i1.s r15 = r0.w(r13, r12)
            i1.n0$c r14 = r0.m0(r14, r15)
            boolean r14 = r14.f12208a
            if (r14 != 0) goto L_0x007a
            android.view.View r8 = i1.r.a(r1, r5, r13)
        L_0x0073:
            r13 = r11
            r16 = r10
            r10 = r8
            r8 = r16
            goto L_0x0094
        L_0x007a:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x0073
            r13 = -1
            if (r14 == r13) goto L_0x0073
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x0073
            boolean r13 = r0.f12180z
            if (r13 == 0) goto L_0x0073
        L_0x0091:
            r8 = r10
            r13 = r11
            r10 = r5
        L_0x0094:
            if (r10 == 0) goto L_0x00e4
            if (r13 != 0) goto L_0x00c8
            java.util.Map r4 = r2.f12221a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            i1.v r4 = i1.x.a(r18)
            r4.a(r10)
        L_0x00c8:
            android.animation.Animator r2 = r0.p0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e3
            if (r2 != 0) goto L_0x00d8
            i1.v r1 = i1.x.a(r18)
            r1.c(r10)
            goto L_0x00e3
        L_0x00d8:
            r5.setTag(r9, r10)
            i1.n0$a r3 = new i1.n0$a
            r3.<init>(r1, r10, r5)
            r0.a(r3)
        L_0x00e3:
            return r2
        L_0x00e4:
            if (r8 == 0) goto L_0x0106
            int r5 = r8.getVisibility()
            i1.a0.h(r8, r11)
            android.animation.Animator r1 = r0.p0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0102
            i1.n0$b r2 = new i1.n0$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            i1.a.a(r1, r2)
            r0.a(r2)
            goto L_0x0105
        L_0x0102:
            i1.a0.h(r8, r5)
        L_0x0105:
            return r1
        L_0x0106:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.n0.q0(android.view.ViewGroup, i1.s, int, i1.s, int):android.animation.Animator");
    }

    public void r0(int i10) {
        if ((i10 & -4) == 0) {
            this.M = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
