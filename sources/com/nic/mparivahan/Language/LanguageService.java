package com.nic.mparivahan.Language;

import android.content.Context;
import cm.g;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import hn.a;
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

public interface LanguageService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9260a = a.f9261a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9261a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static hn.a f9262b = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);

        /* renamed from: c  reason: collision with root package name */
        private static LanguageService f9263c;

        private a() {
        }

        public final LanguageService a(Context context) {
            l.f(context, "context");
            if (f9263c == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f9263c = (LanguageService) new Retrofit.Builder().baseUrl(hc.a.f12073a.e()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(LanguageService.class);
            }
            LanguageService languageService = f9263c;
            l.c(languageService);
            return languageService;
        }
    }

    @POST("getLanguages")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getLanguageDetails(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("getLanguageJson")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getLanguageValRepo(@Body c0 c0Var, @Header("timestamp") String str);
}
