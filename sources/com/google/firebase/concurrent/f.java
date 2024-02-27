package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class f implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7323a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f7324b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7325c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7326d;

    public /* synthetic */ f(o oVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f7323a = oVar;
        this.f7324b = runnable;
        this.f7325c = j10;
        this.f7326d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7323a.p(this.f7324b, this.f7325c, this.f7326d, bVar);
    }
}
