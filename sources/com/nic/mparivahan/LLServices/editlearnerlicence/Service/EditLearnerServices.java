package com.nic.mparivahan.LLServices.editlearnerlicence.Service;

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

public interface EditLearnerServices {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9250a = a.f9251a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9251a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static EditLearnerServices f9252b;

        private a() {
        }

        public final EditLearnerServices a(Context context) {
            l.f(context, "context");
            if (f9252b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f9252b = (EditLearnerServices) new Retrofit.Builder().baseUrl(hc.a.f12073a.j()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(EditLearnerServices.class);
            }
            EditLearnerServices editLearnerServices = f9252b;
            l.c(editLearnerServices);
            return editLearnerServices;
        }
    }

    @POST("sarathi/sarathiWS/EditApplicationService/finalConfirm")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> finalSubmit(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/EditApplicationService/getApplicationInfo")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getEditLearnerInfo(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/EditApplicationService/confirm")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getOtp(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/EditApplicationService/checkOTP")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> verifyOtp(@Body c0 c0Var, @Header("timestamp") String str);
}
