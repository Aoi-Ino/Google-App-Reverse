package ep;

import gp.f;
import gp.g;
import hp.g0;
import hp.j0;
import hp.o;
import java.lang.reflect.Modifier;

abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    protected w f23434a;

    /* renamed from: b  reason: collision with root package name */
    protected n3 f23435b;

    /* renamed from: c  reason: collision with root package name */
    protected Class f23436c;

    /* renamed from: d  reason: collision with root package name */
    protected f f23437d;

    protected y0(w wVar, f fVar) {
        this(wVar, fVar, (Class) null);
    }

    private f c(f fVar, Class cls) {
        Class l10 = n3.l(cls);
        return l10 != cls ? new f2(fVar, l10) : fVar;
    }

    public static boolean e(Class<?> cls, Class cls2) {
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls.isAssignableFrom(cls2);
    }

    public static boolean f(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isAbstract(modifiers)) {
            return false;
        }
        return !Modifier.isInterface(modifiers);
    }

    public g a(o oVar) {
        g b10 = this.f23434a.b(this.f23437d, oVar);
        if (!(b10 == null || this.f23436c == null)) {
            if (!e(this.f23436c, b10.getType())) {
                return new g2(b10, this.f23436c);
            }
        }
        return b10;
    }

    /* access modifiers changed from: protected */
    public g b(o oVar) {
        g a10 = a(oVar);
        if (a10 != null) {
            j0 position = oVar.getPosition();
            Class type = a10.getType();
            if (!e(d(), type)) {
                throw new g1("Incompatible %s for %s at %s", type, this.f23437d, position);
            }
        }
        return a10;
    }

    public Class d() {
        Class cls = this.f23436c;
        return cls != null ? cls : this.f23437d.getType();
    }

    public boolean g(f fVar, Object obj, g0 g0Var) {
        Class type = fVar.getType();
        if (type.isPrimitive()) {
            fVar = c(fVar, type);
        }
        return this.f23434a.m(fVar, obj, g0Var);
    }

    protected y0(w wVar, f fVar, Class cls) {
        this.f23435b = wVar.f();
        this.f23436c = cls;
        this.f23434a = wVar;
        this.f23437d = fVar;
    }
}
