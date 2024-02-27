package cm;

import bm.c;
import bm.d;
import bm.f;
import bm.g;
import bm.h;
import bm.i;
import bm.j;
import bm.k;
import bm.l;
import bm.m;
import bm.n;
import bm.o;
import bm.p;
import bm.q;
import bm.r;
import bm.s;
import bm.t;
import bm.u;
import bm.v;
import bm.w;
import im.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public final class e implements b, d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f20218b = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map f20219c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap f20220d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap f20221e;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap f20222f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Map f20223g;

    /* renamed from: a  reason: collision with root package name */
    private final Class f20224a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003d, code lost:
            if (r2 == null) goto L_0x0042;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(java.lang.Class r8) {
            /*
                r7 = this;
                java.lang.String r0 = "jClass"
                cm.l.f(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b1
            L_0x000e:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L_0x0068
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L_0x0042
                cm.l.e(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = km.q.u0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x0040
                goto L_0x0042
            L_0x0040:
                r1 = r2
                goto L_0x00b1
            L_0x0042:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                cm.l.e(r0, r5)
                if (r8 == 0) goto L_0x0063
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = km.q.u0(r0, r8, r1, r3, r1)
                goto L_0x00b1
            L_0x0063:
                java.lang.String r1 = km.q.t0(r0, r4, r1, r3, r1)
                goto L_0x00b1
            L_0x0068:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto L_0x009c
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x0099
                java.util.Map r0 = cm.e.f20223g
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x0099
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L_0x0099:
                if (r1 != 0) goto L_0x00b1
                goto L_0x0040
            L_0x009c:
                java.util.Map r0 = cm.e.f20223g
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b1
                java.lang.String r1 = r8.getSimpleName()
            L_0x00b1:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: cm.e.a.a(java.lang.Class):java.lang.String");
        }
    }

    static {
        int i10 = 0;
        Iterable l10 = q.l(bm.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, bm.b.class, c.class, d.class, bm.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(r.s(l10, 10));
        for (Object next : l10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.r();
            }
            arrayList.add(pl.t.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f20219c = i0.n(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f20220d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f20221e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            l.e(str, "kotlinName");
            sb2.append(q.w0(str, '.', (String) null, 2, (Object) null));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            pl.o a10 = pl.t.a(sb3, str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry entry : f20219c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f20222f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h0.d(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), q.w0((String) entry2.getValue(), '.', (String) null, 2, (Object) null));
        }
        f20223g = linkedHashMap;
    }

    public e(Class cls) {
        l.f(cls, "jClass");
        this.f20224a = cls;
    }

    public String a() {
        return f20218b.a(b());
    }

    public Class b() {
        return this.f20224a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(am.a.b(this), am.a.b((b) obj));
    }

    public int hashCode() {
        return am.a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
