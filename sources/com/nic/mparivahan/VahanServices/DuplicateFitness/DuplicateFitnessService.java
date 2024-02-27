package com.nic.mparivahan.VahanServices.DuplicateFitness;

import android.content.Context;
import android.os.Build;
import cm.g;
import cm.l;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import hn.a;
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
import um.c0;
import um.z;
import v9.k;

public interface DuplicateFitnessService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20591a = a.f20592a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f20592a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static hn.a f20593b = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);

        /* renamed from: c  reason: collision with root package name */
        private static DuplicateFitnessService f20594c;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final DuplicateFitnessService b(Context context) {
            z.a I;
            l.f(context, "context");
            if (f20594c == null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    z.a a10 = new z.a().b(new b(context)).a(new m8.a(context));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    I = a10.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit).a(f20593b);
                } else {
                    z.a a11 = new z.a().b(new b(context)).a(new m8.a(context));
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    z.a a12 = a11.d(60, timeUnit2).J(60, timeUnit2).M(60, timeUnit2).a(f20593b);
                    Object obj = k.a().get("sslSocketFactory");
                    l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                    Object obj2 = k.a().get("trustAllCerts");
                    l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    I = a12.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new oe.a());
                }
                f20594c = (DuplicateFitnessService) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(I.c()).build().create(DuplicateFitnessService.class);
            }
            DuplicateFitnessService duplicateFitnessService = f20594c;
            l.c(duplicateFitnessService);
            return duplicateFitnessService;
        }
    }

    @POST("vahan/vahancapi/permit/calculatevalidupto")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> calculateValidupto(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/fees/getPermitFeeDetails")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> getPermitFees(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/permit/searchgoodstype")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> searchgoodstype(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/permit/getPermitDocumentList")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendReqDupList(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/dupfitness/saveduplicatefitnessdraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendReqForDFC(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/permit/duppermitdraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendReqForDP(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/rcservice/rccanceldraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendReqForRCC(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/rcservice/rcreleasedraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendReqForRCR(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/rcservice/rcsurrenderdraft")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendReqForRCS(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/permit/savetempdraftappl")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> sendReqTemPermit(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("vahan/vahancapi/permit/temppermitdetails")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<SecurityModle> temPermit(@Body c0 c0Var, @Header("timestamp") String str);
}
