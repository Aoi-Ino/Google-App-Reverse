package i7;

import com.google.gson.reflect.TypeToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import k7.g;
import l7.h;
import l7.i;
import l7.j;
import l7.k;
import l7.m;

public final class d {
    static final c A = b.IDENTITY;
    static final q B = p.DOUBLE;
    static final q C = p.LAZILY_PARSED_NUMBER;

    /* renamed from: z  reason: collision with root package name */
    static final String f12495z = null;

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal f12496a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap f12497b;

    /* renamed from: c  reason: collision with root package name */
    private final k7.c f12498c;

    /* renamed from: d  reason: collision with root package name */
    private final l7.e f12499d;

    /* renamed from: e  reason: collision with root package name */
    final List f12500e;

    /* renamed from: f  reason: collision with root package name */
    final k7.d f12501f;

    /* renamed from: g  reason: collision with root package name */
    final c f12502g;

    /* renamed from: h  reason: collision with root package name */
    final Map f12503h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f12504i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f12505j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f12506k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f12507l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f12508m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f12509n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f12510o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f12511p;

    /* renamed from: q  reason: collision with root package name */
    final String f12512q;

    /* renamed from: r  reason: collision with root package name */
    final int f12513r;

    /* renamed from: s  reason: collision with root package name */
    final int f12514s;

    /* renamed from: t  reason: collision with root package name */
    final n f12515t;

    /* renamed from: u  reason: collision with root package name */
    final List f12516u;

    /* renamed from: v  reason: collision with root package name */
    final List f12517v;

    /* renamed from: w  reason: collision with root package name */
    final q f12518w;

    /* renamed from: x  reason: collision with root package name */
    final q f12519x;

    /* renamed from: y  reason: collision with root package name */
    final List f12520y;

    class a extends r {
        a() {
        }

