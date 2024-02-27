package h3;

import a3.o;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import l3.a;

public class d implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Context f11948a;

    /* renamed from: b  reason: collision with root package name */
    private final i3.d f11949b;

    /* renamed from: c  reason: collision with root package name */
    private final f f11950c;

    public d(Context context, i3.d dVar, f fVar) {
        this.f11948a = context;
        this.f11949b = dVar;
        this.f11950c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i12 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    public void a(o oVar, int i10) {
        b(oVar, i10, false);
    }

    public void b(o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f11948a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f11948a.getSystemService("jobscheduler");
        int c10 = c(oVar);
        if (z10 || !d(jobScheduler, c10, i10)) {
            long O = this.f11949b.O(oVar);
            JobInfo.Builder c11 = this.f11950c.c(new JobInfo.Builder(c10, componentName), oVar.d(), O, i10);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", oVar.b());
            persistableBundle.putInt("priority", a.a(oVar.d()));
            if (oVar.c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
            }
            c11.setExtras(persistableBundle);
            e3.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c10), Long.valueOf(this.f11950c.g(oVar.d(), O, i10)), Long.valueOf(O), Integer.valueOf(i10));
            jobScheduler.schedule(c11.build());
            return;
        }
        e3.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    /* access modifiers changed from: package-private */
    public int c(o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f11948a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
