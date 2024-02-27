package rk;

import android.graphics.Bitmap;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Class f31112a;

    /* renamed from: b  reason: collision with root package name */
    private final Bitmap.Config f31113b;

    public a(Class cls) {
        this(cls, (Bitmap.Config) null);
    }

    public Object a() {
        if (this.f31113b == null) {
            return this.f31112a.newInstance();
        }
        return this.f31112a.getConstructor(new Class[]{Bitmap.Config.class}).newInstance(new Object[]{this.f31113b});
    }

    public a(Class cls, Bitmap.Config config) {
        this.f31112a = cls;
        this.f31113b = config;
    }
}
