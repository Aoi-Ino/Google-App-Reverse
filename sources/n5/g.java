package n5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.install.InstallState;
import t5.a;
import u5.d;

public final class g extends d {
    public g(Context context) {
        super(new a("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    /* access modifiers changed from: protected */
    public final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.f16896a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        this.f16896a.a("List of extras in received intent:", new Object[0]);
        for (String next : intent.getExtras().keySet()) {
            this.f16896a.a("Key: %s; value: %s", next, intent.getExtras().get(next));
        }
        InstallState f10 = InstallState.f(intent, this.f16896a);
        this.f16896a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", f10);
        f(f10);
    }
}
