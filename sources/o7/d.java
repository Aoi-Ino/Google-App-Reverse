package o7;

import i7.s;
import java.sql.Date;
import java.sql.Timestamp;
import l7.d;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f14452a;

    /* renamed from: b  reason: collision with root package name */
    public static final d.b f14453b;

    /* renamed from: c  reason: collision with root package name */
    public static final d.b f14454c;

    /* renamed from: d  reason: collision with root package name */
    public static final s f14455d;

    /* renamed from: e  reason: collision with root package name */
    public static final s f14456e;

    /* renamed from: f  reason: collision with root package name */
    public static final s f14457f;

    class a extends d.b {
        a(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Date d(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class b extends d.b {
        b(Class cls) {
            super(cls);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public Timestamp d(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        s sVar;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f14452a = z10;
        if (z10) {
            f14453b = new a(Date.class);
            f14454c = new b(Timestamp.class);
            f14455d = a.f14446b;
            f14456e = b.f14448b;
            sVar = c.f14450b;
        } else {
            sVar = null;
            f14453b = null;
            f14454c = null;
            f14455d = null;
            f14456e = null;
        }
        f14457f = sVar;
    }
}
