package no;

import ap.d;
import fo.h;
import java.util.HashMap;
import java.util.Map;
import qn.o1;
import qn.u;
import wn.a;
import yn.g;
import yn.j;
import yn.k;

abstract class e {

    /* renamed from: a  reason: collision with root package name */
    static final a f29972a;

    /* renamed from: b  reason: collision with root package name */
    static final a f29973b;

    /* renamed from: c  reason: collision with root package name */
    static final a f29974c = new a(tn.a.f31702j);

    /* renamed from: d  reason: collision with root package name */
    static final a f29975d = new a(tn.a.f31698h);

    /* renamed from: e  reason: collision with root package name */
    static final a f29976e = new a(tn.a.f31688c);

    /* renamed from: f  reason: collision with root package name */
    static final a f29977f = new a(tn.a.f31692e);

    /* renamed from: g  reason: collision with root package name */
    static final a f29978g = new a(tn.a.f31708m);

    /* renamed from: h  reason: collision with root package name */
    static final a f29979h = new a(tn.a.f31710n);

    /* renamed from: i  reason: collision with root package name */
    static final Map f29980i;

    static {
        u uVar = fo.e.X;
        f29972a = new a(uVar);
        u uVar2 = fo.e.Y;
        f29973b = new a(uVar2);
        HashMap hashMap = new HashMap();
        f29980i = hashMap;
        hashMap.put(uVar, d.a(5));
        hashMap.put(uVar2, d.a(6));
    }

    public static a a(String str) {
        if (str.equals("SHA-1")) {
            return new a(un.a.f32237i, o1.f30967f);
        }
        if (str.equals("SHA-224")) {
            return new a(tn.a.f31694f);
        }
        if (str.equals("SHA-256")) {
            return new a(tn.a.f31688c);
        }
        if (str.equals("SHA-384")) {
            return new a(tn.a.f31690d);
        }
        if (str.equals("SHA-512")) {
            return new a(tn.a.f31692e);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + str);
    }

    static xn.a b(u uVar) {
        if (uVar.Y(tn.a.f31688c)) {
            return new g();
        }
        if (uVar.Y(tn.a.f31692e)) {
            return new j();
        }
        if (uVar.Y(tn.a.f31708m)) {
            return new k(128);
        }
        if (uVar.Y(tn.a.f31710n)) {
            return new k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + uVar);
    }

    public static String c(u uVar) {
        if (uVar.Y(un.a.f32237i)) {
            return "SHA-1";
        }
        if (uVar.Y(tn.a.f31694f)) {
            return "SHA-224";
        }
        if (uVar.Y(tn.a.f31688c)) {
            return "SHA-256";
        }
        if (uVar.Y(tn.a.f31690d)) {
            return "SHA-384";
        }
        if (uVar.Y(tn.a.f31692e)) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: " + uVar);
    }

    static a d(int i10) {
        if (i10 == 5) {
            return f29972a;
        }
        if (i10 == 6) {
            return f29973b;
        }
        throw new IllegalArgumentException("unknown security category: " + i10);
    }

    static int e(a aVar) {
        return ((Integer) f29980i.get(aVar.y())).intValue();
    }

    static a f(String str) {
        if (str.equals("SHA3-256")) {
            return f29974c;
        }
        if (str.equals("SHA-512/256")) {
            return f29975d;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }

    static String g(h hVar) {
        a B = hVar.B();
        if (B.y().Y(f29974c.y())) {
            return "SHA3-256";
        }
        if (B.y().Y(f29975d.y())) {
            return "SHA-512/256";
        }
        throw new IllegalArgumentException("unknown tree digest: " + B.y());
    }

    static a h(String str) {
        if (str.equals("SHA-256")) {
            return f29976e;
        }
        if (str.equals("SHA-512")) {
            return f29977f;
        }
        if (str.equals("SHAKE128")) {
            return f29978g;
        }
        if (str.equals("SHAKE256")) {
            return f29979h;
        }
        throw new IllegalArgumentException("unknown tree digest: " + str);
    }
}
