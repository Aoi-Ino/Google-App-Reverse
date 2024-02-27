package e8;

import java.util.ArrayList;

public class b0 extends i1 {

    /* renamed from: g  reason: collision with root package name */
    protected ArrayList f10175g;

    public b0() {
        super(5);
        this.f10175g = new ArrayList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(e8.c2 r5, java.io.OutputStream r6) {
        /*
            r4 = this;
            r0 = 91
            r6.write(r0)
            java.util.ArrayList r0 = r4.f10175g
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.next()
            e8.i1 r1 = (e8.i1) r1
            if (r1 != 0) goto L_0x001b
            e8.e1 r1 = e8.e1.f10628g
        L_0x001b:
            r1.k(r5, r6)
        L_0x001e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()
            e8.i1 r1 = (e8.i1) r1
            if (r1 != 0) goto L_0x002e
            e8.e1 r1 = e8.e1.f10628g
        L_0x002e:
            int r2 = r1.l()
            r3 = 5
            if (r2 == r3) goto L_0x001b
            r3 = 6
            if (r2 == r3) goto L_0x001b
            r3 = 4
            if (r2 == r3) goto L_0x001b
            r3 = 3
            if (r2 == r3) goto L_0x001b
            r2 = 32
            r6.write(r2)
            goto L_0x001b
        L_0x0044:
            r5 = 93
            r6.write(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.b0.k(e8.c2, java.io.OutputStream):void");
    }

    public boolean m(i1 i1Var) {
        return this.f10175g.add(i1Var);
    }

    public boolean n(float[] fArr) {
        for (float f1Var : fArr) {
            this.f10175g.add(new f1(f1Var));
        }
        return true;
    }

    public boolean o(int[] iArr) {
        for (int f1Var : iArr) {
            this.f10175g.add(new f1(f1Var));
        }
        return true;
    }

    public void p(i1 i1Var) {
        this.f10175g.add(0, i1Var);
    }

    public boolean q(i1 i1Var) {
        return this.f10175g.contains(i1Var);
    }

    public ArrayList r() {
        return this.f10175g;
    }

    public i1 s(int i10) {
        return (i1) this.f10175g.get(i10);
    }

    public int t() {
        return this.f10175g.size();
    }

    public String toString() {
        return this.f10175g.toString();
    }

    public b0(i1 i1Var) {
        super(5);
        ArrayList arrayList = new ArrayList();
        this.f10175g = arrayList;
        arrayList.add(i1Var);
    }

    public b0(float[] fArr) {
        super(5);
        this.f10175g = new ArrayList();
        n(fArr);
    }

    public b0(int[] iArr) {
        super(5);
        this.f10175g = new ArrayList();
        o(iArr);
    }
}
