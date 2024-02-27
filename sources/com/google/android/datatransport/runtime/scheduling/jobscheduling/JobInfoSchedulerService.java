package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a3.o;
import a3.t;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import h3.e;
import l3.a;

public class JobInfoSchedulerService extends JobService {
    /* access modifiers changed from: private */
    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(getApplicationContext());
        o.a d10 = o.a().b(string).d(a.b(i10));
        if (string2 != null) {
            d10.c(Base64.decode(string2, 0));
        }
        t.c().e().v(d10.a(), i11, new e(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}