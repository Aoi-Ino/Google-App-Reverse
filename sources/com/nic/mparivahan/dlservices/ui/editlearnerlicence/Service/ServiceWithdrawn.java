package com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service;

import android.content.Context;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import i7.j;
import id.b;
import java.util.concurrent.TimeUnit;
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
import vb.c;

public interface ServiceWithdrawn {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22143a = a.f22144a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f22144a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static ServiceWithdrawn f22145b;

        /* renamed from: c  reason: collision with root package name */
        private static ServiceWithdrawn f22146c;

        private a() {
        }

        public final ServiceWithdrawn a(Context context) {
            l.f(context, "context");
            if (f22145b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f22145b = (ServiceWithdrawn) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(ServiceWithdrawn.class);
            }
            ServiceWithdrawn serviceWithdrawn = f22145b;
            l.c(serviceWithdrawn);
            return serviceWithdrawn;
        }

        public final ServiceWithdrawn b(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f22146c == null) {
                f22146c = (ServiceWithdrawn) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(ServiceWithdrawn.class);
            }
            ServiceWithdrawn serviceWithdrawn = f22146c;
            l.c(serviceWithdrawn);
            return serviceWithdrawn;
        }
    }

    @POST("sarathi/sarathiWS/ServiceWithdrawn/eligibilityCheck")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getApplicationDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServiceWithdrawn/appliedListOfServices")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getAppliedListOfService(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServiceWithdrawn/reasonsForServiceWihdrawn")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getReason(@Body j jVar, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getResendOtp(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getSendOtpRes(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("sarathi/sarathiWS/ServiceWithdrawn/withdrawn")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> submitWithDrawn(@Body j jVar, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServiceWithdrawn/beforeWithdrawn")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> validateService(@Body j jVar, @Header("timestamp") String str);

    @POST("sarathiWS/rsServices/EditApplicationService/checkOTP")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<c> verifyOtp(@Body c0 c0Var);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> verifyOtpDetails(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);
}
