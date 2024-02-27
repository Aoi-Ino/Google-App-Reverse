package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.r;
import i7.s;
import java.lang.reflect.Type;
import java.util.Collection;
import k7.c;
import k7.i;

public final class b implements s {

    /* renamed from: e  reason: collision with root package name */
    private final c f13314e;

    private static final class a extends r {

        /* renamed from: a  reason: collision with root package name */
        private final r f13315a;

        /* renamed from: b  reason: collision with root package name */
        private final i f13316b;

        public a(d dVar, Type type, r rVar, i iVar) {
            this.f13315a = new l(dVar, rVar, type);
            this.f13316b = iVar;
        }

        /* renamed from: e */
        public Collection b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            Collection collection = (Collection) this.f13316b.a();
            aVar.c();
            while (aVar.B()) {
                collection.add(this.f13315a.b(aVar));
            }
            aVar.l();
            return collection;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Collection collection) {
            if (collection == null) {
                cVar.R();
                return;
            }
            cVar.f();
            for (Object d10 : collection) {
                this.f13315a.d(cVar, d10);
            }
            cVar.l();
        }
    }

    public b(c cVar) {
        this.f13314e = cVar;
    }

    public r a(d dVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h10 = k7.b.h(type, rawType);
        return new a(dVar, h10, dVar.m(TypeToken.get(h10)), this.f13314e.b(typeToken));
    }
}
