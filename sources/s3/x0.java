package s3;

import android.os.Bundle;
import p3.a;

public final class x0 extends m0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ c f16047g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, (Bundle) null);
        this.f16047g = cVar;
    }

    /* access modifiers changed from: protected */
    public final void f(a aVar) {
        if (!this.f16047g.s() || !c.f0(this.f16047g)) {
            this.f16047g.f15905p.a(aVar);
            this.f16047g.K(aVar);
            return;
        }
        c.b0(this.f16047g, 16);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        this.f16047g.f15905p.a(a.f14623i);
        return true;
    }
}
