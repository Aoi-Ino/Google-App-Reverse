package wg;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanService.ApplicationServiceOtp;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationServiceOtp f32566a;

    public a(ApplicationServiceOtp applicationServiceOtp) {
        l.f(applicationServiceOtp, "retrofitService");
        this.f32566a = applicationServiceOtp;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32566a.downloadAppoinment(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        ApplicationServiceOtp applicationServiceOtp = this.f32566a;
        return applicationServiceOtp.getApplicationDetails(hc.a.f12073a.n() + "knowappl/fetchyourApplDetails", c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        ApplicationServiceOtp applicationServiceOtp = this.f32566a;
        return applicationServiceOtp.getApplicationDetailsUsingRc(hc.a.f12073a.n() + "knowappl/fetchyourRegnDetails", c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        ApplicationServiceOtp applicationServiceOtp = this.f32566a;
        return applicationServiceOtp.getResendOtp(hc.a.f12073a.o() + "service/reSendSMSAlerts", c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        ApplicationServiceOtp applicationServiceOtp = this.f32566a;
        return applicationServiceOtp.verifyOtpDetails(hc.a.f12073a.o() + "service/verifySMSOtp", c0Var, str);
    }
}
