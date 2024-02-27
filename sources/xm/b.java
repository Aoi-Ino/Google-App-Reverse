package xm;

import an.c;
import cm.g;
import cm.l;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import um.b0;
import um.d;
import um.d0;
import um.u;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f32801c = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final b0 f32802a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f32803b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final boolean a(d0 d0Var, b0 b0Var) {
            l.f(d0Var, "response");
            l.f(b0Var, "request");
            int h10 = d0Var.h();
            if (!(h10 == 200 || h10 == 410 || h10 == 414 || h10 == 501 || h10 == 203 || h10 == 204)) {
                if (h10 != 307) {
                    if (!(h10 == 308 || h10 == 404 || h10 == 405)) {
                        switch (h10) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (d0.s(d0Var, "Expires", (String) null, 2, (Object) null) == null && d0Var.e().c() == -1 && !d0Var.e().b() && !d0Var.e().a()) {
                    return false;
                }
            }
            return !d0Var.e().h() && !b0Var.b().h();
        }
    }

    /* renamed from: xm.b$b  reason: collision with other inner class name */
    public static final class C0384b {

        /* renamed from: a  reason: collision with root package name */
        private Date f32804a;

        /* renamed from: b  reason: collision with root package name */
        private String f32805b;

        /* renamed from: c  reason: collision with root package name */
        private Date f32806c;

        /* renamed from: d  reason: collision with root package name */
        private String f32807d;

        /* renamed from: e  reason: collision with root package name */
        private Date f32808e;

        /* renamed from: f  reason: collision with root package name */
        private long f32809f;

        /* renamed from: g  reason: collision with root package name */
        private long f32810g;

        /* renamed from: h  reason: collision with root package name */
        private String f32811h;

        /* renamed from: i  reason: collision with root package name */
        private int f32812i = -1;

        /* renamed from: j  reason: collision with root package name */
        private final long f32813j;

        /* renamed from: k  reason: collision with root package name */
        private final b0 f32814k;

        /* renamed from: l  reason: collision with root package name */
        private final d0 f32815l;

        public C0384b(long j10, b0 b0Var, d0 d0Var) {
            l.f(b0Var, "request");
            this.f32813j = j10;
            this.f32814k = b0Var;
            this.f32815l = d0Var;
            if (d0Var != null) {
                this.f32809f = d0Var.i0();
                this.f32810g = d0Var.Z();
                u y10 = d0Var.y();
                int size = y10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String n10 = y10.n(i10);
                    String s10 = y10.s(i10);
                    if (p.o(n10, "Date", true)) {
                        this.f32804a = c.a(s10);
                        this.f32805b = s10;
                    } else if (p.o(n10, "Expires", true)) {
                        this.f32808e = c.a(s10);
                    } else if (p.o(n10, "Last-Modified", true)) {
                        this.f32806c = c.a(s10);
                        this.f32807d = s10;
                    } else if (p.o(n10, "ETag", true)) {
                        this.f32811h = s10;
                    } else if (p.o(n10, "Age", true)) {
                        this.f32812i = vm.b.R(s10, -1);
                    }
                }
            }
        }

        private final long a() {
            Date date = this.f32804a;
            long j10 = 0;
            if (date != null) {
                j10 = Math.max(0, this.f32810g - date.getTime());
            }
            int i10 = this.f32812i;
            if (i10 != -1) {
                j10 = Math.max(j10, TimeUnit.SECONDS.toMillis((long) i10));
            }
            long j11 = this.f32810g;
            return j10 + (j11 - this.f32809f) + (this.f32813j - j11);
        }

        private final b c() {
            String str;
            if (this.f32815l == null) {
                return new b(this.f32814k, (d0) null);
            }
            if (this.f32814k.f() && this.f32815l.n() == null) {
                return new b(this.f32814k, (d0) null);
            }
            if (!b.f32801c.a(this.f32815l, this.f32814k)) {
                return new b(this.f32814k, (d0) null);
            }
            d b10 = this.f32814k.b();
            if (b10.g() || e(this.f32814k)) {
                return new b(this.f32814k, (d0) null);
            }
            d e10 = this.f32815l.e();
            long a10 = a();
            long d10 = d();
            if (b10.c() != -1) {
                d10 = Math.min(d10, TimeUnit.SECONDS.toMillis((long) b10.c()));
            }
            long j10 = 0;
            long millis = b10.e() != -1 ? TimeUnit.SECONDS.toMillis((long) b10.e()) : 0;
            if (!e10.f() && b10.d() != -1) {
                j10 = TimeUnit.SECONDS.toMillis((long) b10.d());
            }
            if (!e10.g()) {
                long j11 = millis + a10;
                if (j11 < j10 + d10) {
                    d0.a R = this.f32815l.R();
                    if (j11 >= d10) {
                        R.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a10 > 86400000 && f()) {
                        R.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new b((b0) null, R.c());
                }
            }
            String str2 = this.f32811h;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f32806c != null) {
                    str2 = this.f32807d;
                } else if (this.f32804a == null) {
                    return new b(this.f32814k, (d0) null);
                } else {
                    str2 = this.f32805b;
                }
                str = "If-Modified-Since";
            }
            u.a o10 = this.f32814k.e().o();
            l.c(str2);
            o10.d(str, str2);
            return new b(this.f32814k.h().d(o10.e()).b(), this.f32815l);
        }

        private final long d() {
            d0 d0Var = this.f32815l;
            l.c(d0Var);
            d e10 = d0Var.e();
            if (e10.c() != -1) {
                return TimeUnit.SECONDS.toMillis((long) e10.c());
            }
            Date date = this.f32808e;
            if (date != null) {
                Date date2 = this.f32804a;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f32810g);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f32806c == null || this.f32815l.c0().j().o() != null) {
                return 0;
            } else {
                Date date3 = this.f32804a;
                long time2 = date3 != null ? date3.getTime() : this.f32809f;
                Date date4 = this.f32806c;
                l.c(date4);
                long time3 = time2 - date4.getTime();
                if (time3 > 0) {
                    return time3 / ((long) 10);
                }
                return 0;
            }
        }

        private final boolean e(b0 b0Var) {
            return (b0Var.d("If-Modified-Since") == null && b0Var.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            d0 d0Var = this.f32815l;
            l.c(d0Var);
            return d0Var.e().c() == -1 && this.f32808e == null;
        }

        public final b b() {
            b c10 = c();
            return (c10.b() == null || !this.f32814k.b().i()) ? c10 : new b((b0) null, (d0) null);
        }
    }

    public b(b0 b0Var, d0 d0Var) {
        this.f32802a = b0Var;
        this.f32803b = d0Var;
    }

    public final d0 a() {
        return this.f32803b;
    }

    public final b0 b() {
        return this.f32802a;
    }
}
