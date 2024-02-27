package g7;

import android.content.Context;
import k6.c;
import k6.q;

public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static c b(String str, String str2) {
        return c.l(f.a(str, str2), f.class);
    }

    public static c c(String str, a aVar) {
        return c.m(f.class).b(q.i(Context.class)).e(new g(str, aVar)).d();
    }
}
