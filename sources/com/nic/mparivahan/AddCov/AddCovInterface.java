package com.nic.mparivahan.AddCov;

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

public interface AddCovInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7708a = a.f7709a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7709a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static AddCovInterface f7710b;

        private a() {
        }

        public final AddCovInterface a(Context context) {
            l.f(context, "context");
            if (f7710b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f7710b = (AddCovInterface) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(AddCovInterface.class);
            }
            AddCovInterface addCovInterface = f7710b;
            l.c(addCovInterface);
            return addCovInterface;
        }
    }

    @POST("sarathi/sarathiWS/addClassOfVehicle/dataRequest")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> dataRequest(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/addClassOfVehicle/dataSubmit")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> dataSubmitRequest(@Body c0 c0Var, @Header("timestamp") String str);
}
