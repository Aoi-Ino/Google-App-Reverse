package a3;

import c3.b;
import g3.e;
import h3.r;
import nl.a;

public final class v implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f199a;

    /* renamed from: b  reason: collision with root package name */
    private final a f200b;

    /* renamed from: c  reason: collision with root package name */
    private final a f201c;

    /* renamed from: d  reason: collision with root package name */
    private final a f202d;

    /* renamed from: e  reason: collision with root package name */
    private final a f203e;

    public v(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f199a = aVar;
        this.f200b = aVar2;
        this.f201c = aVar3;
        this.f202d = aVar4;
        this.f203e = aVar5;
    }

    public static v a(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(k3.a aVar, k3.a aVar2, e eVar, r rVar, h3.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    /* renamed from: b */
    public t get() {
        return c((k3.a) this.f199a.get(), (k3.a) this.f200b.get(), (e) this.f201c.get(), (r) this.f202d.get(), (h3.v) this.f203e.get());
    }
}
