package k7;

import android.support.v4.media.session.b;
import com.google.gson.reflect.TypeToken;
import i7.r;
import i7.s;
import j7.e;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p7.c;

public final class d implements s, Cloneable {

    /* renamed from: k  reason: collision with root package name */
    public static final d f13041k = new d();

    /* renamed from: e  reason: collision with root package name */
    private double f13042e = -1.0d;

    /* renamed from: f  reason: collision with root package name */
    private int f13043f = 136;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13044g = true;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13045h;

    /* renamed from: i  reason: collision with root package name */
    private List f13046i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    private List f13047j = Collections.emptyList();

    class a extends r {

        /* renamed from: a  reason: collision with root package name */
        private r f13048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f13050c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i7.d f13051d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TypeToken f13052e;

        a(boolean z10, boolean z11, i7.d dVar, TypeToken typeToken) {
            this.f13049b = z10;
            this.f13050c = z11;
            this.f13051d = dVar;
            this.f13052e = typeToken;
        }

        private r e() {
            r rVar = this.f13048a;
            if (rVar != null) {
                return rVar;
            }
            r o10 = this.f13051d.o(d.this, this.f13052e);
            this.f13048a = o10;
            return o10;
        }

        public Object b(p7.a aVar) {
            if (!this.f13049b) {
                return e().b(aVar);
            }
            aVar.N0();
            return null;
        }

        public void d(c cVar, Object obj) {
            if (this.f13050c) {
                cVar.R();
            } else {
                e().d(cVar, obj);
            }
        }
    }

    private boolean d(Class cls) {
        if (this.f13042e == -1.0d || m((j7.d) cls.getAnnotation(j7.d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f13044g && h(cls)) || g(cls);
        }
        return true;
    }

    private boolean e(Class cls, boolean z10) {
        Iterator it = (z10 ? this.f13046i : this.f13047j).iterator();
        if (!it.hasNext()) {
            return false;
        }
        b.a(it.next());
        throw null;
    }

    private boolean g(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && !i(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean h(Class cls) {
        return cls.isMemberClass() && !i(cls);
    }

    private boolean i(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean j(j7.d dVar) {
        if (dVar == null) {
            return true;
        }
        return this.f13042e >= dVar.value();
    }

    private boolean k(e eVar) {
        if (eVar == null) {
            return true;
        }
        return this.f13042e < eVar.value();
    }

    private boolean m(j7.d dVar, e eVar) {
        return j(dVar) && k(eVar);
    }

    public r a(i7.d dVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        boolean d10 = d(rawType);
        boolean z10 = d10 || e(rawType, true);
        boolean z11 = d10 || e(rawType, false);
        if (z10 || z11) {
            return new a(z11, z10, dVar, typeToken);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean c(Class cls, boolean z10) {
        return d(cls) || e(cls, z10);
    }

    public boolean f(Field field, boolean z10) {
        j7.a aVar;
        if ((this.f13043f & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f13042e != -1.0d && !m((j7.d) field.getAnnotation(j7.d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f13045h && ((aVar = (j7.a) field.getAnnotation(j7.a.class)) == null || (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f13044g && h(field.getType())) || g(field.getType())) {
            return true;
        }
        List list = z10 ? this.f13046i : this.f13047j;
        if (list.isEmpty()) {
            return false;
        }
        new i7.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        b.a(it.next());
        throw null;
    }
}
