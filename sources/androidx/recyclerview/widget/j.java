package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class j extends n {

    /* renamed from: d  reason: collision with root package name */
    private i f3896d;

    /* renamed from: e  reason: collision with root package name */
    private i f3897e;

    class a extends g {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void o(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            j jVar = j.this;
            int[] c10 = jVar.c(jVar.f3904a.getLayoutManager(), view);
            int i10 = c10[0];
            int i11 = c10[1];
            int w10 = w(Math.max(Math.abs(i10), Math.abs(i11)));
            if (w10 > 0) {
                aVar.d(i10, i11, w10, this.f3885j);
            }
        }

        /* access modifiers changed from: protected */
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public int x(int i10) {
            return Math.min(100, super.x(i10));
        }
    }

    private int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.n() + (iVar.o() / 2));
    }

    private View l(RecyclerView.p pVar, i iVar) {
        int O = pVar.O();
        View view = null;
        if (O == 0) {
            return null;
        }
        int n10 = iVar.n() + (iVar.o() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < O; i11++) {
            View N = pVar.N(i11);
            int abs = Math.abs((iVar.g(N) + (iVar.e(N) / 2)) - n10);
            if (abs < i10) {
                view = N;
                i10 = abs;
            }
        }
        return view;
    }

    private i m(RecyclerView.p pVar) {
        i iVar = this.f3897e;
        if (iVar == null || iVar.f3893a != pVar) {
            this.f3897e = i.a(pVar);
        }
        return this.f3897e;
    }

    private i n(RecyclerView.p pVar) {
        if (pVar.q()) {
            return o(pVar);
        }
        if (pVar.p()) {
            return m(pVar);
        }
        return null;
    }

    private i o(RecyclerView.p pVar) {
        i iVar = this.f3896d;
        if (iVar == null || iVar.f3893a != pVar) {
            this.f3896d = i.c(pVar);
        }
        return this.f3896d;
    }

    private boolean p(RecyclerView.p pVar, int i10, int i11) {
        return pVar.p() ? i10 > 0 : i11 > 0;
    }

    private boolean q(RecyclerView.p pVar) {
        PointF d10;
        int e10 = pVar.e();
        if (!(pVar instanceof RecyclerView.z.b) || (d10 = ((RecyclerView.z.b) pVar).d(e10 - 1)) == null) {
            return false;
        }
        return d10.x < 0.0f || d10.y < 0.0f;
    }

    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.p()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.q()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    public RecyclerView.z d(RecyclerView.p pVar) {
        if (!(pVar instanceof RecyclerView.z.b)) {
            return null;
        }
        return new a(this.f3904a.getContext());
    }

    public View f(RecyclerView.p pVar) {
        i m10;
        if (pVar.q()) {
            m10 = o(pVar);
        } else if (!pVar.p()) {
            return null;
        } else {
            m10 = m(pVar);
        }
        return l(pVar, m10);
    }

    public int g(RecyclerView.p pVar, int i10, int i11) {
        i n10;
        int e10 = pVar.e();
        if (e10 == 0 || (n10 = n(pVar)) == null) {
            return -1;
        }
        int O = pVar.O();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < O; i14++) {
            View N = pVar.N(i14);
            if (N != null) {
                int k10 = k(N, n10);
                if (k10 <= 0 && k10 > i13) {
                    view2 = N;
                    i13 = k10;
                }
                if (k10 >= 0 && k10 < i12) {
                    view = N;
                    i12 = k10;
                }
            }
        }
        boolean p10 = p(pVar, i10, i11);
        if (p10 && view != null) {
            return pVar.n0(view);
        }
        if (!p10 && view2 != null) {
            return pVar.n0(view2);
        }
        if (p10) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int n02 = pVar.n0(view) + (q(pVar) == p10 ? -1 : 1);
        if (n02 < 0 || n02 >= e10) {
            return -1;
        }
        return n02;
    }
}
