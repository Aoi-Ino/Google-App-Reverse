package um;

import cm.l;
import in.h;
import java.nio.charset.Charset;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f32104a = new o();

    private o() {
    }

    public static final String a(String str, String str2, Charset charset) {
        l.f(str, "username");
        l.f(str2, "password");
        l.f(charset, "charset");
        String a10 = h.f24468i.b(str + ':' + str2, charset).a();
        return "Basic " + a10;
    }
}
