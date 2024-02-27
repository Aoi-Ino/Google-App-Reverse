package gn;

import cm.l;
import in.c0;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import vm.a;
import vm.b;

public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f23997a = new d();

    private d() {
    }

    private final String b(String str) {
        if (!d(str)) {
            return str;
        }
        Locale locale = Locale.US;
        l.e(locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            l.e(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final List c(X509Certificate x509Certificate, int i10) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return q.i();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!l.a(next.get(0), Integer.valueOf(i10)))) {
                            Object obj = next.get(1);
                            if (obj != null) {
                                arrayList.add((String) obj);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return q.i();
        }
    }

    private final boolean d(String str) {
        return str.length() == ((int) c0.b(str, 0, 0, 3, (Object) null));
    }

    private final boolean f(String str, String str2) {
        if (str != null && str.length() != 0 && !p.A(str, ".", false, 2, (Object) null) && !p.n(str, "..", false, 2, (Object) null) && str2 != null && str2.length() != 0 && !p.A(str2, ".", false, 2, (Object) null) && !p.n(str2, "..", false, 2, (Object) null)) {
            if (!p.n(str, ".", false, 2, (Object) null)) {
                str = str + ".";
            }
            String str3 = str;
            if (!p.n(str2, ".", false, 2, (Object) null)) {
                str2 = str2 + ".";
            }
            String b10 = b(str2);
            if (!q.F(b10, "*", false, 2, (Object) null)) {
                return l.a(str3, b10);
            }
            if (!p.A(b10, "*.", false, 2, (Object) null) || q.P(b10, '*', 1, false, 4, (Object) null) != -1 || str3.length() < b10.length() || l.a("*.", b10)) {
                return false;
            }
            String substring = b10.substring(1);
            l.e(substring, "(this as java.lang.String).substring(startIndex)");
            if (!p.n(str3, substring, false, 2, (Object) null)) {
                return false;
            }
            int length = str3.length() - substring.length();
            return length <= 0 || q.U(str3, '.', length + -1, false, 4, (Object) null) == -1;
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b10 = b(str);
        Iterable<String> c10 = c(x509Certificate, 2);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String f10 : c10) {
            if (f23997a.f(b10, f10)) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String e10 = a.e(str);
        Iterable<String> c10 = c(x509Certificate, 7);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String e11 : c10) {
            if (l.a(e10, a.e(e11))) {
                return true;
            }
        }
        return false;
    }

    public final List a(X509Certificate x509Certificate) {
        l.f(x509Certificate, "certificate");
        return y.i0(c(x509Certificate, 7), c(x509Certificate, 2));
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        l.f(str, "host");
        l.f(x509Certificate, "certificate");
        return b.f(str) ? h(str, x509Certificate) : g(str, x509Certificate);
    }

    public boolean verify(String str, SSLSession sSLSession) {
        l.f(str, "host");
        l.f(sSLSession, "session");
        if (!d(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return e(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
