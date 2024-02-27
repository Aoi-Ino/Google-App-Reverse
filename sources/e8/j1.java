package e8;

import a8.b;
import java.io.OutputStream;
import java.util.ArrayList;

public class j1 extends l0 {

    /* renamed from: n  reason: collision with root package name */
    private x0 f10848n;

    /* renamed from: o  reason: collision with root package name */
    private int f10849o = 0;

    /* renamed from: p  reason: collision with root package name */
    private j1 f10850p = null;

    /* renamed from: q  reason: collision with root package name */
    private k0 f10851q;

    /* renamed from: r  reason: collision with root package name */
    private z f10852r;

    /* renamed from: s  reason: collision with root package name */
    protected ArrayList f10853s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    protected c2 f10854t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10855u = true;

    /* renamed from: v  reason: collision with root package name */
    private b f10856v;

    /* renamed from: w  reason: collision with root package name */
    private int f10857w = 0;

    j1(c2 c2Var) {
        super(l0.f10895j);
        this.f10854t = c2Var;
    }

    /* access modifiers changed from: package-private */
    public void A(int i10) {
        this.f10849o = i10;
    }

    public void B(x0 x0Var) {
        this.f10848n = x0Var;
    }

    public void k(c2 c2Var, OutputStream outputStream) {
        b bVar = this.f10856v;
        int i10 = 0;
        if (bVar != null && !bVar.equals(b.f244f)) {
            r(c1.f10496x0, new b0(new float[]{((float) this.f10856v.d()) / 255.0f, ((float) this.f10856v.b()) / 255.0f, ((float) this.f10856v.a()) / 255.0f}));
        }
        int i11 = this.f10857w;
        if ((i11 & 1) != 0) {
            i10 = 2;
        }
        if ((i11 & 2) != 0) {
            i10 |= 1;
        }
        if (i10 != 0) {
            r(c1.R2, new f1(i10));
        }
        j1 j1Var = this.f10850p;
        if (j1Var != null) {
            r(c1.f10246d7, j1Var.x());
        }
        k0 k0Var = this.f10851q;
        if (k0Var != null && k0Var.v()) {
            r(c1.U1, this.f10851q);
        }
        z zVar = this.f10852r;
        if (zVar != null) {
            r(c1.f10300i, zVar);
        }
        int i12 = this.f10849o;
        if (i12 != 0) {
            r(c1.f10419r1, new f1(i12));
        }
        super.k(c2Var, outputStream);
    }

    /* access modifiers changed from: package-private */
    public int v() {
        return this.f10849o;
    }

    public ArrayList w() {
        return this.f10853s;
    }

    public x0 x() {
        return this.f10848n;
    }

    public boolean y() {
        return this.f10855u;
    }

    public j1 z() {
        return this.f10850p;
    }
}
