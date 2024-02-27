package a8;

import java.util.ArrayList;
import java.util.Iterator;

public class p implements h {

    /* renamed from: e  reason: collision with root package name */
    protected ArrayList f305e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f306f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f307g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f308h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f309i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f310j;

    /* renamed from: k  reason: collision with root package name */
    protected int f311k;

    /* renamed from: l  reason: collision with root package name */
    protected c f312l;

    /* renamed from: m  reason: collision with root package name */
    protected String f313m;

    /* renamed from: n  reason: collision with root package name */
    protected String f314n;

    /* renamed from: o  reason: collision with root package name */
    protected float f315o;

    /* renamed from: p  reason: collision with root package name */
    protected float f316p;

    /* renamed from: q  reason: collision with root package name */
    protected float f317q;

    public p() {
        this(false, false);
    }

    public int F() {
        return 14;
    }

    public boolean T() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: a8.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: a8.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: a8.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: a8.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(a8.h r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof a8.q
            if (r0 == 0) goto L_0x0056
            a8.q r4 = (a8.q) r4
            boolean r0 = r3.f306f
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3.f307g
            if (r0 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            a8.c r0 = r3.f312l
        L_0x0011:
            r4.N0(r0)
            goto L_0x0044
        L_0x0015:
            a8.c r0 = new a8.c
            java.lang.String r1 = r3.f313m
            a8.c r2 = r3.f312l
            a8.k r2 = r2.d()
            r0.<init>(r1, r2)
            int r1 = r3.f311k
            java.util.ArrayList r2 = r3.f305e
            int r2 = r2.size()
            int r1 = r1 + r2
            boolean r2 = r3.f307g
            if (r2 == 0) goto L_0x0039
            boolean r2 = r3.f308h
            java.lang.String r1 = d8.a.c(r1, r2)
        L_0x0035:
            r0.a(r1)
            goto L_0x003e
        L_0x0039:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x0035
        L_0x003e:
            java.lang.String r1 = r3.f314n
            r0.a(r1)
            goto L_0x0011
        L_0x0044:
            float r0 = r3.f317q
            boolean r1 = r3.f309i
            r4.M0(r0, r1)
            r0 = 0
            r4.E0(r0)
        L_0x004f:
            java.util.ArrayList r0 = r3.f305e
            boolean r4 = r0.add(r4)
            return r4
        L_0x0056:
            boolean r0 = r4 instanceof a8.p
            if (r0 == 0) goto L_0x006d
            a8.p r4 = (a8.p) r4
            float r0 = r4.b()
            float r1 = r3.f317q
            float r0 = r0 + r1
            r4.g(r0)
            int r0 = r3.f311k
            int r0 = r0 + -1
            r3.f311k = r0
            goto L_0x004f
        L_0x006d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.p.a(a8.h):boolean");
    }

    public float b() {
        return this.f315o;
    }

    public float c() {
        return this.f316p;
    }

    public ArrayList d() {
        return this.f305e;
    }

    public boolean e() {
        return this.f310j;
    }

    public ArrayList e0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f305e.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((h) it.next()).e0());
        }
        return arrayList;
    }

    public void f() {
        Iterator it = this.f305e.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar instanceof q) {
                f10 = Math.max(f10, ((q) hVar).t0());
            }
        }
        Iterator it2 = this.f305e.iterator();
        while (it2.hasNext()) {
            h hVar2 = (h) it2.next();
            if (hVar2 instanceof q) {
                ((q) hVar2).D0(f10);
            }
        }
    }

    public void g(float f10) {
        this.f315o = f10;
    }

    public void h(float f10) {
        this.f316p = f10;
    }

    public void i(String str) {
        this.f312l = new c(str);
    }

    public boolean r(i iVar) {
        try {
            Iterator it = this.f305e.iterator();
            while (it.hasNext()) {
                iVar.b((h) it.next());
            }
            return true;
        } catch (g unused) {
            return false;
        }
    }

    public p(boolean z10, boolean z11) {
        this.f305e = new ArrayList();
        this.f306f = false;
        this.f307g = false;
        this.f308h = false;
        this.f309i = false;
        this.f310j = false;
        this.f311k = 1;
        this.f312l = new c("- ");
        this.f313m = "";
        this.f314n = ". ";
        this.f315o = 0.0f;
        this.f316p = 0.0f;
        this.f317q = 0.0f;
        this.f306f = z10;
        this.f307g = z11;
        this.f309i = true;
        this.f310j = true;
    }
}
