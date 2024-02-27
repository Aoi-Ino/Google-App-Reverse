package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.n;
import androidx.core.app.o;
import androidx.core.app.p;
import androidx.core.view.s;
import androidx.core.view.t;
import androidx.core.view.v;
import androidx.lifecycle.g0;
import androidx.lifecycle.k;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import e.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import pl.x;

public abstract class h extends androidx.core.app.f implements x0, androidx.lifecycle.i, b1.f, s, d.e, androidx.core.content.b, androidx.core.content.c, n, o, s, o {

    /* renamed from: g  reason: collision with root package name */
    final c.a f464g = new c.a();

    /* renamed from: h  reason: collision with root package name */
    private final t f465h = new t(new d(this));

    /* renamed from: i  reason: collision with root package name */
    private final u f466i = new u(this);

    /* renamed from: j  reason: collision with root package name */
    final b1.e f467j;

    /* renamed from: k  reason: collision with root package name */
    private w0 f468k;

    /* renamed from: l  reason: collision with root package name */
    private u0.b f469l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public q f470m;

    /* renamed from: n  reason: collision with root package name */
    final j f471n;

    /* renamed from: o  reason: collision with root package name */
    final n f472o;

    /* renamed from: p  reason: collision with root package name */
    private int f473p;

    /* renamed from: q  reason: collision with root package name */
    private final AtomicInteger f474q;

    /* renamed from: r  reason: collision with root package name */
    private final d.d f475r;

    /* renamed from: s  reason: collision with root package name */
    private final CopyOnWriteArrayList f476s;

    /* renamed from: t  reason: collision with root package name */
    private final CopyOnWriteArrayList f477t;

    /* renamed from: u  reason: collision with root package name */
    private final CopyOnWriteArrayList f478u;

    /* renamed from: v  reason: collision with root package name */
    private final CopyOnWriteArrayList f479v;

    /* renamed from: w  reason: collision with root package name */
    private final CopyOnWriteArrayList f480w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f481x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f482y;

    class a extends d.d {

        /* renamed from: androidx.activity.h$a$a  reason: collision with other inner class name */
        class C0010a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f484e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a.C0134a f485f;

            C0010a(int i10, a.C0134a aVar) {
                this.f484e = i10;
                this.f485f = aVar;
            }

            public void run() {
                a.this.c(this.f484e, this.f485f.a());
            }
        }

        class b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ int f487e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f488f;

