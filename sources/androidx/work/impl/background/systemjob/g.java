package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m1.m;
import m1.r;
import m1.x;
import r1.i;
import r1.l;
import r1.u;
import r1.v;
import s1.k;

public class g implements w {

    /* renamed from: j  reason: collision with root package name */
    private static final String f4191j = m.i("SystemJobScheduler");

    /* renamed from: e  reason: collision with root package name */
    private final Context f4192e;

    /* renamed from: f  reason: collision with root package name */
    private final JobScheduler f4193f;

    /* renamed from: g  reason: collision with root package name */
    private final f f4194g;

    /* renamed from: h  reason: collision with root package name */
    private final WorkDatabase f4195h;

    /* renamed from: i  reason: collision with root package name */
    private final a f4196i;

    public g(Context context, WorkDatabase workDatabase, a aVar) {
        this(context, workDatabase, aVar, (JobScheduler) context.getSystemService("jobscheduler"), new f(context, aVar.a()));
    }

    public static void b(Context context) {
        List<JobInfo> g10;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g10 = g(context, jobScheduler)) != null && !g10.isEmpty()) {
            for (JobInfo id2 : g10) {
                e(jobScheduler, id2.getId());
            }
        }
    }

    private static void e(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            m.e().d(f4191j, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i10)}), th2);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g10 = g(context, jobScheduler);
        if (g10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g10) {
            r1.m h10 = h(jobInfo);
            if (h10 != null && str.equals(h10.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            m.e().d(f4191j, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static r1.m h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new r1.m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g10 = g(context, jobScheduler);
        List<String> c10 = workDatabase.E().c();
        boolean z10 = false;
        HashSet hashSet = new HashSet(g10 != null ? g10.size() : 0);
        if (g10 != null && !g10.isEmpty()) {
            for (JobInfo jobInfo : g10) {
                r1.m h10 = h(jobInfo);
                if (h10 != null) {
                    hashSet.add(h10.b());
                } else {
                    e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = c10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    m.e().a(f4191j, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            workDatabase.e();
            try {
                v H = workDatabase.H();
                for (String f10 : c10) {
                    H.f(f10, -1);
                }
                workDatabase.A();
                workDatabase.i();
            } catch (Throwable th2) {
                workDatabase.i();
                throw th2;
            }
        }
        return z10;
    }

    public void a(String str) {
        List<Integer> f10 = f(this.f4192e, this.f4193f, str);
        if (f10 != null && !f10.isEmpty()) {
            for (Integer intValue : f10) {
                e(this.f4193f, intValue.intValue());
            }
            this.f4195h.E().f(str);
        }
    }

    public void c(u... uVarArr) {
        WorkDatabase workDatabase;
        k kVar = new k(this.f4195h);
        int length = uVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            u uVar = uVarArr[i10];
            this.f4195h.e();
            try {
                u m10 = this.f4195h.H().m(uVar.f15477a);
                if (m10 == null) {
                    m e10 = m.e();
                    String str = f4191j;
                    e10.k(str, "Skipping scheduling " + uVar.f15477a + " because it's no longer in the DB");
                    workDatabase = this.f4195h;
                } else if (m10.f15478b != x.ENQUEUED) {
                    m e11 = m.e();
                    String str2 = f4191j;
                    e11.k(str2, "Skipping scheduling " + uVar.f15477a + " because it is no longer enqueued");
                    workDatabase = this.f4195h;
                } else {
                    r1.m a10 = r1.x.a(uVar);
                    i d10 = this.f4195h.E().d(a10);
                    int e12 = d10 != null ? d10.f15452c : kVar.e(this.f4196i.i(), this.f4196i.g());
                    if (d10 == null) {
                        this.f4195h.E().a(l.a(a10, e12));
                    }
                    j(uVar, e12);
                    workDatabase = this.f4195h;
                }
                workDatabase.A();
                i10++;
            } finally {
                this.f4195h.i();
            }
        }
    }

    public boolean d() {
        return true;
    }

    public void j(u uVar, int i10) {
        JobInfo a10 = this.f4194g.a(uVar, i10);
        m e10 = m.e();
        String str = f4191j;
        e10.a(str, "Scheduling work ID " + uVar.f15477a + "Job ID " + i10);
        int i11 = 0;
        try {
            if (this.f4193f.schedule(a10) == 0) {
                m e11 = m.e();
                e11.k(str, "Unable to schedule work ID " + uVar.f15477a);
                if (uVar.f15493q && uVar.f15494r == r.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    uVar.f15493q = false;
                    m.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{uVar.f15477a}));
                    j(uVar, i10);
                }
            }
        } catch (IllegalStateException e12) {
            List g10 = g(this.f4192e, this.f4193f);
            if (g10 != null) {
                i11 = g10.size();
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(i11), Integer.valueOf(this.f4195h.H().w().size()), Integer.valueOf(this.f4196i.h())});
            m.e().c(f4191j, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e12);
            androidx.core.util.a l10 = this.f4196i.l();
            if (l10 != null) {
                l10.a(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th2) {
            m e13 = m.e();
            String str2 = f4191j;
            e13.d(str2, "Unable to schedule " + uVar, th2);
        }
    }

    public g(Context context, WorkDatabase workDatabase, a aVar, JobScheduler jobScheduler, f fVar) {
        this.f4192e = context;
        this.f4193f = jobScheduler;
        this.f4194g = fVar;
        this.f4195h = workDatabase;
        this.f4196i = aVar;
    }
}
