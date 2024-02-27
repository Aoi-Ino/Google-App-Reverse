package qm;

import bm.p;
import cm.l;
import cm.m;
import lm.e2;
import tl.g;

public abstract class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f30829a = new h0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p f30830b = a.f30833e;

    /* renamed from: c  reason: collision with root package name */
    private static final p f30831c = b.f30834e;

    /* renamed from: d  reason: collision with root package name */
    private static final p f30832d = c.f30835e;

    static final class a extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        public static final a f30833e = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final Object h(Object obj, g.b bVar) {
            if (!(bVar instanceof e2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        public static final b f30834e = new b();

        b() {
            super(2);
        }

        /* renamed from: b */
        public final e2 h(e2 e2Var, g.b bVar) {
            if (e2Var != null) {
                return e2Var;
            }
            if (bVar instanceof e2) {
                return (e2) bVar;
            }
            return null;
        }
    }

    static final class c extends m implements p {

        /* renamed from: e  reason: collision with root package name */
        public static final c f30835e = new c();

        c() {
            super(2);
        }

        /* renamed from: b */
        public final p0 h(p0 p0Var, g.b bVar) {
            if (bVar instanceof e2) {
                e2 e2Var = (e2) bVar;
                p0Var.a(e2Var, e2Var.n(p0Var.f30845a));
            }
            return p0Var;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != f30829a) {
            if (obj instanceof p0) {
                ((p0) obj).b(gVar);
                return;
            }
            Object X = gVar.X((Object) null, f30831c);
            l.d(X, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((e2) X).s(gVar, obj);
        }
    }

    public static final Object b(g gVar) {
        Object X = gVar.X(0, f30830b);
        l.c(X);
        return X;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f30829a;
        }
        if (obj instanceof Integer) {
            return gVar.X(new p0(gVar, ((Number) obj).intValue()), f30832d);
        }
        l.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((e2) obj).n(gVar);
    }
}
