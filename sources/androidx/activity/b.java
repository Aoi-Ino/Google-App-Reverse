package androidx.activity;

import cm.g;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f455e = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f456a;

    /* renamed from: b  reason: collision with root package name */
    private final float f457b;

    /* renamed from: c  reason: collision with root package name */
    private final float f458c;

    /* renamed from: d  reason: collision with root package name */
    private final int f459d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public b(float f10, float f11, float f12, int i10) {
        this.f456a = f10;
        this.f457b = f11;
        this.f458c = f12;
        this.f459d = i10;
    }

    public final float a() {
        return this.f458c;
    }

    public final int b() {
        return this.f459d;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f456a + ", touchY=" + this.f457b + ", progress=" + this.f458c + ", swipeEdge=" + this.f459d + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.window.BackEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "backEvent"
            cm.l.f(r5, r0)
            androidx.activity.a r0 = androidx.activity.a.f454a
            float r1 = r0.d(r5)
            float r2 = r0.e(r5)
            float r3 = r0.b(r5)
            int r5 = r0.c(r5)
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.b.<init>(android.window.BackEvent):void");
    }
}
