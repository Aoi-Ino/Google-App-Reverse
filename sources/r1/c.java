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

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final u f15442a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15443b;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, a aVar) {
            if (aVar.b() == null) {
                kVar.G(1);
            } else {
                kVar.x(1, aVar.b());
            }
            if (aVar.a() == null) {
                kVar.G(2);
            } else {
                kVar.x(2, aVar.a());
            }
        }
    }

    public c(u uVar) {
        this.f15442a = uVar;
        this.f15443b = new a(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public boolean a(String str) {
        boolean z10 = true;
        x f10 = x.f("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15442a.d();
        boolean z11 = false;
        Cursor b10 = b.b(this.f15442a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public void b(a aVar) {
        this.f15442a.d();
        this.f15442a.e();
        try {
            this.f15443b.j(aVar);
            this.f15442a.A();
        } finally {
            this.f15442a.i();
        }
    }

    public boolean c(String str) {
        boolean z10 = true;
        x f10 = x.f("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15442a.d();
        boolean z11 = false;
        Cursor b10 = b.b(this.f15442a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                if (b10.getInt(0) == 0) {
                    z10 = false;
                }
                z11 = z10;
            }
            return z11;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public List d(String str) {
        x f10 = x.f("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15442a.d();
        Cursor b10 = b.b(this.f15442a, f10, false, (CancellationSignal) null);
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
