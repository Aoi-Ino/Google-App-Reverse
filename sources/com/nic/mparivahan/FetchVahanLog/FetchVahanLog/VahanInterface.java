package com.nic.mparivahan.FetchVahanLog.FetchVahanLog;

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

public interface VahanInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8917a = a.f8918a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8918a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static VahanInterface f8919b;

        /* renamed from: c  reason: collision with root package name */
        private static z f8920c = c.a();

        private a() {
        }

        public final VahanInterface a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f8919b == null) {
                f8919b = (VahanInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.s()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(VahanInterface.class);
            }
            VahanInterface vahanInterface = f8919b;
            l.c(vahanInterface);
            return vahanInterface;
        }
    }

    @POST("service/manageVahanLogStatus")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> dltVahanTransaction(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/fetchVahanLogDetails")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> fetchVahanLogDetails(@Body c0 c0Var, @Header("timestamp") String str);
}
