package u7;

public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f16940d = new b(new int[]{0, 0, 0}, 0, "TERMINATOR");

    /* renamed from: e  reason: collision with root package name */
    public static final b f16941e = new b(new int[]{10, 12, 14}, 1, "NUMERIC");

    /* renamed from: f  reason: collision with root package name */
    public static final b f16942f = new b(new int[]{9, 11, 13}, 2, "ALPHANUMERIC");

    /* renamed from: g  reason: collision with root package name */
    public static final b f16943g = new b(new int[]{0, 0, 0}, 3, "STRUCTURED_APPEND");

    /* renamed from: h  reason: collision with root package name */
    public static final b f16944h = new b(new int[]{8, 16, 16}, 4, "BYTE");

    /* renamed from: i  reason: collision with root package name */
    public static final b f16945i = new b((int[]) null, 7, "ECI");

    /* renamed from: j  reason: collision with root package name */
    public static final b f16946j = new b(new int[]{8, 10, 12}, 8, "KANJI");

    /* renamed from: k  reason: collision with root package name */
    public static final b f16947k = new b((int[]) null, 5, "FNC1_FIRST_POSITION");

    /* renamed from: l  reason: collision with root package name */
    public static final b f16948l = new b((int[]) null, 9, "FNC1_SECOND_POSITION");

    /* renamed from: a  reason: collision with root package name */
    private final int[] f16949a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16950b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16951c;

    private b(int[] iArr, int i10, String str) {
        this.f16949a = iArr;
        this.f16950b = i10;
        this.f16951c = str;
    }

    public int a() {
        return this.f16950b;
    }

    public int b(d dVar) {
        if (this.f16949a != null) {
            int f10 = dVar.f();
            return this.f16949a[f10 <= 9 ? 0 : f10 <= 26 ? (char) 1 : 2];
        }
        throw new IllegalArgumentException("Character count doesn't apply to this mode");
    }

    public String toString() {
        return this.f16951c;
    }
}
