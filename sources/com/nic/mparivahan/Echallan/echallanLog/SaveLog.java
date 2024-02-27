package com.nic.mparivahan.Echallan.echallanLog;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import com.nic.mparivahan.Echallan.Model.SaveEchallanLogModel;
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

public final class SaveLog extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8907k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f8908j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, String str, int i10, String str2, String str3, int i11, String str4, String str5, String str6, String str7, String str8, String str9, double d10) {
            String str10 = str;
            String str11 = str2;
            String str12 = str3;
            String str13 = str4;
            String str14 = str5;
            String str15 = str6;
            String str16 = str8;
            String str17 = str9;
            l.f(context, "context");
            l.f(str10, "challanDateTime");
            l.f(str11, "vehicleNo");
            l.f(str12, "paymentDate");
            l.f(str13, "stateCd");
            l.f(str14, "transId");
            l.f(str15, "challanNo");
            l.f(str7, "challanStatus");
            l.f(str16, "docType");
            l.f(str17, "receiptNo");
            androidx.work.b a10 = new b.a().b("challanDateTime", str10).b("deptCd", Integer.valueOf(i10)).b("vehicleNo", str11).b("paymentDate", str12).b("rtocode", Integer.valueOf(i11)).b("stateCd", str13).b("transId", str14).b("challanNo", str15).b("challanStatus", str7).b("docType", str16).b("receiptNo", str17).b("challanAmt", Double.valueOf(d10)).a();
            l.e(a10, "build(...)");
            d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(SaveLog.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8909a;

        b(String str) {
            this.f8909a = str;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            Log.e("Login eRRO", String.valueOf(th2.getMessage()));
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
                    String str2 = this.f8909a;
                    Base64.Decoder decoder = Base64.getDecoder();
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode = decoder.decode(str);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str2, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str3 = this.f8909a;
                    if (securityModle != null) {
                        str = securityModle.getData();
                    }
                    byte[] decode2 = android.util.Base64.decode(str, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), SaveEchallanLogModel.class);
                l.e(j10, "fromJson(...)");
                SaveEchallanLogModel saveEchallanLogModel = (SaveEchallanLogModel) j10;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveLog(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f8908j = context;
    }

    public c.a p() {
        try {
            String m10 = f().m("challanDateTime");
            l.c(m10);
            int j10 = f().j("deptCd", 0);
            String m11 = f().m("vehicleNo");
            l.c(m11);
            String m12 = f().m("paymentDate");
            l.c(m12);
            int j11 = f().j("rtocode", 0);
            String m13 = f().m("stateCd");
            l.c(m13);
            String m14 = f().m("transId");
            l.c(m14);
            String m15 = f().m("challanNo");
            l.c(m15);
            String m16 = f().m("challanStatus");
            l.c(m16);
            String m17 = f().m("docType");
            l.c(m17);
            String m18 = f().m("receiptNo");
            l.c(m18);
            r(m10, j10, m11, m12, j11, m13, m14, m15, m16, m17, m18, f().i("challanAmt", 0.0d));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(String str, int i10, String str2, String str3, int i11, String str4, String str5, String str6, String str7, String str8, String str9, double d10) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        l.f(str10, "challanDateTime");
        l.f(str11, "vehicleNo");
        l.f(str12, "paymentDate");
        l.f(str13, "stateCd");
        l.f(str14, "transId");
        l.f(str15, "challanNo");
        l.f(str16, "challanStatus");
        l.f(str17, "docType");
        l.f(str18, "receiptNo");
        ld.g gVar = new ld.g(this.f8908j);
        SearchChallanService g10 = SearchChallanService.f8750a.g(this.f8908j);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("echlogChallanDate", (Object) str10);
            jSONObject2.put("echlogChallanStatus", (Object) str16);
            jSONObject2.put("echlogCtzId", Long.parseLong(gVar.k()));
            jSONObject2.put("echlogDeptCd", i10);
            jSONObject2.put("echlogDocNumber", (Object) str11);
            jSONObject2.put("echlogDocType", (Object) str17);
            jSONObject2.put("echlogMobileNo", (Object) gVar.l());
            if (com.nic.mparivahan.dlservices.utilities.d.d(str3)) {
                jSONObject2.put("echlogPaymentDate", (Object) str12);
            }
            jSONObject2.put("echlogReceiptNo", (Object) str18);
            jSONObject2.put("echlogRtoCd", i11);
            jSONObject2.put("echlogStateCd", (Object) str13);
            jSONObject2.put("echlogTransId", (Object) str14);
            jSONObject2.put("echlogchallannumber", (Object) str15);
            jSONObject2.put("challanAmt", d10);
            jSONObject2.put("echlogStatus", true);
            jSONObject.put("Echallan", (Object) jSONObject2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject3 = jSONObject.toString();
        l.e(jSONObject3, "toString(...)");
        g10.saveEchallanLog(aVar.f(b10, jSONObject3), valueOf).enqueue(new b(valueOf));
    }
}
