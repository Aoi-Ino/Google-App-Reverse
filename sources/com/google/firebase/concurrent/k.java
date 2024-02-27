package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o f7343e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f7344f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p.b f7345g;

    public /* synthetic */ k(o oVar, Runnable runnable, p.b bVar) {
        this.f7343e = oVar;
        this.f7344f = runnable;
        this.f7345g = bVar;
    }

    public final void run() {
        this.f7343e.o(this.f7344f, this.f7345g);
    }
}
