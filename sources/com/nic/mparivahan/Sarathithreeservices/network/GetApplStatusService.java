package com.nic.mparivahan.Sarathithreeservices.network;

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

public interface GetApplStatusService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9545a = a.f9546a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9546a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static GetApplStatusService f9547b;

        private a() {
        }

        public final GetApplStatusService a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f9547b == null) {
                f9547b = (GetApplStatusService) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(GetApplStatusService.class);
            }
            GetApplStatusService getApplStatusService = f9547b;
            l.c(getApplStatusService);
            return getApplStatusService;
        }
    }

    @POST("sarathi/applDetails/uploadMicro/getApplicationInfo")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getAppInfoCall(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getAppInfoOTPCall(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getAppInfoResendOTP(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getAppInfoVerifyOTP(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("sarathi/sarathiWS/applicationStatus/applStatus")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getAppStatus(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/slots/rsServices/SlotAckmntServ/dltprovnlreceipt")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getSlotPdf(@Body c0 c0Var, @Header("timestamp") String str);
}
