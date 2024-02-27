package com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCService;

import android.content.Context;
import android.os.Build;
import cm.l;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel.DFCModel;
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
import retrofit2.http.Query;
import um.z;
import v9.d;
import v9.k;
import we.b;

public interface DFCServices {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20597a = a.f20598a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f20598a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static DFCServices f20599b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final DFCServices b(Context context) {
            z.a I;
            l.f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(d.f17494a.d());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit);
            } else {
                z.a aVar = new z.a();
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a M = aVar.d(60, timeUnit2).a(d.f17494a.d()).J(60, timeUnit2).M(60, timeUnit2);
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = M.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new b());
            }
            z c10 = I.c();
            if (f20599b == null) {
                f20599b = (DFCServices) new Retrofit.Builder().baseUrl("https://staging.parivahan.gov.in/").addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(c10).build().create(DFCServices.class);
            }
            DFCServices dFCServices = f20599b;
            l.c(dFCServices);
            return dFCServices;
        }
    }

    @GET("vahancapi-common/printDupFitCertificate")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<DFCModel> validateDownloadReceipt(@Query("applNo") String str);
}
