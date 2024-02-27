package y9;

import android.content.Context;
import cm.l;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import ld.g;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final DlServiceInt f18642a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f18643b;

    /* renamed from: c  reason: collision with root package name */
    private g f18644c;

    public a(DlServiceInt dlServiceInt, Context context) {
        l.f(dlServiceInt, "dlServiceInt");
        l.f(context, "context");
        this.f18642a = dlServiceInt;
        this.f18643b = context;
        this.f18644c = new g(context);
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f18642a.getCustomState(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f18642a.getCurrentRTO(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        DlServiceInt dlServiceInt = this.f18642a;
        return dlServiceInt.getCurrentState(hc.a.f12073a.j() + "sarathi/sarathiWS/getSeStatesList/stateMast", c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f18642a.getEligibleServices(c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        DlServiceInt dlServiceInt = this.f18642a;
        return dlServiceInt.getDlDetails_new(hc.a.f12073a.t() + "service/getDLLicence", c0Var, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f18642a.getLastEndorsedRTO(c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        DlServiceInt dlServiceInt = this.f18642a;
        return dlServiceInt.getResendOtp(hc.a.f12073a.o() + "service/reSendSMSAlerts", c0Var, str);
    }

    public final Call h(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        DlServiceInt dlServiceInt = this.f18642a;
        return dlServiceInt.getSendOtpRes(hc.a.f12073a.o() + "service/sendSMSAlerts", c0Var, str);
    }

    public final Call i(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        DlServiceInt dlServiceInt = this.f18642a;
        return dlServiceInt.verifyOtpDetails(hc.a.f12073a.o() + "service/verifySMSOtp", c0Var, str);
    }
}
