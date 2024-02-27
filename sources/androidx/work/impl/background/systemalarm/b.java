package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a0;
import androidx.work.impl.b0;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m1.m;
import r1.u;

public class b implements f {

    /* renamed from: j  reason: collision with root package name */
    private static final String f4136j = m.i("CommandHandler");

    /* renamed from: e  reason: collision with root package name */
    private final Context f4137e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f4138f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Object f4139g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final m1.b f4140h;

    /* renamed from: i  reason: collision with root package name */
    private final b0 f4141i;

    b(Context context, m1.b bVar, b0 b0Var) {
        this.f4137e = context;
        this.f4140h = bVar;
        this.f4141i = b0Var;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, r1.m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return q(intent, mVar);
    }

    static Intent c(Context context, r1.m mVar, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return q(intent, mVar);
    }

    static Intent d(Context context, r1.m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return q(intent, mVar);
    }

    static Intent f(Context context, r1.m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return q(intent, mVar);
    }

    private void g(Intent intent, int i10, g gVar) {
        m e10 = m.e();
        String str = f4136j;
        e10.a(str, "Handling constraints changed " + intent);
        new c(this.f4137e, this.f4140h, i10, gVar).a();
    }

    private void h(Intent intent, int i10, g gVar) {
        synchronized (this.f4139g) {
            try {
                r1.m p10 = p(intent);
                m e10 = m.e();
                String str = f4136j;
                e10.a(str, "Handing delay met for " + p10);
                if (!this.f4138f.containsKey(p10)) {
                    f fVar = new f(this.f4137e, i10, gVar, this.f4141i.d(p10));
                    this.f4138f.put(p10, fVar);
                    fVar.f();
                } else {
                    m e11 = m.e();
                    e11.a(str, "WorkSpec " + p10 + " is is already being handled for ACTION_DELAY_MET");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void i(Intent intent, int i10) {
        r1.m p10 = p(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        m e10 = m.e();
        String str = f4136j;
        e10.a(str, "Handling onExecutionCompleted " + intent + ", " + i10);
        e(p10, z10);
    }

    private void j(Intent intent, int i10, g gVar) {
        m e10 = m.e();
        String str = f4136j;
        e10.a(str, "Handling reschedule " + intent + ", " + i10);
        gVar.g().q();
    }

    private void k(Intent intent, int i10, g gVar) {
        r1.m p10 = p(intent);
        m e10 = m.e();
        String str = f4136j;
        e10.a(str, "Handling schedule work for " + p10);
        WorkDatabase n10 = gVar.g().n();
        n10.e();
        try {
            u m10 = n10.H().m(p10.b());
            if (m10 == null) {
                m e11 = m.e();
                e11.k(str, "Skipping scheduling " + p10 + " because it's no longer in the DB");
            } else if (m10.f15478b.b()) {
                m e12 = m.e();
                e12.k(str, "Skipping scheduling " + p10 + "because it is finished.");
                n10.i();
            } else {
                long a10 = m10.a();
                if (!m10.i()) {
                    m e13 = m.e();
                    e13.a(str, "Setting up Alarms for " + p10 + "at " + a10);
                    a.c(this.f4137e, n10, p10, a10);
                } else {
                    m e14 = m.e();
                    e14.a(str, "Opportunistically setting an alarm for " + p10 + "at " + a10);
                    a.c(this.f4137e, n10, p10, a10);
                    gVar.f().a().execute(new g.b(gVar, a(this.f4137e), i10));
                }
                n10.A();
                n10.i();
            }
        } finally {
            n10.i();
        }
    }

    private void l(Intent intent, g gVar) {
        List<a0> list;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            list = new ArrayList<>(1);
            a0 b10 = this.f4141i.b(new r1.m(string, i10));
            if (b10 != null) {
                list.add(b10);
            }
        } else {
            list = this.f4141i.c(string);
        }
        for (a0 a0Var : list) {
            m e10 = m.e();
            String str = f4136j;
            e10.a(str, "Handing stopWork work for " + string);
            gVar.i().e(a0Var);
            a.a(this.f4137e, gVar.g().n(), a0Var.a());
            gVar.e(a0Var.a(), false);
        }
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static r1.m p(Intent intent) {
        return new r1.m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent q(Intent intent, r1.m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    public void e(r1.m mVar, boolean z10) {
        synchronized (this.f4139g) {
            try {
                f fVar = (f) this.f4138f.remove(mVar);
                this.f4141i.b(mVar);
                if (fVar != null) {
                    fVar.g(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        boolean z10;
        synchronized (this.f4139g) {
            z10 = !this.f4138f.isEmpty();
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void o(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, gVar);
        } else if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            m e10 = m.e();
            String str = f4136j;
            e10.c(str, "Invalid request for " + action + " , requires " + "KEY_WORKSPEC_ID" + " .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, gVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, gVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, gVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
        } else {
            m e11 = m.e();
            String str2 = f4136j;
            e11.k(str2, "Ignoring intent " + intent);
        }
    }
}
