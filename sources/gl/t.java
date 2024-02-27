package gl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import gl.a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class t {

    /* renamed from: o  reason: collision with root package name */
    static final Handler f23893o = new a(Looper.getMainLooper());

    /* renamed from: p  reason: collision with root package name */
    static volatile t f23894p = null;

    /* renamed from: a  reason: collision with root package name */
    private final g f23895a;

    /* renamed from: b  reason: collision with root package name */
    private final c f23896b;

    /* renamed from: c  reason: collision with root package name */
    private final List f23897c;

    /* renamed from: d  reason: collision with root package name */
    final Context f23898d;

    /* renamed from: e  reason: collision with root package name */
    final i f23899e;

    /* renamed from: f  reason: collision with root package name */
    final d f23900f;

    /* renamed from: g  reason: collision with root package name */
    final a0 f23901g;

    /* renamed from: h  reason: collision with root package name */
    final Map f23902h;

    /* renamed from: i  reason: collision with root package name */
    final Map f23903i;

    /* renamed from: j  reason: collision with root package name */
    final ReferenceQueue f23904j;

    /* renamed from: k  reason: collision with root package name */
    final Bitmap.Config f23905k;

    /* renamed from: l  reason: collision with root package name */
    boolean f23906l;

    /* renamed from: m  reason: collision with root package name */
    volatile boolean f23907m;

    /* renamed from: n  reason: collision with root package name */
    boolean f23908n;

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 3) {
                int i11 = 0;
                if (i10 == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i11 < size) {
                        c cVar = (c) list.get(i11);
                        cVar.f23802f.d(cVar);
                        i11++;
                    }
                } else if (i10 == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i11 < size2) {
                        a aVar = (a) list2.get(i11);
                        aVar.f23752a.m(aVar);
                        i11++;
                    }
                } else {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
            } else {
                a aVar2 = (a) message.obj;
                if (aVar2.g().f23907m) {
                    e0.v("Main", "canceled", aVar2.f23753b.d(), "target got garbage collected");
                }
                aVar2.f23752a.b(aVar2.k());
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f23909a;

        /* renamed from: b  reason: collision with root package name */
        private j f23910b;

        /* renamed from: c  reason: collision with root package name */
        private ExecutorService f23911c;

        /* renamed from: d  reason: collision with root package name */
        private d f23912d;

        /* renamed from: e  reason: collision with root package name */
        private g f23913e;

        /* renamed from: f  reason: collision with root package name */
        private List f23914f;

        /* renamed from: g  reason: collision with root package name */
        private Bitmap.Config f23915g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f23916h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f23917i;

        public b(Context context) {
            if (context != null) {
                this.f23909a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public t a() {
            Context context = this.f23909a;
            if (this.f23910b == null) {
                this.f23910b = e0.g(context);
            }
            if (this.f23912d == null) {
                this.f23912d = new m(context);
            }
            if (this.f23911c == null) {
                this.f23911c = new v();
            }
            if (this.f23913e == null) {
                this.f23913e = g.f23931a;
            }
            a0 a0Var = new a0(this.f23912d);
            Context context2 = context;
            return new t(context2, new i(context2, this.f23911c, t.f23893o, this.f23910b, this.f23912d, a0Var), this.f23912d, (d) null, this.f23913e, this.f23914f, a0Var, this.f23915g, this.f23916h, this.f23917i);
        }
    }

    private static class c extends Thread {

        /* renamed from: e  reason: collision with root package name */
        private final ReferenceQueue f23918e;

        /* renamed from: f  reason: collision with root package name */
        private final Handler f23919f;

        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Exception f23920e;

            a(Exception exc) {
                this.f23920e = exc;
            }

            public void run() {
                throw new RuntimeException(this.f23920e);
            }
        }

        c(ReferenceQueue referenceQueue, Handler handler) {
            this.f23918e = referenceQueue;
            this.f23919f = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    a.C0294a aVar = (a.C0294a) this.f23918e.remove(1000);
                    Message obtainMessage = this.f23919f.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f23764a;
                        this.f23919f.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    this.f23919f.post(new a(e10));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        

        /* renamed from: e  reason: collision with root package name */
        final int f23926e;

        private e(int i10) {
            this.f23926e = i10;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* renamed from: a  reason: collision with root package name */
        public static final g f23931a = new a();

        static class a implements g {
            a() {
            }

            public w a(w wVar) {
                return wVar;
            }
        }

        w a(w wVar);
    }

    t(Context context, i iVar, d dVar, d dVar2, g gVar, List list, a0 a0Var, Bitmap.Config config, boolean z10, boolean z11) {
        this.f23898d = context;
        this.f23899e = iVar;
        this.f23900f = dVar;
        this.f23895a = gVar;
        this.f23905k = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new f(context));
        arrayList.add(new o(context));
        arrayList.add(new g(context));
        arrayList.add(new b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f23838d, a0Var));
        this.f23897c = Collections.unmodifiableList(arrayList);
        this.f23901g = a0Var;
        this.f23902h = new WeakHashMap();
        this.f23903i = new WeakHashMap();
        this.f23906l = z10;
        this.f23907m = z11;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f23904j = referenceQueue;
        c cVar = new c(referenceQueue, f23893o);
        this.f23896b = cVar;
        cVar.start();
    }

    /* access modifiers changed from: private */
    public void b(Object obj) {
        e0.c();
        a aVar = (a) this.f23902h.remove(obj);
        if (aVar != null) {
            aVar.a();
            this.f23899e.c(aVar);
        }
        if (obj instanceof ImageView) {
            h hVar = (h) this.f23903i.remove((ImageView) obj);
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    private void f(Bitmap bitmap, e eVar, a aVar) {
        if (!aVar.l()) {
            if (!aVar.m()) {
                this.f23902h.remove(aVar.k());
            }
            if (bitmap == null) {
                aVar.c();
                if (this.f23907m) {
                    e0.u("Main", "errored", aVar.f23753b.d());
                }
            } else if (eVar != null) {
                aVar.b(bitmap, eVar);
                if (this.f23907m) {
                    String d10 = aVar.f23753b.d();
                    e0.v("Main", "completed", d10, "from " + eVar);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public static t p(Context context) {
        if (f23894p == null) {
            synchronized (t.class) {
                try {
                    if (f23894p == null) {
                        f23894p = new b(context).a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f23894p;
    }

    public void c(ImageView imageView) {
        b(imageView);
    }

    /* access modifiers changed from: package-private */
    public void d(c cVar) {
        a h10 = cVar.h();
        List i10 = cVar.i();
        boolean z10 = i10 != null && !i10.isEmpty();
        if (h10 != null || z10) {
            Uri uri = cVar.j().f23945d;
            cVar.k();
            Bitmap q10 = cVar.q();
            e m10 = cVar.m();
            if (h10 != null) {
                f(q10, m10, h10);
            }
            if (z10) {
                int size = i10.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f(q10, m10, (a) i10.get(i11));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(ImageView imageView, h hVar) {
        this.f23903i.put(imageView, hVar);
    }

    /* access modifiers changed from: package-private */
    public void g(a aVar) {
        Object k10 = aVar.k();
        if (!(k10 == null || this.f23902h.get(k10) == aVar)) {
            b(k10);
            this.f23902h.put(k10, aVar);
        }
        n(aVar);
    }

    /* access modifiers changed from: package-private */
    public List h() {
        return this.f23897c;
    }

    public x i(int i10) {
        if (i10 != 0) {
            return new x(this, (Uri) null, i10);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public x j(Uri uri) {
        return new x(this, uri, 0);
    }

    public x k(String str) {
        if (str == null) {
            return new x(this, (Uri) null, 0);
        }
        if (str.trim().length() != 0) {
            return j(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: package-private */
    public Bitmap l(String str) {
        Bitmap i10 = this.f23900f.i(str);
        a0 a0Var = this.f23901g;
        if (i10 != null) {
            a0Var.d();
        } else {
            a0Var.e();
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void m(a aVar) {
        Bitmap l10 = p.a(aVar.f23756e) ? l(aVar.d()) : null;
        if (l10 != null) {
            e eVar = e.MEMORY;
            f(l10, eVar, aVar);
            if (this.f23907m) {
                String d10 = aVar.f23753b.d();
                e0.v("Main", "completed", d10, "from " + eVar);
                return;
            }
            return;
        }
        g(aVar);
        if (this.f23907m) {
            e0.u("Main", "resumed", aVar.f23753b.d());
        }
    }

    /* access modifiers changed from: package-private */
    public void n(a aVar) {
        this.f23899e.h(aVar);
    }

    /* access modifiers changed from: package-private */
    public w o(w wVar) {
        w a10 = this.f23895a.a(wVar);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalStateException("Request transformer " + this.f23895a.getClass().getCanonicalName() + " returned null for " + wVar);
    }
}
