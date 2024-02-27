package jm;

import cm.l;
import java.util.Iterator;

abstract class m extends l {

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Iterator f24651a;

        public a(Iterator it) {
            this.f24651a = it;
        }

        public Iterator iterator() {
            return this.f24651a;
        }
    }

    static final class b extends cm.m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f24652e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(0);
            this.f24652e = obj;
        }

        public final Object a() {
            return this.f24652e;
        }
    }

    public static g b(Iterator it) {
        l.f(it, "<this>");
        return c(new a(it));
    }

    public static final g c(g gVar) {
        l.f(gVar, "<this>");
        return gVar instanceof a ? gVar : new a(gVar);
    }

    public static g d(Object obj, bm.l lVar) {
        l.f(lVar, "nextFunction");
        return obj == null ? d.f24634a : new f(new b(obj), lVar);
    }
}
