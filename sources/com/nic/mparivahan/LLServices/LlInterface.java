package com.nic.mparivahan.LLServices;

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

public interface LlInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9003a = a.f9004a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9004a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static LlInterface f9005b;

        private a() {
        }

        public final LlInterface a(Context context) {
            l.f(context, "context");
            if (f9005b == null) {
                z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f9005b = (LlInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(LlInterface.class);
            }
            LlInterface llInterface = f9005b;
            l.c(llInterface);
            return llInterface;
        }
    }

    @POST("sarathi/sarathiWS/llServicesApi/llServicesValiditycheck")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getLlData(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/llServicesApi/applGenerationOfLLServices")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> submitLlAPI(@Body c0 c0Var, @Header("timestamp") String str);
}
