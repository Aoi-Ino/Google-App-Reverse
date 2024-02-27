package com.google.firebase.concurrent;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f7308e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Runnable f7309f;

    public /* synthetic */ a(b bVar, Runnable runnable) {
        this.f7308e = bVar;
        this.f7309f = runnable;
    }

    public final void run() {
        this.f7308e.b(this.f7309f);
    }
}
