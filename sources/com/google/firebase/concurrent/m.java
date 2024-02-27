package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Callable f7349e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p.b f7350f;

    public /* synthetic */ m(Callable callable, p.b bVar) {
        this.f7349e = callable;
        this.f7350f = bVar;
    }

    public final void run() {
        o.q(this.f7349e, this.f7350f);
    }
}
