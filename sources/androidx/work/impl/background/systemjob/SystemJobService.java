package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.a0;
import androidx.work.impl.b0;
import androidx.work.impl.f;
import androidx.work.impl.n0;
import androidx.work.impl.o0;
import androidx.work.impl.p0;
import androidx.work.impl.u;
import java.util.HashMap;
import java.util.Map;
import m1.m;

public class SystemJobService extends JobService implements f {

    /* renamed from: i  reason: collision with root package name */
    private static final String f4182i = m.i("SystemJobService");

    /* renamed from: e  reason: collision with root package name */
    private p0 f4183e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f4184f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final b0 f4185g = new b0();

    /* renamed from: h  reason: collision with root package name */
    private n0 f4186h;

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.a(jobParameters.getStopReason());
        }
    }

    static int a(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i10;
            default:
                return -512;
        }
    }

    private static r1.m b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new r1.m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public void e(r1.m mVar, boolean z10) {
        JobParameters jobParameters;
        m e10 = m.e();
        String str = f4182i;
        e10.a(str, mVar.b() + " executed on JobScheduler");
        synchronized (this.f4184f) {
            jobParameters = (JobParameters) this.f4184f.remove(mVar);
        }
        this.f4185g.b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            p0 i10 = p0.i(getApplicationContext());
            this.f4183e = i10;
            u k10 = i10.k();
            this.f4186h = new o0(k10, this.f4183e.o());
            k10.e(this);
        } catch (IllegalStateException e10) {
            if (Application.class.equals(getApplication().getClass())) {
                m.e().k(f4182i, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        p0 p0Var = this.f4183e;
        if (p0Var != null) {
            p0Var.k().p(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.b(r8) == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r3.f4070b = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.a.a(r8) == null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r3.f4069a = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.a.a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (r2 < 28) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        r3.f4071c = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r7.f4186h.a(r7.f4185g.d(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            androidx.work.impl.p0 r0 = r7.f4183e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            m1.m r0 = m1.m.e()
            java.lang.String r3 = f4182i
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            r0.a(r3, r4)
            r7.jobFinished(r8, r1)
            return r2
        L_0x0015:
            r1.m r0 = b(r8)
            if (r0 != 0) goto L_0x0027
            m1.m r8 = m1.m.e()
            java.lang.String r0 = f4182i
            java.lang.String r1 = "WorkSpec id not found!"
            r8.c(r0, r1)
            return r2
        L_0x0027:
            java.util.Map r3 = r7.f4184f
            monitor-enter(r3)
            java.util.Map r4 = r7.f4184f     // Catch:{ all -> 0x004e }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0050
            m1.m r8 = m1.m.e()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = f4182i     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r5 = "Job is already being executed by SystemJobService: "
            r4.append(r5)     // Catch:{ all -> 0x004e }
            r4.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x004e }
            r8.a(r1, r0)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            return r2
        L_0x004e:
            r8 = move-exception
            goto L_0x00ad
        L_0x0050:
            m1.m r2 = m1.m.e()     // Catch:{ all -> 0x004e }
            java.lang.String r4 = f4182i     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004e }
            r5.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "onStartJob for "
            r5.append(r6)     // Catch:{ all -> 0x004e }
            r5.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004e }
            r2.a(r4, r5)     // Catch:{ all -> 0x004e }
            java.util.Map r2 = r7.f4184f     // Catch:{ all -> 0x004e }
            r2.put(r0, r8)     // Catch:{ all -> 0x004e }
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            int r2 = android.os.Build.VERSION.SDK_INT
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            if (r4 == 0) goto L_0x0087
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.b(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f4070b = r4
        L_0x0087:
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            if (r4 == 0) goto L_0x0097
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.a.a(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f4069a = r4
        L_0x0097:
            r4 = 28
            if (r2 < r4) goto L_0x00a1
            android.net.Network r8 = androidx.work.impl.background.systemjob.SystemJobService.b.a(r8)
            r3.f4071c = r8
        L_0x00a1:
            androidx.work.impl.n0 r8 = r7.f4186h
            androidx.work.impl.b0 r2 = r7.f4185g
            androidx.work.impl.a0 r0 = r2.d(r0)
            r8.a(r0, r3)
            return r1
        L_0x00ad:
            monitor-exit(r3)     // Catch:{ all -> 0x004e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f4183e == null) {
            m.e().a(f4182i, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        r1.m b10 = b(jobParameters);
        if (b10 == null) {
            m.e().c(f4182i, "WorkSpec id not found!");
            return false;
        }
        m e10 = m.e();
        String str = f4182i;
        e10.a(str, "onStopJob for " + b10);
        synchronized (this.f4184f) {
            this.f4184f.remove(b10);
        }
        a0 b11 = this.f4185g.b(b10);
        if (b11 != null) {
            this.f4186h.d(b11, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.f4183e.k().j(b10.b());
    }
}
