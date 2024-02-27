package t0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

public abstract class y {

    /* renamed from: c  reason: collision with root package name */
    public static final l f16481c = new l((cm.g) null);

    /* renamed from: d  reason: collision with root package name */
    public static final y f16482d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final y f16483e = new i();

    /* renamed from: f  reason: collision with root package name */
    public static final y f16484f = new e();

    /* renamed from: g  reason: collision with root package name */
    public static final y f16485g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final y f16486h = new g();

    /* renamed from: i  reason: collision with root package name */
    public static final y f16487i = new d();

    /* renamed from: j  reason: collision with root package name */
    public static final y f16488j = new c();

    /* renamed from: k  reason: collision with root package name */
    public static final y f16489k = new b();

    /* renamed from: l  reason: collision with root package name */
    public static final y f16490l = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final y f16491m = new k();

    /* renamed from: n  reason: collision with root package name */
    public static final y f16492n = new j();

    /* renamed from: a  reason: collision with root package name */
    private final boolean f16493a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16494b = "nav_type";

    public static final class a extends y {
        a() {
            super(true);
        }

        public String b() {
            return "boolean[]";
        }

        /* renamed from: i */
        public boolean[] a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: j */
        public boolean[] f(String str) {
            cm.l.f(str, "value");
            return new boolean[]{((Boolean) y.f16489k.f(str)).booleanValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = ql.l.r(r3, j(r2));
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean[] g(java.lang.String r2, boolean[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                cm.l.f(r2, r0)
                if (r3 == 0) goto L_0x0011
                boolean[] r0 = r1.f(r2)
                boolean[] r3 = ql.l.r(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                boolean[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.y.a.g(java.lang.String, boolean[]):boolean[]");
        }

        /* renamed from: l */
        public void h(Bundle bundle, String str, boolean[] zArr) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static final class b extends y {
        b() {
            super(false);
        }

        public String b() {
            return "boolean";
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Boolean) obj).booleanValue());
        }

        /* renamed from: i */
        public Boolean a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (Boolean) bundle.get(str);
        }

        /* renamed from: j */
        public Boolean f(String str) {
            boolean z10;
            cm.l.f(str, "value");
            if (cm.l.a(str, "true")) {
                z10 = true;
            } else if (cm.l.a(str, "false")) {
                z10 = false;
            } else {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.valueOf(z10);
        }

        public void k(Bundle bundle, String str, boolean z10) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putBoolean(str, z10);
        }
    }

    public static final class c extends y {
        c() {
            super(true);
        }

        public String b() {
            return "float[]";
        }

        /* renamed from: i */
        public float[] a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (float[]) bundle.get(str);
        }

        /* renamed from: j */
        public float[] f(String str) {
            cm.l.f(str, "value");
            return new float[]{((Number) y.f16487i.f(str)).floatValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = ql.l.m(r3, j(r2));
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public float[] g(java.lang.String r2, float[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                cm.l.f(r2, r0)
                if (r3 == 0) goto L_0x0011
                float[] r0 = r1.f(r2)
                float[] r3 = ql.l.m(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                float[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.y.c.g(java.lang.String, float[]):float[]");
        }

        /* renamed from: l */
        public void h(Bundle bundle, String str, float[] fArr) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putFloatArray(str, fArr);
        }
    }

    public static final class d extends y {
        d() {
            super(false);
        }

        public String b() {
            return "float";
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).floatValue());
        }

        /* renamed from: i */
        public Float a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            Object obj = bundle.get(str);
            cm.l.d(obj, "null cannot be cast to non-null type kotlin.Float");
            return (Float) obj;
        }

        /* renamed from: j */
        public Float f(String str) {
            cm.l.f(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        public void k(Bundle bundle, String str, float f10) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putFloat(str, f10);
        }
    }

    public static final class e extends y {
        e() {
            super(true);
        }

        public String b() {
            return "integer[]";
        }

        /* renamed from: i */
        public int[] a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (int[]) bundle.get(str);
        }

        /* renamed from: j */
        public int[] f(String str) {
            cm.l.f(str, "value");
            return new int[]{((Number) y.f16482d.f(str)).intValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = ql.l.n(r3, j(r2));
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int[] g(java.lang.String r2, int[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                cm.l.f(r2, r0)
                if (r3 == 0) goto L_0x0011
                int[] r0 = r1.f(r2)
                int[] r3 = ql.l.n(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                int[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.y.e.g(java.lang.String, int[]):int[]");
        }

        /* renamed from: l */
        public void h(Bundle bundle, String str, int[] iArr) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putIntArray(str, iArr);
        }
    }

    public static final class f extends y {
        f() {
            super(false);
        }

        public String b() {
            return "integer";
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: i */
        public Integer a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            Object obj = bundle.get(str);
            cm.l.d(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* renamed from: j */
        public Integer f(String str) {
            int i10;
            cm.l.f(str, "value");
            if (p.A(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                cm.l.e(substring, "this as java.lang.String).substring(startIndex)");
                i10 = Integer.parseInt(substring, b.a(16));
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void k(Bundle bundle, String str, int i10) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putInt(str, i10);
        }
    }

    public static final class g extends y {
        g() {
            super(true);
        }

        public String b() {
            return "long[]";
        }

        /* renamed from: i */
        public long[] a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (long[]) bundle.get(str);
        }

        /* renamed from: j */
        public long[] f(String str) {
            cm.l.f(str, "value");
            return new long[]{((Number) y.f16485g.f(str)).longValue()};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = ql.l.o(r3, j(r2));
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long[] g(java.lang.String r2, long[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                cm.l.f(r2, r0)
                if (r3 == 0) goto L_0x0011
                long[] r0 = r1.f(r2)
                long[] r3 = ql.l.o(r3, r0)
                if (r3 != 0) goto L_0x0015
            L_0x0011:
                long[] r3 = r1.f(r2)
            L_0x0015:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.y.g.g(java.lang.String, long[]):long[]");
        }

        /* renamed from: l */
        public void h(Bundle bundle, String str, long[] jArr) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putLongArray(str, jArr);
        }
    }

    public static final class h extends y {
        h() {
            super(false);
        }

        public String b() {
            return "long";
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).longValue());
        }

        /* renamed from: i */
        public Long a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            Object obj = bundle.get(str);
            cm.l.d(obj, "null cannot be cast to non-null type kotlin.Long");
            return (Long) obj;
        }

        /* renamed from: j */
        public Long f(String str) {
            String str2;
            long j10;
            cm.l.f(str, "value");
            if (p.n(str, "L", false, 2, (Object) null)) {
                str2 = str.substring(0, str.length() - 1);
                cm.l.e(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str2 = str;
            }
            if (p.A(str, "0x", false, 2, (Object) null)) {
                String substring = str2.substring(2);
                cm.l.e(substring, "this as java.lang.String).substring(startIndex)");
                j10 = Long.parseLong(substring, b.a(16));
            } else {
                j10 = Long.parseLong(str2);
            }
            return Long.valueOf(j10);
        }

        public void k(Bundle bundle, String str, long j10) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putLong(str, j10);
        }
    }

    public static final class i extends y {
        i() {
            super(false);
        }

        public String b() {
            return "reference";
        }

        public /* bridge */ /* synthetic */ void h(Bundle bundle, String str, Object obj) {
            k(bundle, str, ((Number) obj).intValue());
        }

        /* renamed from: i */
        public Integer a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            Object obj = bundle.get(str);
            cm.l.d(obj, "null cannot be cast to non-null type kotlin.Int");
            return (Integer) obj;
        }

        /* renamed from: j */
        public Integer f(String str) {
            int i10;
            cm.l.f(str, "value");
            if (p.A(str, "0x", false, 2, (Object) null)) {
                String substring = str.substring(2);
                cm.l.e(substring, "this as java.lang.String).substring(startIndex)");
                i10 = Integer.parseInt(substring, b.a(16));
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        public void k(Bundle bundle, String str, int i10) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putInt(str, i10);
        }
    }

    public static final class j extends y {
        j() {
            super(true);
        }

        public String b() {
            return "string[]";
        }

        /* renamed from: i */
        public String[] a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (String[]) bundle.get(str);
        }

        /* renamed from: j */
        public String[] f(String str) {
            cm.l.f(str, "value");
            return new String[]{str};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r3 = (java.lang.String[]) ql.l.q(r3, j(r2));
         */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String[] g(java.lang.String r2, java.lang.String[] r3) {
            /*
                r1 = this;
                java.lang.String r0 = "value"
                cm.l.f(r2, r0)
                if (r3 == 0) goto L_0x0013
                java.lang.String[] r0 = r1.f(r2)
                java.lang.Object[] r3 = ql.l.q(r3, r0)
                java.lang.String[] r3 = (java.lang.String[]) r3
                if (r3 != 0) goto L_0x0017
            L_0x0013:
                java.lang.String[] r3 = r1.f(r2)
            L_0x0017:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.y.j.g(java.lang.String, java.lang.String[]):java.lang.String[]");
        }

        /* renamed from: l */
        public void h(Bundle bundle, String str, String[] strArr) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putStringArray(str, strArr);
        }
    }

    public static final class k extends y {
        k() {
            super(true);
        }

        public String b() {
            return "string";
        }

        /* renamed from: i */
        public String a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (String) bundle.get(str);
        }

        /* renamed from: j */
        public String f(String str) {
            cm.l.f(str, "value");
            if (cm.l.a(str, "null")) {
                return null;
            }
            return str;
        }

        /* renamed from: k */
        public void h(Bundle bundle, String str, String str2) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            bundle.putString(str, str2);
        }
    }

    public static final class l {
        private l() {
        }

        public /* synthetic */ l(cm.g gVar) {
            this();
        }

        public y a(String str, String str2) {
            String str3;
            y yVar = y.f16482d;
            if (cm.l.a(yVar.b(), str)) {
                return yVar;
            }
            y yVar2 = y.f16484f;
            if (cm.l.a(yVar2.b(), str)) {
                return yVar2;
            }
            y yVar3 = y.f16485g;
            if (cm.l.a(yVar3.b(), str)) {
                return yVar3;
            }
            y yVar4 = y.f16486h;
            if (cm.l.a(yVar4.b(), str)) {
                return yVar4;
            }
            y yVar5 = y.f16489k;
            if (cm.l.a(yVar5.b(), str)) {
                return yVar5;
            }
            y yVar6 = y.f16490l;
            if (cm.l.a(yVar6.b(), str)) {
                return yVar6;
            }
            y yVar7 = y.f16491m;
            if (cm.l.a(yVar7.b(), str)) {
                return yVar7;
            }
            y yVar8 = y.f16492n;
            if (cm.l.a(yVar8.b(), str)) {
                return yVar8;
            }
            y yVar9 = y.f16487i;
            if (cm.l.a(yVar9.b(), str)) {
                return yVar9;
            }
            y yVar10 = y.f16488j;
            if (cm.l.a(yVar10.b(), str)) {
                return yVar10;
            }
            y yVar11 = y.f16483e;
            if (cm.l.a(yVar11.b(), str)) {
                return yVar11;
            }
            if (str == null || str.length() == 0) {
                return yVar7;
            }
            try {
                if (!p.A(str, ".", false, 2, (Object) null) || str2 == null) {
                    str3 = str;
                } else {
                    str3 = str2 + str;
                }
                Class<Serializable> cls = Serializable.class;
                Class<Parcelable> cls2 = Parcelable.class;
                if (p.n(str, "[]", false, 2, (Object) null)) {
                    str3 = str3.substring(0, str3.length() - 2);
                    cm.l.e(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                    Class<?> cls3 = Class.forName(str3);
                    if (cls2.isAssignableFrom(cls3)) {
                        cm.l.d(cls3, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        return new n(cls3);
                    } else if (cls.isAssignableFrom(cls3)) {
                        cm.l.d(cls3, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new p(cls3);
                    }
                } else {
                    Class<?> cls4 = Class.forName(str3);
                    if (cls2.isAssignableFrom(cls4)) {
                        cm.l.d(cls4, "null cannot be cast to non-null type java.lang.Class<kotlin.Any?>");
                        return new o(cls4);
                    } else if (Enum.class.isAssignableFrom(cls4)) {
                        cm.l.d(cls4, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>>");
                        return new m(cls4);
                    } else if (cls.isAssignableFrom(cls4)) {
                        cm.l.d(cls4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new q(cls4);
                    }
                }
                throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
        /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r1 = t0.y.f16489k;
            r1.f(r3);
            cm.l.d(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
            r3 = t0.y.f16491m;
            cm.l.d(r3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
            return r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r1 = t0.y.f16485g;
            r1.f(r3);
            cm.l.d(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
            r1 = t0.y.f16487i;
            r1.f(r3);
            cm.l.d(r1, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            return r1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final t0.y b(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>"
                java.lang.String r1 = "value"
                cm.l.f(r3, r1)
                t0.y r1 = t0.y.f16482d     // Catch:{ IllegalArgumentException -> 0x0010 }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x0010 }
                cm.l.d(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0010 }
                return r1
            L_0x0010:
                t0.y r1 = t0.y.f16485g     // Catch:{ IllegalArgumentException -> 0x0019 }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x0019 }
                cm.l.d(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0019 }
                return r1
            L_0x0019:
                t0.y r1 = t0.y.f16487i     // Catch:{ IllegalArgumentException -> 0x0022 }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x0022 }
                cm.l.d(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0022 }
                return r1
            L_0x0022:
                t0.y r1 = t0.y.f16489k     // Catch:{ IllegalArgumentException -> 0x002b }
                r1.f(r3)     // Catch:{ IllegalArgumentException -> 0x002b }
                cm.l.d(r1, r0)     // Catch:{ IllegalArgumentException -> 0x002b }
                return r1
            L_0x002b:
                t0.y r3 = t0.y.f16491m
                cm.l.d(r3, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.y.l.b(java.lang.String):t0.y");
        }

        public final y c(Object obj) {
            y yVar;
            y qVar;
            if (obj instanceof Integer) {
                yVar = y.f16482d;
            } else if (obj instanceof int[]) {
                yVar = y.f16484f;
            } else if (obj instanceof Long) {
                yVar = y.f16485g;
            } else if (obj instanceof long[]) {
                yVar = y.f16486h;
            } else if (obj instanceof Float) {
                yVar = y.f16487i;
            } else if (obj instanceof float[]) {
                yVar = y.f16488j;
            } else if (obj instanceof Boolean) {
                yVar = y.f16489k;
            } else if (obj instanceof boolean[]) {
                yVar = y.f16490l;
            } else if ((obj instanceof String) || obj == null) {
                yVar = y.f16491m;
            } else if (!(obj instanceof Object[]) || !(((Object[]) obj) instanceof String[])) {
                if (obj.getClass().isArray()) {
                    Class<?> componentType = obj.getClass().getComponentType();
                    cm.l.c(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = obj.getClass().getComponentType();
                        cm.l.d(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        qVar = new n(componentType2);
                        return qVar;
                    }
                }
                if (obj.getClass().isArray()) {
                    Class<?> componentType3 = obj.getClass().getComponentType();
                    cm.l.c(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = obj.getClass().getComponentType();
                        cm.l.d(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        qVar = new p(componentType4);
                        return qVar;
                    }
                }
                if (obj instanceof Parcelable) {
                    qVar = new o(obj.getClass());
                } else if (obj instanceof Enum) {
                    qVar = new m(obj.getClass());
                } else if (obj instanceof Serializable) {
                    qVar = new q(obj.getClass());
                } else {
                    throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                }
                return qVar;
            } else {
                yVar = y.f16492n;
            }
            cm.l.d(yVar, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
            return yVar;
        }
    }

    public static final class m extends q {

        /* renamed from: p  reason: collision with root package name */
        private final Class f16495p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(Class cls) {
            super(false, cls);
            cm.l.f(cls, "type");
            if (cls.isEnum()) {
                this.f16495p = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        public String b() {
            String name = this.f16495p.getName();
            cm.l.e(name, "type.name");
            return name;
        }

        /* renamed from: l */
        public Enum j(String str) {
            Enum enumR;
            cm.l.f(str, "value");
            Object[] enumConstants = this.f16495p.getEnumConstants();
            cm.l.e(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    enumR = null;
                    break;
                }
                enumR = enumConstants[i10];
                if (p.o(((Enum) enumR).name(), str, true)) {
                    break;
                }
                i10++;
            }
            Enum enumR2 = enumR;
            if (enumR2 != null) {
                return enumR2;
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f16495p.getName() + '.');
        }
    }

    public static final class n extends y {

        /* renamed from: o  reason: collision with root package name */
        private final Class f16496o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(Class cls) {
            super(true);
            cm.l.f(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    cm.l.d(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.f16496o = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
        }

        public String b() {
            String name = this.f16496o.getName();
            cm.l.e(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!cm.l.a(n.class, obj.getClass())) {
                return false;
            }
            return cm.l.a(this.f16496o, ((n) obj).f16496o);
        }

        public int hashCode() {
            return this.f16496o.hashCode();
        }

        /* renamed from: i */
        public Parcelable[] a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: j */
        public Parcelable[] f(String str) {
            cm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: k */
        public void h(Bundle bundle, String str, Parcelable[] parcelableArr) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            this.f16496o.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }
    }

    public static final class o extends y {

        /* renamed from: o  reason: collision with root package name */
        private final Class f16497o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(Class cls) {
            super(true);
            cm.l.f(cls, "type");
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f16497o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        public Object a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return bundle.get(str);
        }

        public String b() {
            String name = this.f16497o.getName();
            cm.l.e(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!cm.l.a(o.class, obj.getClass())) {
                return false;
            }
            return cm.l.a(this.f16497o, ((o) obj).f16497o);
        }

        public Object f(String str) {
            cm.l.f(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public void h(Bundle bundle, String str, Object obj) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            this.f16497o.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public int hashCode() {
            return this.f16497o.hashCode();
        }
    }

    public static final class p extends y {

        /* renamed from: o  reason: collision with root package name */
        private final Class f16498o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(Class cls) {
            super(true);
            cm.l.f(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    Class<?> cls2 = Class.forName("[L" + cls.getName() + ';');
                    cm.l.d(cls2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.f16498o = cls2;
                } catch (ClassNotFoundException e10) {
                    throw new RuntimeException(e10);
                }
            } else {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
        }

        public String b() {
            String name = this.f16498o.getName();
            cm.l.e(name, "arrayType.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!cm.l.a(p.class, obj.getClass())) {
                return false;
            }
            return cm.l.a(this.f16498o, ((p) obj).f16498o);
        }

        public int hashCode() {
            return this.f16498o.hashCode();
        }

        /* renamed from: i */
        public Serializable[] a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: j */
        public Serializable[] f(String str) {
            cm.l.f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.os.Bundle r2, java.lang.String r3, java.io.Serializable[] r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundle"
                cm.l.f(r2, r0)
                java.lang.String r0 = "key"
                cm.l.f(r3, r0)
                java.lang.Class r0 = r1.f16498o
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.y.p.h(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }
    }

    public static class q extends y {

        /* renamed from: o  reason: collision with root package name */
        private final Class f16499o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(Class cls) {
            super(true);
            cm.l.f(cls, "type");
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            } else if (true ^ cls.isEnum()) {
                this.f16499o = cls;
            } else {
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        public String b() {
            String name = this.f16499o.getName();
            cm.l.e(name, "type.name");
            return name;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            return cm.l.a(this.f16499o, ((q) obj).f16499o);
        }

        public int hashCode() {
            return this.f16499o.hashCode();
        }

        /* renamed from: i */
        public Serializable a(Bundle bundle, String str) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            return (Serializable) bundle.get(str);
        }

        /* renamed from: j */
        public Serializable f(String str) {
            cm.l.f(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: k */
        public void h(Bundle bundle, String str, Serializable serializable) {
            cm.l.f(bundle, "bundle");
            cm.l.f(str, "key");
            cm.l.f(serializable, "value");
            this.f16499o.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(boolean z10, Class cls) {
            super(z10);
            cm.l.f(cls, "type");
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f16499o = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }

    public y(boolean z10) {
        this.f16493a = z10;
    }

    public abstract Object a(Bundle bundle, String str);

    public abstract String b();

    public boolean c() {
        return this.f16493a;
    }

    public final Object d(Bundle bundle, String str, String str2) {
        cm.l.f(bundle, "bundle");
        cm.l.f(str, "key");
        cm.l.f(str2, "value");
        Object f10 = f(str2);
        h(bundle, str, f10);
        return f10;
    }

    public final Object e(Bundle bundle, String str, String str2, Object obj) {
        cm.l.f(bundle, "bundle");
        cm.l.f(str, "key");
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        } else if (str2 == null) {
            return obj;
        } else {
            Object g10 = g(str2, obj);
            h(bundle, str, g10);
            return g10;
        }
    }

    public abstract Object f(String str);

    public Object g(String str, Object obj) {
        cm.l.f(str, "value");
        return f(str);
    }

    public abstract void h(Bundle bundle, String str, Object obj);

    public String toString() {
        return b();
    }
}
