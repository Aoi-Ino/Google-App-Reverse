package com.nic.mparivahan.dlservices.data.network;

import android.content.Context;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
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

public interface DlServiceInt {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21675a = a.f21676a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21676a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static DlServiceInt f21677b;

        private a() {
        }

        public final DlServiceInt a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f21677b == null) {
                f21677b = (DlServiceInt) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(DlServiceInt.class);
            }
            DlServiceInt dlServiceInt = f21677b;
            l.c(dlServiceInt);
            return dlServiceInt;
        }
    }

    @POST("sarathi/sarathiWS/getSeRtosList/rtos")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getCurrentRTO(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getCurrentState(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("sarathi/sarathiWS/getSeStatesList/getS4customstDet")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getCustomState(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getDlDetails_new(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("sarathi/sarathiWS/ServicesOnDL/getDLdetForGivenDLNumber")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getEligibleServices(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServicesOnDL/getDLLastEndRTODetForGivenDLNumber")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getLastEndorsedRTO(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getResendOtp(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getSendOtpRes(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> verifyOtpDetails(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);
}
