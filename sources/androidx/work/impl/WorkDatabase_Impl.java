package androidx.work.impl;

import a1.d;
import d1.g;
import d1.h;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r1.a0;
import r1.b;
import r1.c;
import r1.e;
import r1.f;
import r1.j;
import r1.k;
import r1.o;
import r1.p;
import r1.r;
import r1.s;
import r1.v;
import r1.z;
import y0.u;
import y0.w;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: q  reason: collision with root package name */
    private volatile v f4113q;

    /* renamed from: r  reason: collision with root package name */
    private volatile b f4114r;

    /* renamed from: s  reason: collision with root package name */
    private volatile z f4115s;

    /* renamed from: t  reason: collision with root package name */
    private volatile j f4116t;

    /* renamed from: u  reason: collision with root package name */
    private volatile o f4117u;

    /* renamed from: v  reason: collision with root package name */
    private volatile r f4118v;

    /* renamed from: w  reason: collision with root package name */
    private volatile e f4119w;

    class a extends w.b {
        a(int i10) {
            super(i10);
        }

        public void a(g gVar) {
            gVar.w("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.w("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            gVar.w("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            gVar.w("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            gVar.w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            gVar.w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            gVar.w("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.w("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            gVar.w("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.w("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.w("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            gVar.w("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            gVar.w("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            gVar.w("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.w("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        public void b(g gVar) {
            gVar.w("DROP TABLE IF EXISTS `Dependency`");
            gVar.w("DROP TABLE IF EXISTS `WorkSpec`");
            gVar.w("DROP TABLE IF EXISTS `WorkTag`");
            gVar.w("DROP TABLE IF EXISTS `SystemIdInfo`");
            gVar.w("DROP TABLE IF EXISTS `WorkName`");
            gVar.w("DROP TABLE IF EXISTS `WorkProgress`");
            gVar.w("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f18396h != null) {
                int size = WorkDatabase_Impl.this.f18396h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) WorkDatabase_Impl.this.f18396h.get(i10)).b(gVar);
                }
            }
        }

        public void c(g gVar) {
            if (WorkDatabase_Impl.this.f18396h != null) {
                int size = WorkDatabase_Impl.this.f18396h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) WorkDatabase_Impl.this.f18396h.get(i10)).a(gVar);
                }
            }
        }

        public void d(g gVar) {
            g unused = WorkDatabase_Impl.this.f18389a = gVar;
            gVar.w("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.u(gVar);
            if (WorkDatabase_Impl.this.f18396h != null) {
                int size = WorkDatabase_Impl.this.f18396h.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((u.b) WorkDatabase_Impl.this.f18396h.get(i10)).c(gVar);
                }
            }
        }

        public void e(g gVar) {
        }

        public void f(g gVar) {
            a1.b.a(gVar);
        }

        public w.c g(g gVar) {
            g gVar2 = gVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new d.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new d.e("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            hashSet2.add(new d.e("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar = new d("Dependency", hashMap, hashSet, hashSet2);
            d a10 = d.a(gVar2, "Dependency");
            if (!dVar.equals(a10)) {
                return new w.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + dVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(30);
            hashMap2.put("id", new d.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new d.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new d.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new d.a("input_merger_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input", new d.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new d.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new d.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new d.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new d.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new d.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new d.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new d.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("last_enqueue_time", new d.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            hashMap2.put("minimum_retention_duration", new d.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new d.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new d.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("out_of_quota_policy", new d.a("out_of_quota_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_count", new d.a("period_count", "INTEGER", true, 0, "0", 1));
            hashMap2.put("generation", new d.a("generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("next_schedule_time_override", new d.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            hashMap2.put("next_schedule_time_override_generation", new d.a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            hashMap2.put("stop_reason", new d.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            hashMap2.put("required_network_type", new d.a("required_network_type", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_charging", new d.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new d.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new d.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new d.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new d.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new d.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new d.a("content_uri_triggers", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new d.e("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
            hashSet4.add(new d.e("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
            d dVar2 = new d("WorkSpec", hashMap2, hashSet3, hashSet4);
            d a11 = d.a(gVar2, "WorkSpec");
            if (!dVar2.equals(a11)) {
                return new w.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + dVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new d.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new d.e("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar3 = new d("WorkTag", hashMap3, hashSet5, hashSet6);
            d a12 = d.a(gVar2, "WorkTag");
            if (!dVar3.equals(a12)) {
                return new w.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + dVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("generation", new d.a("generation", "INTEGER", true, 2, "0", 1));
            hashMap4.put("system_id", new d.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            d dVar4 = new d("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            d a13 = d.a(gVar2, "SystemIdInfo");
            if (!dVar4.equals(a13)) {
                return new w.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + dVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new d.a("name", "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new d.e("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
            d dVar5 = new d("WorkName", hashMap5, hashSet8, hashSet9);
            d a14 = d.a(gVar2, "WorkName");
            if (!dVar5.equals(a14)) {
                return new w.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + dVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new d.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new d.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new d.c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            d dVar6 = new d("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            d a15 = d.a(gVar2, "WorkProgress");
            if (!dVar6.equals(a15)) {
                return new w.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + dVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new d.a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new d.a("long_value", "INTEGER", false, 0, (String) null, 1));
            d dVar7 = new d("Preference", hashMap7, new HashSet(0), new HashSet(0));
            d a16 = d.a(gVar2, "Preference");
            if (dVar7.equals(a16)) {
                return new w.c(true, (String) null);
            }
            return new w.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + dVar7 + "\n Found:\n" + a16);
        }
    }

    public b C() {
        b bVar;
        if (this.f4114r != null) {
            return this.f4114r;
        }
        synchronized (this) {
            try {
                if (this.f4114r == null) {
                    this.f4114r = new c(this);
                }
                bVar = this.f4114r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public e D() {
        e eVar;
        if (this.f4119w != null) {
            return this.f4119w;
        }
        synchronized (this) {
            try {
                if (this.f4119w == null) {
                    this.f4119w = new f(this);
                }
                eVar = this.f4119w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public j E() {
        j jVar;
        if (this.f4116t != null) {
            return this.f4116t;
        }
        synchronized (this) {
            try {
                if (this.f4116t == null) {
                    this.f4116t = new k(this);
                }
                jVar = this.f4116t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }

    public o F() {
        o oVar;
        if (this.f4117u != null) {
            return this.f4117u;
        }
        synchronized (this) {
            try {
                if (this.f4117u == null) {
                    this.f4117u = new p(this);
                }
                oVar = this.f4117u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public r G() {
        r rVar;
        if (this.f4118v != null) {
            return this.f4118v;
        }
        synchronized (this) {
            try {
                if (this.f4118v == null) {
                    this.f4118v = new s(this);
                }
                rVar = this.f4118v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    public v H() {
        v vVar;
        if (this.f4113q != null) {
            return this.f4113q;
        }
        synchronized (this) {
            try {
                if (this.f4113q == null) {
                    this.f4113q = new r1.w(this);
                }
                vVar = this.f4113q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public z I() {
        z zVar;
        if (this.f4115s != null) {
            return this.f4115s;
        }
        synchronized (this) {
            try {
                if (this.f4115s == null) {
                    this.f4115s = new a0(this);
                }
                zVar = this.f4115s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    public y0.o g() {
        return new y0.o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* access modifiers changed from: protected */
    public h h(y0.f fVar) {
        return fVar.f18314c.a(h.b.a(fVar.f18312a).d(fVar.f18313b).c(new w(fVar, new a(20), "7d73d21f1bd82c9e5268b6dcf9fde2cb", "3071c8717539de5d5353f4c8cd59a032")).b());
    }

    public List j(Map map) {
        return Arrays.asList(new z0.b[]{new h0(), new i0(), new j0(), new k0(), new l0(), new m0()});
    }

    public Set o() {
        return new HashSet();
    }

    /* access modifiers changed from: protected */
    public Map p() {
        HashMap hashMap = new HashMap();
        hashMap.put(v.class, r1.w.A());
        hashMap.put(b.class, c.e());
        hashMap.put(z.class, a0.e());
        hashMap.put(j.class, k.j());
        hashMap.put(o.class, p.c());
        hashMap.put(r.class, s.c());
        hashMap.put(e.class, f.c());
        hashMap.put(r1.g.class, r1.h.a());
        return hashMap;
    }
}
