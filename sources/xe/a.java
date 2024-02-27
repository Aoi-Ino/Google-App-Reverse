package xe;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DFCModel.DFCModel;
import com.nic.mparivahan.VahanServices.DuplicateFitnessCertificateDownload.DuplicateFitnessCertificateDownload;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import j$.util.Base64;
import java.io.File;
import java.io.IOException;
import pl.x;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import um.c0;

public final class a extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final ve.a f32662d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f32663e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f32664f = new a0();

    /* renamed from: xe.a$a  reason: collision with other inner class name */
    public static final class C0376a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f32665a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f32666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DuplicateFitnessCertificateDownload f32667c;

        C0376a(String str, a aVar, DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) {
            this.f32665a = str;
            this.f32666b = aVar;
            this.f32667c = duplicateFitnessCertificateDownload;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f32666b.i().k(th2 != null ? th2.toString() : null);
            Log.e("Error3", "Error " + th2);
        }

        public void onResponse(Call call, Response response) {
            DFCModel dFCModel;
            a0 i10;
            String str;
            if (response != null) {
                try {
                    dFCModel = (DFCModel) response.body();
                } catch (Exception e10) {
                    this.f32666b.i().k("Error");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error ");
                    e10.printStackTrace();
                    sb2.append(x.f30437a);
                    Log.e("Error2", sb2.toString());
                    return;
                }
            } else {
                dFCModel = null;
            }
            l.c(dFCModel);
            Log.e("dataDFC", dFCModel.getData().toString());
            ApiMessage apiMessage = dFCModel.getApiMessage();
            if (p.p(apiMessage != null ? apiMessage.getDeveloperMessage() : null, "Success", false, 2, (Object) null)) {
                Log.e("dataDFC", dFCModel.getData().toString());
                byte[] decode = Base64.getDecoder().decode(dFCModel.getData());
                l.e(decode, "decode(...)");
                str = this.f32665a + '_' + System.currentTimeMillis();
                if (this.f32666b.k(decode, str, this.f32667c)) {
                    i10 = this.f32666b.h();
                } else {
                    this.f32666b.h().k("Error");
                    return;
                }
            } else {
                i10 = this.f32666b.i();
                str = dFCModel.getApiMessage().getDeveloperMessage().toString();
            }
            i10.k(str);
        }
    }

    public a(ve.a aVar) {
        l.f(aVar, "repository");
        this.f32662d = aVar;
    }

    /* access modifiers changed from: private */
    public final boolean k(byte[] bArr, String str, DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) {
        try {
            System.currentTimeMillis();
            File filesDir = duplicateFitnessCertificateDownload.getFilesDir();
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
        throw new UnsupportedOperationException("Method not decompiled: xe.a.l(byte[], java.io.File):void");
    }

    public final a0 h() {
        return this.f32663e;
    }

    public final a0 i() {
        return this.f32664f;
    }

    public final void j(String str, DuplicateFitnessCertificateDownload duplicateFitnessCertificateDownload) {
        l.f(str, "applNo");
        l.f(duplicateFitnessCertificateDownload, "duplicateFitnessCertificateDownload");
        String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        um.x b10 = um.x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.r(str).toString();
        l.e(jSONObject, "toString(...)");
        aVar.f(b10, jSONObject);
        this.f32662d.a(str).enqueue(new C0376a(str, this, duplicateFitnessCertificateDownload));
    }
}
