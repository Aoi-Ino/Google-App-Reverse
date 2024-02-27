package lf;

import cm.l;
import com.nic.mparivahan.VahanServices.FancyServices.RunningAuctionRepository.RunningAuctionRetrofitServices;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final RunningAuctionRetrofitServices f24822a;

    public b(RunningAuctionRetrofitServices runningAuctionRetrofitServices) {
        l.f(runningAuctionRetrofitServices, "retrofitService");
        this.f24822a = runningAuctionRetrofitServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "timestamp");
        return this.f24822a.auctionStatus(c0Var, str);
    }
}
