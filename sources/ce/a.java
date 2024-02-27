package ce;

import cm.l;
import com.nic.mparivahan.VahanServices.Checkpost.CheckpostTaxReceipt.CheckpostTaxReceiptServices.CheckpostTaxReceiptServices;
import retrofit2.Call;
import um.c0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final CheckpostTaxReceiptServices f20039a;

    public a(CheckpostTaxReceiptServices checkpostTaxReceiptServices) {
        l.f(checkpostTaxReceiptServices, "retrofitService");
        this.f20039a = checkpostTaxReceiptServices;
    }

    public final Call a(c0 c0Var, String str) {
        l.f(c0Var, "requestBody");
        l.f(str, "currentTime");
        return this.f20039a.searchavailableReceipt(c0Var, str);
    }
}
