package p001if;

import android.os.Environment;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeesModel.FancyFeesModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import hf.b;
import i7.d;
import j$.util.Base64;
import java.io.File;
import java.io.IOException;
import ka.c;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;

/* renamed from: if.a  reason: invalid package */
public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final b f24333d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24334e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f24335f = new a0();

    /* renamed from: if.a$a  reason: collision with other inner class name */
    public static final class C0306a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24336a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f24337b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f24338c;

        C0306a(u uVar, String str, a aVar) {
            this.f24336a = uVar;
            this.f24337b = str;
            this.f24338c = aVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24338c.i().k(th2 != null ? th2.toString() : null);
            Log.e("Error3", "Error " + th2);
        }

        public void onResponse(Call call, Response response) {
            a0 i10;
            a0 h10;
            if (response != null) {
                try {
                    if (response.code() == 200) {
                        SecurityModle securityModle = (SecurityModle) response.body();
                        l.c(securityModle);
                        String data = securityModle.getData();
                        l.c(data);
                        Object j10 = new d().j(pb.a.f14908a.a((String) this.f24336a.f20234e, data), FancyFeesModel.class);
                        l.e(j10, "fromJson(...)");
                        FancyFeesModel fancyFeesModel = (FancyFeesModel) j10;
                        Log.e("fancyFeeModel", fancyFeesModel.toString());
                        String status = fancyFeesModel.getStatus();
                        Boolean valueOf = status != null ? Boolean.valueOf(status.equals("SUCCESS")) : null;
                        l.c(valueOf);
                        if (valueOf.booleanValue()) {
                            byte[] decode = Base64.getDecoder().decode(fancyFeesModel.getData());
                            l.e(decode, "decode(...)");
                            String str = this.f24337b + '_' + System.currentTimeMillis();
                            if (this.f24338c.k(decode, str)) {
                                h10 = this.f24338c.h();
                            } else {
                                h10 = this.f24338c.h();
                                str = "";
                            }
                            h10.k(str);
                            return;
                        } else if (c.f13158a.m(fancyFeesModel.getStatus())) {
                            i10 = this.f24338c.i();
                            i10.k("Error");
                        } else {
                            this.f24338c.i().k(fancyFeesModel.getMessage().toString());
                            return;
                        }
                    }
                } catch (Exception e10) {
                    this.f24338c.i().k("Error");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error ");
                    e10.printStackTrace();
                    sb2.append(x.f30437a);
                    Log.e("Error2", sb2.toString());
                    return;
                }
            }
            i10 = this.f24338c.i();
            i10.k("Error");
        }
    }

    public a(b bVar) {
        l.f(bVar, "repository");
        this.f24333d = bVar;
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

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[SYNTHETIC, Splitter:B:12:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l(byte[] r3, java.io.File r4) {
        /*
            r2 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0021 }
            r1.<init>(r4)     // Catch:{ all -> 0x0021 }
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0021 }
            r4.<init>(r1)     // Catch:{ all -> 0x0021 }
            r4.write(r3)     // Catch:{ all -> 0x001e }
            java.lang.String r3 = "checkFancy"
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x001e }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x001e }
            r4.flush()     // Catch:{ Exception -> 0x001d }
            r4.close()     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            return
        L_0x001e:
            r3 = move-exception
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x002a
            r0.flush()     // Catch:{ Exception -> 0x002a }
            r0.close()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p001if.a.l(byte[], java.io.File):void");
    }

    public final a0 h() {
        return this.f24334e;
    }

    public final a0 i() {
        return this.f24335f;
    }

    public final void j(String str, String str2) {
        l.f(str, "stateCode");
        l.f(str2, "receipt_no");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.f(str2, str).toString();
        l.e(jSONObject, "toString(...)");
        this.f24333d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0306a(uVar, str2, this));
    }
}
