package androidx.work.impl;

import android.content.Context;
import androidx.work.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import m1.b;
import m1.m;
import r1.u;
import r1.v;
import s1.p;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4380a = m.i("Schedulers");

    static w c(Context context, WorkDatabase workDatabase, a aVar) {
        g gVar = new g(context, workDatabase, aVar);
        p.c(context, SystemJobService.class, true);
        m.e().a(f4380a, "Created SystemJobScheduler and enabled SystemJobService");
        return gVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(List list, r1.m mVar, a aVar, WorkDatabase workDatabase) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((w) it.next()).a(mVar.b());
        }
        h(aVar, workDatabase, list);
    }

    private static void f(v vVar, b bVar, List list) {
        if (list.size() > 0) {
            long a10 = bVar.a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vVar.f(((u) it.next()).f15477a, a10);
            }
        }
    }

    public static void g(List list, u uVar, Executor executor, WorkDatabase workDatabase, a aVar) {
        uVar.e(new x(executor, list, aVar, workDatabase));
    }

    public static void h(a aVar, WorkDatabase workDatabase, List list) {
        if (list != null && list.size() != 0) {
            v H = workDatabase.H();
            workDatabase.e();
            try {
                List i10 = H.i();
                f(H, aVar.a(), i10);
                List l10 = H.l(aVar.h());
                f(H, aVar.a(), l10);
                if (i10 != null) {
                    l10.addAll(i10);
                }
                List x10 = H.x(200);
                workDatabase.A();
                workDatabase.i();
                if (l10.size() > 0) {
                    u[] uVarArr = (u[]) l10.toArray(new u[l10.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        w wVar = (w) it.next();
                        if (wVar.d()) {
                            wVar.c(uVarArr);
                        }
                    }
                }
                if (x10.size() > 0) {
                    u[] uVarArr2 = (u[]) x10.toArray(new u[x10.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        w wVar2 = (w) it2.next();
                        if (!wVar2.d()) {
                            wVar2.c(uVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.i();
                throw th2;
            }
        }
    }
}
