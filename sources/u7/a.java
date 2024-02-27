package u7;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f16932d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f16933e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f16934f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f16935g;

    /* renamed from: h  reason: collision with root package name */
    private static final a[] f16936h;

    /* renamed from: a  reason: collision with root package name */
    private final int f16937a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16938b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16939c;

    static {
        a aVar = new a(0, 1, "L");
        f16932d = aVar;
        a aVar2 = new a(1, 0, "M");
        f16933e = aVar2;
        a aVar3 = new a(2, 3, "Q");
        f16934f = aVar3;
        a aVar4 = new a(3, 2, "H");
        f16935g = aVar4;
        f16936h = new a[]{aVar2, aVar, aVar4, aVar3};
    }

    private a(int i10, int i11, String str) {
        this.f16937a = i10;
        this.f16938b = i11;
        this.f16939c = str;
    }

    public int a() {
        return this.f16938b;
    }

    public int b() {
        return this.f16937a;
    }

    public String toString() {
        return this.f16939c;
    }
}
