package r1;

import a1.b;
import android.database.Cursor;
import android.os.CancellationSignal;
import d1.k;
import java.util.Collections;
import java.util.List;
import y0.i;
import y0.u;
import y0.x;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final u f15447a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15448b;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.G(1);
            } else {
                kVar.x(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.G(2);
            } else {
                kVar.f0(2, dVar.b().longValue());
            }
        }
    }

    public f(u uVar) {
        this.f15447a = uVar;
        this.f15448b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public Long a(String str) {
        x f10 = x.f("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15447a.d();
        Long l10 = null;
        Cursor b10 = b.b(this.f15447a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (!b10.isNull(0)) {
                    l10 = Long.valueOf(b10.getLong(0));
                }
            }
            return l10;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public void b(d dVar) {
        this.f15447a.d();
        this.f15447a.e();
        try {
            this.f15448b.j(dVar);
            this.f15447a.A();
        } finally {
            this.f15447a.i();
        }
    }
}
