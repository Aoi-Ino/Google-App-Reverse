package com.nic.mparivahan.FetchChallanLog.FetchChallanAssets;

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
import si.c;
import um.c0;
import um.z;
import v9.d;

public interface FetchChallaInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8913a = a.f8914a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8914a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static FetchChallaInterface f8915b;

        /* renamed from: c  reason: collision with root package name */
        private static z f8916c = c.a();

        private a() {
        }

        public final FetchChallaInterface a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f8915b == null) {
                f8915b = (FetchChallaInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.s()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(FetchChallaInterface.class);
            }
            FetchChallaInterface fetchChallaInterface = f8915b;
            l.c(fetchChallaInterface);
            return fetchChallaInterface;
        }
    }

    @POST("service/manageEchallanLogStatus")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> dltChallanTransaction(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/getEchallanLogDetails")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> fetchChallanInter(@Body c0 c0Var, @Header("timestamp") String str);
}
