package a3;

import android.content.Context;
import g3.e;
import h3.r;
import h3.v;
import java.util.Collections;
import java.util.Set;
import k3.a;
import y2.c;
import y2.i;
import y2.j;

public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f194e;

    /* renamed from: a  reason: collision with root package name */
    private final a f195a;

    /* renamed from: b  reason: collision with root package name */
    private final a f196b;

    /* renamed from: c  reason: collision with root package name */
    private final e f197c;

    /* renamed from: d  reason: collision with root package name */
    private final r f198d;

    t(a aVar, a aVar2, e eVar, r rVar, v vVar) {
        this.f195a = aVar;
        this.f196b = aVar2;
        this.f197c = eVar;
        this.f198d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f195a.a()).k(this.f196b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f194e;
        if (uVar != null) {
            return uVar.e();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(c.b("proto"));
    }

    public static void f(Context context) {
        if (f194e == null) {
            synchronized (t.class) {
                try {
                    if (f194e == null) {
                        f194e = e.f().b(context).a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(n nVar, j jVar) {
        this.f197c.a(nVar.f().f(nVar.c().c()), b(nVar), jVar);
    }

    public r e() {
        return this.f198d;
    }

    public i g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
