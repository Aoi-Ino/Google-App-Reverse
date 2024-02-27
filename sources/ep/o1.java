package ep;

import java.lang.annotation.Annotation;

class o1 implements t {

    /* renamed from: a  reason: collision with root package name */
    private Annotation f23349a;

    /* renamed from: b  reason: collision with root package name */
    private s1 f23350b;

    /* renamed from: c  reason: collision with root package name */
    private s1 f23351c;

    /* renamed from: d  reason: collision with root package name */
    private Class[] f23352d;

    /* renamed from: e  reason: collision with root package name */
    private Class f23353e;

    /* renamed from: f  reason: collision with root package name */
    private Class f23354f;

    /* renamed from: g  reason: collision with root package name */
    private Class f23355g;

    /* renamed from: h  reason: collision with root package name */
    private String f23356h;

    public o1(s1 s1Var) {
        this(s1Var, (s1) null);
    }

    public Annotation a() {
        return this.f23349a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = r2.f23350b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.annotation.Annotation b(java.lang.Class r3) {
        /*
            r2 = this;
            ep.s1 r0 = r2.f23351c
            java.lang.annotation.Annotation r0 = r0.b(r3)
            java.lang.annotation.Annotation r1 = r2.f23349a
            java.lang.Class r1 = r1.annotationType()
            if (r3 != r1) goto L_0x0011
            java.lang.annotation.Annotation r3 = r2.f23349a
            return r3
        L_0x0011:
            if (r0 != 0) goto L_0x001c
            ep.s1 r1 = r2.f23350b
            if (r1 == 0) goto L_0x001c
            java.lang.annotation.Annotation r3 = r1.b(r3)
            return r3
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.o1.b(java.lang.Class):java.lang.annotation.Annotation");
    }

    public Class c() {
        return this.f23353e;
    }

    public void d(Object obj, Object obj2) {
        Class<?> declaringClass = this.f23351c.f().getDeclaringClass();
        s1 s1Var = this.f23350b;
        if (s1Var != null) {
            s1Var.f().invoke(obj, new Object[]{obj2});
            return;
        }
        throw new q1("Property '%s' is read only in %s", this.f23356h, declaringClass);
    }

    public boolean e() {
        return this.f23350b == null;
    }

    public s1 f() {
        return this.f23351c;
    }

    public s1 g() {
        return this.f23350b;
    }

    public Object get(Object obj) {
        return this.f23351c.f().invoke(obj, new Object[0]);
    }

    public String getName() {
        return this.f23356h;
    }

    public Class getType() {
        return this.f23355g;
    }

    public String toString() {
        return String.format("method '%s'", new Object[]{this.f23356h});
    }

    public o1(s1 s1Var, s1 s1Var2) {
        this.f23353e = s1Var.c();
        this.f23349a = s1Var.a();
        this.f23352d = s1Var.d();
        this.f23354f = s1Var.i();
        this.f23355g = s1Var.getType();
        this.f23356h = s1Var.getName();
        this.f23350b = s1Var2;
        this.f23351c = s1Var;
    }
}
