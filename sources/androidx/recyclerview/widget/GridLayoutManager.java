package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    boolean I = false;
    int J = -1;
    int[] K;
    View[] L;
    final SparseIntArray M = new SparseIntArray();
    final SparseIntArray N = new SparseIntArray();
    c O = new a();
    final Rect P = new Rect();
    private boolean Q;

    public static final class a extends c {
        public int e(int i10, int i11) {
            return i10 % i11;
        }

        public int f(int i10) {
            return 1;
        }
    }

    public static class b extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        int f3507e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f3508f = 0;

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public int e() {
            return this.f3507e;
        }

        public int f() {
            return this.f3508f;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f3509a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f3510b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f3511c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f3512d = false;

        static int a(SparseIntArray sparseIntArray, int i10) {
            int size = sparseIntArray.size() - 1;
            int i11 = 0;
            while (i11 <= size) {
                int i12 = (i11 + size) >>> 1;
                if (sparseIntArray.keyAt(i12) < i10) {
                    i11 = i12 + 1;
                } else {
                    size = i12 - 1;
                }
            }
            int i13 = i11 - 1;
            if (i13 < 0 || i13 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i13);
        }

        /* access modifiers changed from: package-private */
        public int b(int i10, int i11) {
            if (!this.f3512d) {
                return d(i10, i11);
            }
            int i12 = this.f3510b.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int d10 = d(i10, i11);
            this.f3510b.put(i10, d10);
            return d10;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (!this.f3511c) {
                return e(i10, i11);
            }
            int i12 = this.f3509a.get(i10, -1);
            if (i12 != -1) {
                return i12;
            }
            int e10 = e(i10, i11);
            this.f3509a.put(i10, e10);
            return e10;
        }

        public int d(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int a10;
            if (!this.f3512d || (a10 = a(this.f3510b, i10)) == -1) {
                i14 = 0;
                i13 = 0;
                i12 = 0;
            } else {
                i14 = this.f3510b.get(a10);
                i13 = a10 + 1;
                i12 = c(a10, i11) + f(a10);
                if (i12 == i11) {
                    i14++;
                    i12 = 0;
                }
            }
            int f10 = f(i10);
            while (i13 < i10) {
                int f11 = f(i13);
                int i15 = i12 + f11;
                if (i15 == i11) {
                    i14++;
                    i15 = 0;
                } else if (i15 > i11) {
                    i14++;
                    i15 = f11;
                }
                i13++;
            }
            return i12 + f10 > i11 ? i14 + 1 : i14;
        }

        public abstract int e(int i10, int i11);

        public abstract int f(int i10);

        public void g() {
            this.f3510b.clear();
        }

        public void h() {
            this.f3509a.clear();
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(context);
        f3(i10);
    }

    private void P2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (z10) {
            i13 = 1;
            i11 = i10;
            i12 = 0;
        } else {
            i12 = i10 - 1;
            i11 = -1;
            i13 = -1;
        }
        while (i12 != i11) {
            View view = this.L[i12];
            b bVar = (b) view.getLayoutParams();
            int b32 = b3(vVar, a0Var, n0(view));
            bVar.f3508f = b32;
            bVar.f3507e = i14;
            i14 += b32;
            i12 += i13;
        }
    }

    private void Q2() {
        int O2 = O();
        for (int i10 = 0; i10 < O2; i10++) {
            b bVar = (b) N(i10).getLayoutParams();
            int a10 = bVar.a();
            this.M.put(a10, bVar.f());
            this.N.put(a10, bVar.e());
        }
    }

    private void R2(int i10) {
        this.K = S2(this.K, this.J, i10);
    }

    static int[] S2(int[] iArr, int i10, int i11) {
        int i12;
        if (!(iArr != null && iArr.length == i10 + 1 && iArr[iArr.length - 1] == i11)) {
            iArr = new int[(i10 + 1)];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i11 / i10;
        int i15 = i11 % i10;
        int i16 = 0;
        for (int i17 = 1; i17 <= i10; i17++) {
            i13 += i15;
            if (i13 <= 0 || i10 - i13 >= i15) {
                i12 = i14;
            } else {
                i12 = i14 + 1;
                i13 -= i10;
            }
            i16 += i12;
            iArr[i17] = i16;
        }
        return iArr;
    }

    private void T2() {
        this.M.clear();
        this.N.clear();
    }

    private int U2(RecyclerView.a0 a0Var) {
        if (!(O() == 0 || a0Var.b() == 0)) {
            Z1();
            boolean t22 = t2();
            View d22 = d2(!t22, true);
            View c22 = c2(!t22, true);
            if (!(d22 == null || c22 == null)) {
                int b10 = this.O.b(n0(d22), this.J);
                int b11 = this.O.b(n0(c22), this.J);
                int min = Math.min(b10, b11);
                int max = this.f3518x ? Math.max(0, ((this.O.b(a0Var.b() - 1, this.J) + 1) - Math.max(b10, b11)) - 1) : Math.max(0, min);
                if (!t22) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f3515u.d(c22) - this.f3515u.g(d22))) / ((float) ((this.O.b(n0(c22), this.J) - this.O.b(n0(d22), this.J)) + 1)))) + ((float) (this.f3515u.n() - this.f3515u.g(d22))));
            }
        }
        return 0;
    }

    private int V2(RecyclerView.a0 a0Var) {
        if (!(O() == 0 || a0Var.b() == 0)) {
            Z1();
            View d22 = d2(!t2(), true);
            View c22 = c2(!t2(), true);
            if (!(d22 == null || c22 == null)) {
                if (!t2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int d10 = this.f3515u.d(c22) - this.f3515u.g(d22);
                int b10 = this.O.b(n0(d22), this.J);
                return (int) ((((float) d10) / ((float) ((this.O.b(n0(c22), this.J) - b10) + 1))) * ((float) (this.O.b(a0Var.b() - 1, this.J) + 1)));
            }
        }
        return 0;
    }

    private void W2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        boolean z10 = i10 == 1;
        int a32 = a3(vVar, a0Var, aVar.f3522b);
        if (z10) {
            while (a32 > 0) {
                int i11 = aVar.f3522b;
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    aVar.f3522b = i12;
                    a32 = a3(vVar, a0Var, i12);
                } else {
                    return;
                }
            }
            return;
        }
        int b10 = a0Var.b() - 1;
        int i13 = aVar.f3522b;
        while (i13 < b10) {
            int i14 = i13 + 1;
            int a33 = a3(vVar, a0Var, i14);
            if (a33 <= a32) {
                break;
            }
            i13 = i14;
            a32 = a33;
        }
        aVar.f3522b = i13;
    }

    private void X2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int Z2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.b(i10, this.J);
        }
        int f10 = vVar.f(i10);
        if (f10 != -1) {
            return this.O.b(f10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    private int a3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.c(i10, this.J);
        }
        int i11 = this.N.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = vVar.f(i10);
        if (f10 != -1) {
            return this.O.c(f10, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    private int b3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10) {
        if (!a0Var.e()) {
            return this.O.f(i10);
        }
        int i11 = this.M.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int f10 = vVar.f(i10);
        if (f10 != -1) {
            return this.O.f(f10);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    private void c3(float f10, int i10) {
        R2(Math.max(Math.round(f10 * ((float) this.J)), i10));
    }

    private void d3(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3687b;
        int i13 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i14 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int Y2 = Y2(bVar.f3507e, bVar.f3508f);
        if (this.f3513s == 1) {
            i11 = RecyclerView.p.P(Y2, i10, i14, bVar.width, false);
            i12 = RecyclerView.p.P(this.f3515u.o(), c0(), i13, bVar.height, true);
        } else {
            int P2 = RecyclerView.p.P(Y2, i10, i13, bVar.height, false);
            int P3 = RecyclerView.p.P(this.f3515u.o(), v0(), i14, bVar.width, true);
            i12 = P2;
            i11 = P3;
        }
        e3(view, i11, i12, z10);
    }

    private void e3(View view, int i10, int i11, boolean z10) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z10 ? N1(view, i10, i11, qVar) : L1(view, i10, i11, qVar)) {
            view.measure(i10, i11);
        }
    }

    private void g3() {
        int b02;
        int m02;
        if (r2() == 1) {
            b02 = u0() - k0();
            m02 = j0();
        } else {
            b02 = b0() - h0();
            m02 = m0();
        }
        R2(b02 - m02);
    }

    public int A(RecyclerView.a0 a0Var) {
        return this.Q ? V2(a0Var) : super.A(a0Var);
    }

    public int C1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        g3();
        X2();
        return super.C1(i10, vVar, a0Var);
    }

    public int E1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        g3();
        X2();
        return super.E1(i10, vVar, a0Var);
    }

    public void G2(boolean z10) {
        if (!z10) {
            super.G2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public RecyclerView.q I() {
        return this.f3513s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public void I1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.K == null) {
            super.I1(rect, i10, i11);
        }
        int j02 = j0() + k0();
        int m02 = m0() + h0();
        if (this.f3513s == 1) {
            i13 = RecyclerView.p.s(i11, rect.height() + m02, f0());
            int[] iArr = this.K;
            i12 = RecyclerView.p.s(i10, iArr[iArr.length - 1] + j02, g0());
        } else {
            i12 = RecyclerView.p.s(i10, rect.width() + j02, g0());
            int[] iArr2 = this.K;
            i13 = RecyclerView.p.s(i11, iArr2[iArr2.length - 1] + m02, f0());
        }
        H1(i12, i13);
    }

    public RecyclerView.q J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.q K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        if (r13 == (r2 > r15)) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        if (r13 == r10) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View P0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.G(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f3507e
            int r5 = r5.f3508f
            int r5 = r5 + r6
            android.view.View r7 = super.P0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.X1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3518x
            r11 = -1
            if (r7 == r10) goto L_0x0039
            int r7 = r23.O()
            int r7 = r7 - r9
            r10 = r11
            r12 = r10
            goto L_0x0040
        L_0x0039:
            int r7 = r23.O()
            r10 = r7
            r12 = r9
            r7 = 0
        L_0x0040:
            int r13 = r0.f3513s
            if (r13 != r9) goto L_0x004c
            boolean r13 = r23.s2()
            if (r13 == 0) goto L_0x004c
            r13 = r9
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r14 = r0.Z2(r1, r2, r7)
            r15 = r11
            r16 = r15
            r8 = 0
            r17 = 0
            r11 = r7
            r7 = r4
        L_0x0059:
            if (r11 == r10) goto L_0x0065
            int r9 = r0.Z2(r1, r2, r11)
            android.view.View r1 = r0.N(r11)
            if (r1 != r3) goto L_0x0069
        L_0x0065:
            r21 = r7
            goto L_0x0137
        L_0x0069:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0082
            if (r9 == r14) goto L_0x0082
            if (r4 == 0) goto L_0x0074
            goto L_0x0065
        L_0x0074:
            r18 = r3
            r21 = r7
        L_0x0078:
            r19 = r8
            r20 = r10
        L_0x007c:
            r7 = r16
            r8 = r17
            goto L_0x0123
        L_0x0082:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f3507e
            r18 = r3
            int r3 = r9.f3508f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009a
            if (r2 != r6) goto L_0x009a
            if (r3 != r5) goto L_0x009a
            return r1
        L_0x009a:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a2
            if (r4 == 0) goto L_0x00aa
        L_0x00a2:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
        L_0x00aa:
            r21 = r7
        L_0x00ac:
            r19 = r8
            r20 = r10
            r7 = r16
            r8 = r17
            goto L_0x00f3
        L_0x00b5:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d4
            if (r7 <= r8) goto L_0x00ca
        L_0x00c9:
            goto L_0x00ac
        L_0x00ca:
            if (r7 != r8) goto L_0x0078
            if (r2 <= r15) goto L_0x00d0
            r7 = 1
            goto L_0x00d1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            if (r13 != r7) goto L_0x0078
            goto L_0x00c9
        L_0x00d4:
            if (r4 != 0) goto L_0x0078
            r19 = r8
            r20 = r10
            r8 = 0
            r10 = 1
            boolean r22 = r0.E0(r1, r8, r10)
            if (r22 == 0) goto L_0x007c
            r8 = r17
            if (r7 <= r8) goto L_0x00e9
            r7 = r16
            goto L_0x00f3
        L_0x00e9:
            if (r7 != r8) goto L_0x0121
            r7 = r16
            if (r2 <= r7) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            if (r13 != r10) goto L_0x0123
        L_0x00f3:
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x010f
            int r4 = r9.f3507e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x012b
        L_0x010f:
            int r7 = r9.f3507e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x012b
        L_0x0121:
            r7 = r16
        L_0x0123:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x012b:
            int r11 = r11 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r10 = r20
            r9 = 1
            goto L_0x0059
        L_0x0137:
            if (r4 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r4 = r21
        L_0x013c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.P0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public boolean R1() {
        return this.D == null && !this.I;
    }

    public int S(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3513s == 1) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Z2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    public void T1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i10 = this.J;
        for (int i11 = 0; i11 < this.J && cVar.c(a0Var) && i10 > 0; i11++) {
            int i12 = cVar.f3533d;
            cVar2.a(i12, Math.max(0, cVar.f3536g));
            i10 -= this.O.f(i12);
            cVar.f3533d += cVar.f3534e;
        }
    }

    public void V0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, y yVar) {
        int i10;
        int e10;
        int f10;
        boolean z10;
        boolean z11;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.U0(view, yVar);
            return;
        }
        b bVar = (b) layoutParams;
        int Z2 = Z2(vVar, a0Var, bVar.a());
        if (this.f3513s == 0) {
            i11 = bVar.e();
            i10 = bVar.f();
            f10 = 1;
            z10 = false;
            z11 = false;
            e10 = Z2;
        } else {
            i10 = 1;
            e10 = bVar.e();
            f10 = bVar.f();
            z10 = false;
            z11 = false;
            i11 = Z2;
        }
        yVar.p0(y.g.a(i11, i10, e10, f10, z10, z11));
    }

    public void X0(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public void Y0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    /* access modifiers changed from: package-private */
    public int Y2(int i10, int i11) {
        if (this.f3513s != 1 || !s2()) {
            int[] iArr = this.K;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.K;
        int i12 = this.J;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public void Z0(RecyclerView recyclerView, int i10, int i11, int i12) {
        this.O.h();
        this.O.g();
    }

    public void a1(RecyclerView recyclerView, int i10, int i11) {
        this.O.h();
        this.O.g();
    }

    public void c1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        this.O.h();
        this.O.g();
    }

    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            Q2();
        }
        super.d1(vVar, a0Var);
        T2();
    }

    public void e1(RecyclerView.a0 a0Var) {
        super.e1(a0Var);
        this.I = false;
    }

    public void f3(int i10) {
        if (i10 != this.J) {
            this.I = true;
            if (i10 >= 1) {
                this.J = i10;
                this.O.h();
                z1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i10);
        }
    }

    /* access modifiers changed from: package-private */
    public View l2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10, boolean z11) {
        int i10;
        int i11;
        int O2 = O();
        int i12 = 1;
        if (z11) {
            i11 = O() - 1;
            i10 = -1;
            i12 = -1;
        } else {
            i10 = O2;
            i11 = 0;
        }
        int b10 = a0Var.b();
        Z1();
        int n10 = this.f3515u.n();
        int i13 = this.f3515u.i();
        View view = null;
        View view2 = null;
        while (i11 != i10) {
            View N2 = N(i11);
            int n02 = n0(N2);
            if (n02 >= 0 && n02 < b10 && a3(vVar, a0Var, n02) == 0) {
                if (((RecyclerView.q) N2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = N2;
                    }
                } else if (this.f3515u.g(N2) < i13 && this.f3515u.d(N2) >= n10) {
                    return N2;
                } else {
                    if (view == null) {
                        view = N2;
                    }
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2;
    }

    public int q0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f3513s == 0) {
            return this.J;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return Z2(vVar, a0Var, a0Var.b() - 1) + 1;
    }

    public boolean r(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* access modifiers changed from: package-private */
    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        View d10;
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int m10 = this.f3515u.m();
        boolean z10 = m10 != 1073741824;
        int i23 = O() > 0 ? this.K[this.J] : 0;
        if (z10) {
            g3();
        }
        boolean z11 = cVar2.f3534e == 1;
        int i24 = this.J;
        if (!z11) {
            i24 = a3(vVar2, a0Var2, cVar2.f3533d) + b3(vVar2, a0Var2, cVar2.f3533d);
        }
        int i25 = 0;
        while (i25 < this.J && cVar2.c(a0Var2) && i24 > 0) {
            int i26 = cVar2.f3533d;
            int b32 = b3(vVar2, a0Var2, i26);
            if (b32 <= this.J) {
                i24 -= b32;
                if (i24 < 0 || (d10 = cVar2.d(vVar2)) == null) {
                    break;
                }
                this.L[i25] = d10;
                i25++;
            } else {
                throw new IllegalArgumentException("Item at position " + i26 + " requires " + b32 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
        }
        if (i25 == 0) {
            bVar2.f3527b = true;
            return;
        }
        P2(vVar2, a0Var2, i25, z11);
        float f10 = 0.0f;
        int i27 = 0;
        for (int i28 = 0; i28 < i25; i28++) {
            View view = this.L[i28];
            if (cVar2.f3541l == null) {
                if (z11) {
                    i(view);
                } else {
                    j(view, 0);
                }
            } else if (z11) {
                g(view);
            } else {
                h(view, 0);
            }
            o(view, this.P);
            d3(view, m10, false);
            int e10 = this.f3515u.e(view);
            if (e10 > i27) {
                i27 = e10;
            }
            float f11 = (((float) this.f3515u.f(view)) * 1.0f) / ((float) ((b) view.getLayoutParams()).f3508f);
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z10) {
            c3(f10, i23);
            i27 = 0;
            for (int i29 = 0; i29 < i25; i29++) {
                View view2 = this.L[i29];
                d3(view2, 1073741824, true);
                int e11 = this.f3515u.e(view2);
                if (e11 > i27) {
                    i27 = e11;
                }
            }
        }
        for (int i30 = 0; i30 < i25; i30++) {
            View view3 = this.L[i30];
            if (this.f3515u.e(view3) != i27) {
                b bVar3 = (b) view3.getLayoutParams();
                Rect rect = bVar3.f3687b;
                int i31 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i32 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int Y2 = Y2(bVar3.f3507e, bVar3.f3508f);
                if (this.f3513s == 1) {
                    i22 = RecyclerView.p.P(Y2, 1073741824, i32, bVar3.width, false);
                    i21 = View.MeasureSpec.makeMeasureSpec(i27 - i31, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i27 - i32, 1073741824);
                    i21 = RecyclerView.p.P(Y2, 1073741824, i31, bVar3.height, false);
                    i22 = makeMeasureSpec;
                }
                e3(view3, i22, i21, true);
            }
        }
        bVar2.f3526a = i27;
        if (this.f3513s == 1) {
            if (cVar2.f3535f == -1) {
                i13 = cVar2.f3531b;
                i20 = i13 - i27;
            } else {
                i20 = cVar2.f3531b;
                i13 = i20 + i27;
            }
            i10 = i20;
            i12 = 0;
            i11 = 0;
        } else {
            if (cVar2.f3535f == -1) {
                i19 = cVar2.f3531b;
                i18 = i19 - i27;
            } else {
                i18 = cVar2.f3531b;
                i19 = i18 + i27;
            }
            i11 = i18;
            i10 = 0;
            i12 = i19;
            i13 = 0;
        }
        int i33 = 0;
        while (i33 < i25) {
            View view4 = this.L[i33];
            b bVar4 = (b) view4.getLayoutParams();
            if (this.f3513s == 1) {
                if (s2()) {
                    int j02 = j0() + this.K[this.J - bVar4.f3507e];
                    i17 = i13;
                    i16 = j02;
                    i15 = j02 - this.f3515u.f(view4);
                } else {
                    int j03 = j0() + this.K[bVar4.f3507e];
                    i17 = i13;
                    i15 = j03;
                    i16 = this.f3515u.f(view4) + j03;
                }
                i14 = i10;
            } else {
                int m02 = m0() + this.K[bVar4.f3507e];
                i14 = m02;
                i16 = i12;
                i15 = i11;
                i17 = this.f3515u.f(view4) + m02;
            }
            F0(view4, i15, i14, i16, i17);
            if (bVar4.c() || bVar4.b()) {
                bVar2.f3528c = true;
            }
            bVar2.f3529d |= view4.hasFocusable();
            i33++;
            i13 = i17;
            i12 = i16;
            i11 = i15;
            i10 = i14;
        }
        Arrays.fill(this.L, (Object) null);
    }

    public int w(RecyclerView.a0 a0Var) {
        return this.Q ? U2(a0Var) : super.w(a0Var);
    }

    /* access modifiers changed from: package-private */
    public void w2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i10) {
        super.w2(vVar, a0Var, aVar, i10);
        g3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            W2(vVar, a0Var, aVar, i10);
        }
        X2();
    }

    public int x(RecyclerView.a0 a0Var) {
        return this.Q ? V2(a0Var) : super.x(a0Var);
    }

    public int z(RecyclerView.a0 a0Var) {
        return this.Q ? U2(a0Var) : super.z(a0Var);
    }

    public GridLayoutManager(Context context, int i10, int i11, boolean z10) {
        super(context, i11, z10);
        f3(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f3(RecyclerView.p.o0(context, attributeSet, i10, i11).f3683b);
    }
}
