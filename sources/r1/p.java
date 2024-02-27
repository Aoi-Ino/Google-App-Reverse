package r1;

import a1.b;
import android.database.Cursor;
import android.os.CancellationSignal;
import d1.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y0.i;
import y0.u;
import y0.x;

public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private final u f15464a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15465b;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.G(1);
            } else {
                kVar.x(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.G(2);
            } else {
                kVar.x(2, nVar.b());
            }
        }
    }

    public p(u uVar) {
        this.f15464a = uVar;
        this.f15465b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public void a(n nVar) {
        this.f15464a.d();
        this.f15464a.e();
        try {
            this.f15465b.j(nVar);
            this.f15464a.A();
        } finally {
            this.f15464a.i();
        }
    }

    public List b(String str) {
        x f10 = x.f("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15464a.d();
        Cursor b10 = b.b(this.f15464a, f10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(b10.isNull(0) ? null : b10.getString(0));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.l();
        }
    }
}
