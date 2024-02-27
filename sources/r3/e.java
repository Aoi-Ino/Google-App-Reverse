package r3;

import android.app.Activity;
import androidx.fragment.app.j;
import s3.o;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f15559a;

    public e(Activity activity) {
        o.j(activity, "Activity must not be null");
        this.f15559a = activity;
    }

    public final Activity a() {
        return (Activity) this.f15559a;
    }

    public final j b() {
        return (j) this.f15559a;
    }

    public final boolean c() {
        return this.f15559a instanceof Activity;
    }

    public final boolean d() {
        return this.f15559a instanceof j;
    }
}