        /* renamed from: e */
        public Double b(p7.a aVar) {
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
                return;
            }
            double doubleValue = number.doubleValue();
            d.d(doubleValue);
            cVar.C0(doubleValue);
        }
    }

    class b extends r {
        b() {
        }

        /* renamed from: e */
        public Float b(p7.a aVar) {
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
            float floatValue = number.floatValue();
            d.d((double) floatValue);
            if (!(number instanceof Float)) {
                number = Float.valueOf(floatValue);
            }
            cVar.F0(number);
        }
    }

    class c extends r {
        c() {
        }

        /* renamed from: e */
        public Number b(p7.a aVar) {
            if (aVar.D0() != p7.b.NULL) {
                return Long.valueOf(aVar.c0());
            }
            aVar.s0();
            return null;
        }

        /* renamed from: f */
        public void d(p7.c cVar, Number number) {
            if (number == null) {
                cVar.R();
            } else {
                cVar.G0(number.toString());
            }
        }
    }

    /* renamed from: i7.d$d  reason: collision with other inner class name */
    class C0162d extends r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f12523a;

        C0162d(r rVar) {
            this.f12523a = rVar;
        }

        /* renamed from: e */
        public AtomicLong b(p7.a aVar) {
            return new AtomicLong(((Number) this.f12523a.b(aVar)).longValue());
        }

        /* renamed from: f */
        public void d(p7.c cVar, AtomicLong atomicLong) {
            this.f12523a.d(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    class e extends r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f12524a;

        e(r rVar) {
            this.f12524a = rVar;
        }

        /* renamed from: e */
        public AtomicLongArray b(p7.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.c();
            while (aVar.B()) {
                arrayList.add(Long.valueOf(((Number) this.f12524a.b(aVar)).longValue()));
            }
            aVar.l();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: f */
        public void d(p7.c cVar, AtomicLongArray atomicLongArray) {
            cVar.f();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f12524a.d(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.l();
        }
    }

    static class f extends k {

        /* renamed from: a  reason: collision with root package name */
        private r f12525a;

        f() {
        }

        private r f() {
            r rVar = this.f12525a;
            if (rVar != null) {
                return rVar;
            }
            throw new IllegalStateException("Delegate has not been set yet");
        }

        public Object b(p7.a aVar) {
            return f().b(aVar);
        }

        public void d(p7.c cVar, Object obj) {
            f().d(cVar, obj);
        }

        public r e() {
            return f();
        }

        public void g(r rVar) {
            if (this.f12525a == null) {
                this.f12525a = rVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public d() {
        this(k7.d.f13041k, A, Collections.emptyMap(), false, false, false, true, false, false, false, true, n.DEFAULT, f12495z, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), B, C, Collections.emptyList());
    }

    private static void a(Object obj, p7.a aVar) {
        if (obj != null) {
            try {
                if (aVar.D0() != p7.b.END_DOCUMENT) {
                    throw new m("JSON document was not fully consumed.");
                }
            } catch (p7.d e10) {
                throw new m((Throwable) e10);
            } catch (IOException e11) {
                throw new h((Throwable) e11);
            }
        }
    }

    private static r b(r rVar) {
        return new C0162d(rVar).a();
    }

    private static r c(r rVar) {
        return new e(rVar).a();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private r e(boolean z10) {
        return z10 ? m.f13393v : new a();
    }

    private r f(boolean z10) {
        return z10 ? m.f13392u : new b();
    }

    private static r p(n nVar) {
        return nVar == n.DEFAULT ? m.f13391t : new c();
    }

    public g A(Object obj, Type type) {
        l7.f fVar = new l7.f();
        y(obj, type, fVar);
        return fVar.J0();
    }

    public Object g(Reader reader, TypeToken typeToken) {
        p7.a q10 = q(reader);
        Object l10 = l(q10, typeToken);
        a(l10, q10);
        return l10;
    }

    public Object h(Reader reader, Type type) {
        return g(reader, TypeToken.get(type));
    }

    public Object i(String str, TypeToken typeToken) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), typeToken);
    }

    public Object j(String str, Class cls) {
        return k7.k.b(cls).cast(i(str, TypeToken.get(cls)));
    }

    public Object k(String str, Type type) {
        return i(str, TypeToken.get(type));
    }

    public Object l(p7.a aVar, TypeToken typeToken) {
        boolean E = aVar.E();
        aVar.I0(true);
        try {
            aVar.D0();
            Object b10 = m(typeToken).b(aVar);
            aVar.I0(E);
            return b10;
        } catch (EOFException e10) {
            if (1 != 0) {
                aVar.I0(E);
                return null;
            }
            throw new m((Throwable) e10);
        } catch (IllegalStateException e11) {
            throw new m((Throwable) e11);
        } catch (IOException e12) {
            throw new m((Throwable) e12);
        } catch (AssertionError e13) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e13.getMessage());
            assertionError.initCause(e13);
            throw assertionError;
        } catch (Throwable th2) {
            aVar.I0(E);
            throw th2;
        }
    }

    public r m(TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        r rVar = (r) this.f12497b.get(typeToken);
        if (rVar != null) {
            return rVar;
        }
        Map map = (Map) this.f12496a.get();
        if (map == null) {
            map = new HashMap();
            this.f12496a.set(map);
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = (f) map.get(typeToken);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map.put(typeToken, fVar2);
            for (s a10 : this.f12500e) {
                r a11 = a10.a(this, typeToken);
                if (a11 != null) {
                    r rVar2 = (r) this.f12497b.putIfAbsent(typeToken, a11);
                    if (rVar2 != null) {
                        a11 = rVar2;
                    }
                    fVar2.g(a11);
                    return a11;
                }
            }
            throw new IllegalArgumentException("GSON (2.10) cannot handle " + typeToken);
        } finally {
            map.remove(typeToken);
            if (z10) {
                this.f12496a.remove();
            }
        }
    }

    public r n(Class cls) {
        return m(TypeToken.get(cls));
    }

    public r o(s sVar, TypeToken typeToken) {
        if (!this.f12500e.contains(sVar)) {
            sVar = this.f12499d;
        }
        boolean z10 = false;
        for (s sVar2 : this.f12500e) {
            if (z10) {
                r a10 = sVar2.a(this, typeToken);
                if (a10 != null) {
                    return a10;
                }
            } else if (sVar2 == sVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public p7.a q(Reader reader) {
        p7.a aVar = new p7.a(reader);
        aVar.I0(this.f12509n);
        return aVar;
    }

    public p7.c r(Writer writer) {
        if (this.f12506k) {
            writer.write(")]}'\n");
        }
        p7.c cVar = new p7.c(writer);
        if (this.f12508m) {
            cVar.j0("  ");
        }
        cVar.i0(this.f12507l);
        cVar.s0(this.f12509n);
        cVar.A0(this.f12504i);
        return cVar;
    }

    public String s(g gVar) {
        StringWriter stringWriter = new StringWriter();
        v(gVar, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object obj) {
        return obj == null ? s(i.f12547e) : u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.f12504i + ",factories:" + this.f12500e + ",instanceCreators:" + this.f12498c + "}";
    }

    public String u(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        x(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void v(g gVar, Appendable appendable) {
        try {
            w(gVar, r(k7.m.b(appendable)));
        } catch (IOException e10) {
            throw new h((Throwable) e10);
        }
    }

    public void w(g gVar, p7.c cVar) {
        boolean y10 = cVar.y();
        cVar.s0(true);
        boolean s10 = cVar.s();
        cVar.i0(this.f12507l);
        boolean o10 = cVar.o();
        cVar.A0(this.f12504i);
        try {
            k7.m.a(gVar, cVar);
            cVar.s0(y10);
            cVar.i0(s10);
            cVar.A0(o10);
        } catch (IOException e10) {
            throw new h((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th2) {
            cVar.s0(y10);
            cVar.i0(s10);
            cVar.A0(o10);
            throw th2;
        }
    }

    public void x(Object obj, Type type, Appendable appendable) {
        try {
            y(obj, type, r(k7.m.b(appendable)));
        } catch (IOException e10) {
            throw new h((Throwable) e10);
        }
    }

    public void y(Object obj, Type type, p7.c cVar) {
        r m10 = m(TypeToken.get(type));
        boolean y10 = cVar.y();
        cVar.s0(true);
        boolean s10 = cVar.s();
        cVar.i0(this.f12507l);
        boolean o10 = cVar.o();
        cVar.A0(this.f12504i);
        try {
            m10.d(cVar, obj);
            cVar.s0(y10);
            cVar.i0(s10);
            cVar.A0(o10);
        } catch (IOException e10) {
            throw new h((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th2) {
            cVar.s0(y10);
            cVar.i0(s10);
            cVar.A0(o10);
            throw th2;
        }
    }

    public g z(Object obj) {
        return obj == null ? i.f12547e : A(obj, obj.getClass());
    }

    d(k7.d dVar, c cVar, Map map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, n nVar, String str, int i10, int i11, List list, List list2, List list3, q qVar, q qVar2, List list4) {
        Map map2 = map;
        boolean z18 = z11;
        boolean z19 = z16;
        boolean z20 = z17;
        List list5 = list4;
        this.f12496a = new ThreadLocal();
        this.f12497b = new ConcurrentHashMap();
        this.f12501f = dVar;
        this.f12502g = cVar;
        this.f12503h = map2;
        k7.c cVar2 = new k7.c(map2, z20, list5);
        this.f12498c = cVar2;
        this.f12504i = z10;
        this.f12505j = z18;
        this.f12506k = z12;
        this.f12507l = z13;
        this.f12508m = z14;
        this.f12509n = z15;
        this.f12510o = z19;
        this.f12511p = z20;
        this.f12515t = nVar;
        this.f12512q = str;
        this.f12513r = i10;
        this.f12514s = i11;
        this.f12516u = list;
        this.f12517v = list2;
        this.f12518w = qVar;
        this.f12519x = qVar2;
        this.f12520y = list5;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m.W);
        arrayList.add(i.e(qVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(m.C);
        arrayList.add(m.f13384m);
        arrayList.add(m.f13378g);
        arrayList.add(m.f13380i);
        arrayList.add(m.f13382k);
        r p10 = p(nVar);
        arrayList.add(m.b(Long.TYPE, Long.class, p10));
        arrayList.add(m.b(Double.TYPE, Double.class, e(z19)));
        arrayList.add(m.b(Float.TYPE, Float.class, f(z19)));
        arrayList.add(h.e(qVar2));
        arrayList.add(m.f13386o);
        arrayList.add(m.f13388q);
        arrayList.add(m.a(AtomicLong.class, b(p10)));
        arrayList.add(m.a(AtomicLongArray.class, c(p10)));
        arrayList.add(m.f13390s);
        arrayList.add(m.f13395x);
        arrayList.add(m.E);
        arrayList.add(m.G);
        arrayList.add(m.a(BigDecimal.class, m.f13397z));
        arrayList.add(m.a(BigInteger.class, m.A));
        arrayList.add(m.a(g.class, m.B));
        arrayList.add(m.I);
        arrayList.add(m.K);
        arrayList.add(m.O);
        arrayList.add(m.Q);
        arrayList.add(m.U);
        arrayList.add(m.M);
        arrayList.add(m.f13375d);
        arrayList.add(l7.c.f13317b);
        arrayList.add(m.S);
        if (o7.d.f14452a) {
            arrayList.add(o7.d.f14456e);
            arrayList.add(o7.d.f14455d);
            arrayList.add(o7.d.f14457f);
        }
        arrayList.add(l7.a.f13311c);
        arrayList.add(m.f13373b);
        arrayList.add(new l7.b(cVar2));
        arrayList.add(new l7.g(cVar2, z18));
        l7.e eVar = new l7.e(cVar2);
        this.f12499d = eVar;
        arrayList.add(eVar);
        arrayList.add(m.X);
        arrayList.add(new j(cVar2, cVar, dVar, eVar, list4));
        this.f12500e = Collections.unmodifiableList(arrayList);
    }
}
