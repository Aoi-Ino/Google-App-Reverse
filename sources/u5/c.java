package u5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class c extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f16895a;

    /* synthetic */ c(d dVar, b bVar) {
        this.f16895a = dVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f16895a.a(context, intent);
    }
}
