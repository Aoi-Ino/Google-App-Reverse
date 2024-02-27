package ti;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.ui.dms.uploadmodel.DocUploadRequest;
import com.nic.mparivahan.dlservices.ui.dms.uploadmodel.UploadDocsBeanItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.k1;
import lm.q0;
import pl.q;
import pl.x;
import tl.d;
import tl.g;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private Application f31509a;

    /* renamed from: b  reason: collision with root package name */
    private String f31510b;

    /* renamed from: c  reason: collision with root package name */
    private List f31511c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f31512d = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f31513f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f31514g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, d dVar) {
            super(2, dVar);
            this.f31514g = fVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f31514g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f31513f;
            if (i10 == 0) {
                q.b(obj);
                f fVar = this.f31514g;
                this.f31513f = 1;
                if (fVar.b(this) == c10) {
                    return c10;
                }
            } else if (i10 == 1) {
                q.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.f30437a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: e  reason: collision with root package name */
        Object f31515e;

        /* renamed from: f  reason: collision with root package name */
        Object f31516f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f31517g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f f31518h;

        /* renamed from: i  reason: collision with root package name */
        int f31519i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, d dVar) {
            super(dVar);
            this.f31518h = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f31517g = obj;
            this.f31519i |= Integer.MIN_VALUE;
            return this.f31518h.b(this);
        }
    }

    public f(Application application, String str, List list) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "lastEndorseRTOCode");
        cm.l.f(list, "docs");
        this.f31509a = application;
        this.f31510b = str;
        this.f31511c = list;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    private final DocUploadRequest c(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DocumentListItem documentListItem = (DocumentListItem) it.next();
                UploadDocsBeanItem uploadDocsBeanItem = r3;
                UploadDocsBeanItem uploadDocsBeanItem2 = new UploadDocsBeanItem((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (cm.g) null);
                if ((documentListItem != null ? documentListItem.getURI() : null) != null) {
                    Boolean bool = Boolean.FALSE;
                    UploadDocsBeanItem uploadDocsBeanItem3 = uploadDocsBeanItem;
                    uploadDocsBeanItem3.setForMultiple(bool);
                    uploadDocsBeanItem3.setSavedInDMS(bool);
                    uploadDocsBeanItem3.setRtoCode(this.f31510b);
                    uploadDocsBeanItem3.setTemp(Boolean.TRUE);
                    uploadDocsBeanItem3.setApplNo(documentListItem.getApplication_no());
                    uploadDocsBeanItem3.setDocCode(documentListItem.getId());
                    uploadDocsBeanItem3.setStateCode(documentListItem.getStateCode());
                    uploadDocsBeanItem3.setTransCode(documentListItem.getTransationCode());
                    uploadDocsBeanItem3.setIssuerDesg(documentListItem.getIssueAuthDesg());
                    uploadDocsBeanItem3.setIssueDate(documentListItem.getIssueDate());
                    uploadDocsBeanItem3.setDocNo(documentListItem.getDocNo());
                    uploadDocsBeanItem3.setProofCode(documentListItem.getProofCode());
                    uploadDocsBeanItem3.setDocUpStatus(documentListItem.getDocStatus() != null ? documentListItem.getDocStatus() : "I");
                    uploadDocsBeanItem3.setFileName(documentListItem.getFileNmae());
                    uploadDocsBeanItem3.setFolderName(documentListItem.getApplication_no());
                    uploadDocsBeanItem3.setFileToUpload(documentListItem.getFileToUpload());
                    uploadDocsBeanItem3.setContactNo(documentListItem.getContactNo());
                    arrayList.add(uploadDocsBeanItem3);
                }
            }
        }
        return new DocUploadRequest(arrayList);
    }

    public final a0 a() {
        return this.f31512d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[SYNTHETIC, Splitter:B:28:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1 A[Catch:{ Exception -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(tl.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ti.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ti.f$b r0 = (ti.f.b) r0
            int r1 = r0.f31519i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f31519i = r1
            goto L_0x0018
        L_0x0013:
            ti.f$b r0 = new ti.f$b
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f31517g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f31519i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f31516f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31515e
            ti.f r0 = (ti.f) r0
            pl.q.b(r8)     // Catch:{ Exception -> 0x00ea }
            goto L_0x0074
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0039:
            pl.q.b(r8)
            si.b$a r8 = si.b.f31257a
            android.app.Application r2 = r7.f31509a
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L_0x0101
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r8 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r7.f31509a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus> r4 = com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus r2 = (com.nic.mparivahan.dlservices.data.network.DlRenewalServicesStatus) r2
            java.util.List r4 = r7.f31511c     // Catch:{ Exception -> 0x00e9 }
            com.nic.mparivahan.dlservices.ui.dms.uploadmodel.DocUploadRequest r4 = r7.c(r4)     // Catch:{ Exception -> 0x00e9 }
            r0.f31515e = r7     // Catch:{ Exception -> 0x00e9 }
            r0.f31516f = r8     // Catch:{ Exception -> 0x00e9 }
            r0.f31519i = r3     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r0 = r2.uploadDlDocuments(r4, r8, r0)     // Catch:{ Exception -> 0x00e9 }
            if (r0 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r1 = r8
            r8 = r0
            r0 = r7
        L_0x0074:
            com.nic.mparivahan.Security.SecModle.SecurityModle r8 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r8     // Catch:{ Exception -> 0x00ea }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x009f }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00a1
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x009f }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x009f }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x009f }
            byte[] r8 = r3.decode((java.lang.String) r8)     // Catch:{ Exception -> 0x009f }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x009f }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x009f }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x009f }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x009f }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x009f }
        L_0x009a:
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x009f }
            goto L_0x00bb
        L_0x009f:
            r8 = move-exception
            goto L_0x00ce
        L_0x00a1:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x009f }
            java.lang.String r8 = r8.getData()     // Catch:{ Exception -> 0x009f }
            r3 = 0
            byte[] r8 = android.util.Base64.decode(r8, r3)     // Catch:{ Exception -> 0x009f }
            cm.l.e(r8, r4)     // Catch:{ Exception -> 0x009f }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x009f }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x009f }
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x009f }
            java.lang.String r8 = r2.a(r1, r3)     // Catch:{ Exception -> 0x009f }
            goto L_0x009a
        L_0x00bb:
            i7.d r1 = new i7.d     // Catch:{ Exception -> 0x009f }
            r1.<init>()     // Catch:{ Exception -> 0x009f }
            java.lang.Class<com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse> r2 = com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse.class
            java.lang.Object r8 = r1.j(r8, r2)     // Catch:{ Exception -> 0x009f }
            com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse r8 = (com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse) r8     // Catch:{ Exception -> 0x009f }
            androidx.lifecycle.a0 r1 = r0.f31512d     // Catch:{ Exception -> 0x009f }
            r1.k(r8)     // Catch:{ Exception -> 0x009f }
            goto L_0x0101
        L_0x00ce:
            r8.printStackTrace()     // Catch:{ Exception -> 0x00ea }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00ea }
            android.app.Application r2 = r0.f31509a     // Catch:{ Exception -> 0x00ea }
            v9.d$a r8 = v9.d.f17494a     // Catch:{ Exception -> 0x00ea }
            java.lang.String r3 = r8.t()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r4 = "manageDocs"
            java.lang.String r5 = r8.v()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r6 = r8.w()     // Catch:{ Exception -> 0x00ea }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00ea }
            goto L_0x0101
        L_0x00e9:
            r0 = r7
        L_0x00ea:
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k
            android.app.Application r2 = r0.f31509a
            v9.d$a r8 = v9.d.f17494a
            java.lang.String r3 = r8.t()
            java.lang.String r4 = "manageDocs"
            java.lang.String r5 = r8.v()
            java.lang.String r6 = r8.w()
            r1.a(r2, r3, r4, r5, r6)
        L_0x0101:
            pl.x r8 = pl.x.f30437a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.f.b(tl.d):java.lang.Object");
    }
}
