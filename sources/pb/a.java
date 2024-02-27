package pb;

import android.os.Build;
import cm.g;
import cm.l;
import id.c;
import j$.util.Base64;
import km.d;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0201a f14908a = new C0201a((g) null);

    /* renamed from: pb.a$a  reason: collision with other inner class name */
    public static final class C0201a {
        private C0201a() {
        }

        public /* synthetic */ C0201a(g gVar) {
            this();
        }

        public final String a(String str, String str2) {
            c.a aVar;
            String str3;
            l.f(str, "currentTime");
            l.f(str2, "data");
            if (Build.VERSION.SDK_INT >= 26) {
                aVar = c.f12675a;
                byte[] decode = Base64.getDecoder().decode(str2);
                l.e(decode, "decode(...)");
                str3 = new String(decode, d.f24740b);
            } else {
                aVar = c.f12675a;
                byte[] decode2 = android.util.Base64.decode(str2, 0);
                l.e(decode2, "decode(...)");
                str3 = new String(decode2, d.f24740b);
            }
            return String.valueOf(aVar.a(str, str3));
        }
    }
}
