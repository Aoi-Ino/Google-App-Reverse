package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Collections;
import java.util.List;

abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final e0 f7068a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final e0 f7069b = new c();

    private static final class b extends e0 {

        /* renamed from: c  reason: collision with root package name */
        private static final Class f7070c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) n1.A(obj, j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.crypto.tink.shaded.protobuf.c0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.crypto.tink.shaded.protobuf.c0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.crypto.tink.shaded.protobuf.c0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.List g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.d0
                if (r1 == 0) goto L_0x0014
                com.google.crypto.tink.shaded.protobuf.c0 r0 = new com.google.crypto.tink.shaded.protobuf.c0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.x0
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.z.d
                if (r1 == 0) goto L_0x0024
                com.google.crypto.tink.shaded.protobuf.z$d r0 = (com.google.crypto.tink.shaded.protobuf.z.d) r0
                com.google.crypto.tink.shaded.protobuf.z$d r6 = r0.z(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.crypto.tink.shaded.protobuf.n1.O(r3, r4, r0)
                goto L_0x007a
            L_0x002d:
                java.lang.Class r1 = f7070c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
            L_0x0046:
                com.google.crypto.tink.shaded.protobuf.n1.O(r3, r4, r1)
                r0 = r1
                goto L_0x007a
            L_0x004b:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.m1
                if (r1 == 0) goto L_0x005f
                com.google.crypto.tink.shaded.protobuf.c0 r1 = new com.google.crypto.tink.shaded.protobuf.c0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.crypto.tink.shaded.protobuf.m1 r0 = (com.google.crypto.tink.shaded.protobuf.m1) r0
                r1.addAll(r0)
                goto L_0x0046
            L_0x005f:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.x0
                if (r1 == 0) goto L_0x007a
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.z.d
                if (r1 == 0) goto L_0x007a
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.z$d r1 = (com.google.crypto.tink.shaded.protobuf.z.d) r1
                boolean r2 = r1.c0()
                if (r2 != 0) goto L_0x007a
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.crypto.tink.shaded.protobuf.z$d r0 = r1.z(r0)
                goto L_0x0029
            L_0x007a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.e0.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) n1.A(obj, j10);
            if (list instanceof d0) {
                obj2 = ((d0) list).N();
            } else if (!f7070c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof x0) || !(list instanceof z.d)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    z.d dVar = (z.d) list;
                    if (dVar.c0()) {
                        dVar.u();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            n1.O(obj, j10, obj2);
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            n1.O(obj, j10, f10);
        }

        /* access modifiers changed from: package-private */
        public List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends e0 {
        private c() {
            super();
        }

        static z.d f(Object obj, long j10) {
            return (z.d) n1.A(obj, j10);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            f(obj, j10).u();
        }

        /* access modifiers changed from: package-private */
        public void d(Object obj, Object obj2, long j10) {
            z.d f10 = f(obj, j10);
            z.d f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                if (!f10.c0()) {
                    f10 = f10.z(size2 + size);
                }
                f10.addAll(f11);
            }
            if (size > 0) {
                f11 = f10;
            }
            n1.O(obj, j10, f11);
        }

        /* access modifiers changed from: package-private */
        public List e(Object obj, long j10) {
            z.d f10 = f(obj, j10);
            if (f10.c0()) {
                return f10;
            }
            int size = f10.size();
            z.d z10 = f10.z(size == 0 ? 10 : size * 2);
            n1.O(obj, j10, z10);
            return z10;
        }
    }

    private e0() {
    }

    static e0 a() {
        return f7068a;
    }

    static e0 b() {
        return f7069b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract void d(Object obj, Object obj2, long j10);

    /* access modifiers changed from: package-private */
    public abstract List e(Object obj, long j10);
}
