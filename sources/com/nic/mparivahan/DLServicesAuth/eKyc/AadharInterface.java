package com.nic.mparivahan.DLServicesAuth.eKyc;

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

public interface AadharInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8349a = a.f8350a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8350a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static AadharInterface f8351b;

        private a() {
        }

        public final AadharInterface a(Context context) {
            l.f(context, "context");
            if (f8351b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f8351b = (AadharInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(AadharInterface.class);
            }
            AadharInterface aadharInterface = f8351b;
            l.c(aadharInterface);
            return aadharInterface;
        }
    }

    @POST("apis/sarathi/dladharvalidation/apis/services/ekyc-validate")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> adharFinalApi(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("apis/sarathi/dladharvalidation/apis/services/checkadharauth")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> adharInter(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("apis/sarathi/dladharvalidation/apis/services/multiserauth")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> newServInter(@Body c0 c0Var, @Header("timestamp") String str);
}
