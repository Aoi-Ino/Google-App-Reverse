package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerApplication.TOBuyerApplicationService;

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

public interface TOBuyerApplicationService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21413a = a.f21414a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21414a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static TOBuyerApplicationService f21415b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final TOBuyerApplicationService b(Context context) {
            z.a I;
            l.f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(60, timeUnit).J(30, timeUnit).M(30, timeUnit).a(d.f17494a.d());
            } else {
                z.a a11 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a a12 = a11.d(60, timeUnit2).J(30, timeUnit2).M(30, timeUnit2).a(d.f17494a.d());
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = a12.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new kh.a());
            }
            z c10 = I.c();
            if (f21415b == null) {
                f21415b = (TOBuyerApplicationService) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(c10).build().create(TOBuyerApplicationService.class);
            }
            TOBuyerApplicationService tOBuyerApplicationService = f21415b;
            l.c(tOBuyerApplicationService);
            return tOBuyerApplicationService;
        }
    }

    @POST("vahan/vahancapi/to/fetchservices")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> getApplicantDetail(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/to/fetchserviceregnandchassis")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> getSelledetailsByRcChassis(@Body c0 c0Var, @Header("timestamp") String str);
}
