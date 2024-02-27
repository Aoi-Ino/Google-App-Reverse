package t;

import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f16166a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16167b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16168c = false;

    /* renamed from: d  reason: collision with root package name */
    p f16169d;

    /* renamed from: e  reason: collision with root package name */
    a f16170e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    int f16171f;

    /* renamed from: g  reason: collision with root package name */
    public int f16172g;

    /* renamed from: h  reason: collision with root package name */
    int f16173h = 1;

    /* renamed from: i  reason: collision with root package name */
    g f16174i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16175j = false;

    /* renamed from: k  reason: collision with root package name */
    List f16176k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    List f16177l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f16169d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f16177l) {
            if (!fVar.f16175j) {
                return;
            }
        }
        this.f16168c = true;
        d dVar2 = this.f16166a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f16167b) {
            this.f16169d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f fVar3 : this.f16177l) {
            if (!(fVar3 instanceof g)) {
                i10++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f16175j) {
            g gVar = this.f16174i;
            if (gVar != null) {
                if (gVar.f16175j) {
                    this.f16171f = this.f16173h * gVar.f16172g;
                } else {
                    return;
                }
            }
            d(fVar2.f16172g + this.f16171f);
        }
        d dVar3 = this.f16166a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f16176k.add(dVar);
        if (this.f16175j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f16177l.clear();
        this.f16176k.clear();
        this.f16175j = false;
        this.f16172g = 0;
        this.f16168c = false;
        this.f16167b = false;
    }

    public void d(int i10) {
        if (!this.f16175j) {
            this.f16175j = true;
            this.f16172g = i10;
            for (d dVar : this.f16176k) {
                dVar.a(dVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16169d.f16220b.t());
        sb2.append(":");
        sb2.append(this.f16170e);
        sb2.append("(");
        sb2.append(this.f16175j ? Integer.valueOf(this.f16172g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f16177l.size());
        sb2.append(":d=");
        sb2.append(this.f16176k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
