package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class s0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1543c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static ArrayList f1544d;

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1545a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources.Theme f1546b;

    private s0(Context context) {
        super(context);
        if (f1.d()) {
            f1 f1Var = new f1(this, context.getResources());
            this.f1545a = f1Var;
            Resources.Theme newTheme = f1Var.newTheme();
            this.f1546b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1545a = new u0(this, context.getResources());
        this.f1546b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof s0) || (context.getResources() instanceof u0) || (context.getResources() instanceof f1)) {
            return false;
        }
        return f1.d();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1543c) {
            try {
                ArrayList arrayList = f1544d;
                if (arrayList == null) {
                    f1544d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f1544d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1544d.remove(size);
                        }
                    }
                    for (int size2 = f1544d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f1544d.get(size2);
                        s0 s0Var = weakReference2 != null ? (s0) weakReference2.get() : null;
                        if (s0Var != null && s0Var.getBaseContext() == context) {
                            return s0Var;
                        }
                    }
                }
                s0 s0Var2 = new s0(context);
                f1544d.add(new WeakReference(s0Var2));
                return s0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AssetManager getAssets() {
        return this.f1545a.getAssets();
    }

    public Resources getResources() {
        return this.f1545a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1546b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i10) {
        Resources.Theme theme = this.f1546b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
