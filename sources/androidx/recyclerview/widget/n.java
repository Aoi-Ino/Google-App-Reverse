package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class n extends RecyclerView.r {

    /* renamed from: a  reason: collision with root package name */
    RecyclerView f3904a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f3905b;

    /* renamed from: c  reason: collision with root package name */
    private final RecyclerView.t f3906c = new a();

    class a extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        boolean f3907a = false;

        a() {
        }

        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0 && this.f3907a) {
                this.f3907a = false;
                n.this.j();
            }
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f3907a = true;
            }
        }
    }

    private void e() {
        this.f3904a.a1(this.f3906c);
        this.f3904a.setOnFlingListener((RecyclerView.r) null);
    }

    private void h() {
        if (this.f3904a.getOnFlingListener() == null) {
            this.f3904a.k(this.f3906c);
            this.f3904a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean i(RecyclerView.p pVar, int i10, int i11) {
        RecyclerView.z d10;
        int g10;
        if (!(pVar instanceof RecyclerView.z.b) || (d10 = d(pVar)) == null || (g10 = g(pVar, i10, i11)) == -1) {
            return false;
        }
        d10.p(g10);
        pVar.P1(d10);
        return true;
    }

    public boolean a(int i10, int i11) {
        RecyclerView.p layoutManager = this.f3904a.getLayoutManager();
        if (layoutManager == null || this.f3904a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3904a.getMinFlingVelocity();
        return (Math.abs(i11) > minFlingVelocity || Math.abs(i10) > minFlingVelocity) && i(layoutManager, i10, i11);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3904a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                e();
            }
            this.f3904a = recyclerView;
            if (recyclerView != null) {
                h();
                this.f3905b = new Scroller(this.f3904a.getContext(), new DecelerateInterpolator());
                j();
            }
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    /* access modifiers changed from: protected */
    public abstract RecyclerView.z d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i10, int i11);

    /* access modifiers changed from: package-private */
    public void j() {
        RecyclerView.p layoutManager;
        View f10;
        RecyclerView recyclerView = this.f3904a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f10 = f(layoutManager)) != null) {
            int[] c10 = c(layoutManager, f10);
            int i10 = c10[0];
            if (i10 != 0 || c10[1] != 0) {
                this.f3904a.n1(i10, c10[1]);
            }
        }
    }
}
