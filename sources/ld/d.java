package ld;

import android.content.Context;
import cm.g;
import cm.l;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import hc.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import v9.j;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13490a = new a((g) null);

    public static final class a {

        /* renamed from: ld.d$a$a  reason: collision with other inner class name */
        public static final class C0181a implements Callback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Context f13491a;

            C0181a(Context context) {
                this.f13491a = context;
            }

            public void onFailure(Call call, Throwable th2) {
                l.f(call, "call");
                l.f(th2, "t");
            }

            public void onResponse(Call call, Response response) {
                l.f(call, "call");
                l.f(response, "response");
                try {
                    g gVar = new g(this.f13491a);
                    NapixTokenModel napixTokenModel = (NapixTokenModel) response.body();
                    l.c(napixTokenModel);
                    gVar.D(napixTokenModel.getAccess_token());
                } catch (Exception unused) {
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(Context context) {
            l.f(context, "context");
            NapixService c10 = NapixService.f21647a.c();
            j.a aVar = j.f17579a;
            a.C0155a aVar2 = hc.a.f12073a;
            c10.getToken("client_credentials", "napix", String.valueOf(aVar.a(aVar2.l()).get("KEY")), String.valueOf(aVar.a(aVar2.h()).get("KEY"))).enqueue(new C0181a(context));
        }
    }
}
