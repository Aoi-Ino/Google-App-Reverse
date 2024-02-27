package gl;

import android.graphics.Bitmap;
import android.net.Uri;
import gl.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class w {

    /* renamed from: s  reason: collision with root package name */
    private static final long f23941s = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    int f23942a;

    /* renamed from: b  reason: collision with root package name */
    long f23943b;

    /* renamed from: c  reason: collision with root package name */
    int f23944c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f23945d;

    /* renamed from: e  reason: collision with root package name */
    public final int f23946e;

    /* renamed from: f  reason: collision with root package name */
    public final String f23947f;

    /* renamed from: g  reason: collision with root package name */
    public final List f23948g;

    /* renamed from: h  reason: collision with root package name */
    public final int f23949h;

    /* renamed from: i  reason: collision with root package name */
    public final int f23950i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f23951j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f23952k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f23953l;

    /* renamed from: m  reason: collision with root package name */
    public final float f23954m;

    /* renamed from: n  reason: collision with root package name */
    public final float f23955n;

    /* renamed from: o  reason: collision with root package name */
    public final float f23956o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f23957p;

    /* renamed from: q  reason: collision with root package name */
    public final Bitmap.Config f23958q;

    /* renamed from: r  reason: collision with root package name */
    public final t.f f23959r;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f23960a;

        /* renamed from: b  reason: collision with root package name */
        private int f23961b;

        /* renamed from: c  reason: collision with root package name */
        private String f23962c;

        /* renamed from: d  reason: collision with root package name */
        private int f23963d;

        /* renamed from: e  reason: collision with root package name */
        private int f23964e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f23965f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f23966g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f23967h;

        /* renamed from: i  reason: collision with root package name */
        private float f23968i;

        /* renamed from: j  reason: collision with root package name */
        private float f23969j;

        /* renamed from: k  reason: collision with root package name */
        private float f23970k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f23971l;

        /* renamed from: m  reason: collision with root package name */
        private List f23972m;

        /* renamed from: n  reason: collision with root package name */
        private Bitmap.Config f23973n;

        /* renamed from: o  reason: collision with root package name */
        private t.f f23974o;

        b(Uri uri, int i10, Bitmap.Config config) {
            this.f23960a = uri;
            this.f23961b = i10;
            this.f23973n = config;
        }

        public w a() {
            boolean z10 = this.f23966g;
            if (z10 && this.f23965f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f23965f && this.f23963d == 0 && this.f23964e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z10 && this.f23963d == 0 && this.f23964e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f23974o == null) {
                    this.f23974o = t.f.NORMAL;
                }
                w wVar = r2;
                w wVar2 = new w(this.f23960a, this.f23961b, this.f23962c, this.f23972m, this.f23963d, this.f23964e, this.f23965f, this.f23966g, this.f23967h, this.f23968i, this.f23969j, this.f23970k, this.f23971l, this.f23973n, this.f23974o);
                return wVar;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return (this.f23960a == null && this.f23961b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return (this.f23963d == 0 && this.f23964e == 0) ? false : true;
        }

        public b d(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i11 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i11 == 0 && i10 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f23963d = i10;
                this.f23964e = i11;
                return this;
            }
        }

        public b e(c0 c0Var) {
            if (c0Var == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (c0Var.b() != null) {
                if (this.f23972m == null) {
                    this.f23972m = new ArrayList(2);
                }
                this.f23972m.add(c0Var);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }
    }

    private w(Uri uri, int i10, String str, List list, int i11, int i12, boolean z10, boolean z11, boolean z12, float f10, float f11, float f12, boolean z13, Bitmap.Config config, t.f fVar) {
        this.f23945d = uri;
        this.f23946e = i10;
        this.f23947f = str;
        this.f23948g = list == null ? null : Collections.unmodifiableList(list);
        this.f23949h = i11;
        this.f23950i = i12;
        this.f23951j = z10;
        this.f23952k = z11;
        this.f23953l = z12;
        this.f23954m = f10;
        this.f23955n = f11;
        this.f23956o = f12;
        this.f23957p = z13;
        this.f23958q = config;
        this.f23959r = fVar;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f23945d;
        return uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(this.f23946e);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f23948g != null;
    }

    public boolean c() {
        return (this.f23949h == 0 && this.f23950i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        StringBuilder sb2;
        long nanoTime = System.nanoTime() - this.f23943b;
        if (nanoTime > f23941s) {
            sb2 = new StringBuilder();
            sb2.append(g());
            sb2.append('+');
            sb2.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb2.append('s');
        } else {
            sb2 = new StringBuilder();
            sb2.append(g());
            sb2.append('+');
            sb2.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb2.append("ms");
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return c() || this.f23954m != 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return e() || b();
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.f23942a + ']';
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i10 = this.f23946e;
        if (i10 > 0) {
            sb2.append(i10);
        } else {
            sb2.append(this.f23945d);
        }
        List list = this.f23948g;
        if (list != null && !list.isEmpty()) {
            for (c0 b10 : this.f23948g) {
                sb2.append(' ');
                sb2.append(b10.b());
            }
        }
        if (this.f23947f != null) {
            sb2.append(" stableKey(");
            sb2.append(this.f23947f);
            sb2.append(')');
        }
        if (this.f23949h > 0) {
            sb2.append(" resize(");
            sb2.append(this.f23949h);
            sb2.append(',');
            sb2.append(this.f23950i);
            sb2.append(')');
        }
        if (this.f23951j) {
            sb2.append(" centerCrop");
        }
        if (this.f23952k) {
            sb2.append(" centerInside");
        }
        if (this.f23954m != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(this.f23954m);
            if (this.f23957p) {
                sb2.append(" @ ");
                sb2.append(this.f23955n);
                sb2.append(',');
                sb2.append(this.f23956o);
            }
            sb2.append(')');
        }
        if (this.f23958q != null) {
            sb2.append(' ');
            sb2.append(this.f23958q);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
