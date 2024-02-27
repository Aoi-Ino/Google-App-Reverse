package um;

import cm.g;
import cm.l;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public interface q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f32112a = new a.C0366a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f32113b = new a((g) null);

    public static final class a {

        /* renamed from: um.q$a$a  reason: collision with other inner class name */
        private static final class C0366a implements q {
            public List a(String str) {
                l.f(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    l.e(allByName, "InetAddress.getAllByName(hostname)");
                    return m.G(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    List a(String str);
}
