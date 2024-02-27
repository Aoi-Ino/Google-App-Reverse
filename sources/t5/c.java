package t5;

import android.os.IBinder;

public final /* synthetic */ class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f16525a;

    public /* synthetic */ c(m mVar) {
        this.f16525a = mVar;
    }

    public final void binderDied() {
        m.i(this.f16525a);
    }
}
