package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class f {

    /* renamed from: a  reason: collision with root package name */
    boolean f3875a = true;

    /* renamed from: b  reason: collision with root package name */
    int f3876b;

    /* renamed from: c  reason: collision with root package name */
    int f3877c;

    /* renamed from: d  reason: collision with root package name */
    int f3878d;

    /* renamed from: e  reason: collision with root package name */
    int f3879e;

    /* renamed from: f  reason: collision with root package name */
    int f3880f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f3881g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f3882h;

    /* renamed from: i  reason: collision with root package name */
    boolean f3883i;

    f() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.a0 a0Var) {
        int i10 = this.f3877c;
        return i10 >= 0 && i10 < a0Var.b();
    }

    /* access modifiers changed from: package-private */
    public View b(RecyclerView.v vVar) {
        View o10 = vVar.o(this.f3877c);
        this.f3877c += this.f3878d;
        return o10;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3876b + ", mCurrentPosition=" + this.f3877c + ", mItemDirection=" + this.f3878d + ", mLayoutDirection=" + this.f3879e + ", mStartLine=" + this.f3880f + ", mEndLine=" + this.f3881g + '}';
    }
}
