package com.nic.mparivahan.VahanServices.VahanService;

import cm.g;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanModel.DmsUrlModle;
import hn.a;
import java.util.concurrent.TimeUnit;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import um.z;

public interface VahanXmlService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21202a = a.f21203a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f21203a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static hn.a f21204b = new hn.a((a.b) null, 1, (g) null).d(a.C0302a.BODY);

        /* renamed from: c  reason: collision with root package name */
        private static z f21205c;

        /* renamed from: d  reason: collision with root package name */
        private static VahanXmlService f21206d;

        static {
            z.a aVar = new z.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f21205c = aVar.d(15, timeUnit).J(15, timeUnit).M(15, timeUnit).a(f21204b).c();
        }

        private a() {
        }

        public final VahanXmlService a() {
            if (f21206d == null) {
                f21206d = (VahanXmlService) new Retrofit.Builder().baseUrl("").addConverterFactory(GsonConverterFactory.create()).client(f21205c).build().create(VahanXmlService.class);
            }
            VahanXmlService vahanXmlService = f21206d;
            l.c(vahanXmlService);
            return vahanXmlService;
        }
    }

    @GET("vahancapi-common/api/perparedocument/{state_code}/{appl_no}/{rc_no}/{purpose_code}")
    Call<DmsUrlModle> getDmsUrl(@Path("state_code") String str, @Path("appl_no") String str2, @Path("rc_no") String str3, @Path("purpose_code") String str4);
}
