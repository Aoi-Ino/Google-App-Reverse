package com.nic.mparivahan.Notifications;

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

public interface LocationNotiication {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9362a = a.f9363a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9363a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static LocationNotiication f9364b;

        private a() {
        }

        public final LocationNotiication a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f9364b == null) {
                f9364b = (LocationNotiication) new Retrofit.Builder().baseUrl(hc.a.f12073a.v()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(LocationNotiication.class);
            }
            LocationNotiication locationNotiication = f9364b;
            l.c(locationNotiication);
            return locationNotiication;
        }
    }

    @POST("service/notifySosContacts")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> getNotificationLocation(@Body c0 c0Var, @Header("timestamp") String str);
}
