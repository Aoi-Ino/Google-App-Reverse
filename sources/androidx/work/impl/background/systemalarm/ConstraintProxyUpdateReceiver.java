package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.p0;
import m1.m;
import s1.p;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f4126a = m.i("ConstrntProxyUpdtRecvr");

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Intent f4127e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Context f4128f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f4129g;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4127e = intent;
            this.f4128f = context;
            this.f4129g = pendingResult;
        }

        public void run() {
            try {
                boolean booleanExtra = this.f4127e.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4127e.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4127e.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4127e.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                m.e().a(ConstraintProxyUpdateReceiver.f4126a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                p.c(this.f4128f, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                p.c(this.f4128f, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                p.c(this.f4128f, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                p.c(this.f4128f, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4129g.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            m e10 = m.e();
            String str = f4126a;
            e10.a(str, "Ignoring unknown action " + action);
            return;
        }
        p0.i(context).o().c(new a(intent, context, goAsync()));
    }
}
