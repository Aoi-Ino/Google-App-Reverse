package y0;

import cm.g;
import cm.l;
import d1.h;
import java.util.List;

public class w extends h.a {

    /* renamed from: g  reason: collision with root package name */
    public static final a f18433g = new a((g) null);

    /* renamed from: c  reason: collision with root package name */
    private f f18434c;

    /* renamed from: d  reason: collision with root package name */
    private final b f18435d;

    /* renamed from: e  reason: collision with root package name */
    private final String f18436e;

    /* renamed from: f  reason: collision with root package name */
    private final String f18437f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            zl.b.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(d1.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                cm.l.f(r3, r0)
                java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r3 = r3.w0(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 != 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                zl.b.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                zl.b.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.w.a.a(d1.g):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
            zl.b.a(r3, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean b(d1.g r3) {
            /*
                r2 = this;
                java.lang.String r0 = "db"
                cm.l.f(r3, r0)
                java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
                android.database.Cursor r3 = r3.w0(r0)
                boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x001c
                int r0 = r3.getInt(r1)     // Catch:{ all -> 0x001a }
                if (r0 == 0) goto L_0x001c
                r1 = 1
                goto L_0x001c
            L_0x001a:
                r0 = move-exception
                goto L_0x0021
            L_0x001c:
                r0 = 0
                zl.b.a(r3, r0)
                return r1
            L_0x0021:
                throw r0     // Catch:{ all -> 0x0022 }
            L_0x0022:
                r1 = move-exception
                zl.b.a(r3, r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.w.a.b(d1.g):boolean");
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f18438a;

        public b(int i10) {
            this.f18438a = i10;
        }

        public abstract void a(d1.g gVar);

        public abstract void b(d1.g gVar);

        public abstract void c(d1.g gVar);

        public abstract void d(d1.g gVar);

        public abstract void e(d1.g gVar);

        public abstract void f(d1.g gVar);

        public abstract c g(d1.g gVar);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f18439a;

        /* renamed from: b  reason: collision with root package name */
        public final String f18440b;

        public c(boolean z10, String str) {
            this.f18439a = z10;
            this.f18440b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(f fVar, b bVar, String str, String str2) {
        super(bVar.f18438a);
        l.f(fVar, "configuration");
        l.f(bVar, "delegate");
        l.f(str, "identityHash");
        l.f(str2, "legacyHash");
        this.f18434c = fVar;
        this.f18435d = bVar;
        this.f18436e = str;
        this.f18437f = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        zl.b.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(d1.g r4) {
        /*
            r3 = this;
            y0.w$a r0 = f18433g
            boolean r0 = r0.b(r4)
            if (r0 == 0) goto L_0x005e
            d1.a r0 = new d1.a
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r0.<init>(r1)
            android.database.Cursor r4 = r4.h0(r0)
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0020 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x0020 }
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            goto L_0x0058
        L_0x0022:
            r0 = r1
        L_0x0023:
            zl.b.a(r4, r1)
            java.lang.String r4 = r3.f18436e
            boolean r4 = cm.l.a(r4, r0)
            if (r4 != 0) goto L_0x0070
            java.lang.String r4 = r3.f18437f
            boolean r4 = cm.l.a(r4, r0)
            if (r4 == 0) goto L_0x0037
            goto L_0x0070
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            java.lang.String r2 = r3.f18436e
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        L_0x0058:
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            zl.b.a(r4, r0)
            throw r1
        L_0x005e:
            y0.w$b r0 = r3.f18435d
            y0.w$c r0 = r0.g(r4)
            boolean r1 = r0.f18439a
            if (r1 == 0) goto L_0x0071
            y0.w$b r0 = r3.f18435d
            r0.e(r4)
            r3.j(r4)
        L_0x0070:
            return
        L_0x0071:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.f18440b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.w.h(d1.g):void");
    }

    private final void i(d1.g gVar) {
        gVar.w("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(d1.g gVar) {
        i(gVar);
        gVar.w(v.a(this.f18436e));
    }

    public void b(d1.g gVar) {
        l.f(gVar, "db");
        super.b(gVar);
    }

    public void d(d1.g gVar) {
        l.f(gVar, "db");
        boolean a10 = f18433g.a(gVar);
        this.f18435d.a(gVar);
        if (!a10) {
            c g10 = this.f18435d.g(gVar);
            if (!g10.f18439a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g10.f18440b);
            }
        }
        j(gVar);
        this.f18435d.c(gVar);
    }

    public void e(d1.g gVar, int i10, int i11) {
        l.f(gVar, "db");
        g(gVar, i10, i11);
    }

    public void f(d1.g gVar) {
        l.f(gVar, "db");
        super.f(gVar);
        h(gVar);
        this.f18435d.d(gVar);
        this.f18434c = null;
    }

    public void g(d1.g gVar, int i10, int i11) {
        List<z0.b> d10;
        l.f(gVar, "db");
        f fVar = this.f18434c;
        if (fVar == null || (d10 = fVar.f18315d.d(i10, i11)) == null) {
            f fVar2 = this.f18434c;
            if (fVar2 == null || fVar2.a(i10, i11)) {
                throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f18435d.b(gVar);
            this.f18435d.a(gVar);
            return;
        }
        this.f18435d.f(gVar);
        for (z0.b a10 : d10) {
            a10.a(gVar);
        }
        c g10 = this.f18435d.g(gVar);
        if (g10.f18439a) {
            this.f18435d.e(gVar);
            j(gVar);
            return;
        }
        throw new IllegalStateException("Migration didn't properly handle: " + g10.f18440b);
    }
}
