package ga;

import cm.l;
import com.nic.mparivahan.DPTNotice.Services.NoticeService;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final NoticeService f11739a;

    public a(NoticeService noticeService) {
        l.f(noticeService, "retrofit");
        this.f11739a = noticeService;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f11739a.verifyPaymentStatus(c0Var, str);
    }

    public final Call b(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f11739a.getVirtualCourt(c0Var, str);
    }

    public final Call c(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f11739a.getNoticeListUsingNoticeNo(c0Var, str);
    }

    public final Call d(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timeStamp");
        return this.f11739a.getNoticeListUsingVehicleNo(c0Var, str);
    }
}
