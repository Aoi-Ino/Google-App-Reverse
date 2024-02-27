package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.v;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.f1;
import androidx.core.os.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class g {

    /* renamed from: e  reason: collision with root package name */
    static v.a f663e = new v.a(new v.b());

    /* renamed from: f  reason: collision with root package name */
    private static int f664f = -100;

    /* renamed from: g  reason: collision with root package name */
    private static i f665g = null;

    /* renamed from: h  reason: collision with root package name */
    private static i f666h = null;

    /* renamed from: i  reason: collision with root package name */
    private static Boolean f667i = null;

    /* renamed from: j  reason: collision with root package name */
    private static boolean f668j = false;

    /* renamed from: k  reason: collision with root package name */
    private static final o.b f669k = new o.b();

    /* renamed from: l  reason: collision with root package name */
    private static final Object f670l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private static final Object f671m = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    g() {
    }

    static void F(g gVar) {
        synchronized (f670l) {
            G(gVar);
        }
    }

    private static void G(g gVar) {
        synchronized (f670l) {
            try {
                Iterator it = f669k.iterator();
                while (it.hasNext()) {
                    g gVar2 = (g) ((WeakReference) it.next()).get();
                    if (gVar2 == gVar || gVar2 == null) {
                        it.remove();
                    }
                }
            } finally {
            }
        }
    }

    public static void I(boolean z10) {
        f1.c(z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void Q(android.content.Context r3) {
        /*
            boolean r0 = v(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = androidx.core.os.a.b()
            if (r0 == 0) goto L_0x001c
            boolean r0 = f668j
            if (r0 != 0) goto L_0x0057
            androidx.appcompat.app.v$a r0 = f663e
            androidx.appcompat.app.f r1 = new androidx.appcompat.app.f
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0057
        L_0x001c:
            java.lang.Object r0 = f671m
            monitor-enter(r0)
            androidx.core.os.i r1 = f665g     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0043
            androidx.core.os.i r1 = f666h     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r3 = androidx.appcompat.app.v.b(r3)     // Catch:{ all -> 0x0032 }
            androidx.core.os.i r3 = androidx.core.os.i.b(r3)     // Catch:{ all -> 0x0032 }
            f666h = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r3 = move-exception
            goto L_0x0058
        L_0x0034:
            androidx.core.os.i r3 = f666h     // Catch:{ all -> 0x0032 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x0032 }
            if (r3 == 0) goto L_0x003e
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x003e:
            androidx.core.os.i r3 = f666h     // Catch:{ all -> 0x0032 }
            f665g = r3     // Catch:{ all -> 0x0032 }
            goto L_0x0056
        L_0x0043:
            androidx.core.os.i r2 = f666h     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0056
            androidx.core.os.i r1 = f665g     // Catch:{ all -> 0x0032 }
            f666h = r1     // Catch:{ all -> 0x0032 }
            java.lang.String r1 = r1.g()     // Catch:{ all -> 0x0032 }
            androidx.appcompat.app.v.a(r3, r1)     // Catch:{ all -> 0x0032 }
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.g.Q(android.content.Context):void");
    }

    static void d(g gVar) {
        synchronized (f670l) {
            G(gVar);
            f669k.add(new WeakReference(gVar));
        }
    }

    public static g h(Activity activity, e eVar) {
        return new h(activity, eVar);
    }

    public static g i(Dialog dialog, e eVar) {
        return new h(dialog, eVar);
    }

    public static i k() {
        if (androidx.core.os.a.b()) {
            Object p10 = p();
            if (p10 != null) {
                return i.i(b.a(p10));
            }
        } else {
            i iVar = f665g;
            if (iVar != null) {
                return iVar;
            }
        }
        return i.d();
    }

    public static int m() {
        return f664f;
    }

    static Object p() {
        Context l10;
        Iterator it = f669k.iterator();
        while (it.hasNext()) {
            g gVar = (g) ((WeakReference) it.next()).get();
            if (gVar != null && (l10 = gVar.l()) != null) {
                return l10.getSystemService("locale");
            }
        }
        return null;
    }

    static i r() {
        return f665g;
    }

    static boolean v(Context context) {
        if (f667i == null) {
            try {
                Bundle bundle = t.a(context).metaData;
                if (bundle != null) {
                    f667i = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f667i = Boolean.FALSE;
            }
        }
        return f667i.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void w(Context context) {
        v.c(context);
        f668j = true;
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E();

    public abstract boolean H(int i10);

    public abstract void J(int i10);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void N(Toolbar toolbar);

    public abstract void O(int i10);

    public abstract void P(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i10);

    public abstract Context l();

    public abstract b n();

    public abstract int o();

    public abstract MenuInflater q();

    public abstract a s();

    public abstract void t();

    public abstract void u();

    public abstract void x(Configuration configuration);

    public abstract void y(Bundle bundle);

    public abstract void z();
}
