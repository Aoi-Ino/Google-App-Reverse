package s3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

public final class v0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final int f16043a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f16044b;

    public v0(c cVar, int i10) {
        this.f16044b = cVar;
        this.f16043a = i10;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f16044b;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        synchronized (cVar.f15903n) {
            try {
                c cVar2 = this.f16044b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar2.f15904o = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new o0(iBinder) : (l) queryLocalInterface;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f16044b.c0(0, (Bundle) null, this.f16043a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f16044b.f15903n) {
            this.f16044b.f15904o = null;
        }
        Handler handler = this.f16044b.f15901l;
        handler.sendMessage(handler.obtainMessage(6, this.f16043a, 1));
    }
}
