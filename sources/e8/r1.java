package e8;

import a8.f;
import a8.j;
import b8.a;
import java.io.IOException;
import java.util.ArrayList;

public class r1 {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList f11003a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f11004b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private int f11005c = 10;

    /* renamed from: d  reason: collision with root package name */
    private c2 f11006d;

    /* renamed from: e  reason: collision with root package name */
    private x0 f11007e;

    r1(c2 c2Var) {
        this.f11006d = c2Var;
    }

    /* access modifiers changed from: package-private */
    public void a(l0 l0Var) {
        try {
            if (this.f11003a.size() % this.f11005c == 0) {
                this.f11004b.add(this.f11006d.K());
            }
            ArrayList arrayList = this.f11004b;
            l0Var.r(c1.f10246d7, (x0) arrayList.get(arrayList.size() - 1));
            x0 v10 = this.f11006d.v();
            this.f11006d.o(l0Var, v10);
            this.f11003a.add(v10);
        } catch (Exception e10) {
            throw new j(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public x0 b() {
        int i10;
        int i11;
        c1 c1Var;
        i1 y1Var;
        if (!this.f11003a.isEmpty()) {
            ArrayList arrayList = this.f11004b;
            ArrayList arrayList2 = this.f11003a;
            ArrayList arrayList3 = new ArrayList();
            int i12 = 1;
            while (true) {
                int i13 = this.f11005c;
                i12 *= i13;
                int size = arrayList2.size();
                int i14 = this.f11005c;
                int i15 = size % i14;
                if (i15 != 0) {
                    i14 = i15;
                }
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    if (i16 == arrayList.size() - 1) {
                        i11 = this.f11003a.size() % i12;
                        if (i11 == 0) {
                            i11 = i12;
                        }
                        i10 = i14;
                    } else {
                        i11 = i12;
                        i10 = i13;
                    }
                    l0 l0Var = new l0(c1.Z6);
                    l0Var.r(c1.f10419r1, new f1(i11));
                    b0 b0Var = new b0();
                    int i17 = i16 * i13;
                    b0Var.r().addAll(arrayList2.subList(i17, i10 + i17));
                    l0Var.r(c1.f10220b5, b0Var);
                    if (arrayList.size() > 1) {
                        if (i16 % this.f11005c == 0) {
                            arrayList3.add(this.f11006d.K());
                        }
                        c1Var = c1.f10246d7;
                        y1Var = (i1) arrayList3.get(i16 / this.f11005c);
                    } else {
                        c1Var = c1.S4;
                        y1Var = new y1(f.n());
                    }
                    l0Var.r(c1Var, y1Var);
                    this.f11006d.o(l0Var, (x0) arrayList.get(i16));
                }
                if (arrayList.size() == 1) {
                    x0 x0Var = (x0) arrayList.get(0);
                    this.f11007e = x0Var;
                    return x0Var;
                }
                arrayList2 = arrayList;
                arrayList = arrayList3;
                arrayList3 = new ArrayList();
            }
        } else {
            throw new IOException(a.b("the.document.has.no.pages", new Object[0]));
        }
    }
}
