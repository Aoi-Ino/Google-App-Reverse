package com.nic.mparivahan.DlLog;

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
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;

public final class DlLogUpdateFee extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8709k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f8710j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, String str, long j10, int i10, String str2, String str3, String str4, String str5) {
            l.f(context, "context");
            l.f(str, "sarlogApplDate");
            l.f(str2, "sarlogDlDob");
            l.f(str3, "sarlogDlNumber");
            l.f(str4, "sarlogFeeDate");
            l.f(str5, "sarlogRtoCd");
            androidx.work.b a10 = new b.a().b("sarlogApplDate", str).b("sarlogApplNo", Long.valueOf(j10)).b("sarlogCtzId", Integer.valueOf(i10)).b("sarlogDlDob", str2).b("sarlogDlNumber", str3).b("sarlogFeeDate", str4).b("sarlogRtoCd", str5).a();
            l.e(a10, "build(...)");
            d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(DlLogUpdateFee.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f8711a;

        b(String str) {
            this.f8711a = str;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("DlUpdateErr", String.valueOf(th2 != null ? th2.getMessage() : null));
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
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                str = this.f8711a;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode = decoder.decode(str3);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = c.f12675a;
                str = this.f8711a;
                if (securityModle != null) {
                    str3 = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str3, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            aVar.a(str, str2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DlLogUpdateFee(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f8710j = context;
    }

    public c.a p() {
        try {
            r(String.valueOf(f().m("sarlogApplDate")), f().l("sarlogApplNo", 0), f().j("sarlogCtzId", 0), String.valueOf(f().m("sarlogDlDob")), String.valueOf(f().m("sarlogDlNumber")), String.valueOf(f().m("sarlogFeeDate")), String.valueOf(f().m("sarlogRtoCd")));
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("error", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(String str, long j10, int i10, String str2, String str3, String str4, String str5) {
        l.f(str, "sarlogApplDate");
        String str6 = str2;
        l.f(str6, "sarlogDlDob");
        String str7 = str3;
        l.f(str7, "sarlogDlNumber");
        String str8 = str4;
        l.f(str8, "sarlogFeeDate");
        String str9 = str5;
        l.f(str9, "sarlogRtoCd");
        String valueOf = String.valueOf(System.currentTimeMillis());
        DlLogUpdateInterface a10 = DlLogUpdateInterface.f8712a.a(this.f8710j);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = t8.c.f16582a.z(str, j10, i10, str6, str7, str8, str9).toString();
        l.e(jSONObject, "toString(...)");
        a10.updateSarathiLog(aVar.f(b10, jSONObject), valueOf).enqueue(new b(valueOf));
    }
}
