package com.nic.mparivahan.VahanServices.FancyServices.FancyFeesRepository;

import android.content.Context;
import android.os.Build;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import hf.c;
import id.b;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;
import um.z;
import v9.d;
import v9.k;

public interface FancyFeesServices {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20632a = a.f20633a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f20633a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static FancyFeesServices f20634b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final FancyFeesServices b(Context context) {
            z.a I;
            l.f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(new b(context)).a(new m8.a(context)).a(d.f17494a.d());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit);
            } else {
                z.a a11 = new z.a().a(new b(context)).a(new m8.a(context)).a(d.f17494a.d());
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a M = a11.d(60, timeUnit2).J(60, timeUnit2).M(60, timeUnit2);
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = M.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new c());
            }
            z c10 = I.c();
            if (f20634b == null) {
                f20634b = (FancyFeesServices) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(c10).build().create(FancyFeesServices.class);
            }
            FancyFeesServices fancyFeesServices = f20634b;
            l.c(fancyFeesServices);
            return fancyFeesServices;
        }
    }

    @POST("apis/fancy/fancyapi/fee-receipt")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> validateDownloadReceipt(@Body c0 c0Var, @Header("timestamp") String str);
}
