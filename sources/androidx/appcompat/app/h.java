package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f1;
import androidx.appcompat.widget.g1;
import androidx.appcompat.widget.v0;
import androidx.core.content.res.h;
import androidx.core.view.c0;
import androidx.core.view.k1;
import androidx.core.view.m0;
import androidx.core.view.p;
import androidx.core.view.s0;
import androidx.core.view.t0;
import androidx.core.view.u0;
import androidx.lifecycle.k;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

class h extends g implements g.a, LayoutInflater.Factory2 {

    /* renamed from: n0  reason: collision with root package name */
    private static final o.g f672n0 = new o.g();

    /* renamed from: o0  reason: collision with root package name */
    private static final boolean f673o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    private static final int[] f674p0 = {16842836};

    /* renamed from: q0  reason: collision with root package name */
    private static final boolean f675q0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: r0  reason: collision with root package name */
    private static final boolean f676r0 = true;
    PopupWindow A;
    Runnable B;
    s0 C;
    private boolean D;
    private boolean E;
    ViewGroup F;
    private TextView G;
    private View H;
    private boolean I;
    private boolean J;
    boolean K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    private boolean P;
    private u[] Q;
    private u R;
    private boolean S;
    private boolean T;
    private boolean U;
    boolean V;
    private Configuration W;
    private int X;
    private int Y;
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f677a0;

    /* renamed from: b0  reason: collision with root package name */
    private q f678b0;

    /* renamed from: c0  reason: collision with root package name */
    private q f679c0;

    /* renamed from: d0  reason: collision with root package name */
    boolean f680d0;

    /* renamed from: e0  reason: collision with root package name */
    int f681e0;

    /* renamed from: f0  reason: collision with root package name */
    private final Runnable f682f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f683g0;

    /* renamed from: h0  reason: collision with root package name */
    private Rect f684h0;

    /* renamed from: i0  reason: collision with root package name */
    private Rect f685i0;

    /* renamed from: j0  reason: collision with root package name */
    private s f686j0;

    /* renamed from: k0  reason: collision with root package name */
    private w f687k0;

    /* renamed from: l0  reason: collision with root package name */
    private OnBackInvokedDispatcher f688l0;

    /* renamed from: m0  reason: collision with root package name */
    private OnBackInvokedCallback f689m0;

    /* renamed from: n  reason: collision with root package name */
    final Object f690n;

    /* renamed from: o  reason: collision with root package name */
    final Context f691o;

    /* renamed from: p  reason: collision with root package name */
    Window f692p;

    /* renamed from: q  reason: collision with root package name */
    private o f693q;

    /* renamed from: r  reason: collision with root package name */
    final e f694r;

    /* renamed from: s  reason: collision with root package name */
    a f695s;

    /* renamed from: t  reason: collision with root package name */
    MenuInflater f696t;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f697u;

    /* renamed from: v  reason: collision with root package name */
    private d0 f698v;

    /* renamed from: w  reason: collision with root package name */
    private C0014h f699w;

    /* renamed from: x  reason: collision with root package name */
    private v f700x;

    /* renamed from: y  reason: collision with root package name */
    androidx.appcompat.view.b f701y;

