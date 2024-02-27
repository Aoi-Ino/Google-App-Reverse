package com.nic.mparivahan.ProfileDetails.ProfileService;

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
import com.nic.mparivahan.ProfileDetails.ProfileInterface.UserBloodDetails;
import com.nic.mparivahan.ProfileDetails.StateUpdate.StateUpdateResponse;
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

public final class SaveCitizenProfileService extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9376k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f9377j;

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
            y.c(context).b((p) ((p.a) ((p.a) new p.a(SaveCitizenProfileService.class).j(a10)).h(a11)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f9378a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f9379b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9380c;

        b(u uVar, Context context, String str) {
            this.f9378a = uVar;
            this.f9379b = context;
            this.f9380c = str;
        }

        public void onFailure(Call call, Throwable th2) {
            Log.e("Error -- >001", String.valueOf(th2 != null ? th2.getMessage() : null));
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
                String str2 = (String) this.f9378a.f20234e;
                Base64.Decoder decoder = Base64.getDecoder();
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode = decoder.decode(str);
                l.e(decode, "decode(...)");
                a10 = aVar.a(str2, new String(decode, km.d.f24740b));
            } else {
                c.a aVar2 = c.f12675a;
                String str3 = (String) this.f9378a.f20234e;
                if (securityModle != null) {
                    str = securityModle.getData();
                }
                byte[] decode2 = android.util.Base64.decode(str, 0);
                l.e(decode2, "decode(...)");
                a10 = aVar2.a(str3, new String(decode2, km.d.f24740b));
            }
            Object j10 = new i7.d().j(String.valueOf(a10), StateUpdateResponse.class);
            l.e(j10, "fromJson(...)");
            StateUpdateResponse stateUpdateResponse = (StateUpdateResponse) j10;
            if (p.o(stateUpdateResponse.getStatusCode(), "CTZN001", true)) {
                try {
                    ld.g gVar = new ld.g(this.f9379b);
                    gVar.b(String.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzRecordId()), stateUpdateResponse.getMparCitizenUser().getCtzMobile(), stateUpdateResponse.getMparCitizenUser().getCtzDispName(), stateUpdateResponse.getMparCitizenUser().getCtzEmail(), gVar.m().toString(), stateUpdateResponse.getMparCitizenUser().getCtzStateCd(), Boolean.TRUE, Boolean.valueOf(stateUpdateResponse.getMparCitizenUser().getCtzMpinStatus()));
                } catch (Exception unused) {
                }
            } else {
                Log.e("Update3 -->", this.f9380c.toString());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveCitizenProfileService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f9377j = context;
    }

    public c.a p() {
        try {
            r(this.f9377j, String.valueOf(f().m("RC")));
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.e("eRRO", x.f30437a.toString());
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(Context context, String str) {
        l.f(context, "context");
        l.f(str, "doc_id");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        UserBloodDetails.f9372a.c(context).updatestateInterface(c0.Companion.f(um.x.f32156g.b("application/json"), str), (String) uVar.f20234e).enqueue(new b(uVar, context, str));
    }
}
