package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f7328b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7329c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f7330d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7331e;

    public /* synthetic */ g(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f7327a = oVar;
        this.f7328b = runnable;
        this.f7329c = j10;
        this.f7330d = j11;
        this.f7331e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7327a.x(this.f7328b, this.f7329c, this.f7330d, this.f7331e, bVar);
    }
}
