package com.google.firebase.ktx;

import androidx.annotation.Keep;
import cm.l;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import k6.d0;
import k6.g;
import k6.q;
import lm.a0;
import lm.c1;

@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7394a = new a();

        /* renamed from: b */
        public final a0 a(k6.d dVar) {
            Object b10 = dVar.b(d0.a(j6.a.class, Executor.class));
            l.e(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return c1.a((Executor) b10);
        }
    }

    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7395a = new b();

        /* renamed from: b */
        public final a0 a(k6.d dVar) {
            Object b10 = dVar.b(d0.a(j6.c.class, Executor.class));
            l.e(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return c1.a((Executor) b10);
        }
    }

    public static final class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7396a = new c();

        /* renamed from: b */
        public final a0 a(k6.d dVar) {
            Object b10 = dVar.b(d0.a(j6.b.class, Executor.class));
            l.e(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return c1.a((Executor) b10);
        }
    }

    public static final class d implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final d f7397a = new d();

        /* renamed from: b */
        public final a0 a(k6.d dVar) {
            Object b10 = dVar.b(d0.a(j6.d.class, Executor.class));
            l.e(b10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return c1.a((Executor) b10);
        }
    }

    public List<k6.c> getComponents() {
        Class<j6.a> cls = j6.a.class;
        Class<a0> cls2 = a0.class;
        Class<Executor> cls3 = Executor.class;
        k6.c d10 = k6.c.e(d0.a(cls, cls2)).b(q.j(d0.a(cls, cls3))).e(a.f7394a).d();
        l.e(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<j6.c> cls4 = j6.c.class;
        k6.c d11 = k6.c.e(d0.a(cls4, cls2)).b(q.j(d0.a(cls4, cls3))).e(b.f7395a).d();
        l.e(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<j6.b> cls5 = j6.b.class;
        k6.c d12 = k6.c.e(d0.a(cls5, cls2)).b(q.j(d0.a(cls5, cls3))).e(c.f7396a).d();
        l.e(d12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<j6.d> cls6 = j6.d.class;
        k6.c d13 = k6.c.e(d0.a(cls6, cls2)).b(q.j(d0.a(cls6, cls3))).e(d.f7397a).d();
        l.e(d13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return q.l(d10, d11, d12, d13);
    }
}
