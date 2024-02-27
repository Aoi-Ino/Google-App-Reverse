package com.nic.mparivahan.Tax.ViewModel;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import androidx.lifecycle.x;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.Tax.Model.Afterpayment;
import com.nic.mparivahan.Tax.Model.CalculateTaxResponse;
import com.nic.mparivahan.Tax.Model.TaxDataFormat;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import org.json.JSONObject;
import pb.a;
import rd.h;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;

public final class PaytaxViewModel extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final h f20486d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f20487e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f20488f;

    /* renamed from: g  reason: collision with root package name */
    private final x f20489g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f20490h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f20491i;

    /* renamed from: j  reason: collision with root package name */
    private final x f20492j;

    /* renamed from: k  reason: collision with root package name */
    private final a0 f20493k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final a0 f20494l;

    /* renamed from: m  reason: collision with root package name */
    private final x f20495m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f20496n;

    /* renamed from: o  reason: collision with root package name */
    private final a0 f20497o;

    /* renamed from: p  reason: collision with root package name */
    private final x f20498p;

    /* renamed from: q  reason: collision with root package name */
    private final a0 f20499q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final a0 f20500r;

    /* renamed from: s  reason: collision with root package name */
    private final x f20501s;

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f20502a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaytaxViewModel f20503b;

        a(u uVar, PaytaxViewModel paytaxViewModel) {
            this.f20502a = uVar;
            this.f20503b = paytaxViewModel;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f20503b.l().k(th2.getMessage());
        }

        public void onResponse(Call call, Response response) {
            l.f(call, "call");
            l.f(response, "response");
            if (!response.isSuccessful()) {
                this.f20503b.l().k("Error");
            } else if (((SecurityModle) response.body()) != null && ((SecurityModle) response.body()) != null) {
                SecurityModle securityModle = (SecurityModle) response.body();
                a.C0201a aVar = pb.a.f14908a;
                String str = (String) this.f20502a.f20234e;
                String data = securityModle != null ? securityModle.getData() : null;
                l.c(data);
                Object j10 = new d().j(aVar.a(str, data), Afterpayment.class);
                l.e(j10, "fromJson(...)");
                this.f20503b.f20500r.k((Afterpayment) j10);
            }
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f20504a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaytaxViewModel f20505b;

        b(u uVar, PaytaxViewModel paytaxViewModel) {
            this.f20504a = uVar;
            this.f20505b = paytaxViewModel;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f20505b.k().k("Error");
        }

        public void onResponse(Call call, Response response) {
            l.f(call, "call");
            l.f(response, "response");
            try {
                if (response.isSuccessful() && ((SecurityModle) response.body()) != null) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    a.C0201a aVar = pb.a.f14908a;
                    String str = (String) this.f20504a.f20234e;
                    String data = securityModle != null ? securityModle.getData() : null;
                    l.c(data);
                    String a10 = aVar.a(str, data);
                    JSONObject jSONObject = new JSONObject(a10);
                    if (!jSONObject.has("errorDesc")) {
                        Object j10 = new d().j(a10, TaxDataFormat.class);
                        l.e(j10, "fromJson(...)");
                        this.f20505b.f20494l.k((TaxDataFormat) j10);
                    } else if (jSONObject.getString("errorDesc").toString() != null) {
                        this.f20505b.k().k(jSONObject.getString("errorDesc").toString());
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f20505b.k().k("Error");
            }
        }
    }

    public PaytaxViewModel(h hVar) {
        l.f(hVar, "repository");
        this.f20486d = hVar;
        a0 a0Var = new a0();
        this.f20488f = a0Var;
        this.f20489g = a0Var;
        this.f20490h = new a0();
        a0 a0Var2 = new a0();
        this.f20491i = a0Var2;
        this.f20492j = a0Var2;
        this.f20493k = new a0();
        a0 a0Var3 = new a0();
        this.f20494l = a0Var3;
        this.f20495m = a0Var3;
        this.f20496n = new a0();
        a0 a0Var4 = new a0();
        this.f20497o = a0Var4;
        this.f20498p = a0Var4;
        this.f20499q = new a0();
        a0 a0Var5 = new a0();
        this.f20500r = a0Var5;
        this.f20501s = a0Var5;
    }

    public final x i() {
        return this.f20501s;
    }

    public final x j() {
        return this.f20489g;
    }

    public final a0 k() {
        return this.f20493k;
    }

    public final a0 l() {
        return this.f20499q;
    }

    public final a0 m() {
        return this.f20487e;
    }

    public final a0 n() {
        return this.f20490h;
    }

    public final a0 o() {
        return this.f20488f;
    }

    public final a0 p() {
        return this.f20491i;
    }

    public final x q() {
        return this.f20495m;
    }

    public final x r() {
        return this.f20492j;
    }

    public final void s(String str) {
        l.f(str, "encstring");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("encstring", (Object) str);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f20486d.b(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final void t(String str, String str2, String str3, String str4, String str5) {
        l.f(str, "state_cd");
        l.f(str2, "regn_no");
        l.f(str3, "tax_mode");
        l.f(str4, "pur_cd");
        l.f(str5, "noofperm");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f20486d.c(c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.Y(str, str2, str3, str4, str5)), (String) uVar.f20234e).enqueue(new PaytaxViewModel$gettaxModeListener$1(uVar, this));
    }

    public final void u(String str, String str2, String str3) {
        l.f(str, "state_cd");
        l.f(str2, "regn_no");
        l.f(str3, "chassis_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f20486d.d(c0.Companion.f(um.x.f32156g.b("application/json"), VUtility.Companion.g(str, str2, str3)), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final void v(CalculateTaxResponse calculateTaxResponse) {
        l.f(calculateTaxResponse, "param");
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f20486d.a(c0.Companion.f(um.x.f32156g.b("application/json"), new d().t(calculateTaxResponse).toString()), valueOf).enqueue(new PaytaxViewModel$postbeforepaymentone$1(valueOf, this));
    }
}
