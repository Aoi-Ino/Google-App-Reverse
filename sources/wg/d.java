package wg;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import retrofit2.Call;
import um.c0;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final VahanProService f32569a;

    public d(VahanProService vahanProService) {
        l.f(vahanProService, "retrofitService");
        this.f32569a = vahanProService;
    }

    public final Call A(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.requestForduplicateRc(c0Var, str);
    }

    public final Call B(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.requestHptService(c0Var, str);
    }

    public final Call C(c0 c0Var, String str) {
        l.f(c0Var, "request");
        l.f(str, "currentTime");
        return this.f32569a.saveSlotAppointmentDetails(c0Var, str);
    }

    public final Call D(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.sendChangeOfAddress(c0Var, str);
    }

    public final Call E(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.submitFinalRequest(c0Var, str);
    }

    public final Call F(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.submitRequestForNocDraft(c0Var, str);
    }

    public final Call G(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.validateAadhaar(c0Var, str);
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.afterPayment(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.checkhold(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.checkPaymentStatusForSlot(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.checkSlotEligibility(c0Var, str);
    }

    public final Call e(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.checkStateCoustomization(c0Var, str);
    }

    public final Call f(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.downloadNoc(c0Var, str);
    }

    public final Call g(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getAadMobCheck(c0Var, str);
    }

    public final Call h(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getAadharFacelessAppCheck(c0Var, str);
    }

    public final Call i(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getBeforPaymentUrl(c0Var, str);
    }

    public final Call j(c0 c0Var, String str) {
        l.f(c0Var, "request");
        l.f(str, "currentTime");
        return this.f32569a.getCounterIdForSlot(c0Var, str);
    }

    public final Call k(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getFeesDetails(c0Var, str);
    }

    public final Call l(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getFormDetails(c0Var, str);
    }

    public final Call m(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getNocReasonData(c0Var, str);
    }

    public final Call n(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getOwnerDetails(c0Var, str);
    }

    public final Call o(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getRcValues(c0Var, str);
    }

    public final Call p(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getReson(c0Var, str);
    }

    public final Call q(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getRtoNameForNoc(c0Var, str);
    }

    public final Call r(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getSlotAppointmentByDate(c0Var, str);
    }

    public final Call s(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getStateCode(c0Var, str);
    }

    public final Call t(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getStateMasterList(c0Var, str);
    }

    public final Call u(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getValidateregandchasino(c0Var, str);
    }

    public final Call v(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getallowedservices(c0Var, str);
    }

    public final Call w(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getclassDes(c0Var, str);
    }

    public final Call x(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.getdistict(c0Var, str);
    }

    public final Call y(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.gethptDetails(c0Var, str);
    }

    public final Call z(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f32569a.requestForBefoPayment(c0Var, str);
    }
}
