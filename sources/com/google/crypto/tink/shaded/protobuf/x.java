package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class x extends a {
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected k1 unknownFields = k1.e();

    public static abstract class a extends a.C0105a {

        /* renamed from: e  reason: collision with root package name */
        private final x f7277e;

        /* renamed from: f  reason: collision with root package name */
        protected x f7278f;

        /* renamed from: g  reason: collision with root package name */
        protected boolean f7279g = false;

        protected a(x xVar) {
            this.f7277e = xVar;
            this.f7278f = (x) xVar.q(d.NEW_MUTABLE_INSTANCE);
        }

        private void w(x xVar, x xVar2) {
            z0.a().d(xVar).a(xVar, xVar2);
        }

        public final x k() {
            x m10 = H();
            if (m10.x()) {
                return m10;
            }
            throw a.C0105a.j(m10);
        }

        /* renamed from: m */
        public x H() {
            if (this.f7279g) {
                return this.f7278f;
            }
            this.f7278f.z();
            this.f7279g = true;
            return this.f7278f;
        }

        /* renamed from: p */
        public a clone() {
            a B = b().f();
            B.v(H());
            return B;
        }

        /* access modifiers changed from: protected */
        public final void q() {
            if (this.f7279g) {
                r();
                this.f7279g = false;
            }
        }

        /* access modifiers changed from: protected */
        public void r() {
            x xVar = (x) this.f7278f.q(d.NEW_MUTABLE_INSTANCE);
            w(xVar, this.f7278f);
            this.f7278f = xVar;
        }

        /* renamed from: t */
        public x b() {
            return this.f7277e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public a h(x xVar) {
            return v(xVar);
        }

        public a v(x xVar) {
            q();
            w(this.f7278f, xVar);
            return this;
        }
    }

    protected static class b extends b {

        /* renamed from: b  reason: collision with root package name */
        private final x f7280b;

        public b(x xVar) {
            this.f7280b = xVar;
        }
    }

    public static class c extends n {
    }

    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static z.d A(z.d dVar) {
        int size = dVar.size();
        return dVar.z(size == 0 ? 10 : size * 2);
    }

    protected static Object C(o0 o0Var, String str, Object[] objArr) {
        return new b1(o0Var, str, objArr);
    }

    protected static x D(x xVar, h hVar, p pVar) {
        return o(F(xVar, hVar, pVar));
    }

    protected static x E(x xVar, byte[] bArr, p pVar) {
        return o(I(xVar, bArr, 0, bArr.length, pVar));
    }

    private static x F(x xVar, h hVar, p pVar) {
        i Y = hVar.Y();
        x G = G(xVar, Y, pVar);
        try {
            Y.a(0);
            return G;
        } catch (a0 e10) {
            throw e10.i(G);
        }
    }

    static x G(x xVar, i iVar, p pVar) {
        x xVar2 = (x) xVar.q(d.NEW_MUTABLE_INSTANCE);
        try {
            d1 d10 = z0.a().d(xVar2);
            d10.d(xVar2, j.N(iVar), pVar);
            d10.e(xVar2);
            return xVar2;
        } catch (IOException e10) {
            if (e10.getCause() instanceof a0) {
                throw ((a0) e10.getCause());
            }
            throw new a0(e10.getMessage()).i(xVar2);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof a0) {
                throw ((a0) e11.getCause());
            }
            throw e11;
        }
    }

    static x I(x xVar, byte[] bArr, int i10, int i11, p pVar) {
        x xVar2 = (x) xVar.q(d.NEW_MUTABLE_INSTANCE);
        try {
            d1 d10 = z0.a().d(xVar2);
            d10.b(xVar2, bArr, i10, i10 + i11, new e.a(pVar));
            d10.e(xVar2);
            if (xVar2.memoizedHashCode == 0) {
                return xVar2;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof a0) {
                throw ((a0) e10.getCause());
            }
            throw new a0(e10.getMessage()).i(xVar2);
        } catch (IndexOutOfBoundsException unused) {
            throw a0.j().i(xVar2);
        }
    }

    protected static void J(Class cls, x xVar) {
        defaultInstanceMap.put(cls, xVar);
    }

    private static x o(x xVar) {
        if (xVar == null || xVar.x()) {
            return xVar;
        }
        throw xVar.k().a().i(xVar);
    }

    protected static z.d t() {
        return a1.o();
    }

    static x u(Class cls) {
        x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (xVar == null) {
            xVar = ((x) n1.i(cls)).b();
            if (xVar != null) {
                defaultInstanceMap.put(cls, xVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return xVar;
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static final boolean y(x xVar, boolean z10) {
        byte byteValue = ((Byte) xVar.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f10 = z0.a().d(xVar).f(xVar);
        if (z10) {
            xVar.r(d.SET_MEMOIZED_IS_INITIALIZED, f10 ? xVar : null);
        }
        return f10;
    }

    /* renamed from: B */
    public final a f() {
        return (a) q(d.NEW_BUILDER);
    }

    /* renamed from: K */
    public final a c() {
        a aVar = (a) q(d.NEW_BUILDER);
        aVar.v(this);
        return aVar;
    }

    public int a() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = z0.a().d(this).h(this);
        }
        return this.memoizedSerializedSize;
    }

    public void e(k kVar) {
        z0.a().d(this).c(this, l.P(kVar));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b().getClass().isInstance(obj)) {
            return false;
        }
        return z0.a().d(this).g(this, (x) obj);
    }

    /* access modifiers changed from: package-private */
    public int h() {
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int j10 = z0.a().d(this).j(this);
        this.memoizedHashCode = j10;
        return j10;
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* access modifiers changed from: package-private */
    public Object m() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: protected */
    public final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object q(d dVar) {
        return s(dVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object r(d dVar, Object obj) {
        return s(dVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return q0.e(this, super.toString());
    }

    /* renamed from: v */
    public final x b() {
        return (x) q(d.GET_DEFAULT_INSTANCE);
    }

    public final boolean x() {
        return y(this, true);
    }

    /* access modifiers changed from: protected */
    public void z() {
        z0.a().d(this).e(this);
    }
}
