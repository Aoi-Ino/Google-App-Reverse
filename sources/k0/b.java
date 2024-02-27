package k0;

import android.text.Editable;
import i0.c;

final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f12884a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f12885b;

    /* renamed from: c  reason: collision with root package name */
    private static Class f12886c;

    private b() {
        try {
            f12886c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f12885b == null) {
            synchronized (f12884a) {
                try {
                    if (f12885b == null) {
                        f12885b = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f12885b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class cls = f12886c;
        return cls != null ? c.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
