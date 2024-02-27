package r1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m1.r;
import r1.u;
import y0.a0;
import y0.u;
import y0.x;

public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    private final u f15502a;

    /* renamed from: b  reason: collision with root package name */
    private final y0.i f15503b;

    /* renamed from: c  reason: collision with root package name */
    private final y0.h f15504c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f15505d;

    /* renamed from: e  reason: collision with root package name */
    private final a0 f15506e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f15507f;

    /* renamed from: g  reason: collision with root package name */
    private final a0 f15508g;

    /* renamed from: h  reason: collision with root package name */
    private final a0 f15509h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f15510i;

    /* renamed from: j  reason: collision with root package name */
    private final a0 f15511j;

    /* renamed from: k  reason: collision with root package name */
    private final a0 f15512k;

    /* renamed from: l  reason: collision with root package name */
    private final a0 f15513l;

    /* renamed from: m  reason: collision with root package name */
    private final a0 f15514m;

    /* renamed from: n  reason: collision with root package name */
    private final a0 f15515n;

    /* renamed from: o  reason: collision with root package name */
    private final a0 f15516o;

    /* renamed from: p  reason: collision with root package name */
    private final a0 f15517p;

    /* renamed from: q  reason: collision with root package name */
    private final a0 f15518q;

    /* renamed from: r  reason: collision with root package name */
    private final a0 f15519r;

    class a extends a0 {
        a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    class b extends a0 {
        b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    class c extends a0 {
        c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    class d extends a0 {
        d(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    class e extends a0 {
        e(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    class f extends a0 {
        f(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    class g extends a0 {
        g(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    class h extends a0 {
        h(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    class i extends y0.i {
        i(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: k */
        public void i(d1.k kVar, u uVar) {
            String str = uVar.f15477a;
            if (str == null) {
                kVar.G(1);
            } else {
                kVar.x(1, str);
            }
            b0 b0Var = b0.f15437a;
            kVar.f0(2, (long) b0.j(uVar.f15478b));
            String str2 = uVar.f15479c;
            if (str2 == null) {
                kVar.G(3);
            } else {
                kVar.x(3, str2);
            }
            String str3 = uVar.f15480d;
            if (str3 == null) {
                kVar.G(4);
            } else {
                kVar.x(4, str3);
            }
            byte[] o10 = androidx.work.b.o(uVar.f15481e);
            if (o10 == null) {
                kVar.G(5);
            } else {
                kVar.n0(5, o10);
            }
            byte[] o11 = androidx.work.b.o(uVar.f15482f);
            if (o11 == null) {
                kVar.G(6);
            } else {
                kVar.n0(6, o11);
            }
            kVar.f0(7, uVar.f15483g);
            kVar.f0(8, uVar.f15484h);
            kVar.f0(9, uVar.f15485i);
            kVar.f0(10, (long) uVar.f15487k);
            kVar.f0(11, (long) b0.a(uVar.f15488l));
            kVar.f0(12, uVar.f15489m);
            kVar.f0(13, uVar.f15490n);
            kVar.f0(14, uVar.f15491o);
            kVar.f0(15, uVar.f15492p);
            kVar.f0(16, uVar.f15493q ? 1 : 0);
            kVar.f0(17, (long) b0.h(uVar.f15494r));
            kVar.f0(18, (long) uVar.g());
            kVar.f0(19, (long) uVar.d());
            kVar.f0(20, uVar.e());
            kVar.f0(21, (long) uVar.f());
            kVar.f0(22, (long) uVar.h());
            m1.d dVar = uVar.f15486j;
            if (dVar != null) {
                kVar.f0(23, (long) b0.g(dVar.d()));
                kVar.f0(24, dVar.g() ? 1 : 0);
                kVar.f0(25, dVar.h() ? 1 : 0);
                kVar.f0(26, dVar.f() ? 1 : 0);
                kVar.f0(27, dVar.i() ? 1 : 0);
                kVar.f0(28, dVar.b());
                kVar.f0(29, dVar.a());
                byte[] i10 = b0.i(dVar.c());
                if (i10 != null) {
                    kVar.n0(30, i10);
                    return;
                }
            } else {
                kVar.G(23);
                kVar.G(24);
                kVar.G(25);
                kVar.G(26);
                kVar.G(27);
                kVar.G(28);
                kVar.G(29);
            }
            kVar.G(30);
        }
    }

    class j extends y0.h {
        j(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    class k extends a0 {
        k(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    class l extends a0 {
        l(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    class m extends a0 {
        m(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    class n extends a0 {
        n(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    class o extends a0 {
        o(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    class p extends a0 {
        p(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    class q extends a0 {
        q(u uVar) {
            super(uVar);
        }

        public String e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public w(u uVar) {
        this.f15502a = uVar;
        this.f15503b = new i(uVar);
        this.f15504c = new j(uVar);
        this.f15505d = new k(uVar);
        this.f15506e = new l(uVar);
        this.f15507f = new m(uVar);
        this.f15508g = new n(uVar);
        this.f15509h = new o(uVar);
        this.f15510i = new p(uVar);
        this.f15511j = new q(uVar);
        this.f15512k = new a(uVar);
        this.f15513l = new b(uVar);
        this.f15514m = new c(uVar);
        this.f15515n = new d(uVar);
        this.f15516o = new e(uVar);
        this.f15517p = new f(uVar);
        this.f15518q = new g(uVar);
        this.f15519r = new h(uVar);
    }

    public static List A() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f15502a.d();
        d1.k b10 = this.f15505d.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        this.f15502a.e();
        try {
            b10.C();
            this.f15502a.A();
        } finally {
            this.f15502a.i();
            this.f15505d.h(b10);
        }
    }

    public void b(String str, long j10) {
        this.f15502a.d();
        d1.k b10 = this.f15510i.b();
        b10.f0(1, j10);
        if (str == null) {
            b10.G(2);
        } else {
            b10.x(2, str);
        }
        this.f15502a.e();
        try {
            b10.C();
            this.f15502a.A();
        } finally {
            this.f15502a.i();
            this.f15510i.h(b10);
        }
    }

    public List c() {
        x xVar;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x f10 = x.f("SELECT * FROM workspec WHERE state=1", 0);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            int e10 = a1.a.e(b10, "id");
            int e11 = a1.a.e(b10, "state");
            int e12 = a1.a.e(b10, "worker_class_name");
            int e13 = a1.a.e(b10, "input_merger_class_name");
            int e14 = a1.a.e(b10, "input");
            int e15 = a1.a.e(b10, "output");
            int e16 = a1.a.e(b10, "initial_delay");
            int e17 = a1.a.e(b10, "interval_duration");
            int e18 = a1.a.e(b10, "flex_duration");
            int e19 = a1.a.e(b10, "run_attempt_count");
            int e20 = a1.a.e(b10, "backoff_policy");
            int e21 = a1.a.e(b10, "backoff_delay_duration");
            int e22 = a1.a.e(b10, "last_enqueue_time");
            int e23 = a1.a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = a1.a.e(b10, "schedule_requested_at");
                int e25 = a1.a.e(b10, "run_in_foreground");
                int e26 = a1.a.e(b10, "out_of_quota_policy");
                int e27 = a1.a.e(b10, "period_count");
                int e28 = a1.a.e(b10, "generation");
                int e29 = a1.a.e(b10, "next_schedule_time_override");
                int e30 = a1.a.e(b10, "next_schedule_time_override_generation");
                int e31 = a1.a.e(b10, "stop_reason");
                int e32 = a1.a.e(b10, "required_network_type");
                int e33 = a1.a.e(b10, "requires_charging");
                int e34 = a1.a.e(b10, "requires_device_idle");
                int e35 = a1.a.e(b10, "requires_battery_not_low");
                int e36 = a1.a.e(b10, "requires_storage_not_low");
                int e37 = a1.a.e(b10, "trigger_content_update_delay");
                int e38 = a1.a.e(b10, "trigger_max_content_delay");
                int e39 = a1.a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.isNull(e10) ? null : b10.getString(e10);
                    m1.x f11 = b0.f(b10.getInt(e11));
                    String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                    String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    m1.a c10 = b0.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i17 = i15;
                    long j15 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j16 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    r e40 = b0.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j17 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    m1.n d10 = b0.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j19 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    e39 = i33;
                    arrayList.add(new u(string, f11, string2, string3, g10, g11, j10, j11, j12, new m1.d(d10, z11, z12, z13, z14, j18, j19, b0.b(b10.isNull(i33) ? null : b10.getBlob(i33))), i16, c10, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.l();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.l();
            throw th;
        }
    }

    public void d(String str) {
        this.f15502a.d();
        d1.k b10 = this.f15508g.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        this.f15502a.e();
        try {
            b10.C();
            this.f15502a.A();
        } finally {
            this.f15502a.i();
            this.f15508g.h(b10);
        }
    }

    public boolean e() {
        boolean z10 = false;
        x f10 = x.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst() && b10.getInt(0) != 0) {
                z10 = true;
            }
            return z10;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public int f(String str, long j10) {
        this.f15502a.d();
        d1.k b10 = this.f15515n.b();
        b10.f0(1, j10);
        if (str == null) {
            b10.G(2);
        } else {
            b10.x(2, str);
        }
        this.f15502a.e();
        try {
            int C = b10.C();
            this.f15502a.A();
            return C;
        } finally {
            this.f15502a.i();
            this.f15515n.h(b10);
        }
    }

    public List g(String str) {
        x f10 = x.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
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

    public List h(String str) {
        x f10 = x.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(new u.b(b10.isNull(0) ? null : b10.getString(0), b0.f(b10.getInt(1))));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public List i() {
        x xVar;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            int e10 = a1.a.e(b10, "id");
            int e11 = a1.a.e(b10, "state");
            int e12 = a1.a.e(b10, "worker_class_name");
            int e13 = a1.a.e(b10, "input_merger_class_name");
            int e14 = a1.a.e(b10, "input");
            int e15 = a1.a.e(b10, "output");
            int e16 = a1.a.e(b10, "initial_delay");
            int e17 = a1.a.e(b10, "interval_duration");
            int e18 = a1.a.e(b10, "flex_duration");
            int e19 = a1.a.e(b10, "run_attempt_count");
            int e20 = a1.a.e(b10, "backoff_policy");
            int e21 = a1.a.e(b10, "backoff_delay_duration");
            int e22 = a1.a.e(b10, "last_enqueue_time");
            int e23 = a1.a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = a1.a.e(b10, "schedule_requested_at");
                int e25 = a1.a.e(b10, "run_in_foreground");
                int e26 = a1.a.e(b10, "out_of_quota_policy");
                int e27 = a1.a.e(b10, "period_count");
                int e28 = a1.a.e(b10, "generation");
                int e29 = a1.a.e(b10, "next_schedule_time_override");
                int e30 = a1.a.e(b10, "next_schedule_time_override_generation");
                int e31 = a1.a.e(b10, "stop_reason");
                int e32 = a1.a.e(b10, "required_network_type");
                int e33 = a1.a.e(b10, "requires_charging");
                int e34 = a1.a.e(b10, "requires_device_idle");
                int e35 = a1.a.e(b10, "requires_battery_not_low");
                int e36 = a1.a.e(b10, "requires_storage_not_low");
                int e37 = a1.a.e(b10, "trigger_content_update_delay");
                int e38 = a1.a.e(b10, "trigger_max_content_delay");
                int e39 = a1.a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.isNull(e10) ? null : b10.getString(e10);
                    m1.x f11 = b0.f(b10.getInt(e11));
                    String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                    String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    m1.a c10 = b0.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i17 = i15;
                    long j15 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j16 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    r e40 = b0.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j17 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    m1.n d10 = b0.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j19 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    e39 = i33;
                    arrayList.add(new u(string, f11, string2, string3, g10, g11, j10, j11, j12, new m1.d(d10, z11, z12, z13, z14, j18, j19, b0.b(b10.isNull(i33) ? null : b10.getBlob(i33))), i16, c10, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.l();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.l();
            throw th;
        }
    }

    public List j(long j10) {
        x xVar;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x f10 = x.f("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        f10.f0(1, j10);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            int e10 = a1.a.e(b10, "id");
            int e11 = a1.a.e(b10, "state");
            int e12 = a1.a.e(b10, "worker_class_name");
            int e13 = a1.a.e(b10, "input_merger_class_name");
            int e14 = a1.a.e(b10, "input");
            int e15 = a1.a.e(b10, "output");
            int e16 = a1.a.e(b10, "initial_delay");
            int e17 = a1.a.e(b10, "interval_duration");
            int e18 = a1.a.e(b10, "flex_duration");
            int e19 = a1.a.e(b10, "run_attempt_count");
            int e20 = a1.a.e(b10, "backoff_policy");
            int e21 = a1.a.e(b10, "backoff_delay_duration");
            int e22 = a1.a.e(b10, "last_enqueue_time");
            int e23 = a1.a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = a1.a.e(b10, "schedule_requested_at");
                int e25 = a1.a.e(b10, "run_in_foreground");
                int e26 = a1.a.e(b10, "out_of_quota_policy");
                int e27 = a1.a.e(b10, "period_count");
                int e28 = a1.a.e(b10, "generation");
                int e29 = a1.a.e(b10, "next_schedule_time_override");
                int e30 = a1.a.e(b10, "next_schedule_time_override_generation");
                int e31 = a1.a.e(b10, "stop_reason");
                int e32 = a1.a.e(b10, "required_network_type");
                int e33 = a1.a.e(b10, "requires_charging");
                int e34 = a1.a.e(b10, "requires_device_idle");
                int e35 = a1.a.e(b10, "requires_battery_not_low");
                int e36 = a1.a.e(b10, "requires_storage_not_low");
                int e37 = a1.a.e(b10, "trigger_content_update_delay");
                int e38 = a1.a.e(b10, "trigger_max_content_delay");
                int e39 = a1.a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.isNull(e10) ? null : b10.getString(e10);
                    m1.x f11 = b0.f(b10.getInt(e11));
                    String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                    String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                    long j11 = b10.getLong(e16);
                    long j12 = b10.getLong(e17);
                    long j13 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    m1.a c10 = b0.c(b10.getInt(e20));
                    long j14 = b10.getLong(e21);
                    long j15 = b10.getLong(e22);
                    int i17 = i15;
                    long j16 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j17 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    r e40 = b0.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j18 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    m1.n d10 = b0.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j19 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j20 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    e39 = i33;
                    arrayList.add(new u(string, f11, string2, string3, g10, g11, j11, j12, j13, new m1.d(d10, z11, z12, z13, z14, j19, j20, b0.b(b10.isNull(i33) ? null : b10.getBlob(i33))), i16, c10, j14, j15, j16, j17, z10, e40, i22, i24, j18, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.l();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.l();
            throw th;
        }
    }

    public m1.x k(String str) {
        x f10 = x.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15502a.d();
        m1.x xVar = null;
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                Integer valueOf = b10.isNull(0) ? null : Integer.valueOf(b10.getInt(0));
                if (valueOf != null) {
                    b0 b0Var = b0.f15437a;
                    xVar = b0.f(valueOf.intValue());
                }
            }
            return xVar;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public List l(int i10) {
        x xVar;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        f10.f0(1, (long) i10);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            int e10 = a1.a.e(b10, "id");
            int e11 = a1.a.e(b10, "state");
            int e12 = a1.a.e(b10, "worker_class_name");
            int e13 = a1.a.e(b10, "input_merger_class_name");
            int e14 = a1.a.e(b10, "input");
            int e15 = a1.a.e(b10, "output");
            int e16 = a1.a.e(b10, "initial_delay");
            int e17 = a1.a.e(b10, "interval_duration");
            int e18 = a1.a.e(b10, "flex_duration");
            int e19 = a1.a.e(b10, "run_attempt_count");
            int e20 = a1.a.e(b10, "backoff_policy");
            int e21 = a1.a.e(b10, "backoff_delay_duration");
            int e22 = a1.a.e(b10, "last_enqueue_time");
            int e23 = a1.a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = a1.a.e(b10, "schedule_requested_at");
                int e25 = a1.a.e(b10, "run_in_foreground");
                int e26 = a1.a.e(b10, "out_of_quota_policy");
                int e27 = a1.a.e(b10, "period_count");
                int e28 = a1.a.e(b10, "generation");
                int e29 = a1.a.e(b10, "next_schedule_time_override");
                int e30 = a1.a.e(b10, "next_schedule_time_override_generation");
                int e31 = a1.a.e(b10, "stop_reason");
                int e32 = a1.a.e(b10, "required_network_type");
                int e33 = a1.a.e(b10, "requires_charging");
                int e34 = a1.a.e(b10, "requires_device_idle");
                int e35 = a1.a.e(b10, "requires_battery_not_low");
                int e36 = a1.a.e(b10, "requires_storage_not_low");
                int e37 = a1.a.e(b10, "trigger_content_update_delay");
                int e38 = a1.a.e(b10, "trigger_max_content_delay");
                int e39 = a1.a.e(b10, "content_uri_triggers");
                int i16 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.isNull(e10) ? null : b10.getString(e10);
                    m1.x f11 = b0.f(b10.getInt(e11));
                    String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                    String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i17 = b10.getInt(e19);
                    m1.a c10 = b0.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i18 = i16;
                    long j15 = b10.getLong(i18);
                    int i19 = e10;
                    int i20 = e24;
                    long j16 = b10.getLong(i20);
                    e24 = i20;
                    int i21 = e25;
                    if (b10.getInt(i21) != 0) {
                        e25 = i21;
                        i11 = e26;
                        z10 = true;
                    } else {
                        e25 = i21;
                        i11 = e26;
                        z10 = false;
                    }
                    r e40 = b0.e(b10.getInt(i11));
                    e26 = i11;
                    int i22 = e27;
                    int i23 = b10.getInt(i22);
                    e27 = i22;
                    int i24 = e28;
                    int i25 = b10.getInt(i24);
                    e28 = i24;
                    int i26 = e29;
                    long j17 = b10.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    int i28 = b10.getInt(i27);
                    e30 = i27;
                    int i29 = e31;
                    int i30 = b10.getInt(i29);
                    e31 = i29;
                    int i31 = e32;
                    m1.n d10 = b0.d(b10.getInt(i31));
                    e32 = i31;
                    int i32 = e33;
                    if (b10.getInt(i32) != 0) {
                        e33 = i32;
                        i12 = e34;
                        z11 = true;
                    } else {
                        e33 = i32;
                        i12 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e34 = i12;
                        i13 = e35;
                        z12 = true;
                    } else {
                        e34 = i12;
                        i13 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e35 = i13;
                        i14 = e36;
                        z13 = true;
                    } else {
                        e35 = i13;
                        i14 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i14) != 0) {
                        e36 = i14;
                        i15 = e37;
                        z14 = true;
                    } else {
                        e36 = i14;
                        i15 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i15);
                    e37 = i15;
                    int i33 = e38;
                    long j19 = b10.getLong(i33);
                    e38 = i33;
                    int i34 = e39;
                    e39 = i34;
                    arrayList.add(new u(string, f11, string2, string3, g10, g11, j10, j11, j12, new m1.d(d10, z11, z12, z13, z14, j18, j19, b0.b(b10.isNull(i34) ? null : b10.getBlob(i34))), i17, c10, j13, j14, j15, j16, z10, e40, i23, i25, j17, i28, i30));
                    e10 = i19;
                    i16 = i18;
                }
                b10.close();
                xVar.l();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.l();
            throw th;
        }
    }

    public u m(String str) {
        x xVar;
        u uVar;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        String str2 = str;
        x f10 = x.f("SELECT * FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            f10.G(1);
        } else {
            f10.x(1, str2);
        }
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            int e10 = a1.a.e(b10, "id");
            int e11 = a1.a.e(b10, "state");
            int e12 = a1.a.e(b10, "worker_class_name");
            int e13 = a1.a.e(b10, "input_merger_class_name");
            int e14 = a1.a.e(b10, "input");
            int e15 = a1.a.e(b10, "output");
            int e16 = a1.a.e(b10, "initial_delay");
            int e17 = a1.a.e(b10, "interval_duration");
            int e18 = a1.a.e(b10, "flex_duration");
            int e19 = a1.a.e(b10, "run_attempt_count");
            int e20 = a1.a.e(b10, "backoff_policy");
            int e21 = a1.a.e(b10, "backoff_delay_duration");
            int e22 = a1.a.e(b10, "last_enqueue_time");
            int e23 = a1.a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = a1.a.e(b10, "schedule_requested_at");
                int e25 = a1.a.e(b10, "run_in_foreground");
                int e26 = a1.a.e(b10, "out_of_quota_policy");
                int e27 = a1.a.e(b10, "period_count");
                int e28 = a1.a.e(b10, "generation");
                int e29 = a1.a.e(b10, "next_schedule_time_override");
                int e30 = a1.a.e(b10, "next_schedule_time_override_generation");
                int e31 = a1.a.e(b10, "stop_reason");
                int e32 = a1.a.e(b10, "required_network_type");
                int e33 = a1.a.e(b10, "requires_charging");
                int e34 = a1.a.e(b10, "requires_device_idle");
                int e35 = a1.a.e(b10, "requires_battery_not_low");
                int e36 = a1.a.e(b10, "requires_storage_not_low");
                int e37 = a1.a.e(b10, "trigger_content_update_delay");
                int e38 = a1.a.e(b10, "trigger_max_content_delay");
                int e39 = a1.a.e(b10, "content_uri_triggers");
                if (b10.moveToFirst()) {
                    String string = b10.isNull(e10) ? null : b10.getString(e10);
                    m1.x f11 = b0.f(b10.getInt(e11));
                    String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                    String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i15 = b10.getInt(e19);
                    m1.a c10 = b0.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    long j15 = b10.getLong(e23);
                    long j16 = b10.getLong(e24);
                    if (b10.getInt(e25) != 0) {
                        i10 = e26;
                        z10 = true;
                    } else {
                        i10 = e26;
                        z10 = false;
                    }
                    r e40 = b0.e(b10.getInt(i10));
                    int i16 = b10.getInt(e27);
                    int i17 = b10.getInt(e28);
                    long j17 = b10.getLong(e29);
                    int i18 = b10.getInt(e30);
                    int i19 = b10.getInt(e31);
                    m1.n d10 = b0.d(b10.getInt(e32));
                    if (b10.getInt(e33) != 0) {
                        i11 = e34;
                        z11 = true;
                    } else {
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        i12 = e35;
                        z12 = true;
                    } else {
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        i13 = e36;
                        z13 = true;
                    } else {
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        i14 = e37;
                        z14 = true;
                    } else {
                        i14 = e37;
                        z14 = false;
                    }
                    uVar = new u(string, f11, string2, string3, g10, g11, j10, j11, j12, new m1.d(d10, z11, z12, z13, z14, b10.getLong(i14), b10.getLong(e38), b0.b(b10.isNull(e39) ? null : b10.getBlob(e39))), i15, c10, j13, j14, j15, j16, z10, e40, i16, i17, j17, i18, i19);
                } else {
                    uVar = null;
                }
                b10.close();
                xVar.l();
                return uVar;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.l();
            throw th;
        }
    }

    public void n(String str, int i10) {
        this.f15502a.d();
        d1.k b10 = this.f15519r.b();
        b10.f0(1, (long) i10);
        if (str == null) {
            b10.G(2);
        } else {
            b10.x(2, str);
        }
        this.f15502a.e();
        try {
            b10.C();
            this.f15502a.A();
        } finally {
            this.f15502a.i();
            this.f15519r.h(b10);
        }
    }

    public int o(String str) {
        this.f15502a.d();
        d1.k b10 = this.f15512k.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        this.f15502a.e();
        try {
            int C = b10.C();
            this.f15502a.A();
            return C;
        } finally {
            this.f15502a.i();
            this.f15512k.h(b10);
        }
    }

    public int p(m1.x xVar, String str) {
        this.f15502a.d();
        d1.k b10 = this.f15506e.b();
        b10.f0(1, (long) b0.j(xVar));
        if (str == null) {
            b10.G(2);
        } else {
            b10.x(2, str);
        }
        this.f15502a.e();
        try {
            int C = b10.C();
            this.f15502a.A();
            return C;
        } finally {
            this.f15502a.i();
            this.f15506e.h(b10);
        }
    }

    public int q(String str) {
        this.f15502a.d();
        d1.k b10 = this.f15507f.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        this.f15502a.e();
        try {
            int C = b10.C();
            this.f15502a.A();
            return C;
        } finally {
            this.f15502a.i();
            this.f15507f.h(b10);
        }
    }

    public List r(String str) {
        x f10 = x.f("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f10.G(1);
        } else {
            f10.x(1, str);
        }
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b10.getCount());
            while (b10.moveToNext()) {
                arrayList.add(androidx.work.b.g(b10.isNull(0) ? null : b10.getBlob(0)));
            }
            return arrayList;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public int s(String str) {
        this.f15502a.d();
        d1.k b10 = this.f15511j.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        this.f15502a.e();
        try {
            int C = b10.C();
            this.f15502a.A();
            return C;
        } finally {
            this.f15502a.i();
            this.f15511j.h(b10);
        }
    }

    public int t() {
        int i10 = 0;
        x f10 = x.f("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            if (b10.moveToFirst()) {
                i10 = b10.getInt(0);
            }
            return i10;
        } finally {
            b10.close();
            f10.l();
        }
    }

    public void u(u uVar) {
        this.f15502a.d();
        this.f15502a.e();
        try {
            this.f15503b.j(uVar);
            this.f15502a.A();
        } finally {
            this.f15502a.i();
        }
    }

    public void v(String str, int i10) {
        this.f15502a.d();
        d1.k b10 = this.f15514m.b();
        if (str == null) {
            b10.G(1);
        } else {
            b10.x(1, str);
        }
        b10.f0(2, (long) i10);
        this.f15502a.e();
        try {
            b10.C();
            this.f15502a.A();
        } finally {
            this.f15502a.i();
            this.f15514m.h(b10);
        }
    }

    public List w() {
        x xVar;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            int e10 = a1.a.e(b10, "id");
            int e11 = a1.a.e(b10, "state");
            int e12 = a1.a.e(b10, "worker_class_name");
            int e13 = a1.a.e(b10, "input_merger_class_name");
            int e14 = a1.a.e(b10, "input");
            int e15 = a1.a.e(b10, "output");
            int e16 = a1.a.e(b10, "initial_delay");
            int e17 = a1.a.e(b10, "interval_duration");
            int e18 = a1.a.e(b10, "flex_duration");
            int e19 = a1.a.e(b10, "run_attempt_count");
            int e20 = a1.a.e(b10, "backoff_policy");
            int e21 = a1.a.e(b10, "backoff_delay_duration");
            int e22 = a1.a.e(b10, "last_enqueue_time");
            int e23 = a1.a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = a1.a.e(b10, "schedule_requested_at");
                int e25 = a1.a.e(b10, "run_in_foreground");
                int e26 = a1.a.e(b10, "out_of_quota_policy");
                int e27 = a1.a.e(b10, "period_count");
                int e28 = a1.a.e(b10, "generation");
                int e29 = a1.a.e(b10, "next_schedule_time_override");
                int e30 = a1.a.e(b10, "next_schedule_time_override_generation");
                int e31 = a1.a.e(b10, "stop_reason");
                int e32 = a1.a.e(b10, "required_network_type");
                int e33 = a1.a.e(b10, "requires_charging");
                int e34 = a1.a.e(b10, "requires_device_idle");
                int e35 = a1.a.e(b10, "requires_battery_not_low");
                int e36 = a1.a.e(b10, "requires_storage_not_low");
                int e37 = a1.a.e(b10, "trigger_content_update_delay");
                int e38 = a1.a.e(b10, "trigger_max_content_delay");
                int e39 = a1.a.e(b10, "content_uri_triggers");
                int i15 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.isNull(e10) ? null : b10.getString(e10);
                    m1.x f11 = b0.f(b10.getInt(e11));
                    String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                    String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i16 = b10.getInt(e19);
                    m1.a c10 = b0.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i17 = i15;
                    long j15 = b10.getLong(i17);
                    int i18 = e10;
                    int i19 = e24;
                    long j16 = b10.getLong(i19);
                    e24 = i19;
                    int i20 = e25;
                    if (b10.getInt(i20) != 0) {
                        e25 = i20;
                        i10 = e26;
                        z10 = true;
                    } else {
                        e25 = i20;
                        i10 = e26;
                        z10 = false;
                    }
                    r e40 = b0.e(b10.getInt(i10));
                    e26 = i10;
                    int i21 = e27;
                    int i22 = b10.getInt(i21);
                    e27 = i21;
                    int i23 = e28;
                    int i24 = b10.getInt(i23);
                    e28 = i23;
                    int i25 = e29;
                    long j17 = b10.getLong(i25);
                    e29 = i25;
                    int i26 = e30;
                    int i27 = b10.getInt(i26);
                    e30 = i26;
                    int i28 = e31;
                    int i29 = b10.getInt(i28);
                    e31 = i28;
                    int i30 = e32;
                    m1.n d10 = b0.d(b10.getInt(i30));
                    e32 = i30;
                    int i31 = e33;
                    if (b10.getInt(i31) != 0) {
                        e33 = i31;
                        i11 = e34;
                        z11 = true;
                    } else {
                        e33 = i31;
                        i11 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i11) != 0) {
                        e34 = i11;
                        i12 = e35;
                        z12 = true;
                    } else {
                        e34 = i11;
                        i12 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e35 = i12;
                        i13 = e36;
                        z13 = true;
                    } else {
                        e35 = i12;
                        i13 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e36 = i13;
                        i14 = e37;
                        z14 = true;
                    } else {
                        e36 = i13;
                        i14 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i14);
                    e37 = i14;
                    int i32 = e38;
                    long j19 = b10.getLong(i32);
                    e38 = i32;
                    int i33 = e39;
                    e39 = i33;
                    arrayList.add(new u(string, f11, string2, string3, g10, g11, j10, j11, j12, new m1.d(d10, z11, z12, z13, z14, j18, j19, b0.b(b10.isNull(i33) ? null : b10.getBlob(i33))), i16, c10, j13, j14, j15, j16, z10, e40, i22, i24, j17, i27, i29));
                    e10 = i18;
                    i15 = i17;
                }
                b10.close();
                xVar.l();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.l();
            throw th;
        }
    }

    public List x(int i10) {
        x xVar;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        x f10 = x.f("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        f10.f0(1, (long) i10);
        this.f15502a.d();
        Cursor b10 = a1.b.b(this.f15502a, f10, false, (CancellationSignal) null);
        try {
            int e10 = a1.a.e(b10, "id");
            int e11 = a1.a.e(b10, "state");
            int e12 = a1.a.e(b10, "worker_class_name");
            int e13 = a1.a.e(b10, "input_merger_class_name");
            int e14 = a1.a.e(b10, "input");
            int e15 = a1.a.e(b10, "output");
            int e16 = a1.a.e(b10, "initial_delay");
            int e17 = a1.a.e(b10, "interval_duration");
            int e18 = a1.a.e(b10, "flex_duration");
            int e19 = a1.a.e(b10, "run_attempt_count");
            int e20 = a1.a.e(b10, "backoff_policy");
            int e21 = a1.a.e(b10, "backoff_delay_duration");
            int e22 = a1.a.e(b10, "last_enqueue_time");
            int e23 = a1.a.e(b10, "minimum_retention_duration");
            xVar = f10;
            try {
                int e24 = a1.a.e(b10, "schedule_requested_at");
                int e25 = a1.a.e(b10, "run_in_foreground");
                int e26 = a1.a.e(b10, "out_of_quota_policy");
                int e27 = a1.a.e(b10, "period_count");
                int e28 = a1.a.e(b10, "generation");
                int e29 = a1.a.e(b10, "next_schedule_time_override");
                int e30 = a1.a.e(b10, "next_schedule_time_override_generation");
                int e31 = a1.a.e(b10, "stop_reason");
                int e32 = a1.a.e(b10, "required_network_type");
                int e33 = a1.a.e(b10, "requires_charging");
                int e34 = a1.a.e(b10, "requires_device_idle");
                int e35 = a1.a.e(b10, "requires_battery_not_low");
                int e36 = a1.a.e(b10, "requires_storage_not_low");
                int e37 = a1.a.e(b10, "trigger_content_update_delay");
                int e38 = a1.a.e(b10, "trigger_max_content_delay");
                int e39 = a1.a.e(b10, "content_uri_triggers");
                int i16 = e23;
                ArrayList arrayList = new ArrayList(b10.getCount());
                while (b10.moveToNext()) {
                    String string = b10.isNull(e10) ? null : b10.getString(e10);
                    m1.x f11 = b0.f(b10.getInt(e11));
                    String string2 = b10.isNull(e12) ? null : b10.getString(e12);
                    String string3 = b10.isNull(e13) ? null : b10.getString(e13);
                    androidx.work.b g10 = androidx.work.b.g(b10.isNull(e14) ? null : b10.getBlob(e14));
                    androidx.work.b g11 = androidx.work.b.g(b10.isNull(e15) ? null : b10.getBlob(e15));
                    long j10 = b10.getLong(e16);
                    long j11 = b10.getLong(e17);
                    long j12 = b10.getLong(e18);
                    int i17 = b10.getInt(e19);
                    m1.a c10 = b0.c(b10.getInt(e20));
                    long j13 = b10.getLong(e21);
                    long j14 = b10.getLong(e22);
                    int i18 = i16;
                    long j15 = b10.getLong(i18);
                    int i19 = e10;
                    int i20 = e24;
                    long j16 = b10.getLong(i20);
                    e24 = i20;
                    int i21 = e25;
                    if (b10.getInt(i21) != 0) {
                        e25 = i21;
                        i11 = e26;
                        z10 = true;
                    } else {
                        e25 = i21;
                        i11 = e26;
                        z10 = false;
                    }
                    r e40 = b0.e(b10.getInt(i11));
                    e26 = i11;
                    int i22 = e27;
                    int i23 = b10.getInt(i22);
                    e27 = i22;
                    int i24 = e28;
                    int i25 = b10.getInt(i24);
                    e28 = i24;
                    int i26 = e29;
                    long j17 = b10.getLong(i26);
                    e29 = i26;
                    int i27 = e30;
                    int i28 = b10.getInt(i27);
                    e30 = i27;
                    int i29 = e31;
                    int i30 = b10.getInt(i29);
                    e31 = i29;
                    int i31 = e32;
                    m1.n d10 = b0.d(b10.getInt(i31));
                    e32 = i31;
                    int i32 = e33;
                    if (b10.getInt(i32) != 0) {
                        e33 = i32;
                        i12 = e34;
                        z11 = true;
                    } else {
                        e33 = i32;
                        i12 = e34;
                        z11 = false;
                    }
                    if (b10.getInt(i12) != 0) {
                        e34 = i12;
                        i13 = e35;
                        z12 = true;
                    } else {
                        e34 = i12;
                        i13 = e35;
                        z12 = false;
                    }
                    if (b10.getInt(i13) != 0) {
                        e35 = i13;
                        i14 = e36;
                        z13 = true;
                    } else {
                        e35 = i13;
                        i14 = e36;
                        z13 = false;
                    }
                    if (b10.getInt(i14) != 0) {
                        e36 = i14;
                        i15 = e37;
                        z14 = true;
                    } else {
                        e36 = i14;
                        i15 = e37;
                        z14 = false;
                    }
                    long j18 = b10.getLong(i15);
                    e37 = i15;
                    int i33 = e38;
                    long j19 = b10.getLong(i33);
                    e38 = i33;
                    int i34 = e39;
                    e39 = i34;
                    arrayList.add(new u(string, f11, string2, string3, g10, g11, j10, j11, j12, new m1.d(d10, z11, z12, z13, z14, j18, j19, b0.b(b10.isNull(i34) ? null : b10.getBlob(i34))), i17, c10, j13, j14, j15, j16, z10, e40, i23, i25, j17, i28, i30));
                    e10 = i19;
                    i16 = i18;
                }
                b10.close();
                xVar.l();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                b10.close();
                xVar.l();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            xVar = f10;
            b10.close();
            xVar.l();
            throw th;
        }
    }

    public void y(String str, androidx.work.b bVar) {
        this.f15502a.d();
        d1.k b10 = this.f15509h.b();
        byte[] o10 = androidx.work.b.o(bVar);
        if (o10 == null) {
            b10.G(1);
        } else {
            b10.n0(1, o10);
        }
        if (str == null) {
            b10.G(2);
        } else {
            b10.x(2, str);
        }
        this.f15502a.e();
        try {
            b10.C();
            this.f15502a.A();
        } finally {
            this.f15502a.i();
            this.f15509h.h(b10);
        }
    }

    public int z() {
        this.f15502a.d();
        d1.k b10 = this.f15516o.b();
        this.f15502a.e();
        try {
            int C = b10.C();
            this.f15502a.A();
            return C;
        } finally {
            this.f15502a.i();
            this.f15516o.h(b10);
        }
    }
}
