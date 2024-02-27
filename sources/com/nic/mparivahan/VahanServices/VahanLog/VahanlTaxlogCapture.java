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
import com.nic.mparivahan.Tax.Model.Afterpayment;
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
import um.c0;

public final class VahanlTaxlogCapture extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f20971k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f20972j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, Afterpayment afterpayment, int i10) {
            l.f(context, "context");
            l.f(afterpayment, "afterpayment");
            androidx.work.b a10 = new b.a().b("AfterPayment", new d().t(afterpayment)).b("Flag", Integer.valueOf(i10)).a();
            l.e(a10, "build(...)");
            m1.d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(VahanlTaxlogCapture.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f20973a;

        b(u uVar) {
            this.f20973a = uVar;
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
                String str2 = (String) this.f20973a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f20973a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            String valueOf = String.valueOf(a10);
            Log.e("LogAfterPayment", valueOf);
            Object j10 = new i7.d().j(valueOf, VahanCaptureRes.class);
            l.e(j10, "fromJson(...)");
            VahanCaptureRes vahanCaptureRes = (VahanCaptureRes) j10;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VahanlTaxlogCapture(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f20972j = context;
    }

    public c.a p() {
        try {
            i7.d dVar = new i7.d();
            int j10 = f().j("Flag", 1);
            Object j11 = dVar.j(f().m("AfterPayment"), Afterpayment.class);
            l.e(j11, "fromJson(...)");
            r((Afterpayment) j11, j10);
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(Afterpayment afterpayment, int i10) {
        l.f(afterpayment, "afterpayment");
        new ld.g(this.f20972j);
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        VahanServiceConnection d10 = VahanServiceConnection.f21199a.d(this.f20972j);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.E(afterpayment, i10).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        d10.updateVahanLogs(hc.a.f12073a.s() + "service/updateVahanLogDetails", f10, (String) uVar.f20234e).enqueue(new b(uVar));
    }
}
