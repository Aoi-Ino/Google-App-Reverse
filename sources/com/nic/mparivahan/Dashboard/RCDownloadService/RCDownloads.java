package com.nic.mparivahan.Dashboard.RCDownloadService;

import ad.a;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import j$.util.Base64;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import m8.k;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;

public final class RCDownloads extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f8390k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f8391j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context, String str) {
            l.f(context, "context");
            l.f(str, "doc_id");
            androidx.work.b a10 = new b.a().b("RC", str).a();
            l.e(a10, "build(...)");
            d a11 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) ((p.a) new p.a(RCDownloads.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f8392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f8393b;

        b(u uVar, u uVar2) {
            this.f8392a = uVar;
            this.f8393b = uVar2;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            k.a aVar;
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
                aVar = k.f13877a;
                str = (String) this.f8392a.f20234e;
                byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                l.e(decode, "decode(...)");
                str2 = new String(decode, km.d.f24740b);
            } else {
                aVar = k.f13877a;
                str = (String) this.f8392a.f20234e;
                byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                l.e(decode2, "decode(...)");
                str2 = new String(decode2, km.d.f24740b);
            }
            Object j10 = new i7.d().j(String.valueOf(aVar.a(str, str2)), RcModelsDet.class);
            l.e(j10, "fromJson(...)");
            RcModelsDet rcModelsDet = (RcModelsDet) j10;
            if (p.o(rcModelsDet.getStatusCode(), "NP001", true)) {
                DatabaseHelper databaseHelper = (DatabaseHelper) this.f8393b.f20234e;
                String rc_regn_no = rcModelsDet.getNrvDetails().getRc_regn_no();
                if (rc_regn_no != null) {
                    str3 = q.B0(rc_regn_no).toString();
                }
                databaseHelper.R0(str3, rcModelsDet.getNrvDetails());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RCDownloads(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f8391j = context;
    }

    public c.a p() {
        try {
            r(String.valueOf(f().m("RC")));
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(String str) {
        l.f(str, "doc_id");
        ld.g gVar = new ld.g(this.f8391j);
        u uVar = new u();
        uVar.f20234e = new DatabaseHelper(this.f8391j);
        String string = Settings.Secure.getString(this.f8391j.getContentResolver(), "android_id");
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        a.C0008a aVar2 = ad.a.f400a;
        String k10 = gVar.k();
        l.c(string);
        String jSONObject = aVar2.f(k10, str, string, gVar.l(), gVar.e()).toString();
        l.e(jSONObject, "toString(...)");
        c0 f10 = aVar.f(b10, jSONObject);
        RcService c10 = RcService.f9484a.c(this.f8391j);
        u uVar2 = new u();
        String valueOf = String.valueOf(System.currentTimeMillis());
        uVar2.f20234e = valueOf;
        c10.UpdateVirtualRC(f10, valueOf).enqueue(new b(uVar2, uVar));
    }
}
