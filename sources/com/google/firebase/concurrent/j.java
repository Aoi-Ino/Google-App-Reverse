package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o f7340e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f7341f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ p.b f7342g;

    public /* synthetic */ j(o oVar, Runnable runnable, p.b bVar) {
        this.f7340e = oVar;
        this.f7341f = runnable;
        this.f7342g = bVar;
    }

    public final void run() {
        this.f7340e.w(this.f7341f, this.f7342g);
    }
}
