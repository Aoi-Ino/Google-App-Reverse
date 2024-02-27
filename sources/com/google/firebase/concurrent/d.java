package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Runnable f7319e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p.b f7320f;

    public /* synthetic */ d(Runnable runnable, p.b bVar) {
        this.f7319e = runnable;
        this.f7320f = bVar;
    }

    public final void run() {
        o.n(this.f7319e, this.f7320f);
    }
}
