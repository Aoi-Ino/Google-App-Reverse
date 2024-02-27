package um;

import cm.l;
import java.util.concurrent.TimeUnit;
import ym.e;
import zm.h;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final h f32072a;

    public k() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public final h a() {
        return this.f32072a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(int i10, long j10, TimeUnit timeUnit) {
        this(new h(e.f33073h, i10, j10, timeUnit));
        l.f(timeUnit, "timeUnit");
    }

    public k(h hVar) {
        l.f(hVar, "delegate");
        this.f32072a = hVar;
    }
}
