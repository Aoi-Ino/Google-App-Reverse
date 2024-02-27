package androidx.work.impl;

import android.content.Context;
import cm.g;
import cm.l;
import d1.h;
import e1.f;
import java.util.concurrent.Executor;
import m1.b;
import r1.e;
import r1.j;
import r1.o;
import r1.r;
import r1.v;
import r1.z;
import y0.t;
import y0.u;

public abstract class WorkDatabase extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final a f4112p = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public static final h c(Context context, h.b bVar) {
            l.f(context, "$context");
            l.f(bVar, "configuration");
            h.b.a a10 = h.b.f9671f.a(context);
            a10.d(bVar.f9673b).c(bVar.f9674c).e(true).a(true);
            return new f().a(a10.b());
        }

        public final WorkDatabase b(Context context, Executor executor, b bVar, boolean z10) {
            l.f(context, "context");
            l.f(executor, "queryExecutor");
            l.f(bVar, "clock");
            Class<WorkDatabase> cls = WorkDatabase.class;
            return (WorkDatabase) (z10 ? t.c(context, cls).c() : t.a(context, cls, "androidx.work.workdb").f(new d0(context))).g(executor).a(new d(bVar)).b(k.f4248c).b(new v(context, 2, 3)).b(l.f4249c).b(m.f4250c).b(new v(context, 5, 6)).b(n.f4252c).b(o.f4253c).b(p.f4256c).b(new r0(context)).b(new v(context, 10, 11)).b(g.f4241c).b(h.f4244c).b(i.f4245c).b(j.f4247c).e().d();
        }
    }

    public abstract r1.b C();

    public abstract e D();

    public abstract j E();

    public abstract o F();

    public abstract r G();

    public abstract v H();

    public abstract z I();
}
