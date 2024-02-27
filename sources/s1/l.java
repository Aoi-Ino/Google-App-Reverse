package s1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import d1.g;
import r1.d;

public abstract class l {
    public static final void c(Context context, g gVar) {
        cm.l.f(context, "context");
        cm.l.f(gVar, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i10 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i11 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            gVar.j();
            try {
                gVar.k0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                gVar.k0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                sharedPreferences.edit().clear().apply();
                gVar.g0();
            } finally {
                gVar.i();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final int d(WorkDatabase workDatabase, String str) {
        Long a10 = workDatabase.D().a(str);
        int i10 = 0;
        int longValue = a10 != null ? (int) a10.longValue() : 0;
        if (longValue != Integer.MAX_VALUE) {
            i10 = longValue + 1;
        }
        e(workDatabase, str, i10);
        return longValue;
    }

    /* access modifiers changed from: private */
    public static final void e(WorkDatabase workDatabase, String str, int i10) {
        workDatabase.D().b(new d(str, Long.valueOf((long) i10)));
    }
}
