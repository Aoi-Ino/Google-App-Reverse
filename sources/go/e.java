package go;

import java.util.HashMap;
import java.util.Map;
import qn.u;

public class e {

    /* renamed from: h  reason: collision with root package name */
    public static final e f24010h;

    /* renamed from: i  reason: collision with root package name */
    public static final e f24011i;

    /* renamed from: j  reason: collision with root package name */
    public static final e f24012j;

    /* renamed from: k  reason: collision with root package name */
    public static final e f24013k;

    /* renamed from: l  reason: collision with root package name */
    private static final Map f24014l = new a();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f24015a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24016b;

    /* renamed from: c  reason: collision with root package name */
    private final int f24017c;

    /* renamed from: d  reason: collision with root package name */
    private final int f24018d;

    /* renamed from: e  reason: collision with root package name */
    private final int f24019e;

    /* renamed from: f  reason: collision with root package name */
    private final int f24020f;

    /* renamed from: g  reason: collision with root package name */
    private final u f24021g;

    static class a extends HashMap {
        a() {
            e eVar = e.f24010h;
            put(Integer.valueOf(eVar.f24015a), eVar);
            e eVar2 = e.f24011i;
            put(Integer.valueOf(eVar2.f24015a), eVar2);
            e eVar3 = e.f24012j;
            put(Integer.valueOf(eVar3.f24015a), eVar3);
            e eVar4 = e.f24013k;
            put(Integer.valueOf(eVar4.f24015a), eVar4);
        }
    }

    static {
        u uVar = tn.a.f31688c;
        f24010h = new e(1, 32, 1, 265, 7, 8516, uVar);
        u uVar2 = uVar;
        f24011i = new e(2, 32, 2, 133, 6, 4292, uVar2);
        f24012j = new e(3, 32, 4, 67, 4, 2180, uVar2);
        f24013k = new e(4, 32, 8, 34, 0, 1124, uVar2);
    }

    protected e(int i10, int i11, int i12, int i13, int i14, int i15, u uVar) {
        this.f24015a = i10;
        this.f24016b = i11;
        this.f24017c = i12;
        this.f24018d = i13;
        this.f24019e = i14;
        this.f24020f = i15;
        this.f24021g = uVar;
    }

    public static e e(int i10) {
        return (e) f24014l.get(Integer.valueOf(i10));
    }

    public u b() {
        return this.f24021g;
    }

    public int c() {
        return this.f24016b;
    }

    public int d() {
        return this.f24018d;
    }

    public int f() {
        return this.f24015a;
    }

    public int g() {
        return this.f24017c;
    }
}
