package go;

import java.util.HashMap;
import java.util.Map;
import qn.u;

public class k {

    /* renamed from: e  reason: collision with root package name */
    public static final k f24046e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f24047f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f24048g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f24049h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f24050i;

    /* renamed from: j  reason: collision with root package name */
    private static Map f24051j = new a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f24052a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24053b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24054c;

    /* renamed from: d  reason: collision with root package name */
    private final u f24055d;

    static class a extends HashMap {
        a() {
            k kVar = k.f24046e;
            put(Integer.valueOf(kVar.f24052a), kVar);
            k kVar2 = k.f24047f;
            put(Integer.valueOf(kVar2.f24052a), kVar2);
            k kVar3 = k.f24048g;
            put(Integer.valueOf(kVar3.f24052a), kVar3);
            k kVar4 = k.f24049h;
            put(Integer.valueOf(kVar4.f24052a), kVar4);
            k kVar5 = k.f24050i;
            put(Integer.valueOf(kVar5.f24052a), kVar5);
        }
    }

    static {
        u uVar = tn.a.f31688c;
        f24046e = new k(5, 32, 5, uVar);
        f24047f = new k(6, 32, 10, uVar);
        f24048g = new k(7, 32, 15, uVar);
        f24049h = new k(8, 32, 20, uVar);
        f24050i = new k(9, 32, 25, uVar);
    }

    protected k(int i10, int i11, int i12, u uVar) {
        this.f24052a = i10;
        this.f24053b = i11;
        this.f24054c = i12;
        this.f24055d = uVar;
    }

    static k e(int i10) {
        return (k) f24051j.get(Integer.valueOf(i10));
    }

    public u b() {
        return this.f24055d;
    }

    public int c() {
        return this.f24054c;
    }

    public int d() {
        return this.f24053b;
    }

    public int f() {
        return this.f24052a;
    }
}
