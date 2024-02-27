package com.nic.mparivahan.DlCombineServices;

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

public interface CombineServiceInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8704a = a.f8705a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8705a = new a();

        private a() {
        }

        public final CombineServiceInterface a(Context context) {
            l.f(context, "context");
            hn.a d10 = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);
            z.a d11 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Object create = new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d11.J(60, timeUnit).M(60, timeUnit).a(d10).c()).build().create(CombineServiceInterface.class);
            l.e(create, "create(...)");
            return (CombineServiceInterface) create;
        }
    }

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getAckDetForGivenDLNumber(@Body c0 c0Var, @Header("timestamp") String str);
}
