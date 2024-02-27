package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.r;
import i7.s;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import k7.b;
import p7.c;

public final class a extends r {

    /* renamed from: c  reason: collision with root package name */
    public static final s f13311c = new C0178a();

    /* renamed from: a  reason: collision with root package name */
    private final Class f13312a;

    /* renamed from: b  reason: collision with root package name */
    private final r f13313b;

    /* renamed from: l7.a$a  reason: collision with other inner class name */
    class C0178a implements s {
        C0178a() {
        }

        public r a(d dVar, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g10 = b.g(type);
            return new a(dVar, dVar.m(TypeToken.get(g10)), b.k(g10));
        }
    }

    public a(d dVar, r rVar, Class cls) {
        this.f13313b = new l(dVar, rVar, cls);
        this.f13312a = cls;
    }

    public Object b(p7.a aVar) {
        if (aVar.D0() == p7.b.NULL) {
            aVar.s0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.c();
        while (aVar.B()) {
            arrayList.add(this.f13313b.b(aVar));
        }
        aVar.l();
        int size = arrayList.size();
        if (!this.f13312a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance(this.f13312a, size));
        }
        Object newInstance = Array.newInstance(this.f13312a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void d(c cVar, Object obj) {
        if (obj == null) {
            cVar.R();
            return;
        }
        cVar.f();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f13313b.d(cVar, Array.get(obj, i10));
        }
        cVar.l();
    }
}
