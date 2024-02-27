package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import m1.m;
import m1.p;
import m1.y;

public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4209a = m.i("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            m.e().a(f4209a, "Requesting diagnostics");
            try {
                y.c(context).b(p.e(DiagnosticsWorker.class));
            } catch (IllegalStateException e10) {
                m.e().d(f4209a, "WorkManager is not initialized", e10);
            }
        }
    }
}
