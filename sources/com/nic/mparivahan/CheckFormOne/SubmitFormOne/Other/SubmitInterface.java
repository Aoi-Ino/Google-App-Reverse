package com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other;

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
import retrofit2.http.POST;
import um.c0;
import um.z;
import v9.d;

public interface SubmitInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7733a = a.f7734a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7734a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static SubmitInterface f7735b;

        private a() {
        }

        public final SubmitInterface a(Context context) {
            l.f(context, "context");
            if (f7735b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f7735b = (SubmitInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(SubmitInterface.class);
            }
            SubmitInterface submitInterface = f7735b;
            l.c(submitInterface);
            return submitInterface;
        }
    }

    @POST("sarathi/sarathiWS/formOneServices/submitFormOne")
    Call<SecurityModle> SubmitFunction(@Body c0 c0Var, @Header("timestamp") String str);
}
