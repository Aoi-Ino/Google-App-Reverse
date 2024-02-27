package s1;

import android.os.Build;
import androidx.work.a;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.c0;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import cm.l;
import java.util.Collection;
import java.util.List;
import m1.r;
import m1.x;
import m1.z;
import r1.u;

public abstract class d {
    public static final void a(WorkDatabase workDatabase, a aVar, c0 c0Var) {
        int i10;
        l.f(workDatabase, "workDatabase");
        l.f(aVar, "configuration");
        l.f(c0Var, "continuation");
        List n10 = q.n(c0Var);
        int i11 = 0;
        while (!n10.isEmpty()) {
            c0 c0Var2 = (c0) v.D(n10);
            List f10 = c0Var2.f();
            l.e(f10, "current.work");
            Iterable<z> iterable = f10;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                i10 = 0;
                for (z d10 : iterable) {
                    if (d10.d().f15486j.e() && (i10 = i10 + 1) < 0) {
                        q.q();
                    }
                }
            } else {
                i10 = 0;
            }
            i11 += i10;
            List e10 = c0Var2.e();
            if (e10 != null) {
                n10.addAll(e10);
            }
        }
        if (i11 != 0) {
            int t10 = workDatabase.H().t();
            int b10 = aVar.b();
            if (t10 + i11 > b10) {
                throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + b10 + ";\nalready enqueued count: " + t10 + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
            }
        }
    }

    public static final u b(u uVar) {
        u uVar2 = uVar;
        l.f(uVar2, "workSpec");
        m1.d dVar = uVar2.f15486j;
        String str = uVar2.f15479c;
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        if (l.a(str, cls.getName())) {
            return uVar2;
        }
        if (!dVar.f() && !dVar.i()) {
            return uVar2;
        }
        b a10 = new b.a().c(uVar2.f15481e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        l.e(a10, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = cls.getName();
        String str2 = name;
        l.e(name, "name");
        return u.c(uVar, (String) null, (x) null, str2, (String) null, a10, (b) null, 0, 0, 0, (m1.d) null, 0, (m1.a) null, 0, 0, 0, 0, false, (r) null, 0, 0, 0, 0, 0, 8388587, (Object) null);
    }

    public static final u c(List list, u uVar) {
        l.f(list, "schedulers");
        l.f(uVar, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? b(uVar) : uVar;
    }
}
