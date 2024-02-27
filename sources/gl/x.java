package gl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import gl.t;
import gl.w;
import java.util.concurrent.atomic.AtomicInteger;

public class x {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicInteger f23975m = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final t f23976a;

    /* renamed from: b  reason: collision with root package name */
    private final w.b f23977b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23978c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f23979d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23980e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f23981f;

    /* renamed from: g  reason: collision with root package name */
    private int f23982g;

    /* renamed from: h  reason: collision with root package name */
    private int f23983h;

    /* renamed from: i  reason: collision with root package name */
    private int f23984i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f23985j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f23986k;

    /* renamed from: l  reason: collision with root package name */
    private Object f23987l;

    x(t tVar, Uri uri, int i10) {
        if (!tVar.f23908n) {
            this.f23976a = tVar;
            this.f23977b = new w.b(uri, i10, tVar.f23905k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private w a(long j10) {
        int andIncrement = f23975m.getAndIncrement();
        w a10 = this.f23977b.a();
        a10.f23942a = andIncrement;
        a10.f23943b = j10;
        boolean z10 = this.f23976a.f23907m;
        if (z10) {
            e0.v("Main", "created", a10.g(), a10.toString());
        }
        w o10 = this.f23976a.o(a10);
        if (o10 != a10) {
            o10.f23942a = andIncrement;
            o10.f23943b = j10;
            if (z10) {
                String d10 = o10.d();
                e0.v("Main", "changed", d10, "into " + o10);
            }
        }
        return o10;
    }

    private Drawable b() {
        return this.f23981f != 0 ? this.f23976a.f23898d.getResources().getDrawable(this.f23981f) : this.f23985j;
    }

    public void c(ImageView imageView) {
        d(imageView, (e) null);
    }

    public void d(ImageView imageView, e eVar) {
        Bitmap l10;
        ImageView imageView2 = imageView;
        e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        e0.c();
        if (imageView2 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f23977b.b()) {
            this.f23976a.c(imageView2);
            if (this.f23980e) {
                u.d(imageView2, b());
            }
        } else {
            if (this.f23979d) {
                if (!this.f23977b.c()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f23980e) {
                            u.d(imageView2, b());
                        }
                        this.f23976a.e(imageView2, new h(this, imageView2, eVar2));
                        return;
                    }
                    this.f23977b.d(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            w a10 = a(nanoTime);
            String h10 = e0.h(a10);
            if (!p.a(this.f23983h) || (l10 = this.f23976a.l(h10)) == null) {
                if (this.f23980e) {
                    u.d(imageView2, b());
                }
                this.f23976a.g(new l(this.f23976a, imageView, a10, this.f23983h, this.f23984i, this.f23982g, this.f23986k, h10, this.f23987l, eVar, this.f23978c));
                return;
            }
            this.f23976a.c(imageView2);
            t tVar = this.f23976a;
            Context context = tVar.f23898d;
            t.e eVar3 = t.e.MEMORY;
            u.c(imageView, context, l10, eVar3, this.f23978c, tVar.f23906l);
            if (this.f23976a.f23907m) {
                String g10 = a10.g();
                e0.v("Main", "completed", g10, "from " + eVar3);
            }
            if (eVar2 != null) {
                eVar.a();
            }
        }
    }

    public x e(int i10) {
        if (!this.f23980e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        } else if (i10 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        } else if (this.f23985j == null) {
            this.f23981f = i10;
            return this;
        } else {
            throw new IllegalStateException("Placeholder image already set.");
        }
    }

    public x f(int i10, int i11) {
        this.f23977b.d(i10, i11);
        return this;
    }

    public x g(c0 c0Var) {
        this.f23977b.e(c0Var);
        return this;
    }

    /* access modifiers changed from: package-private */
    public x h() {
        this.f23979d = false;
        return this;
    }
}
