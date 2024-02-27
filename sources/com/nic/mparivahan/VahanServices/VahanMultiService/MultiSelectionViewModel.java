package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiBeforePaymentResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeeRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.FeeModel.FeesResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectRequest;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class MultiSelectionViewModel extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f21045d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f21046e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f21047f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f21048g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f21049h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f21050i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f21051j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f21052k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f21053l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f21054m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f21055n = new a0();

    /* renamed from: o  reason: collision with root package name */
    private final a0 f21056o = new a0();

    /* renamed from: p  reason: collision with root package name */
    private final a0 f21057p = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f21058a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MultiSelectionViewModel f21059b;

        a(u uVar, MultiSelectionViewModel multiSelectionViewModel) {
            this.f21058a = uVar;
            this.f21059b = multiSelectionViewModel;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f21059b.q().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f21059b.q().k("Error");
                    Log.e("BeforePayment_ERROR", e10.getStackTrace().toString());
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f21058a.f20234e, data), MultiBeforePaymentResponse.class);
            l.e(j10, "fromJson(...)");
            this.f21059b.p().k((MultiBeforePaymentResponse) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f21060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MultiSelectionViewModel f21061b;

        b(u uVar, MultiSelectionViewModel multiSelectionViewModel) {
            this.f21060a = uVar;
            this.f21061b = multiSelectionViewModel;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f21061b.i().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                l.c(response);
                if (response.isSuccessful() && response.code() == 200) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    l.c(securityModle);
                    String data = securityModle.getData();
                    l.c(data);
                    Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f21060a.f20234e, data), FeesResponse.class);
                    l.e(j10, "fromJson(...)");
                    this.f21061b.h().k((FeesResponse) j10);
                } else if (response.code() == 400) {
                    this.f21061b.i().k("error");
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f21061b.i().k("error");
            }
        }
    }

    public static final class c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f21062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MultiSelectionViewModel f21063b;

        c(u uVar, MultiSelectionViewModel multiSelectionViewModel) {
            this.f21062a = uVar;
            this.f21063b = multiSelectionViewModel;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f21063b.m().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                l.c(response);
                if (response.isSuccessful() && response.code() == 200) {
                    SecurityModle securityModle = (SecurityModle) response.body();
                    l.c(securityModle);
                    String data = securityModle.getData();
                    l.c(data);
                    String a10 = pb.a.f14908a.a((String) this.f21062a.f20234e, data);
                    JSONObject jSONObject = new JSONObject(a10);
                    if (jSONObject.has("apiMessage")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("apiMessage");
                        if (jSONObject2.getInt("statusCode") == 400) {
                            this.f21063b.m().k(jSONObject2.getString("developerMessage"));
                            return;
                        }
                        Object j10 = new i7.d().j(a10, DraftResponse.class);
                        l.e(j10, "fromJson(...)");
                        this.f21063b.l().k((DraftResponse) j10);
                        return;
                    }
                    this.f21063b.m().k("error");
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f21063b.m().k("error");
            }
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f21064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MultiSelectionViewModel f21065b;

        d(u uVar, MultiSelectionViewModel multiSelectionViewModel) {
            this.f21064a = uVar;
            this.f21065b = multiSelectionViewModel;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f21065b.k().k(th2 != null ? th2.toString() : null);
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    this.f21065b.k().k("error");
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f21064a.f20234e, data), FinalRequestSubmitResponse.class);
            l.e(j10, "fromJson(...)");
            this.f21065b.j().k((FinalRequestSubmitResponse) j10);
        }
    }

    public MultiSelectionViewModel(b bVar) {
        l.f(bVar, "repository");
        this.f21045d = bVar;
    }

    public final void g(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        l.f(multiServiceBeforePaymentRequest, "param");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String t10 = new i7.d().t(multiServiceBeforePaymentRequest);
        l.e(t10, "toJson(...)");
        this.f21045d.b(c0.Companion.f(x.f32156g.b("application/json"), t10), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final a0 h() {
        return this.f21050i;
    }

    public final a0 i() {
        return this.f21051j;
    }

    public final a0 j() {
        return this.f21054m;
    }

    public final a0 k() {
        return this.f21055n;
    }

    public final a0 l() {
        return this.f21048g;
    }

    public final a0 m() {
        return this.f21049h;
    }

    public final a0 n() {
        return this.f21046e;
    }

    public final a0 o() {
        return this.f21047f;
    }

    public final a0 p() {
        return this.f21052k;
    }

    public final a0 q() {
        return this.f21053l;
    }

    public final void r(FeeRequest feeRequest) {
        l.f(feeRequest, "feeRequest");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String t10 = new i7.d().t(feeRequest);
        l.e(t10, "toJson(...)");
        this.f21045d.d(c0.Companion.f(x.f32156g.b("application/json"), t10), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final a0 s() {
        return this.f21056o;
    }

    public final a0 t() {
        return this.f21057p;
    }

    public final void u(MultiSelectRequest multiSelectRequest) {
        l.f(multiSelectRequest, "multiSelectRequest");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f21045d.c(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.o(multiSelectRequest).toString()), (String) uVar.f20234e).enqueue(new MultiSelectionViewModel$multSelectService$1(uVar, this));
    }

    public final void v(MultiServiceDraft multiServiceDraft) {
        l.f(multiServiceDraft, "multiSelectRequest");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        String t10 = new i7.d().t(multiServiceDraft);
        l.e(t10, "toJson(...)");
        this.f21045d.e(c0.Companion.f(x.f32156g.b("application/json"), t10), (String) uVar.f20234e).enqueue(new c(uVar, this));
    }

    public final void w(String str, boolean z10) {
        l.f(str, "requestParam");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f21045d.a(c0.Companion.f(x.f32156g.b("application/json"), str.toString()), (String) uVar.f20234e).enqueue(new MultiSelectionViewModel$sellerDraft$1(uVar, this));
    }

    public final void x(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        l.f(multiServiceBeforePaymentRequest, "finalSubmit");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f21045d.f(c0.Companion.f(x.f32156g.b("application/json"), new i7.d().t(multiServiceBeforePaymentRequest).toString()), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }
}
