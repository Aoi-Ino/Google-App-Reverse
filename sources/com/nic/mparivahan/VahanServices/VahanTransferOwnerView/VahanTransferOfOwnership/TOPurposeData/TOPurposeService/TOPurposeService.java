package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService;

import android.content.Context;
import android.os.Build;
import cm.g;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import hn.a;
import id.b;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import um.c0;
import um.z;
import v9.k;

public interface TOPurposeService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21428a = a.f21429a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21429a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static TOPurposeService f21430b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final TOPurposeService b(Context context) {
            z.a I;
            l.f(context, "context");
            hn.a d10 = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(60, timeUnit).J(40, timeUnit).M(40, timeUnit).a(d10);
            } else {
                z.a a11 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a a12 = a11.d(60, timeUnit2).J(40, timeUnit2).M(40, timeUnit2).a(d10);
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = a12.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new th.a());
            }
            z c10 = I.c();
            if (f21430b == null) {
                f21430b = (TOPurposeService) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(TOPurposeService.class);
            }
            TOPurposeService tOPurposeService = f21430b;
            l.c(tOPurposeService);
            return tOPurposeService;
        }
    }

    @POST("vahan/vahancapi/to/topurposedata")
    Call<SecurityModle> getTOPuroposeData(@Body c0 c0Var, @Header("timestamp") String str);
}
