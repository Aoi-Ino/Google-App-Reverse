package t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p.d;
import s.b;
import s.e;
import s.f;

public class o {

    /* renamed from: g  reason: collision with root package name */
    static int f16204g;

    /* renamed from: a  reason: collision with root package name */
    ArrayList f16205a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    int f16206b;

    /* renamed from: c  reason: collision with root package name */
    boolean f16207c = false;

    /* renamed from: d  reason: collision with root package name */
    int f16208d;

    /* renamed from: e  reason: collision with root package name */
    ArrayList f16209e = null;

    /* renamed from: f  reason: collision with root package name */
    private int f16210f = -1;

    class a {

        /* renamed from: a  reason: collision with root package name */
        WeakReference f16211a;

        /* renamed from: b  reason: collision with root package name */
        int f16212b;

        /* renamed from: c  reason: collision with root package name */
        int f16213c;

        /* renamed from: d  reason: collision with root package name */
        int f16214d;

        /* renamed from: e  reason: collision with root package name */
        int f16215e;

        /* renamed from: f  reason: collision with root package name */
        int f16216f;

        /* renamed from: g  reason: collision with root package name */
        int f16217g;

        public a(e eVar, d dVar, int i10) {
            this.f16211a = new WeakReference(eVar);
            this.f16212b = dVar.x(eVar.O);
            this.f16213c = dVar.x(eVar.P);
            this.f16214d = dVar.x(eVar.Q);
            this.f16215e = dVar.x(eVar.R);
            this.f16216f = dVar.x(eVar.S);
            this.f16217g = i10;
        }
    }

    public o(int i10) {
        int i11 = f16204g;
        f16204g = i11 + 1;
        this.f16206b = i11;
        this.f16208d = i10;
    }

    private String e() {
        int i10 = this.f16208d;
        if (i10 == 0) {
            return "Horizontal";
        }
        if (i10 == 1) {
            return "Vertical";
        }
        return i10 == 2 ? "Both" : "Unknown";
    }

    private int j(d dVar, ArrayList arrayList, int i10) {
        int x10;
        s.d dVar2;
        f fVar = (f) ((e) arrayList.get(0)).K();
        dVar.D();
        fVar.g(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((e) arrayList.get(i11)).g(dVar, false);
        }
        if (i10 == 0 && fVar.W0 > 0) {
            b.b(fVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && fVar.X0 > 0) {
            b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f16209e = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f16209e.add(new a((e) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            x10 = dVar.x(fVar.O);
            dVar2 = fVar.Q;
        } else {
            x10 = dVar.x(fVar.P);
            dVar2 = fVar.R;
        }
        int x11 = dVar.x(dVar2);
        dVar.D();
        return x11 - x10;
    }

    public boolean a(e eVar) {
        if (this.f16205a.contains(eVar)) {
            return false;
        }
        this.f16205a.add(eVar);
        return true;
    }

    public void b(ArrayList arrayList) {
        int size = this.f16205a.size();
        if (this.f16210f != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f16210f == oVar.f16206b) {
                    g(this.f16208d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f16206b;
    }

    public int d() {
        return this.f16208d;
    }

    public int f(d dVar, int i10) {
        if (this.f16205a.size() == 0) {
            return 0;
        }
        return j(dVar, this.f16205a, i10);
    }

    public void g(int i10, o oVar) {
        Iterator it = this.f16205a.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            oVar.a(eVar);
            int c10 = oVar.c();
            if (i10 == 0) {
                eVar.I0 = c10;
            } else {
                eVar.J0 = c10;
            }
        }
        this.f16210f = oVar.f16206b;
    }

    public void h(boolean z10) {
        this.f16207c = z10;
    }

    public void i(int i10) {
        this.f16208d = i10;
    }

    public String toString() {
        String str = e() + " [" + this.f16206b + "] <";
        Iterator it = this.f16205a.iterator();
        while (it.hasNext()) {
            str = str + " " + ((e) it.next()).t();
        }
        return str + " >";
    }
}
