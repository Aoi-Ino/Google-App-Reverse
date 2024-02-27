package t5;

import android.os.IBinder;
import android.os.IInterface;

final class i extends b {

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ IBinder f16534f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l f16535g;

    i(l lVar, IBinder iBinder) {
        this.f16535g = lVar;
        this.f16534f = iBinder;
    }

    public final void a() {
        m mVar = this.f16535g.f16537a;
        mVar.f16552n = (IInterface) mVar.f16547i.a(this.f16534f);
        m.o(this.f16535g.f16537a);
        this.f16535g.f16537a.f16545g = false;
        for (Runnable run : this.f16535g.f16537a.f16542d) {
            run.run();
        }
        this.f16535g.f16537a.f16542d.clear();
    }
}
