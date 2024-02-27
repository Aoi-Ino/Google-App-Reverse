package com.nic.mparivahan.VahanServices.VahanService;

import android.content.Context;
import android.os.Build;
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
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;
import um.c0;
import um.z;
import v9.d;
import v9.k;
import xg.g;

public interface VahanServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21199a = a.f21200a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21200a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static VahanServiceConnection f21201b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final VahanServiceConnection b(Context context) {
            z.a I;
            l.f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                z.a a10 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                I = a10.d(20, timeUnit).J(20, timeUnit).M(20, timeUnit).a(d.f17494a.d());
            } else {
                z.a a11 = new z.a().a(new b(context)).a(new m8.a(context));
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                z.a a12 = a11.d(20, timeUnit2).J(20, timeUnit2).M(20, timeUnit2).a(d.f17494a.d());
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                I = a12.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new g());
            }
            z c10 = I.c();
            if (f21201b == null) {
                f21201b = (VahanServiceConnection) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(VahanServiceConnection.class);
            }
            VahanServiceConnection vahanServiceConnection = f21201b;
            l.c(vahanServiceConnection);
            return vahanServiceConnection;
        }

        public final VahanServiceConnection d(Context context) {
            l.f(context, "context");
            hn.a d10 = new hn.a((a.b) null, 1, (cm.g) null).d(a.C0302a.BODY);
            z.a d11 = new z.a().b(new b(context)).a(new m8.a(context)).d(30, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Object create = new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(d11.J(30, timeUnit).M(30, timeUnit).a(d10).c()).build().create(VahanServiceConnection.class);
            l.e(create, "create(...)");
            return (VahanServiceConnection) create;
        }
    }

    @POST("vahan/vahancapi/common/getownerDetailsInurancePuccPermit")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getRcValues(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getResendOtp(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getSendOtpRes(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> monotringLog(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> saveVahanLog(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> updateVahanLogs(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("vahan/vahancapi/common/usertype")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> usertype(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> verifyOtpDetails(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("vahan/vahancapi/common/vttransappl")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> vttransappl(@Body c0 c0Var, @Header("timestamp") String str);
}
