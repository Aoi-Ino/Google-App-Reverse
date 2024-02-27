package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import d1.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import r1.z;
import y0.i;
import y0.u;
import y0.x;

public final class a0 implements z {

    /* renamed from: a  reason: collision with root package name */
    private final u f15432a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15433b;

    /* renamed from: c  reason: collision with root package name */
    private final y0.a0 f15434c;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, y yVar) {
            if (yVar.a() == null) {
                kVar.G(1);
            } else {
                kVar.x(1, yVar.a());
            }
            if (yVar.b() == null) {
                kVar.G(2);
            } else {
                kVar.x(2, yVar.b());
            }
        }
    }

    class b extends y0.a0 {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public a0(u uVar) {
        this.f15432a = uVar;
        this.f15433b = new a(uVar);
        this.f15434c = new b(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public void b(String str, Set set) {
        z.a.a(this, str, set);
    }

    public void c(y yVar) {
        this.f15432a.d();
        this.f15432a.e();
        try {
            this.f15433b.j(yVar);
            this.f15432a.A();
        } finally {
            this.f15432a.i();
        }
    }

    public List d(String str) {
        x f10 = x.f("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15432a.d();
        Cursor b10 = a1.b.b(this.f15432a, f10, false, (CancellationSignal) null);
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
