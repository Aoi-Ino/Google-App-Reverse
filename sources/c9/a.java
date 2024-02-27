package c9;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNew;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import i7.d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import um.x;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b9.a f4770d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f4771e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f4772f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f4773g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f4774h = new a0();

    /* renamed from: c9.a$a  reason: collision with other inner class name */
    public static final class C0092a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f4775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f4776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f4777c;

        C0092a(u uVar, a aVar, String str) {
            this.f4775a = uVar;
            this.f4776b = aVar;
            this.f4777c = str;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f4776b.h().k("error");
            Log.e("testPostError", th2.toString());
            Log.e("testPost", VUtility.Companion.m(this.f4777c).toString());
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f4776b.h().k("Error");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f4775a.f20234e, data), CheckPostReceiptDetailNew.class);
            l.e(j10, "fromJson(...)");
            this.f4776b.g().k((CheckPostReceiptDetailNew) j10);
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f4778a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f4779b;

        b(u uVar, a aVar) {
            this.f4778a = uVar;
            this.f4779b = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            l.f(call, "call");
            l.f(th2, "t");
            this.f4779b.j().k("error");
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f4779b.j().k("No data available");
                    e10.printStackTrace();
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f4778a.f20234e, data), CheckPostReceiptDetailNew.class);
            l.e(j10, "fromJson(...)");
            this.f4779b.i().k((CheckPostReceiptDetailNew) j10);
        }
    }

    public a(b9.a aVar) {
        l.f(aVar, "repository");
        this.f4770d = aVar;
    }

    public final a0 g() {
        return this.f4771e;
    }

    public final a0 h() {
        return this.f4772f;
    }

    public final a0 i() {
        return this.f4773g;
    }

    public final a0 j() {
        return this.f4774h;
    }

    public final void k(String str) {
        l.f(str, "inputValue");
        try {
            u uVar = new u();
            uVar.f20234e = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject = VUtility.Companion.m(str).toString();
            l.e(jSONObject, "toString(...)");
            this.f4770d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0092a(uVar, this, str));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void l(String str, String str2) {
        l.f(str, "stateCd");
        l.f(str2, "regnNo");
        Log.e("VehicleTest", str + ':' + str2);
        try {
            u uVar = new u();
            uVar.f20234e = String.valueOf(System.currentTimeMillis());
            c0.a aVar = c0.Companion;
            x b10 = x.f32156g.b("application/json");
            String jSONObject = VUtility.Companion.n(str, str2).toString();
            l.e(jSONObject, "toString(...)");
            this.f4770d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
