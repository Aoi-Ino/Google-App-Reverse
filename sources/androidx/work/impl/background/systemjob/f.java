package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import m1.b;
import m1.d;
import m1.m;
import m1.n;
import r1.u;

class f {

    /* renamed from: c  reason: collision with root package name */
    private static final String f4187c = m.i("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f4188a;

    /* renamed from: b  reason: collision with root package name */
    private final b f4189b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4190a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                m1.n[] r0 = m1.n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4190a = r0
                m1.n r1 = m1.n.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4190a     // Catch:{ NoSuchFieldError -> 0x001d }
                m1.n r1 = m1.n.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4190a     // Catch:{ NoSuchFieldError -> 0x0028 }
                m1.n r1 = m1.n.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4190a     // Catch:{ NoSuchFieldError -> 0x0033 }
                m1.n r1 = m1.n.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4190a     // Catch:{ NoSuchFieldError -> 0x003e }
                m1.n r1 = m1.n.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.f.a.<clinit>():void");
        }
    }

    f(Context context, b bVar) {
        this.f4189b = bVar;
        this.f4188a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(d.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    static int c(n nVar) {
        int i10 = a.f4190a[nVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        m e10 = m.e();
        String str = f4187c;
        e10.a(str, "API version too low. Cannot convert network type value " + nVar);
        return 1;
    }

    static void d(JobInfo.Builder builder, n nVar) {
        if (Build.VERSION.SDK_INT < 30 || nVar != n.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(nVar));
        } else {
            JobInfo.Builder unused = builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    public JobInfo a(u uVar, int i10) {
        d dVar = uVar.f15486j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f15477a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.d());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.k());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f4188a).setRequiresCharging(dVar.g()).setRequiresDeviceIdle(dVar.h()).setExtras(persistableBundle);
        d(extras, dVar.d());
        boolean z10 = false;
        if (!dVar.h()) {
            extras.setBackoffCriteria(uVar.f15489m, uVar.f15488l == m1.a.f13655f ? 0 : 1);
        }
        long max = Math.max(uVar.a() - this.f4189b.a(), 0);
        if (Build.VERSION.SDK_INT <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f15493q) {
            JobInfo.Builder unused = extras.setImportantWhileForeground(true);
        }
        if (dVar.e()) {
            for (d.c b10 : dVar.c()) {
                extras.addTriggerContentUri(b(b10));
            }
            extras.setTriggerContentUpdateDelay(dVar.b());
            extras.setTriggerContentMaxDelay(dVar.a());
        }
        extras.setPersisted(false);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            JobInfo.Builder unused2 = extras.setRequiresBatteryNotLow(dVar.f());
            JobInfo.Builder unused3 = extras.setRequiresStorageNotLow(dVar.i());
        }
        boolean z11 = uVar.f15487k > 0;
        if (max > 0) {
            z10 = true;
        }
        if (i11 >= 31 && uVar.f15493q && !z11 && !z10) {
            JobInfo.Builder unused4 = extras.setExpedited(true);
        }
        return extras.build();
    }
}
