package y5;

import f6.c0;
import f6.i0;
import f6.z;
import g6.o;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentMap f18516a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private b f18517b;

    /* renamed from: c  reason: collision with root package name */
    private final Class f18518c;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Object f18519a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f18520b;

        /* renamed from: c  reason: collision with root package name */
        private final z f18521c;

        /* renamed from: d  reason: collision with root package name */
        private final i0 f18522d;

        /* renamed from: e  reason: collision with root package name */
        private final int f18523e;

        b(Object obj, byte[] bArr, z zVar, i0 i0Var, int i10) {
            this.f18519a = obj;
            this.f18520b = Arrays.copyOf(bArr, bArr.length);
            this.f18521c = zVar;
            this.f18522d = i0Var;
            this.f18523e = i10;
        }

        public final byte[] a() {
            byte[] bArr = this.f18520b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public i0 b() {
            return this.f18522d;
        }

        public Object c() {
            return this.f18519a;
        }

        public z d() {
            return this.f18521c;
        }
    }

    private static class c implements Comparable {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f18524e;

        private c(byte[] bArr) {
            this.f18524e = Arrays.copyOf(bArr, bArr.length);
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            byte[] bArr = this.f18524e;
            int length = bArr.length;
            byte[] bArr2 = cVar.f18524e;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i10 = 0;
            while (true) {
                byte[] bArr3 = this.f18524e;
                if (i10 >= bArr3.length) {
                    return 0;
                }
                byte b10 = bArr3[i10];
                byte b11 = cVar.f18524e[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
                i10++;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return Arrays.equals(this.f18524e, ((c) obj).f18524e);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f18524e);
        }

        public String toString() {
            return o.b(this.f18524e);
        }
    }

    private p(Class cls) {
        this.f18518c = cls;
    }

    public static p f(Class cls) {
        return new p(cls);
    }

    public b a(Object obj, c0.c cVar) {
        if (cVar.T() == z.ENABLED) {
            b bVar = new b(obj, c.a(cVar), cVar.T(), cVar.S(), cVar.R());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            c cVar2 = new c(bVar.a());
            List list = (List) this.f18516a.put(cVar2, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(bVar);
                this.f18516a.put(cVar2, Collections.unmodifiableList(arrayList2));
            }
            return bVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public b b() {
        return this.f18517b;
    }

    public List c(byte[] bArr) {
        List list = (List) this.f18516a.get(new c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class d() {
        return this.f18518c;
    }

    public List e() {
        return c(c.f18495a);
    }

    public void g(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (bVar.d() != z.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!c(bVar.a()).isEmpty()) {
            this.f18517b = bVar;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
