package i3;

import c3.b;
import nl.a;

public final class n0 implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f12296a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12297b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12298c;

    /* renamed from: d  reason: collision with root package name */
    private final a f12299d;

    /* renamed from: e  reason: collision with root package name */
    private final a f12300e;

    public n0(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f12296a = aVar;
        this.f12297b = aVar2;
        this.f12298c = aVar3;
        this.f12299d = aVar4;
        this.f12300e = aVar5;
    }

    public static n0 a(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(k3.a aVar, k3.a aVar2, Object obj, Object obj2, a aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    /* renamed from: b */
    public m0 get() {
        return c((k3.a) this.f12296a.get(), (k3.a) this.f12297b.get(), this.f12298c.get(), this.f12299d.get(), this.f12300e);
    }
}
