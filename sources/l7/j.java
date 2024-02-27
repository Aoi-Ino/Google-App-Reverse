package l7;

import com.google.gson.reflect.TypeToken;
import i7.h;
import i7.k;
import i7.m;
import i7.o;
import i7.r;
import i7.s;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.i;
import k7.l;

public final class j implements s {

    /* renamed from: e  reason: collision with root package name */
    private final k7.c f13344e;

    /* renamed from: f  reason: collision with root package name */
    private final i7.c f13345f;

    /* renamed from: g  reason: collision with root package name */
    private final k7.d f13346g;

    /* renamed from: h  reason: collision with root package name */
    private final e f13347h;

    /* renamed from: i  reason: collision with root package name */
    private final List f13348i;

    class a extends c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f13349e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Method f13350f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Field f13351g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f13352h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ r f13353i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ i7.d f13354j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ TypeToken f13355k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ boolean f13356l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ boolean f13357m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, String str2, boolean z10, boolean z11, boolean z12, Method method, Field field, boolean z13, r rVar, i7.d dVar, TypeToken typeToken, boolean z14, boolean z15) {
            super(str, str2, z10, z11);
            this.f13349e = z12;
            this.f13350f = method;
            this.f13351g = field;
            this.f13352h = z13;
            this.f13353i = rVar;
            this.f13354j = dVar;
            this.f13355k = typeToken;
            this.f13356l = z14;
            this.f13357m = z15;
        }

        /* access modifiers changed from: package-private */
        public void a(p7.a aVar, int i10, Object[] objArr) {
            Object b10 = this.f13353i.b(aVar);
            if (b10 != null || !this.f13356l) {
                objArr[i10] = b10;
                return;
            }
            throw new k("null is not allowed as value for record component '" + this.f13361b + "' of primitive type; at path " + aVar.b());
        }

        /* access modifiers changed from: package-private */
        public void b(p7.a aVar, Object obj) {
            Object b10 = this.f13353i.b(aVar);
            if (b10 != null || !this.f13356l) {
                if (this.f13349e) {
                    j.c(obj, this.f13351g);
                } else if (this.f13357m) {
                    String f10 = n7.a.f(this.f13351g, false);
                    throw new h("Cannot set value of 'static final' " + f10);
                }
                this.f13351g.set(obj, b10);
            }
        }

        /* access modifiers changed from: package-private */
        public void c(p7.c cVar, Object obj) {
            Object obj2;
            if (this.f13362c) {
                if (this.f13349e) {
                    AccessibleObject accessibleObject = this.f13350f;
                    if (accessibleObject == null) {
                        accessibleObject = this.f13351g;
                    }
                    j.c(obj, accessibleObject);
                }
                Method method = this.f13350f;
                if (method != null) {
                    try {
                        obj2 = method.invoke(obj, new Object[0]);
                    } catch (InvocationTargetException e10) {
                        String f10 = n7.a.f(this.f13350f, false);
                        throw new h("Accessor " + f10 + " threw exception", e10.getCause());
                    }
                } else {
                    obj2 = this.f13351g.get(obj);
                }
                if (obj2 != obj) {
                    cVar.E(this.f13360a);
                    (this.f13352h ? this.f13353i : new l(this.f13354j, this.f13353i, this.f13355k.getType())).d(cVar, obj2);
                }
            }
        }
    }

    public static abstract class b extends r {

        /* renamed from: a  reason: collision with root package name */
        final Map f13359a;

        b(Map map) {
            this.f13359a = map;
        }

        public Object b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            Object e10 = e();
            try {
                aVar.e();
                while (aVar.B()) {
                    c cVar = (c) this.f13359a.get(aVar.i0());
                    if (cVar != null) {
                        if (cVar.f13363d) {
                            g(e10, aVar, cVar);
                        }
                    }
                    aVar.N0();
                }
                aVar.n();
                return f(e10);
            } catch (IllegalStateException e11) {
                throw new m((Throwable) e11);
            } catch (IllegalAccessException e12) {
                throw n7.a.e(e12);
            }
        }

        public void d(p7.c cVar, Object obj) {
            if (obj == null) {
                cVar.R();
                return;
            }
            cVar.g();
            try {
                for (c c10 : this.f13359a.values()) {
                    c10.c(cVar, obj);
                }
                cVar.n();
            } catch (IllegalAccessException e10) {
                throw n7.a.e(e10);
            }
        }

        /* access modifiers changed from: package-private */
        public abstract Object e();

        /* access modifiers changed from: package-private */
        public abstract Object f(Object obj);

        /* access modifiers changed from: package-private */
        public abstract void g(Object obj, p7.a aVar, c cVar);
    }

    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f13360a;

        /* renamed from: b  reason: collision with root package name */
        final String f13361b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f13362c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f13363d;

        protected c(String str, String str2, boolean z10, boolean z11) {
            this.f13360a = str;
            this.f13361b = str2;
            this.f13362c = z10;
            this.f13363d = z11;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(p7.a aVar, int i10, Object[] objArr);

        /* access modifiers changed from: package-private */
        public abstract void b(p7.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void c(p7.c cVar, Object obj);
    }

    private static final class d extends b {

        /* renamed from: b  reason: collision with root package name */
        private final i f13364b;

        d(i iVar, Map map) {
            super(map);
            this.f13364b = iVar;
        }

        /* access modifiers changed from: package-private */
        public Object e() {
            return this.f13364b.a();
        }

        /* access modifiers changed from: package-private */
        public Object f(Object obj) {
            return obj;
        }

        /* access modifiers changed from: package-private */
        public void g(Object obj, p7.a aVar, c cVar) {
            cVar.b(aVar, obj);
        }
    }

    private static final class e extends b {

        /* renamed from: e  reason: collision with root package name */
        static final Map f13365e = j();

        /* renamed from: b  reason: collision with root package name */
        private final Constructor f13366b;

        /* renamed from: c  reason: collision with root package name */
        private final Object[] f13367c;

        /* renamed from: d  reason: collision with root package name */
        private final Map f13368d = new HashMap();

        e(Class cls, Map map, boolean z10) {
            super(map);
            Constructor h10 = n7.a.h(cls);
            this.f13366b = h10;
            if (z10) {
                j.c((Object) null, h10);
            } else {
                n7.a.k(h10);
            }
            String[] i10 = n7.a.i(cls);
            for (int i11 = 0; i11 < i10.length; i11++) {
                this.f13368d.put(i10[i11], Integer.valueOf(i11));
            }
            Class[] parameterTypes = this.f13366b.getParameterTypes();
            this.f13367c = new Object[parameterTypes.length];
            for (int i12 = 0; i12 < parameterTypes.length; i12++) {
                this.f13367c[i12] = f13365e.get(parameterTypes[i12]);
            }
        }

        private static Map j() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Object[] e() {
            return (Object[]) this.f13367c.clone();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Object f(Object[] objArr) {
            try {
                return this.f13366b.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                throw n7.a.e(e10);
            } catch (IllegalArgumentException | InstantiationException e11) {
                throw new RuntimeException("Failed to invoke constructor '" + n7.a.c(this.f13366b) + "' with args " + Arrays.toString(objArr), e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke constructor '" + n7.a.c(this.f13366b) + "' with args " + Arrays.toString(objArr), e12.getCause());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void g(Object[] objArr, p7.a aVar, c cVar) {
            Integer num = (Integer) this.f13368d.get(cVar.f13361b);
            if (num != null) {
                cVar.a(aVar, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + n7.a.c(this.f13366b) + "' for field with name '" + cVar.f13361b + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public j(k7.c cVar, i7.c cVar2, k7.d dVar, e eVar, List list) {
        this.f13344e = cVar;
        this.f13345f = cVar2;
        this.f13346g = dVar;
        this.f13347h = eVar;
        this.f13348i = list;
    }

    /* access modifiers changed from: private */
    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!l.a(accessibleObject, obj)) {
            String f10 = n7.a.f(accessibleObject, true);
            throw new h(f10 + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
        }
    }

    private c d(i7.d dVar, Field field, Method method, String str, TypeToken typeToken, boolean z10, boolean z11, boolean z12) {
        i7.d dVar2 = dVar;
        TypeToken typeToken2 = typeToken;
        boolean a10 = k7.k.a(typeToken.getRawType());
        int modifiers = field.getModifiers();
        boolean z13 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        j7.b bVar = (j7.b) field.getAnnotation(j7.b.class);
        r b10 = bVar != null ? this.f13347h.b(this.f13344e, dVar2, typeToken2, bVar) : null;
        boolean z14 = b10 != null;
        if (b10 == null) {
            b10 = dVar2.m(typeToken2);
        }
        return new a(str, field.getName(), z10, z11, z12, method, field, z14, b10, dVar, typeToken, a10, z13);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0165 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0155 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map e(i7.d r29, com.google.gson.reflect.TypeToken r30, java.lang.Class r31, boolean r32, boolean r33) {
        /*
            r28 = this;
            r9 = r28
            r10 = r31
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            boolean r0 = r31.isInterface()
            if (r0 == 0) goto L_0x0010
            return r11
        L_0x0010:
            java.lang.reflect.Type r12 = r30.getType()
            r13 = r30
            r0 = r32
            r14 = r10
        L_0x0019:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r14 == r1) goto L_0x019d
            java.lang.reflect.Field[] r15 = r14.getDeclaredFields()
            r8 = 1
            r7 = 0
            if (r14 == r10) goto L_0x0039
            int r1 = r15.length
            if (r1 <= 0) goto L_0x0039
            java.util.List r0 = r9.f13348i
            i7.o r0 = k7.l.b(r0, r14)
            i7.o r1 = i7.o.BLOCK_ALL
            if (r0 == r1) goto L_0x003c
            i7.o r1 = i7.o.BLOCK_INACCESSIBLE
            if (r0 != r1) goto L_0x0038
            r0 = r8
            goto L_0x0039
        L_0x0038:
            r0 = r7
        L_0x0039:
            r16 = r0
            goto L_0x0060
        L_0x003c:
            i7.h r0 = new i7.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " (supertype of "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0060:
            int r6 = r15.length
            r5 = r7
        L_0x0062:
            if (r5 >= r6) goto L_0x0181
            r4 = r15[r5]
            boolean r0 = r9.g(r4, r8)
            boolean r1 = r9.g(r4, r7)
            if (r0 != 0) goto L_0x007e
            if (r1 != 0) goto L_0x007e
            r25 = r5
            r21 = r6
            r26 = r7
            r27 = r8
            r30 = r15
            goto L_0x0155
        L_0x007e:
            if (r33 == 0) goto L_0x00cc
            int r3 = r4.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 == 0) goto L_0x008f
            r17 = r7
        L_0x008c:
            r18 = 0
            goto L_0x00cf
        L_0x008f:
            java.lang.reflect.Method r3 = n7.a.g(r14, r4)
            if (r16 != 0) goto L_0x0098
            n7.a.k(r3)
        L_0x0098:
            java.lang.Class<j7.c> r2 = j7.c.class
            java.lang.annotation.Annotation r17 = r3.getAnnotation(r2)
            if (r17 == 0) goto L_0x00c7
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            if (r2 == 0) goto L_0x00a7
            goto L_0x00c7
        L_0x00a7:
            java.lang.String r0 = n7.a.f(r3, r7)
            i7.h r1 = new i7.h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@SerializedName on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " is not supported"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x00c7:
            r17 = r1
            r18 = r3
            goto L_0x00cf
        L_0x00cc:
            r17 = r1
            goto L_0x008c
        L_0x00cf:
            if (r16 != 0) goto L_0x00d6
            if (r18 != 0) goto L_0x00d6
            n7.a.k(r4)
        L_0x00d6:
            java.lang.reflect.Type r1 = r13.getType()
            java.lang.reflect.Type r2 = r4.getGenericType()
            java.lang.reflect.Type r19 = k7.b.o(r1, r14, r2)
            java.util.List r3 = r9.f(r4)
            int r2 = r3.size()
            r9 = r7
            r1 = 0
        L_0x00ec:
            if (r9 >= r2) goto L_0x0148
            java.lang.Object r20 = r3.get(r9)
            r10 = r20
            java.lang.String r10 = (java.lang.String) r10
            if (r9 == 0) goto L_0x00fb
            r20 = r7
            goto L_0x00fd
        L_0x00fb:
            r20 = r0
        L_0x00fd:
            com.google.gson.reflect.TypeToken r21 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r19)
            r0 = r28
            r30 = r15
            r15 = r1
            r1 = r29
            r22 = r2
            r2 = r4
            r23 = r3
            r3 = r18
            r24 = r4
            r4 = r10
            r25 = r5
            r5 = r21
            r21 = r6
            r6 = r20
            r26 = r7
            r7 = r17
            r27 = r8
            r8 = r16
            l7.j$c r0 = r0.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r11.put(r10, r0)
            l7.j$c r0 = (l7.j.c) r0
            if (r15 != 0) goto L_0x0130
            r1 = r0
            goto L_0x0131
        L_0x0130:
            r1 = r15
        L_0x0131:
            int r9 = r9 + 1
            r15 = r30
            r10 = r31
            r0 = r20
            r6 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r7 = r26
            r8 = r27
            goto L_0x00ec
        L_0x0148:
            r25 = r5
            r21 = r6
            r26 = r7
            r27 = r8
            r30 = r15
            r15 = r1
            if (r15 != 0) goto L_0x0165
        L_0x0155:
            int r5 = r25 + 1
            r9 = r28
            r15 = r30
            r10 = r31
            r6 = r21
            r7 = r26
            r8 = r27
            goto L_0x0062
        L_0x0165:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r2 = " declares multiple JSON fields named "
            r1.append(r2)
            java.lang.String r2 = r15.f13360a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0181:
            java.lang.reflect.Type r0 = r13.getType()
            java.lang.reflect.Type r1 = r14.getGenericSuperclass()
            java.lang.reflect.Type r0 = k7.b.o(r0, r14, r1)
            com.google.gson.reflect.TypeToken r13 = com.google.gson.reflect.TypeToken.get((java.lang.reflect.Type) r0)
            java.lang.Class r14 = r13.getRawType()
            r9 = r28
            r10 = r31
            r0 = r16
            goto L_0x0019
        L_0x019d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.j.e(i7.d, com.google.gson.reflect.TypeToken, java.lang.Class, boolean, boolean):java.util.Map");
    }

    private List f(Field field) {
        j7.c cVar = (j7.c) field.getAnnotation(j7.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f13345f.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    private boolean g(Field field, boolean z10) {
        return !this.f13346g.c(field.getType(), z10) && !this.f13346g.f(field, z10);
    }

    public r a(i7.d dVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        o b10 = l.b(this.f13348i, rawType);
        if (b10 != o.BLOCK_ALL) {
            boolean z10 = b10 == o.BLOCK_INACCESSIBLE;
            return n7.a.j(rawType) ? new e(rawType, e(dVar, typeToken, rawType, z10, true), z10) : new d(this.f13344e.b(typeToken), e(dVar, typeToken, rawType, z10, false));
        }
        throw new h("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
