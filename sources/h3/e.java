package h3;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ JobInfoSchedulerService f11951e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ JobParameters f11952f;

    public /* synthetic */ e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.f11951e = jobInfoSchedulerService;
        this.f11952f = jobParameters;
    }

    public final void run() {
        this.f11951e.b(this.f11952f);
    }
}
