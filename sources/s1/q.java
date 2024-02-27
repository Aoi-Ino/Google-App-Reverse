package s1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import d1.g;
import r1.d;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f15848a;

    public q(WorkDatabase workDatabase) {
        this.f15848a = workDatabase;
    }

    public static void c(Context context, g gVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = 0;
            long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j10 = 1;
            }
            gVar.j();
            try {
                gVar.k0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                gVar.k0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                gVar.g0();
            } finally {
                gVar.i();
            }
        }
    }

    public long a() {
        Long a10 = this.f15848a.D().a("last_force_stop_ms");
        if (a10 != null) {
            return a10.longValue();
        }
        return 0;
    }

    public boolean b() {
        Long a10 = this.f15848a.D().a("reschedule_needed");
        return a10 != null && a10.longValue() == 1;
    }

    public void d(long j10) {
        this.f15848a.D().b(new d("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f15848a.D().b(new d("reschedule_needed", z10));
    }
}
