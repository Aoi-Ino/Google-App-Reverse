package y5;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.o0;
import f6.y;
import java.security.GeneralSecurityException;
import y5.h;

public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final h f18497a;

    /* renamed from: b  reason: collision with root package name */
    private final Class f18498b;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final h.a f18499a;

        a(h.a aVar) {
            this.f18499a = aVar;
        }

        private o0 b(o0 o0Var) {
            this.f18499a.d(o0Var);
            return (o0) this.f18499a.a(o0Var);
        }

        /* access modifiers changed from: package-private */
        public o0 a(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return b(this.f18499a.c(hVar));
        }
    }

    public f(h hVar, Class cls) {
        if (hVar.h().contains(cls) || Void.class.equals(cls)) {
            this.f18497a = hVar;
            this.f18498b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{hVar.toString(), cls.getName()}));
    }

    private a f() {
        return new a(this.f18497a.e());
    }

    private Object g(o0 o0Var) {
        if (!Void.class.equals(this.f18498b)) {
            this.f18497a.i(o0Var);
            return this.f18497a.d(o0Var, this.f18498b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final boolean a(String str) {
        return str.equals(e());
    }

    public final Object b(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return g(this.f18497a.g(hVar));
        } catch (a0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f18497a.b().getName(), e10);
        }
    }

    public final o0 c(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return f().a(hVar);
        } catch (a0 e10) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f18497a.e().b().getName(), e10);
        }
    }

    public final y d(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return (y) y.T().z(e()).A(f().a(hVar).g()).x(this.f18497a.f()).k();
        } catch (a0 e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public final String e() {
        return this.f18497a.c();
    }
}
