package e8;

import java.util.HashMap;

public class p1 extends l0 {

    /* renamed from: o  reason: collision with root package name */
    private static final String[] f10992o = {"crop", "trim", "art", "bleed"};

    /* renamed from: p  reason: collision with root package name */
    private static final c1[] f10993p = {c1.f10523z1, c1.f10337ka, c1.N, c1.f10379o0};

    /* renamed from: q  reason: collision with root package name */
    public static final f1 f10994q = new f1(0);

    /* renamed from: r  reason: collision with root package name */
    public static final f1 f10995r = new f1(90);

    /* renamed from: s  reason: collision with root package name */
    public static final f1 f10996s = new f1(180);

    /* renamed from: t  reason: collision with root package name */
    public static final f1 f10997t = new f1(270);

    /* renamed from: n  reason: collision with root package name */
    t1 f10998n;

    p1(t1 t1Var, HashMap hashMap, l0 l0Var, int i10) {
        super(l0.f10896k);
        this.f10998n = t1Var;
        r(c1.J5, t1Var);
        r(c1.f10309i8, l0Var);
        if (i10 != 0) {
            r(c1.A8, new f1(i10));
        }
        int i11 = 0;
        while (true) {
            String[] strArr = f10992o;
            if (i11 < strArr.length) {
                i1 i1Var = (i1) hashMap.get(strArr[i11]);
                if (i1Var != null) {
                    r(f10993p[i11], i1Var);
                }
                i11++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(x0 x0Var) {
        r(c1.f10393p1, x0Var);
    }
}
