package com.nic.mparivahan.PushNotification;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import cm.g;
import cm.l;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import hc.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import v9.j;

public final class RcDownloaderService extends Worker {

    /* renamed from: k  reason: collision with root package name */
    public static final a f9441k = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    private Context f9442j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f9443a;

        b(Context context) {
            this.f9443a = context;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
        }

        public void onResponse(Call call, Response response) {
            l.f(call, "call");
            l.f(response, "response");
            try {
                ld.g gVar = new ld.g(this.f9443a);
                NapixTokenModel napixTokenModel = (NapixTokenModel) response.body();
                l.c(napixTokenModel);
                gVar.D(napixTokenModel.getAccess_token());
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RcDownloaderService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.f(context, "context");
        l.f(workerParameters, "workerParams");
        this.f9442j = context;
    }

    public c.a p() {
        try {
            r(this.f9442j);
        } catch (Exception unused) {
        }
        c.a c10 = c.a.c();
        l.e(c10, "success(...)");
        return c10;
    }

    public final void r(Context context) {
        l.f(context, "context");
        NapixService c10 = NapixService.f21647a.c();
        j.a aVar = j.f17579a;
        a.C0155a aVar2 = hc.a.f12073a;
        c10.getToken("client_credentials", "napix", String.valueOf(aVar.a(aVar2.l()).get("KEY")), String.valueOf(aVar.a(aVar2.h()).get("KEY"))).enqueue(new b(context));
    }
}
