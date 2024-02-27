package com.google.firebase.installations;

import a7.d;
import android.text.TextUtils;
import b7.f;
import com.google.firebase.installations.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k6.w;
import p4.i;
import p4.j;
import p4.l;
import s3.o;
import z6.e;
import z6.g;

public class c implements e {

    /* renamed from: m  reason: collision with root package name */
    private static final Object f7365m = new Object();

    /* renamed from: n  reason: collision with root package name */
    private static final ThreadFactory f7366n = new a();

    /* renamed from: a  reason: collision with root package name */
    private final h6.e f7367a;

    /* renamed from: b  reason: collision with root package name */
    private final b7.c f7368b;

    /* renamed from: c  reason: collision with root package name */
    private final a7.c f7369c;

    /* renamed from: d  reason: collision with root package name */
    private final i f7370d;

    /* renamed from: e  reason: collision with root package name */
    private final w f7371e;

    /* renamed from: f  reason: collision with root package name */
    private final g f7372f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f7373g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f7374h;

    /* renamed from: i  reason: collision with root package name */
    private final Executor f7375i;

    /* renamed from: j  reason: collision with root package name */
    private String f7376j;

    /* renamed from: k  reason: collision with root package name */
    private Set f7377k;

    /* renamed from: l  reason: collision with root package name */
    private final List f7378l;

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f7379a = new AtomicInteger(1);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f7379a.getAndIncrement())}));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7380a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f7381b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                b7.f$b[] r0 = b7.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7381b = r0
                r1 = 1
                b7.f$b r2 = b7.f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7381b     // Catch:{ NoSuchFieldError -> 0x001d }
                b7.f$b r3 = b7.f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f7381b     // Catch:{ NoSuchFieldError -> 0x0028 }
                b7.f$b r3 = b7.f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                b7.d$b[] r2 = b7.d.b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f7380a = r2
                b7.d$b r3 = b7.d.b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f7380a     // Catch:{ NoSuchFieldError -> 0x0043 }
                b7.d$b r2 = b7.d.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.b.<clinit>():void");
        }
    }

    c(h6.e eVar, y6.b bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, eVar, new b7.c(eVar.j(), bVar), new a7.c(eVar), i.c(), new w(new z6.a(eVar)), new g());
    }

    private String A(d dVar) {
        if ((!this.f7367a.l().equals("CHIME_ANDROID_SDK") && !this.f7367a.t()) || !dVar.m()) {
            return this.f7372f.a();
        }
        String f10 = p().f();
        return TextUtils.isEmpty(f10) ? this.f7372f.a() : f10;
    }

    private d B(d dVar) {
        b7.d d10 = this.f7368b.d(m(), dVar.d(), t(), n(), (dVar.d() == null || dVar.d().length() != 11) ? null : p().i());
        int i10 = b.f7380a[d10.e().ordinal()];
        if (i10 == 1) {
            return dVar.s(d10.c(), d10.d(), this.f7370d.b(), d10.b().c(), d10.b().d());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private void C(Exception exc) {
        synchronized (this.f7373g) {
            try {
                Iterator it = this.f7378l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    private void D(a7.d dVar) {
        synchronized (this.f7373g) {
            try {
                Iterator it = this.f7378l.iterator();
                while (it.hasNext()) {
                    if (((h) it.next()).a(dVar)) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    private synchronized void E(String str) {
        this.f7376j = str;
    }

    private synchronized void F(a7.d dVar, a7.d dVar2) {
        if (this.f7377k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator it = this.f7377k.iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                dVar2.d();
                throw null;
            }
        }
    }

    private i g() {
        j jVar = new j();
        i(new e(this.f7370d, jVar));
        return jVar.a();
    }

    private i h() {
        j jVar = new j();
        i(new f(jVar));
        return jVar.a();
    }

    private void i(h hVar) {
        synchronized (this.f7373g) {
            this.f7378l.add(hVar);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(boolean r3) {
        /*
            r2 = this;
            a7.d r0 = r2.r()
            boolean r1 = r0.i()     // Catch:{ d -> 0x001d }
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0.l()     // Catch:{ d -> 0x001d }
            if (r1 == 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            if (r3 != 0) goto L_0x001f
            com.google.firebase.installations.i r3 = r2.f7370d     // Catch:{ d -> 0x001d }
            boolean r3 = r3.f(r0)     // Catch:{ d -> 0x001d }
            if (r3 == 0) goto L_0x001c
            goto L_0x001f
        L_0x001c:
            return
        L_0x001d:
            r3 = move-exception
            goto L_0x005e
        L_0x001f:
            a7.d r3 = r2.l(r0)     // Catch:{ d -> 0x001d }
            goto L_0x0028
        L_0x0024:
            a7.d r3 = r2.B(r0)     // Catch:{ d -> 0x001d }
        L_0x0028:
            r2.u(r3)
            r2.F(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r3.d()
            r2.E(r0)
        L_0x003b:
            boolean r0 = r3.i()
            if (r0 == 0) goto L_0x004c
            com.google.firebase.installations.d r3 = new com.google.firebase.installations.d
            com.google.firebase.installations.d$a r0 = com.google.firebase.installations.d.a.BAD_CONFIG
            r3.<init>(r0)
        L_0x0048:
            r2.C(r3)
            goto L_0x005d
        L_0x004c:
            boolean r0 = r3.j()
            if (r0 == 0) goto L_0x005a
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            goto L_0x0048
        L_0x005a:
            r2.D(r3)
        L_0x005d:
            return
        L_0x005e:
            r2.C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.c.v(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void x(boolean z10) {
        a7.d s10 = s();
        if (z10) {
            s10 = s10.p();
        }
        D(s10);
        this.f7375i.execute(new z6.d(this, z10));
    }

    private a7.d l(a7.d dVar) {
        f e10 = this.f7368b.e(m(), dVar.d(), t(), dVar.f());
        int i10 = b.f7381b[e10.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(e10.c(), e10.d(), this.f7370d.b());
        } else if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        } else {
            if (i10 == 3) {
                E((String) null);
                return dVar.r();
            }
            throw new d("Firebase Installations Service is unavailable. Please try again later.", d.a.UNAVAILABLE);
        }
    }

    private synchronized String o() {
        return this.f7376j;
    }

    private a7.b p() {
        return (a7.b) this.f7371e.get();
    }

    public static c q(h6.e eVar) {
        o.b(eVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) eVar.i(e.class);
    }

    private a7.d r() {
        b a10;
        a7.d d10;
        synchronized (f7365m) {
            try {
                a10 = b.a(this.f7367a.j(), "generatefid.lock");
                d10 = this.f7369c.d();
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    private a7.d s() {
        b a10;
        a7.d d10;
        synchronized (f7365m) {
            try {
                a10 = b.a(this.f7367a.j(), "generatefid.lock");
                d10 = this.f7369c.d();
                if (d10.j()) {
                    d10 = this.f7369c.b(d10.t(A(d10)));
                }
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d10;
    }

    private void u(a7.d dVar) {
        b a10;
        synchronized (f7365m) {
            try {
                a10 = b.a(this.f7367a.j(), "generatefid.lock");
                this.f7369c.b(dVar);
                if (a10 != null) {
                    a10.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w() {
        x(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ a7.b y(h6.e eVar) {
        return new a7.b(eVar);
    }

    private void z() {
        o.f(n(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.f(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.f(m(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(i.h(n()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o.b(i.g(m()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public i a(boolean z10) {
        z();
        i g10 = g();
        this.f7374h.execute(new z6.b(this, z10));
        return g10;
    }

    public i c() {
        z();
        String o10 = o();
        if (o10 != null) {
            return l.e(o10);
        }
        i h10 = h();
        this.f7374h.execute(new z6.c(this));
        return h10;
    }

    /* access modifiers changed from: package-private */
    public String m() {
        return this.f7367a.m().b();
    }

    /* access modifiers changed from: package-private */
    public String n() {
        return this.f7367a.m().c();
    }

    /* access modifiers changed from: package-private */
    public String t() {
        return this.f7367a.m().e();
    }

    c(ExecutorService executorService, Executor executor, h6.e eVar, b7.c cVar, a7.c cVar2, i iVar, w wVar, g gVar) {
        this.f7373g = new Object();
        this.f7377k = new HashSet();
        this.f7378l = new ArrayList();
        this.f7367a = eVar;
        this.f7368b = cVar;
        this.f7369c = cVar2;
        this.f7370d = iVar;
        this.f7371e = wVar;
        this.f7372f = gVar;
        this.f7374h = executorService;
        this.f7375i = executor;
    }
}
