package com.nic.mparivahan.VahanEkyc;

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
import um.e0;
import um.z;
import v9.d;

public interface EkYCService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20515a = a.f20516a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f20516a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static EkYCService f20517b;

        private a() {
        }

        public final EkYCService a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(1, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(30, timeUnit).M(15, timeUnit).a(d.f17494a.d()).c();
            if (f20517b == null) {
                f20517b = (EkYCService) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(EkYCService.class);
            }
            EkYCService ekYCService = f20517b;
            l.c(ekYCService);
            return ekYCService;
        }
    }

    @POST("VahanAadhaarService/aadhaar/authekyc/generateResponse")
    @Headers({"Content-Type: application/xml"})
    Call<e0> doAadhaarRequest(@Body c0 c0Var);

    @POST("vahan/vahancapi/common/generateOtp")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> ekycRequest(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/common/verifyOtp")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> ekycVerifyOtp(@Body c0 c0Var, @Header("timestamp") String str);
}
