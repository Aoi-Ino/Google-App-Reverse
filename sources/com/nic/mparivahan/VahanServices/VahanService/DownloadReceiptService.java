package com.nic.mparivahan.VahanServices.VahanService;

import android.content.Context;
import android.os.Build;
import cm.l;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import um.e0;
import um.z;
import v9.d;
import v9.k;
import xg.c;

public interface DownloadReceiptService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21187a = a.f21188a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21188a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static DownloadReceiptService f21189b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final DownloadReceiptService b(Context context) {
            z.a I;
            l.f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(new m8.a(context));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d());
            } else {
                z.a a11 = new z.a().a(new m8.a(context));
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a a12 = a11.d(60, timeUnit2).J(60, timeUnit2).M(60, timeUnit2).a(d.f17494a.d());
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = a12.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new c());
            }
            z c10 = I.c();
            if (f21189b == null) {
                f21189b = (DownloadReceiptService) new Retrofit.Builder().baseUrl(hc.a.f12073a.i()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(c10).build().create(DownloadReceiptService.class);
            }
            DownloadReceiptService downloadReceiptService = f21189b;
            l.c(downloadReceiptService);
            return downloadReceiptService;
        }
    }

    @GET("reprintreciept/{param}/{param1}/{param2}")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<e0> validateDownloadReceipt(@Path(encoded = true, value = "param") String str, @Path(encoded = true, value = "param1") String str2, @Path(encoded = true, value = "param2") String str3);
}
