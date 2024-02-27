package a8;

import b8.a;
import e8.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class u extends ArrayList implements h {

    /* renamed from: e  reason: collision with root package name */
    protected float f359e;

    /* renamed from: f  reason: collision with root package name */
    protected k f360f;

    public u() {
        this(16.0f);
    }

    public int F() {
        return 11;
    }

    public boolean T() {
        return true;
    }

    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            add((h) it.next());
        }
        return true;
    }

    public ArrayList e0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.addAll(((h) it.next()).e0());
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public void add(int i10, h hVar) {
        c cVar;
        if (hVar != null) {
            try {
                if (hVar.F() == 10) {
                    c cVar2 = (c) hVar;
                    cVar = cVar2;
                    if (!this.f360f.l()) {
                        cVar2.m(this.f360f.b(cVar2.d()));
                        cVar = cVar2;
                    }
                } else {
                    int F = hVar.F();
                    cVar = hVar;
                    if (F != 11) {
                        int F2 = hVar.F();
                        cVar = hVar;
                        if (F2 != 17) {
                            int F3 = hVar.F();
                            cVar = hVar;
                            if (F3 != 29) {
                                int F4 = hVar.F();
                                cVar = hVar;
                                if (F4 != 55) {
                                    if (hVar.F() == 50) {
                                        cVar = hVar;
                                    } else {
                                        throw new ClassCastException(String.valueOf(hVar.F()));
                                    }
                                }
                            }
                        }
                    }
                }
                super.add(i10, cVar);
            } catch (ClassCastException e10) {
                throw new ClassCastException(a.b("insertion.of.illegal.element.1", e10.getMessage()));
            }
        }
    }

    /* renamed from: h0 */
    public boolean add(h hVar) {
        if (hVar == null) {
            return false;
        }
        try {
            int F = hVar.F();
            if (F == 14 || F == 17 || F == 23 || F == 29 || F == 50 || F == 55) {
                return super.add(hVar);
            }
            switch (F) {
                case 10:
                    return k0((c) hVar);
                case 11:
                case 12:
                    Iterator it = ((u) hVar).iterator();
                    boolean z10 = true;
                    while (it.hasNext()) {
                        h hVar2 = (h) it.next();
                        z10 &= hVar2 instanceof c ? k0((c) hVar2) : add(hVar2);
                    }
                    return z10;
                default:
                    throw new ClassCastException(String.valueOf(hVar.F()));
            }
        } catch (ClassCastException e10) {
            throw new ClassCastException(a.b("insertion.of.illegal.element.1", e10.getMessage()));
        }
    }

    public boolean isEmpty() {
        int size = size();
        if (size == 0) {
            return true;
        }
        if (size != 1) {
            return false;
        }
        h hVar = (h) get(0);
        return hVar.F() == 10 && ((c) hVar).j();
    }

    /* access modifiers changed from: protected */
    public boolean k0(c cVar) {
        k d10 = cVar.d();
        String c10 = cVar.c();
        k kVar = this.f360f;
        if (kVar != null && !kVar.l()) {
            d10 = this.f360f.b(cVar.d());
        }
        if (size() > 0 && !cVar.i()) {
            try {
                c cVar2 = (c) get(size() - 1);
                if (!cVar2.i() && ((d10 == null || d10.compareTo(cVar2.d()) == 0) && !"".equals(cVar2.c().trim()) && !"".equals(c10.trim()))) {
                    cVar2.a(c10);
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        c cVar3 = new c(c10, d10);
        cVar3.l(cVar.b());
        return super.add(cVar3);
    }

    public k l0() {
        return this.f360f;
    }

    public r m0() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f360f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float n0() {
        /*
            r2 = this;
            float r0 = r2.f359e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L_0x0013
            a8.k r0 = r2.f360f
            if (r0 == 0) goto L_0x0013
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r0 = r0.e(r1)
            return r0
        L_0x0013:
            float r0 = r2.f359e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.u.n0():float");
    }

    public boolean o0() {
        return !Float.isNaN(this.f359e);
    }

    public void p0(r rVar) {
    }

    public boolean r(i iVar) {
        try {
            Iterator it = iterator();
            while (it.hasNext()) {
                iVar.b((h) it.next());
            }
            return true;
        } catch (g unused) {
            return false;
        }
    }

    public u(float f10) {
        this.f359e = f10;
        this.f360f = new k();
    }

    public u(float f10, String str, k kVar) {
        this.f359e = f10;
        this.f360f = kVar;
        if (str != null && str.length() != 0) {
            super.add(new c(str, kVar));
        }
    }

    public u(c cVar) {
        this.f359e = Float.NaN;
        super.add(cVar);
        this.f360f = cVar.d();
        cVar.f();
        p0((r) null);
    }

    public u(u uVar) {
        this.f359e = Float.NaN;
        addAll(uVar);
        this.f359e = uVar.n0();
        this.f360f = uVar.l0();
        uVar.m0();
        p0((r) null);
    }

    public u(String str) {
        this(Float.NaN, str, new k());
    }

    public u(String str, k kVar) {
        this(Float.NaN, str, kVar);
    }
}
