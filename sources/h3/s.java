package h3;

import android.content.Context;
import b3.e;
import c3.b;
import i3.c;
import i3.d;
import java.util.concurrent.Executor;
import nl.a;

public final class s implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f11993a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11994b;

    /* renamed from: c  reason: collision with root package name */
    private final a f11995c;

    /* renamed from: d  reason: collision with root package name */
    private final a f11996d;

    /* renamed from: e  reason: collision with root package name */
    private final a f11997e;

    /* renamed from: f  reason: collision with root package name */
    private final a f11998f;

    /* renamed from: g  reason: collision with root package name */
    private final a f11999g;

    /* renamed from: h  reason: collision with root package name */
    private final a f12000h;

    /* renamed from: i  reason: collision with root package name */
    private final a f12001i;

    public s(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9) {
        this.f11993a = aVar;
        this.f11994b = aVar2;
        this.f11995c = aVar3;
        this.f11996d = aVar4;
        this.f11997e = aVar5;
        this.f11998f = aVar6;
        this.f11999g = aVar7;
        this.f12000h = aVar8;
        this.f12001i = aVar9;
    }

    public static s a(a aVar, a aVar2, a aVar3, a aVar4, a aVar5, a aVar6, a aVar7, a aVar8, a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, e eVar, d dVar, x xVar, Executor executor, j3.b bVar, k3.a aVar, k3.a aVar2, c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    /* renamed from: b */
    public r get() {
        return c((Context) this.f11993a.get(), (e) this.f11994b.get(), (d) this.f11995c.get(), (x) this.f11996d.get(), (Executor) this.f11997e.get(), (j3.b) this.f11998f.get(), (k3.a) this.f11999g.get(), (k3.a) this.f12000h.get(), (c) this.f12001i.get());
    }
}
