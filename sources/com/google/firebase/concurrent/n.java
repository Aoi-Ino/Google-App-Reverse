package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Runnable f7351e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p.b f7352f;

    public /* synthetic */ n(Runnable runnable, p.b bVar) {
        this.f7351e = runnable;
        this.f7352f = bVar;
    }

    public final void run() {
        o.t(this.f7351e, this.f7352f);
    }
}
