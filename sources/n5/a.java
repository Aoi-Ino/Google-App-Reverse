package n5;

import android.app.PendingIntent;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f14128a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14129b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14130c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14131d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f14132e;

    /* renamed from: f  reason: collision with root package name */
    private final int f14133f;

    /* renamed from: g  reason: collision with root package name */
    private final long f14134g;

    /* renamed from: h  reason: collision with root package name */
    private final long f14135h;

    /* renamed from: i  reason: collision with root package name */
    private final long f14136i;

    /* renamed from: j  reason: collision with root package name */
    private final long f14137j;

    /* renamed from: k  reason: collision with root package name */
    private final PendingIntent f14138k;

    /* renamed from: l  reason: collision with root package name */
    private final PendingIntent f14139l;

    /* renamed from: m  reason: collision with root package name */
    private final PendingIntent f14140m;

    /* renamed from: n  reason: collision with root package name */
    private final PendingIntent f14141n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14142o = false;

    private a(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f14128a = str;
        this.f14129b = i10;
        this.f14130c = i11;
        this.f14131d = i12;
        this.f14132e = num;
        this.f14133f = i13;
        this.f14134g = j10;
        this.f14135h = j11;
        this.f14136i = j12;
        this.f14137j = j13;
        this.f14138k = pendingIntent;
        this.f14139l = pendingIntent2;
        this.f14140m = pendingIntent3;
        this.f14141n = pendingIntent4;
    }

    public static a h(String str, int i10, int i11, int i12, Integer num, int i13, long j10, long j11, long j12, long j13, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new a(str, i10, i11, i12, num, i13, j10, j11, j12, j13, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    private final boolean k(d dVar) {
        return dVar.a() && this.f14136i <= this.f14137j;
    }

    public int a() {
        return this.f14129b;
    }

    public Integer b() {
        return this.f14132e;
    }

    public int c() {
        return this.f14131d;
    }

    public boolean d(int i10) {
        return g(d.c(i10)) != null;
    }

    public boolean e(d dVar) {
        return g(dVar) != null;
    }

    public int f() {
        return this.f14130c;
    }

    /* access modifiers changed from: package-private */
    public final PendingIntent g(d dVar) {
        if (dVar.b() == 0) {
            PendingIntent pendingIntent = this.f14139l;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (k(dVar)) {
                return this.f14141n;
            }
            return null;
        }
        if (dVar.b() == 1) {
            PendingIntent pendingIntent2 = this.f14138k;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (k(dVar)) {
                return this.f14140m;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f14142o = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return this.f14142o;
    }
}
