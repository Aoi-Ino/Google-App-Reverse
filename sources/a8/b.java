package a8;

import b8.a;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f240b = new b(255, 255, 255);

    /* renamed from: c  reason: collision with root package name */
    public static final b f241c = new b(192, 192, 192);

    /* renamed from: d  reason: collision with root package name */
    public static final b f242d = new b(128, 128, 128);

    /* renamed from: e  reason: collision with root package name */
    public static final b f243e = new b(64, 64, 64);

    /* renamed from: f  reason: collision with root package name */
    public static final b f244f = new b(0, 0, 0);

    /* renamed from: g  reason: collision with root package name */
    public static final b f245g = new b(255, 0, 0);

    /* renamed from: h  reason: collision with root package name */
    public static final b f246h = new b(255, 175, 175);

    /* renamed from: i  reason: collision with root package name */
    public static final b f247i = new b(255, 200, 0);

    /* renamed from: j  reason: collision with root package name */
    public static final b f248j = new b(255, 255, 0);

    /* renamed from: k  reason: collision with root package name */
    public static final b f249k = new b(0, 255, 0);

    /* renamed from: l  reason: collision with root package name */
    public static final b f250l = new b(255, 0, 255);

    /* renamed from: m  reason: collision with root package name */
    public static final b f251m = new b(0, 255, 255);

    /* renamed from: n  reason: collision with root package name */
    public static final b f252n = new b(0, 0, 255);

    /* renamed from: a  reason: collision with root package name */
    private int f253a;

    public b(float f10, float f11, float f12) {
        this(f10, f11, f12, 1.0f);
    }

    private static void e(int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException(a.b("color.value.outside.range.0.255", new Object[0]));
        }
    }

    public int a() {
        return c() & 255;
    }

    public int b() {
        return (c() >> 8) & 255;
    }

    public int c() {
        return this.f253a;
    }

    public int d() {
        return (c() >> 16) & 255;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f253a == this.f253a;
    }

    public int hashCode() {
        return this.f253a;
    }

    public b(float f10, float f11, float f12, float f13) {
        this((int) (((double) (f10 * 255.0f)) + 0.5d), (int) (((double) (f11 * 255.0f)) + 0.5d), (int) (((double) (f12 * 255.0f)) + 0.5d), (int) (((double) (f13 * 255.0f)) + 0.5d));
    }

    public b(int i10, int i11, int i12) {
        this(i10, i11, i12, 255);
    }

    public b(int i10, int i11, int i12, int i13) {
        e(i10);
        e(i11);
        e(i12);
        e(i13);
        this.f253a = ((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255);
    }
}
