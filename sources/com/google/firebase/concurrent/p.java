package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class p extends androidx.concurrent.futures.a implements ScheduledFuture {

    /* renamed from: l  reason: collision with root package name */
    private final ScheduledFuture f7355l;

    class a implements b {
        a() {
        }

        public void a(Throwable th2) {
            boolean unused = p.this.p(th2);
        }

        public void set(Object obj) {
            boolean unused = p.this.o(obj);
        }
    }

    interface b {
        void a(Throwable th2);

        void set(Object obj);
    }

    interface c {
        ScheduledFuture a(b bVar);
    }

    p(c cVar) {
        this.f7355l = cVar.a(new a());
    }

    /* access modifiers changed from: protected */
    public void c() {
        this.f7355l.cancel(r());
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f7355l.getDelay(timeUnit);
    }

    /* renamed from: u */
    public int compareTo(Delayed delayed) {
        return this.f7355l.compareTo(delayed);
    }
}