            b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f487e = i10;
                this.f488f = sendIntentException;
            }

            public void run() {
                a.this.b(this.f487e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f488f));
            }
        }

        a() {
        }

        public void f(int i10, e.a aVar, Object obj, androidx.core.app.c cVar) {
            Bundle bundle;
            h hVar = h.this;
            a.C0134a b10 = aVar.b(hVar, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new C0010a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(hVar, obj);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(hVar.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.s(hVar, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                d.f fVar = (d.f) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.w(hVar, fVar.f(), i10, fVar.c(), fVar.d(), fVar.e(), 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new b(i10, e10));
                }
            } else {
                androidx.core.app.b.v(hVar, a10, i10, bundle);
            }
        }
    }

    class b implements androidx.lifecycle.o {
        b() {
        }

        public void d(androidx.lifecycle.s sVar, k.a aVar) {
            if (aVar == k.a.ON_STOP) {
                Window window = h.this.getWindow();
                View peekDecorView = window != null ? window.peekDecorView() : null;
                if (peekDecorView != null) {
                    g.a(peekDecorView);
                }
            }
        }
    }

    class c implements androidx.lifecycle.o {
        c() {
        }

        public void d(androidx.lifecycle.s sVar, k.a aVar) {
            if (aVar == k.a.ON_DESTROY) {
                h.this.f464g.b();
                if (!h.this.isChangingConfigurations()) {
                    h.this.X().a();
                }
                h.this.f471n.h();
            }
        }
    }

    class d implements androidx.lifecycle.o {
        d() {
        }

        public void d(androidx.lifecycle.s sVar, k.a aVar) {
            h.this.r0();
            h.this.d0().d(this);
        }
    }

    class e implements Runnable {
        e() {
        }

        public void run() {
            try {
                h.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }
    }

    class f implements androidx.lifecycle.o {
        f() {
        }

        public void d(androidx.lifecycle.s sVar, k.a aVar) {
            if (aVar == k.a.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                h.this.f470m.n(C0011h.a((h) sVar));
            }
        }
    }

    static class g {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.h$h  reason: collision with other inner class name */
    static class C0011h {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class i {

        /* renamed from: a  reason: collision with root package name */
        Object f495a;

        /* renamed from: b  reason: collision with root package name */
        w0 f496b;

        i() {
        }
    }

    private interface j extends Executor {
        void B(View view);

        void h();
    }

    class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: e  reason: collision with root package name */
        final long f497e = (SystemClock.uptimeMillis() + 10000);

        /* renamed from: f  reason: collision with root package name */
        Runnable f498f;

        /* renamed from: g  reason: collision with root package name */
        boolean f499g = false;

        k() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f498f;
            if (runnable != null) {
                runnable.run();
                this.f498f = null;
            }
        }

        public void B(View view) {
            if (!this.f499g) {
                this.f499g = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void execute(Runnable runnable) {
            this.f498f = runnable;
            View decorView = h.this.getWindow().getDecorView();
            if (!this.f499g) {
                decorView.postOnAnimation(new i(this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void h() {
            h.this.getWindow().getDecorView().removeCallbacks(this);
            h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void onDraw() {
            Runnable runnable = this.f498f;
            if (runnable != null) {
                runnable.run();
                this.f498f = null;
                if (!h.this.f472o.c()) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f497e) {
                return;
            }
            this.f499g = false;
            h.this.getWindow().getDecorView().post(this);
        }

        public void run() {
            h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public h() {
        b1.e a10 = b1.e.a(this);
        this.f467j = a10;
        this.f470m = null;
        j q02 = q0();
        this.f471n = q02;
        this.f472o = new n(q02, new e(this));
        this.f474q = new AtomicInteger();
        this.f475r = new a();
        this.f476s = new CopyOnWriteArrayList();
        this.f477t = new CopyOnWriteArrayList();
        this.f478u = new CopyOnWriteArrayList();
        this.f479v = new CopyOnWriteArrayList();
        this.f480w = new CopyOnWriteArrayList();
        this.f481x = false;
        this.f482y = false;
        if (d0() != null) {
            d0().a(new b());
            d0().a(new c());
            d0().a(new d());
            a10.c();
            m0.c(this);
            l().h("android:support:activity-result", new f(this));
            o0(new g(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private j q0() {
        return new k();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ x u0() {
        reportFullyDrawn();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle v0() {
        Bundle bundle = new Bundle();
        this.f475r.h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w0(Context context) {
        Bundle b10 = l().b("android:support:activity-result");
        if (b10 != null) {
            this.f475r.g(b10);
        }
    }

    public final void C(androidx.core.util.a aVar) {
        this.f480w.remove(aVar);
    }

    public final void E(androidx.core.util.a aVar) {
        this.f477t.remove(aVar);
    }

    public final void F(androidx.core.util.a aVar) {
        this.f477t.add(aVar);
    }

    public u0.b I() {
        if (this.f469l == null) {
            this.f469l = new p0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f469l;
    }

    public r0.a J() {
        r0.d dVar = new r0.d();
        if (getApplication() != null) {
            dVar.c(u0.a.f3358h, getApplication());
        }
        dVar.c(m0.f3314a, this);
        dVar.c(m0.f3315b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.c(m0.f3316c, getIntent().getExtras());
        }
        return dVar;
    }

    public final void L(androidx.core.util.a aVar) {
        this.f480w.add(aVar);
    }

    public void M(v vVar) {
        this.f465h.a(vVar);
    }

    public final d.d O() {
        return this.f475r;
    }

    public final void R(androidx.core.util.a aVar) {
        this.f479v.add(aVar);
    }

    public w0 X() {
        if (getApplication() != null) {
            r0();
            return this.f468k;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void c0(androidx.core.util.a aVar) {
        this.f479v.remove(aVar);
    }

    public androidx.lifecycle.k d0() {
        return this.f466i;
    }

    public final void g0(androidx.core.util.a aVar) {
        this.f476s.remove(aVar);
    }

    public final q k() {
        if (this.f470m == null) {
            this.f470m = new q(new e());
            d0().a(new f());
        }
        return this.f470m;
    }

    public final b1.d l() {
        return this.f467j.b();
    }

    public void o(v vVar) {
        this.f465h.f(vVar);
    }

    public final void o0(c.b bVar) {
        this.f464g.a(bVar);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f475r.b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        k().k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f476s.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f467j.d(bundle);
        this.f464g.c(this);
        super.onCreate(bundle);
        g0.e(this);
        int i10 = this.f473p;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f465h.b(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f465h.d(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z10) {
        if (!this.f481x) {
            Iterator it = this.f479v.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new androidx.core.app.g(z10));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f478u.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f465h.c(menu);
        super.onPanelClosed(i10, menu);
    }

    public void onPictureInPictureModeChanged(boolean z10) {
        if (!this.f482y) {
            Iterator it = this.f480w.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new p(z10));
            }
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f465h.e(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f475r.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object x02 = x0();
        w0 w0Var = this.f468k;
        if (w0Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            w0Var = iVar.f496b;
        }
        if (w0Var == null && x02 == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f495a = x02;
        iVar2.f496b = w0Var;
        return iVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.k d02 = d0();
        if (d02 instanceof u) {
            ((u) d02).o(k.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f467j.e(bundle);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f477t.iterator();
        while (it.hasNext()) {
            ((androidx.core.util.a) it.next()).a(Integer.valueOf(i10));
        }
    }

    public final void p0(androidx.core.util.a aVar) {
        this.f478u.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public void r0() {
        if (this.f468k == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f468k = iVar.f496b;
            }
            if (this.f468k == null) {
                this.f468k = new w0();
            }
        }
    }

    public void reportFullyDrawn() {
        try {
            if (h1.b.d()) {
                h1.b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f472o.b();
            h1.b.b();
        } catch (Throwable th2) {
            h1.b.b();
            throw th2;
        }
    }

    public void s0() {
        y0.a(getWindow().getDecorView(), this);
        z0.a(getWindow().getDecorView(), this);
        b1.g.a(getWindow().getDecorView(), this);
        v.a(getWindow().getDecorView(), this);
        u.a(getWindow().getDecorView(), this);
    }

    public abstract void setContentView(int i10);

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        s0();
        this.f471n.B(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    public final void t(androidx.core.util.a aVar) {
        this.f476s.add(aVar);
    }

    public void t0() {
        invalidateOptionsMenu();
    }

    public Object x0() {
        return null;
    }

    public final d.c y0(e.a aVar, d.b bVar) {
        return z0(aVar, this.f475r, bVar);
    }

    public final d.c z0(e.a aVar, d.d dVar, d.b bVar) {
        return dVar.i("activity_rq#" + this.f474q.getAndIncrement(), this, aVar, bVar);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.f481x = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f481x = false;
            Iterator it = this.f479v.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new androidx.core.app.g(z10, configuration));
            }
        } catch (Throwable th2) {
            this.f481x = false;
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.f482y = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f482y = false;
            Iterator it = this.f480w.iterator();
            while (it.hasNext()) {
                ((androidx.core.util.a) it.next()).a(new p(z10, configuration));
            }
        } catch (Throwable th2) {
            this.f482y = false;
            throw th2;
        }
    }

    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
