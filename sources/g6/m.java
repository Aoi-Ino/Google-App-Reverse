package g6;

import g6.n;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public final class m {

    /* renamed from: d  reason: collision with root package name */
    private static final Logger f11688d = Logger.getLogger(m.class.getName());

    /* renamed from: e  reason: collision with root package name */
    private static final List f11689e = (v.b() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList());

    /* renamed from: f  reason: collision with root package name */
    public static final m f11690f = new m(new n.a());

    /* renamed from: g  reason: collision with root package name */
    public static final m f11691g = new m(new n.e());

    /* renamed from: h  reason: collision with root package name */
    public static final m f11692h = new m(new n.g());

    /* renamed from: i  reason: collision with root package name */
    public static final m f11693i = new m(new n.f());

    /* renamed from: j  reason: collision with root package name */
    public static final m f11694j = new m(new n.b());

    /* renamed from: k  reason: collision with root package name */
    public static final m f11695k = new m(new n.d());

    /* renamed from: l  reason: collision with root package name */
    public static final m f11696l = new m(new n.c());

    /* renamed from: a  reason: collision with root package name */
    private n f11697a;

    /* renamed from: b  reason: collision with root package name */
    private List f11698b = f11689e;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11699c = true;

    public m(n nVar) {
        this.f11697a = nVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f11688d.info(String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        Exception exc = null;
        for (Provider a10 : this.f11698b) {
            try {
                return this.f11697a.a(str, a10);
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (this.f11699c) {
            return this.f11697a.a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
