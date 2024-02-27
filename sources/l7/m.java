package l7;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public abstract class m {
    public static final i7.r A = new h();
    public static final i7.r B = new i();
    public static final i7.s C;
    public static final i7.r D;
    public static final i7.s E;
    public static final i7.r F;
    public static final i7.s G;
    public static final i7.r H;
    public static final i7.s I;
    public static final i7.r J;
    public static final i7.s K;
    public static final i7.r L;
    public static final i7.s M;
    public static final i7.r N;
    public static final i7.s O;
    public static final i7.r P;
    public static final i7.s Q;
    public static final i7.r R;
    public static final i7.s S;
    public static final i7.r T;
    public static final i7.s U;
    public static final i7.r V;
    public static final i7.s W;
    public static final i7.s X = new u();

    /* renamed from: a  reason: collision with root package name */
    public static final i7.r f13372a;

    /* renamed from: b  reason: collision with root package name */
    public static final i7.s f13373b;

    /* renamed from: c  reason: collision with root package name */
    public static final i7.r f13374c;

    /* renamed from: d  reason: collision with root package name */
    public static final i7.s f13375d;

    /* renamed from: e  reason: collision with root package name */
    public static final i7.r f13376e;

    /* renamed from: f  reason: collision with root package name */
    public static final i7.r f13377f = new c0();

    /* renamed from: g  reason: collision with root package name */
    public static final i7.s f13378g;

    /* renamed from: h  reason: collision with root package name */
    public static final i7.r f13379h;

    /* renamed from: i  reason: collision with root package name */
    public static final i7.s f13380i;

    /* renamed from: j  reason: collision with root package name */
    public static final i7.r f13381j;

    /* renamed from: k  reason: collision with root package name */
    public static final i7.s f13382k;

    /* renamed from: l  reason: collision with root package name */
    public static final i7.r f13383l;

    /* renamed from: m  reason: collision with root package name */
    public static final i7.s f13384m;

    /* renamed from: n  reason: collision with root package name */
    public static final i7.r f13385n;

    /* renamed from: o  reason: collision with root package name */
    public static final i7.s f13386o;

    /* renamed from: p  reason: collision with root package name */
    public static final i7.r f13387p;

    /* renamed from: q  reason: collision with root package name */
    public static final i7.s f13388q;

    /* renamed from: r  reason: collision with root package name */
    public static final i7.r f13389r;

    /* renamed from: s  reason: collision with root package name */
    public static final i7.s f13390s;

    /* renamed from: t  reason: collision with root package name */
    public static final i7.r f13391t = new b();

    /* renamed from: u  reason: collision with root package name */
    public static final i7.r f13392u = new c();

    /* renamed from: v  reason: collision with root package name */
    public static final i7.r f13393v = new d();

    /* renamed from: w  reason: collision with root package name */
    public static final i7.r f13394w;

    /* renamed from: x  reason: collision with root package name */
    public static final i7.s f13395x;

    /* renamed from: y  reason: collision with root package name */
    public static final i7.r f13396y;

    /* renamed from: z  reason: collision with root package name */
    public static final i7.r f13397z = new g();

    class a extends i7.r {
        a() {
        }

        /* renamed from: e */
        public AtomicIntegerArray b(p7.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.B()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.Z()));
                } catch (NumberFormatException e10) {
                    throw new i7.m((Throwable) e10);
                }
            }
            aVar.l();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        /* renamed from: f */
        public void d(p7.c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.f();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.D0((long) atomicIntegerArray.get(i10));
            }
            cVar.l();
        }
    }

    static /* synthetic */ class a0 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13398a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p7.b[] r0 = p7.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13398a = r0
                p7.b r1 = p7.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13398a     // Catch:{ NoSuchFieldError -> 0x001d }
                p7.b r1 = p7.b.STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13398a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p7.b r1 = p7.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13398a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p7.b r1 = p7.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13398a     // Catch:{ NoSuchFieldError -> 0x003e }
                p7.b r1 = p7.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13398a     // Catch:{ NoSuchFieldError -> 0x0049 }
                p7.b r1 = p7.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l7.m.a0.<clinit>():void");
        }
    }

    class b extends i7.r {
        b() {
        }

        /* renamed from: e */
        public Number b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Long.valueOf(aVar.c0());
            } catch (NumberFormatException e10) {
                throw new i7.m((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, Number number) {
            if (number == null) {
                cVar.R();
            } else {
                cVar.D0(number.longValue());
            }
        }
    }

    class b0 extends i7.r {
        b0() {
        }

        /* renamed from: e */
        public Boolean b(p7.a aVar) {
            p7.b D0 = aVar.D0();
            if (D0 != p7.b.NULL) {
                return D0 == p7.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.B0())) : Boolean.valueOf(aVar.X());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Boolean bool) {
            cVar.E0(bool);
        }
    }

    class c extends i7.r {
        c() {
        }

        /* renamed from: e */
        public Number b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return Float.valueOf((float) aVar.Y());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Number number) {
            if (number == null) {
                cVar.R();
                return;
            }
            if (!(number instanceof Float)) {
                number = Float.valueOf(number.floatValue());
            }
            cVar.F0(number);
        }
    }

    class c0 extends i7.r {
        c0() {
        }

        /* renamed from: e */
        public Boolean b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return Boolean.valueOf(aVar.B0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Boolean bool) {
            cVar.G0(bool == null ? "null" : bool.toString());
        }
    }

    class d extends i7.r {
        d() {
        }

        /* renamed from: e */
        public Number b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return Double.valueOf(aVar.Y());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Number number) {
            if (number == null) {
                cVar.R();
            } else {
                cVar.C0(number.doubleValue());
            }
        }
    }

    class d0 extends i7.r {
        d0() {
        }

        /* renamed from: e */
        public Number b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                int Z = aVar.Z();
                if (Z <= 255 && Z >= -128) {
                    return Byte.valueOf((byte) Z);
                }
                throw new i7.m("Lossy conversion from " + Z + " to byte; at path " + aVar.y());
            } catch (NumberFormatException e10) {
                throw new i7.m((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, Number number) {
            if (number == null) {
                cVar.R();
            } else {
                cVar.D0((long) number.byteValue());
            }
        }
    }

    class e extends i7.r {
        e() {
        }

        /* renamed from: e */
        public Character b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            String B0 = aVar.B0();
            if (B0.length() == 1) {
                return Character.valueOf(B0.charAt(0));
            }
            throw new i7.m("Expecting character, got: " + B0 + "; at " + aVar.y());
        }

        /* renamed from: f */
        public void d(p7.c cVar, Character ch2) {
            cVar.G0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    class e0 extends i7.r {
        e0() {
        }

        /* renamed from: e */
        public Number b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                int Z = aVar.Z();
                if (Z <= 65535 && Z >= -32768) {
                    return Short.valueOf((short) Z);
                }
                throw new i7.m("Lossy conversion from " + Z + " to short; at path " + aVar.y());
            } catch (NumberFormatException e10) {
                throw new i7.m((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, Number number) {
            if (number == null) {
                cVar.R();
            } else {
                cVar.D0((long) number.shortValue());
            }
        }
    }

    class f extends i7.r {
        f() {
        }

        /* renamed from: e */
        public String b(p7.a aVar) {
            p7.b D0 = aVar.D0();
            if (D0 != p7.b.NULL) {
                return D0 == p7.b.BOOLEAN ? Boolean.toString(aVar.X()) : aVar.B0();
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, String str) {
            cVar.G0(str);
        }
    }

    class f0 extends i7.r {
        f0() {
        }

        /* renamed from: e */
        public Number b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.Z());
            } catch (NumberFormatException e10) {
                throw new i7.m((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, Number number) {
            if (number == null) {
                cVar.R();
            } else {
                cVar.D0((long) number.intValue());
            }
        }
    }

    class g extends i7.r {
        g() {
        }

        /* renamed from: e */
        public BigDecimal b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            String B0 = aVar.B0();
            try {
                return new BigDecimal(B0);
            } catch (NumberFormatException e10) {
                throw new i7.m("Failed parsing '" + B0 + "' as BigDecimal; at path " + aVar.y(), e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, BigDecimal bigDecimal) {
            cVar.F0(bigDecimal);
        }
    }

    class g0 extends i7.r {
        g0() {
        }

        /* renamed from: e */
        public AtomicInteger b(p7.a aVar) {
            try {
                return new AtomicInteger(aVar.Z());
            } catch (NumberFormatException e10) {
                throw new i7.m((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, AtomicInteger atomicInteger) {
            cVar.D0((long) atomicInteger.get());
        }
    }

    class h extends i7.r {
        h() {
        }

        /* renamed from: e */
        public BigInteger b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            String B0 = aVar.B0();
            try {
                return new BigInteger(B0);
            } catch (NumberFormatException e10) {
                throw new i7.m("Failed parsing '" + B0 + "' as BigInteger; at path " + aVar.y(), e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, BigInteger bigInteger) {
            cVar.F0(bigInteger);
        }
    }

    class h0 extends i7.r {
        h0() {
        }

        /* renamed from: e */
        public AtomicBoolean b(p7.a aVar) {
            return new AtomicBoolean(aVar.X());
        }

        /* renamed from: f */
        public void d(p7.c cVar, AtomicBoolean atomicBoolean) {
            cVar.H0(atomicBoolean.get());
        }
    }

    class i extends i7.r {
        i() {
        }

        /* renamed from: e */
        public k7.g b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return new k7.g(aVar.B0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, k7.g gVar) {
            cVar.F0(gVar);
        }
    }

    private static final class i0 extends i7.r {

        /* renamed from: a  reason: collision with root package name */
        private final Map f13399a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map f13400b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Map f13401c = new HashMap();

        class a implements PrivilegedAction {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f13402a;

            a(Class cls) {
                this.f13402a = cls;
            }

            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.f13402a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public i0(Class cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum enumR = (Enum) field.get((Object) null);
                    String name = enumR.name();
                    String str = enumR.toString();
                    j7.c cVar = (j7.c) field.getAnnotation(j7.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String put : cVar.alternate()) {
                            this.f13399a.put(put, enumR);
                        }
                    }
                    this.f13399a.put(name, enumR);
                    this.f13400b.put(str, enumR);
                    this.f13401c.put(enumR, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* renamed from: e */
        public Enum b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            String B0 = aVar.B0();
            Enum enumR = (Enum) this.f13399a.get(B0);
            return enumR == null ? (Enum) this.f13400b.get(B0) : enumR;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Enum enumR) {
            cVar.G0(enumR == null ? null : (String) this.f13401c.get(enumR));
        }
    }

    class j extends i7.r {
        j() {
        }

        /* renamed from: e */
        public StringBuilder b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return new StringBuilder(aVar.B0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, StringBuilder sb2) {
            cVar.G0(sb2 == null ? null : sb2.toString());
        }
    }

    class k extends i7.r {
        k() {
        }

        /* renamed from: e */
        public Class b(p7.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        /* renamed from: f */
        public void d(p7.c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    class l extends i7.r {
        l() {
        }

        /* renamed from: e */
        public StringBuffer b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return new StringBuffer(aVar.B0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, StringBuffer stringBuffer) {
            cVar.G0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: l7.m$m  reason: collision with other inner class name */
    class C0179m extends i7.r {
        C0179m() {
        }

        /* renamed from: e */
        public URL b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            String B0 = aVar.B0();
            if ("null".equals(B0)) {
                return null;
            }
            return new URL(B0);
        }

        /* renamed from: f */
        public void d(p7.c cVar, URL url) {
            cVar.G0(url == null ? null : url.toExternalForm());
        }
    }

    class n extends i7.r {
        n() {
        }

        /* renamed from: e */
        public URI b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            try {
                String B0 = aVar.B0();
                if ("null".equals(B0)) {
                    return null;
                }
                return new URI(B0);
            } catch (URISyntaxException e10) {
                throw new i7.h((Throwable) e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, URI uri) {
            cVar.G0(uri == null ? null : uri.toASCIIString());
        }
    }

    class o extends i7.r {
        o() {
        }

        /* renamed from: e */
        public InetAddress b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return InetAddress.getByName(aVar.B0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, InetAddress inetAddress) {
            cVar.G0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    class p extends i7.r {
        p() {
        }

        /* renamed from: e */
        public UUID b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            String B0 = aVar.B0();
            try {
                return UUID.fromString(B0);
            } catch (IllegalArgumentException e10) {
                throw new i7.m("Failed parsing '" + B0 + "' as UUID; at path " + aVar.y(), e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, UUID uuid) {
            cVar.G0(uuid == null ? null : uuid.toString());
        }
    }

    class q extends i7.r {
        q() {
        }

        /* renamed from: e */
        public Currency b(p7.a aVar) {
            String B0 = aVar.B0();
            try {
                return Currency.getInstance(B0);
            } catch (IllegalArgumentException e10) {
                throw new i7.m("Failed parsing '" + B0 + "' as Currency; at path " + aVar.y(), e10);
            }
        }

        /* renamed from: f */
        public void d(p7.c cVar, Currency currency) {
            cVar.G0(currency.getCurrencyCode());
        }
    }

    class r extends i7.r {
        r() {
        }

        /* renamed from: e */
        public Calendar b(p7.a aVar) {
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            aVar.e();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.D0() != p7.b.END_OBJECT) {
                String i02 = aVar.i0();
                int Z = aVar.Z();
                if ("year".equals(i02)) {
                    i10 = Z;
                } else if ("month".equals(i02)) {
                    i11 = Z;
                } else if ("dayOfMonth".equals(i02)) {
                    i12 = Z;
                } else if ("hourOfDay".equals(i02)) {
                    i13 = Z;
                } else if ("minute".equals(i02)) {
                    i14 = Z;
                } else if ("second".equals(i02)) {
                    i15 = Z;
                }
            }
            aVar.n();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        /* renamed from: f */
        public void d(p7.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.R();
                return;
            }
            cVar.g();
            cVar.E("year");
            cVar.D0((long) calendar.get(1));
            cVar.E("month");
            cVar.D0((long) calendar.get(2));
            cVar.E("dayOfMonth");
            cVar.D0((long) calendar.get(5));
            cVar.E("hourOfDay");
            cVar.D0((long) calendar.get(11));
            cVar.E("minute");
            cVar.D0((long) calendar.get(12));
            cVar.E("second");
            cVar.D0((long) calendar.get(13));
            cVar.n();
        }
    }

    class s extends i7.r {
        s() {
        }

        /* renamed from: e */
        public Locale b(p7.a aVar) {
            Locale locale;
            String str = null;
            if (aVar.D0() == p7.b.NULL) {
                aVar.s0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.B0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (stringTokenizer.hasMoreElements()) {
                str = stringTokenizer.nextToken();
            }
            if (nextToken2 == null && str == null) {
                return new Locale(nextToken);
            }
            if (str == null) {
                return locale;
            }
            locale = new Locale(nextToken, nextToken2, str);
            return locale;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Locale locale) {
            cVar.G0(locale == null ? null : locale.toString());
        }
    }

    class t extends i7.r {
        t() {
        }

        private i7.g f(p7.a aVar, p7.b bVar) {
            int i10 = a0.f13398a[bVar.ordinal()];
            if (i10 == 1) {
                return new i7.l((Number) new k7.g(aVar.B0()));
            }
            if (i10 == 2) {
                return new i7.l(aVar.B0());
            }
            if (i10 == 3) {
                return new i7.l(Boolean.valueOf(aVar.X()));
            }
            if (i10 == 6) {
                aVar.s0();
                return i7.i.f12547e;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        private i7.g g(p7.a aVar, p7.b bVar) {
            int i10 = a0.f13398a[bVar.ordinal()];
            if (i10 == 4) {
                aVar.c();
                return new i7.f();
            } else if (i10 != 5) {
                return null;
            } else {
                aVar.e();
                return new i7.j();
            }
        }

        /* renamed from: e */
        public i7.g b(p7.a aVar) {
            p7.b D0 = aVar.D0();
            i7.g g10 = g(aVar, D0);
            if (g10 == null) {
                return f(aVar, D0);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.B()) {
                    String i02 = g10 instanceof i7.j ? aVar.i0() : null;
                    p7.b D02 = aVar.D0();
                    i7.g g11 = g(aVar, D02);
                    boolean z10 = g11 != null;
                    if (g11 == null) {
                        g11 = f(aVar, D02);
                    }
                    if (g10 instanceof i7.f) {
                        ((i7.f) g10).B(g11);
                    } else {
                        ((i7.j) g10).B(i02, g11);
                    }
                    if (z10) {
                        arrayDeque.addLast(g10);
                        g10 = g11;
                    }
                } else {
                    if (g10 instanceof i7.f) {
                        aVar.l();
                    } else {
                        aVar.n();
                    }
                    if (arrayDeque.isEmpty()) {
                        return g10;
                    }
                    g10 = (i7.g) arrayDeque.removeLast();
                }
            }
        }

        /* renamed from: h */
        public void d(p7.c cVar, i7.g gVar) {
            if (gVar == null || gVar.s()) {
                cVar.R();
            } else if (gVar.y()) {
                i7.l o10 = gVar.o();
                if (o10.Y()) {
                    cVar.F0(o10.E());
                } else if (o10.H()) {
                    cVar.H0(o10.B());
                } else {
                    cVar.G0(o10.F());
                }
            } else if (gVar.r()) {
                cVar.f();
                Iterator it = gVar.l().iterator();
                while (it.hasNext()) {
                    d(cVar, (i7.g) it.next());
                }
                cVar.l();
            } else if (gVar.v()) {
                cVar.g();
                for (Map.Entry entry : gVar.n().F()) {
                    cVar.E((String) entry.getKey());
                    d(cVar, (i7.g) entry.getValue());
                }
                cVar.n();
            } else {
                throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
            }
        }
    }

    class u implements i7.s {
        u() {
        }

        public i7.r a(i7.d dVar, TypeToken typeToken) {
            Class<? super Enum> rawType = typeToken.getRawType();
            Class<Enum> cls = Enum.class;
            if (!cls.isAssignableFrom(rawType) || rawType == cls) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new i0(rawType);
        }
    }

    class v extends i7.r {
        v() {
        }

        /* renamed from: e */
        public BitSet b(p7.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.c();
            p7.b D0 = aVar.D0();
            int i10 = 0;
            while (D0 != p7.b.END_ARRAY) {
                int i11 = a0.f13398a[D0.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    int Z = aVar.Z();
                    if (Z == 0) {
                        continue;
                        i10++;
                        D0 = aVar.D0();
                    } else if (Z != 1) {
                        throw new i7.m("Invalid bitset value " + Z + ", expected 0 or 1; at path " + aVar.y());
                    }
                } else if (i11 != 3) {
                    throw new i7.m("Invalid bitset value type: " + D0 + "; at path " + aVar.b());
                } else if (!aVar.X()) {
                    i10++;
                    D0 = aVar.D0();
                }
                bitSet.set(i10);
                i10++;
                D0 = aVar.D0();
            }
            aVar.l();
            return bitSet;
        }

        /* renamed from: f */
        public void d(p7.c cVar, BitSet bitSet) {
            cVar.f();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.D0(bitSet.get(i10) ? 1 : 0);
            }
            cVar.l();
        }
    }

    class w implements i7.s {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f13404e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i7.r f13405f;

        w(Class cls, i7.r rVar) {
            this.f13404e = cls;
            this.f13405f = rVar;
        }

        public i7.r a(i7.d dVar, TypeToken typeToken) {
            if (typeToken.getRawType() == this.f13404e) {
                return this.f13405f;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f13404e.getName() + ",adapter=" + this.f13405f + "]";
        }
    }

    class x implements i7.s {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f13406e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Class f13407f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i7.r f13408g;

        x(Class cls, Class cls2, i7.r rVar) {
            this.f13406e = cls;
            this.f13407f = cls2;
            this.f13408g = rVar;
        }

        public i7.r a(i7.d dVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f13406e || rawType == this.f13407f) {
                return this.f13408g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f13407f.getName() + "+" + this.f13406e.getName() + ",adapter=" + this.f13408g + "]";
        }
    }

    class y implements i7.s {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f13409e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Class f13410f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i7.r f13411g;

        y(Class cls, Class cls2, i7.r rVar) {
            this.f13409e = cls;
            this.f13410f = cls2;
            this.f13411g = rVar;
        }

        public i7.r a(i7.d dVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.f13409e || rawType == this.f13410f) {
                return this.f13411g;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f13409e.getName() + "+" + this.f13410f.getName() + ",adapter=" + this.f13411g + "]";
        }
    }

    class z implements i7.s {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Class f13412e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i7.r f13413f;

        class a extends i7.r {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Class f13414a;

            a(Class cls) {
                this.f13414a = cls;
            }

            public Object b(p7.a aVar) {
                Object b10 = z.this.f13413f.b(aVar);
                if (b10 == null || this.f13414a.isInstance(b10)) {
                    return b10;
                }
                throw new i7.m("Expected a " + this.f13414a.getName() + " but was " + b10.getClass().getName() + "; at path " + aVar.y());
            }

            public void d(p7.c cVar, Object obj) {
                z.this.f13413f.d(cVar, obj);
            }
        }

        z(Class cls, i7.r rVar) {
            this.f13412e = cls;
            this.f13413f = rVar;
        }

        public i7.r a(i7.d dVar, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (!this.f13412e.isAssignableFrom(rawType)) {
                return null;
            }
            return new a(rawType);
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f13412e.getName() + ",adapter=" + this.f13413f + "]";
        }
    }

    static {
        i7.r a10 = new k().a();
        f13372a = a10;
        f13373b = a(Class.class, a10);
        i7.r a11 = new v().a();
        f13374c = a11;
        f13375d = a(BitSet.class, a11);
        b0 b0Var = new b0();
        f13376e = b0Var;
        f13378g = b(Boolean.TYPE, Boolean.class, b0Var);
        d0 d0Var = new d0();
        f13379h = d0Var;
        f13380i = b(Byte.TYPE, Byte.class, d0Var);
        e0 e0Var = new e0();
        f13381j = e0Var;
        f13382k = b(Short.TYPE, Short.class, e0Var);
        f0 f0Var = new f0();
        f13383l = f0Var;
        f13384m = b(Integer.TYPE, Integer.class, f0Var);
        i7.r a12 = new g0().a();
        f13385n = a12;
        f13386o = a(AtomicInteger.class, a12);
        i7.r a13 = new h0().a();
        f13387p = a13;
        f13388q = a(AtomicBoolean.class, a13);
        i7.r a14 = new a().a();
        f13389r = a14;
        f13390s = a(AtomicIntegerArray.class, a14);
        e eVar = new e();
        f13394w = eVar;
        f13395x = b(Character.TYPE, Character.class, eVar);
        f fVar = new f();
        f13396y = fVar;
        C = a(String.class, fVar);
        j jVar = new j();
        D = jVar;
        E = a(StringBuilder.class, jVar);
        l lVar = new l();
        F = lVar;
        G = a(StringBuffer.class, lVar);
        C0179m mVar = new C0179m();
        H = mVar;
        I = a(URL.class, mVar);
        n nVar = new n();
        J = nVar;
        K = a(URI.class, nVar);
        o oVar = new o();
        L = oVar;
        M = d(InetAddress.class, oVar);
        p pVar = new p();
        N = pVar;
        O = a(UUID.class, pVar);
        i7.r a15 = new q().a();
        P = a15;
        Q = a(Currency.class, a15);
        r rVar = new r();
        R = rVar;
        S = c(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        T = sVar;
        U = a(Locale.class, sVar);
        t tVar = new t();
        V = tVar;
        W = d(i7.g.class, tVar);
    }

    public static i7.s a(Class cls, i7.r rVar) {
        return new w(cls, rVar);
    }

    public static i7.s b(Class cls, Class cls2, i7.r rVar) {
        return new x(cls, cls2, rVar);
    }

    public static i7.s c(Class cls, Class cls2, i7.r rVar) {
        return new y(cls, cls2, rVar);
    }

    public static i7.s d(Class cls, i7.r rVar) {
        return new z(cls, rVar);
    }
}
