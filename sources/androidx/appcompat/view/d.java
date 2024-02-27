package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import f.i;

public class d extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    private static Configuration f796f;

    /* renamed from: a  reason: collision with root package name */
    private int f797a;

    /* renamed from: b  reason: collision with root package name */
    private Resources.Theme f798b;

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f799c;

    /* renamed from: d  reason: collision with root package name */
    private Configuration f800d;

    /* renamed from: e  reason: collision with root package name */
    private Resources f801e;

    static class a {
        static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f797a = i10;
    }

    private Resources b() {
        if (this.f801e == null) {
            Configuration configuration = this.f800d;
            this.f801e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : a.a(this, this.f800d).getResources();
        }
        return this.f801e;
    }

    private void d() {
        boolean z10 = this.f798b == null;
        if (z10) {
            this.f798b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f798b.setTo(theme);
            }
        }
        f(this.f798b, this.f797a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f796f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f796f = configuration2;
        }
        return configuration.equals(f796f);
    }

    public void a(Configuration configuration) {
        if (this.f801e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f800d == null) {
            this.f800d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f797a;
    }

    /* access modifiers changed from: protected */
    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return b();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f799c == null) {
            this.f799c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f799c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f798b;
        if (theme != null) {
            return theme;
        }
        if (this.f797a == 0) {
            this.f797a = i.Theme_AppCompat_Light;
        }
        d();
        return this.f798b;
    }

    public void setTheme(int i10) {
        if (this.f797a != i10) {
            this.f797a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f798b = theme;
    }
}
