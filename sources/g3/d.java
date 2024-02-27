package g3;

import b3.e;
import c3.b;
import h3.x;
import java.util.concurrent.Executor;
import nl.a;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f11618a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11619b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11620c;

    /* renamed from: d  reason: collision with root package name */
    private final a f11621d;

    /* renamed from: e  reason: collision with root package name */
    private final a f11622e;

    public d(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        this.f11618a = aVar;
        this.f11619b = aVar2;
        this.f11620c = aVar3;
        this.f11621d = aVar4;
        this.f11622e = aVar5;
    }

    public static d a(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e eVar, x xVar, i3.d dVar, j3.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    /* renamed from: b */
    public c get() {
        return c((Executor) this.f11618a.get(), (e) this.f11619b.get(), (x) this.f11620c.get(), (i3.d) this.f11621d.get(), (j3.b) this.f11622e.get());
    }
}
