package wg;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationService;
import hc.a;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationService f32567a;

    public b(ApplicationService applicationService) {
        l.f(applicationService, "retrofitService");
        this.f32567a = applicationService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32567a.disposeApplication(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32567a.getDetailsDisposeApp(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32567a.getDetailsByRegNo(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32567a.getDetailsByTransNo(c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32567a.getPendingTransTaxBreak(c0Var, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        ApplicationService applicationService = this.f32567a;
        return applicationService.getSendOtpRes(a.f12073a.o() + "service/sendSMSAlerts", c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32567a.verifyOtp(c0Var, str);
    }

    public final Call h(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        ApplicationService applicationService = this.f32567a;
        return applicationService.verifyOtpDetails(a.f12073a.o() + "service/verifySMSOtp", c0Var, str);
    }

    public final Call i(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32567a.verifyPendingPayment(c0Var, str);
    }
}
