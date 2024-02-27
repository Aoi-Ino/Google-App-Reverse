package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Runnable f7321e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p.b f7322f;

    public /* synthetic */ e(Runnable runnable, p.b bVar) {
        this.f7321e = runnable;
        this.f7322f = bVar;
    }

    public final void run() {
        o.y(this.f7321e, this.f7322f);
    }
}
