package com.nic.mparivahan.ClServices.ClInterface;

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
import um.c0;
import um.z;
import v9.d;

public interface ClInter {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7830a = a.f7831a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7831a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static ClInter f7832b;

        private a() {
        }

        public final ClInter a(Context context) {
            l.f(context, "context");
            if (f7832b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f7832b = (ClInter) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(ClInter.class);
            }
            ClInter clInter = f7832b;
            l.c(clInter);
            return clInter;
        }
    }

    @POST("sarathi/sarathiWS/CancelLLAppMobile/cancelLLAppMob")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> applCancel(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiservice/rsServices/conductorLicense/getCLData")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getCLData(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/slots/rsServices/LLAppmntDetForMbl/getLLdetails")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getDLDetailsForCancelAppl(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServicesOnDL/getHZHillDrivingSchools")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getHZHill(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiservice/rsServices/newclservice/newCL")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> newClInterface(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiservice/rsServices/conductorLicense/getCLOnServices")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> submitService(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/rsServices/imgVerifaction/imgVerify")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> verifyImage(@Body c0 c0Var, @Header("timestamp") String str);
}
