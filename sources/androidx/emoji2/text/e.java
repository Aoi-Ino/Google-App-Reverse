package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class e {

    /* renamed from: n  reason: collision with root package name */
    private static final Object f2846n = new Object();

    /* renamed from: o  reason: collision with root package name */
    private static final Object f2847o = new Object();

    /* renamed from: p  reason: collision with root package name */
    private static volatile e f2848p;

    /* renamed from: a  reason: collision with root package name */
    private final ReadWriteLock f2849a = new ReentrantReadWriteLock();

    /* renamed from: b  reason: collision with root package name */
    private final Set f2850b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f2851c = 3;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f2852d;

    /* renamed from: e  reason: collision with root package name */
    private final b f2853e;

    /* renamed from: f  reason: collision with root package name */
    final g f2854f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f2855g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f2856h;

    /* renamed from: i  reason: collision with root package name */
    final int[] f2857i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f2858j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2859k;

    /* renamed from: l  reason: collision with root package name */
    private final int f2860l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final d f2861m;

    private static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        private volatile h f2862b;

        /* renamed from: c  reason: collision with root package name */
        private volatile l f2863c;

        /* renamed from: androidx.emoji2.text.e$a$a  reason: collision with other inner class name */
        class C0048a extends h {
            C0048a() {
            }

            public void a(Throwable th2) {
                a.this.f2865a.m(th2);
            }

            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            try {
                this.f2865a.f2854f.a(new C0048a());
            } catch (Throwable th2) {
                this.f2865a.m(th2);
            }
        }

        /* access modifiers changed from: package-private */
        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f2862b.h(charSequence, i10, i11, i12, z10);
        }

        /* access modifiers changed from: package-private */
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f2863c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f2865a.f2855g);
        }

        /* access modifiers changed from: package-private */
        public void d(l lVar) {
            if (lVar == null) {
                this.f2865a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f2863c = lVar;
            l lVar2 = this.f2863c;
            i iVar = new i();
            d a10 = this.f2865a.f2861m;
            e eVar = this.f2865a;
            this.f2862b = new h(lVar2, iVar, a10, eVar.f2856h, eVar.f2857i);
            this.f2865a.n();
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        final e f2865a;

        b(e eVar) {
            this.f2865a = eVar;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: package-private */
        public abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10);

        /* access modifiers changed from: package-private */
        public abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final g f2866a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2867b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2868c;

        /* renamed from: d  reason: collision with root package name */
        int[] f2869d;

        /* renamed from: e  reason: collision with root package name */
        Set f2870e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2871f;

        /* renamed from: g  reason: collision with root package name */
        int f2872g = -16711936;

        /* renamed from: h  reason: collision with root package name */
        int f2873h = 0;

        /* renamed from: i  reason: collision with root package name */
        d f2874i = new d();

        protected c(g gVar) {
            androidx.core.util.g.h(gVar, "metadataLoader cannot be null.");
            this.f2866a = gVar;
        }

        /* access modifiers changed from: protected */
        public final g a() {
            return this.f2866a;
        }

        public c b(int i10) {
            this.f2873h = i10;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* renamed from: androidx.emoji2.text.e$e  reason: collision with other inner class name */
    public static abstract class C0049e {
        public void a(Throwable th2) {
        }

        public void b() {
        }
    }

    private static class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final List f2875e;

        /* renamed from: f  reason: collision with root package name */
        private final Throwable f2876f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2877g;

        f(C0049e eVar, int i10) {
            this(Arrays.asList(new C0049e[]{(C0049e) androidx.core.util.g.h(eVar, "initCallback cannot be null")}), i10, (Throwable) null);
        }

        public void run() {
            int size = this.f2875e.size();
            int i10 = 0;
            if (this.f2877g != 1) {
                while (i10 < size) {
                    ((C0049e) this.f2875e.get(i10)).a(this.f2876f);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((C0049e) this.f2875e.get(i10)).b();
                i10++;
            }
        }

        f(Collection collection, int i10) {
            this(collection, i10, (Throwable) null);
        }

        f(Collection collection, int i10, Throwable th2) {
            androidx.core.util.g.h(collection, "initCallbacks cannot be null");
            this.f2875e = new ArrayList(collection);
            this.f2877g = i10;
            this.f2876f = th2;
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th2);

        public abstract void b(l lVar);
    }

    static class i {
        i() {
        }

        /* access modifiers changed from: package-private */
        public i0.b a(g gVar) {
            return new i0.d(gVar);
        }
    }

    private e(c cVar) {
        this.f2855g = cVar.f2867b;
        this.f2856h = cVar.f2868c;
        this.f2857i = cVar.f2869d;
        this.f2858j = cVar.f2871f;
        this.f2859k = cVar.f2872g;
        this.f2854f = cVar.f2866a;
        this.f2860l = cVar.f2873h;
        this.f2861m = cVar.f2874i;
        this.f2852d = new Handler(Looper.getMainLooper());
        o.b bVar = new o.b();
        this.f2850b = bVar;
        Set set = cVar.f2870e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f2870e);
        }
        this.f2853e = new a(this);
        l();
    }

    public static e b() {
        e eVar;
        synchronized (f2846n) {
            eVar = f2848p;
            androidx.core.util.g.i(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        return h.c(inputConnection, editable, i10, i11, z10);
    }

    public static boolean f(Editable editable, int i10, KeyEvent keyEvent) {
        return h.d(editable, i10, keyEvent);
    }

    public static e g(c cVar) {
        e eVar = f2848p;
        if (eVar == null) {
            synchronized (f2846n) {
                try {
                    eVar = f2848p;
                    if (eVar == null) {
                        eVar = new e(cVar);
                        f2848p = eVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return eVar;
    }

    public static boolean h() {
        return f2848p != null;
    }

    private boolean j() {
        return d() == 1;
    }

    /* JADX INFO: finally extract failed */
    private void l() {
        this.f2849a.writeLock().lock();
        try {
            if (this.f2860l == 0) {
                this.f2851c = 0;
            }
            this.f2849a.writeLock().unlock();
            if (d() == 0) {
                this.f2853e.a();
            }
        } catch (Throwable th2) {
            this.f2849a.writeLock().unlock();
            throw th2;
        }
    }

    public int c() {
        return this.f2859k;
    }

    public int d() {
        this.f2849a.readLock().lock();
        try {
            return this.f2851c;
        } finally {
            this.f2849a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f2858j;
    }

    public void k() {
        boolean z10 = true;
        if (this.f2860l != 1) {
            z10 = false;
        }
        androidx.core.util.g.i(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!j()) {
            this.f2849a.writeLock().lock();
            try {
                if (this.f2851c != 0) {
                    this.f2851c = 0;
                    this.f2849a.writeLock().unlock();
                    this.f2853e.a();
                }
            } finally {
                this.f2849a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void m(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f2849a.writeLock().lock();
        try {
            this.f2851c = 2;
            arrayList.addAll(this.f2850b);
            this.f2850b.clear();
            this.f2849a.writeLock().unlock();
            this.f2852d.post(new f(arrayList, this.f2851c, th2));
        } catch (Throwable th3) {
            this.f2849a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f2849a.writeLock().lock();
        try {
            this.f2851c = 1;
            arrayList.addAll(this.f2850b);
            this.f2850b.clear();
            this.f2849a.writeLock().unlock();
            this.f2852d.post(new f((Collection) arrayList, this.f2851c));
        } catch (Throwable th2) {
            this.f2849a.writeLock().unlock();
            throw th2;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i10, int i11) {
        return q(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11, int i12) {
        return r(charSequence, i10, i11, i12, 0);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z10;
        androidx.core.util.g.i(j(), "Not initialized yet");
        androidx.core.util.g.e(i10, "start cannot be negative");
        androidx.core.util.g.e(i11, "end cannot be negative");
        androidx.core.util.g.e(i12, "maxEmojiCount cannot be negative");
        boolean z11 = false;
        androidx.core.util.g.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.g.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.g.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            if (i13 != 2) {
                z11 = this.f2855g;
            }
            z10 = z11;
        } else {
            z10 = true;
        }
        return this.f2853e.b(charSequence, i10, i11, i12, z10);
    }

    public void s(C0049e eVar) {
        androidx.core.util.g.h(eVar, "initCallback cannot be null");
        this.f2849a.writeLock().lock();
        try {
            if (this.f2851c != 1) {
                if (this.f2851c != 2) {
                    this.f2850b.add(eVar);
                }
            }
            this.f2852d.post(new f(eVar, this.f2851c));
        } finally {
            this.f2849a.writeLock().unlock();
        }
    }

    public void t(C0049e eVar) {
        androidx.core.util.g.h(eVar, "initCallback cannot be null");
        this.f2849a.writeLock().lock();
        try {
            this.f2850b.remove(eVar);
        } finally {
            this.f2849a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (j() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f2853e.c(editorInfo);
        }
    }
}
