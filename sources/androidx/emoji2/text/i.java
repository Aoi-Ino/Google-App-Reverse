package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.provider.g;
import androidx.emoji2.text.e;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class i extends e.c {

    /* renamed from: j  reason: collision with root package name */
    private static final a f2898j = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return g.a(context, (CancellationSignal) null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) {
            return g.b(context, (CancellationSignal) null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    private static class b implements e.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2899a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.provider.e f2900b;

        /* renamed from: c  reason: collision with root package name */
        private final a f2901c;

        /* renamed from: d  reason: collision with root package name */
        private final Object f2902d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private Handler f2903e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f2904f;

        /* renamed from: g  reason: collision with root package name */
        private ThreadPoolExecutor f2905g;

        /* renamed from: h  reason: collision with root package name */
        e.h f2906h;

        /* renamed from: i  reason: collision with root package name */
        private ContentObserver f2907i;

        /* renamed from: j  reason: collision with root package name */
        private Runnable f2908j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.g.h(context, "Context cannot be null");
            androidx.core.util.g.h(eVar, "FontRequest cannot be null");
            this.f2899a = context.getApplicationContext();
            this.f2900b = eVar;
            this.f2901c = aVar;
        }

        private void b() {
            synchronized (this.f2902d) {
                try {
                    this.f2906h = null;
                    ContentObserver contentObserver = this.f2907i;
                    if (contentObserver != null) {
                        this.f2901c.c(this.f2899a, contentObserver);
                        this.f2907i = null;
                    }
                    Handler handler = this.f2903e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f2908j);
                    }
                    this.f2903e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2905g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2904f = null;
                    this.f2905g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private g.b e() {
            try {
                g.a b10 = this.f2901c.b(this.f2899a, this.f2900b);
                if (b10.c() == 0) {
                    g.b[] b11 = b10.b();
                    if (b11 != null && b11.length != 0) {
                        return b11[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        public void a(e.h hVar) {
            androidx.core.util.g.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f2902d) {
                this.f2906h = hVar;
            }
            d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = e();
            r1 = r0.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
            if (r1 != 2) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
            r2 = r4.f2902d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0020, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0022, code lost:
            if (r1 != 0) goto L_0x0069;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            androidx.core.os.l.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
            r1 = r4.f2901c.a(r4.f2899a, r0);
            r0 = androidx.core.graphics.p.f(r4.f2899a, (android.os.CancellationSignal) null, r0.d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
            if (r0 == null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
            if (r1 == null) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0040, code lost:
            r0 = androidx.emoji2.text.l.b(r1, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            androidx.core.os.l.b();
            r1 = r4.f2902d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0049, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r2 = r4.f2906h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x004c, code lost:
            if (r2 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x004e, code lost:
            r2.b(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0052, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0054, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x005b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0064, code lost:
            throw new java.lang.RuntimeException("Unable to open file.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
            androidx.core.os.l.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0068, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0084, code lost:
            throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r1 + ")");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0087, code lost:
            monitor-enter(r4.f2902d);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            r2 = r4.f2906h;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x008a, code lost:
            if (r2 != null) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x008c, code lost:
            r2.a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0090, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0093, code lost:
            b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0098, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c() {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f2902d
                monitor-enter(r0)
                androidx.emoji2.text.e$h r1 = r4.f2906h     // Catch:{ all -> 0x0009 }
                if (r1 != 0) goto L_0x000c
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                return
            L_0x0009:
                r1 = move-exception
                goto L_0x0099
            L_0x000c:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                androidx.core.provider.g$b r0 = r4.e()     // Catch:{ all -> 0x0020 }
                int r1 = r0.b()     // Catch:{ all -> 0x0020 }
                r2 = 2
                if (r1 != r2) goto L_0x0022
                java.lang.Object r2 = r4.f2902d     // Catch:{ all -> 0x0020 }
                monitor-enter(r2)     // Catch:{ all -> 0x0020 }
                monitor-exit(r2)     // Catch:{ all -> 0x001d }
                goto L_0x0022
            L_0x001d:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x001d }
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0020:
                r0 = move-exception
                goto L_0x0085
            L_0x0022:
                if (r1 != 0) goto L_0x0069
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.os.l.a(r1)     // Catch:{ all -> 0x005b }
                androidx.emoji2.text.i$a r1 = r4.f2901c     // Catch:{ all -> 0x005b }
                android.content.Context r2 = r4.f2899a     // Catch:{ all -> 0x005b }
                android.graphics.Typeface r1 = r1.a(r2, r0)     // Catch:{ all -> 0x005b }
                android.content.Context r2 = r4.f2899a     // Catch:{ all -> 0x005b }
                android.net.Uri r0 = r0.d()     // Catch:{ all -> 0x005b }
                r3 = 0
                java.nio.ByteBuffer r0 = androidx.core.graphics.p.f(r2, r3, r0)     // Catch:{ all -> 0x005b }
                if (r0 == 0) goto L_0x005d
                if (r1 == 0) goto L_0x005d
                androidx.emoji2.text.l r0 = androidx.emoji2.text.l.b(r1, r0)     // Catch:{ all -> 0x005b }
                androidx.core.os.l.b()     // Catch:{ all -> 0x0020 }
                java.lang.Object r1 = r4.f2902d     // Catch:{ all -> 0x0020 }
                monitor-enter(r1)     // Catch:{ all -> 0x0020 }
                androidx.emoji2.text.e$h r2 = r4.f2906h     // Catch:{ all -> 0x0052 }
                if (r2 == 0) goto L_0x0054
                r2.b(r0)     // Catch:{ all -> 0x0052 }
                goto L_0x0054
            L_0x0052:
                r0 = move-exception
                goto L_0x0059
            L_0x0054:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                r4.b()     // Catch:{ all -> 0x0020 }
                goto L_0x0096
            L_0x0059:
                monitor-exit(r1)     // Catch:{ all -> 0x0052 }
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x005b:
                r0 = move-exception
                goto L_0x0065
            L_0x005d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x005b }
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch:{ all -> 0x005b }
                throw r0     // Catch:{ all -> 0x005b }
            L_0x0065:
                androidx.core.os.l.b()     // Catch:{ all -> 0x0020 }
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0069:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0020 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0020 }
                r2.<init>()     // Catch:{ all -> 0x0020 }
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch:{ all -> 0x0020 }
                r2.append(r1)     // Catch:{ all -> 0x0020 }
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch:{ all -> 0x0020 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0020 }
                r0.<init>(r1)     // Catch:{ all -> 0x0020 }
                throw r0     // Catch:{ all -> 0x0020 }
            L_0x0085:
                java.lang.Object r1 = r4.f2902d
                monitor-enter(r1)
                androidx.emoji2.text.e$h r2 = r4.f2906h     // Catch:{ all -> 0x0090 }
                if (r2 == 0) goto L_0x0092
                r2.a(r0)     // Catch:{ all -> 0x0090 }
                goto L_0x0092
            L_0x0090:
                r0 = move-exception
                goto L_0x0097
            L_0x0092:
                monitor-exit(r1)     // Catch:{ all -> 0x0090 }
                r4.b()
            L_0x0096:
                return
            L_0x0097:
                monitor-exit(r1)     // Catch:{ all -> 0x0090 }
                throw r0
            L_0x0099:
                monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.i.b.c():void");
        }

        /* access modifiers changed from: package-private */
        public void d() {
            synchronized (this.f2902d) {
                try {
                    if (this.f2906h != null) {
                        if (this.f2904f == null) {
                            ThreadPoolExecutor b10 = b.b("emojiCompat");
                            this.f2905g = b10;
                            this.f2904f = b10;
                        }
                        this.f2904f.execute(new j(this));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f2902d) {
                this.f2904f = executor;
            }
        }
    }

    public i(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f2898j));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
