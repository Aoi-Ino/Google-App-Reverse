package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import bm.t;
import cm.g;
import cm.k;
import cm.l;
import f.j;
import java.util.List;
import q1.h;
import q1.n;
import t1.b;
import t1.c;

public abstract class q0 {

    /* synthetic */ class a extends k implements t {

        /* renamed from: n  reason: collision with root package name */
        public static final a f4273n = new a();

        a() {
            super(6, q0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
        }

        /* renamed from: k */
        public final List d(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, u uVar) {
            l.f(context, "p0");
            l.f(aVar, "p1");
            l.f(bVar, "p2");
            l.f(workDatabase, "p3");
            l.f(nVar, "p4");
            l.f(uVar, "p5");
            return q0.b(context, aVar, bVar, workDatabase, nVar, uVar);
        }
    }

    /* access modifiers changed from: private */
    public static final List b(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, u uVar) {
        w c10 = z.c(context, workDatabase, aVar);
        l.e(c10, "createBestAvailableBackg…kDatabase, configuration)");
        return q.l(c10, new n1.b(context, aVar, nVar, uVar, new o0(uVar, bVar), bVar));
    }

    public static final p0 c(Context context, androidx.work.a aVar) {
        l.f(context, "context");
        l.f(aVar, "configuration");
        return e(context, aVar, (b) null, (WorkDatabase) null, (n) null, (u) null, (t) null, j.K0, (Object) null);
    }

    public static final p0 d(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, u uVar, t tVar) {
        l.f(context, "context");
        l.f(aVar, "configuration");
        l.f(bVar, "workTaskExecutor");
        l.f(workDatabase, "workDatabase");
        l.f(nVar, "trackers");
        l.f(uVar, "processor");
        l.f(tVar, "schedulersCreator");
        androidx.work.a aVar2 = aVar;
        b bVar2 = bVar;
        WorkDatabase workDatabase2 = workDatabase;
        u uVar2 = uVar;
        return new p0(context.getApplicationContext(), aVar2, bVar2, workDatabase2, (List) tVar.d(context, aVar2, bVar2, workDatabase2, nVar, uVar2), uVar2, nVar);
    }

    public static /* synthetic */ p0 e(Context context, androidx.work.a aVar, b bVar, WorkDatabase workDatabase, n nVar, u uVar, t tVar, int i10, Object obj) {
        WorkDatabase workDatabase2;
        n nVar2;
        u uVar2;
        b cVar = (i10 & 4) != 0 ? new c(aVar.m()) : bVar;
        if ((i10 & 8) != 0) {
            WorkDatabase.a aVar2 = WorkDatabase.f4112p;
            Context applicationContext = context.getApplicationContext();
            l.e(applicationContext, "context.applicationContext");
            t1.a b10 = cVar.b();
            l.e(b10, "workTaskExecutor.serialTaskExecutor");
            workDatabase2 = aVar2.b(applicationContext, b10, aVar.a(), context.getResources().getBoolean(m1.t.workmanager_test_configuration));
        } else {
            workDatabase2 = workDatabase;
        }
        if ((i10 & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            l.e(applicationContext2, "context.applicationContext");
            nVar2 = new n(applicationContext2, cVar, (h) null, (q1.c) null, (h) null, (h) null, 60, (g) null);
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 32) != 0) {
            androidx.work.a aVar3 = aVar;
            uVar2 = new u(context.getApplicationContext(), aVar, cVar, workDatabase2);
        } else {
            androidx.work.a aVar4 = aVar;
            uVar2 = uVar;
        }
        return d(context, aVar, cVar, workDatabase2, nVar2, uVar2, (i10 & 64) != 0 ? a.f4273n : tVar);
    }
}
