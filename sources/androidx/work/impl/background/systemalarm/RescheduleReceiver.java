package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.p0;
import m1.m;

public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4131a = m.i("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        m e10 = m.e();
        String str = f4131a;
        e10.a(str, "Received intent " + intent);
        try {
            p0.i(context).r(goAsync());
        } catch (IllegalStateException e11) {
            m.e().d(f4131a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
        }
    }
}
