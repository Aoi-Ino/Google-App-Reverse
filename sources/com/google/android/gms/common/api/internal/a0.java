package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p4.j;
import q3.b;
import r3.r;

abstract class a0 extends r {

    /* renamed from: b  reason: collision with root package name */
    protected final j f5251b;

    public a0(int i10, j jVar) {
        super(i10);
        this.f5251b = jVar;
    }

    public final void a(Status status) {
        this.f5251b.d(new b(status));
    }

    public final void b(Exception exc) {
        this.f5251b.d(exc);
    }

    public final void c(q qVar) {
        try {
            h(qVar);
        } catch (DeadObjectException e10) {
            a(e0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(e0.e(e11));
        } catch (RuntimeException e12) {
            this.f5251b.d(e12);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void h(q qVar);
}
