package n5;

import android.os.RemoteException;
import t5.b;
import t5.i0;

final class p extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f14167f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ w5.p f14168g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ u f14169h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    p(u uVar, w5.p pVar, String str, w5.p pVar2) {
        super(pVar);
        this.f14169h = uVar;
        this.f14167f = str;
        this.f14168g = pVar2;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            u uVar = this.f14169h;
            ((i0) this.f14169h.f14180a.e()).c0(uVar.f14181b, u.b(uVar, this.f14167f), new t(this.f14169h, this.f14168g, this.f14167f));
        } catch (RemoteException e10) {
            u.f14178e.c(e10, "requestUpdateInfo(%s)", this.f14167f);
            this.f14168g.d(new RuntimeException(e10));
        }
    }
}
