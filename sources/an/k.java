package an;

import cm.g;
import cm.l;
import java.net.ProtocolException;
import um.a0;

public final class k {

    /* renamed from: d  reason: collision with root package name */
    public static final a f19411d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final a0 f19412a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19413b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19414c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final k a(String str) {
            int i10;
            a0 a0Var;
            String str2;
            l.f(str, "statusLine");
            if (p.A(str, "HTTP/1.", false, 2, (Object) null)) {
                i10 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    a0Var = a0.HTTP_1_0;
                } else if (charAt == 1) {
                    a0Var = a0.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (p.A(str, "ICY ", false, 2, (Object) null)) {
                a0Var = a0.HTTP_1_0;
                i10 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    l.e(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = "";
                    } else if (str.charAt(i11) == ' ') {
                        str2 = str.substring(i10 + 4);
                        l.e(str2, "(this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new k(a0Var, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }
    }

    public k(a0 a0Var, int i10, String str) {
        l.f(a0Var, "protocol");
        l.f(str, "message");
        this.f19412a = a0Var;
        this.f19413b = i10;
        this.f19414c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19412a == a0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f19413b);
        sb2.append(' ');
        sb2.append(this.f19414c);
        String sb3 = sb2.toString();
        l.e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
