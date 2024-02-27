package nh;

import cm.l;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerSaveToDraftAAdhar.ToSaveToDraftBuyerRepo.TOSaveToDraftServiceBuyerAadhar;
import retrofit2.Call;
import um.c0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final TOSaveToDraftServiceBuyerAadhar f25141a;

    public b(TOSaveToDraftServiceBuyerAadhar tOSaveToDraftServiceBuyerAadhar) {
        l.f(tOSaveToDraftServiceBuyerAadhar, "retrofitService");
        this.f25141a = tOSaveToDraftServiceBuyerAadhar;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f25141a.savetoDrfatTO(c0Var, str);
    }
}
