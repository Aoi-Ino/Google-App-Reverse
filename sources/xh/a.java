package xh;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;
import wh.b;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f32674d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f32675e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f32676f = new a0();

    /* renamed from: xh.a$a  reason: collision with other inner class name */
    public static final class C0377a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f32677a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f32678b;

        C0377a(u uVar, a aVar) {
            this.f32677a = uVar;
            this.f32678b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f32678b.g().k(th2 != null ? th2.getMessage() : null);
            Log.e("Result -->", "error on Failure");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f32678b.g().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f32677a.f20234e, data), vh.a.class);
            l.e(j10, "fromJson(...)");
            android.support.v4.media.session.b.a(j10);
            this.f32678b.h().k((Object) null);
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f32674d = bVar;
    }

    public final a0 g() {
        return this.f32676f;
    }

    public final a0 h() {
        return this.f32675e;
    }

    public final void i(vh.b bVar) {
        l.f(bVar, "toSavetoDraftModelX");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f32674d.a(c0.Companion.f(x.f32156g.b("application/json"), new d().t(bVar).toString()), (String) uVar.f20234e).enqueue(new C0377a(uVar, this));
    }
}
