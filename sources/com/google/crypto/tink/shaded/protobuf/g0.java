package com.google.crypto.tink.shaded.protobuf;

final class g0 implements e1 {

    /* renamed from: b  reason: collision with root package name */
    private static final n0 f7075b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final n0 f7076a;

    class a implements n0 {
        a() {
        }

        public m0 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements n0 {

        /* renamed from: a  reason: collision with root package name */
        private n0[] f7077a;

        b(n0... n0VarArr) {
            this.f7077a = n0VarArr;
        }

        public m0 a(Class cls) {
            for (n0 n0Var : this.f7077a) {
                if (n0Var.b(cls)) {
                    return n0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (n0 b10 : this.f7077a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public g0() {
        this(b());
    }

    private static n0 b() {
        return new b(w.c(), c());
    }

    private static n0 c() {
        try {
            return (n0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f7075b;
        }
    }

    private static boolean d(m0 m0Var) {
        return m0Var.b() == y0.PROTO2;
    }

    private static d1 e(Class cls, m0 m0Var) {
        if (x.class.isAssignableFrom(cls)) {
            if (d(m0Var)) {
                return r0.P(cls, m0Var, v0.b(), e0.b(), f1.L(), s.b(), l0.b());
            }
            return r0.P(cls, m0Var, v0.b(), e0.b(), f1.L(), (q) null, l0.b());
        } else if (d(m0Var)) {
            return r0.P(cls, m0Var, v0.a(), e0.a(), f1.G(), s.a(), l0.a());
        } else {
            return r0.P(cls, m0Var, v0.a(), e0.a(), f1.H(), (q) null, l0.a());
        }
    }

    public d1 a(Class cls) {
        j1 G;
        q a10;
        f1.I(cls);
        m0 a11 = this.f7076a.a(cls);
        if (!a11.a()) {
            return e(cls, a11);
        }
        if (x.class.isAssignableFrom(cls)) {
            G = f1.L();
            a10 = s.b();
        } else {
            G = f1.G();
            a10 = s.a();
        }
        return s0.m(G, a10, a11.c());
    }

    private g0(n0 n0Var) {
        this.f7076a = (n0) z.b(n0Var, "messageInfoFactory");
    }
}
