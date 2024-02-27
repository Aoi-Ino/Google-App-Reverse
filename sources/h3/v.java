package h3;

import a3.o;
import i3.d;
import j3.b;
import java.util.concurrent.Executor;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12004a;

    /* renamed from: b  reason: collision with root package name */
    private final d f12005b;

    /* renamed from: c  reason: collision with root package name */
    private final x f12006c;

    /* renamed from: d  reason: collision with root package name */
    private final b f12007d;

    v(Executor executor, d dVar, x xVar, b bVar) {
        this.f12004a = executor;
        this.f12005b = dVar;
        this.f12006c = xVar;
        this.f12007d = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (o a10 : this.f12005b.V()) {
            this.f12006c.a(a10, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f12007d.g(new u(this));
    }

    public void c() {
        this.f12004a.execute(new t(this));
    }
}
