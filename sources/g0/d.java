package g0;

import android.content.Context;
import android.net.Uri;

class d extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f11594b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f11595c;

    d(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f11594b = context;
        this.f11595c = uri;
    }

    public long c() {
        return b.b(this.f11594b, this.f11595c);
    }
}
