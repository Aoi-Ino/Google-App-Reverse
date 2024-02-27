package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import r1.j;
import y0.a0;
import y0.i;
import y0.u;
import y0.x;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final u f15453a;

    /* renamed from: b  reason: collision with root package name */
    private final i f15454b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f15455c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f15456d;

    class a extends i {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* renamed from: k */
        public void i(d1.k kVar, i iVar) {
            String str = iVar.f15450a;
            if (str == null) {
                kVar.G(1);
            } else {
                kVar.x(1, str);
            }
            kVar.f0(2, (long) iVar.a());
            kVar.f0(3, (long) iVar.f15452c);
        }
    }

    class b extends a0 {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    class c extends a0 {
        c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(u uVar) {
        this.f15453a = uVar;
        this.f15454b = new a(uVar);
        this.f15455c = new b(uVar);
        this.f15456d = new c(uVar);
    }

    public static List j() {
        return Collections.emptyList();
    }

    public void a(i iVar) {
        this.f15453a.d();
        this.f15453a.e();
        try {
            this.f15454b.j(iVar);
            this.f15453a.A();
        } finally {
            this.f15453a.i();
        }
    }

    public List c() {
        x f10 = x.f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f15453a.d();
        Cursor b10 = a1.b.b(this.f15453a, f10, false, (CancellationSignal) null);
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

    public i d(m mVar) {
        return j.a.a(this, mVar);
    }

    public void e(String str, int i10) {
        this.f15453a.d();
        d1.k b10 = this.f15455c.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        b10.f0(2, (long) i10);
        this.f15453a.e();
        try {
            b10.C();
            this.f15453a.A();
        } finally {
            this.f15453a.i();
            this.f15455c.h(b10);
        }
    }

    public void f(String str) {
        this.f15453a.d();
        d1.k b10 = this.f15456d.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        this.f15453a.e();
        try {
            b10.C();
            this.f15453a.A();
        } finally {
            this.f15453a.i();
            this.f15456d.h(b10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: r1.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r1.i g(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            y0.x r0 = y0.x.f(r0, r1)
            r2 = 1
            if (r6 != 0) goto L_0x000e
            r0.G(r2)
            goto L_0x0011
        L_0x000e:
            r0.x(r2, r6)
        L_0x0011:
            long r6 = (long) r7
            r0.f0(r1, r6)
            y0.u r6 = r5.f15453a
            r6.d()
            y0.u r6 = r5.f15453a
            r7 = 0
            r1 = 0
            android.database.Cursor r6 = a1.b.b(r6, r0, r7, r1)
            java.lang.String r7 = "work_spec_id"
            int r7 = a1.a.e(r6, r7)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "generation"
            int r2 = a1.a.e(r6, r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "system_id"
            int r3 = a1.a.e(r6, r3)     // Catch:{ all -> 0x0054 }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0056
            boolean r4 = r6.isNull(r7)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            java.lang.String r1 = r6.getString(r7)     // Catch:{ all -> 0x0054 }
        L_0x0045:
            int r7 = r6.getInt(r2)     // Catch:{ all -> 0x0054 }
            int r2 = r6.getInt(r3)     // Catch:{ all -> 0x0054 }
            r1.i r3 = new r1.i     // Catch:{ all -> 0x0054 }
            r3.<init>(r1, r7, r2)     // Catch:{ all -> 0x0054 }
            r1 = r3
            goto L_0x0056
        L_0x0054:
            r7 = move-exception
            goto L_0x005d
        L_0x0056:
            r6.close()
            r0.l()
            return r1
        L_0x005d:
            r6.close()
            r0.l()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.k.g(java.lang.String, int):r1.i");
    }

    public void i(m mVar) {
        j.a.b(this, mVar);
    }
}
