package com.nic.mparivahan.dlservices.RenewalCOA;

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
import v9.d;

public interface RenCOAInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21665a = a.f21666a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21666a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static RenCOAInterface f21667b;

        /* renamed from: c  reason: collision with root package name */
        private static z f21668c = c.a();

        private a() {
        }

        public final RenCOAInterface a(Context context) {
            l.f(context, "context");
            z.a d10 = new z.a().b(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f21667b == null) {
                f21667b = (RenCOAInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(c10).build().create(RenCOAInterface.class);
            }
            RenCOAInterface renCOAInterface = f21667b;
            l.c(renCOAInterface);
            return renCOAInterface;
        }
    }

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> DupChangeAdd(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Content-Type: application/json"})
    Call<SecurityModle> renewalDlCOAInterface(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/ServicesOnDL/getAckDetForGivenDLNumber")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> repCOAInterface(@Body c0 c0Var, @Header("timestamp") String str);
}
