package ym;

import cm.g;
import cm.l;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private d f33060a;

    /* renamed from: b  reason: collision with root package name */
    private long f33061b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33062c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33063d;

    public a(String str, boolean z10) {
        l.f(str, "name");
        this.f33062c = str;
        this.f33063d = z10;
        this.f33061b = -1;
    }

    public final boolean a() {
        return this.f33063d;
    }

    public final String b() {
        return this.f33062c;
    }

    public final long c() {
        return this.f33061b;
    }

    public final d d() {
        return this.f33060a;
    }

    public final void e(d dVar) {
        l.f(dVar, "queue");
        d dVar2 = this.f33060a;
        if (dVar2 != dVar) {
            if (dVar2 == null) {
                this.f33060a = dVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    public abstract long f();

    public final void g(long j10) {
        this.f33061b = j10;
    }

    public String toString() {
        return this.f33062c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, boolean z10, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
