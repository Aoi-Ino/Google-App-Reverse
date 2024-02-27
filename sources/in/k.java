package in;

import cm.l;
import java.util.concurrent.TimeUnit;

public class k extends b0 {

    /* renamed from: f  reason: collision with root package name */
    private b0 f24473f;

    public k(b0 b0Var) {
        l.f(b0Var, "delegate");
        this.f24473f = b0Var;
    }

    public b0 a() {
        return this.f24473f.a();
    }

    public b0 b() {
        return this.f24473f.b();
    }

    public long c() {
        return this.f24473f.c();
    }

    public b0 d(long j10) {
        return this.f24473f.d(j10);
    }

    public boolean e() {
        return this.f24473f.e();
    }

    public void f() {
        this.f24473f.f();
    }

    public b0 g(long j10, TimeUnit timeUnit) {
        l.f(timeUnit, "unit");
        return this.f24473f.g(j10, timeUnit);
    }

    public final b0 i() {
        return this.f24473f;
    }

    public final k j(b0 b0Var) {
        l.f(b0Var, "delegate");
        this.f24473f = b0Var;
        return this;
    }
}
