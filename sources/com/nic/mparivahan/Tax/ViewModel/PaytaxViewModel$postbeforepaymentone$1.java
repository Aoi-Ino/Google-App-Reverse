package com.nic.mparivahan.Tax.ViewModel;

import android.util.Log;
import androidx.lifecycle.a0;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Tax.Model.BeforeResponse;
import com.nic.mparivahan.Tax.Model.Errormodel;
import i7.d;
import java.lang.reflect.Type;
import org.json.JSONObject;
import pb.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.e0;

public final class PaytaxViewModel$postbeforepaymentone$1 implements Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f20508a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PaytaxViewModel f20509b;

    PaytaxViewModel$postbeforepaymentone$1(String str, PaytaxViewModel paytaxViewModel) {
        this.f20508a = str;
        this.f20509b = paytaxViewModel;
    }

    public void onFailure(Call call, Throwable th2) {
        l.f(call, "call");
        l.f(th2, "t");
        this.f20509b.m().k(th2.getMessage());
    }

    public void onResponse(Call call, Response response) {
        a0 m10;
        Object errorDesc;
        l.f(call, "call");
        l.f(response, "response");
        if (response.isSuccessful()) {
            if (((SecurityModle) response.body()) != null) {
                SecurityModle securityModle = (SecurityModle) response.body();
                a.C0201a aVar = a.f14908a;
                String str = this.f20508a;
                String data = securityModle != null ? securityModle.getData() : null;
                l.c(data);
                String a10 = aVar.a(str, data);
                JSONObject jSONObject = new JSONObject(a10);
                if (jSONObject.has("errorcode")) {
                    String string = jSONObject.getString("errorDesc");
                    l.e(string, "getString(...)");
                    m10 = this.f20509b.m();
                    errorDesc = string.toString();
                } else {
                    Object j10 = new d().j(a10, BeforeResponse.class);
                    l.e(j10, "fromJson(...)");
                    errorDesc = (BeforeResponse) j10;
                    m10 = this.f20509b.o();
                }
            } else {
                return;
            }
        } else if (response.code() == 400) {
            Log.e("Test-1", "1test400");
            d dVar = new d();
            Type type = new PaytaxViewModel$postbeforepaymentone$1$onResponse$type$1().getType();
            e0 errorBody = response.errorBody();
            l.c(errorBody);
            Errormodel errormodel = (Errormodel) dVar.h(errorBody.charStream(), type);
            if (errormodel != null) {
                m10 = this.f20509b.m();
                errorDesc = errormodel.getErrorDesc();
            } else {
                return;
            }
        } else {
            this.f20509b.m().k("Error");
            return;
        }
        m10.k(errorDesc);
    }
}
