package com.nic.mparivahan.VahanServices.VahanLog;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanCaptureRes;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import i7.d;
import id.c;
import j$.util.Base64;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import t8.c;
import um.c0;

public final class SaveVahanlog extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f20959k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f20960j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, NrvDetails nrvDetails, boolean z10, String str, String str2, String str3) {
            l.f(context, "context");
            l.f(nrvDetails, "rcdetails");
            l.f(str, "app_no");
            l.f(str2, "pur_code");
            l.f(str3, "rtocode");
            String t10 = new d().t(nrvDetails);
            Log.e("json->", t10);
            androidx.work.b a10 = new b.a().b("RC", t10).b("isEKYC", Boolean.valueOf(z10)).b(VContant.APP_NO, str).b("PurCode", str2).b("rtocode", str3).a();
            l.e(a10, "build(...)");
            m1.d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(SaveVahanlog.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f20961a;

        b(u uVar) {
            this.f20961a = uVar;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Login eRRO", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            String a10;
            String str = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                c.a aVar = c.f12675a;
                String str2 = (String) this.f20961a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f20961a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), VahanCaptureRes.class);
            l.e(j10, "fromJson(...)");
            VahanCaptureRes vahanCaptureRes = (VahanCaptureRes) j10;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveVahanlog(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f20960j = context;
    }

    public c.a p() {
        try {
            Object j10 = new i7.d().j(f().m("RC"), NrvDetails.class);
            l.e(j10, "fromJson(...)");
            NrvDetails nrvDetails = (NrvDetails) j10;
            boolean h10 = f().h("isEKYC", false);
            r(nrvDetails, h10 ? "Y" : "N", String.valueOf(f().m(VContant.APP_NO)), String.valueOf(f().m("PurCode")), String.valueOf(f().m("rtocode")));
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(NrvDetails nrvDetails, String str, String str2, String str3, String str4) {
        l.f(nrvDetails, "rc_details");
        String str5 = str;
        l.f(str5, "isEKYC");
        String str6 = str2;
        l.f(str6, "app_no");
        String str7 = str3;
        l.f(str7, "pur_code");
        String str8 = str4;
        l.f(str8, "rtocode");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        ld.g gVar = new ld.g(this.f20960j);
        VahanServiceConnection d10 = VahanServiceConnection.f21199a.d(this.f20960j);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        c.a aVar2 = t8.c.f16582a;
        String k10 = gVar.k();
        String l10 = gVar.l();
        String jSONObject = aVar2.y(k10, l10, nrvDetails, str5, str6, str7, str8).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        d10.saveVahanLog(hc.a.f12073a.s() + "service/saveVahanLogDetails", f10, (String) uVar.f20234e).enqueue(new b(uVar));
    }
}
