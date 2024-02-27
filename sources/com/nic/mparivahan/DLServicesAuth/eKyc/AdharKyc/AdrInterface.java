package com.nic.mparivahan.DLServicesAuth.eKyc.AdharKyc;

import android.content.Context;
import cm.l;
import ea.c;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import um.c0;
import um.e0;
import um.z;
import v9.d;
import v9.k;

public interface AdrInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final a f8352a = a.f8353a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f8353a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static AdrInterface f8354b;

        private a() {
        }

        /* access modifiers changed from: private */
        public static final boolean c(String str, SSLSession sSLSession) {
            return true;
        }

        public final AdrInterface b(Context context) {
            l.f(context, "context");
            if (f8354b == null) {
                z.a d10 = new z.a().d(1, TimeUnit.MINUTES);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                z.a M = d10.J(30, timeUnit).M(15, timeUnit);
                Object obj = k.a().get("sslSocketFactory");
                l.d(obj, "null cannot be cast to non-null type javax.net.ssl.SSLSocketFactory");
                Object obj2 = k.a().get("trustAllCerts");
                l.d(obj2, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                f8354b = (AdrInterface) new Retrofit.Builder().baseUrl("https://sarathi.parivahan.gov.in/").addConverterFactory(GsonConverterFactory.create()).client(M.L((SSLSocketFactory) obj, (X509TrustManager) obj2).I(new c()).a(d.f17494a.d()).c()).build().create(AdrInterface.class);
            }
            AdrInterface adrInterface = f8354b;
            l.c(adrInterface);
            return adrInterface;
        }
    }

    @POST("SarathiAadhaarService/aadhaar/authekyc/generateResponse")
    @Headers({"Accept:application/xml", "Content-Type:application/xml"})
    Call<e0> doSarAadhaarRequest(@Body c0 c0Var);
}
