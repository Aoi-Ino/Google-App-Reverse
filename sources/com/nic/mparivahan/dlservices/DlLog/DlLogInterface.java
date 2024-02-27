package com.nic.mparivahan.dlservices.DlLog;

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

public interface DlLogInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21658a = a.f21659a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21659a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static DlLogInterface f21660b;

        private a() {
        }

        public final DlLogInterface a(Context context) {
            l.f(context, "context");
            hn.a d10 = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);
            z.a d11 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Object create = new Retrofit.Builder().baseUrl(hc.a.f12073a.s()).addConverterFactory(GsonConverterFactory.create()).client(d11.J(60, timeUnit).M(60, timeUnit).a(d10).c()).build().create(DlLogInterface.class);
            l.e(create, "create(...)");
            return (DlLogInterface) create;
        }

        public final DlLogInterface b(Context context) {
            l.f(context, "context");
            if (f21660b == null) {
                z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f21660b = (DlLogInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(DlLogInterface.class);
            }
            DlLogInterface dlLogInterface = f21660b;
            l.c(dlLogInterface);
            return dlLogInterface;
        }
    }

    @POST("apis/sarathi/dladharvalidation/apis/services/saveekycreq")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> saveKycReq(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("apis/sarathi/dladharvalidation/apis/services/saveadhardtls")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> saveKycRes(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("apis/sarathi/dladharvalidation/apis/services/saveaotpreq")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> saveOtpReqInter(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("apis/sarathi/dladharvalidation/apis/services/saveaotpres")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> saveOtpResInter(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("service/saveSarathiLogDetails")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> saveSarathiLog(@Body c0 c0Var, @Header("timestamp") String str);
}
