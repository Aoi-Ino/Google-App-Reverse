package com.nic.mparivahan.Tax.ViewModel;

import androidx.lifecycle.a0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Tax.Model.CalculateTaxResponse;
import com.nic.mparivahan.Tax.Model.Errormodel;
import i7.d;
import org.json.JSONObject;
import pb.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public final class PaytaxViewModel$gettaxModeListener$1 implements Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u f20506a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PaytaxViewModel f20507b;

    PaytaxViewModel$gettaxModeListener$1(u uVar, PaytaxViewModel paytaxViewModel) {
        this.f20506a = uVar;
        this.f20507b = paytaxViewModel;
    }

    public void onFailure(Call call, Throwable th2) {
        l.f(call, "call");
        l.f(th2, "t");
        this.f20507b.n().k("Error");
    }

    public void onResponse(Call call, Response response) {
        Object obj;
        a0 p10;
        l.f(call, "call");
        l.f(response, "response");
        if (response.isSuccessful() && response.code() == 200) {
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                a.C0201a aVar = a.f14908a;
                String str = (String) this.f20506a.f20234e;
                String data = securityModle != null ? securityModle.getData() : null;
                l.c(data);
                String a10 = aVar.a(str, data);
                if (new JSONObject(a10).has("errorcode")) {
                    Errormodel errormodel = (Errormodel) new d().k(a10, new PaytaxViewModel$gettaxModeListener$1$onResponse$type$1().getType());
                    if (errormodel != null) {
                        p10 = this.f20507b.n();
                        obj = errormodel.getErrorDesc();
                    } else {
                        return;
                    }
                } else {
                    Object j10 = new d().j(a10, CalculateTaxResponse.class);
                    l.e(j10, "fromJson(...)");
                    obj = (CalculateTaxResponse) j10;
                    p10 = this.f20507b.p();
                }
                p10.k(obj);
            } catch (Exception unused) {
                this.f20507b.n().k("Error");
            }
        }
    }
}
