package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import b1.e;
import b1.f;
import r0.a;
import r0.d;

class b0 implements i, f, x0 {

    /* renamed from: e  reason: collision with root package name */
    private final i f2950e;

    /* renamed from: f  reason: collision with root package name */
    private final w0 f2951f;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f2952g;

    /* renamed from: h  reason: collision with root package name */
    private u0.b f2953h;

    /* renamed from: i  reason: collision with root package name */
    private u f2954i = null;

    /* renamed from: j  reason: collision with root package name */
    private e f2955j = null;

    b0(i iVar, w0 w0Var, Runnable runnable) {
        this.f2950e = iVar;
        this.f2951f = w0Var;
        this.f2952g = runnable;
    }

    public u0.b I() {
        Application application;
        u0.b I = this.f2950e.I();
        if (!I.equals(this.f2950e.f3041a0)) {
            this.f2953h = I;
            return I;
        }
        if (this.f2953h == null) {
            Context applicationContext = this.f2950e.E1().getApplicationContext();
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
            i iVar = this.f2950e;
            this.f2953h = new p0(application, iVar, iVar.u());
        }
        return this.f2953h;
    }

    public a J() {
        Application application;
        Context applicationContext = this.f2950e.E1().getApplicationContext();
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
        d dVar = new d();
        if (application != null) {
            dVar.c(u0.a.f3358h, application);
        }
        dVar.c(m0.f3314a, this.f2950e);
        dVar.c(m0.f3315b, this);
        if (this.f2950e.u() != null) {
            dVar.c(m0.f3316c, this.f2950e.u());
        }
        return dVar;
    }

    public w0 X() {
        b();
        return this.f2951f;
    }

    /* access modifiers changed from: package-private */
    public void a(k.a aVar) {
        this.f2954i.i(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f2954i == null) {
            this.f2954i = new u(this);
            e a10 = e.a(this);
            this.f2955j = a10;
            a10.c();
            this.f2952g.run();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f2954i != null;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f2955j.d(bundle);
    }

    public k d0() {
        b();
        return this.f2954i;
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f2955j.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(k.b bVar) {
        this.f2954i.o(bVar);
    }

    public b1.d l() {
        b();
        return this.f2955j.b();
    }
}
