package h3;

import c3.b;
import i3.d;
import java.util.concurrent.Executor;
import nl.a;

public final class w implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f12008a;

    /* renamed from: b  reason: collision with root package name */
    private final a f12009b;

    /* renamed from: c  reason: collision with root package name */
    private final a f12010c;

    /* renamed from: d  reason: collision with root package name */
    private final a f12011d;

    public w(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f12008a = aVar;
        this.f12009b = aVar2;
        this.f12010c = aVar3;
        this.f12011d = aVar4;
    }

    public static w a(a aVar, a aVar2, a aVar3, a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, d dVar, x xVar, j3.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    /* renamed from: b */
    public v get() {
        return c((Executor) this.f12008a.get(), (d) this.f12009b.get(), (x) this.f12010c.get(), (j3.b) this.f12011d.get());
    }
}
