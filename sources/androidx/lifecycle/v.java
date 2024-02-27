package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import cm.l;

public abstract class v extends Service implements s {

    /* renamed from: e  reason: collision with root package name */
    private final r0 f3367e = new r0(this);

    public k d0() {
        return this.f3367e.a();
    }

    public IBinder onBind(Intent intent) {
        l.f(intent, "intent");
        this.f3367e.b();
        return null;
    }

    public void onCreate() {
        this.f3367e.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f3367e.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i10) {
        this.f3367e.e();
        super.onStart(intent, i10);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
