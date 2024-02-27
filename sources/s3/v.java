package s3;

import android.os.Bundle;
import q3.a;

public class v implements a.d {

    /* renamed from: c  reason: collision with root package name */
    public static final v f16040c = a().a();

    /* renamed from: b  reason: collision with root package name */
    private final String f16041b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f16042a;

        /* synthetic */ a(y yVar) {
        }

        public v a() {
            return new v(this.f16042a, (z) null);
        }
    }

    /* synthetic */ v(String str, z zVar) {
        this.f16041b = str;
    }

    public static a a() {
        return new a((y) null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f16041b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        return n.a(this.f16041b, ((v) obj).f16041b);
    }

    public final int hashCode() {
        return n.b(this.f16041b);
    }
}
