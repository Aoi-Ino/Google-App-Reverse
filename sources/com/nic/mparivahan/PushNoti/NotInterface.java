package com.nic.mparivahan.PushNoti;

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

public interface NotInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9415a = a.f9416a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9416a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static NotInterface f9417b;

        /* renamed from: c  reason: collision with root package name */
        private static z f9418c = c.a();

        private a() {
        }

        public final NotInterface a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).c();
            if (f9417b == null) {
                f9417b = (NotInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.o()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(NotInterface.class);
            }
            NotInterface notInterface = f9417b;
            l.c(notInterface);
            return notInterface;
        }
    }

    @POST("service/deletePushNotificationStatus")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> notDelInterface(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/getPushNotification")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> notInterfaceFun(@Body c0 c0Var, @Header("timestamp") String str);
}
