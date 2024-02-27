package com.nic.mparivahan.dlservices.ui.newlearner.Service;

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

public interface NewLLServices {

    /* renamed from: a  reason: collision with root package name */
    public static final a f22242a = a.f22243a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f22243a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static NewLLServices f22244b;

        private a() {
        }

        public final NewLLServices a(Context context) {
            l.f(context, "context");
            if (f22244b == null) {
                z.a d10 = new z.a().a(new b(context)).a(new m8.a(context)).d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f22244b = (NewLLServices) new Retrofit.Builder().baseUrl(hc.a.f12073a.m()).addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(NewLLServices.class);
            }
            NewLLServices newLLServices = f22244b;
            l.c(newLLServices);
            return newLLServices;
        }
    }

    @POST("sarathi/sarathiservice/rsServices/ServiceOnPrint/getForm3Print")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> checkLLDownloadAppNo(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiservice/rsServices/uploadingPhotoAndSignature/getImage")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> checkLLUploadPhotoSign(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/bloodGroups/master")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getBloodGroup(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/masters/countries")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getCountry(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/getSeDschoolsList/dschools")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getDrivingSchool(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/newLL/qualmast")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getEducationQual(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/getNtCovsByApplCatg/covs")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> getLearnerLicenceClass(@Body c0 c0Var, @Header("timestamp") String str);

    @POST("sarathi/sarathiWS/licenceServices/newLL")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<SecurityModle> submitNewLL(@Body c0 c0Var, @Header("timestamp") String str);
}
