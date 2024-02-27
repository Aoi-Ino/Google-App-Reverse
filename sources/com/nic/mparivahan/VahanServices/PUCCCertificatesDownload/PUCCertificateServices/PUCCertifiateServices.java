package com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCertificateServices;

import android.content.Context;
import android.os.Build;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
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

public interface PUCCertifiateServices {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20692a = a.f20693a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f20693a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static PUCCertifiateServices f20694b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final PUCCertifiateServices b(Context context) {
            z.a I;
            l.f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(new b(context)).a(new m8.a(context)).a(d.f17494a.d());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit);
            } else {
                z.a a11 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a M = a11.d(60, timeUnit2).a(d.f17494a.d()).J(60, timeUnit2).M(60, timeUnit2);
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = M.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new zf.a());
            }
            z c10 = I.c();
            if (f20694b == null) {
                f20694b = (PUCCertifiateServices) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(c10).build().create(PUCCertifiateServices.class);
            }
            PUCCertifiateServices pUCCertifiateServices = f20694b;
            l.c(pUCCertifiateServices);
            return pUCCertifiateServices;
        }
    }

    @POST("pucc/puccNexgen/download")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> validateDownloadReceipt(@Body c0 c0Var, @Header("timestamp") String str);
}
