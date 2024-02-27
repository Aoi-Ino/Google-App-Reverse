package com.nic.mparivahan.Echallan.Echallan.Networking;

import android.content.Context;
import android.os.Build;
import cm.l;
import com.nic.mparivahan.Echallan.Echallan.Model.PaymentEtransPgi;
import java.util.concurrent.TimeUnit;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;
import um.z;
import v9.d;

public interface StagingEchallanService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8744a = a.f8745a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8745a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static StagingEchallanService f8746b;

        private a() {
        }

        public final StagingEchallanService a(Context context) {
            l.f(context, "context");
            z.a aVar = Build.VERSION.SDK_INT >= 26 ? new z.a() : new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            z c10 = aVar.d(60, timeUnit).J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
            if (f8746b == null) {
                f8746b = (StagingEchallanService) new Retrofit.Builder().baseUrl("https://staging.parivahan.gov.in/echallan/mparivahan-api/").addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).client(c10).build().create(StagingEchallanService.class);
            }
            StagingEchallanService stagingEchallanService = f8746b;
            l.c(stagingEchallanService);
            return stagingEchallanService;
        }
    }

    @POST("payment-etrans-pgi")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<PaymentEtransPgi> paymentEtransPgi(@Body c0 c0Var, @Header("Authorization") String str);

    @POST("verify-challan-etrans-pgi-payment-details")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<PaymentEtransPgi> verifyEtransPgiPayment(@Body c0 c0Var, @Header("Authorization") String str);
}
