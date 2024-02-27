package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.p f3893a;

    /* renamed from: b  reason: collision with root package name */
    private int f3894b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f3895c;

    class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, (a) null);
        }

        public int d(View view) {
            return this.f3893a.Y(view) + ((RecyclerView.q) view.getLayoutParams()).rightMargin;
        }

        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3893a.X(view) + qVar.leftMargin + qVar.rightMargin;
        }

        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3893a.W(view) + qVar.topMargin + qVar.bottomMargin;
        }

        public int g(View view) {
            return this.f3893a.V(view) - ((RecyclerView.q) view.getLayoutParams()).leftMargin;
        }

        public int h() {
            return this.f3893a.u0();
        }

        public int i() {
            return this.f3893a.u0() - this.f3893a.k0();
        }

        public int j() {
            return this.f3893a.k0();
        }

        public int l() {
            return this.f3893a.v0();
        }

        public int m() {
            return this.f3893a.c0();
        }

        public int n() {
            return this.f3893a.j0();
        }

        public int o() {
            return (this.f3893a.u0() - this.f3893a.j0()) - this.f3893a.k0();
        }

        public int q(View view) {
            this.f3893a.t0(view, true, this.f3895c);
            return this.f3895c.right;
        }

        public int r(View view) {
            this.f3893a.t0(view, true, this.f3895c);
            return this.f3895c.left;
        }

        public void s(int i10) {
            this.f3893a.I0(i10);
        }
    }

    class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, (a) null);
        }

        public int d(View view) {
            return this.f3893a.T(view) + ((RecyclerView.q) view.getLayoutParams()).bottomMargin;
        }

        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3893a.W(view) + qVar.topMargin + qVar.bottomMargin;
        }

        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f3893a.X(view) + qVar.leftMargin + qVar.rightMargin;
        }

        public int g(View view) {
            return this.f3893a.Z(view) - ((RecyclerView.q) view.getLayoutParams()).topMargin;
        }

        public int h() {
            return this.f3893a.b0();
        }

        public int i() {
            return this.f3893a.b0() - this.f3893a.h0();
        }

        public int j() {
            return this.f3893a.h0();
        }

        public int l() {
            return this.f3893a.c0();
        }

        public int m() {
            return this.f3893a.v0();
        }

        public int n() {
            return this.f3893a.m0();
        }

        public int o() {
            return (this.f3893a.b0() - this.f3893a.m0()) - this.f3893a.h0();
        }

        public int q(View view) {
            this.f3893a.t0(view, true, this.f3895c);
            return this.f3895c.bottom;
        }

        public int r(View view) {
            this.f3893a.t0(view, true, this.f3895c);
            return this.f3895c.top;
        }

        public void s(int i10) {
            this.f3893a.J0(i10);
        }
    }

    private i(RecyclerView.p pVar) {
        this.f3894b = Integer.MIN_VALUE;
        this.f3895c = new Rect();
        this.f3893a = pVar;
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i10) {
        if (i10 == 0) {
            return a(pVar);
        }
        if (i10 == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public RecyclerView.p k() {
        return this.f3893a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        if (Integer.MIN_VALUE == this.f3894b) {
            return 0;
        }
        return o() - this.f3894b;
    }

    public abstract int q(View view);

    public abstract int r(View view);

    public abstract void s(int i10);

    public void t() {
        this.f3894b = o();
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }
}
