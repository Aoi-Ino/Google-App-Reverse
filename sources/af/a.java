package af;

import android.os.Environment;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.AllotmentLetterModel.AllotmentLetterModel;
import i7.d;
import j$.util.Base64;
import java.io.File;
import java.io.IOException;
import ka.c;
import org.json.JSONObject;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;
import ze.b;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f19042d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19043e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19044f = new a0();

    /* renamed from: af.a$a  reason: collision with other inner class name */
    public static final class C0255a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f19045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19046b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f19047c;

        C0255a(u uVar, String str, a aVar) {
            this.f19045a = uVar;
            this.f19046b = str;
            this.f19047c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19047c.h().k(String.valueOf(th2));
        }

        public void onResponse(Call call, Response response) {
            SecurityModle securityModle;
            a0 h10;
            if (response != null) {
                try {
                    securityModle = (SecurityModle) response.body();
                } catch (Exception e10) {
                    this.f19047c.h().k("Error");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error ");
                    e10.printStackTrace();
                    sb2.append(x.f30437a);
                    Log.e("Error2", sb2.toString());
                    return;
                }
            } else {
                securityModle = null;
            }
            l.c(securityModle);
            String data = securityModle.getData();
            l.c(data);
            Object j10 = new d().j(pb.a.f14908a.a((String) this.f19045a.f20234e, data), AllotmentLetterModel.class);
            l.e(j10, "fromJson(...)");
            AllotmentLetterModel allotmentLetterModel = (AllotmentLetterModel) j10;
            if (p.o(allotmentLetterModel.getStatus(), "SUCCESS", true)) {
                String str = this.f19046b + '_' + System.currentTimeMillis();
                byte[] decode = Base64.getDecoder().decode(allotmentLetterModel.getData());
                l.e(decode, "decode(...)");
                if (this.f19047c.k(decode, str)) {
                    this.f19047c.i().k(str);
                    return;
                }
                h10 = this.f19047c.h();
            } else if (c.f13158a.m(allotmentLetterModel.getStatus())) {
                h10 = this.f19047c.h();
            } else {
                this.f19047c.h().k(allotmentLetterModel.getStatus().toString());
                return;
            }
            h10.k("Error");
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f19042d = bVar;
    }

    /* access modifiers changed from: private */
    public final boolean k(byte[] bArr, String str) {
        try {
            System.currentTimeMillis();
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + '/' + (str + ".pdf"));
            if (file.exists()) {
                file.delete();
            }
            l(bArr, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[SYNTHETIC, Splitter:B:12:0x001b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(byte[] r3, java.io.File r4) {
        /*
            r2 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0018 }
            r1.<init>(r4)     // Catch:{ all -> 0x0018 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0018 }
            r4.<init>(r1)     // Catch:{ all -> 0x0018 }
            r4.write(r3)     // Catch:{ all -> 0x0015 }
            r4.flush()     // Catch:{ Exception -> 0x0014 }
            r4.close()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            return
        L_0x0015:
            r3 = move-exception
            r0 = r4
            goto L_0x0019
        L_0x0018:
            r3 = move-exception
        L_0x0019:
            if (r0 == 0) goto L_0x0021
            r0.flush()     // Catch:{ Exception -> 0x0021 }
            r0.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: af.a.l(byte[], java.io.File):void");
    }

    public final a0 h() {
        return this.f19044f;
    }

    public final a0 i() {
        return this.f19043e;
    }

    public final void j(String str) {
        l.f(str, "recptNumber");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("receiptNo", (Object) str);
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "toString(...)");
        this.f19042d.a(aVar.f(b10, jSONObject2), (String) uVar.f20234e).enqueue(new C0255a(uVar, str, this));
    }
}
