package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o f7337e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f7338f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p.b f7339g;

    public /* synthetic */ i(o oVar, Runnable runnable, p.b bVar) {
        this.f7337e = oVar;
        this.f7338f = runnable;
        this.f7339g = bVar;
    }

    public final void run() {
        this.f7337e.u(this.f7338f, this.f7339g);
    }
}
