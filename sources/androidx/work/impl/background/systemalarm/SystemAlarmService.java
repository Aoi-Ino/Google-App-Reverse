package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.v;
import androidx.work.impl.background.systemalarm.g;
import m1.m;
import s1.w;

public class SystemAlarmService extends v implements g.c {

    /* renamed from: h  reason: collision with root package name */
    private static final String f4132h = m.i("SystemAlarmService");

    /* renamed from: f  reason: collision with root package name */
    private g f4133f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f4134g;

    private void e() {
        g gVar = new g(this);
        this.f4133f = gVar;
        gVar.m(this);
    }

    public void a() {
        this.f4134g = true;
        m.e().a(f4132h, "All commands completed in dispatcher");
        w.a();
        stopSelf();
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.f4134g = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4134g = true;
        this.f4133f.k();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4134g) {
            m.e().f(f4132h, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f4133f.k();
            e();
            this.f4134g = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4133f.a(intent, i11);
        return 3;
    }
}
