package i9;

import cm.l;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final OffenceInterface f12610a;

    public a(OffenceInterface offenceInterface) {
        l.f(offenceInterface, "retrofitService");
        this.f12610a = offenceInterface;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f12610a.getAccDashboardRecords(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f12610a.getAccidentList(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f12610a.getAccidentFeedback(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f12610a.getAccidentViolationEvidence(c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getOffencesChanged(hc.a.f12073a.q() + "service/getOffences", c0Var, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getDashboardRecords(hc.a.f12073a.w() + "service/countByStatus", c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f12610a.getLastAccident(c0Var, str);
    }

    public final Call h(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getLastViolation(hc.a.f12073a.w() + "service/getLastReportedViolation", c0Var, str);
    }

    public final Call i(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getOffenceList(hc.a.f12073a.w() + "service/getReportedViolations", c0Var, str);
    }

    public final Call j(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getStates(hc.a.f12073a.q() + "service/getStateMaster", c0Var, str);
    }

    public final Call k(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getTrafficFeedback(hc.a.f12073a.w() + "service/getViolationFeedBack", c0Var, str);
    }

    public final Call l(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getViolationEvidence(hc.a.f12073a.w() + "service/getViolationEvidence", c0Var, str);
    }

    public final Call m(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f12610a.saveAccidentFeedback(c0Var, str);
    }

    public final Call n(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f12610a.submitAccidentReport(c0Var, str);
    }

    public final Call o(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.submitOffenceFeedBack(hc.a.f12073a.w() + "service/saveViolationFeedback", c0Var, str);
    }

    public final Call p(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.submitOffenceReport(hc.a.f12073a.w() + "service/reportCitizenViolation", c0Var, str);
    }

    public final Call q(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        OffenceInterface offenceInterface = this.f12610a;
        return offenceInterface.getVerifyVehicleNo(hc.a.f12073a.t() + "service/verifyRC", c0Var, str);
    }
}
