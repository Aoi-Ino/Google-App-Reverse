package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.q;
import androidx.fragment.app.x;
import java.io.PrintWriter;
import java.util.ArrayList;

final class a extends x implements q.m {

    /* renamed from: t  reason: collision with root package name */
    final q f2926t;

    /* renamed from: u  reason: collision with root package name */
    boolean f2927u;

    /* renamed from: v  reason: collision with root package name */
    int f2928v;

    /* renamed from: w  reason: collision with root package name */
    boolean f2929w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(a aVar) {
        super(aVar.f2926t.t0(), aVar.f2926t.w0() != null ? aVar.f2926t.w0().f().getClassLoader() : null, aVar);
        this.f2928v = -1;
        this.f2929w = false;
        this.f2926t = aVar.f2926t;
        this.f2927u = aVar.f2927u;
        this.f2928v = aVar.f2928v;
        this.f2929w = aVar.f2929w;
    }

    /* access modifiers changed from: package-private */
    public i A(ArrayList arrayList, i iVar) {
        ArrayList arrayList2 = arrayList;
        i iVar2 = iVar;
        int i10 = 0;
        while (i10 < this.f3207c.size()) {
            x.a aVar = (x.a) this.f3207c.get(i10);
            int i11 = aVar.f3224a;
            if (i11 != 1) {
                if (i11 == 2) {
                    i iVar3 = aVar.f3225b;
                    int i12 = iVar3.C;
                    boolean z10 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        i iVar4 = (i) arrayList2.get(size);
                        if (iVar4.C == i12) {
                            if (iVar4 == iVar3) {
                                z10 = true;
                            } else {
                                if (iVar4 == iVar2) {
                                    this.f3207c.add(i10, new x.a(9, iVar4, true));
                                    i10++;
                                    iVar2 = null;
                                }
                                x.a aVar2 = new x.a(3, iVar4, true);
                                aVar2.f3227d = aVar.f3227d;
                                aVar2.f3229f = aVar.f3229f;
                                aVar2.f3228e = aVar.f3228e;
                                aVar2.f3230g = aVar.f3230g;
                                this.f3207c.add(i10, aVar2);
                                arrayList2.remove(iVar4);
                                i10++;
                            }
                        }
                    }
                    if (z10) {
                        this.f3207c.remove(i10);
                        i10--;
                    } else {
                        aVar.f3224a = 1;
                        aVar.f3226c = true;
                        arrayList2.add(iVar3);
                    }
                } else if (i11 == 3 || i11 == 6) {
                    arrayList2.remove(aVar.f3225b);
                    i iVar5 = aVar.f3225b;
                    if (iVar5 == iVar2) {
                        this.f3207c.add(i10, new x.a(9, iVar5));
                        i10++;
                        iVar2 = null;
                    }
                } else if (i11 != 7) {
                    if (i11 == 8) {
                        this.f3207c.add(i10, new x.a(9, iVar2, true));
                        aVar.f3226c = true;
                        i10++;
                        iVar2 = aVar.f3225b;
                    }
                }
                i10++;
            }
            arrayList2.add(aVar.f3225b);
            i10++;
        }
        return iVar2;
    }

    public String B() {
        return this.f3215k;
    }

    public void C() {
        if (this.f3223s != null) {
            for (int i10 = 0; i10 < this.f3223s.size(); i10++) {
                ((Runnable) this.f3223s.get(i10)).run();
            }
            this.f3223s = null;
        }
    }

    /* access modifiers changed from: package-private */
    public i D(ArrayList arrayList, i iVar) {
        for (int size = this.f3207c.size() - 1; size >= 0; size--) {
            x.a aVar = (x.a) this.f3207c.get(size);
            int i10 = aVar.f3224a;
            if (i10 != 1) {
                if (i10 != 3) {
                    switch (i10) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            iVar = null;
                            break;
                        case 9:
                            iVar = aVar.f3225b;
                            break;
                        case 10:
                            aVar.f3232i = aVar.f3231h;
                            break;
                    }
                }
                arrayList.add(aVar.f3225b);
            }
            arrayList.remove(aVar.f3225b);
        }
        return iVar;
    }

    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (q.J0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3213i) {
            return true;
        }
        this.f2926t.g(this);
        return true;
    }

    public int h() {
        return v(false);
    }

    public int i() {
        return v(true);
    }

    public void j() {
        l();
        this.f2926t.a0(this, false);
    }

    public void k() {
        l();
        this.f2926t.a0(this, true);
    }

    /* access modifiers changed from: package-private */
    public void m(int i10, i iVar, String str, int i11) {
        super.m(i10, iVar, str, i11);
        iVar.f3066x = this.f2926t;
    }

    public x n(i iVar) {
        q qVar = iVar.f3066x;
        if (qVar == null || qVar == this.f2926t) {
            return super.n(iVar);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + iVar.toString() + " is already attached to a FragmentManager.");
    }

    public x r(i iVar) {
        q qVar;
        if (iVar == null || (qVar = iVar.f3066x) == null || qVar == this.f2926t) {
            return super.r(iVar);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + iVar.toString() + " is already attached to a FragmentManager.");
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        if (this.f3213i) {
            if (q.J0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f3207c.size();
            for (int i11 = 0; i11 < size; i11++) {
                x.a aVar = (x.a) this.f3207c.get(i11);
                i iVar = aVar.f3225b;
                if (iVar != null) {
                    iVar.f3065w += i10;
                    if (q.J0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3225b + " to " + aVar.f3225b.f3065w);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2928v >= 0) {
            sb2.append(" #");
            sb2.append(this.f2928v);
        }
        if (this.f3215k != null) {
            sb2.append(" ");
            sb2.append(this.f3215k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public void u() {
        int size = this.f3207c.size() - 1;
        while (size >= 0) {
            x.a aVar = (x.a) this.f3207c.get(size);
            if (aVar.f3226c) {
                if (aVar.f3224a == 8) {
                    aVar.f3226c = false;
                    this.f3207c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f3225b.C;
                    aVar.f3224a = 2;
                    aVar.f3226c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        x.a aVar2 = (x.a) this.f3207c.get(i11);
                        if (aVar2.f3226c && aVar2.f3225b.C == i10) {
                            this.f3207c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    /* access modifiers changed from: package-private */
    public int v(boolean z10) {
        if (!this.f2927u) {
            if (q.J0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new c0("FragmentManager"));
                w("  ", printWriter);
                printWriter.close();
            }
            this.f2927u = true;
            this.f2928v = this.f3213i ? this.f2926t.k() : -1;
            this.f2926t.X(this, z10);
            return this.f2928v;
        }
        throw new IllegalStateException("commit already called");
    }

    public void w(String str, PrintWriter printWriter) {
        x(str, printWriter, true);
    }

    public void x(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3215k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f2928v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f2927u);
            if (this.f3212h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3212h));
            }
            if (!(this.f3208d == 0 && this.f3209e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3208d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3209e));
            }
            if (!(this.f3210f == 0 && this.f3211g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3210f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3211g));
            }
            if (!(this.f3216l == 0 && this.f3217m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3216l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3217m);
            }
            if (!(this.f3218n == 0 && this.f3219o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3218n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3219o);
            }
        }
        if (!this.f3207c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f3207c.size();
            for (int i10 = 0; i10 < size; i10++) {
                x.a aVar = (x.a) this.f3207c.get(i10);
                switch (aVar.f3224a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3224a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3225b);
                if (z10) {
                    if (!(aVar.f3227d == 0 && aVar.f3228e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3227d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3228e));
                    }
                    if (aVar.f3229f != 0 || aVar.f3230g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3229f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3230g));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y() {
        q qVar;
        int size = this.f3207c.size();
        for (int i10 = 0; i10 < size; i10++) {
            x.a aVar = (x.a) this.f3207c.get(i10);
            i iVar = aVar.f3225b;
            if (iVar != null) {
                iVar.f3060r = this.f2929w;
                iVar.N1(false);
                iVar.M1(this.f3212h);
                iVar.P1(this.f3220p, this.f3221q);
            }
            switch (aVar.f3224a) {
                case 1:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.t1(iVar, false);
                    this.f2926t.h(iVar);
                    continue;
                case 3:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.i1(iVar);
                    continue;
                case 4:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.G0(iVar);
                    continue;
                case 5:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.t1(iVar, false);
                    this.f2926t.x1(iVar);
                    continue;
                case 6:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.v(iVar);
                    continue;
                case 7:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.t1(iVar, false);
                    this.f2926t.m(iVar);
                    continue;
                case 8:
                    qVar = this.f2926t;
                    break;
                case 9:
                    qVar = this.f2926t;
                    iVar = null;
                    break;
                case 10:
                    this.f2926t.u1(iVar, aVar.f3232i);
                    continue;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3224a);
            }
            qVar.v1(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        q qVar;
        for (int size = this.f3207c.size() - 1; size >= 0; size--) {
            x.a aVar = (x.a) this.f3207c.get(size);
            i iVar = aVar.f3225b;
            if (iVar != null) {
                iVar.f3060r = this.f2929w;
                iVar.N1(true);
                iVar.M1(q.o1(this.f3212h));
                iVar.P1(this.f3221q, this.f3220p);
            }
            switch (aVar.f3224a) {
                case 1:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.t1(iVar, true);
                    this.f2926t.i1(iVar);
                    continue;
                case 3:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.h(iVar);
                    continue;
                case 4:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.x1(iVar);
                    continue;
                case 5:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.t1(iVar, true);
                    this.f2926t.G0(iVar);
                    continue;
                case 6:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.m(iVar);
                    continue;
                case 7:
                    iVar.J1(aVar.f3227d, aVar.f3228e, aVar.f3229f, aVar.f3230g);
                    this.f2926t.t1(iVar, true);
                    this.f2926t.v(iVar);
                    continue;
                case 8:
                    qVar = this.f2926t;
                    iVar = null;
                    break;
                case 9:
                    qVar = this.f2926t;
                    break;
                case 10:
                    this.f2926t.u1(iVar, aVar.f3231h);
                    continue;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3224a);
            }
            qVar.v1(iVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a(q qVar) {
        super(qVar.t0(), qVar.w0() != null ? qVar.w0().f().getClassLoader() : null);
        this.f2928v = -1;
        this.f2929w = false;
        this.f2926t = qVar;
    }
}
