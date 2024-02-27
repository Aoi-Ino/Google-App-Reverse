package um;

import cm.g;
import cm.l;
import java.io.IOException;

public enum a0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: m  reason: collision with root package name */
    public static final a f31898m = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final String f31899e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final a0 a(String str) {
            l.f(str, "protocol");
            a0 a0Var = a0.HTTP_1_0;
            if (!l.a(str, a0Var.f31899e)) {
                a0Var = a0.HTTP_1_1;
                if (!l.a(str, a0Var.f31899e)) {
                    a0Var = a0.H2_PRIOR_KNOWLEDGE;
                    if (!l.a(str, a0Var.f31899e)) {
                        a0Var = a0.HTTP_2;
                        if (!l.a(str, a0Var.f31899e)) {
                            a0Var = a0.SPDY_3;
                            if (!l.a(str, a0Var.f31899e)) {
                                a0Var = a0.QUIC;
                                if (!l.a(str, a0Var.f31899e)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return a0Var;
        }
    }

    static {
        f31898m = new a((g) null);
    }

    private a0(String str) {
        this.f31899e = str;
    }

    public String toString() {
        return this.f31899e;
    }
}
