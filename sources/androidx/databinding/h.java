package androidx.databinding;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.c0;
import androidx.lifecycle.k;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public abstract class h extends a {

    /* renamed from: m  reason: collision with root package name */
    static int f2770m = Build.VERSION.SDK_INT;

    /* renamed from: n  reason: collision with root package name */
    private static final int f2771n = 8;

    /* renamed from: o  reason: collision with root package name */
    private static final boolean f2772o = true;

    /* renamed from: p  reason: collision with root package name */
    private static final c f2773p = new a();

    /* renamed from: q  reason: collision with root package name */
    private static final c f2774q = new b();

    /* renamed from: r  reason: collision with root package name */
    private static final c f2775r = new c();

    /* renamed from: s  reason: collision with root package name */
    private static final c f2776s = new d();

    /* renamed from: t  reason: collision with root package name */
    private static final b f2777t = new e();

    /* renamed from: u  reason: collision with root package name */
    private static final ReferenceQueue f2778u = new ReferenceQueue();
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final View.OnAttachStateChangeListener f2779v = new f();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f2780a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f2781b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2782c;

    /* renamed from: d  reason: collision with root package name */
    private i[] f2783d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final View f2784e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2785f;

    /* renamed from: g  reason: collision with root package name */
    private Choreographer f2786g;

    /* renamed from: h  reason: collision with root package name */
    private final Choreographer.FrameCallback f2787h;

    /* renamed from: i  reason: collision with root package name */
    private Handler f2788i;

    /* renamed from: j  reason: collision with root package name */
    private h f2789j;

    /* renamed from: k  reason: collision with root package name */
    private s f2790k;

    /* renamed from: l  reason: collision with root package name */
    private j f2791l;

    class a implements c {
        a() {
        }
    }

    class b implements c {
        b() {
        }
    }

    class c implements c {
        c() {
        }
    }

    class d implements c {
        d() {
        }
    }

    class e extends b {
        e() {
        }
    }

    class f implements View.OnAttachStateChangeListener {
        f() {
        }

        public void onViewAttachedToWindow(View view) {
            h.l(view).f2780a.run();
            view.removeOnAttachStateChangeListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            synchronized (this) {
                boolean unused = h.this.f2781b = false;
            }
            h.t();
            if (!h.this.f2784e.isAttachedToWindow()) {
                h.this.f2784e.removeOnAttachStateChangeListener(h.f2779v);
                h.this.f2784e.addOnAttachStateChangeListener(h.f2779v);
                return;
            }
            h.this.k();
        }
    }

    /* renamed from: androidx.databinding.h$h  reason: collision with other inner class name */
    class C0046h implements Choreographer.FrameCallback {
        C0046h() {
        }

        public void doFrame(long j10) {
            h.this.f2780a.run();
        }
    }

    protected static class i {
    }

    static class j implements r {

        /* renamed from: e  reason: collision with root package name */
        final WeakReference f2794e;

        private j(h hVar) {
            this.f2794e = new WeakReference(hVar);
        }

        @c0(k.a.ON_START)
        public void onStart() {
            h hVar = (h) this.f2794e.get();
            if (hVar != null) {
                hVar.k();
            }
        }

        /* synthetic */ j(h hVar, a aVar) {
            this(hVar);
        }
    }

    protected h(e eVar, View view, int i10) {
        this.f2780a = new g();
        this.f2781b = false;
        this.f2782c = false;
        this.f2783d = new i[i10];
        this.f2784e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        } else if (f2772o) {
            this.f2786g = Choreographer.getInstance();
            this.f2787h = new C0046h();
        } else {
            this.f2787h = null;
            this.f2788i = new Handler(Looper.myLooper());
        }
    }

    private static e h(Object obj) {
        if (obj == null) {
            return null;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void j() {
        if (this.f2785f) {
            u();
        } else if (n()) {
            this.f2785f = true;
            this.f2782c = false;
            i();
            this.f2785f = false;
        }
    }

    static h l(View view) {
        if (view != null) {
            return (h) view.getTag(e0.a.dataBinding);
        }
        return null;
    }

    protected static h o(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
        h(obj);
        return f.e(layoutInflater, i10, viewGroup, z10, (e) null);
    }

    private static boolean p(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void q(androidx.databinding.e r8, android.view.View r9, java.lang.Object[] r10, androidx.databinding.h.i r11, android.util.SparseIntArray r12, boolean r13) {
        /*
            androidx.databinding.h r0 = l(r9)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = r9.getTag()
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r1 = 0
            r2 = 1
            if (r13 == 0) goto L_0x003b
            if (r0 == 0) goto L_0x003b
            java.lang.String r13 = "layout"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x003b
            r13 = 95
            int r13 = r0.lastIndexOf(r13)
            if (r13 <= 0) goto L_0x0052
            int r13 = r13 + r2
            boolean r3 = p(r0, r13)
            if (r3 == 0) goto L_0x0052
            int r13 = s(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L_0x0053
            r10[r13] = r9
            goto L_0x0053
        L_0x003b:
            if (r0 == 0) goto L_0x0052
            java.lang.String r13 = "binding_"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x0052
            int r13 = f2771n
            int r13 = s(r0, r13)
            r0 = r10[r13]
            if (r0 != 0) goto L_0x0053
            r10[r13] = r9
            goto L_0x0053
        L_0x0052:
            r2 = r1
        L_0x0053:
            if (r2 != 0) goto L_0x006a
            int r13 = r9.getId()
            if (r13 <= 0) goto L_0x006a
            if (r12 == 0) goto L_0x006a
            r0 = -1
            int r13 = r12.get(r13, r0)
            if (r13 < 0) goto L_0x006a
            r0 = r10[r13]
            if (r0 != 0) goto L_0x006a
            r10[r13] = r9
        L_0x006a:
            boolean r13 = r9 instanceof android.view.ViewGroup
            if (r13 == 0) goto L_0x0085
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r13 = r9.getChildCount()
        L_0x0074:
            if (r1 >= r13) goto L_0x0085
            android.view.View r3 = r9.getChildAt(r1)
            r7 = 0
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            q(r2, r3, r4, r5, r6, r7)
            int r1 = r1 + 1
            goto L_0x0074
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.h.q(androidx.databinding.e, android.view.View, java.lang.Object[], androidx.databinding.h$i, android.util.SparseIntArray, boolean):void");
    }

    protected static Object[] r(e eVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        q(eVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    private static int s(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            i11 = (i11 * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return i11;
    }

    /* access modifiers changed from: private */
    public static void t() {
        do {
        } while (f2778u.poll() != null);
    }

    /* access modifiers changed from: protected */
    public abstract void i();

    public void k() {
        h hVar = this.f2789j;
        if (hVar == null) {
            j();
        } else {
            hVar.k();
        }
    }

    public View m() {
        return this.f2784e;
    }

    public abstract boolean n();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (f2772o == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r2.f2786g.postFrameCallback(r2.f2787h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r2.f2788i.post(r2.f2780a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u() {
        /*
            r2 = this;
            androidx.databinding.h r0 = r2.f2789j
            if (r0 == 0) goto L_0x0008
            r0.u()
            goto L_0x003d
        L_0x0008:
            androidx.lifecycle.s r0 = r2.f2790k
            if (r0 == 0) goto L_0x001d
            androidx.lifecycle.k r0 = r0.d0()
            androidx.lifecycle.k$b r0 = r0.b()
            androidx.lifecycle.k$b r1 = androidx.lifecycle.k.b.STARTED
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            monitor-enter(r2)
            boolean r0 = r2.f2781b     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0026
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r0 = move-exception
            goto L_0x003e
        L_0x0026:
            r0 = 1
            r2.f2781b = r0     // Catch:{ all -> 0x0024 }
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            boolean r0 = f2772o
            if (r0 == 0) goto L_0x0036
            android.view.Choreographer r0 = r2.f2786g
            android.view.Choreographer$FrameCallback r1 = r2.f2787h
            r0.postFrameCallback(r1)
            goto L_0x003d
        L_0x0036:
            android.os.Handler r0 = r2.f2788i
            java.lang.Runnable r1 = r2.f2780a
            r0.post(r1)
        L_0x003d:
            return
        L_0x003e:
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.h.u():void");
    }

    public void v(s sVar) {
        if (sVar instanceof androidx.fragment.app.i) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        s sVar2 = this.f2790k;
        if (sVar2 != sVar) {
            if (sVar2 != null) {
                sVar2.d0().d(this.f2791l);
            }
            this.f2790k = sVar;
            if (sVar != null) {
                if (this.f2791l == null) {
                    this.f2791l = new j(this, (a) null);
                }
                sVar.d0().a(this.f2791l);
            }
            for (i iVar : this.f2783d) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void w(View view) {
        view.setTag(e0.a.dataBinding, this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected h(Object obj, View view, int i10) {
        this((e) null, view, i10);
        h(obj);
    }
}
