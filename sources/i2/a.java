package i2;

import android.content.Context;
import e2.f;
import e2.g;
import g2.c;
import g2.e;
import h2.b;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final a f12231f = new a();

    /* renamed from: a  reason: collision with root package name */
    private int f12232a;

    /* renamed from: b  reason: collision with root package name */
    private int f12233b;

    /* renamed from: c  reason: collision with root package name */
    private String f12234c;

    /* renamed from: d  reason: collision with root package name */
    private b f12235d;

    /* renamed from: e  reason: collision with root package name */
    private c f12236e;

    public static a d() {
        return f12231f;
    }

    public int a() {
        if (this.f12233b == 0) {
            synchronized (a.class) {
                try {
                    if (this.f12233b == 0) {
                        this.f12233b = 20000;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12233b;
    }

    public c b() {
        if (this.f12236e == null) {
            synchronized (a.class) {
                try {
                    if (this.f12236e == null) {
                        this.f12236e = new e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12236e;
    }

    public b c() {
        if (this.f12235d == null) {
            synchronized (a.class) {
                try {
                    if (this.f12235d == null) {
                        this.f12235d = new h2.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12235d.clone();
    }

    public int e() {
        if (this.f12232a == 0) {
            synchronized (a.class) {
                try {
                    if (this.f12232a == 0) {
                        this.f12232a = 20000;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12232a;
    }

    public String f() {
        if (this.f12234c == null) {
            synchronized (a.class) {
                try {
                    if (this.f12234c == null) {
                        this.f12234c = "PRDownloader";
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f12234c;
    }

    public void g(Context context, g gVar) {
        this.f12232a = gVar.c();
        this.f12233b = gVar.a();
        this.f12234c = gVar.d();
        this.f12235d = gVar.b();
        this.f12236e = gVar.e() ? new g2.a(context) : new e();
        if (gVar.e()) {
            f.a(30);
        }
    }
}
