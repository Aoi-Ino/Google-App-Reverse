package i1;

import android.view.View;
import android.view.WindowId;

class o0 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f12214a;

    o0(View view) {
        this.f12214a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof o0) && ((o0) obj).f12214a.equals(this.f12214a);
    }

    public int hashCode() {
        return this.f12214a.hashCode();
    }
}
