package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class c implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7315a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f7316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7317c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7318d;

    public /* synthetic */ c(o oVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f7315a = oVar;
        this.f7316b = callable;
        this.f7317c = j10;
        this.f7318d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7315a.s(this.f7316b, this.f7317c, this.f7318d, bVar);
    }
}
