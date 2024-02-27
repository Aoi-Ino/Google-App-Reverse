package com.nic.mparivahan.Citizen.Interfaces;

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
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;
import um.c0;
import um.z;
import v9.d;
import v9.k;

public interface OffenceInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7826a = a.f7827a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7827a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static z f7828b;

        /* renamed from: c  reason: collision with root package name */
        private static OffenceInterface f7829c;

        static {
            z.a d10 = new z.a().d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f7828b = d10.J(60, timeUnit).M(60, timeUnit).c();
        }

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final OffenceInterface b(Context context) {
            z.a I;
            l.f(context, "context");
            if (f7829c == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    I = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d());
                } else {
                    z.a d11 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    z.a a10 = d11.J(60, timeUnit2).M(60, timeUnit2).a(d.f17494a.d());
                    Object obj = k.a().get("sslSocketFactory");
                    l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                    Object obj2 = k.a().get("trustAllCerts");
                    l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    I = a10.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new g9.a());
                }
                f7829c = (OffenceInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.u()).addConverterFactory(GsonConverterFactory.create()).client(I.c()).build().create(OffenceInterface.class);
            }
            OffenceInterface offenceInterface = f7829c;
            l.c(offenceInterface);
            return offenceInterface;
        }
    }

    @POST("service/countByStatus")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getAccDashboardRecords(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/getAccidentFeedback")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getAccidentFeedback(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/getReportedAccident")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getAccidentList(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/getAccidentEvidence")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getAccidentViolationEvidence(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getDashboardRecords(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("service/getLastReportedAccident")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getLastAccident(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getLastViolation(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getOffenceList(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getOffencesChanged(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getStates(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getTrafficFeedback(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getVerifyVehicleNo(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getViolationEvidence(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("service/saveAccidentFeedback")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> saveAccidentFeedback(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/reportAccident")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> submitAccidentReport(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> submitOffenceFeedBack(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> submitOffenceReport(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);
}
