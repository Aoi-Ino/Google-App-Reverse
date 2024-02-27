package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

abstract class n1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f7136a = Logger.getLogger(n1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f7137b = B();

    /* renamed from: c  reason: collision with root package name */
    private static final Class f7138c = d.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f7139d = m(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f7140e = m(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final e f7141f = z();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f7142g = Q();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f7143h = P();

    /* renamed from: i  reason: collision with root package name */
    static final long f7144i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f7145j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f7146k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f7147l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f7148m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f7149n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f7150o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f7151p;

    /* renamed from: q  reason: collision with root package name */
    private static final long f7152q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f7153r;

    /* renamed from: s  reason: collision with root package name */
    private static final long f7154s;

    /* renamed from: t  reason: collision with root package name */
    private static final long f7155t;

    /* renamed from: u  reason: collision with root package name */
    private static final long f7156u;

    /* renamed from: v  reason: collision with root package name */
    private static final long f7157v = o(l());

    /* renamed from: w  reason: collision with root package name */
    private static final int f7158w;

    /* renamed from: x  reason: collision with root package name */
    static final boolean f7159x = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    class a implements PrivilegedExceptionAction {
        a() {
        }

        /* renamed from: a */
        public Unsafe run() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return n1.f7159x ? n1.q(obj, j10) : n1.r(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return n1.f7159x ? n1.t(obj, j10) : n1.u(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (n1.f7159x) {
                n1.F(obj, j10, z10);
            } else {
                n1.G(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (n1.f7159x) {
                n1.I(obj, j10, b10);
            } else {
                n1.J(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return n1.f7159x ? n1.q(obj, j10) : n1.r(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return n1.f7159x ? n1.t(obj, j10) : n1.u(obj, j10);
        }

        public double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public void k(Object obj, long j10, boolean z10) {
            if (n1.f7159x) {
                n1.F(obj, j10, z10);
            } else {
                n1.G(obj, j10, z10);
            }
        }

        public void l(Object obj, long j10, byte b10) {
            if (n1.f7159x) {
                n1.I(obj, j10, b10);
            } else {
                n1.J(obj, j10, b10);
            }
        }

        public void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public void n(Object obj, long j10, float f10) {
            o(obj, j10, Float.floatToIntBits(f10));
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        public boolean c(Object obj, long j10) {
            return this.f7160a.getBoolean(obj, j10);
        }

        public byte d(Object obj, long j10) {
            return this.f7160a.getByte(obj, j10);
        }

        public double e(Object obj, long j10) {
            return this.f7160a.getDouble(obj, j10);
        }

        public float f(Object obj, long j10) {
            return this.f7160a.getFloat(obj, j10);
        }

        public void k(Object obj, long j10, boolean z10) {
            this.f7160a.putBoolean(obj, j10, z10);
        }

        public void l(Object obj, long j10, byte b10) {
            this.f7160a.putByte(obj, j10, b10);
        }

        public void m(Object obj, long j10, double d10) {
            this.f7160a.putDouble(obj, j10, d10);
        }

        public void n(Object obj, long j10, float f10) {
            this.f7160a.putFloat(obj, j10, f10);
        }
    }

    private static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f7160a;

        e(Unsafe unsafe) {
            this.f7160a = unsafe;
        }

        public final int a(Class cls) {
            return this.f7160a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f7160a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f7160a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f7160a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f7160a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f7160a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, long j10, int i10) {
            this.f7160a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f7160a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f7160a.putObject(obj, j10, obj2);
        }
    }

    static {
        long j10 = (long) j(byte[].class);
        f7144i = j10;
        Class<boolean[]> cls = boolean[].class;
        f7145j = (long) j(cls);
        f7146k = (long) k(cls);
        Class<int[]> cls2 = int[].class;
        f7147l = (long) j(cls2);
        f7148m = (long) k(cls2);
        Class<long[]> cls3 = long[].class;
        f7149n = (long) j(cls3);
        f7150o = (long) k(cls3);
        Class<float[]> cls4 = float[].class;
        f7151p = (long) j(cls4);
        f7152q = (long) k(cls4);
        Class<double[]> cls5 = double[].class;
        f7153r = (long) j(cls5);
        f7154s = (long) k(cls5);
        Class<Object[]> cls6 = Object[].class;
        f7155t = (long) j(cls6);
        f7156u = (long) k(cls6);
        f7158w = (int) (j10 & 7);
    }

    static Object A(Object obj, long j10) {
        return f7141f.i(obj, j10);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean C() {
        return f7143h;
    }

    static boolean D() {
        return f7142g;
    }

    static void E(Object obj, long j10, boolean z10) {
        f7141f.k(obj, j10, z10);
    }

    /* access modifiers changed from: private */
    public static void F(Object obj, long j10, boolean z10) {
        I(obj, j10, z10 ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void G(Object obj, long j10, boolean z10) {
        J(obj, j10, z10 ? (byte) 1 : 0);
    }

    static void H(byte[] bArr, long j10, byte b10) {
        f7141f.l(bArr, f7144i + j10, b10);
    }

    /* access modifiers changed from: private */
    public static void I(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int x10 = x(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x10 & (~(255 << i10))));
    }

    /* access modifiers changed from: private */
    public static void J(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        M(obj, j11, ((255 & b10) << i10) | (x(obj, j11) & (~(255 << i10))));
    }

    static void K(Object obj, long j10, double d10) {
        f7141f.m(obj, j10, d10);
    }

    static void L(Object obj, long j10, float f10) {
        f7141f.n(obj, j10, f10);
    }

    static void M(Object obj, long j10, int i10) {
        f7141f.o(obj, j10, i10);
    }

    static void N(Object obj, long j10, long j11) {
        f7141f.p(obj, j10, j11);
    }

    static void O(Object obj, long j10, Object obj2) {
        f7141f.q(obj, j10, obj2);
    }

    private static boolean P() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = f7137b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            if (d.c()) {
                return true;
            }
            cls3.getMethod("getByte", new Class[]{cls2, cls4});
            cls3.getMethod("putByte", new Class[]{cls2, cls4, Byte.TYPE});
            cls3.getMethod("getBoolean", new Class[]{cls2, cls4});
            cls3.getMethod("putBoolean", new Class[]{cls2, cls4, Boolean.TYPE});
            cls3.getMethod("getFloat", new Class[]{cls2, cls4});
            cls3.getMethod("putFloat", new Class[]{cls2, cls4, Float.TYPE});
            cls3.getMethod("getDouble", new Class[]{cls2, cls4});
            cls3.getMethod("putDouble", new Class[]{cls2, cls4, Double.TYPE});
            return true;
        } catch (Throwable th2) {
            Logger logger = f7136a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static boolean Q() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = f7137b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls2 = unsafe.getClass();
            cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
            Class cls3 = Long.TYPE;
            cls2.getMethod("getLong", new Class[]{cls, cls3});
            if (l() == null) {
                return false;
            }
            if (d.c()) {
                return true;
            }
            cls2.getMethod("getByte", new Class[]{cls3});
            cls2.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
            cls2.getMethod("getInt", new Class[]{cls3});
            cls2.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
            cls2.getMethod("getLong", new Class[]{cls3});
            cls2.getMethod("putLong", new Class[]{cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
            cls2.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
            return true;
        } catch (Throwable th2) {
            Logger logger = f7136a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    static Object i(Class cls) {
        try {
            return f7137b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static int j(Class cls) {
        if (f7143h) {
            return f7141f.a(cls);
        }
        return -1;
    }

    private static int k(Class cls) {
        if (f7143h) {
            return f7141f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n10;
        Class<Buffer> cls = Buffer.class;
        if (d.c() && (n10 = n(cls, "effectiveDirectAddress")) != null) {
            return n10;
        }
        Field n11 = n(cls, "address");
        if (n11 == null || n11.getType() != Long.TYPE) {
            return null;
        }
        return n11;
    }

    private static boolean m(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!d.c()) {
            return false;
        }
        try {
            Class cls3 = f7138c;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f7141f) == null) {
            return -1;
        }
        return eVar.j(field);
    }

    static boolean p(Object obj, long j10) {
        return f7141f.c(obj, j10);
    }

    /* access modifiers changed from: private */
    public static boolean q(Object obj, long j10) {
        return t(obj, j10) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean r(Object obj, long j10) {
        return u(obj, j10) != 0;
    }

    static byte s(byte[] bArr, long j10) {
        return f7141f.d(bArr, f7144i + j10);
    }

    /* access modifiers changed from: private */
    public static byte t(Object obj, long j10) {
        return (byte) ((x(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* access modifiers changed from: private */
    public static byte u(Object obj, long j10) {
        return (byte) ((x(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    static double v(Object obj, long j10) {
        return f7141f.e(obj, j10);
    }

    static float w(Object obj, long j10) {
        return f7141f.f(obj, j10);
    }

    static int x(Object obj, long j10) {
        return f7141f.g(obj, j10);
    }

    static long y(Object obj, long j10) {
        return f7141f.h(obj, j10);
    }

    private static e z() {
        Unsafe unsafe = f7137b;
        if (unsafe == null) {
            return null;
        }
        if (!d.c()) {
            return new d(unsafe);
        }
        if (f7139d) {
            return new c(unsafe);
        }
        if (f7140e) {
            return new b(unsafe);
        }
        return null;
    }
}
