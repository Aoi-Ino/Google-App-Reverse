package com.nic.mparivahan.DLServicesAuth.CheckEligibility;

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

public interface FromEligCheck {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8099a = a.f8100a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8100a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static FromEligCheck f8101b;

        private a() {
        }

        public final FromEligCheck a(Context context) {
            l.f(context, "context");
            if (f8101b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f8101b = (FromEligCheck) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(FromEligCheck.class);
            }
            FromEligCheck fromEligCheck = f8101b;
            l.c(fromEligCheck);
            return fromEligCheck;
        }

        public final FromEligCheck b(Context context) {
            l.f(context, "context");
            if (f8101b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f8101b = (FromEligCheck) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(FromEligCheck.class);
            }
            FromEligCheck fromEligCheck = f8101b;
            l.c(fromEligCheck);
            return fromEligCheck;
        }
    }

    @POST("sarathiWS/ServicesOnDL/checkFORM1ReqFOrDLServReq")
    Call<x9.a> FormOneInter(@Body c0 c0Var);

    @POST("sarathi/sarathiWS/ServicesOnDL/checkFORM1ReqFOrDLServReq")
    @Headers({"Content-Type: application/xml"})
    Call<SecurityModle> FormOneInter(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServicesOnDL/checkSelctedTransAllowdForST")
    Call<SecurityModle> ServiceCheck(@Body c0 c0Var, @Header("timestamp") String str);
}
