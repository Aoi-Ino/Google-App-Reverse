package bf;

import cm.l;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusServices.AuctionStatusRetrofitServices;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AuctionStatusRetrofitServices f19431a;

    public b(AuctionStatusRetrofitServices auctionStatusRetrofitServices) {
        l.f(auctionStatusRetrofitServices, "retrofitService");
        this.f19431a = auctionStatusRetrofitServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f19431a.auctionStatus(c0Var, str);
    }
}
