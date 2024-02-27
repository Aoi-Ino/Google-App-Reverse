package ik;

import android.app.Application;
import androidx.lifecycle.a0;
import bm.p;
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

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private Application f24407a;

    /* renamed from: b  reason: collision with root package name */
    private String f24408b;

    /* renamed from: c  reason: collision with root package name */
    private String f24409c;

    /* renamed from: d  reason: collision with root package name */
    private String f24410d;

    /* renamed from: e  reason: collision with root package name */
    private String f24411e;

    /* renamed from: f  reason: collision with root package name */
    private String f24412f;

    /* renamed from: g  reason: collision with root package name */
    private String f24413g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f24414h = new a0();

    /* renamed from: ik.a$a  reason: collision with other inner class name */
    static final class C0308a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f24415f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f24416g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0308a(a aVar, d dVar) {
            super(2, dVar);
            this.f24416g = aVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((C0308a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new C0308a(this.f24416g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f24415f;
            if (i10 == 0) {
                q.b(obj);
                a aVar = this.f24416g;
                this.f24415f = 1;
                if (aVar.a(this) == c10) {
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
        Object f24417e;

        /* renamed from: f  reason: collision with root package name */
        Object f24418f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f24419g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ a f24420h;

        /* renamed from: i  reason: collision with root package name */
        int f24421i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(dVar);
            this.f24420h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f24419g = obj;
            this.f24421i |= Integer.MIN_VALUE;
            return this.f24420h.a(this);
        }
    }

    public a(Application application, String str, String str2, String str3, String str4, String str5, String str6) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "rtocd");
        cm.l.f(str2, "applNo");
        cm.l.f(str3, "slotDate");
        cm.l.f(str4, "slotNo");
        cm.l.f(str5, "campid");
        cm.l.f(str6, "campcd");
        this.f24407a = application;
        this.f24408b = str;
        this.f24409c = str2;
        this.f24410d = str3;
        this.f24411e = str4;
        this.f24412f = str5;
        this.f24413g = str6;
        k1 unused = g.d(e0.a(q0.b()), (g) null, (f0) null, new C0308a(this, (d) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0093 A[SYNTHETIC, Splitter:B:27:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b6 A[Catch:{ Exception -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(tl.d r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ik.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ik.a$b r0 = (ik.a.b) r0
            int r1 = r0.f24421i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24421i = r1
            goto L_0x0018
        L_0x0013:
            ik.a$b r0 = new ik.a$b
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f24419g
            java.lang.Object r1 = ul.d.c()
            int r2 = r0.f24421i
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f24418f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f24417e
            ik.a r0 = (ik.a) r0
            pl.q.b(r13)     // Catch:{ Exception -> 0x00f5 }
            goto L_0x0080
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0039:
            pl.q.b(r13)
            si.b$a r13 = si.b.f31257a
            android.app.Application r2 = r12.f24407a
            boolean r13 = r13.a(r2)
            if (r13 == 0) goto L_0x00f5
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = java.lang.String.valueOf(r4)
            si.a$a r2 = si.a.f31253a
            android.app.Application r4 = r12.f24407a
            retrofit2.Retrofit r2 = r2.a(r4)
            java.lang.Class<com.nic.mparivahan.dlservices.ui.slots.DlSlotsService> r4 = com.nic.mparivahan.dlservices.ui.slots.DlSlotsService.class
            java.lang.Object r2 = r2.create(r4)
            com.nic.mparivahan.dlservices.ui.slots.DlSlotsService r2 = (com.nic.mparivahan.dlservices.ui.slots.DlSlotsService) r2
            com.nic.mparivahan.dlservices.ui.slots.model.SlotsInstRequest r11 = new com.nic.mparivahan.dlservices.ui.slots.model.SlotsInstRequest     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r5 = r12.f24408b     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r6 = r12.f24412f     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r7 = r12.f24409c     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r8 = r12.f24410d     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r9 = r12.f24413g     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r10 = r12.f24411e     // Catch:{ Exception -> 0x00f5 }
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00f5 }
            r0.f24417e = r12     // Catch:{ Exception -> 0x00f5 }
            r0.f24418f = r13     // Catch:{ Exception -> 0x00f5 }
            r0.f24421i = r3     // Catch:{ Exception -> 0x00f5 }
            java.lang.Object r0 = r2.insSlotDet(r11, r13, r0)     // Catch:{ Exception -> 0x00f5 }
            if (r0 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r1 = r13
            r13 = r0
            r0 = r12
        L_0x0080:
            com.nic.mparivahan.Security.SecModle.SecurityModle r13 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r13     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r2 = "_update"
            java.lang.String r3 = r13.toString()     // Catch:{ Exception -> 0x00f5 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x00f5 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b4 }
            r3 = 26
            java.lang.String r4 = "decode(...)"
            if (r2 < r3) goto L_0x00b6
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00b4 }
            j$.util.Base64$Decoder r3 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r13 = r13.getData()     // Catch:{ Exception -> 0x00b4 }
            byte[] r13 = r3.decode((java.lang.String) r13)     // Catch:{ Exception -> 0x00b4 }
            cm.l.e(r13, r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b4 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b4 }
            r3.<init>(r13, r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r13 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00b4 }
        L_0x00af:
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00d0
        L_0x00b4:
            r13 = move-exception
            goto L_0x00db
        L_0x00b6:
            id.c$a r2 = id.c.f12675a     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r13 = r13.getData()     // Catch:{ Exception -> 0x00b4 }
            r3 = 0
            byte[] r13 = android.util.Base64.decode(r13, r3)     // Catch:{ Exception -> 0x00b4 }
            cm.l.e(r13, r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00b4 }
            java.nio.charset.Charset r4 = km.d.f24740b     // Catch:{ Exception -> 0x00b4 }
            r3.<init>(r13, r4)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r13 = r2.a(r1, r3)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00af
        L_0x00d0:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b4 }
            r1.<init>((java.lang.String) r13)     // Catch:{ Exception -> 0x00b4 }
            androidx.lifecycle.a0 r13 = r0.f24414h     // Catch:{ Exception -> 0x00b4 }
            r13.k(r1)     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00f5
        L_0x00db:
            r13.printStackTrace()     // Catch:{ Exception -> 0x00f5 }
            com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog$a r1 = com.nic.mparivahan.VahanServices.VahanLog.ApiMonitorLog.f20957k     // Catch:{ Exception -> 0x00f5 }
            android.app.Application r2 = r0.f24407a     // Catch:{ Exception -> 0x00f5 }
            v9.d$a r13 = v9.d.f17494a     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r3 = r13.t()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r4 = "getApplDtDet"
            java.lang.String r5 = r13.v()     // Catch:{ Exception -> 0x00f5 }
            java.lang.String r6 = r13.w()     // Catch:{ Exception -> 0x00f5 }
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f5 }
        L_0x00f5:
            pl.x r13 = pl.x.f30437a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ik.a.a(tl.d):java.lang.Object");
    }

    public final a0 b() {
        return this.f24414h;
    }
}
