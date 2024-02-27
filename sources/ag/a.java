package ag;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.Security.SecModle.SecurityModle;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateDownload;
import com.nic.mparivahan.VahanServices.PUCCCertificatesDownload.PUCCCertificateModel.PUCCCertificateModel;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
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

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final yf.a f19048d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f19049e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f19050f = new a0();

    /* renamed from: ag.a$a  reason: collision with other inner class name */
    public static final class C0256a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f19051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f19052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f19053c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ PUCCCertificateDownload f19054d;

        C0256a(u uVar, String str, a aVar, PUCCCertificateDownload pUCCCertificateDownload) {
            this.f19051a = uVar;
            this.f19052b = str;
            this.f19053c = aVar;
            this.f19054d = pUCCCertificateDownload;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f19053c.i().k(th2 != null ? th2.toString() : null);
            Log.e("Error3", "Error " + th2);
        }

        public void onResponse(Call call, Response response) {
            a0 i10;
            if (response != null) {
                try {
                    if (response.code() == 200) {
                        Boolean bool = null;
                        SecurityModle securityModle = response != null ? (SecurityModle) response.body() : null;
                        l.c(securityModle);
                        String data = securityModle.getData();
                        l.c(data);
                        Object j10 = new d().j(pb.a.f14908a.a((String) this.f19051a.f20234e, data), PUCCCertificateModel.class);
                        l.e(j10, "fromJson(...)");
                        PUCCCertificateModel pUCCCertificateModel = (PUCCCertificateModel) j10;
                        String statusDescr = pUCCCertificateModel.getStatusDescr();
                        if (statusDescr != null) {
                            bool = Boolean.valueOf(statusDescr.equals("Success"));
                        }
                        l.c(bool);
                        if (bool.booleanValue()) {
                            byte[] decode = Base64.getDecoder().decode(pUCCCertificateModel.getPdfData());
                            l.e(decode, "decode(...)");
                            String str = this.f19052b + '_' + System.currentTimeMillis();
                            if (this.f19053c.k(decode, str, this.f19054d)) {
                                this.f19053c.h().k(str);
                                return;
                            }
                            i10 = this.f19053c.h();
                        } else if (c.f13158a.m(pUCCCertificateModel.getStatusDescr())) {
                            i10 = this.f19053c.i();
                        } else {
                            this.f19053c.i().k(pUCCCertificateModel.getStatusDescr().toString());
                            return;
                        }
                        i10.k("Error");
                    }
                } catch (Exception e10) {
                    this.f19053c.i().k("Error");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error ");
                    e10.printStackTrace();
                    sb2.append(x.f30437a);
                    Log.e("Error2", sb2.toString());
                    return;
                }
            }
            i10 = this.f19053c.i();
            i10.k("Error");
        }
    }

    public a(yf.a aVar) {
        l.f(aVar, "repository");
        this.f19048d = aVar;
    }

    /* access modifiers changed from: private */
    public final boolean k(byte[] bArr, String str, PUCCCertificateDownload pUCCCertificateDownload) {
        try {
            System.currentTimeMillis();
            File filesDir = pUCCCertificateDownload.getFilesDir();
            File file = new File(filesDir, "fitness_pdf_file.pdf");
            Log.e("filepath", filesDir.getPath().toString());
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
        throw new UnsupportedOperationException("Method not decompiled: ag.a.l(byte[], java.io.File):void");
    }

    public final a0 h() {
        return this.f19049e;
    }

    public final a0 i() {
        return this.f19050f;
    }

    public final void j(String str, String str2, PUCCCertificateDownload pUCCCertificateDownload) {
        l.f(str, "regNo");
        l.f(str2, "chasisNo");
        l.f(pUCCCertificateDownload, "pucc");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.j0(str, str2).toString();
        l.e(jSONObject, "toString(...)");
        this.f19048d.a(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new C0256a(uVar, str, this, pUCCCertificateDownload));
    }
}
