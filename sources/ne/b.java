package ne;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import retrofit2.Call;
import retrofit2.Callback;

public final class b extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f25128d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f25129e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f25130f = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f25131a;

        a(b bVar) {
            this.f25131a = bVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f25131a.h().k(th2 != null ? th2.toString() : null);
            Log.e("Error3", "Error");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r4, retrofit2.Response r5) {
            /*
                r3 = this;
                java.lang.String r4 = "Error2"
                java.lang.String r0 = "Error"
                cm.l.c(r5)     // Catch:{ Exception -> 0x0050 }
                int r1 = r5.code()     // Catch:{ Exception -> 0x0050 }
                r2 = 400(0x190, float:5.6E-43)
                if (r1 != r2) goto L_0x004a
                i7.e r1 = new i7.e     // Catch:{ Exception -> 0x0050 }
                r1.<init>()     // Catch:{ Exception -> 0x0050 }
                i7.d r1 = r1.b()     // Catch:{ Exception -> 0x0050 }
                um.e0 r5 = r5.errorBody()     // Catch:{ Exception -> 0x003d }
                cm.l.c(r5)     // Catch:{ Exception -> 0x003d }
                java.lang.String r5 = r5.string()     // Catch:{ Exception -> 0x003d }
                java.lang.Class<com.nic.mparivahan.VahanServices.VahanModel.PrintReceiptValidateModel> r2 = com.nic.mparivahan.VahanServices.VahanModel.PrintReceiptValidateModel.class
                java.lang.Object r5 = r1.j(r5, r2)     // Catch:{ Exception -> 0x003d }
                com.nic.mparivahan.VahanServices.VahanModel.PrintReceiptValidateModel r5 = (com.nic.mparivahan.VahanServices.VahanModel.PrintReceiptValidateModel) r5     // Catch:{ Exception -> 0x003d }
                ne.b r1 = r3.f25131a     // Catch:{ Exception -> 0x003d }
                androidx.lifecycle.a0 r1 = r1.g()     // Catch:{ Exception -> 0x003d }
                java.lang.String r5 = r5.getErrorDesc()     // Catch:{ Exception -> 0x003d }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x003d }
                r1.k(r5)     // Catch:{ Exception -> 0x003d }
                goto L_0x005c
            L_0x003d:
                android.util.Log.e(r4, r0)     // Catch:{ Exception -> 0x0050 }
                ne.b r5 = r3.f25131a     // Catch:{ Exception -> 0x0050 }
            L_0x0042:
                androidx.lifecycle.a0 r5 = r5.h()     // Catch:{ Exception -> 0x0050 }
                r5.k(r0)     // Catch:{ Exception -> 0x0050 }
                goto L_0x005c
            L_0x004a:
                android.util.Log.e(r4, r0)     // Catch:{ Exception -> 0x0050 }
                ne.b r5 = r3.f25131a     // Catch:{ Exception -> 0x0050 }
                goto L_0x0042
            L_0x0050:
                ne.b r5 = r3.f25131a
                androidx.lifecycle.a0 r5 = r5.h()
                r5.k(r0)
                android.util.Log.e(r4, r0)
            L_0x005c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ne.b.a.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public b(a aVar) {
        l.f(aVar, "repository");
        this.f25128d = aVar;
    }

    public final a0 g() {
        return this.f25129e;
    }

    public final a0 h() {
        return this.f25130f;
    }

    public final void i(String str, String str2, String str3) {
        l.f(str, "appNo");
        l.f(str2, "rc_no");
        l.f(str3, "chassi_no");
        this.f25128d.a(str, str2, str3).enqueue(new a(this));
    }
}
