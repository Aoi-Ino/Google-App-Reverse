package sm;

import lm.a1;
import tl.g;

public abstract class f extends a1 {

    /* renamed from: h  reason: collision with root package name */
    private final int f31303h;

    /* renamed from: i  reason: collision with root package name */
    private final int f31304i;

    /* renamed from: j  reason: collision with root package name */
    private final long f31305j;

    /* renamed from: k  reason: collision with root package name */
    private final String f31306k;

    /* renamed from: l  reason: collision with root package name */
    private a f31307l = E0();

    public f(int i10, int i11, long j10, String str) {
        this.f31303h = i10;
        this.f31304i = i11;
        this.f31305j = j10;
        this.f31306k = str;
    }

    private final a E0() {
        return new a(this.f31303h, this.f31304i, this.f31305j, this.f31306k);
    }

    public void A0(g gVar, Runnable runnable) {
        a.o(this.f31307l, runnable, (i) null, false, 6, (Object) null);
    }

    public void B0(g gVar, Runnable runnable) {
        a.o(this.f31307l, runnable, (i) null, true, 2, (Object) null);
    }

    public final void F0(Runnable runnable, i iVar, boolean z10) {
        this.f31307l.n(runnable, iVar, z10);
    }
}
