package rj;

import cm.l;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.ServiceWithdrawn;
import hc.a;
import i7.j;
import retrofit2.Call;
import um.c0;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ServiceWithdrawn f31084a;

    public c(ServiceWithdrawn serviceWithdrawn) {
        l.f(serviceWithdrawn, "retrofitService");
        this.f31084a = serviceWithdrawn;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31084a.getApplicationDetails(c0Var, str);
    }

    public final Call b(j jVar, String str) {
        l.f(jVar, "requestBody");
        l.f(str, "currentTime");
        return this.f31084a.validateService(jVar, str);
    }

    public final Call c(j jVar, String str) {
        l.f(jVar, "requestBody");
        l.f(str, "currentTime");
        return this.f31084a.submitWithDrawn(jVar, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f31084a.getAppliedListOfService(c0Var, str);
    }

    public final Call e(j jVar, String str) {
        l.f(jVar, "requestBody");
        l.f(str, "currentTime");
        return this.f31084a.getReason(jVar, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        ServiceWithdrawn serviceWithdrawn = this.f31084a;
        return serviceWithdrawn.getResendOtp(a.f12073a.o() + "service/reSendSMSAlerts", c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        ServiceWithdrawn serviceWithdrawn = this.f31084a;
        return serviceWithdrawn.getSendOtpRes(a.f12073a.o() + "service/sendSMSAlerts", c0Var, str);
    }

    public final Call h(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        ServiceWithdrawn serviceWithdrawn = this.f31084a;
        return serviceWithdrawn.verifyOtpDetails(a.f12073a.o() + "service/verifySMSOtp", c0Var, str);
    }
}
