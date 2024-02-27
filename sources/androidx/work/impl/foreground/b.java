package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.f;
import androidx.work.impl.p0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import lm.k1;
import m1.g;
import m1.m;
import o1.b;
import o1.d;
import o1.e;
import r1.u;
import r1.x;

public class b implements d, f {

    /* renamed from: o  reason: collision with root package name */
    static final String f4228o = m.i("SystemFgDispatcher");

    /* renamed from: e  reason: collision with root package name */
    private Context f4229e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public p0 f4230f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final t1.b f4231g;

    /* renamed from: h  reason: collision with root package name */
    final Object f4232h = new Object();

    /* renamed from: i  reason: collision with root package name */
    r1.m f4233i;

    /* renamed from: j  reason: collision with root package name */
    final Map f4234j;

    /* renamed from: k  reason: collision with root package name */
    final Map f4235k;

    /* renamed from: l  reason: collision with root package name */
    final Map f4236l;

    /* renamed from: m  reason: collision with root package name */
    final e f4237m;

    /* renamed from: n  reason: collision with root package name */
    private C0074b f4238n;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f4239e;

        a(String str) {
            this.f4239e = str;
        }

        public void run() {
            u g10 = b.this.f4230f.k().g(this.f4239e);
            if (g10 != null && g10.i()) {
                synchronized (b.this.f4232h) {
                    b.this.f4235k.put(x.a(g10), g10);
                    b bVar = b.this;
                    b.this.f4236l.put(x.a(g10), o1.f.b(bVar.f4237m, g10, bVar.f4231g.d(), b.this));
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.b$b  reason: collision with other inner class name */
    interface C0074b {
        void b(int i10);

        void c(int i10, int i11, Notification notification);

        void d(int i10, Notification notification);

        void stop();
    }

    b(Context context) {
        this.f4229e = context;
        p0 i10 = p0.i(context);
        this.f4230f = i10;
        this.f4231g = i10.o();
        this.f4233i = null;
        this.f4234j = new LinkedHashMap();
        this.f4236l = new HashMap();
        this.f4235k = new HashMap();
        this.f4237m = new e(this.f4230f.m());
        this.f4230f.k().e(this);
    }

    public static Intent d(Context context, r1.m mVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        return intent;
    }

    public static Intent f(Context context, r1.m mVar, g gVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_GENERATION", mVar.a());
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.a());
        intent.putExtra("KEY_NOTIFICATION", gVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void h(Intent intent) {
        m e10 = m.e();
        String str = f4228o;
        e10.f(str, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
            this.f4230f.e(UUID.fromString(stringExtra));
        }
    }

    private void i(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        r1.m mVar = new r1.m(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m e10 = m.e();
        String str = f4228o;
        e10.a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f4238n != null) {
            this.f4234j.put(mVar, new g(intExtra, notification, intExtra2));
            if (this.f4233i == null) {
                this.f4233i = mVar;
                this.f4238n.c(intExtra, intExtra2, notification);
                return;
            }
            this.f4238n.d(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry value : this.f4234j.entrySet()) {
                    i10 |= ((g) value.getValue()).a();
                }
                g gVar = (g) this.f4234j.get(this.f4233i);
                if (gVar != null) {
                    this.f4238n.c(gVar.c(), i10, gVar.b());
                }
            }
        }
    }

    private void j(Intent intent) {
        m e10 = m.e();
        String str = f4228o;
        e10.f(str, "Started foreground service " + intent);
        this.f4231g.c(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void b(u uVar, o1.b bVar) {
        if (bVar instanceof b.C0193b) {
            String str = uVar.f15477a;
            m e10 = m.e();
            String str2 = f4228o;
            e10.a(str2, "Constraints unmet for WorkSpec " + str);
            this.f4230f.s(x.a(uVar));
        }
    }

    public void e(r1.m mVar, boolean z10) {
        Map.Entry entry;
        synchronized (this.f4232h) {
            try {
                k1 k1Var = ((u) this.f4235k.remove(mVar)) != null ? (k1) this.f4236l.remove(mVar) : null;
                if (k1Var != null) {
                    k1Var.e((CancellationException) null);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        g gVar = (g) this.f4234j.remove(mVar);
        if (mVar.equals(this.f4233i)) {
            if (this.f4234j.size() > 0) {
                Iterator it = this.f4234j.entrySet().iterator();
                do {
                    entry = (Map.Entry) it.next();
                } while (it.hasNext());
                this.f4233i = (r1.m) entry.getKey();
                if (this.f4238n != null) {
                    g gVar2 = (g) entry.getValue();
                    this.f4238n.c(gVar2.c(), gVar2.a(), gVar2.b());
                    this.f4238n.b(gVar2.c());
                }
            } else {
                this.f4233i = null;
            }
        }
        C0074b bVar = this.f4238n;
        if (gVar != null && bVar != null) {
            m e10 = m.e();
            String str = f4228o;
            e10.a(str, "Removing Notification (id: " + gVar.c() + ", workSpecId: " + mVar + ", notificationType: " + gVar.a());
            bVar.b(gVar.c());
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Intent intent) {
        m.e().f(f4228o, "Stopping foreground service");
        C0074b bVar = this.f4238n;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.f4238n = null;
        synchronized (this.f4232h) {
            try {
                for (k1 e10 : this.f4236l.values()) {
                    e10.e((CancellationException) null);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f4230f.k().p(this);
    }

    /* access modifiers changed from: package-private */
    public void m(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                h(intent);
                return;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                k(intent);
                return;
            } else {
                return;
            }
        }
        i(intent);
    }

    /* access modifiers changed from: package-private */
    public void n(C0074b bVar) {
        if (this.f4238n != null) {
            m.e().c(f4228o, "A callback already exists.");
        } else {
            this.f4238n = bVar;
        }
    }
}
