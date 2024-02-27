package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class u0 extends n0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f1552b;

    public u0(Context context, Resources resources) {
        super(resources);
        this.f1552b = new WeakReference(context);
    }

    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = (Context) this.f1552b.get();
        if (!(a10 == null || context == null)) {
            m0.g().w(context, i10, a10);
        }
        return a10;
    }
}
