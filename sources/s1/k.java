package s1;

import androidx.work.impl.WorkDatabase;
import cm.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final WorkDatabase f15846a;

    public k(WorkDatabase workDatabase) {
        l.f(workDatabase, "workDatabase");
        this.f15846a = workDatabase;
    }

    /* access modifiers changed from: private */
    public static final Integer d(k kVar) {
        l.f(kVar, "this$0");
        return Integer.valueOf(l.d(kVar.f15846a, "next_alarm_manager_id"));
    }

    /* access modifiers changed from: private */
    public static final Integer f(k kVar, int i10, int i11) {
        l.f(kVar, "this$0");
        int a10 = l.d(kVar.f15846a, "next_job_scheduler_id");
        if (i10 > a10 || a10 > i11) {
            l.e(kVar.f15846a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = a10;
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object z10 = this.f15846a.z(new i(this));
        l.e(z10, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) z10).intValue();
    }

    public final int e(int i10, int i11) {
        Object z10 = this.f15846a.z(new j(this, i10, i11));
        l.e(z10, "workDatabase.runInTransa…            id\n        })");
        return ((Number) z10).intValue();
    }
}
