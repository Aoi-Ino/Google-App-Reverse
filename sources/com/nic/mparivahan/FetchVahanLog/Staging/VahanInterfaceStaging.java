package com.nic.mparivahan.FetchVahanLog.Staging;

import cm.l;
import com.nic.mparivahan.FetchVahanLog.Pojo.DltVhnTransaction;
import java.util.concurrent.TimeUnit;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import si.c;
import um.c0;
import um.z;
import v9.d;

public interface VahanInterfaceStaging {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8937a = a.f8938a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8938a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static VahanInterfaceStaging f8939b;

        /* renamed from: c  reason: collision with root package name */
        private static z f8940c;

        /* renamed from: d  reason: collision with root package name */
        private static z f8941d = c.a();

        static {
            z.a d10 = new z.a().d(2, TimeUnit.MINUTES);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f8940c = d10.J(60, timeUnit).M(60, timeUnit).a(d.f17494a.d()).c();
        }

        private a() {
        }

        public final VahanInterfaceStaging a() {
            if (f8939b == null) {
                f8939b = (VahanInterfaceStaging) new Retrofit.Builder().baseUrl(hc.a.f12073a.s()).addConverterFactory(GsonConverterFactory.create()).client(f8940c).build().create(VahanInterfaceStaging.class);
            }
            VahanInterfaceStaging vahanInterfaceStaging = f8939b;
            l.c(vahanInterfaceStaging);
            return vahanInterfaceStaging;
        }
    }

    @POST("manageEchallanLogStatus/v1.0")
    @Headers({"Content-Type: application/json"})
    Call<DltVhnTransaction> dltChallanTransactionStag(@Body c0 c0Var);

    @POST("manageSarathiLogStatus/v1.0")
    @Headers({"Content-Type: application/json"})
    Call<DltVhnTransaction> dltSarthiTransactionStag(@Body c0 c0Var);

    @POST("manageVahanLogStatus/v1.0")
    @Headers({"Content-Type: application/json"})
    Call<DltVhnTransaction> dltVahanTransactionStag(@Body c0 c0Var);
}
