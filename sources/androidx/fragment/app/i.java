package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.r;
import androidx.core.view.q;
import androidx.lifecycle.a0;
import androidx.lifecycle.k;
import androidx.lifecycle.m0;
import androidx.lifecycle.o;
import androidx.lifecycle.p0;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class i implements ComponentCallbacks, View.OnCreateContextMenuListener, s, x0, androidx.lifecycle.i, b1.f {

    /* renamed from: g0  reason: collision with root package name */
    static final Object f3040g0 = new Object();
    i A;
    int B;
    int C;
    String D;
    boolean E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J = true;
    private boolean K;
    ViewGroup L;
    View M;
    boolean N;
    boolean O = true;
    g P;
    Handler Q;
    Runnable R = new a();
    boolean S;
    LayoutInflater T;
    boolean U;
    public String V;
    k.b W = k.b.RESUMED;
    u X;
    b0 Y;
    a0 Z = new a0();

    /* renamed from: a0  reason: collision with root package name */
    u0.b f3041a0;

    /* renamed from: b0  reason: collision with root package name */
    b1.e f3042b0;

    /* renamed from: c0  reason: collision with root package name */
    private int f3043c0;

    /* renamed from: d0  reason: collision with root package name */
    private final AtomicInteger f3044d0 = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    int f3045e = -1;

    /* renamed from: e0  reason: collision with root package name */
    private final ArrayList f3046e0 = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    Bundle f3047f;

    /* renamed from: f0  reason: collision with root package name */
    private final j f3048f0 = new b();

    /* renamed from: g  reason: collision with root package name */
    SparseArray f3049g;

    /* renamed from: h  reason: collision with root package name */
    Bundle f3050h;

    /* renamed from: i  reason: collision with root package name */
    Boolean f3051i;

    /* renamed from: j  reason: collision with root package name */
    String f3052j = UUID.randomUUID().toString();

    /* renamed from: k  reason: collision with root package name */
    Bundle f3053k;

    /* renamed from: l  reason: collision with root package name */
    i f3054l;

    /* renamed from: m  reason: collision with root package name */
    String f3055m = null;

    /* renamed from: n  reason: collision with root package name */
    int f3056n;

    /* renamed from: o  reason: collision with root package name */
    private Boolean f3057o = null;

    /* renamed from: p  reason: collision with root package name */
    boolean f3058p;

    /* renamed from: q  reason: collision with root package name */
    boolean f3059q;

    /* renamed from: r  reason: collision with root package name */
    boolean f3060r;

    /* renamed from: s  reason: collision with root package name */
    boolean f3061s;

    /* renamed from: t  reason: collision with root package name */
    boolean f3062t;

    /* renamed from: u  reason: collision with root package name */
    boolean f3063u;

    /* renamed from: v  reason: collision with root package name */
    boolean f3064v;

    /* renamed from: w  reason: collision with root package name */
    int f3065w;

    /* renamed from: x  reason: collision with root package name */
    q f3066x;

    /* renamed from: y  reason: collision with root package name */
    n f3067y;

    /* renamed from: z  reason: collision with root package name */
    q f3068z = new r();

    class a implements Runnable {
        a() {
        }

        public void run() {
            i.this.U1();
        }
    }

    class b extends j {
        b() {
            super((a) null);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            i.this.f3042b0.c();
            m0.c(i.this);
            Bundle bundle = i.this.f3047f;
            i.this.f3042b0.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            i.this.h(false);
        }
    }

    class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f0 f3072e;

        d(f0 f0Var) {
            this.f3072e = f0Var;
        }

        public void run() {
            this.f3072e.k();
        }
    }

    class e extends n0.k {
        e() {
        }

        public View c(int i10) {
            View view = i.this.M;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + i.this + " does not have a view");
        }

        public boolean d() {
            return i.this.M != null;
        }
    }

    class f implements o {
        f() {
        }

        public void d(s sVar, k.a aVar) {
            View view;
            if (aVar == k.a.ON_STOP && (view = i.this.M) != null) {
                h.a(view);
            }
        }
    }

    static class g {

        /* renamed from: a  reason: collision with root package name */
        View f3076a;

        /* renamed from: b  reason: collision with root package name */
        boolean f3077b;

        /* renamed from: c  reason: collision with root package name */
        int f3078c;

        /* renamed from: d  reason: collision with root package name */
        int f3079d;

        /* renamed from: e  reason: collision with root package name */
        int f3080e;

        /* renamed from: f  reason: collision with root package name */
        int f3081f;

        /* renamed from: g  reason: collision with root package name */
        int f3082g;

        /* renamed from: h  reason: collision with root package name */
        ArrayList f3083h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList f3084i;

        /* renamed from: j  reason: collision with root package name */
        Object f3085j = null;

        /* renamed from: k  reason: collision with root package name */
        Object f3086k;

        /* renamed from: l  reason: collision with root package name */
        Object f3087l;

        /* renamed from: m  reason: collision with root package name */
        Object f3088m;

        /* renamed from: n  reason: collision with root package name */
        Object f3089n;

        /* renamed from: o  reason: collision with root package name */
        Object f3090o;

        /* renamed from: p  reason: collision with root package name */
        Boolean f3091p;

        /* renamed from: q  reason: collision with root package name */
        Boolean f3092q;

        /* renamed from: r  reason: collision with root package name */
        float f3093r;

        /* renamed from: s  reason: collision with root package name */
        View f3094s;

        /* renamed from: t  reason: collision with root package name */
        boolean f3095t;

        g() {
            Object obj = i.f3040g0;
            this.f3086k = obj;
            this.f3087l = null;
            this.f3088m = obj;
            this.f3089n = null;
            this.f3090o = obj;
            this.f3093r = 1.0f;
            this.f3094s = null;
        }
    }

    static class h {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.i$i  reason: collision with other inner class name */
    public static class C0053i extends RuntimeException {
        public C0053i(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class j {
        private j() {
        }

        /* synthetic */ j(a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    public i() {
        k0();
    }

    private void B1(j jVar) {
        if (this.f3045e >= 0) {
            jVar.a();
        } else {
            this.f3046e0.add(jVar);
        }
    }

    private void H1() {
        if (q.J0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.M != null) {
            Bundle bundle = this.f3047f;
            I1(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f3047f = null;
    }

    private int K() {
        k.b bVar = this.W;
        return (bVar == k.b.INITIALIZED || this.A == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.A.K());
    }

    private i g0(boolean z10) {
        String str;
        if (z10) {
            o0.c.h(this);
        }
        i iVar = this.f3054l;
        if (iVar != null) {
            return iVar;
        }
        q qVar = this.f3066x;
        if (qVar == null || (str = this.f3055m) == null) {
            return null;
        }
        return qVar.e0(str);
    }

    private void k0() {
        this.X = new u(this);
        this.f3042b0 = b1.e.a(this);
        this.f3041a0 = null;
        if (!this.f3046e0.contains(this.f3048f0)) {
            B1(this.f3048f0);
        }
    }

    public static i m0(Context context, String str, Bundle bundle) {
        try {
            i iVar = (i) m.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(iVar.getClass().getClassLoader());
                iVar.K1(bundle);
            }
            return iVar;
        } catch (InstantiationException e10) {
            throw new C0053i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new C0053i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new C0053i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new C0053i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private g o() {
        if (this.P == null) {
            this.P = new g();
        }
        return this.P;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u0() {
        this.Y.d(this.f3050h);
        this.f3050h = null;
    }

    /* access modifiers changed from: package-private */
    public r A() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public void A0(i iVar) {
    }

    /* access modifiers changed from: package-private */
    public void A1() {
        Bundle bundle = this.f3047f;
        b1(this.M, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f3068z.T();
    }

    /* access modifiers changed from: package-private */
    public int B() {
        g gVar = this.P;
        if (gVar == null) {
            return 0;
        }
        return gVar.f3079d;
    }

    public boolean B0(MenuItem menuItem) {
        return false;
    }

    public Object C() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        return gVar.f3087l;
    }

    public void C0(Bundle bundle) {
        this.K = true;
        G1();
        if (!this.f3068z.P0(1)) {
            this.f3068z.A();
        }
    }

    public final void C1(String[] strArr, int i10) {
        if (this.f3067y != null) {
            O().W0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public r D() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        gVar.getClass();
        return null;
    }

    public Animation D0(int i10, boolean z10, int i11) {
        return null;
    }

    public final j D1() {
        j q10 = q();
        if (q10 != null) {
            return q10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    public View E() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        return gVar.f3094s;
    }

    public Animator E0(int i10, boolean z10, int i11) {
        return null;
    }

    public final Context E1() {
        Context w10 = w();
        if (w10 != null) {
            return w10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final Object F() {
        n nVar = this.f3067y;
        if (nVar == null) {
            return null;
        }
        return nVar.i();
    }

    public void F0(Menu menu, MenuInflater menuInflater) {
    }

    public final View F1() {
        View h02 = h0();
        if (h02 != null) {
            return h02;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final int G() {
        return this.B;
    }

    public View G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f3043c0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void G1() {
        Bundle bundle;
        Bundle bundle2 = this.f3047f;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.f3068z.n1(bundle);
            this.f3068z.A();
        }
    }

    public LayoutInflater H(Bundle bundle) {
        n nVar = this.f3067y;
        if (nVar != null) {
            LayoutInflater j10 = nVar.j();
            q.a(j10, this.f3068z.x0());
            return j10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void H0() {
        this.K = true;
    }

    public u0.b I() {
        Application application;
        if (this.f3066x != null) {
            if (this.f3041a0 == null) {
                Context applicationContext = E1().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && q.J0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + E1().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f3041a0 = new p0(application, this, u());
            }
            return this.f3041a0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public void I0() {
    }

    /* access modifiers changed from: package-private */
    public final void I1(Bundle bundle) {
        SparseArray sparseArray = this.f3049g;
        if (sparseArray != null) {
            this.M.restoreHierarchyState(sparseArray);
            this.f3049g = null;
        }
        this.K = false;
        c1(bundle);
        if (!this.K) {
            throw new h0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.M != null) {
            this.Y.a(k.a.ON_CREATE);
        }
    }

    public r0.a J() {
        Application application;
        Context applicationContext = E1().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && q.J0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + E1().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        r0.d dVar = new r0.d();
        if (application != null) {
            dVar.c(u0.a.f3358h, application);
        }
        dVar.c(m0.f3314a, this);
        dVar.c(m0.f3315b, this);
        if (u() != null) {
            dVar.c(m0.f3316c, u());
        }
        return dVar;
    }

    public void J0() {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void J1(int i10, int i11, int i12, int i13) {
        if (this.P != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            o().f3078c = i10;
            o().f3079d = i11;
            o().f3080e = i12;
            o().f3081f = i13;
        }
    }

    public void K0() {
        this.K = true;
    }

    public void K1(Bundle bundle) {
        if (this.f3066x == null || !t0()) {
            this.f3053k = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: package-private */
    public int L() {
        g gVar = this.P;
        if (gVar == null) {
            return 0;
        }
        return gVar.f3082g;
    }

    public LayoutInflater L0(Bundle bundle) {
        return H(bundle);
    }

    /* access modifiers changed from: package-private */
    public void L1(View view) {
        o().f3094s = view;
    }

    public final i M() {
        return this.A;
    }

    public void M0(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public void M1(int i10) {
        if (this.P != null || i10 != 0) {
            o();
            this.P.f3082g = i10;
        }
    }

    public void N0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void N1(boolean z10) {
        if (this.P != null) {
            o().f3077b = z10;
        }
    }

    public final q O() {
        q qVar = this.f3066x;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void O0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.K = true;
        n nVar = this.f3067y;
        Activity e10 = nVar == null ? null : nVar.e();
        if (e10 != null) {
            this.K = false;
            N0(e10, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void O1(float f10) {
        o().f3093r = f10;
    }

    public void P0(boolean z10) {
    }

    /* access modifiers changed from: package-private */
    public void P1(ArrayList arrayList, ArrayList arrayList2) {
        o();
        g gVar = this.P;
        gVar.f3083h = arrayList;
        gVar.f3084i = arrayList2;
    }

    /* access modifiers changed from: package-private */
    public boolean Q() {
        g gVar = this.P;
        if (gVar == null) {
            return false;
        }
        return gVar.f3077b;
    }

    public boolean Q0(MenuItem menuItem) {
        return false;
    }

    public boolean Q1(String str) {
        n nVar = this.f3067y;
        if (nVar != null) {
            return nVar.n(str);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int R() {
        g gVar = this.P;
        if (gVar == null) {
            return 0;
        }
        return gVar.f3080e;
    }

    public void R0(Menu menu) {
    }

    public void R1(Intent intent) {
        S1(intent, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public int S() {
        g gVar = this.P;
        if (gVar == null) {
            return 0;
        }
        return gVar.f3081f;
    }

    public void S0() {
        this.K = true;
    }

    public void S1(Intent intent, Bundle bundle) {
        n nVar = this.f3067y;
        if (nVar != null) {
            nVar.p(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    public float T() {
        g gVar = this.P;
        if (gVar == null) {
            return 1.0f;
        }
        return gVar.f3093r;
    }

    public void T0(boolean z10) {
    }

    public void T1(Intent intent, int i10, Bundle bundle) {
        if (this.f3067y != null) {
            O().X0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object U() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f3088m;
        return obj == f3040g0 ? C() : obj;
    }

    public void U0(Menu menu) {
    }

    public void U1() {
        if (this.P != null && o().f3095t) {
            if (this.f3067y == null) {
                o().f3095t = false;
            } else if (Looper.myLooper() != this.f3067y.g().getLooper()) {
                this.f3067y.g().postAtFrontOfQueue(new c());
            } else {
                h(true);
            }
        }
    }

    public final Resources V() {
        return E1().getResources();
    }

    public void V0(boolean z10) {
    }

    public Object W() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f3086k;
        return obj == f3040g0 ? z() : obj;
    }

    public void W0(int i10, String[] strArr, int[] iArr) {
    }

    public w0 X() {
        if (this.f3066x == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (K() != k.b.INITIALIZED.ordinal()) {
            return this.f3066x.E0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void X0() {
        this.K = true;
    }

    public Object Y() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        return gVar.f3089n;
    }

    public void Y0(Bundle bundle) {
    }

    public Object Z() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        Object obj = gVar.f3090o;
        return obj == f3040g0 ? Y() : obj;
    }

    public void Z0() {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3083h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a0() {
        /*
            r1 = this;
            androidx.fragment.app.i$g r0 = r1.P
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f3083h
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.a0():java.util.ArrayList");
    }

    public void a1() {
        this.K = true;
    }

    public void b1(View view, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f3084i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList c0() {
        /*
            r1 = this;
            androidx.fragment.app.i$g r0 = r1.P
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList r0 = r0.f3084i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.c0():java.util.ArrayList");
    }

    public void c1(Bundle bundle) {
        this.K = true;
    }

    public k d0() {
        return this.X;
    }

    /* access modifiers changed from: package-private */
    public void d1(Bundle bundle) {
        this.f3068z.Z0();
        this.f3045e = 3;
        this.K = false;
        w0(bundle);
        if (this.K) {
            H1();
            this.f3068z.w();
            return;
        }
        throw new h0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public final String e0(int i10) {
        return V().getString(i10);
    }

    /* access modifiers changed from: package-private */
    public void e1() {
        Iterator it = this.f3046e0.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
        this.f3046e0.clear();
        this.f3068z.l(this.f3067y, i(), this);
        this.f3045e = 0;
        this.K = false;
        z0(this.f3067y.f());
        if (this.K) {
            this.f3066x.G(this);
            this.f3068z.x();
            return;
        }
        throw new h0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final String f0() {
        return this.D;
    }

    /* access modifiers changed from: package-private */
    public void f1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: package-private */
    public boolean g1(MenuItem menuItem) {
        if (this.E) {
            return false;
        }
        if (B0(menuItem)) {
            return true;
        }
        return this.f3068z.z(menuItem);
    }

    /* access modifiers changed from: package-private */
    public void h(boolean z10) {
        ViewGroup viewGroup;
        q qVar;
        g gVar = this.P;
        if (gVar != null) {
            gVar.f3095t = false;
        }
        if (this.M != null && (viewGroup = this.L) != null && (qVar = this.f3066x) != null) {
            f0 r10 = f0.r(viewGroup, qVar);
            r10.t();
            if (z10) {
                this.f3067y.g().post(new d(r10));
            } else {
                r10.k();
            }
            Handler handler = this.Q;
            if (handler != null) {
                handler.removeCallbacks(this.R);
                this.Q = null;
            }
        }
    }

    public View h0() {
        return this.M;
    }

    /* access modifiers changed from: package-private */
    public void h1(Bundle bundle) {
        this.f3068z.Z0();
        this.f3045e = 1;
        this.K = false;
        this.X.a(new f());
        C0(bundle);
        this.U = true;
        if (this.K) {
            this.X.i(k.a.ON_CREATE);
            return;
        }
        throw new h0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    public n0.k i() {
        return new e();
    }

    public s i0() {
        b0 b0Var = this.Y;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public boolean i1(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.E) {
            return false;
        }
        if (this.I && this.J) {
            F0(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.f3068z.B(menu, menuInflater);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.B));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.C));
        printWriter.print(" mTag=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f3045e);
        printWriter.print(" mWho=");
        printWriter.print(this.f3052j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f3065w);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f3058p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f3059q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f3061s);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f3062t);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.E);
        printWriter.print(" mDetached=");
        printWriter.print(this.F);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.J);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.G);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.O);
        if (this.f3066x != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f3066x);
        }
        if (this.f3067y != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f3067y);
        }
        if (this.A != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.A);
        }
        if (this.f3053k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f3053k);
        }
        if (this.f3047f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f3047f);
        }
        if (this.f3049g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f3049g);
        }
        if (this.f3050h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f3050h);
        }
        i g02 = g0(false);
        if (g02 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(g02);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f3056n);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(Q());
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(x());
        }
        if (B() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(B());
        }
        if (R() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(R());
        }
        if (S() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(S());
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.L);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.M);
        }
        if (t() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(t());
        }
        if (w() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f3068z + ":");
        q qVar = this.f3068z;
        qVar.V(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public x j0() {
        return this.Z;
    }

    /* access modifiers changed from: package-private */
    public void j1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f3068z.Z0();
        this.f3064v = true;
        this.Y = new b0(this, X(), new n0.f(this));
        View G0 = G0(layoutInflater, viewGroup, bundle);
        this.M = G0;
        if (G0 != null) {
            this.Y.b();
            if (q.J0(3)) {
                Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.M + " for Fragment " + this);
            }
            y0.a(this.M, this.Y);
            z0.a(this.M, this.Y);
            b1.g.a(this.M, this.Y);
            this.Z.m(this.Y);
        } else if (!this.Y.c()) {
            this.Y = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    public void k1() {
        this.f3068z.C();
        this.X.i(k.a.ON_DESTROY);
        this.f3045e = 0;
        this.K = false;
        this.U = false;
        H0();
        if (!this.K) {
            throw new h0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public final b1.d l() {
        return this.f3042b0.b();
    }

    /* access modifiers changed from: package-private */
    public void l0() {
        k0();
        this.V = this.f3052j;
        this.f3052j = UUID.randomUUID().toString();
        this.f3058p = false;
        this.f3059q = false;
        this.f3061s = false;
        this.f3062t = false;
        this.f3063u = false;
        this.f3065w = 0;
        this.f3066x = null;
        this.f3068z = new r();
        this.f3067y = null;
        this.B = 0;
        this.C = 0;
        this.D = null;
        this.E = false;
        this.F = false;
    }

    /* access modifiers changed from: package-private */
    public void l1() {
        this.f3068z.D();
        if (this.M != null && this.Y.d0().b().b(k.b.CREATED)) {
            this.Y.a(k.a.ON_DESTROY);
        }
        this.f3045e = 1;
        this.K = false;
        J0();
        if (this.K) {
            androidx.loader.app.a.b(this).c();
            this.f3064v = false;
            return;
        }
        throw new h0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void m1() {
        this.f3045e = -1;
        this.K = false;
        K0();
        this.T = null;
        if (!this.K) {
            throw new h0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f3068z.I0()) {
            this.f3068z.C();
            this.f3068z = new r();
        }
    }

    public final boolean n0() {
        return this.f3067y != null && this.f3058p;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater n1(Bundle bundle) {
        LayoutInflater L0 = L0(bundle);
        this.T = L0;
        return L0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f3066x;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean o0() {
        /*
            r2 = this;
            boolean r0 = r2.E
            if (r0 != 0) goto L_0x0013
            androidx.fragment.app.q r0 = r2.f3066x
            if (r0 == 0) goto L_0x0011
            androidx.fragment.app.i r1 = r2.A
            boolean r0 = r0.M0(r1)
            if (r0 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.o0():boolean");
    }

    /* access modifiers changed from: package-private */
    public void o1() {
        onLowMemory();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.K = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        D1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public i p(String str) {
        return str.equals(this.f3052j) ? this : this.f3068z.i0(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean p0() {
        return this.f3065w > 0;
    }

    /* access modifiers changed from: package-private */
    public void p1(boolean z10) {
        P0(z10);
    }

    public final j q() {
        n nVar = this.f3067y;
        if (nVar == null) {
            return null;
        }
        return (j) nVar.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f3066x;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q0() {
        /*
            r2 = this;
            boolean r0 = r2.J
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.q r0 = r2.f3066x
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.i r1 = r2.A
            boolean r0 = r0.N0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.q0():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean q1(MenuItem menuItem) {
        if (this.E) {
            return false;
        }
        if (!this.I || !this.J || !Q0(menuItem)) {
            return this.f3068z.I(menuItem);
        }
        return true;
    }

    public boolean r() {
        Boolean bool;
        g gVar = this.P;
        if (gVar == null || (bool = gVar.f3092q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public boolean r0() {
        g gVar = this.P;
        if (gVar == null) {
            return false;
        }
        return gVar.f3095t;
    }

    /* access modifiers changed from: package-private */
    public void r1(Menu menu) {
        if (!this.E) {
            if (this.I && this.J) {
                R0(menu);
            }
            this.f3068z.J(menu);
        }
    }

    public boolean s() {
        Boolean bool;
        g gVar = this.P;
        if (gVar == null || (bool = gVar.f3091p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean s0() {
        return this.f3059q;
    }

    /* access modifiers changed from: package-private */
    public void s1() {
        this.f3068z.L();
        if (this.M != null) {
            this.Y.a(k.a.ON_PAUSE);
        }
        this.X.i(k.a.ON_PAUSE);
        this.f3045e = 6;
        this.K = false;
        S0();
        if (!this.K) {
            throw new h0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void startActivityForResult(Intent intent, int i10) {
        T1(intent, i10, (Bundle) null);
    }

    /* access modifiers changed from: package-private */
    public View t() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        return gVar.f3076a;
    }

    public final boolean t0() {
        q qVar = this.f3066x;
        if (qVar == null) {
            return false;
        }
        return qVar.Q0();
    }

    /* access modifiers changed from: package-private */
    public void t1(boolean z10) {
        T0(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f3052j);
        if (this.B != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.B));
        }
        if (this.D != null) {
            sb2.append(" tag=");
            sb2.append(this.D);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final Bundle u() {
        return this.f3053k;
    }

    /* access modifiers changed from: package-private */
    public boolean u1(Menu menu) {
        boolean z10 = false;
        if (this.E) {
            return false;
        }
        if (this.I && this.J) {
            U0(menu);
            z10 = true;
        }
        return z10 | this.f3068z.N(menu);
    }

    public final q v() {
        if (this.f3067y != null) {
            return this.f3068z;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* access modifiers changed from: package-private */
    public void v0() {
        this.f3068z.Z0();
    }

    /* access modifiers changed from: package-private */
    public void v1() {
        boolean O0 = this.f3066x.O0(this);
        Boolean bool = this.f3057o;
        if (bool == null || bool.booleanValue() != O0) {
            this.f3057o = Boolean.valueOf(O0);
            V0(O0);
            this.f3068z.O();
        }
    }

    public Context w() {
        n nVar = this.f3067y;
        if (nVar == null) {
            return null;
        }
        return nVar.f();
    }

    public void w0(Bundle bundle) {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void w1() {
        this.f3068z.Z0();
        this.f3068z.Z(true);
        this.f3045e = 7;
        this.K = false;
        X0();
        if (this.K) {
            u uVar = this.X;
            k.a aVar = k.a.ON_RESUME;
            uVar.i(aVar);
            if (this.M != null) {
                this.Y.a(aVar);
            }
            this.f3068z.P();
            return;
        }
        throw new h0("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public int x() {
        g gVar = this.P;
        if (gVar == null) {
            return 0;
        }
        return gVar.f3078c;
    }

    public void x0(int i10, int i11, Intent intent) {
        if (q.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void x1(Bundle bundle) {
        Y0(bundle);
    }

    public void y0(Activity activity) {
        this.K = true;
    }

    /* access modifiers changed from: package-private */
    public void y1() {
        this.f3068z.Z0();
        this.f3068z.Z(true);
        this.f3045e = 5;
        this.K = false;
        Z0();
        if (this.K) {
            u uVar = this.X;
            k.a aVar = k.a.ON_START;
            uVar.i(aVar);
            if (this.M != null) {
                this.Y.a(aVar);
            }
            this.f3068z.Q();
            return;
        }
        throw new h0("Fragment " + this + " did not call through to super.onStart()");
    }

    public Object z() {
        g gVar = this.P;
        if (gVar == null) {
            return null;
        }
        return gVar.f3085j;
    }

    public void z0(Context context) {
        this.K = true;
        n nVar = this.f3067y;
        Activity e10 = nVar == null ? null : nVar.e();
        if (e10 != null) {
            this.K = false;
            y0(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void z1() {
        this.f3068z.S();
        if (this.M != null) {
            this.Y.a(k.a.ON_STOP);
        }
        this.X.i(k.a.ON_STOP);
        this.f3045e = 4;
        this.K = false;
        a1();
        if (!this.K) {
            throw new h0("Fragment " + this + " did not call through to super.onStop()");
        }
    }
}
