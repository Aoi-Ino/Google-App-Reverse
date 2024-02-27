package ep;

import dp.b;
import dp.c;
import dp.k;
import dp.l;
import dp.m;
import dp.n;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

class f0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private List f23184a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private List f23185b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private l f23186c;

    /* renamed from: d  reason: collision with root package name */
    private k f23187d;

    /* renamed from: e  reason: collision with root package name */
    private Annotation[] f23188e;

    /* renamed from: f  reason: collision with root package name */
    private c f23189f;

    /* renamed from: g  reason: collision with root package name */
    private c f23190g;

    /* renamed from: h  reason: collision with root package name */
    private m f23191h;

    /* renamed from: i  reason: collision with root package name */
    private n f23192i;

    /* renamed from: j  reason: collision with root package name */
    private Class f23193j;

    /* renamed from: k  reason: collision with root package name */
    private String f23194k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f23195l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f23196m;

    public f0(Class cls, c cVar) {
        this.f23188e = cls.getDeclaredAnnotations();
        this.f23189f = cVar;
        this.f23196m = true;
        this.f23193j = cls;
        u(cls);
    }

    private void b(Annotation annotation) {
        if (annotation != null) {
            b bVar = (b) annotation;
            this.f23195l = bVar.required();
            this.f23190g = bVar.value();
        }
    }

    private void d(Class cls) {
        for (Annotation annotation : this.f23188e) {
            if (annotation instanceof k) {
                r(annotation);
            }
            if (annotation instanceof l) {
                v(annotation);
            }
            if (annotation instanceof n) {
                t(annotation);
            }
            if (annotation instanceof m) {
                s(annotation);
            }
            if (annotation instanceof b) {
                b(annotation);
            }
        }
    }

    private void o(Class cls) {
        for (Field a1Var : cls.getDeclaredFields()) {
            this.f23185b.add(new a1(a1Var));
        }
    }

    private boolean p(String str) {
        return str.length() == 0;
    }

    private void q(Class cls) {
        for (Method p1Var : cls.getDeclaredMethods()) {
            this.f23184a.add(new p1(p1Var));
        }
    }

    private void r(Annotation annotation) {
        if (annotation != null) {
            this.f23187d = (k) annotation;
        }
    }

    private void s(Annotation annotation) {
        if (annotation != null) {
            this.f23191h = (m) annotation;
        }
    }

    private void t(Annotation annotation) {
        if (annotation != null) {
            n nVar = (n) annotation;
            String simpleName = this.f23193j.getSimpleName();
            String name = nVar.name();
            if (p(name)) {
                name = t2.g(simpleName);
            }
            this.f23196m = nVar.strict();
            this.f23192i = nVar;
            this.f23194k = name;
        }
    }

    private void u(Class cls) {
        q(cls);
        o(cls);
        d(cls);
    }

    private void v(Annotation annotation) {
        if (annotation != null) {
            this.f23186c = (l) annotation;
        }
    }

    public boolean a() {
        return this.f23196m;
    }

    public boolean c() {
        return this.f23193j.isPrimitive();
    }

    public boolean e() {
        return this.f23195l;
    }

    public c f() {
        return this.f23189f;
    }

    public List g() {
        return this.f23185b;
    }

    public String getName() {
        return this.f23194k;
    }

    public k getNamespace() {
        return this.f23187d;
    }

    public m getOrder() {
        return this.f23191h;
    }

    public Class getType() {
        return this.f23193j;
    }

    public Constructor[] h() {
        return this.f23193j.getDeclaredConstructors();
    }

    public c i() {
        c cVar = this.f23189f;
        return cVar != null ? cVar : this.f23190g;
    }

    public Class j() {
        Class<Object> superclass = this.f23193j.getSuperclass();
        if (superclass == Object.class) {
            return null;
        }
        return superclass;
    }

    public n k() {
        return this.f23192i;
    }

    public boolean l() {
        if (Modifier.isStatic(this.f23193j.getModifiers())) {
            return true;
        }
        return !this.f23193j.isMemberClass();
    }

    public List m() {
        return this.f23184a;
    }

    public l n() {
        return this.f23186c;
    }

    public String toString() {
        return this.f23193j.toString();
    }
}
