package com.nic.mparivahan.Sos.NetworkServices;

import android.content.Context;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import id.b;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
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
import v9.k;

public interface SOSService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9615a = a.f9616a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9616a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static SOSService f9617b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final SOSService b(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z.a a10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d());
            Object obj = k.a().get("sslSocketFactory");
            l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
            Object obj2 = k.a().get("trustAllCerts");
            l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            z c10 = a10.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new nd.a()).c();
            if (f9617b == null) {
                f9617b = (SOSService) new Retrofit.Builder().baseUrl(hc.a.f12073a.v()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(SOSService.class);
            }
            SOSService sOSService = f9617b;
            l.c(sOSService);
            return sOSService;
        }
    }

    @POST("service/deleteSosContact")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> deletContact(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/getSosContact")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getContactList(@Body c0 c0Var, @Header("timestamp") String str);

    @POST
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getRelationMaster(@Url String str, @Body c0 c0Var, @Header("timestamp") String str2);

    @POST("service/saveSosContact")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> saveEmgContact(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/updateSosContact")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> updatesos(@Body c0 c0Var, @Header("timestamp") String str);
}
