package com.nic.mparivahan.Tax;

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

public interface PaytaxService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20481a = a.f20482a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f20482a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static z f20483b;

        /* renamed from: c  reason: collision with root package name */
        private static PaytaxService f20484c;

        /* renamed from: d  reason: collision with root package name */
        private static String f20485d = String.valueOf(System.currentTimeMillis());

        static {
            z.a aVar = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f20483b = aVar.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
        }

        private a() {
        }

        public final PaytaxService a(Context context) {
            l.f(context, "context");
            z.a a10 = new z.a().a(new b(context)).a(new m8.a(context));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = a10.d(30, timeUnit).J(30, timeUnit).M(30, timeUnit).a(d.f17494a.d()).c();
            if (f20484c == null) {
                f20484c = (PaytaxService) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(PaytaxService.class);
            }
            PaytaxService paytaxService = f20484c;
            l.c(paytaxService);
            return paytaxService;
        }
    }

    @POST("vahan/vahancapi/tax/beforepayment")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> beforepayment(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/tax/afterpayment")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getafterpayment(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/tax/printreciept")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getprintreciept(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/tax/taxModeListener")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> gettaxModeListener(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/tax/taxPurCdDesc")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getvahancapi(@Body c0 c0Var, @Header("timestamp") String str);
}
