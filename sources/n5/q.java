package n5;

import android.os.RemoteException;
import t5.b;
import t5.i0;
import w5.p;

final class q extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p f14170f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f14171g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ u f14172h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(u uVar, p pVar, p pVar2, String str) {
        super(pVar);
        this.f14172h = uVar;
        this.f14170f = pVar2;
        this.f14171g = str;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        try {
            ((i0) this.f14172h.f14180a.e()).N(this.f14172h.f14181b, u.i(), new s(this.f14172h, this.f14170f));
        } catch (RemoteException e10) {
            u.f14178e.c(e10, "completeUpdate(%s)", this.f14171g);
            this.f14170f.d(new RuntimeException(e10));
        }
    }
}
