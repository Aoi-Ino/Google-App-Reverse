package o3;

import android.os.IBinder;
import android.os.RemoteException;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ t f14397e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IBinder f14398f;

    public /* synthetic */ m(t tVar, IBinder iBinder) {
        this.f14397e = tVar;
        this.f14398f = iBinder;
    }

    public final void run() {
        t tVar = this.f14397e;
        IBinder iBinder = this.f14398f;
        synchronized (tVar) {
            if (iBinder == null) {
                tVar.a(0, "Null service connection");
                return;
            }
            try {
                tVar.f14407c = new v(iBinder);
                tVar.f14405a = 2;
                tVar.c();
            } catch (RemoteException e10) {
                tVar.a(0, e10.getMessage());
            }
        }
    }
}
