package wg;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import hc.a;
import retrofit2.Call;
import um.c0;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final VahanServiceConnection f32570a;

    public e(VahanServiceConnection vahanServiceConnection) {
        l.f(vahanServiceConnection, "retrofitService");
        this.f32570a = vahanServiceConnection;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32570a.getRcValues(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        VahanServiceConnection vahanServiceConnection = this.f32570a;
        return vahanServiceConnection.getResendOtp(a.f12073a.o() + "service/reSendSMSAlerts", c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        VahanServiceConnection vahanServiceConnection = this.f32570a;
        return vahanServiceConnection.getSendOtpRes(a.f12073a.o() + "service/sendSMSAlerts", c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        VahanServiceConnection vahanServiceConnection = this.f32570a;
        return vahanServiceConnection.verifyOtpDetails(a.f12073a.o() + "service/verifySMSOtp", c0Var, str);
    }
}
