package li;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import ji.b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f24831d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24832e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f24833f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f24834a;

        a(c cVar) {
            this.f24834a = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f24834a.i().k(th2.getMessage());
        }

        public void onResponse(Call call, Response response) {
            l.f(call, "call");
            l.f(response, "response");
            try {
                a0 g10 = this.f24834a.g();
                NapixTokenModel napixTokenModel = (NapixTokenModel) response.body();
                l.c(napixTokenModel);
                g10.k(napixTokenModel);
            } catch (Exception unused) {
                this.f24834a.i().k("ERROR");
            }
        }
    }

    public c(b bVar) {
        l.f(bVar, "repository");
        this.f24831d = bVar;
    }

    public final a0 g() {
        return this.f24832e;
    }

    public final void h() {
        this.f24831d.a("client_credentials", "napix").enqueue(new a(this));
    }

    public final a0 i() {
        return this.f24833f;
    }
}
