package d5;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.activity.b;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final TimeInterpolator f9747a;

    /* renamed from: b  reason: collision with root package name */
    protected final View f9748b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f9749c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f9750d;

    /* renamed from: e  reason: collision with root package name */
    protected final int f9751e;

    /* renamed from: f  reason: collision with root package name */
    private b f9752f;

    public a(View view) {
        this.f9748b = view;
        Context context = view.getContext();
        this.f9747a = h.g(context, q4.b.motionEasingStandardDecelerateInterpolator, androidx.core.view.animation.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f9749c = h.f(context, q4.b.motionDurationMedium2, 300);
        this.f9750d = h.f(context, q4.b.motionDurationShort3, 150);
        this.f9751e = h.f(context, q4.b.motionDurationShort2, 100);
    }

    /* access modifiers changed from: protected */
    public float a(float f10) {
        return this.f9747a.getInterpolation(f10);
    }

    /* access modifiers changed from: protected */
    public b b() {
        if (this.f9752f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        b bVar = this.f9752f;
        this.f9752f = null;
        return bVar;
    }

    public b c() {
        b bVar = this.f9752f;
        this.f9752f = null;
        return bVar;
    }

    /* access modifiers changed from: protected */
    public void d(b bVar) {
        this.f9752f = bVar;
    }

    /* access modifiers changed from: protected */
    public b e(b bVar) {
        if (this.f9752f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        b bVar2 = this.f9752f;
        this.f9752f = bVar;
        return bVar2;
    }
}
