package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class h implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f7333b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7334c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f7335d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7336e;

    public /* synthetic */ h(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f7332a = oVar;
        this.f7333b = runnable;
        this.f7334c = j10;
        this.f7335d = j11;
        this.f7336e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7332a.v(this.f7333b, this.f7334c, this.f7335d, this.f7336e, bVar);
    }
}
