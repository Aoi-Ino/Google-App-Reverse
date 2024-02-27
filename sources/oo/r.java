package oo;

import ap.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qn.u;
import tn.a;

public final class r {

    /* renamed from: e  reason: collision with root package name */
    private static final Map f30285e;

    /* renamed from: a  reason: collision with root package name */
    private final w f30286a;

    /* renamed from: b  reason: collision with root package name */
    private final x f30287b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30288c;

    /* renamed from: d  reason: collision with root package name */
    private final int f30289d;

    static {
        HashMap hashMap = new HashMap();
        Integer a10 = d.a(1);
        u uVar = a.f31688c;
        hashMap.put(a10, new r(20, 2, uVar));
        hashMap.put(d.a(2), new r(20, 4, uVar));
        hashMap.put(d.a(3), new r(40, 2, uVar));
        hashMap.put(d.a(4), new r(40, 4, uVar));
        hashMap.put(d.a(5), new r(40, 8, uVar));
        hashMap.put(d.a(6), new r(60, 3, uVar));
        hashMap.put(d.a(7), new r(60, 6, uVar));
        hashMap.put(d.a(8), new r(60, 12, uVar));
        Integer a11 = d.a(9);
        u uVar2 = a.f31692e;
        hashMap.put(a11, new r(20, 2, uVar2));
        hashMap.put(d.a(10), new r(20, 4, uVar2));
        hashMap.put(d.a(11), new r(40, 2, uVar2));
        hashMap.put(d.a(12), new r(40, 4, uVar2));
        hashMap.put(d.a(13), new r(40, 8, uVar2));
        hashMap.put(d.a(14), new r(60, 3, uVar2));
        hashMap.put(d.a(15), new r(60, 6, uVar2));
        hashMap.put(d.a(16), new r(60, 12, uVar2));
        Integer a12 = d.a(17);
        u uVar3 = a.f31708m;
        hashMap.put(a12, new r(20, 2, uVar3));
        hashMap.put(d.a(18), new r(20, 4, uVar3));
        hashMap.put(d.a(19), new r(40, 2, uVar3));
        hashMap.put(d.a(20), new r(40, 4, uVar3));
        hashMap.put(d.a(21), new r(40, 8, uVar3));
        hashMap.put(d.a(22), new r(60, 3, uVar3));
        hashMap.put(d.a(23), new r(60, 6, uVar3));
        hashMap.put(d.a(24), new r(60, 12, uVar3));
        Integer a13 = d.a(25);
        u uVar4 = a.f31710n;
        hashMap.put(a13, new r(20, 2, uVar4));
        hashMap.put(d.a(26), new r(20, 4, uVar4));
        hashMap.put(d.a(27), new r(40, 2, uVar4));
        hashMap.put(d.a(28), new r(40, 4, uVar4));
        hashMap.put(d.a(29), new r(40, 8, uVar4));
        hashMap.put(d.a(30), new r(60, 3, uVar4));
        hashMap.put(d.a(31), new r(60, 6, uVar4));
        hashMap.put(d.a(32), new r(60, 12, uVar4));
        f30285e = Collections.unmodifiableMap(hashMap);
    }

    public r(int i10, int i11, u uVar) {
        this.f30288c = i10;
        this.f30289d = i11;
        this.f30287b = new x(j(i10, i11), uVar);
        this.f30286a = d.c(e(), f(), g(), c(), a(), i11);
    }

    public static r i(int i10) {
        return (r) f30285e.get(d.a(i10));
    }

    private static int j(int i10, int i11) {
        if (i10 < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i10 % i11 == 0) {
            int i12 = i10 / i11;
            if (i12 != 1) {
                return i12;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }

    public int a() {
        return this.f30288c;
    }

    public int b() {
        return this.f30289d;
    }

    /* access modifiers changed from: protected */
    public int c() {
        return this.f30287b.d();
    }

    /* access modifiers changed from: protected */
    public w d() {
        return this.f30286a;
    }

    /* access modifiers changed from: protected */
    public String e() {
        return this.f30287b.f();
    }

    public int f() {
        return this.f30287b.h();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f30287b.j();
    }

    /* access modifiers changed from: protected */
    public x h() {
        return this.f30287b;
    }

    public r(int i10, int i11, xn.a aVar) {
        this(i10, i11, f.c(aVar.b()));
    }
}
