package com.google.android.gms.common.api.internal;

final class o implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p f5326e;

    o(p pVar) {
        this.f5326e = pVar;
    }

    public final void run() {
        q qVar = this.f5326e.f5327a;
        qVar.f5329c.d(qVar.f5329c.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
