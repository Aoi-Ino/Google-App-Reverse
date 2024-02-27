package in;

import cm.g;
import cm.l;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class b0 {

    /* renamed from: d  reason: collision with root package name */
    public static final b0 f24447d = new a();

    /* renamed from: e  reason: collision with root package name */
    public static final b f24448e = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f24449a;

    /* renamed from: b  reason: collision with root package name */
    private long f24450b;

    /* renamed from: c  reason: collision with root package name */
    private long f24451c;

    public static final class a extends b0 {
        a() {
        }

        public b0 d(long j10) {
            return this;
        }

        public void f() {
        }

        public b0 g(long j10, TimeUnit timeUnit) {
            l.f(timeUnit, "unit");
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public b0 a() {
        this.f24449a = false;
        return this;
    }

    public b0 b() {
        this.f24451c = 0;
        return this;
    }

    public long c() {
        if (this.f24449a) {
            return this.f24450b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public b0 d(long j10) {
        this.f24449a = true;
        this.f24450b = j10;
        return this;
    }

    public boolean e() {
        return this.f24449a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f24449a && this.f24450b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public b0 g(long j10, TimeUnit timeUnit) {
        l.f(timeUnit, "unit");
        if (j10 >= 0) {
            this.f24451c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f24451c;
    }
}
