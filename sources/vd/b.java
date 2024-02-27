package vd;

import android.content.Context;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycRequest;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycModel.eKycResponse;
import com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.EkycVerifyResponse;
import com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;
import um.x;
import v9.d;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f32252d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f32253e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f32254f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f32255g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f32256h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f32257i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f32258j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f32259k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f32260l = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f32261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f32262b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f32263c;

        a(Context context, u uVar, b bVar) {
            this.f32261a = context;
            this.f32262b = uVar;
            this.f32263c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f32261a;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.z(), "generateOtp", aVar2.v(), aVar2.w());
            this.f32263c.j().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f32261a, d.f17494a.z(), "generateOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f32262b.f20234e, data), eKycResponse.class);
                l.e(j10, "fromJson(...)");
                this.f32263c.i().k((eKycResponse) j10);
            } catch (Exception unused) {
                this.f32263c.j().k("error");
            }
        }
    }

    /* renamed from: vd.b$b  reason: collision with other inner class name */
    public static final class C0369b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f32264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f32265b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f32266c;

        C0369b(Context context, u uVar, b bVar) {
            this.f32264a = context;
            this.f32265b = uVar;
            this.f32266c = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            ApiMonitorLog.a aVar = ApiMonitorLog.f20957k;
            Context context = this.f32264a;
            d.a aVar2 = d.f17494a;
            aVar.a(context, aVar2.z(), "verifyOtp", aVar2.v(), aVar2.w());
            this.f32266c.h().k(th2 != null ? th2.getMessage() : null);
        }

        public void onResponse(Call call, Response response) {
            try {
                SecurityModle securityModle = null;
                ApiMonitorLog.f20957k.a(this.f32264a, d.f17494a.z(), "verifyOtp", String.valueOf(response != null ? Integer.valueOf(response.code()) : null), String.valueOf(response != null ? response.message() : null));
                if (response != null) {
                    securityModle = (SecurityModle) response.body();
                }
                l.c(securityModle);
                String data = securityModle.getData();
                l.c(data);
                Object j10 = new i7.d().j(pb.a.f14908a.a((String) this.f32265b.f20234e, data), EkycVerifyResponse.class);
                l.e(j10, "fromJson(...)");
                this.f32266c.g().k((EkycVerifyResponse) j10);
            } catch (Exception unused) {
                this.f32266c.h().k("error");
            }
        }
    }

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f32252d = aVar;
    }

    public final a0 g() {
        return this.f32255g;
    }

    public final a0 h() {
        return this.f32256h;
    }

    public final a0 i() {
        return this.f32253e;
    }

    public final a0 j() {
        return this.f32254f;
    }

    public final void k(Context context, String str, String str2, NrvDetails nrvDetails, String str3, String str4) {
        eKycRequest ekycrequest;
        Context context2 = context;
        String str5 = str3;
        String str6 = str4;
        l.f(context2, "context");
        l.f(str, "aadhaar_no");
        l.f(str2, "rc_number");
        l.f(nrvDetails, "rcdetails");
        l.f(str5, "type");
        l.f(str6, "purposeCode");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str6);
        if (!p.o(str5, "A", true)) {
            String str7 = str3;
            String valueOf = String.valueOf(nrvDetails.getRc_chasi_no());
            String str8 = "yes";
            String str9 = "";
            String str10 = "";
            String str11 = "";
            String str12 = str2;
            String valueOf2 = String.valueOf(nrvDetails.getState_cd());
            String str13 = "";
            String str14 = "";
            String str15 = str;
        } else {
            ekycrequest = new eKycRequest(str, str3, String.valueOf(nrvDetails.getRc_chasi_no()), "yes", "", "", "", true, arrayList, str2, String.valueOf(nrvDetails.getState_cd()), "", "", "");
        }
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f32252d.a(c0.Companion.f(x.f32156g.b("application/json"), c.f16582a.e(ekycrequest)), (String) uVar.f20234e).enqueue(new a(context2, uVar, this));
    }

    public final void l(Context context, String str, String str2, NrvDetails nrvDetails, String str3, String str4, String str5, String str6) {
        eKycRequest ekycrequest;
        Context context2 = context;
        String str7 = str3;
        String str8 = str4;
        l.f(context2, "context");
        l.f(str, "aadhaar_no");
        l.f(str2, "rc_number");
        l.f(nrvDetails, "rcdetails");
        l.f(str7, "type");
        l.f(str8, "purposeCode");
        l.f(str5, "otp");
        l.f(str6, "tran_no");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str8);
        if (!p.o(str7, "A", true)) {
            String str9 = str3;
            String valueOf = String.valueOf(nrvDetails.getRc_chasi_no());
            String str10 = "yes";
            String str11 = "";
            String str12 = "";
            String str13 = str5;
            String str14 = str2;
            String valueOf2 = String.valueOf(nrvDetails.getState_cd());
            String str15 = str6;
            String str16 = "";
            String str17 = str;
        } else {
            ekycrequest = new eKycRequest(str, str3, String.valueOf(nrvDetails.getRc_chasi_no()), "yes", "", "", str5, true, arrayList, str2, String.valueOf(nrvDetails.getState_cd()), str6, "", "");
        }
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f32252d.b(c0.Companion.f(x.f32156g.b("application/json"), c.f16582a.e(ekycrequest).toString()), (String) uVar.f20234e).enqueue(new C0369b(context2, uVar, this));
    }
}
