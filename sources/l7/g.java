package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.l;
import i7.m;
import i7.r;
import i7.s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import k7.c;
import k7.f;
import k7.i;
import p7.b;

public final class g implements s {

    /* renamed from: e  reason: collision with root package name */
    private final c f13329e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f13330f;

    private final class a extends r {

        /* renamed from: a  reason: collision with root package name */
        private final r f13331a;

        /* renamed from: b  reason: collision with root package name */
        private final r f13332b;

        /* renamed from: c  reason: collision with root package name */
        private final i f13333c;

        public a(d dVar, Type type, r rVar, Type type2, r rVar2, i iVar) {
            this.f13331a = new l(dVar, rVar, type);
            this.f13332b = new l(dVar, rVar2, type2);
            this.f13333c = iVar;
        }

        private String e(i7.g gVar) {
            if (gVar.y()) {
                l o10 = gVar.o();
                if (o10.Y()) {
                    return String.valueOf(o10.E());
                }
                if (o10.H()) {
                    return Boolean.toString(o10.B());
                }
                if (o10.e0()) {
                    return o10.F();
                }
                throw new AssertionError();
            } else if (gVar.s()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: f */
        public Map b(p7.a aVar) {
            b D0 = aVar.D0();
            if (D0 == b.NULL) {
                aVar.s0();
                return null;
            }
            Map map = (Map) this.f13333c.a();
            if (D0 == b.BEGIN_ARRAY) {
                aVar.c();
                while (aVar.B()) {
                    aVar.c();
                    Object b10 = this.f13331a.b(aVar);
                    if (map.put(b10, this.f13332b.b(aVar)) == null) {
                        aVar.l();
                    } else {
                        throw new m("duplicate key: " + b10);
                    }
                }
                aVar.l();
            } else {
                aVar.e();
                while (aVar.B()) {
                    f.f13055a.a(aVar);
                    Object b11 = this.f13331a.b(aVar);
                    if (map.put(b11, this.f13332b.b(aVar)) != null) {
                        throw new m("duplicate key: " + b11);
                    }
                }
                aVar.n();
            }
            return map;
        }

        /* renamed from: g */
        public void d(p7.c cVar, Map map) {
            if (map == null) {
                cVar.R();
            } else if (!g.this.f13330f) {
                cVar.g();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.E(String.valueOf(entry.getKey()));
                    this.f13332b.d(cVar, entry.getValue());
                }
                cVar.n();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    i7.g c10 = this.f13331a.c(entry2.getKey());
                    arrayList.add(c10);
                    arrayList2.add(entry2.getValue());
                    z10 |= c10.r() || c10.v();
                }
                if (z10) {
                    cVar.f();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.f();
                        k7.m.a((i7.g) arrayList.get(i10), cVar);
                        this.f13332b.d(cVar, arrayList2.get(i10));
                        cVar.l();
                        i10++;
                    }
                    cVar.l();
                    return;
                }
                cVar.g();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.E(e((i7.g) arrayList.get(i10)));
                    this.f13332b.d(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.n();
            }
        }
    }

    public g(c cVar, boolean z10) {
        this.f13329e = cVar;
        this.f13330f = z10;
    }

    private r b(d dVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? m.f13377f : dVar.m(TypeToken.get(type));
    }

    public r a(d dVar, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j10 = k7.b.j(type, rawType);
        return new a(dVar, j10[0], b(dVar, j10[0]), j10[1], dVar.m(TypeToken.get(j10[1])), this.f13329e.b(typeToken));
    }
}
