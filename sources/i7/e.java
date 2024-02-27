package i7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k7.d;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private d f12526a = d.f13041k;

    /* renamed from: b  reason: collision with root package name */
    private n f12527b = n.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    private c f12528c = b.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    private final Map f12529d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final List f12530e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f12531f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private boolean f12532g = false;

    /* renamed from: h  reason: collision with root package name */
    private String f12533h = d.f12495z;

    /* renamed from: i  reason: collision with root package name */
    private int f12534i = 2;

    /* renamed from: j  reason: collision with root package name */
    private int f12535j = 2;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12536k = false;

    /* renamed from: l  reason: collision with root package name */
    private boolean f12537l = false;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12538m = true;

    /* renamed from: n  reason: collision with root package name */
    private boolean f12539n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f12540o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f12541p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f12542q = true;

    /* renamed from: r  reason: collision with root package name */
    private q f12543r = d.B;

    /* renamed from: s  reason: collision with root package name */
    private q f12544s = d.C;

    /* renamed from: t  reason: collision with root package name */
    private final LinkedList f12545t = new LinkedList();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r5, int r6, int r7, java.util.List r8) {
        /*
            r4 = this;
            boolean r0 = o7.d.f14452a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            l7.d$b r6 = l7.d.b.f13321b
            i7.s r6 = r6.b(r5)
            if (r0 == 0) goto L_0x0024
            l7.d$b r7 = o7.d.f14454c
            i7.s r1 = r7.b(r5)
            l7.d$b r7 = o7.d.f14453b
            i7.s r5 = r7.b(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            l7.d$b r5 = l7.d.b.f13321b
            i7.s r5 = r5.a(r6, r7)
            if (r0 == 0) goto L_0x0043
            l7.d$b r1 = o7.d.f14454c
            i7.s r1 = r1.a(r6, r7)
            l7.d$b r2 = o7.d.f14453b
            i7.s r6 = r2.a(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.e.a(java.lang.String, int, int, java.util.List):void");
    }

    public d b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f12530e.size() + this.f12531f.size() + 3);
        arrayList2.addAll(this.f12530e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f12531f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f12533h, this.f12534i, this.f12535j, arrayList2);
        d dVar = this.f12526a;
        c cVar = this.f12528c;
        HashMap hashMap = r5;
        HashMap hashMap2 = new HashMap(this.f12529d);
        boolean z10 = this.f12532g;
        boolean z11 = this.f12536k;
        boolean z12 = this.f12540o;
        boolean z13 = this.f12538m;
        boolean z14 = this.f12539n;
        boolean z15 = this.f12541p;
        boolean z16 = this.f12537l;
        boolean z17 = this.f12542q;
        n nVar = this.f12527b;
        String str = this.f12533h;
        int i10 = this.f12534i;
        int i11 = this.f12535j;
        ArrayList arrayList4 = r1;
        d dVar2 = dVar;
        ArrayList arrayList5 = new ArrayList(this.f12530e);
        ArrayList arrayList6 = r1;
        ArrayList arrayList7 = new ArrayList(this.f12531f);
        q qVar = this.f12543r;
        q qVar2 = this.f12544s;
        ArrayList arrayList8 = r1;
        ArrayList arrayList9 = new ArrayList(this.f12545t);
        return new d(dVar2, cVar, hashMap, z10, z11, z12, z13, z14, z15, z16, z17, nVar, str, i10, i11, arrayList4, arrayList6, arrayList, qVar, qVar2, arrayList8);
    }
}
