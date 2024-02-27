package ip;

import java.io.File;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

class a0 implements z {
    private g0 b(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return null;
        }
        if (superclass.isEnum()) {
            return new r(cls);
        }
        if (cls.isEnum()) {
            return new r(cls);
        }
        return null;
    }

    private g0 c(Class cls) {
        if (cls == File.class) {
            return new s();
        }
        return null;
    }

    private g0 d(Class cls) {
        if (cls == Boolean.class) {
            return new g();
        }
        if (cls == Integer.class) {
            return new v();
        }
        if (cls == Long.class) {
            return new y();
        }
        if (cls == Double.class) {
            return new q();
        }
        if (cls == Float.class) {
            return new t();
        }
        if (cls == Short.class) {
            return new c0();
        }
        if (cls == Byte.class) {
            return new h();
        }
        if (cls == Character.class) {
            return new j();
        }
        if (cls == String.class) {
            return new e0();
        }
        if (cls == Class.class) {
            return new k();
        }
        return null;
    }

    private g0 e(Class cls) {
        if (cls == BigDecimal.class) {
            return new e();
        }
        if (cls == BigInteger.class) {
            return new f();
        }
        return null;
    }

    private g0 f(Class cls) {
        if (cls == Time.class) {
            return new n(cls);
        }
        if (cls == Date.class) {
            return new n(cls);
        }
        if (cls == Timestamp.class) {
            return new n(cls);
        }
        return null;
    }

    private g0 g(Class cls) {
        if (cls == URL.class) {
            return new j0();
        }
        return null;
    }

    private g0 h(Class cls) {
        if (cls == java.util.Date.class) {
            return new n(cls);
        }
        if (cls == Locale.class) {
            return new x();
        }
        if (cls == Currency.class) {
            return new l();
        }
        if (cls == GregorianCalendar.class) {
            return new u();
        }
        if (cls == TimeZone.class) {
            return new f0();
        }
        if (cls == AtomicInteger.class) {
            return new c();
        }
        if (cls == AtomicLong.class) {
            return new d();
        }
        return null;
    }

    public g0 a(Class cls) {
        String name = cls.getName();
        if (name.startsWith("java.lang")) {
            return d(cls);
        }
        if (name.startsWith("java.util")) {
            return h(cls);
        }
        if (name.startsWith("java.net")) {
            return g(cls);
        }
        if (name.startsWith("java.io")) {
            return c(cls);
        }
        if (name.startsWith("java.sql")) {
            return f(cls);
        }
        return name.startsWith("java.math") ? e(cls) : b(cls);
    }
}
