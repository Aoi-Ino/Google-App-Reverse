package com.nic.mparivahan.Echallan.echallanLog;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import com.nic.mparivahan.Echallan.Model.UpdateLogModel;
import com.nic.mparivahan.Echallan.Networking.SearchChallanService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class UpdateLog extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8910k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f8911j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, String str, String str2, String str3, String str4, String str5, double d10) {
            l.f(context, "context");
            l.f(str, "challanStatus");
            l.f(str2, "challanPaymentDate");
            l.f(str3, "challanReceiptNo");
            l.f(str4, "challanTransId");
            l.f(str5, "challanNo");
            androidx.work.b a10 = new b.a().b("paymentDate", str2).b("transId", str4).b("challanNo", str5).b("challanStatus", str).b("receiptNo", str3).b("challanAmt", Double.valueOf(d10)).a();
            l.e(a10, "build(...)");
            d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(UpdateLog.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8912a;

        b(String str) {
            this.f8912a = str;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
        }

        public void onResponse(Call call, Response response) {
            String a10;
            l.f(call, "call");
            l.f(response, "response");
            try {
                SecurityModle securityModle = (SecurityModle) response.body();
                String str = null;
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str2 = this.f8912a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str3 = this.f8912a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), UpdateLogModel.class);
                l.e(j10, "fromJson(...)");
                UpdateLogModel updateLogModel = (UpdateLogModel) j10;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateLog(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f8911j = context;
    }

    private final void r(String str, String str2, String str3, String str4, String str5, double d10) {
        ld.g gVar = new ld.g(this.f8911j);
        SearchChallanService g10 = SearchChallanService.f8750a.g(this.f8911j);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("echlogChallanStatus", (Object) str4);
            jSONObject2.put("echlogCtzId", Long.parseLong(gVar.k()));
            jSONObject2.put("echlogMobileNo", (Object) gVar.l());
            jSONObject2.put("echlogPaymentDate", (Object) str);
            jSONObject2.put("echlogReceiptNo", (Object) str5);
            jSONObject2.put("echlogTransId", (Object) str2);
            jSONObject2.put("echlogchallannumber", (Object) str3);
            jSONObject2.put("challanAmt", d10);
            jSONObject.put("Echallan", (Object) jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject3 = jSONObject.toString();
        l.e(jSONObject3, "toString(...)");
        g10.updateEchallanLog(aVar.f(b10, jSONObject3), valueOf).enqueue(new b(valueOf));
    }

    public c.a p() {
        try {
            String m10 = f().m("paymentDate");
            l.c(m10);
            String m11 = f().m("transId");
            l.c(m11);
            String m12 = f().m("challanNo");
            l.c(m12);
            String m13 = f().m("challanStatus");
            l.c(m13);
            String m14 = f().m("receiptNo");
            l.c(m14);
            r(m10, m11, m12, m13, m14, f().i("challanAmt", 0.0d));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }
}
