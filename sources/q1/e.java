package q1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cm.l;
import m1.m;
import t1.b;

public abstract class e extends h {

    /* renamed from: f  reason: collision with root package name */
    private final BroadcastReceiver f14916f = new a(this);

    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f14917a;

        a(e eVar) {
            this.f14917a = eVar;
        }

        public void onReceive(Context context, Intent intent) {
            l.f(context, "context");
            l.f(intent, "intent");
            this.f14917a.k(intent);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, b bVar) {
        super(context, bVar);
        l.f(context, "context");
        l.f(bVar, "taskExecutor");
    }

    public void h() {
        m e10 = m.e();
        String a10 = f.f14918a;
        e10.a(a10, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f14916f, j());
    }

    public void i() {
        m e10 = m.e();
        String a10 = f.f14918a;
        e10.a(a10, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f14916f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
