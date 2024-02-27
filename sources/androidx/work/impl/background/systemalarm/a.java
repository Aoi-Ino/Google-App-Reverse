package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import m1.m;
import r1.i;
import r1.j;
import r1.l;
import s1.k;

abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4135a = m.i("Alarms");

    /* renamed from: androidx.work.impl.background.systemalarm.a$a  reason: collision with other inner class name */
    static class C0073a {
        static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, WorkDatabase workDatabase, r1.m mVar) {
        j E = workDatabase.E();
        i d10 = E.d(mVar);
        if (d10 != null) {
            b(context, mVar, d10.f15452c);
            m e10 = m.e();
            String str = f4135a;
            e10.a(str, "Removing SystemIdInfo for workSpecId (" + mVar + ")");
            E.i(mVar);
        }
    }

    private static void b(Context context, r1.m mVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 603979776);
        if (service != null && alarmManager != null) {
            m e10 = m.e();
            String str = f4135a;
            e10.a(str, "Cancelling existing alarm with (workSpecId, systemId) (" + mVar + ", " + i10 + ")");
            alarmManager.cancel(service);
        }
    }

    public static void c(Context context, WorkDatabase workDatabase, r1.m mVar, long j10) {
        int c10;
        j E = workDatabase.E();
        i d10 = E.d(mVar);
        if (d10 != null) {
            b(context, mVar, d10.f15452c);
            c10 = d10.f15452c;
        } else {
            c10 = new k(workDatabase).c();
            E.a(l.a(mVar, c10));
        }
        d(context, mVar, c10, j10);
    }

    private static void d(Context context, r1.m mVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, b.b(context, mVar), 201326592);
        if (alarmManager != null) {
            C0073a.a(alarmManager, 0, j10, service);
        }
    }
}
