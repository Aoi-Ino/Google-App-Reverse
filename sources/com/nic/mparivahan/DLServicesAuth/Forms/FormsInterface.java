package com.nic.mparivahan.DLServicesAuth.Forms;

import android.content.Context;
import cm.l;
import java.util.concurrent.TimeUnit;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import um.z;
import v9.d;

public interface FormsInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8102a = a.f8103a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8103a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static FormsInterface f8104b;

        private a() {
        }

        public final FormsInterface a(Context context) {
            l.f(context, "context");
            if (f8104b == null) {
                z.a d10 = new z.a().d(2, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                f8104b = (FormsInterface) new Retrofit.Builder().baseUrl("https://sarathi.parivahan.gov.in/").addConverterFactory(GsonConverterFactory.create()).client(d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c()).build().create(FormsInterface.class);
            }
            FormsInterface formsInterface = f8104b;
            l.c(formsInterface);
            return formsInterface;
        }
    }

    @POST("sarathiservice/rsServices/ServiceOnPrint/getForm1AData/{apl}/{db}")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<FormsPojo> getForm1AData(@Path("apl") String str, @Path("db") String str2);

    @POST("sarathiservice/rsServices/ServiceOnPrint/getForm2Data/{apl}/{db}")
    @Headers({"Accept:application/json", "Content-Type:application/json"})
    Call<FormsPojo> getForm2Data(@Path("apl") String str, @Path("db") String str2);
}
