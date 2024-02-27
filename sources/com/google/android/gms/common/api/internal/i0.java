package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.p;
import b4.i;
import java.util.concurrent.atomic.AtomicReference;
import p3.a;
import r3.f;

public abstract class i0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: f  reason: collision with root package name */
    protected volatile boolean f5314f;

    /* renamed from: g  reason: collision with root package name */
    protected final AtomicReference f5315g = new AtomicReference((Object) null);

    /* renamed from: h  reason: collision with root package name */
    private final Handler f5316h = new i(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    protected final p3.i f5317i;

    i0(f fVar, p3.i iVar) {
        super(fVar);
        this.f5317i = iVar;
    }

    /* access modifiers changed from: private */
    public final void l(a aVar, int i10) {
        this.f5315g.set((Object) null);
        m(aVar, i10);
    }

    /* access modifiers changed from: private */
    public final void o() {
        this.f5315g.set((Object) null);
        n();
    }

    private static final int p(f0 f0Var) {
        if (f0Var == null) {
            return -1;
        }
        return f0Var.a();
    }

    public final void e(int i10, int i11, Intent intent) {
        f0 f0Var = (f0) this.f5315g.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int f10 = this.f5317i.f(b());
                if (f10 == 0) {
                    o();
                    return;
                } else if (f0Var != null) {
                    if (f0Var.b().c() == 18 && f10 == 18) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (f0Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                l(new a(i12, (PendingIntent) null, f0Var.b().toString()), p(f0Var));
                return;
            }
            return;
        }
        if (f0Var != null) {
            l(f0Var.b(), f0Var.a());
        }
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f5315g.set(bundle.getBoolean("resolving_error", false) ? new f0(new a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void i(Bundle bundle) {
        super.i(bundle);
        f0 f0Var = (f0) this.f5315g.get();
        if (f0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", f0Var.a());
            bundle.putInt("failed_status", f0Var.b().c());
            bundle.putParcelable("failed_resolution", f0Var.b().e());
        }
    }

    public void j() {
        super.j();
        this.f5314f = true;
    }

    public void k() {
        super.k();
        this.f5314f = false;
    }

    /* access modifiers changed from: protected */
    public abstract void m(a aVar, int i10);

    /* access modifiers changed from: protected */
    public abstract void n();

    public final void onCancel(DialogInterface dialogInterface) {
        l(new a(13, (PendingIntent) null), p((f0) this.f5315g.get()));
    }

    public final void s(a aVar, int i10) {
        f0 f0Var = new f0(aVar, i10);
        AtomicReference atomicReference = this.f5315g;
        while (!p.a(atomicReference, (Object) null, f0Var)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        this.f5316h.post(new h0(this, f0Var));
    }
}
