package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s  reason: collision with root package name */
    int f3513s;

    /* renamed from: t  reason: collision with root package name */
    private c f3514t;

    /* renamed from: u  reason: collision with root package name */
    i f3515u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3516v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3517w;

    /* renamed from: x  reason: collision with root package name */
    boolean f3518x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f3519y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f3520z;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        i f3521a;

        /* renamed from: b  reason: collision with root package name */
        int f3522b;

        /* renamed from: c  reason: collision with root package name */
        int f3523c;

        /* renamed from: d  reason: collision with root package name */
        boolean f3524d;

        /* renamed from: e  reason: collision with root package name */
        boolean f3525e;

        a() {
            e();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3523c = this.f3524d ? this.f3521a.i() : this.f3521a.n();
        }

        public void b(View view, int i10) {
            this.f3523c = this.f3524d ? this.f3521a.d(view) + this.f3521a.p() : this.f3521a.g(view);
            this.f3522b = i10;
        }

        public void c(View view, int i10) {
            int p10 = this.f3521a.p();
            if (p10 >= 0) {
                b(view, i10);
                return;
            }
            this.f3522b = i10;
            if (this.f3524d) {
                int i11 = (this.f3521a.i() - p10) - this.f3521a.d(view);
                this.f3523c = this.f3521a.i() - i11;
                if (i11 > 0) {
                    int e10 = this.f3523c - this.f3521a.e(view);
                    int n10 = this.f3521a.n();
                    int min = e10 - (n10 + Math.min(this.f3521a.g(view) - n10, 0));
                    if (min < 0) {
                        this.f3523c += Math.min(i11, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g10 = this.f3521a.g(view);
            int n11 = g10 - this.f3521a.n();
            this.f3523c = g10;
            if (n11 > 0) {
                int i12 = (this.f3521a.i() - Math.min(0, (this.f3521a.i() - p10) - this.f3521a.d(view))) - (g10 + this.f3521a.e(view));
                if (i12 < 0) {
                    this.f3523c -= Math.min(n11, -i12);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public void e() {
            this.f3522b = -1;
            this.f3523c = Integer.MIN_VALUE;
            this.f3524d = false;
            this.f3525e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3522b + ", mCoordinate=" + this.f3523c + ", mLayoutFromEnd=" + this.f3524d + ", mValid=" + this.f3525e + '}';
        }
    }

    protected static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3526a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3527b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3528c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3529d;

        protected b() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3526a = 0;
            this.f3527b = false;
            this.f3528c = false;
            this.f3529d = false;
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f3530a = true;

        /* renamed from: b  reason: collision with root package name */
        int f3531b;

        /* renamed from: c  reason: collision with root package name */
        int f3532c;

        /* renamed from: d  reason: collision with root package name */
        int f3533d;

        /* renamed from: e  reason: collision with root package name */
        int f3534e;

        /* renamed from: f  reason: collision with root package name */
        int f3535f;

        /* renamed from: g  reason: collision with root package name */
        int f3536g;

        /* renamed from: h  reason: collision with root package name */
        int f3537h = 0;

        /* renamed from: i  reason: collision with root package name */
        int f3538i = 0;

        /* renamed from: j  reason: collision with root package name */
        boolean f3539j = false;

        /* renamed from: k  reason: collision with root package name */
        int f3540k;

        /* renamed from: l  reason: collision with root package name */
        List f3541l = null;

        /* renamed from: m  reason: collision with root package name */
        boolean f3542m;

        c() {
        }

        private View e() {
            int size = this.f3541l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = ((RecyclerView.d0) this.f3541l.get(i10)).f3622e;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f3533d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f10 = f(view);
            this.f3533d = f10 == null ? -1 : ((RecyclerView.q) f10.getLayoutParams()).a();
        }

        /* access modifiers changed from: package-private */
        public boolean c(RecyclerView.a0 a0Var) {
            int i10 = this.f3533d;
            return i10 >= 0 && i10 < a0Var.b();
        }

        /* access modifiers changed from: package-private */
        public View d(RecyclerView.v vVar) {
            if (this.f3541l != null) {
                return e();
            }
            View o10 = vVar.o(this.f3533d);
            this.f3533d += this.f3534e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f3541l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = ((RecyclerView.d0) this.f3541l.get(i11)).f3622e;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a10 = (qVar.a() - this.f3533d) * this.f3534e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        int f3543e;

        /* renamed from: f  reason: collision with root package name */
        int f3544f;

        /* renamed from: g  reason: collision with root package name */
        boolean f3545g;

        class a implements Parcelable.Creator {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f3543e = parcel.readInt();
            this.f3544f = parcel.readInt();
            this.f3545g = parcel.readInt() != 1 ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f3543e >= 0;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f3543e = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f3543e);
            parcel.writeInt(this.f3544f);
            parcel.writeInt(this.f3545g ? 1 : 0);
        }

        public d(d dVar) {
            this.f3543e = dVar.f3543e;
            this.f3544f = dVar.f3544f;
            this.f3545g = dVar.f3545g;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void A2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 >= 0) {
            int i12 = i10 - i11;
            int O = O();
            if (this.f3518x) {
                int i13 = O - 1;
                for (int i14 = i13; i14 >= 0; i14--) {
                    View N = N(i14);
                    if (this.f3515u.d(N) > i12 || this.f3515u.q(N) > i12) {
                        y2(vVar, i13, i14);
                        return;
                    }
                }
                return;
            }
            for (int i15 = 0; i15 < O; i15++) {
                View N2 = N(i15);
                if (this.f3515u.d(N2) > i12 || this.f3515u.q(N2) > i12) {
                    y2(vVar, 0, i15);
                    return;
                }
            }
        }
    }

    private void C2() {
        this.f3518x = (this.f3513s == 1 || !s2()) ? this.f3517w : !this.f3517w;
    }

    private boolean H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        View l22;
        boolean z10 = false;
        if (O() == 0) {
            return false;
        }
        View a02 = a0();
        if (a02 == null || !aVar.d(a02, a0Var)) {
            boolean z11 = this.f3516v;
            boolean z12 = this.f3519y;
            if (z11 != z12 || (l22 = l2(vVar, a0Var, aVar.f3524d, z12)) == null) {
                return false;
            }
            aVar.b(l22, n0(l22));
            if (!a0Var.e() && R1()) {
                int g10 = this.f3515u.g(l22);
                int d10 = this.f3515u.d(l22);
                int n10 = this.f3515u.n();
                int i10 = this.f3515u.i();
                boolean z13 = d10 <= n10 && g10 < n10;
                if (g10 >= i10 && d10 > i10) {
                    z10 = true;
                }
                if (z13 || z10) {
                    if (aVar.f3524d) {
                        n10 = i10;
                    }
                    aVar.f3523c = n10;
                }
            }
            return true;
        }
        aVar.c(a02, n0(a02));
        return true;
    }

    private boolean I2(RecyclerView.a0 a0Var, a aVar) {
        int i10;
        boolean z10 = false;
        if (!a0Var.e() && (i10 = this.A) != -1) {
            if (i10 < 0 || i10 >= a0Var.b()) {
                this.A = -1;
                this.B = Integer.MIN_VALUE;
            } else {
                aVar.f3522b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.c()) {
                    boolean z11 = this.D.f3545g;
                    aVar.f3524d = z11;
                    aVar.f3523c = z11 ? this.f3515u.i() - this.D.f3544f : this.f3515u.n() + this.D.f3544f;
                    return true;
                } else if (this.B == Integer.MIN_VALUE) {
                    View H2 = H(this.A);
                    if (H2 == null) {
                        if (O() > 0) {
                            if ((this.A < n0(N(0))) == this.f3518x) {
                                z10 = true;
                            }
                            aVar.f3524d = z10;
                        }
                        aVar.a();
                    } else if (this.f3515u.e(H2) > this.f3515u.o()) {
                        aVar.a();
                        return true;
                    } else if (this.f3515u.g(H2) - this.f3515u.n() < 0) {
                        aVar.f3523c = this.f3515u.n();
                        aVar.f3524d = false;
                        return true;
                    } else if (this.f3515u.i() - this.f3515u.d(H2) < 0) {
                        aVar.f3523c = this.f3515u.i();
                        aVar.f3524d = true;
                        return true;
                    } else {
                        aVar.f3523c = aVar.f3524d ? this.f3515u.d(H2) + this.f3515u.p() : this.f3515u.g(H2);
                    }
                    return true;
                } else {
                    boolean z12 = this.f3518x;
                    aVar.f3524d = z12;
                    aVar.f3523c = z12 ? this.f3515u.i() - this.B : this.f3515u.n() + this.B;
                    return true;
                }
            }
        }
        return false;
    }

    private void J2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!I2(a0Var, aVar) && !H2(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.f3522b = this.f3519y ? a0Var.b() - 1 : 0;
        }
    }

    private void K2(int i10, int i11, boolean z10, RecyclerView.a0 a0Var) {
        int i12;
        this.f3514t.f3542m = B2();
        this.f3514t.f3535f = i10;
        int[] iArr = this.H;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        S1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f3514t;
        int i14 = z11 ? max2 : max;
        cVar.f3537h = i14;
        if (!z11) {
            max = max2;
        }
        cVar.f3538i = max;
        if (z11) {
            cVar.f3537h = i14 + this.f3515u.j();
            View o22 = o2();
            c cVar2 = this.f3514t;
            if (this.f3518x) {
                i13 = -1;
            }
            cVar2.f3534e = i13;
            int n02 = n0(o22);
            c cVar3 = this.f3514t;
            cVar2.f3533d = n02 + cVar3.f3534e;
            cVar3.f3531b = this.f3515u.d(o22);
            i12 = this.f3515u.d(o22) - this.f3515u.i();
        } else {
            View p22 = p2();
            this.f3514t.f3537h += this.f3515u.n();
            c cVar4 = this.f3514t;
            if (!this.f3518x) {
                i13 = -1;
            }
            cVar4.f3534e = i13;
            int n03 = n0(p22);
            c cVar5 = this.f3514t;
            cVar4.f3533d = n03 + cVar5.f3534e;
            cVar5.f3531b = this.f3515u.g(p22);
            i12 = (-this.f3515u.g(p22)) + this.f3515u.n();
        }
        c cVar6 = this.f3514t;
        cVar6.f3532c = i11;
        if (z10) {
            cVar6.f3532c = i11 - i12;
        }
        cVar6.f3536g = i12;
    }

    private void L2(int i10, int i11) {
        this.f3514t.f3532c = this.f3515u.i() - i11;
        c cVar = this.f3514t;
        cVar.f3534e = this.f3518x ? -1 : 1;
        cVar.f3533d = i10;
        cVar.f3535f = 1;
        cVar.f3531b = i11;
        cVar.f3536g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f3522b, aVar.f3523c);
    }

    private void N2(int i10, int i11) {
        this.f3514t.f3532c = i11 - this.f3515u.n();
        c cVar = this.f3514t;
        cVar.f3533d = i10;
        cVar.f3534e = this.f3518x ? 1 : -1;
        cVar.f3535f = -1;
        cVar.f3531b = i11;
        cVar.f3536g = Integer.MIN_VALUE;
    }

    private void O2(a aVar) {
        N2(aVar.f3522b, aVar.f3523c);
    }

    private int U1(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        i iVar = this.f3515u;
        View d22 = d2(!this.f3520z, true);
        return l.a(a0Var, iVar, d22, c2(!this.f3520z, true), this, this.f3520z);
    }

    private int V1(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        i iVar = this.f3515u;
        View d22 = d2(!this.f3520z, true);
        return l.b(a0Var, iVar, d22, c2(!this.f3520z, true), this, this.f3520z, this.f3518x);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (O() == 0) {
            return 0;
        }
        Z1();
        i iVar = this.f3515u;
        View d22 = d2(!this.f3520z, true);
        return l.c(a0Var, iVar, d22, c2(!this.f3520z, true), this, this.f3520z);
    }

    private View b2() {
        return h2(0, O());
    }

    private View f2() {
        return h2(O() - 1, -1);
    }

    private View j2() {
        return this.f3518x ? b2() : f2();
    }

    private View k2() {
        return this.f3518x ? f2() : b2();
    }

    private int m2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i11;
        int i12 = this.f3515u.i() - i10;
        if (i12 <= 0) {
            return 0;
        }
        int i13 = -D2(-i12, vVar, a0Var);
        int i14 = i10 + i13;
        if (!z10 || (i11 = this.f3515u.i() - i14) <= 0) {
            return i13;
        }
        this.f3515u.s(i11);
        return i11 + i13;
    }

    private int n2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int n10;
        int n11 = i10 - this.f3515u.n();
        if (n11 <= 0) {
            return 0;
        }
        int i11 = -D2(n11, vVar, a0Var);
        int i12 = i10 + i11;
        if (!z10 || (n10 = i12 - this.f3515u.n()) <= 0) {
            return i11;
        }
        this.f3515u.s(-n10);
        return i11 - n10;
    }

    private View o2() {
        return N(this.f3518x ? 0 : O() - 1);
    }

    private View p2() {
        return N(this.f3518x ? O() - 1 : 0);
    }

    private void v2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11) {
        if (a0Var.g() && O() != 0 && !a0Var.e() && R1()) {
            List k10 = vVar.k();
            int size = k10.size();
            int n02 = n0(N(0));
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.d0 d0Var = (RecyclerView.d0) k10.get(i14);
                if (!d0Var.x()) {
                    if ((d0Var.o() < n02) != this.f3518x) {
                        i12 += this.f3515u.e(d0Var.f3622e);
                    } else {
                        i13 += this.f3515u.e(d0Var.f3622e);
                    }
                }
            }
            this.f3514t.f3541l = k10;
            if (i12 > 0) {
                N2(n0(p2()), i10);
                c cVar = this.f3514t;
                cVar.f3537h = i12;
                cVar.f3532c = 0;
                cVar.a();
                a2(vVar, this.f3514t, a0Var, false);
            }
            if (i13 > 0) {
                L2(n0(o2()), i11);
                c cVar2 = this.f3514t;
                cVar2.f3537h = i13;
                cVar2.f3532c = 0;
                cVar2.a();
                a2(vVar, this.f3514t, a0Var, false);
            }
            this.f3514t.f3541l = null;
        }
    }

    private void x2(RecyclerView.v vVar, c cVar) {
        if (cVar.f3530a && !cVar.f3542m) {
            int i10 = cVar.f3536g;
            int i11 = cVar.f3538i;
            if (cVar.f3535f == -1) {
                z2(vVar, i10, i11);
            } else {
                A2(vVar, i10, i11);
            }
        }
    }

    private void y2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 != i11) {
            if (i11 > i10) {
                for (int i12 = i11 - 1; i12 >= i10; i12--) {
                    t1(i12, vVar);
                }
                return;
            }
            while (i10 > i11) {
                t1(i10, vVar);
                i10--;
            }
        }
    }

    private void z2(RecyclerView.v vVar, int i10, int i11) {
        int O = O();
        if (i10 >= 0) {
            int h10 = (this.f3515u.h() - i10) + i11;
            if (this.f3518x) {
                for (int i12 = 0; i12 < O; i12++) {
                    View N = N(i12);
                    if (this.f3515u.g(N) < h10 || this.f3515u.r(N) < h10) {
                        y2(vVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = O - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View N2 = N(i14);
                if (this.f3515u.g(N2) < h10 || this.f3515u.r(N2) < h10) {
                    y2(vVar, i13, i14);
                    return;
                }
            }
        }
    }

    public int A(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean B2() {
        return this.f3515u.l() == 0 && this.f3515u.h() == 0;
    }

    public int C1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3513s == 1) {
            return 0;
        }
        return D2(i10, vVar, a0Var);
    }

    public void D1(int i10) {
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.d();
        }
        z1();
    }

    /* access modifiers changed from: package-private */
    public int D2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        Z1();
        this.f3514t.f3530a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        K2(i11, abs, true, a0Var);
        c cVar = this.f3514t;
        int a22 = cVar.f3536g + a2(vVar, cVar, a0Var, false);
        if (a22 < 0) {
            return 0;
        }
        if (abs > a22) {
            i10 = i11 * a22;
        }
        this.f3515u.s(-i10);
        this.f3514t.f3540k = i10;
        return i10;
    }

    public int E1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3513s == 0) {
            return 0;
        }
        return D2(i10, vVar, a0Var);
    }

    public void E2(int i10) {
        if (i10 == 0 || i10 == 1) {
            l((String) null);
            if (i10 != this.f3513s || this.f3515u == null) {
                i b10 = i.b(this, i10);
                this.f3515u = b10;
                this.E.f3521a = b10;
                this.f3513s = i10;
                z1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void F2(boolean z10) {
        l((String) null);
        if (z10 != this.f3517w) {
            this.f3517w = z10;
            z1();
        }
    }

    public void G2(boolean z10) {
        l((String) null);
        if (this.f3519y != z10) {
            this.f3519y = z10;
            z1();
        }
    }

    public View H(int i10) {
        int O = O();
        if (O == 0) {
            return null;
        }
        int n02 = i10 - n0(N(0));
        if (n02 >= 0 && n02 < O) {
            View N = N(n02);
            if (n0(N) == i10) {
                return N;
            }
        }
        return super.H(i10);
    }

    public RecyclerView.q I() {
        return new RecyclerView.q(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public boolean M1() {
        return (c0() == 1073741824 || v0() == 1073741824 || !w0()) ? false : true;
    }

    public void O0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.O0(recyclerView, vVar);
        if (this.C) {
            q1(vVar);
            vVar.c();
        }
    }

    public void O1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        P1(gVar);
    }

    public View P0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int X1;
        C2();
        if (O() == 0 || (X1 = X1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        Z1();
        K2(X1, (int) (((float) this.f3515u.o()) * 0.33333334f), false, a0Var);
        c cVar = this.f3514t;
        cVar.f3536g = Integer.MIN_VALUE;
        cVar.f3530a = false;
        a2(vVar, cVar, a0Var, true);
        View k22 = X1 == -1 ? k2() : j2();
        View p22 = X1 == -1 ? p2() : o2();
        if (!p22.hasFocusable()) {
            return k22;
        }
        if (k22 == null) {
            return null;
        }
        return p22;
    }

    public void Q0(AccessibilityEvent accessibilityEvent) {
        super.Q0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(e2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    public boolean R1() {
        return this.D == null && this.f3516v == this.f3519y;
    }

    /* access modifiers changed from: protected */
    public void S1(RecyclerView.a0 a0Var, int[] iArr) {
        int i10;
        int q22 = q2(a0Var);
        if (this.f3514t.f3535f == -1) {
            i10 = 0;
        } else {
            i10 = q22;
            q22 = 0;
        }
        iArr[0] = q22;
        iArr[1] = i10;
    }

    /* access modifiers changed from: package-private */
    public void T1(RecyclerView.a0 a0Var, c cVar, RecyclerView.p.c cVar2) {
        int i10 = cVar.f3533d;
        if (i10 >= 0 && i10 < a0Var.b()) {
            cVar2.a(i10, Math.max(0, cVar.f3536g));
        }
    }

    /* access modifiers changed from: package-private */
    public int X1(int i10) {
        if (i10 == 1) {
            return (this.f3513s != 1 && s2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3513s != 1 && s2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f3513s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f3513s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f3513s == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f3513s == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    public c Y1() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void Z1() {
        if (this.f3514t == null) {
            this.f3514t = Y1();
        }
    }

    /* access modifiers changed from: package-private */
    public int a2(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10 = cVar.f3532c;
        int i11 = cVar.f3536g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f3536g = i11 + i10;
            }
            x2(vVar, cVar);
        }
        int i12 = cVar.f3532c + cVar.f3537h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f3542m && i12 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            u2(vVar, a0Var, cVar, bVar);
            if (!bVar.f3527b) {
                cVar.f3531b += bVar.f3526a * cVar.f3535f;
                if (!bVar.f3528c || cVar.f3541l != null || !a0Var.e()) {
                    int i13 = cVar.f3532c;
                    int i14 = bVar.f3526a;
                    cVar.f3532c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f3536g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f3526a;
                    cVar.f3536g = i16;
                    int i17 = cVar.f3532c;
                    if (i17 < 0) {
                        cVar.f3536g = i16 + i17;
                    }
                    x2(vVar, cVar);
                }
                if (z10 && bVar.f3529d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f3532c;
    }

    /* access modifiers changed from: package-private */
    public View c2(boolean z10, boolean z11) {
        int O;
        int i10;
        if (this.f3518x) {
            O = 0;
            i10 = O();
        } else {
            O = O() - 1;
            i10 = -1;
        }
        return i2(O, i10, z10, z11);
    }

    public PointF d(int i10) {
        if (O() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < n0(N(0))) {
            z10 = true;
        }
        if (z10 != this.f3518x) {
            i11 = -1;
        }
        return this.f3513s == 0 ? new PointF((float) i11, 0.0f) : new PointF(0.0f, (float) i11);
    }

    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int m22;
        int i14;
        View H2;
        int g10;
        int i15;
        int i16 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            q1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.c()) {
            this.A = this.D.f3543e;
        }
        Z1();
        this.f3514t.f3530a = false;
        C2();
        View a02 = a0();
        a aVar = this.E;
        if (!aVar.f3525e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f3524d = this.f3518x ^ this.f3519y;
            J2(vVar, a0Var, aVar2);
            this.E.f3525e = true;
        } else if (a02 != null && (this.f3515u.g(a02) >= this.f3515u.i() || this.f3515u.d(a02) <= this.f3515u.n())) {
            this.E.c(a02, n0(a02));
        }
        c cVar = this.f3514t;
        cVar.f3535f = cVar.f3540k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        S1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.f3515u.n();
        int max2 = Math.max(0, this.H[1]) + this.f3515u.j();
        if (!(!a0Var.e() || (i14 = this.A) == -1 || this.B == Integer.MIN_VALUE || (H2 = H(i14)) == null)) {
            if (this.f3518x) {
                i15 = this.f3515u.i() - this.f3515u.d(H2);
                g10 = this.B;
            } else {
                g10 = this.f3515u.g(H2) - this.f3515u.n();
                i15 = this.B;
            }
            int i17 = i15 - g10;
            if (i17 > 0) {
                max += i17;
            } else {
                max2 -= i17;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f3524d ? !this.f3518x : this.f3518x) {
            i16 = 1;
        }
        w2(vVar, a0Var, aVar3, i16);
        B(vVar);
        this.f3514t.f3542m = B2();
        this.f3514t.f3539j = a0Var.e();
        this.f3514t.f3538i = 0;
        a aVar4 = this.E;
        if (aVar4.f3524d) {
            O2(aVar4);
            c cVar2 = this.f3514t;
            cVar2.f3537h = max;
            a2(vVar, cVar2, a0Var, false);
            c cVar3 = this.f3514t;
            i11 = cVar3.f3531b;
            int i18 = cVar3.f3533d;
            int i19 = cVar3.f3532c;
            if (i19 > 0) {
                max2 += i19;
            }
            M2(this.E);
            c cVar4 = this.f3514t;
            cVar4.f3537h = max2;
            cVar4.f3533d += cVar4.f3534e;
            a2(vVar, cVar4, a0Var, false);
            c cVar5 = this.f3514t;
            i10 = cVar5.f3531b;
            int i20 = cVar5.f3532c;
            if (i20 > 0) {
                N2(i18, i11);
                c cVar6 = this.f3514t;
                cVar6.f3537h = i20;
                a2(vVar, cVar6, a0Var, false);
                i11 = this.f3514t.f3531b;
            }
        } else {
            M2(aVar4);
            c cVar7 = this.f3514t;
            cVar7.f3537h = max2;
            a2(vVar, cVar7, a0Var, false);
            c cVar8 = this.f3514t;
            i10 = cVar8.f3531b;
            int i21 = cVar8.f3533d;
            int i22 = cVar8.f3532c;
            if (i22 > 0) {
                max += i22;
            }
            O2(this.E);
            c cVar9 = this.f3514t;
            cVar9.f3537h = max;
            cVar9.f3533d += cVar9.f3534e;
            a2(vVar, cVar9, a0Var, false);
            c cVar10 = this.f3514t;
            i11 = cVar10.f3531b;
            int i23 = cVar10.f3532c;
            if (i23 > 0) {
                L2(i21, i10);
                c cVar11 = this.f3514t;
                cVar11.f3537h = i23;
                a2(vVar, cVar11, a0Var, false);
                i10 = this.f3514t.f3531b;
            }
        }
        if (O() > 0) {
            if (this.f3518x ^ this.f3519y) {
                int m23 = m2(i10, vVar, a0Var, true);
                i12 = i11 + m23;
                i13 = i10 + m23;
                m22 = n2(i12, vVar, a0Var, false);
            } else {
                int n22 = n2(i11, vVar, a0Var, true);
                i12 = i11 + n22;
                i13 = i10 + n22;
                m22 = m2(i13, vVar, a0Var, false);
            }
            i11 = i12 + m22;
            i10 = i13 + m22;
        }
        v2(vVar, a0Var, i11, i10);
        if (!a0Var.e()) {
            this.f3515u.t();
        } else {
            this.E.e();
        }
        this.f3516v = this.f3519y;
    }

    /* access modifiers changed from: package-private */
    public View d2(boolean z10, boolean z11) {
        int i10;
        int O;
        if (this.f3518x) {
            i10 = O() - 1;
            O = -1;
        } else {
            i10 = 0;
            O = O();
        }
        return i2(i10, O, z10, z11);
    }

    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int e2() {
        View i22 = i2(0, O(), false, true);
        if (i22 == null) {
            return -1;
        }
        return n0(i22);
    }

    public int g2() {
        View i22 = i2(O() - 1, -1, false, true);
        if (i22 == null) {
            return -1;
        }
        return n0(i22);
    }

    /* access modifiers changed from: package-private */
    public View h2(int i10, int i11) {
        int i12;
        int i13;
        Z1();
        if (i11 <= i10 && i11 >= i10) {
            return N(i10);
        }
        if (this.f3515u.g(N(i10)) < this.f3515u.n()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        return (this.f3513s == 0 ? this.f3666e : this.f3667f).a(i10, i11, i13, i12);
    }

    public void i1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.d();
            }
            z1();
        }
    }

    /* access modifiers changed from: package-private */
    public View i2(int i10, int i11, boolean z10, boolean z11) {
        Z1();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return (this.f3513s == 0 ? this.f3666e : this.f3667f).a(i10, i11, i13, i12);
    }

    public Parcelable j1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (O() > 0) {
            Z1();
            boolean z10 = this.f3516v ^ this.f3518x;
            dVar.f3545g = z10;
            if (z10) {
                View o22 = o2();
                dVar.f3544f = this.f3515u.i() - this.f3515u.d(o22);
                dVar.f3543e = n0(o22);
            } else {
                View p22 = p2();
                dVar.f3543e = n0(p22);
                dVar.f3544f = this.f3515u.g(p22) - this.f3515u.n();
            }
        } else {
            dVar.d();
        }
        return dVar;
    }

    public void l(String str) {
        if (this.D == null) {
            super.l(str);
        }
    }

    /* access modifiers changed from: package-private */
    public View l2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int i12;
        Z1();
        int O = O();
        if (z11) {
            i12 = O() - 1;
            i11 = -1;
            i10 = -1;
        } else {
            i11 = O;
            i12 = 0;
            i10 = 1;
        }
        int b10 = a0Var.b();
        int n10 = this.f3515u.n();
        int i13 = this.f3515u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i12 != i11) {
            View N = N(i12);
            int n02 = n0(N);
            int g10 = this.f3515u.g(N);
            int d10 = this.f3515u.d(N);
            if (n02 >= 0 && n02 < b10) {
                if (!((RecyclerView.q) N.getLayoutParams()).c()) {
                    boolean z12 = d10 <= n10 && g10 < n10;
                    boolean z13 = g10 >= i13 && d10 > i13;
                    if (!z12 && !z13) {
                        return N;
                    }
                    if (z10) {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = N;
                        }
                    } else if (!z12) {
                        if (view != null) {
                        }
                        view = N;
                    }
                    view2 = N;
                } else if (view3 == null) {
                    view3 = N;
                }
            }
            i12 += i10;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public boolean p() {
        return this.f3513s == 0;
    }

    public boolean q() {
        return this.f3513s == 1;
    }

    /* access modifiers changed from: protected */
    public int q2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.f3515u.o();
        }
        return 0;
    }

    public int r2() {
        return this.f3513s;
    }

    /* access modifiers changed from: protected */
    public boolean s2() {
        return d0() == 1;
    }

    public void t(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.p.c cVar) {
        if (this.f3513s != 0) {
            i10 = i11;
        }
        if (O() != 0 && i10 != 0) {
            Z1();
            K2(i10 > 0 ? 1 : -1, Math.abs(i10), true, a0Var);
            T1(a0Var, this.f3514t, cVar);
        }
    }

    public boolean t2() {
        return this.f3520z;
    }

    public void u(int i10, RecyclerView.p.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.D;
        int i12 = -1;
        if (dVar == null || !dVar.c()) {
            C2();
            z10 = this.f3518x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z10 = dVar2.f3545g;
            i11 = dVar2.f3543e;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    /* access modifiers changed from: package-private */
    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View d10 = cVar.d(vVar);
        if (d10 == null) {
            bVar.f3527b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d10.getLayoutParams();
        if (cVar.f3541l == null) {
            if (this.f3518x == (cVar.f3535f == -1)) {
                i(d10);
            } else {
                j(d10, 0);
            }
        } else {
            if (this.f3518x == (cVar.f3535f == -1)) {
                g(d10);
            } else {
                h(d10, 0);
            }
        }
        G0(d10, 0, 0);
        bVar.f3526a = this.f3515u.e(d10);
        if (this.f3513s == 1) {
            if (s2()) {
                i14 = u0() - k0();
                i13 = i14 - this.f3515u.f(d10);
            } else {
                i13 = j0();
                i14 = this.f3515u.f(d10) + i13;
            }
            int i15 = cVar.f3535f;
            int i16 = cVar.f3531b;
            if (i15 == -1) {
                i10 = i16;
                i11 = i14;
                i12 = i16 - bVar.f3526a;
            } else {
                i12 = i16;
                i11 = i14;
                i10 = bVar.f3526a + i16;
            }
        } else {
            int m02 = m0();
            int f10 = this.f3515u.f(d10) + m02;
            int i17 = cVar.f3535f;
            int i18 = cVar.f3531b;
            if (i17 == -1) {
                i11 = i18;
                i12 = m02;
                i10 = f10;
                i13 = i18 - bVar.f3526a;
            } else {
                i12 = m02;
                i11 = bVar.f3526a + i18;
                i10 = f10;
                i13 = i18;
            }
        }
        F0(d10, i13, i12, i11, i10);
        if (qVar.c() || qVar.b()) {
            bVar.f3528c = true;
        }
        bVar.f3529d = d10.hasFocusable();
    }

    public int v(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    public int w(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void w2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i10) {
    }

    public int x(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    public int y(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    public boolean y0() {
        return true;
    }

    public int z(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f3513s = 1;
        this.f3517w = false;
        this.f3518x = false;
        this.f3519y = false;
        this.f3520z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i10);
        F2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f3513s = 1;
        this.f3517w = false;
        this.f3518x = false;
        this.f3519y = false;
        this.f3520z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d o02 = RecyclerView.p.o0(context, attributeSet, i10, i11);
        E2(o02.f3682a);
        F2(o02.f3684c);
        G2(o02.f3685d);
    }
}