    /* renamed from: z  reason: collision with root package name */
    ActionBarContextView f702z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.f681e0 & 1) != 0) {
                hVar.i0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f681e0 & 4096) != 0) {
                hVar2.i0(108);
            }
            h hVar3 = h.this;
            hVar3.f680d0 = false;
            hVar3.f681e0 = 0;
        }
    }

    class b implements c0 {
        b() {
        }

        public k1 a(View view, k1 k1Var) {
            int l10 = k1Var.l();
            int f12 = h.this.f1(k1Var, (Rect) null);
            if (l10 != f12) {
                k1Var = k1Var.q(k1Var.j(), f12, k1Var.k(), k1Var.i());
            }
            return m0.c0(view, k1Var);
        }
    }

    class c implements ContentFrameLayout.a {
        c() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            h.this.g0();
        }
    }

    class d implements Runnable {

        class a extends u0 {
            a() {
            }

            public void b(View view) {
                h.this.f702z.setAlpha(1.0f);
                h.this.C.h((t0) null);
                h.this.C = null;
            }

            public void c(View view) {
                h.this.f702z.setVisibility(0);
            }
        }

        d() {
        }

        public void run() {
            h hVar = h.this;
            hVar.A.showAtLocation(hVar.f702z, 55, 0, 0);
            h.this.j0();
            if (h.this.U0()) {
                h.this.f702z.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.C = m0.e(hVar2.f702z).b(1.0f);
                h.this.C.h(new a());
                return;
            }
            h.this.f702z.setAlpha(1.0f);
            h.this.f702z.setVisibility(0);
        }
    }

    class e extends u0 {
        e() {
        }

        public void b(View view) {
            h.this.f702z.setAlpha(1.0f);
            h.this.C.h((t0) null);
            h.this.C = null;
        }

        public void c(View view) {
            h.this.f702z.setVisibility(0);
            if (h.this.f702z.getParent() instanceof View) {
                m0.n0((View) h.this.f702z.getParent());
            }
        }
    }

    private class f implements b {
        f() {
        }

        public void a(Drawable drawable, int i10) {
            a s10 = h.this.s();
            if (s10 != null) {
                s10.v(drawable);
                s10.u(i10);
            }
        }

        public Context b() {
            return h.this.o0();
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* renamed from: androidx.appcompat.app.h$h  reason: collision with other inner class name */
    private final class C0014h implements m.a {
        C0014h() {
        }

        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
            h.this.Z(gVar);
        }

        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback v02 = h.this.v0();
            if (v02 == null) {
                return true;
            }
            v02.onMenuOpened(108, gVar);
            return true;
        }
    }

    class i implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private b.a f711a;

        class a extends u0 {
            a() {
            }

            public void b(View view) {
                h.this.f702z.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.A;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f702z.getParent() instanceof View) {
                    m0.n0((View) h.this.f702z.getParent());
                }
                h.this.f702z.k();
                h.this.C.h((t0) null);
                h hVar2 = h.this;
                hVar2.C = null;
                m0.n0(hVar2.F);
            }
        }

        public i(b.a aVar) {
            this.f711a = aVar;
        }

        public boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            m0.n0(h.this.F);
            return this.f711a.a(bVar, menu);
        }

        public void b(androidx.appcompat.view.b bVar) {
            this.f711a.b(bVar);
            h hVar = h.this;
            if (hVar.A != null) {
                hVar.f692p.getDecorView().removeCallbacks(h.this.B);
            }
            h hVar2 = h.this;
            if (hVar2.f702z != null) {
                hVar2.j0();
                h hVar3 = h.this;
                hVar3.C = m0.e(hVar3.f702z).b(0.0f);
                h.this.C.h(new a());
            }
            h hVar4 = h.this;
            e eVar = hVar4.f694r;
            if (eVar != null) {
                eVar.B(hVar4.f701y);
            }
            h hVar5 = h.this;
            hVar5.f701y = null;
            m0.n0(hVar5.F);
            h.this.d1();
        }

        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f711a.c(bVar, menuItem);
        }

        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f711a.d(bVar, menu);
        }
    }

    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        static androidx.core.os.i b(Configuration configuration) {
            return androidx.core.os.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(androidx.core.os.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.g()));
        }

        static void d(Configuration configuration, androidx.core.os.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.g()));
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 3);
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode = configuration3.colorMode | (configuration2.colorMode & 12);
            }
        }
    }

    static class n {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, h hVar) {
            Objects.requireNonNull(hVar);
            p pVar = new p(hVar);
            m.a(obj).registerOnBackInvokedCallback(1000000, pVar);
            return pVar;
        }

        static void c(Object obj, Object obj2) {
            m.a(obj).unregisterOnBackInvokedCallback(l.a(obj2));
        }
    }

    class o extends androidx.appcompat.view.i {

        /* renamed from: f  reason: collision with root package name */
        private g f714f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f715g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f716h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f717i;

        o(Window.Callback callback) {
            super(callback);
        }

        /* JADX INFO: finally extract failed */
        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f716h = true;
                boolean dispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                this.f716h = false;
                return dispatchKeyEvent;
            } catch (Throwable th2) {
                this.f716h = false;
                throw th2;
            }
        }

        /* JADX INFO: finally extract failed */
        public void c(Window.Callback callback) {
            try {
                this.f715g = true;
                callback.onContentChanged();
                this.f715g = false;
            } catch (Throwable th2) {
                this.f715g = false;
                throw th2;
            }
        }

        /* JADX INFO: finally extract failed */
        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f717i = true;
                callback.onPanelClosed(i10, menu);
                this.f717i = false;
            } catch (Throwable th2) {
                this.f717i = false;
                throw th2;
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f716h ? a().dispatchKeyEvent(keyEvent) : h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        /* access modifiers changed from: package-private */
        public void e(g gVar) {
            this.f714f = gVar;
        }

        /* access modifiers changed from: package-private */
        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f691o, callback);
            androidx.appcompat.view.b X0 = h.this.X0(aVar);
            if (X0 != null) {
                return aVar.e(X0);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.f715g) {
                a().onContentChanged();
            }
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.onCreatePanelView(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View onCreatePanelView(int r2) {
            /*
                r1 = this;
                androidx.appcompat.app.h$g r0 = r1.f714f
                if (r0 == 0) goto L_0x000b
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto L_0x000b
                return r0
            L_0x000b:
                android.view.View r2 = super.onCreatePanelView(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.o.onCreatePanelView(int):android.view.View");
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.J0(i10);
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            if (this.f717i) {
                a().onPanelClosed(i10, menu);
                return;
            }
            super.onPanelClosed(i10, menu);
            h.this.K0(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i10 == 0 && gVar == null) {
                return false;
            }
            boolean z10 = true;
            if (gVar != null) {
                gVar.e0(true);
            }
            g gVar2 = this.f714f;
            if (gVar2 == null || !gVar2.a(i10)) {
                z10 = false;
            }
            if (!z10) {
                z10 = super.onPreparePanel(i10, view, menu);
            }
            if (gVar != null) {
                gVar.e0(false);
            }
            return z10;
        }

        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.g gVar;
            u t02 = h.this.t0(0, true);
            if (t02 == null || (gVar = t02.f736j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (!h.this.B0() || i10 != 0) ? super.onWindowStartingActionMode(callback, i10) : f(callback);
        }
    }

    private class p extends q {

        /* renamed from: c  reason: collision with root package name */
        private final PowerManager f719c;

        p(Context context) {
            super();
            this.f719c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return k.a(this.f719c) ? 2 : 1;
        }

        public void d() {
            h.this.T();
        }
    }

    abstract class q {

        /* renamed from: a  reason: collision with root package name */
        private BroadcastReceiver f721a;

        class a extends BroadcastReceiver {
            a() {
            }

            public void onReceive(Context context, Intent intent) {
                q.this.d();
            }
        }

        q() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            BroadcastReceiver broadcastReceiver = this.f721a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f691o.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f721a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public abstract IntentFilter b();

        /* access modifiers changed from: package-private */
        public abstract int c();

        /* access modifiers changed from: package-private */
        public abstract void d();

        /* access modifiers changed from: package-private */
        public void e() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f721a == null) {
                    this.f721a = new a();
                }
                h.this.f691o.registerReceiver(this.f721a, b10);
            }
        }
    }

    private class r extends q {

        /* renamed from: c  reason: collision with root package name */
        private final b0 f724c;

        r(b0 b0Var) {
            super();
            this.f724c = b0Var;
        }

        /* access modifiers changed from: package-private */
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f724c.d() ? 2 : 1;
        }

        public void d() {
            h.this.T();
        }
    }

    private static class s {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.b0(0);
            return true;
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.b(getContext(), i10));
        }
    }

    protected static final class u {

        /* renamed from: a  reason: collision with root package name */
        int f727a;

        /* renamed from: b  reason: collision with root package name */
        int f728b;

        /* renamed from: c  reason: collision with root package name */
        int f729c;

        /* renamed from: d  reason: collision with root package name */
        int f730d;

        /* renamed from: e  reason: collision with root package name */
        int f731e;

        /* renamed from: f  reason: collision with root package name */
        int f732f;

        /* renamed from: g  reason: collision with root package name */
        ViewGroup f733g;

        /* renamed from: h  reason: collision with root package name */
        View f734h;

        /* renamed from: i  reason: collision with root package name */
        View f735i;

        /* renamed from: j  reason: collision with root package name */
        androidx.appcompat.view.menu.g f736j;

        /* renamed from: k  reason: collision with root package name */
        androidx.appcompat.view.menu.e f737k;

        /* renamed from: l  reason: collision with root package name */
        Context f738l;

        /* renamed from: m  reason: collision with root package name */
        boolean f739m;

        /* renamed from: n  reason: collision with root package name */
        boolean f740n;

        /* renamed from: o  reason: collision with root package name */
        boolean f741o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f742p;

        /* renamed from: q  reason: collision with root package name */
        boolean f743q = false;

        /* renamed from: r  reason: collision with root package name */
        boolean f744r;

        /* renamed from: s  reason: collision with root package name */
        Bundle f745s;

        u(int i10) {
            this.f727a = i10;
        }

        /* access modifiers changed from: package-private */
        public androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f736j == null) {
                return null;
            }
            if (this.f737k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f738l, f.g.abc_list_menu_item_layout);
                this.f737k = eVar;
                eVar.n(aVar);
                this.f736j.b(this.f737k);
            }
            return this.f737k.d(this.f733g);
        }

        public boolean b() {
            if (this.f734h == null) {
                return false;
            }
            if (this.f735i != null) {
                return true;
            }
            return this.f737k.a().getCount() > 0;
        }

        /* access modifiers changed from: package-private */
        public void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f736j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.Q(this.f737k);
                }
                this.f736j = gVar;
                if (gVar != null && (eVar = this.f737k) != null) {
                    gVar.b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(f.a.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(f.a.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = f.i.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i11, true);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f738l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f11299y0);
            this.f728b = obtainStyledAttributes.getResourceId(f.j.B0, 0);
            this.f732f = obtainStyledAttributes.getResourceId(f.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    private final class v implements m.a {
        v() {
        }

        public void b(androidx.appcompat.view.menu.g gVar, boolean z10) {
            androidx.appcompat.view.menu.g F = gVar.F();
            boolean z11 = F != gVar;
            h hVar = h.this;
            if (z11) {
                gVar = F;
            }
            u m02 = hVar.m0(gVar);
            if (m02 == null) {
                return;
            }
            if (z11) {
                h.this.Y(m02.f727a, m02, F);
                h.this.c0(m02, true);
                return;
            }
            h.this.c0(m02, z10);
        }

        public boolean c(androidx.appcompat.view.menu.g gVar) {
            Window.Callback v02;
            if (gVar != gVar.F()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.K || (v02 = hVar.v0()) == null || h.this.V) {
                return true;
            }
            v02.onMenuOpened(108, gVar);
            return true;
        }
    }

    h(Activity activity, e eVar) {
        this(activity, (Window) null, eVar, activity);
    }

    private void A0(int i10) {
        this.f681e0 = (1 << i10) | this.f681e0;
        if (!this.f680d0) {
            m0.i0(this.f692p.getDecorView(), this.f682f0);
            this.f680d0 = true;
        }
    }

    private boolean F0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        u t02 = t0(i10, true);
        if (!t02.f741o) {
            return P0(t02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (P0(r2, r6) != false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean I0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f701y
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.h$u r2 = r4.t0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.d0 r5 = r4.f698v
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.g()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f691o
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.d0 r5 = r4.f698v
            boolean r5 = r5.b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.V
            if (r5 != 0) goto L_0x0060
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L_0x0060
            androidx.appcompat.widget.d0 r5 = r4.f698v
            boolean r0 = r5.f()
            goto L_0x0066
        L_0x003c:
            androidx.appcompat.widget.d0 r5 = r4.f698v
            boolean r0 = r5.e()
            goto L_0x0066
        L_0x0043:
            boolean r5 = r2.f741o
            if (r5 != 0) goto L_0x0062
            boolean r3 = r2.f740n
            if (r3 == 0) goto L_0x004c
            goto L_0x0062
        L_0x004c:
            boolean r5 = r2.f739m
            if (r5 == 0) goto L_0x0060
            boolean r5 = r2.f744r
            if (r5 == 0) goto L_0x005c
            r2.f739m = r1
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L_0x0060
        L_0x005c:
            r4.M0(r2, r6)
            goto L_0x0066
        L_0x0060:
            r0 = r1
            goto L_0x0066
        L_0x0062:
            r4.c0(r2, r0)
            r0 = r5
        L_0x0066:
            if (r0 == 0) goto L_0x0083
            android.content.Context r5 = r4.f691o
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007c
            r5.playSoundEffect(r1)
            goto L_0x0083
        L_0x007c:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.I0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M0(androidx.appcompat.app.h.u r12, android.view.KeyEvent r13) {
        /*
            r11 = this;
            boolean r0 = r12.f741o
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r11.V
            if (r0 == 0) goto L_0x000a
            goto L_0x00f3
        L_0x000a:
            int r0 = r12.f727a
            if (r0 != 0) goto L_0x0020
            android.content.Context r0 = r11.f691o
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r1 = 4
            if (r0 != r1) goto L_0x0020
            return
        L_0x0020:
            android.view.Window$Callback r0 = r11.v0()
            r1 = 1
            if (r0 == 0) goto L_0x0035
            int r2 = r12.f727a
            androidx.appcompat.view.menu.g r3 = r12.f736j
            boolean r0 = r0.onMenuOpened(r2, r3)
            if (r0 != 0) goto L_0x0035
            r11.c0(r12, r1)
            return
        L_0x0035:
            android.content.Context r0 = r11.f691o
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0042
            return
        L_0x0042:
            boolean r13 = r11.P0(r12, r13)
            if (r13 != 0) goto L_0x0049
            return
        L_0x0049:
            android.view.ViewGroup r13 = r12.f733g
            r2 = -2
            if (r13 == 0) goto L_0x0064
            boolean r3 = r12.f743q
            if (r3 == 0) goto L_0x0053
            goto L_0x0064
        L_0x0053:
            android.view.View r13 = r12.f735i
            if (r13 == 0) goto L_0x00c6
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 == 0) goto L_0x00c6
            int r13 = r13.width
            r3 = -1
            if (r13 != r3) goto L_0x00c6
            r4 = r3
            goto L_0x00c7
        L_0x0064:
            if (r13 != 0) goto L_0x0071
            boolean r13 = r11.y0(r12)
            if (r13 == 0) goto L_0x0070
            android.view.ViewGroup r13 = r12.f733g
            if (r13 != 0) goto L_0x0080
        L_0x0070:
            return
        L_0x0071:
            boolean r3 = r12.f743q
            if (r3 == 0) goto L_0x0080
            int r13 = r13.getChildCount()
            if (r13 <= 0) goto L_0x0080
            android.view.ViewGroup r13 = r12.f733g
            r13.removeAllViews()
        L_0x0080:
            boolean r13 = r11.x0(r12)
            if (r13 == 0) goto L_0x00f1
            boolean r13 = r12.b()
            if (r13 != 0) goto L_0x008d
            goto L_0x00f1
        L_0x008d:
            android.view.View r13 = r12.f734h
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            if (r13 != 0) goto L_0x009a
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r2, r2)
        L_0x009a:
            int r3 = r12.f728b
            android.view.ViewGroup r4 = r12.f733g
            r4.setBackgroundResource(r3)
            android.view.View r3 = r12.f734h
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x00b2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r4 = r12.f734h
            r3.removeView(r4)
        L_0x00b2:
            android.view.ViewGroup r3 = r12.f733g
            android.view.View r4 = r12.f734h
            r3.addView(r4, r13)
            android.view.View r13 = r12.f734h
            boolean r13 = r13.hasFocus()
            if (r13 != 0) goto L_0x00c6
            android.view.View r13 = r12.f734h
            r13.requestFocus()
        L_0x00c6:
            r4 = r2
        L_0x00c7:
            r13 = 0
            r12.f740n = r13
            android.view.WindowManager$LayoutParams r13 = new android.view.WindowManager$LayoutParams
            r5 = -2
            int r6 = r12.f730d
            int r7 = r12.f731e
            r8 = 1002(0x3ea, float:1.404E-42)
            r9 = 8519680(0x820000, float:1.1938615E-38)
            r10 = -3
            r3 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r12.f729c
            r13.gravity = r2
            int r2 = r12.f732f
            r13.windowAnimations = r2
            android.view.ViewGroup r2 = r12.f733g
            r0.addView(r2, r13)
            r12.f741o = r1
            int r12 = r12.f727a
            if (r12 != 0) goto L_0x00f0
            r11.d1()
        L_0x00f0:
            return
        L_0x00f1:
            r12.f743q = r1
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.M0(androidx.appcompat.app.h$u, android.view.KeyEvent):void");
    }

    private boolean O0(u uVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((uVar.f739m || P0(uVar, keyEvent)) && (gVar = uVar.f736j) != null) {
            z10 = gVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f698v == null) {
            c0(uVar, true);
        }
        return z10;
    }

    private boolean P0(u uVar, KeyEvent keyEvent) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        if (this.V) {
            return false;
        }
        if (uVar.f739m) {
            return true;
        }
        u uVar2 = this.R;
        if (!(uVar2 == null || uVar2 == uVar)) {
            c0(uVar2, false);
        }
        Window.Callback v02 = v0();
        if (v02 != null) {
            uVar.f735i = v02.onCreatePanelView(uVar.f727a);
        }
        int i10 = uVar.f727a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (d0Var3 = this.f698v) != null) {
            d0Var3.c();
        }
        if (uVar.f735i == null && (!z10 || !(N0() instanceof z))) {
            androidx.appcompat.view.menu.g gVar = uVar.f736j;
            if (gVar == null || uVar.f744r) {
                if (gVar == null && (!z0(uVar) || uVar.f736j == null)) {
                    return false;
                }
                if (z10 && this.f698v != null) {
                    if (this.f699w == null) {
                        this.f699w = new C0014h();
                    }
                    this.f698v.a(uVar.f736j, this.f699w);
                }
                uVar.f736j.h0();
                if (!v02.onCreatePanelMenu(uVar.f727a, uVar.f736j)) {
                    uVar.c((androidx.appcompat.view.menu.g) null);
                    if (z10 && (d0Var2 = this.f698v) != null) {
                        d0Var2.a((Menu) null, this.f699w);
                    }
                    return false;
                }
                uVar.f744r = false;
            }
            uVar.f736j.h0();
            Bundle bundle = uVar.f745s;
            if (bundle != null) {
                uVar.f736j.R(bundle);
                uVar.f745s = null;
            }
            if (!v02.onPreparePanel(0, uVar.f735i, uVar.f736j)) {
                if (z10 && (d0Var = this.f698v) != null) {
                    d0Var.a((Menu) null, this.f699w);
                }
                uVar.f736j.g0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            uVar.f742p = z11;
            uVar.f736j.setQwertyMode(z11);
            uVar.f736j.g0();
        }
        uVar.f739m = true;
        uVar.f740n = false;
        this.R = uVar;
        return true;
    }

    private void Q0(boolean z10) {
        d0 d0Var = this.f698v;
        if (d0Var == null || !d0Var.g() || (ViewConfiguration.get(this.f691o).hasPermanentMenuKey() && !this.f698v.d())) {
            u t02 = t0(0, true);
            t02.f743q = true;
            c0(t02, false);
            M0(t02, (KeyEvent) null);
            return;
        }
        Window.Callback v02 = v0();
        if (this.f698v.b() && z10) {
            this.f698v.e();
            if (!this.V) {
                v02.onPanelClosed(108, t0(0, true).f736j);
            }
        } else if (v02 != null && !this.V) {
            if (this.f680d0 && (this.f681e0 & 1) != 0) {
                this.f692p.getDecorView().removeCallbacks(this.f682f0);
                this.f682f0.run();
            }
            u t03 = t0(0, true);
            androidx.appcompat.view.menu.g gVar = t03.f736j;
            if (gVar != null && !t03.f744r && v02.onPreparePanel(0, t03.f735i, gVar)) {
                v02.onMenuOpened(108, t03.f736j);
                this.f698v.f();
            }
        }
    }

    private boolean R(boolean z10) {
        return S(z10, true);
    }

    private int R0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i10 != 9) {
            return i10;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    private boolean S(boolean z10, boolean z11) {
        if (this.V) {
            return false;
        }
        int X2 = X();
        int C0 = C0(this.f691o, X2);
        androidx.core.os.i W2 = Build.VERSION.SDK_INT < 33 ? W(this.f691o) : null;
        if (!z11 && W2 != null) {
            W2 = s0(this.f691o.getResources().getConfiguration());
        }
        boolean c12 = c1(C0, W2, z10);
        if (X2 == 0) {
            r0(this.f691o).e();
        } else {
            q qVar = this.f678b0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (X2 == 3) {
            q0(this.f691o).e();
        } else {
            q qVar2 = this.f679c0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return c12;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.F.findViewById(16908290);
        View decorView = this.f692p.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f691o.obtainStyledAttributes(f.j.f11299y0);
        obtainStyledAttributes.getValue(f.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(f.j.L0, contentFrameLayout.getMinWidthMinor());
        int i10 = f.j.I0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = f.j.J0;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = f.j.G0;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = f.j.H0;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f692p == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                o oVar = new o(callback);
                this.f693q = oVar;
                window.setCallback(oVar);
                v0 u10 = v0.u(this.f691o, (AttributeSet) null, f674p0);
                Drawable h10 = u10.h(0);
                if (h10 != null) {
                    window.setBackgroundDrawable(h10);
                }
                u10.w();
                this.f692p = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f688l0 == null) {
                    M((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f692p.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || m0.T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i10 = this.X;
        return i10 != -100 ? i10 : g.m();
    }

    private void Z0() {
        if (this.E) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void a0() {
        q qVar = this.f678b0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.f679c0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    private d a1() {
        Context context = this.f691o;
        while (context != null) {
            if (!(context instanceof d)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (d) context;
            }
        }
        return null;
    }

    private void b1(Configuration configuration) {
        Activity activity = (Activity) this.f690n;
        if (activity instanceof androidx.lifecycle.s) {
            if (!((androidx.lifecycle.s) activity).d0().b().b(k.b.CREATED)) {
                return;
            }
        } else if (!this.U || this.V) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c1(int r9, androidx.core.os.i r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f691o
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.d0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f691o
            int r1 = r8.p0(r1)
            android.content.res.Configuration r2 = r8.W
            if (r2 != 0) goto L_0x001f
            android.content.Context r2 = r8.f691o
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L_0x001f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.i r2 = r8.s0(r2)
            r5 = 0
            if (r10 != 0) goto L_0x0030
            r0 = r5
            goto L_0x0034
        L_0x0030:
            androidx.core.os.i r0 = r8.s0(r0)
        L_0x0034:
            r6 = 0
            if (r3 == r4) goto L_0x003a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x003b
        L_0x003a:
            r3 = r6
        L_0x003b:
            if (r0 == 0) goto L_0x0045
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L_0x0045
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L_0x0045:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L_0x006f
            if (r11 == 0) goto L_0x006f
            boolean r11 = r8.T
            if (r11 == 0) goto L_0x006f
            boolean r11 = f675q0
            if (r11 != 0) goto L_0x0058
            boolean r11 = r8.U
            if (r11 == 0) goto L_0x006f
        L_0x0058:
            java.lang.Object r11 = r8.f690n
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L_0x006f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L_0x006f
            java.lang.Object r11 = r8.f690n
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.r(r11)
            r11 = r7
            goto L_0x0070
        L_0x006f:
            r11 = r6
        L_0x0070:
            if (r11 != 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
            r11 = r3 & r1
            if (r11 != r3) goto L_0x0079
            r6 = r7
        L_0x0079:
            r8.e1(r4, r0, r6, r5)
            goto L_0x007e
        L_0x007d:
            r7 = r11
        L_0x007e:
            if (r7 == 0) goto L_0x009a
            java.lang.Object r11 = r8.f690n
            boolean r1 = r11 instanceof androidx.appcompat.app.d
            if (r1 == 0) goto L_0x009a
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x008f
            androidx.appcompat.app.d r11 = (androidx.appcompat.app.d) r11
            r11.W0(r9)
        L_0x008f:
            r9 = r3 & 4
            if (r9 == 0) goto L_0x009a
            java.lang.Object r9 = r8.f690n
            androidx.appcompat.app.d r9 = (androidx.appcompat.app.d) r9
            r9.V0(r10)
        L_0x009a:
            if (r7 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x00af
            android.content.Context r9 = r8.f691o
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.i r9 = r8.s0(r9)
            r8.T0(r9)
        L_0x00af:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.c1(int, androidx.core.os.i, boolean):boolean");
    }

    private Configuration d0(Context context, int i10, androidx.core.os.i iVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        return configuration2;
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f691o.obtainStyledAttributes(f.j.f11299y0);
        int i10 = f.j.D0;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(f.j.M0, false)) {
                H(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                H(108);
            }
            if (obtainStyledAttributes.getBoolean(f.j.E0, false)) {
                H(109);
            }
            if (obtainStyledAttributes.getBoolean(f.j.F0, false)) {
                H(10);
            }
            this.N = obtainStyledAttributes.getBoolean(f.j.f11304z0, false);
            obtainStyledAttributes.recycle();
            l0();
            this.f692p.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f691o);
            if (this.O) {
                viewGroup = (ViewGroup) from.inflate(this.M ? f.g.abc_screen_simple_overlay_action_mode : f.g.abc_screen_simple, (ViewGroup) null);
            } else if (this.N) {
                viewGroup = (ViewGroup) from.inflate(f.g.abc_dialog_title_material, (ViewGroup) null);
                this.L = false;
                this.K = false;
            } else if (this.K) {
                TypedValue typedValue = new TypedValue();
                this.f691o.getTheme().resolveAttribute(f.a.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f691o, typedValue.resourceId) : this.f691o).inflate(f.g.abc_screen_toolbar, (ViewGroup) null);
                d0 d0Var = (d0) viewGroup.findViewById(f.f.decor_content_parent);
                this.f698v = d0Var;
                d0Var.setWindowCallback(v0());
                if (this.L) {
                    this.f698v.k(109);
                }
                if (this.I) {
                    this.f698v.k(2);
                }
                if (this.J) {
                    this.f698v.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                m0.F0(viewGroup, new b());
                if (this.f698v == null) {
                    this.G = (TextView) viewGroup.findViewById(f.f.title);
                }
                g1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(f.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f692p.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f692p.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.K + ", windowActionBarOverlay: " + this.L + ", android:windowIsFloating: " + this.N + ", windowActionModeOverlay: " + this.M + ", windowNoTitle: " + this.O + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void e1(int i10, androidx.core.os.i iVar, boolean z10, Configuration configuration) {
        Resources resources = this.f691o.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & -49);
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            y.a(resources);
        }
        int i11 = this.Y;
        if (i11 != 0) {
            this.f691o.setTheme(i11);
            this.f691o.getTheme().applyStyle(this.Y, true);
        }
        if (z10 && (this.f690n instanceof Activity)) {
            b1(configuration2);
        }
    }

    private void g1(View view) {
        Context context;
        int i10;
        if ((m0.M(view) & 8192) != 0) {
            context = this.f691o;
            i10 = f.c.abc_decor_view_status_guard_light;
        } else {
            context = this.f691o;
            i10 = f.c.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(androidx.core.content.a.c(context, i10));
    }

    private void k0() {
        if (!this.E) {
            this.F = e0();
            CharSequence u02 = u0();
            if (!TextUtils.isEmpty(u02)) {
                d0 d0Var = this.f698v;
                if (d0Var != null) {
                    d0Var.setWindowTitle(u02);
                } else if (N0() != null) {
                    N0().y(u02);
                } else {
                    TextView textView = this.G;
                    if (textView != null) {
                        textView.setText(u02);
                    }
                }
            }
            U();
            L0(this.F);
            this.E = true;
            u t02 = t0(0, false);
            if (this.V) {
                return;
            }
            if (t02 == null || t02.f736j == null) {
                A0(108);
            }
        }
    }

    private void l0() {
        if (this.f692p == null) {
            Object obj = this.f690n;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f692p == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            l.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            j.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int p0(Context context) {
        if (!this.f677a0 && (this.f690n instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f690n.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.Z = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.Z = 0;
            }
        }
        this.f677a0 = true;
        return this.Z;
    }

    private q q0(Context context) {
        if (this.f679c0 == null) {
            this.f679c0 = new p(context);
        }
        return this.f679c0;
    }

    private q r0(Context context) {
        if (this.f678b0 == null) {
            this.f678b0 = new r(b0.a(context));
        }
        return this.f678b0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w0() {
        /*
            r3 = this;
            r3.k0()
            boolean r0 = r3.K
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f695s
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f690n
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.c0 r0 = new androidx.appcompat.app.c0
            java.lang.Object r1 = r3.f690n
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.L
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f695s = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.c0 r0 = new androidx.appcompat.app.c0
            java.lang.Object r1 = r3.f690n
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f695s
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.f683g0
            r0.r(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.w0():void");
    }

    private boolean x0(u uVar) {
        View view = uVar.f735i;
        if (view != null) {
            uVar.f734h = view;
            return true;
        } else if (uVar.f736j == null) {
            return false;
        } else {
            if (this.f700x == null) {
                this.f700x = new v();
            }
            View view2 = (View) uVar.a(this.f700x);
            uVar.f734h = view2;
            return view2 != null;
        }
    }

    private boolean y0(u uVar) {
        uVar.d(o0());
        uVar.f733g = new t(uVar.f738l);
        uVar.f729c = 81;
        return true;
    }

    private boolean z0(u uVar) {
        Resources.Theme theme;
        Context context = this.f691o;
        int i10 = uVar.f727a;
        if ((i10 == 0 || i10 == 108) && this.f698v != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(f.a.actionBarTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme2.resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.V(this);
        uVar.c(gVar);
        return true;
    }

    public void A(Bundle bundle) {
        k0();
    }

    public void B() {
        a s10 = s();
        if (s10 != null) {
            s10.w(true);
        }
    }

    public boolean B0() {
        return this.D;
    }

    public void C(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int C0(Context context, int i10) {
        q r02;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        r02 = q0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                r02 = r0(context);
            }
            return r02.c();
        }
        return i10;
    }

    public void D() {
        S(true, false);
    }

    /* access modifiers changed from: package-private */
    public boolean D0() {
        boolean z10 = this.S;
        this.S = false;
        u t02 = t0(0, false);
        if (t02 == null || !t02.f741o) {
            androidx.appcompat.view.b bVar = this.f701y;
            if (bVar != null) {
                bVar.c();
                return true;
            }
            a s10 = s();
            return s10 != null && s10.h();
        }
        if (!z10) {
            c0(t02, true);
        }
        return true;
    }

    public void E() {
        a s10 = s();
        if (s10 != null) {
            s10.w(false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean E0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.S = z10;
        } else if (i10 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean G0(int i10, KeyEvent keyEvent) {
        a s10 = s();
        if (s10 != null && s10.o(i10, keyEvent)) {
            return true;
        }
        u uVar = this.R;
        if (uVar == null || !O0(uVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.R == null) {
                u t02 = t0(0, true);
                P0(t02, keyEvent);
                boolean O0 = O0(t02, keyEvent.getKeyCode(), keyEvent, 1);
                t02.f739m = false;
                if (O0) {
                    return true;
                }
            }
            return false;
        }
        u uVar2 = this.R;
        if (uVar2 != null) {
            uVar2.f740n = true;
        }
        return true;
    }

    public boolean H(int i10) {
        int R0 = R0(i10);
        if (this.O && R0 == 108) {
            return false;
        }
        if (this.K && R0 == 1) {
            this.K = false;
        }
        if (R0 == 1) {
            Z0();
            this.O = true;
            return true;
        } else if (R0 == 2) {
            Z0();
            this.I = true;
            return true;
        } else if (R0 == 5) {
            Z0();
            this.J = true;
            return true;
        } else if (R0 == 10) {
            Z0();
            this.M = true;
            return true;
        } else if (R0 == 108) {
            Z0();
            this.K = true;
            return true;
        } else if (R0 != 109) {
            return this.f692p.requestFeature(R0);
        } else {
            Z0();
            this.L = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    public void J(int i10) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f691o).inflate(i10, viewGroup);
        this.f693q.c(this.f692p.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void J0(int i10) {
        a s10;
        if (i10 == 108 && (s10 = s()) != null) {
            s10.i(true);
        }
    }

    public void K(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f693q.c(this.f692p.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void K0(int i10) {
        if (i10 == 108) {
            a s10 = s();
            if (s10 != null) {
                s10.i(false);
            }
        } else if (i10 == 0) {
            u t02 = t0(i10, true);
            if (t02.f741o) {
                c0(t02, false);
            }
        }
    }

    public void L(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.F.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f693q.c(this.f692p.getCallback());
    }

    /* access modifiers changed from: package-private */
    public void L0(ViewGroup viewGroup) {
    }

    public void M(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.M(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f688l0;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.f689m0) == null)) {
            n.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f689m0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f690n;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = n.a((Activity) this.f690n);
            }
        }
        this.f688l0 = onBackInvokedDispatcher;
        d1();
    }

    public void N(Toolbar toolbar) {
        if (this.f690n instanceof Activity) {
            a s10 = s();
            if (!(s10 instanceof c0)) {
                this.f696t = null;
                if (s10 != null) {
                    s10.n();
                }
                this.f695s = null;
                if (toolbar != null) {
                    z zVar = new z(toolbar, u0(), this.f693q);
                    this.f695s = zVar;
                    this.f693q.e(zVar.f780c);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.f693q.e((g) null);
                }
                u();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final a N0() {
        return this.f695s;
    }

    public void O(int i10) {
        this.Y = i10;
    }

    public final void P(CharSequence charSequence) {
        this.f697u = charSequence;
        d0 d0Var = this.f698v;
        if (d0Var != null) {
            d0Var.setWindowTitle(charSequence);
        } else if (N0() != null) {
            N0().y(charSequence);
        } else {
            TextView textView = this.G;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S0(Configuration configuration, androidx.core.os.i iVar) {
        l.d(configuration, iVar);
    }

    public boolean T() {
        return R(true);
    }

    /* access modifiers changed from: package-private */
    public void T0(androidx.core.os.i iVar) {
        l.c(iVar);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U0() {
        /*
            r1 = this;
            boolean r0 = r1.E
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.F
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.m0.U(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.U0():boolean");
    }

    /* access modifiers changed from: package-private */
    public androidx.core.os.i W(Context context) {
        androidx.core.os.i r10;
        if (Build.VERSION.SDK_INT >= 33 || (r10 = g.r()) == null) {
            return null;
        }
        androidx.core.os.i s02 = s0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i b10 = x.b(r10, s02);
        return b10.e() ? s02 : b10;
    }

    /* access modifiers changed from: package-private */
    public boolean W0() {
        if (this.f688l0 == null) {
            return false;
        }
        u t02 = t0(0, false);
        return (t02 != null && t02.f741o) || this.f701y != null;
    }

    public androidx.appcompat.view.b X0(b.a aVar) {
        e eVar;
        if (aVar != null) {
            androidx.appcompat.view.b bVar = this.f701y;
            if (bVar != null) {
                bVar.c();
            }
            i iVar = new i(aVar);
            a s10 = s();
            if (s10 != null) {
                androidx.appcompat.view.b z10 = s10.z(iVar);
                this.f701y = z10;
                if (!(z10 == null || (eVar = this.f694r) == null)) {
                    eVar.v(z10);
                }
            }
            if (this.f701y == null) {
                this.f701y = Y0(iVar);
            }
            d1();
            return this.f701y;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* access modifiers changed from: package-private */
    public void Y(int i10, u uVar, Menu menu) {
        if (menu == null) {
            if (uVar == null && i10 >= 0) {
                u[] uVarArr = this.Q;
                if (i10 < uVarArr.length) {
                    uVar = uVarArr[i10];
                }
            }
            if (uVar != null) {
                menu = uVar.f736j;
            }
        }
        if ((uVar == null || uVar.f741o) && !this.V) {
            this.f693q.d(this.f692p.getCallback(), i10, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.appcompat.view.b Y0(androidx.appcompat.view.b.a r8) {
        /*
            r7 = this;
            r7.j0()
            androidx.appcompat.view.b r0 = r7.f701y
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.h.i
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.h$i r0 = new androidx.appcompat.app.h$i
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.e r0 = r7.f694r
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.V
            if (r2 != 0) goto L_0x0022
            androidx.appcompat.view.b r0 = r0.e0(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f701y = r0
            goto L_0x015b
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f702z
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.N
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f691o
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = f.a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f691o
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            androidx.appcompat.view.d r4 = new androidx.appcompat.view.d
            android.content.Context r6 = r7.f691o
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f691o
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f702z = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = f.a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.A = r5
            r6 = 2
            androidx.core.widget.h.b(r5, r6)
            android.widget.PopupWindow r5 = r7.A
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f702z
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.A
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = f.a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f702z
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.A
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.h$d r0 = new androidx.appcompat.app.h$d
            r0.<init>()
            r7.B = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.F
            int r4 = f.f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.o0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f702z = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f702z
            if (r0 == 0) goto L_0x015b
            r7.j0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f702z
            r0.k()
            androidx.appcompat.view.e r0 = new androidx.appcompat.view.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f702z
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f702z
            android.widget.PopupWindow r6 = r7.A
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.d(r0, r3)
            if (r8 == 0) goto L_0x0159
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f702z
            r8.h(r0)
            r7.f701y = r0
            boolean r8 = r7.U0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f702z
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f702z
            androidx.core.view.s0 r8 = androidx.core.view.m0.e(r8)
            androidx.core.view.s0 r8 = r8.b(r0)
            r7.C = r8
            androidx.appcompat.app.h$e r0 = new androidx.appcompat.app.h$e
            r0.<init>()
            r8.h(r0)
            goto L_0x0149
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f702z
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f702z
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f702z
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0149
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f702z
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            androidx.core.view.m0.n0(r8)
        L_0x0149:
            android.widget.PopupWindow r8 = r7.A
            if (r8 == 0) goto L_0x015b
            android.view.Window r8 = r7.f692p
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.B
            r8.post(r0)
            goto L_0x015b
        L_0x0159:
            r7.f701y = r1
        L_0x015b:
            androidx.appcompat.view.b r8 = r7.f701y
            if (r8 == 0) goto L_0x0166
            androidx.appcompat.app.e r0 = r7.f694r
            if (r0 == 0) goto L_0x0166
            r0.v(r8)
        L_0x0166:
            r7.d1()
            androidx.appcompat.view.b r8 = r7.f701y
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.Y0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    /* access modifiers changed from: package-private */
    public void Z(androidx.appcompat.view.menu.g gVar) {
        if (!this.P) {
            this.P = true;
            this.f698v.l();
            Window.Callback v02 = v0();
            if (v02 != null && !this.V) {
                v02.onPanelClosed(108, gVar);
            }
            this.P = false;
        }
    }

    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        u m02;
        Window.Callback v02 = v0();
        if (v02 == null || this.V || (m02 = m0(gVar.F())) == null) {
            return false;
        }
        return v02.onMenuItemSelected(m02.f727a, menuItem);
    }

    public void b(androidx.appcompat.view.menu.g gVar) {
        Q0(true);
    }

    /* access modifiers changed from: package-private */
    public void b0(int i10) {
        c0(t0(i10, true), true);
    }

    /* access modifiers changed from: package-private */
    public void c0(u uVar, boolean z10) {
        ViewGroup viewGroup;
        d0 d0Var;
        if (!z10 || uVar.f727a != 0 || (d0Var = this.f698v) == null || !d0Var.b()) {
            WindowManager windowManager = (WindowManager) this.f691o.getSystemService("window");
            if (!(windowManager == null || !uVar.f741o || (viewGroup = uVar.f733g) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    Y(uVar.f727a, uVar, (Menu) null);
                }
            }
            uVar.f739m = false;
            uVar.f740n = false;
            uVar.f741o = false;
            uVar.f734h = null;
            uVar.f743q = true;
            if (this.R == uVar) {
                this.R = null;
            }
            if (uVar.f727a == 0) {
                d1();
                return;
            }
            return;
        }
        Z(uVar.f736j);
    }

    /* access modifiers changed from: package-private */
    public void d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean W0 = W0();
            if (W0 && this.f689m0 == null) {
                this.f689m0 = n.b(this.f688l0, this);
            } else if (!W0 && (onBackInvokedCallback = this.f689m0) != null) {
                n.c(this.f688l0, onBackInvokedCallback);
            }
        }
    }

    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.F.findViewById(16908290)).addView(view, layoutParams);
        this.f693q.c(this.f692p.getCallback());
    }

    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        s sVar;
        boolean z11 = false;
        if (this.f686j0 == null) {
            String string = this.f691o.obtainStyledAttributes(f.j.f11299y0).getString(f.j.C0);
            if (string == null) {
                sVar = new s();
            } else {
                try {
                    this.f686j0 = (s) this.f691o.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    sVar = new s();
                }
            }
            this.f686j0 = sVar;
        }
        boolean z12 = f673o0;
        if (z12) {
            if (this.f687k0 == null) {
                this.f687k0 = new w();
            }
            if (this.f687k0.a(attributeSet)) {
                z10 = true;
                return this.f686j0.r(view, str, context, attributeSet, z10, z12, true, f1.d());
            } else if (!(attributeSet instanceof XmlPullParser)) {
                z11 = V0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z11 = true;
            }
        }
        z10 = z11;
        return this.f686j0.r(view, str, context, attributeSet, z10, z12, true, f1.d());
    }

    /* access modifiers changed from: package-private */
    public final int f1(k1 k1Var, Rect rect) {
        boolean z10;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        int i11 = 0;
        int l10 = k1Var != null ? k1Var.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f702z;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f702z.getLayoutParams();
            boolean z12 = true;
            if (this.f702z.isShown()) {
                if (this.f684h0 == null) {
                    this.f684h0 = new Rect();
                    this.f685i0 = new Rect();
                }
                Rect rect2 = this.f684h0;
                Rect rect3 = this.f685i0;
                if (k1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(k1Var.j(), k1Var.l(), k1Var.k(), k1Var.i());
                }
                g1.a(this.F, rect2, rect3);
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                k1 I2 = m0.I(this.F);
                int j10 = I2 == null ? 0 : I2.j();
                int k10 = I2 == null ? 0 : I2.k();
                if (marginLayoutParams2.topMargin == i12 && marginLayoutParams2.leftMargin == i13 && marginLayoutParams2.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i12;
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    z11 = true;
                }
                if (i12 <= 0 || this.H != null) {
                    View view = this.H;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i10 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == j10 && marginLayoutParams.rightMargin == k10))) {
                        marginLayoutParams.height = i10;
                        marginLayoutParams.leftMargin = j10;
                        marginLayoutParams.rightMargin = k10;
                        this.H.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f691o);
                    this.H = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = j10;
                    layoutParams.rightMargin = k10;
                    this.F.addView(this.H, -1, layoutParams);
                }
                View view3 = this.H;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    g1(this.H);
                }
                if (!this.M && z12) {
                    l10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f702z.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.H;
        if (view4 != null) {
            if (!z10) {
                i11 = 8;
            }
            view4.setVisibility(i11);
        }
        return l10;
    }

    public Context g(Context context) {
        this.T = true;
        int C0 = C0(context, X());
        if (g.v(context)) {
            g.Q(context);
        }
        androidx.core.os.i W2 = W(context);
        if (f676r0 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, d0(context, C0, W2, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(d0(context, C0, W2, (Configuration) null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f675q0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration d02 = d0(context, C0, W2, !configuration2.equals(configuration3) ? n0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, f.i.Theme_AppCompat_Empty);
        dVar.a(d02);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    /* access modifiers changed from: package-private */
    public void g0() {
        androidx.appcompat.view.menu.g gVar;
        d0 d0Var = this.f698v;
        if (d0Var != null) {
            d0Var.l();
        }
        if (this.A != null) {
            this.f692p.getDecorView().removeCallbacks(this.B);
            if (this.A.isShowing()) {
                try {
                    this.A.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.A = null;
        }
        j0();
        u t02 = t0(0, false);
        if (t02 != null && (gVar = t02.f736j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f690n;
        if (((obj instanceof p.a) || (obj instanceof r)) && (decorView = this.f692p.getDecorView()) != null && androidx.core.view.p.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f693q.b(this.f692p.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public void i0(int i10) {
        u t02;
        u t03 = t0(i10, true);
        if (t03.f736j != null) {
            Bundle bundle = new Bundle();
            t03.f736j.T(bundle);
            if (bundle.size() > 0) {
                t03.f745s = bundle;
            }
            t03.f736j.h0();
            t03.f736j.clear();
        }
        t03.f744r = true;
        t03.f743q = true;
        if ((i10 == 108 || i10 == 0) && this.f698v != null && (t02 = t0(0, false)) != null) {
            t02.f739m = false;
            P0(t02, (KeyEvent) null);
        }
    }

    public View j(int i10) {
        k0();
        return this.f692p.findViewById(i10);
    }

    /* access modifiers changed from: package-private */
    public void j0() {
        s0 s0Var = this.C;
        if (s0Var != null) {
            s0Var.c();
        }
    }

    public Context l() {
        return this.f691o;
    }

    /* access modifiers changed from: package-private */
    public u m0(Menu menu) {
        u[] uVarArr = this.Q;
        int length = uVarArr != null ? uVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            u uVar = uVarArr[i10];
            if (uVar != null && uVar.f736j == menu) {
                return uVar;
            }
        }
        return null;
    }

    public final b n() {
        return new f();
    }

    public int o() {
        return this.X;
    }

    /* access modifiers changed from: package-private */
    public final Context o0() {
        a s10 = s();
        Context k10 = s10 != null ? s10.k() : null;
        return k10 == null ? this.f691o : k10;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    public MenuInflater q() {
        if (this.f696t == null) {
            w0();
            a aVar = this.f695s;
            this.f696t = new androidx.appcompat.view.g(aVar != null ? aVar.k() : this.f691o);
        }
        return this.f696t;
    }

    public a s() {
        w0();
        return this.f695s;
    }

    /* access modifiers changed from: package-private */
    public androidx.core.os.i s0(Configuration configuration) {
        return l.b(configuration);
    }

    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f691o);
        if (from.getFactory() == null) {
            androidx.core.view.q.a(from, this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: protected */
    public u t0(int i10, boolean z10) {
        u[] uVarArr = this.Q;
        if (uVarArr == null || uVarArr.length <= i10) {
            u[] uVarArr2 = new u[(i10 + 1)];
            if (uVarArr != null) {
                System.arraycopy(uVarArr, 0, uVarArr2, 0, uVarArr.length);
            }
            this.Q = uVarArr2;
            uVarArr = uVarArr2;
        }
        u uVar = uVarArr[i10];
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(i10);
        uVarArr[i10] = uVar2;
        return uVar2;
    }

    public void u() {
        if (N0() != null && !s().l()) {
            A0(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final CharSequence u0() {
        Object obj = this.f690n;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f697u;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback v0() {
        return this.f692p.getCallback();
    }

    public void x(Configuration configuration) {
        a s10;
        if (this.K && this.E && (s10 = s()) != null) {
            s10.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.f691o);
        this.W = new Configuration(this.f691o.getResources().getConfiguration());
        S(false, false);
    }

    public void y(Bundle bundle) {
        String str;
        this.T = true;
        R(false);
        l0();
        Object obj = this.f690n;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                a N0 = N0();
                if (N0 == null) {
                    this.f683g0 = true;
                } else {
                    N0.r(true);
                }
            }
            g.d(this);
        }
        this.W = new Configuration(this.f691o.getResources().getConfiguration());
        this.U = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f690n
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.g.F(r3)
        L_0x0009:
            boolean r0 = r3.f680d0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f692p
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f682f0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 1
            r3.V = r0
            int r0 = r3.X
            r1 = -100
            if (r0 == r1) goto L_0x0045
            java.lang.Object r0 = r3.f690n
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0045
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0045
            o.g r0 = f672n0
            java.lang.Object r1 = r3.f690n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.X
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0054
        L_0x0045:
            o.g r0 = f672n0
            java.lang.Object r1 = r3.f690n
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0054:
            androidx.appcompat.app.a r0 = r3.f695s
            if (r0 == 0) goto L_0x005b
            r0.n()
        L_0x005b:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.z():void");
    }

    h(Dialog dialog, e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    private h(Context context, Window window, e eVar, Object obj) {
        d a12;
        this.C = null;
        this.D = true;
        this.X = -100;
        this.f682f0 = new a();
        this.f691o = context;
        this.f694r = eVar;
        this.f690n = obj;
        if (this.X == -100 && (obj instanceof Dialog) && (a12 = a1()) != null) {
            this.X = a12.P0().o();
        }
        if (this.X == -100) {
            o.g gVar = f672n0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.X = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        androidx.appcompat.widget.j.h();
    }
}
