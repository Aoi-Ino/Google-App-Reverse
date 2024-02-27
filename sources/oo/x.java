package oo;

import ap.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qn.u;
import tn.a;

public final class x {

    /* renamed from: i  reason: collision with root package name */
    private static final Map f30317i;

    /* renamed from: a  reason: collision with root package name */
    private final w f30318a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30319b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30320c;

    /* renamed from: d  reason: collision with root package name */
    private final u f30321d;

    /* renamed from: e  reason: collision with root package name */
    private final int f30322e;

    /* renamed from: f  reason: collision with root package name */
    private final String f30323f;

    /* renamed from: g  reason: collision with root package name */
    private final int f30324g;

    /* renamed from: h  reason: collision with root package name */
    private final m f30325h;

    static {
        HashMap hashMap = new HashMap();
        Integer a10 = d.a(1);
        u uVar = a.f31688c;
        hashMap.put(a10, new x(10, uVar));
        hashMap.put(d.a(2), new x(16, uVar));
        hashMap.put(d.a(3), new x(20, uVar));
        Integer a11 = d.a(4);
        u uVar2 = a.f31692e;
        hashMap.put(a11, new x(10, uVar2));
        hashMap.put(d.a(5), new x(16, uVar2));
        hashMap.put(d.a(6), new x(20, uVar2));
        Integer a12 = d.a(7);
        u uVar3 = a.f31708m;
        hashMap.put(a12, new x(10, uVar3));
        hashMap.put(d.a(8), new x(16, uVar3));
        hashMap.put(d.a(9), new x(20, uVar3));
        Integer a13 = d.a(10);
        u uVar4 = a.f31710n;
        hashMap.put(a13, new x(10, uVar4));
        hashMap.put(d.a(11), new x(16, uVar4));
        hashMap.put(d.a(12), new x(20, uVar4));
        f30317i = Collections.unmodifiableMap(hashMap);
    }

    public x(int i10, u uVar) {
        if (i10 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        } else if (uVar != null) {
            this.f30319b = i10;
            this.f30320c = a();
            String b10 = f.b(uVar);
            this.f30323f = b10;
            this.f30321d = uVar;
            m mVar = new m(uVar);
            this.f30325h = mVar;
            int c10 = mVar.c();
            this.f30324g = c10;
            int d10 = mVar.d();
            this.f30322e = d10;
            this.f30318a = e.c(b10, c10, d10, mVar.a(), i10);
        } else {
            throw new NullPointerException("digest == null");
        }
    }

    private int a() {
        int i10 = 2;
        while (true) {
            int i11 = this.f30319b;
            if (i10 > i11) {
                throw new IllegalStateException("should never happen...");
            } else if ((i11 - i10) % 2 == 0) {
                return i10;
            } else {
                i10++;
            }
        }
    }

    public static x k(int i10) {
        return (x) f30317i.get(d.a(i10));
    }

    public int b() {
        return this.f30319b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f30320c;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f30325h.a();
    }

    /* access modifiers changed from: package-private */
    public w e() {
        return this.f30318a;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.f30323f;
    }

    public u g() {
        return this.f30321d;
    }

    public int h() {
        return this.f30324g;
    }

    /* access modifiers changed from: package-private */
    public k i() {
        return new k(this.f30325h);
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f30322e;
    }

    public x(int i10, xn.a aVar) {
        this(i10, f.c(aVar.b()));
    }
}
