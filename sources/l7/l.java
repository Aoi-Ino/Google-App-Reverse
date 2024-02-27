package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.r;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import l7.j;
import p7.a;
import p7.c;

final class l extends r {

    /* renamed from: a  reason: collision with root package name */
    private final d f13369a;

    /* renamed from: b  reason: collision with root package name */
    private final r f13370b;

    /* renamed from: c  reason: collision with root package name */
    private final Type f13371c;

    l(d dVar, r rVar, Type type) {
        this.f13369a = dVar;
        this.f13370b = rVar;
        this.f13371c = type;
    }

    private static Type e(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean f(r rVar) {
        r e10;
        while ((rVar instanceof k) && (e10 = ((k) rVar).e()) != rVar) {
            rVar = e10;
        }
        return rVar instanceof j.b;
    }

    public Object b(a aVar) {
        return this.f13370b.b(aVar);
    }

    public void d(c cVar, Object obj) {
        r rVar = this.f13370b;
        Type e10 = e(this.f13371c, obj);
        if (e10 != this.f13371c) {
            rVar = this.f13369a.m(TypeToken.get(e10));
            if ((rVar instanceof j.b) && !f(this.f13370b)) {
                rVar = this.f13370b;
            }
        }
        rVar.d(cVar, obj);
    }
}
