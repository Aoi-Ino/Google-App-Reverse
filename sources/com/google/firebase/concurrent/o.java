package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class o implements ScheduledExecutorService {

    /* renamed from: e  reason: collision with root package name */
    private final ExecutorService f7353e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f7354f;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f7353e = executorService;
        this.f7354f = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void n(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set((Object) null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(Runnable runnable, p.b bVar) {
        this.f7353e.execute(new d(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture p(Runnable runnable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f7354f.schedule(new k(this, runnable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Future r(Callable callable, p.b bVar) {
        return this.f7353e.submit(new m(callable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture s(Callable callable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f7354f.schedule(new l(this, callable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void t(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(Runnable runnable, p.b bVar) {
        this.f7353e.execute(new n(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture v(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f7354f.scheduleAtFixedRate(new i(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(Runnable runnable, p.b bVar) {
        this.f7353e.execute(new e(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture x(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f7354f.scheduleWithFixedDelay(new j(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void y(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f7353e.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f7353e.execute(runnable);
    }

    public List invokeAll(Collection collection) {
        return this.f7353e.invokeAll(collection);
    }

    public Object invokeAny(Collection collection) {
        return this.f7353e.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f7353e.isShutdown();
    }

    public boolean isTerminated() {
        return this.f7353e.isTerminated();
    }

    public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new p(new f(this, runnable, j10, timeUnit));
    }

    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new h(this, runnable, j10, j11, timeUnit));
    }

    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new g(this, runnable, j10, j11, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future submit(Runnable runnable) {
        return this.f7353e.submit(runnable);
    }

    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f7353e.invokeAll(collection, j10, timeUnit);
    }

    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f7353e.invokeAny(collection, j10, timeUnit);
    }

    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return new p(new c(this, callable, j10, timeUnit));
    }

    public Future submit(Runnable runnable, Object obj) {
        return this.f7353e.submit(runnable, obj);
    }

    public Future submit(Callable callable) {
        return this.f7353e.submit(callable);
    }
}
