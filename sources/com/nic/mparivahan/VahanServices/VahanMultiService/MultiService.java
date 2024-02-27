package com.nic.mparivahan.VahanServices.VahanMultiService;

import android.content.Context;
import android.os.Build;
import cm.g;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
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
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;
import um.z;
import v9.k;

public interface MultiService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21070a = a.f21071a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21071a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static hn.a f21072b = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);

        /* renamed from: c  reason: collision with root package name */
        private static MultiService f21073c;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final MultiService b(Context context) {
            z.a I;
            l.f(context, "context");
            if (f21073c == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    z.a a10 = new z.a().b(new b(context)).a(new m8.a(context));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    I = a10.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit).a(f21072b);
                } else {
                    z.a a11 = new z.a().b(new b(context)).a(new m8.a(context));
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    z.a a12 = a11.d(60, timeUnit2).J(60, timeUnit2).M(60, timeUnit2).a(f21072b);
                    Object obj = k.a().get("sslSocketFactory");
                    l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                    Object obj2 = k.a().get("trustAllCerts");
                    l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    I = a12.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new c());
                }
                f21073c = (MultiService) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(I.c()).build().create(MultiService.class);
            }
            MultiService multiService = f21073c;
            l.c(multiService);
            return multiService;
        }
    }

    @POST("vahancapi-to/api/todraftmobile")
    @Headers({"Content-Type: application/json"})
    Call<SellerResponse> applySeller(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/to/tomultiservice")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> applySellerAadhaar(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/beforepaymentMultiService")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> getBeforPaymentUrl(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/to/multiservicedraft")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> getMultiSelectionAPI(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/multiservicefee")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> multiServiceFees(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/to/draft")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> saveToDraft(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/finalsubmitMultiService")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> submitFinalRequest(@Body c0 c0Var, @Header("timestamp") String str);
}
