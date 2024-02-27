package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2416a = new c();

    private c() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
