package r3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class q extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    Context f15570a;

    /* renamed from: b  reason: collision with root package name */
    private final p f15571b;

    public q(p pVar) {
        this.f15571b = pVar;
    }

    public final void a(Context context) {
        this.f15570a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f15570a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f15570a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f15571b.a();
            b();
        }
    }
}
