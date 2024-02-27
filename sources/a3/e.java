package a3;

import a3.u;
import android.content.Context;
import b3.j;
import b3.l;
import c3.c;
import c3.d;
import h3.s;
import h3.w;
import i3.g;
import i3.h;
import i3.i;
import i3.n0;
import i3.u0;

final class e extends u {

    /* renamed from: e  reason: collision with root package name */
    private nl.a f166e;

    /* renamed from: f  reason: collision with root package name */
    private nl.a f167f;

    /* renamed from: g  reason: collision with root package name */
    private nl.a f168g;

    /* renamed from: h  reason: collision with root package name */
    private nl.a f169h;

    /* renamed from: i  reason: collision with root package name */
    private nl.a f170i;

    /* renamed from: j  reason: collision with root package name */
    private nl.a f171j;

    /* renamed from: k  reason: collision with root package name */
    private nl.a f172k;

    /* renamed from: l  reason: collision with root package name */
    private nl.a f173l;

    /* renamed from: m  reason: collision with root package name */
    private nl.a f174m;

    /* renamed from: n  reason: collision with root package name */
    private nl.a f175n;

    /* renamed from: o  reason: collision with root package name */
    private nl.a f176o;

    /* renamed from: p  reason: collision with root package name */
    private nl.a f177p;

    /* renamed from: q  reason: collision with root package name */
    private nl.a f178q;

    private static final class b implements u.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f179a;

        private b() {
        }

        public u a() {
            d.a(this.f179a, Context.class);
            return new e(this.f179a);
        }

        /* renamed from: c */
        public b b(Context context) {
            this.f179a = (Context) d.b(context);
            return this;
        }
    }

    private e(Context context) {
        g(context);
    }

    public static u.a f() {
        return new b();
    }

    private void g(Context context) {
        this.f166e = c3.a.a(k.a());
        c3.b a10 = c.a(context);
        this.f167f = a10;
        j a11 = j.a(a10, k3.c.a(), k3.d.a());
        this.f168g = a11;
        this.f169h = c3.a.a(l.a(this.f167f, a11));
        this.f170i = u0.a(this.f167f, g.a(), i.a());
        this.f171j = c3.a.a(h.a(this.f167f));
        this.f172k = c3.a.a(n0.a(k3.c.a(), k3.d.a(), i3.j.a(), this.f170i, this.f171j));
        g3.g b10 = g3.g.b(k3.c.a());
        this.f173l = b10;
        g3.i a12 = g3.i.a(this.f167f, this.f172k, b10, k3.d.a());
        this.f174m = a12;
        nl.a aVar = this.f166e;
        nl.a aVar2 = this.f169h;
        nl.a aVar3 = this.f172k;
        this.f175n = g3.d.a(aVar, aVar2, a12, aVar3, aVar3);
        nl.a aVar4 = this.f167f;
        nl.a aVar5 = this.f169h;
        nl.a aVar6 = this.f172k;
        this.f176o = s.a(aVar4, aVar5, aVar6, this.f174m, this.f166e, aVar6, k3.c.a(), k3.d.a(), this.f172k);
        nl.a aVar7 = this.f166e;
        nl.a aVar8 = this.f172k;
        this.f177p = w.a(aVar7, aVar8, this.f174m, aVar8);
        this.f178q = c3.a.a(v.a(k3.c.a(), k3.d.a(), this.f175n, this.f176o, this.f177p));
    }

    /* access modifiers changed from: package-private */
    public i3.d c() {
        return (i3.d) this.f172k.get();
    }

    /* access modifiers changed from: package-private */
    public t e() {
        return (t) this.f178q.get();
    }
}
