package com.nic.mparivahan.dlservices.DlLog;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class DlLogCapture extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f21655k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f21656j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, String str, String str2, String str3, long j10, int i10, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, String str12) {
            String str13 = str;
            String str14 = str2;
            String str15 = str3;
            String str16 = str5;
            String str17 = str6;
            String str18 = str7;
            String str19 = str8;
            String str20 = str9;
            String str21 = str10;
            String str22 = str11;
            String str23 = str12;
            l.f(context, "context");
            l.f(str13, "sarlogAadhar4");
            l.f(str14, "sarlogApplCat");
            l.f(str15, "sarlogApplDate");
            l.f(str4, "sarlogDlDob");
            l.f(str16, "sarlogDlNumber");
            l.f(str17, "sarlog_eKYC");
            l.f(str18, "sarlog_eSign");
            l.f(str19, "sarlogGender");
            l.f(str20, "sarlogMobileNo");
            l.f(str21, "sarlogPurCd");
            l.f(str22, "sarlogRtoCd");
            l.f(str23, "sarlogStateCd");
            androidx.work.b a10 = new b.a().b("sarlogAadhar4", str13).b("sarlogApplCat", str14).b("sarlogApplDate", str15).b("sarlogApplNo", Long.valueOf(j10)).b("sarlogCtzId", Integer.valueOf(i10)).b("sarlogDlDob", str4).b("sarlogDlNumber", str16).b("sarlog_eKYC", str17).b("sarlog_eSign", str18).b("sarlogGender", str19).b("sarlogMobileNo", str20).b("sarlogOrgDonor", Boolean.valueOf(z10)).b("sarlogPurCd", str21).b("sarlogRtoCd", str22).b("sarlogStateCd", str23).a();
            l.e(a10, "build(...)");
            d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(DlLogCapture.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f21657a;

        b(String str) {
            this.f21657a = str;
        }

        public void onFailure(Call call, Throwable th2) {
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            c.a aVar;
            String str;
            String str2;
            String str3 = null;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception unused) {
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f21657a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f21657a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Log.d("valiii", String.valueOf(aVar.a(str, str2)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DlLogCapture(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f21656j = context;
    }

    public c.a p() {
        try {
            r(String.valueOf(f().m("sarlogAadhar4")), String.valueOf(f().m("sarlogApplCat")), String.valueOf(f().m("sarlogApplDate")), f().l("sarlogApplNo", 0), f().j("sarlogCtzId", 0), String.valueOf(f().m("sarlogDlDob")), String.valueOf(f().m("sarlogDlNumber")), String.valueOf(f().m("sarlog_eKYC")), String.valueOf(f().m("sarlog_eSign")), String.valueOf(f().m("sarlogGender")), String.valueOf(f().m("sarlogMobileNo")), f().h("sarlogOrgDonor", false), String.valueOf(f().m("sarlogPurCd")), String.valueOf(f().m("sarlogRtoCd")), String.valueOf(f().m("sarlogStateCd")));
        } catch (Exception unused) {
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(String str, String str2, String str3, long j10, int i10, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, String str10, String str11, String str12) {
        String str13 = str;
        String str14 = str13;
        l.f(str13, "sarlogAadhar4");
        l.f(str2, "sarlogApplCat");
        l.f(str3, "sarlogApplDate");
        l.f(str4, "sarlogDlDob");
        l.f(str5, "sarlogDlNumber");
        l.f(str6, "sarlog_eKYC");
        l.f(str7, "sarlog_eSign");
        l.f(str8, "sarlogGender");
        l.f(str9, "sarlogMobileNo");
        l.f(str10, "sarlogPurCd");
        l.f(str11, "sarlogRtoCd");
        l.f(str12, "sarlogStateCd");
        String valueOf = String.valueOf(System.currentTimeMillis());
        String str15 = str2;
        DlLogInterface a10 = DlLogInterface.f21658a.a(this.f21656j);
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        x xVar = b10;
        DlLogInterface dlLogInterface = a10;
        String jSONObject = t8.c.f16582a.x(str14, str15, str3, j10, i10, str4, str5, str6, str7, str8, str9, z10, str10, str11, str12).toString();
        l.e(jSONObject, "toString(...)");
        String str16 = valueOf;
        dlLogInterface.saveSarathiLog(aVar.f(xVar, jSONObject), str16).enqueue(new b(str16));
    }
}
