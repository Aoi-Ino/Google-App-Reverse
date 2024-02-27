package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7346a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f7347b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f7348c;

    public /* synthetic */ l(o oVar, Callable callable, p.b bVar) {
        this.f7346a = oVar;
        this.f7347b = callable;
        this.f7348c = bVar;
    }

    public final Object call() {
        return this.f7346a.r(this.f7347b, this.f7348c);
    }
}
