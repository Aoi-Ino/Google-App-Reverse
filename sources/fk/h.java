package fk;

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

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private Application f23573a;

    /* renamed from: b  reason: collision with root package name */
    private String f23574b;

    /* renamed from: c  reason: collision with root package name */
    private String f23575c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f23576d = new a0();

    static final class a extends l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f23577f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h f23578g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, d dVar) {
            super(2, dVar);
            this.f23578g = hVar;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, d dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final d create(Object obj, d dVar) {
            return new a(this.f23578g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.f23577f;
            if (i10 == 0) {
                q.b(obj);
                h hVar = this.f23578g;
                this.f23577f = 1;
                if (hVar.b(this) == c10) {
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
        Object f23579e;

        /* renamed from: f  reason: collision with root package name */
        Object f23580f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f23581g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h f23582h;

        /* renamed from: i  reason: collision with root package name */
        int f23583i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar, d dVar) {
            super(dVar);
            this.f23582h = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23581g = obj;
            this.f23583i |= Integer.MIN_VALUE;
            return this.f23582h.b(this);
        }
    }

    public h(Application application, String str, String str2) {
        cm.l.f(application, "mApp");
        cm.l.f(str, "applNo");
        cm.l.f(str2, "dob");
        this.f23573a = application;
        this.f23574b = str;
        this.f23575c = str2;
        k1 unused = g.d(e0.a(q0.c()), (g) null, (f0) null, new a(this, (d) null), 3, (Object) null);
    }

    public final a0 a() {
        return this.f23576d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[SYNTHETIC, Splitter:B:27:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[Catch:{ Exception -> 0x00ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(tl.d r9) {
        /*
            r8 = this;
            java.lang.String r0 = "DecRes-"
            boolean r1 = r9 instanceof fk.h.b
            if (r1 == 0) goto L_0x0015
            r1 = r9
            fk.h$b r1 = (fk.h.b) r1
            int r2 = r1.f23583i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f23583i = r2
            goto L_0x001a
        L_0x0015:
            fk.h$b r1 = new fk.h$b
            r1.<init>(r8, r9)
        L_0x001a:
            java.lang.Object r9 = r1.f23581g
            java.lang.Object r2 = ul.d.c()
            int r3 = r1.f23583i
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r2 = r1.f23580f
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.f23579e
            fk.h r1 = (fk.h) r1
            pl.q.b(r9)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0079
        L_0x0033:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003b:
            pl.q.b(r9)
            si.b$a r9 = si.b.f31257a
            android.app.Application r3 = r8.f23573a
            boolean r9 = r9.a(r3)
            if (r9 == 0) goto L_0x00f4
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            si.a$a r3 = si.a.f31253a
            android.app.Application r5 = r8.f23573a
            retrofit2.Retrofit r3 = r3.a(r5)
            java.lang.Class<com.nic.mparivahan.dlservices.ui.slots.DlSlotsService> r5 = com.nic.mparivahan.dlservices.ui.slots.DlSlotsService.class
            java.lang.Object r3 = r3.create(r5)
            com.nic.mparivahan.dlservices.ui.slots.DlSlotsService r3 = (com.nic.mparivahan.dlservices.ui.slots.DlSlotsService) r3
            com.nic.mparivahan.dlservices.ui.slots.model.SlotsRequest r5 = new com.nic.mparivahan.dlservices.ui.slots.model.SlotsRequest     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r6 = r8.f23574b     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r7 = r8.f23575c     // Catch:{ Exception -> 0x00f4 }
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x00f4 }
            r1.f23579e = r8     // Catch:{ Exception -> 0x00f4 }
            r1.f23580f = r9     // Catch:{ Exception -> 0x00f4 }
            r1.f23583i = r4     // Catch:{ Exception -> 0x00f4 }
            java.lang.Object r1 = r3.getAcknowDetails(r5, r9, r1)     // Catch:{ Exception -> 0x00f4 }
            if (r1 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r2 = r9
            r9 = r1
            r1 = r8
        L_0x0079:
            com.nic.mparivahan.Security.SecModle.SecurityModle r9 = (com.nic.mparivahan.Security.SecModle.SecurityModle) r9     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "_update"
            java.lang.String r5 = r9.toString()     // Catch:{ Exception -> 0x00f4 }
            android.util.Log.d(r3, r5)     // Catch:{ Exception -> 0x00f4 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ad }
            r5 = 26
            java.lang.String r6 = "decode(...)"
            if (r3 < r5) goto L_0x00af
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ad }
            j$.util.Base64$Decoder r5 = j$.util.Base64.getDecoder()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ad }
            byte[] r9 = r5.decode((java.lang.String) r9)     // Catch:{ Exception -> 0x00ad }
            cm.l.e(r9, r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x00ad }
            java.nio.charset.Charset r6 = km.d.f24740b     // Catch:{ Exception -> 0x00ad }
            r5.<init>(r9, r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r3.a(r2, r5)     // Catch:{ Exception -> 0x00ad }
        L_0x00a8:
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00c9
        L_0x00ad:
            r9 = move-exception
            goto L_0x00df
        L_0x00af:
            id.c$a r3 = id.c.f12675a     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r9.getData()     // Catch:{ Exception -> 0x00ad }
            r5 = 0
            byte[] r9 = android.util.Base64.decode(r9, r5)     // Catch:{ Exception -> 0x00ad }
            cm.l.e(r9, r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r5 = new java.lang.String     // Catch:{ Exception -> 0x00ad }
            java.nio.charset.Charset r6 = km.d.f24740b     // Catch:{ Exception -> 0x00ad }
            r5.<init>(r9, r6)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r3.a(r2, r5)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00a8
        L_0x00c9:
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x00ad }
            i7.d r2 = new i7.d     // Catch:{ Exception -> 0x00ad }
            r2.<init>()     // Catch:{ Exception -> 0x00ad }
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            java.lang.Object r9 = r2.j(r9, r3)     // Catch:{ Exception -> 0x00ad }
            org.json.JSONObject r9 = (org.json.JSONObject) r9     // Catch:{ Exception -> 0x00ad }
            androidx.lifecycle.a0 r2 = r1.f23576d     // Catch:{ Exception -> 0x00ad }
            r2.k(r9)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00f4
        L_0x00df:
            r9.printStackTrace()     // Catch:{ Exception -> 0x00f4 }
            android.app.Application r1 = r1.f23573a     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r2 = "Unable to download Appointment Receipt.\nTry After some time"
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r4)     // Catch:{ Exception -> 0x00f4 }
            r1.show()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch:{ Exception -> 0x00f4 }
            android.util.Log.d(r0, r9)     // Catch:{ Exception -> 0x00f4 }
        L_0x00f4:
            pl.x r9 = pl.x.f30437a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.h.b(tl.d):java.lang.Object");
    }
}
