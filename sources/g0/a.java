package g0;

import android.content.Context;
import android.net.Uri;
import java.io.File;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final a f11592a;

    a(a aVar) {
        this.f11592a = aVar;
    }

    public static a a(File file) {
        return new c((a) null, file);
    }

    public static a b(Context context, Uri uri) {
        return new d((a) null, context, uri);
    }

    public abstract long c();
}
