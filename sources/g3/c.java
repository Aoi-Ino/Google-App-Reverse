package g3;

import a3.i;
import a3.o;
import a3.t;
import b3.e;
import b3.m;
import h3.x;
import i3.d;
import j3.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import y2.j;

public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f11612f = Logger.getLogger(t.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final x f11613a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f11614b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11615c;

    /* renamed from: d  reason: collision with root package name */
    private final d f11616d;

    /* renamed from: e  reason: collision with root package name */
    private final b f11617e;

    public c(Executor executor, e eVar, x xVar, d dVar, b bVar) {
        this.f11614b = executor;
        this.f11615c = eVar;
        this.f11613a = xVar;
        this.f11616d = dVar;
        this.f11617e = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, i iVar) {
        this.f11616d.U(oVar, iVar);
        this.f11613a.a(oVar, 1);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(o oVar, j jVar, i iVar) {
        try {
            m i10 = this.f11615c.i(oVar.b());
            if (i10 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{oVar.b()});
                f11612f.warning(format);
                jVar.a(new IllegalArgumentException(format));
                return;
            }
            this.f11617e.g(new b(this, oVar, i10.b(iVar)));
            jVar.a((Exception) null);
        } catch (Exception e10) {
            Logger logger = f11612f;
            logger.warning("Error scheduling event " + e10.getMessage());
            jVar.a(e10);
        }
    }

    public void a(o oVar, i iVar, j jVar) {
        this.f11614b.execute(new a(this, oVar, jVar, iVar));
    }
}
