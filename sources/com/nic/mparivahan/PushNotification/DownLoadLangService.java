package com.nic.mparivahan.PushNotification;

import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cm.g;
import cm.l;
import cm.u;
import com.nic.mparivahan.Language.LanguageService;
import com.nic.mparivahan.Language.Modle.GetLanguageStrings;
import com.nic.mparivahan.Language.Modle.LangJSON;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.c;
import j$.util.Base64;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import m1.d;
import m1.n;
import m1.p;
import m1.y;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class DownLoadLangService extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9427k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f9428j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context) {
            l.f(context, "context");
            d a10 = new d.a().b(n.CONNECTED).a();
            y.c(context).b((p) ((p.a) new p.a(DownLoadLangService.class).h(a10)).a());
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f9429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f9430b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f9431c;

        b(u uVar, u uVar2, Context context) {
            this.f9429a = uVar;
            this.f9430b = uVar2;
            this.f9431c = context;
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
                if (Build.VERSION.SDK_INT >= 26) {
                    c.a aVar = c.f12675a;
                    String str = (String) this.f9429a.f20234e;
                    byte[] decode = Base64.getDecoder().decode(securityModle != null ? securityModle.getData() : null);
                    l.e(decode, "decode(...)");
                    a10 = aVar.a(str, new String(decode, km.d.f24740b));
                } else {
                    c.a aVar2 = c.f12675a;
                    String str2 = (String) this.f9429a.f20234e;
                    byte[] decode2 = android.util.Base64.decode(securityModle != null ? securityModle.getData() : null, 0);
                    l.e(decode2, "decode(...)");
                    a10 = aVar2.a(str2, new String(decode2, km.d.f24740b));
                }
                Object j10 = new i7.d().j(String.valueOf(a10), GetLanguageStrings.class);
                l.e(j10, "fromJson(...)");
                GetLanguageStrings getLanguageStrings = (GetLanguageStrings) j10;
                if (getLanguageStrings.getLangJSON().size() > 0) {
                    List<LangJSON> langJSON = getLanguageStrings.getLangJSON();
                    int size = langJSON.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ka.c.f13158a.m(langJSON.get(i10).getText_value());
                        ld.c cVar = (ld.c) this.f9430b.f20234e;
                        String text_code = langJSON.get(i10).getText_code();
                        String obj = text_code != null ? q.B0(text_code).toString() : null;
                        String text_value = langJSON.get(i10).getText_value();
                        cVar.g(obj, text_value != null ? q.B0(text_value).toString() : null);
                    }
                }
                ld.a aVar3 = new ld.a(this.f9431c);
                String format = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                l.c(format);
                aVar3.g(format);
            } catch (NullPointerException unused) {
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownLoadLangService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f9428j = context;
    }

    public c.a p() {
        try {
            boolean p10 = p.p(new ld.c(this.f9428j).d(), "english", false, 2, (Object) null);
            r(this.f9428j);
        } catch (Exception unused) {
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(Context context) {
        l.f(context, "context");
        u uVar = new u();
        uVar.f20234e = new ld.c(context);
        u uVar2 = new u();
        uVar2.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = mb.c.f13994a.c(String.valueOf(((ld.c) uVar.f20234e).d())).toString();
        l.e(jSONObject, "toString(...)");
        LanguageService.f9260a.a(context).getLanguageValRepo(aVar.f(b10, jSONObject), (String) uVar2.f20234e).enqueue(new b(uVar2, uVar, context));
    }
}
