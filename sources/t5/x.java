package t5;

import java.io.InputStream;

public final class x extends w {

    /* renamed from: e  reason: collision with root package name */
    private final w f16554e;

    /* renamed from: f  reason: collision with root package name */
    private final long f16555f;

    /* renamed from: g  reason: collision with root package name */
    private final long f16556g;

    public x(w wVar, long j10, long j11) {
        this.f16554e = wVar;
        long g10 = g(j10);
        this.f16555f = g10;
        this.f16556g = g(g10 + j11);
    }

    private final long g(long j10) {
        if (j10 < 0) {
            return 0;
        }
        return j10 > this.f16554e.c() ? this.f16554e.c() : j10;
    }

    public final long c() {
        return this.f16556g - this.f16555f;
    }

    public final void close() {
    }

    /* access modifiers changed from: protected */
    public final InputStream e(long j10, long j11) {
        long g10 = g(this.f16555f);
        return this.f16554e.e(g10, g(j11 + g10) - g10);
    }
}
