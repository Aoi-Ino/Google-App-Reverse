package y5;

import com.google.crypto.tink.shaded.protobuf.o0;
import f6.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private final Class f18508a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f18509b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f18510c;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final Class f18511a;

        public a(Class cls) {
            this.f18511a = cls;
        }

        public abstract Object a(o0 o0Var);

        public final Class b() {
            return this.f18511a;
        }

        public abstract o0 c(com.google.crypto.tink.shaded.protobuf.h hVar);

        public abstract void d(o0 o0Var);
    }

    protected static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        private final Class f18512a;

        public b(Class cls) {
            this.f18512a = cls;
        }

        public abstract Object a(Object obj);

        /* access modifiers changed from: package-private */
        public final Class b() {
            return this.f18512a;
        }
    }

    protected h(Class cls, b... bVarArr) {
        this.f18508a = cls;
        HashMap hashMap = new HashMap();
        int length = bVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            b bVar = bVarArr[i10];
            if (!hashMap.containsKey(bVar.b())) {
                hashMap.put(bVar.b(), bVar);
                i10++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + bVar.b().getCanonicalName());
            }
        }
        this.f18510c = bVarArr.length > 0 ? bVarArr[0].b() : Void.class;
        this.f18509b = Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: package-private */
    public final Class a() {
        return this.f18510c;
    }

    public final Class b() {
        return this.f18508a;
    }

    public abstract String c();

    public final Object d(o0 o0Var, Class cls) {
        b bVar = (b) this.f18509b.get(cls);
        if (bVar != null) {
            return bVar.a(o0Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a e();

    public abstract y.c f();

    public abstract o0 g(com.google.crypto.tink.shaded.protobuf.h hVar);

    public final Set h() {
        return this.f18509b.keySet();
    }

    public abstract void i(o0 o0Var);
}
