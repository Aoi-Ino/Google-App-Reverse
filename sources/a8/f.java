package a8;

import b8.a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class f implements d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f265p = true;

    /* renamed from: q  reason: collision with root package name */
    public static boolean f266q = false;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f267a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f268b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f269c;

    /* renamed from: d  reason: collision with root package name */
    protected v f270d;

    /* renamed from: e  reason: collision with root package name */
    protected float f271e;

    /* renamed from: f  reason: collision with root package name */
    protected float f272f;

    /* renamed from: g  reason: collision with root package name */
    protected float f273g;

    /* renamed from: h  reason: collision with root package name */
    protected float f274h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f275i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f276j;

    /* renamed from: k  reason: collision with root package name */
    protected String f277k;

    /* renamed from: l  reason: collision with root package name */
    protected String f278l;

    /* renamed from: m  reason: collision with root package name */
    protected String f279m;

    /* renamed from: n  reason: collision with root package name */
    protected int f280n;

    /* renamed from: o  reason: collision with root package name */
    protected int f281o;

    public f() {
        this(s.f334k);
    }

    public static final String n() {
        return "5.0.6";
    }

    public static final String o() {
        return "iText 5.0.6 (c) 1T3XT BVBA";
    }

    public void a() {
        if (!this.f269c) {
            this.f268b = true;
        }
        Iterator it = this.f267a.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.c(this.f270d);
            dVar.e(this.f271e, this.f272f, this.f273g, this.f274h);
            dVar.a();
        }
    }

    public boolean b(h hVar) {
        boolean z10 = false;
        if (this.f269c) {
            throw new g(a.b("the.document.has.been.closed.you.can.t.add.any.elements", new Object[0]));
        } else if (this.f268b || !hVar.T()) {
            Iterator it = this.f267a.iterator();
            while (it.hasNext()) {
                z10 |= ((d) it.next()).b(hVar);
            }
            if (hVar instanceof o) {
                o oVar = (o) hVar;
                if (!oVar.Y()) {
                    oVar.v();
                }
            }
            return z10;
        } else {
            throw new g(a.b("the.document.is.not.open.yet.you.can.only.add.meta.information", new Object[0]));
        }
    }

    public boolean c(v vVar) {
        this.f270d = vVar;
        Iterator it = this.f267a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).c(vVar);
        }
        return true;
    }

    public void close() {
        if (!this.f269c) {
            this.f268b = false;
            this.f269c = true;
        }
        Iterator it = this.f267a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).close();
        }
    }

    public boolean d() {
        if (!this.f268b || this.f269c) {
            return false;
        }
        Iterator it = this.f267a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).d();
        }
        return true;
    }

    public boolean e(float f10, float f11, float f12, float f13) {
        this.f271e = f10;
        this.f272f = f11;
        this.f273g = f12;
        this.f274h = f13;
        Iterator it = this.f267a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).e(f10, f11, f12, f13);
        }
        return true;
    }

    public boolean f(String str) {
        try {
            return b(new r(4, str));
        } catch (g e10) {
            throw new j(e10);
        }
    }

    public boolean g() {
        try {
            return b(new r(6, new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy").format(new Date())));
        } catch (g e10) {
            throw new j(e10);
        }
    }

    public void h(d dVar) {
        this.f267a.add(dVar);
    }

    public boolean i() {
        try {
            return b(new r(5, o()));
        } catch (g e10) {
            throw new j(e10);
        }
    }

    public boolean j(String str) {
        try {
            return b(new r(2, str));
        } catch (g e10) {
            throw new j(e10);
        }
    }

    public boolean k(String str) {
        try {
            return b(new r(1, str));
        } catch (g e10) {
            throw new j(e10);
        }
    }

    public float l(float f10) {
        return this.f270d.n(this.f274h + f10);
    }

    public int m() {
        return this.f280n;
    }

    public float p() {
        return this.f270d.q(this.f271e);
    }

    public float q(float f10) {
        return this.f270d.q(this.f271e + f10);
    }

    public float r(float f10) {
        return this.f270d.t(this.f272f + f10);
    }

    public float s() {
        return this.f270d.x(this.f273g);
    }

    public float t(float f10) {
        return this.f270d.x(this.f273g + f10);
    }

    public f(v vVar) {
        this(vVar, 36.0f, 36.0f, 36.0f, 36.0f);
    }

    public f(v vVar, float f10, float f11, float f12, float f13) {
        this.f267a = new ArrayList();
        this.f275i = false;
        this.f276j = false;
        this.f277k = null;
        this.f278l = null;
        this.f279m = null;
        this.f280n = 0;
        this.f281o = 0;
        this.f270d = vVar;
        this.f271e = f10;
        this.f272f = f11;
        this.f273g = f12;
        this.f274h = f13;
    }
}
