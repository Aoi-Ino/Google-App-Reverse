package t5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class l implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f16537a;

    /* synthetic */ l(m mVar, k kVar) {
        this.f16537a = mVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f16537a.f16540b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        m mVar = this.f16537a;
        mVar.c().post(new i(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16537a.f16540b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        m mVar = this.f16537a;
        mVar.c().post(new j(this));
    }
}
