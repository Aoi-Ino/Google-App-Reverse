package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.l;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.e;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements g1.a {

    class a implements e {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f2836e;

        a(k kVar) {
            this.f2836e = kVar;
        }

        public void a(s sVar) {
            EmojiCompatInitializer.this.e();
            this.f2836e.d(this);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements e.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2838a;

        class a extends e.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e.h f2839a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f2840b;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2839a = hVar;
                this.f2840b = threadPoolExecutor;
            }

            public void a(Throwable th2) {
                try {
                    this.f2839a.a(th2);
                } finally {
                    this.f2840b.shutdown();
                }
            }

            public void b(l lVar) {
                try {
                    this.f2839a.b(lVar);
                } finally {
                    this.f2840b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f2838a = context.getApplicationContext();
        }

        public void a(e.h hVar) {
            ThreadPoolExecutor b10 = b.b("EmojiCompatInitializer");
            b10.execute(new f(this, hVar, b10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a10 = c.a(this.f2838a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                hVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        public void run() {
            try {
                l.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.h()) {
                    e.b().k();
                }
            } finally {
                l.b();
            }
        }
    }

    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        e.g(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        k d02 = ((s) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).d0();
        d02.a(new a(d02));
    }

    /* access modifiers changed from: package-private */
    public void e() {
        b.d().postDelayed(new d(), 500);
    }
}
