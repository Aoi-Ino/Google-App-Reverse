package com.nic.mparivahan.fetchSarathiLog.FetchSarathiAssets;

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

public interface SarathiInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22410a = a.f22411a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f22411a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static SarathiInterface f22412b;

        /* renamed from: c  reason: collision with root package name */
        private static z f22413c = c.a();

        private a() {
        }

        public final SarathiInterface a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f22412b == null) {
                f22412b = (SarathiInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.s()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(SarathiInterface.class);
            }
            SarathiInterface sarathiInterface = f22412b;
            l.c(sarathiInterface);
            return sarathiInterface;
        }
    }

    @POST("service/manageSarathiLogStatus")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> dltSarathiTransaction(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/fetchSarathiLogDetails")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> fetchSarathiinterface(@Body c0 c0Var, @Header("timestamp") String str);
}
