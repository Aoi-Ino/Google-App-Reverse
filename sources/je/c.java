package je;

import androidx.lifecycle.a0;
import androidx.lifecycle.t0;
import cm.l;
import cm.u;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUpdateRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import retrofit2.Call;
import retrofit2.Callback;
import um.c0;
import um.x;

public final class c extends t0 {

    /* renamed from: d  reason: collision with root package name */
    private final a f24544d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f24545e = new a0();

    /* renamed from: f  reason: collision with root package name */
    private final a0 f24546f = new a0();

    /* renamed from: g  reason: collision with root package name */
    private final a0 f24547g = new a0();

    /* renamed from: h  reason: collision with root package name */
    private final a0 f24548h = new a0();

    /* renamed from: i  reason: collision with root package name */
    private final a0 f24549i = new a0();

    /* renamed from: j  reason: collision with root package name */
    private final a0 f24550j = new a0();

    /* renamed from: k  reason: collision with root package name */
    private final a0 f24551k = new a0();

    /* renamed from: l  reason: collision with root package name */
    private final a0 f24552l = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final a0 f24553m = new a0();

    /* renamed from: n  reason: collision with root package name */
    private final a0 f24554n = new a0();

    public static final class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24555a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24556b;

        a(u uVar, c cVar) {
            this.f24555a = uVar;
            this.f24556b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24556b.i().k(th2 != null ? th2.toString() : null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r4.f24556b.i().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0075 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                r4 = this;
                java.lang.String r5 = "error"
                if (r6 == 0) goto L_0x000b
                java.lang.Object r6 = r6.body()     // Catch:{ Exception -> 0x007f }
                com.nic.mparivahan.Security.SecModle.SecurityModle r6 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r6     // Catch:{ Exception -> 0x007f }
                goto L_0x000c
            L_0x000b:
                r6 = 0
            L_0x000c:
                if (r6 == 0) goto L_0x0088
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0075 }
                r1 = 26
                java.lang.String r2 = "decode(...)"
                if (r0 < r1) goto L_0x003d
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                cm.u r1 = r4.f24555a     // Catch:{ Exception -> 0x0075 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0075 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0075 }
                j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = r6.getData()     // Catch:{ Exception -> 0x0075 }
                byte[] r6 = r3.decode((java.lang.String) r6)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r6, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r2.<init>(r6, r3)     // Catch:{ Exception -> 0x0075 }
            L_0x0034:
                java.lang.String r6 = r0.a(r1, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0059
            L_0x003d:
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                cm.u r1 = r4.f24555a     // Catch:{ Exception -> 0x0075 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0075 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = r6.getData()     // Catch:{ Exception -> 0x0075 }
                r3 = 0
                byte[] r6 = android.util.Base64.decode(r6, r3)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r6, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r2.<init>(r6, r3)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0034
            L_0x0059:
                i7.d r0 = new i7.d     // Catch:{ Exception -> 0x0075 }
                r0.<init>()     // Catch:{ Exception -> 0x0075 }
                java.lang.Class<com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse> r1 = com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse.class
                java.lang.Object r6 = r0.j(r6, r1)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r0 = "fromJson(...)"
                cm.l.e(r6, r0)     // Catch:{ Exception -> 0x0075 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse r6 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse) r6     // Catch:{ Exception -> 0x0075 }
                je.c r0 = r4.f24556b     // Catch:{ Exception -> 0x0075 }
                androidx.lifecycle.a0 r0 = r0.h()     // Catch:{ Exception -> 0x0075 }
                r0.k(r6)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0088
            L_0x0075:
                je.c r6 = r4.f24556b     // Catch:{ Exception -> 0x007f }
                androidx.lifecycle.a0 r6 = r6.i()     // Catch:{ Exception -> 0x007f }
                r6.k(r5)     // Catch:{ Exception -> 0x007f }
                goto L_0x0088
            L_0x007f:
                je.c r6 = r4.f24556b
                androidx.lifecycle.a0 r6 = r6.i()
                r6.k(r5)
            L_0x0088:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je.c.a.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24557a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24558b;

        b(u uVar, c cVar) {
            this.f24557a = uVar;
            this.f24558b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24558b.m().k(th2 != null ? th2.toString() : null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|17) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r3.f24558b.m().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0073 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r4, retrofit2.Response r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L_0x0009
                java.lang.Object r4 = r5.body()     // Catch:{ Exception -> 0x007e }
                com.nic.mparivahan.Security.SecModle.SecurityModle r4 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r4     // Catch:{ Exception -> 0x007e }
                goto L_0x000a
            L_0x0009:
                r4 = 0
            L_0x000a:
                if (r4 == 0) goto L_0x007e
                int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0073 }
                r0 = 26
                java.lang.String r1 = "decode(...)"
                if (r5 < r0) goto L_0x003b
                id.c$a r5 = id.c.f12675a     // Catch:{ Exception -> 0x0073 }
                cm.u r0 = r3.f24557a     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r0 = r0.f20234e     // Catch:{ Exception -> 0x0073 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0073 }
                j$.util.Base64$Decoder r2 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = r4.getData()     // Catch:{ Exception -> 0x0073 }
                byte[] r4 = r2.decode((java.lang.String) r4)     // Catch:{ Exception -> 0x0073 }
                cm.l.e(r4, r1)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0073 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x0073 }
                r1.<init>(r4, r2)     // Catch:{ Exception -> 0x0073 }
            L_0x0032:
                java.lang.String r4 = r5.a(r0, r1)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0073 }
                goto L_0x0057
            L_0x003b:
                id.c$a r5 = id.c.f12675a     // Catch:{ Exception -> 0x0073 }
                cm.u r0 = r3.f24557a     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r0 = r0.f20234e     // Catch:{ Exception -> 0x0073 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = r4.getData()     // Catch:{ Exception -> 0x0073 }
                r2 = 0
                byte[] r4 = android.util.Base64.decode(r4, r2)     // Catch:{ Exception -> 0x0073 }
                cm.l.e(r4, r1)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0073 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x0073 }
                r1.<init>(r4, r2)     // Catch:{ Exception -> 0x0073 }
                goto L_0x0032
            L_0x0057:
                i7.d r5 = new i7.d     // Catch:{ Exception -> 0x0073 }
                r5.<init>()     // Catch:{ Exception -> 0x0073 }
                java.lang.Class<com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse> r0 = com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse.class
                java.lang.Object r4 = r5.j(r4, r0)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r5 = "fromJson(...)"
                cm.l.e(r4, r5)     // Catch:{ Exception -> 0x0073 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse) r4     // Catch:{ Exception -> 0x0073 }
                je.c r5 = r3.f24558b     // Catch:{ Exception -> 0x0073 }
                androidx.lifecycle.a0 r5 = r5.l()     // Catch:{ Exception -> 0x0073 }
                r5.k(r4)     // Catch:{ Exception -> 0x0073 }
                goto L_0x007e
            L_0x0073:
                je.c r4 = r3.f24558b     // Catch:{ Exception -> 0x007e }
                androidx.lifecycle.a0 r4 = r4.m()     // Catch:{ Exception -> 0x007e }
                java.lang.String r5 = "error"
                r4.k(r5)     // Catch:{ Exception -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je.c.b.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    /* renamed from: je.c$c  reason: collision with other inner class name */
    public static final class C0311c implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24560b;

        C0311c(u uVar, c cVar) {
            this.f24559a = uVar;
            this.f24560b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24560b.o().k(th2 != null ? th2.toString() : null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r4.f24560b.o().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0075 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                r4 = this;
                java.lang.String r5 = "error"
                if (r6 == 0) goto L_0x000b
                java.lang.Object r6 = r6.body()     // Catch:{ Exception -> 0x007f }
                com.nic.mparivahan.Security.SecModle.SecurityModle r6 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r6     // Catch:{ Exception -> 0x007f }
                goto L_0x000c
            L_0x000b:
                r6 = 0
            L_0x000c:
                if (r6 == 0) goto L_0x0088
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0075 }
                r1 = 26
                java.lang.String r2 = "decode(...)"
                if (r0 < r1) goto L_0x003d
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                cm.u r1 = r4.f24559a     // Catch:{ Exception -> 0x0075 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0075 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0075 }
                j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = r6.getData()     // Catch:{ Exception -> 0x0075 }
                byte[] r6 = r3.decode((java.lang.String) r6)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r6, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r2.<init>(r6, r3)     // Catch:{ Exception -> 0x0075 }
            L_0x0034:
                java.lang.String r6 = r0.a(r1, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0059
            L_0x003d:
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                cm.u r1 = r4.f24559a     // Catch:{ Exception -> 0x0075 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0075 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = r6.getData()     // Catch:{ Exception -> 0x0075 }
                r3 = 0
                byte[] r6 = android.util.Base64.decode(r6, r3)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r6, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r2.<init>(r6, r3)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0034
            L_0x0059:
                i7.d r0 = new i7.d     // Catch:{ Exception -> 0x0075 }
                r0.<init>()     // Catch:{ Exception -> 0x0075 }
                java.lang.Class<com.nic.mparivahan.VahanServices.DMS.DmsModle.UpdateDocResponse> r1 = com.nic.mparivahan.VahanServices.DMS.DmsModle.UpdateDocResponse.class
                java.lang.Object r6 = r0.j(r6, r1)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r0 = "fromJson(...)"
                cm.l.e(r6, r0)     // Catch:{ Exception -> 0x0075 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UpdateDocResponse r6 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.UpdateDocResponse) r6     // Catch:{ Exception -> 0x0075 }
                je.c r0 = r4.f24560b     // Catch:{ Exception -> 0x0075 }
                androidx.lifecycle.a0 r0 = r0.n()     // Catch:{ Exception -> 0x0075 }
                r0.k(r6)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0088
            L_0x0075:
                je.c r6 = r4.f24560b     // Catch:{ Exception -> 0x007f }
                androidx.lifecycle.a0 r6 = r6.o()     // Catch:{ Exception -> 0x007f }
                r6.k(r5)     // Catch:{ Exception -> 0x007f }
                goto L_0x0088
            L_0x007f:
                je.c r6 = r4.f24560b
                androidx.lifecycle.a0 r6 = r6.o()
                r6.k(r5)
            L_0x0088:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je.c.C0311c.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class d implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24561a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24562b;

        d(u uVar, c cVar) {
            this.f24561a = uVar;
            this.f24562b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24562b.k().k(th2 != null ? th2.toString() : null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:15|16|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r4.f24562b.k().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0075 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r5, retrofit2.Response r6) {
            /*
                r4 = this;
                java.lang.String r5 = "error"
                if (r6 == 0) goto L_0x000b
                java.lang.Object r6 = r6.body()     // Catch:{ Exception -> 0x007f }
                com.nic.mparivahan.Security.SecModle.SecurityModle r6 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r6     // Catch:{ Exception -> 0x007f }
                goto L_0x000c
            L_0x000b:
                r6 = 0
            L_0x000c:
                if (r6 == 0) goto L_0x0088
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0075 }
                r1 = 26
                java.lang.String r2 = "decode(...)"
                if (r0 < r1) goto L_0x003d
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                cm.u r1 = r4.f24561a     // Catch:{ Exception -> 0x0075 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0075 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0075 }
                j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = r6.getData()     // Catch:{ Exception -> 0x0075 }
                byte[] r6 = r3.decode((java.lang.String) r6)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r6, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r2.<init>(r6, r3)     // Catch:{ Exception -> 0x0075 }
            L_0x0034:
                java.lang.String r6 = r0.a(r1, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0059
            L_0x003d:
                id.c$a r0 = id.c.f12675a     // Catch:{ Exception -> 0x0075 }
                cm.u r1 = r4.f24561a     // Catch:{ Exception -> 0x0075 }
                java.lang.Object r1 = r1.f20234e     // Catch:{ Exception -> 0x0075 }
                java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0075 }
                java.lang.String r6 = r6.getData()     // Catch:{ Exception -> 0x0075 }
                r3 = 0
                byte[] r6 = android.util.Base64.decode(r6, r3)     // Catch:{ Exception -> 0x0075 }
                cm.l.e(r6, r2)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x0075 }
                java.nio.charset.Charset r3 = km.d.f24740b     // Catch:{ Exception -> 0x0075 }
                r2.<init>(r6, r3)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0034
            L_0x0059:
                i7.d r0 = new i7.d     // Catch:{ Exception -> 0x0075 }
                r0.<init>()     // Catch:{ Exception -> 0x0075 }
                java.lang.Class<com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes> r1 = com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes.class
                java.lang.Object r6 = r0.j(r6, r1)     // Catch:{ Exception -> 0x0075 }
                java.lang.String r0 = "fromJson(...)"
                cm.l.e(r6, r0)     // Catch:{ Exception -> 0x0075 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes r6 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes) r6     // Catch:{ Exception -> 0x0075 }
                je.c r0 = r4.f24562b     // Catch:{ Exception -> 0x0075 }
                androidx.lifecycle.a0 r0 = r0.j()     // Catch:{ Exception -> 0x0075 }
                r0.k(r6)     // Catch:{ Exception -> 0x0075 }
                goto L_0x0088
            L_0x0075:
                je.c r6 = r4.f24562b     // Catch:{ Exception -> 0x007f }
                androidx.lifecycle.a0 r6 = r6.k()     // Catch:{ Exception -> 0x007f }
                r6.k(r5)     // Catch:{ Exception -> 0x007f }
                goto L_0x0088
            L_0x007f:
                je.c r6 = r4.f24562b
                androidx.lifecycle.a0 r6 = r6.k()
                r6.k(r5)
            L_0x0088:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je.c.d.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public static final class e implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f24563a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f24564b;

        e(u uVar, c cVar) {
            this.f24563a = uVar;
            this.f24564b = cVar;
        }

        public void onFailure(Call call, Throwable th2) {
            this.f24564b.r().k(th2 != null ? th2.toString() : null);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|17) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r3.f24564b.r().k("error");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0073 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call r4, retrofit2.Response r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L_0x0009
                java.lang.Object r4 = r5.body()     // Catch:{ Exception -> 0x007e }
                com.nic.mparivahan.Security.SecModle.SecurityModle r4 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r4     // Catch:{ Exception -> 0x007e }
                goto L_0x000a
            L_0x0009:
                r4 = 0
            L_0x000a:
                if (r4 == 0) goto L_0x007e
                int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0073 }
                r0 = 26
                java.lang.String r1 = "decode(...)"
                if (r5 < r0) goto L_0x003b
                id.c$a r5 = id.c.f12675a     // Catch:{ Exception -> 0x0073 }
                cm.u r0 = r3.f24563a     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r0 = r0.f20234e     // Catch:{ Exception -> 0x0073 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0073 }
                j$.util.Base64$Decoder r2 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = r4.getData()     // Catch:{ Exception -> 0x0073 }
                byte[] r4 = r2.decode((java.lang.String) r4)     // Catch:{ Exception -> 0x0073 }
                cm.l.e(r4, r1)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0073 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x0073 }
                r1.<init>(r4, r2)     // Catch:{ Exception -> 0x0073 }
            L_0x0032:
                java.lang.String r4 = r5.a(r0, r1)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0073 }
                goto L_0x0057
            L_0x003b:
                id.c$a r5 = id.c.f12675a     // Catch:{ Exception -> 0x0073 }
                cm.u r0 = r3.f24563a     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r0 = r0.f20234e     // Catch:{ Exception -> 0x0073 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = r4.getData()     // Catch:{ Exception -> 0x0073 }
                r2 = 0
                byte[] r4 = android.util.Base64.decode(r4, r2)     // Catch:{ Exception -> 0x0073 }
                cm.l.e(r4, r1)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x0073 }
                java.nio.charset.Charset r2 = km.d.f24740b     // Catch:{ Exception -> 0x0073 }
                r1.<init>(r4, r2)     // Catch:{ Exception -> 0x0073 }
                goto L_0x0032
            L_0x0057:
                i7.d r5 = new i7.d     // Catch:{ Exception -> 0x0073 }
                r5.<init>()     // Catch:{ Exception -> 0x0073 }
                java.lang.Class<com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle> r0 = com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle.class
                java.lang.Object r4 = r5.j(r4, r0)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r5 = "fromJson(...)"
                cm.l.e(r4, r5)     // Catch:{ Exception -> 0x0073 }
                com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle r4 = (com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle) r4     // Catch:{ Exception -> 0x0073 }
                je.c r5 = r3.f24564b     // Catch:{ Exception -> 0x0073 }
                androidx.lifecycle.a0 r5 = r5.q()     // Catch:{ Exception -> 0x0073 }
                r5.k(r4)     // Catch:{ Exception -> 0x0073 }
                goto L_0x007e
            L_0x0073:
                je.c r4 = r3.f24564b     // Catch:{ Exception -> 0x007e }
                androidx.lifecycle.a0 r4 = r4.r()     // Catch:{ Exception -> 0x007e }
                java.lang.String r5 = "error"
                r4.k(r5)     // Catch:{ Exception -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: je.c.e.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    public c(a aVar) {
        l.f(aVar, "repository");
        this.f24544d = aVar;
    }

    public final void g(String str, String str2, String str3, int i10, int i11, NrvDetails nrvDetails) {
        l.f(str, "appNo");
        l.f(str2, "purposeCode");
        l.f(str3, "state");
        NrvDetails nrvDetails2 = nrvDetails;
        l.f(nrvDetails2, "rcdetails");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.c0(str, str2, str3, i10, i11, nrvDetails2).toString();
        l.e(jSONObject, "toString(...)");
        this.f24544d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new a(uVar, this));
    }

    public final a0 h() {
        return this.f24545e;
    }

    public final a0 i() {
        return this.f24546f;
    }

    public final a0 j() {
        return this.f24547g;
    }

    public final a0 k() {
        return this.f24548h;
    }

    public final a0 l() {
        return this.f24549i;
    }

    public final a0 m() {
        return this.f24550j;
    }

    public final a0 n() {
        return this.f24553m;
    }

    public final a0 o() {
        return this.f24554n;
    }

    public final void p(String str, String str2, String str3, int i10, int i11, NrvDetails nrvDetails) {
        l.f(str, "appNo");
        l.f(str2, "purposeCode");
        l.f(str3, "state");
        NrvDetails nrvDetails2 = nrvDetails;
        l.f(nrvDetails2, "rcdetails");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.c0(str, str2, str3, i10, i11, nrvDetails2).toString();
        l.e(jSONObject, "toString(...)");
        this.f24544d.b(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new b(uVar, this));
    }

    public final a0 q() {
        return this.f24551k;
    }

    public final a0 r() {
        return this.f24552l;
    }

    public final void s(DmsUpdateRequest dmsUpdateRequest) {
        l.f(dmsUpdateRequest, "dmsupdate");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f24544d.a(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.t(dmsUpdateRequest).toString()), (String) uVar.f20234e).enqueue(new C0311c(uVar, this));
    }

    public final void t(DmsUploadReq dmsUploadReq) {
        l.f(dmsUploadReq, "upload_req");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        this.f24544d.c(c0.Companion.f(x.f32156g.b("application/json"), VUtility.Companion.u(dmsUploadReq).toString()), (String) uVar.f20234e).enqueue(new d(uVar, this));
    }

    public final void u(String str, String str2, String str3) {
        l.f(str, "bucketName");
        l.f(str2, "fileName");
        l.f(str3, "appNo");
        u uVar = new u();
        uVar.f20234e = String.valueOf(System.currentTimeMillis());
        c0.a aVar = c0.Companion;
        x b10 = x.f32156g.b("application/json");
        String jSONObject = VUtility.Companion.t0(str, str2, str3).toString();
        l.e(jSONObject, "toString(...)");
        this.f24544d.d(aVar.f(b10, jSONObject), (String) uVar.f20234e).enqueue(new e(uVar, this));
    }
}
