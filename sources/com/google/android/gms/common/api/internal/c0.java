package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p3.c;
import p4.j;
import r3.r;

public final class c0 extends r {

    /* renamed from: b  reason: collision with root package name */
    private final g f5279b;

    /* renamed from: c  reason: collision with root package name */
    private final j f5280c;

    /* renamed from: d  reason: collision with root package name */
    private final r3.j f5281d;

    public c0(int i10, g gVar, j jVar, r3.j jVar2) {
        super(i10);
        this.f5280c = jVar;
        this.f5279b = gVar;
        this.f5281d = jVar2;
        if (i10 == 2 && gVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        this.f5280c.d(this.f5281d.a(status));
    }

    public final void b(Exception exc) {
        this.f5280c.d(exc);
    }

    public final void c(q qVar) {
        try {
            this.f5279b.b(qVar.u(), this.f5280c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(e0.e(e11));
        } catch (RuntimeException e12) {
            this.f5280c.d(e12);
        }
    }

    public final void d(j jVar, boolean z10) {
        jVar.b(this.f5280c, z10);
    }

    public final boolean f(q qVar) {
        return this.f5279b.c();
    }

    public final c[] g(q qVar) {
        return this.f5279b.e();
    }
}
