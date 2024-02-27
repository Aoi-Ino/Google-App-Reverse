package e1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import cm.g;
import cm.l;
import cm.m;
import d1.h;
import java.io.File;
import java.util.UUID;

public final class d implements h {

    /* renamed from: l  reason: collision with root package name */
    public static final a f9976l = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Context f9977e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final String f9978f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final h.a f9979g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9980h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9981i;

    /* renamed from: j  reason: collision with root package name */
    private final pl.h f9982j = j.a(new C0137d(this));
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public boolean f9983k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private c f9984a;

        public b(c cVar) {
            this.f9984a = cVar;
        }

        public final c a() {
            return this.f9984a;
        }

        public final void b(c cVar) {
            this.f9984a = cVar;
        }
    }

    private static final class c extends SQLiteOpenHelper {

        /* renamed from: l  reason: collision with root package name */
        public static final C0135c f9985l = new C0135c((g) null);

        /* renamed from: e  reason: collision with root package name */
        private final Context f9986e;

        /* renamed from: f  reason: collision with root package name */
        private final b f9987f;

        /* renamed from: g  reason: collision with root package name */
        private final h.a f9988g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f9989h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f9990i;

        /* renamed from: j  reason: collision with root package name */
        private final f1.a f9991j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f9992k;

        private static final class a extends RuntimeException {

            /* renamed from: e  reason: collision with root package name */
            private final b f9993e;

            /* renamed from: f  reason: collision with root package name */
            private final Throwable f9994f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, Throwable th2) {
                super(th2);
                l.f(bVar, "callbackName");
                l.f(th2, "cause");
                this.f9993e = bVar;
                this.f9994f = th2;
            }

            public final b a() {
                return this.f9993e;
            }

            public Throwable getCause() {
                return this.f9994f;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: e1.d$c$c  reason: collision with other inner class name */
        public static final class C0135c {
            private C0135c() {
            }

            public /* synthetic */ C0135c(g gVar) {
                this();
            }

            public final c a(b bVar, SQLiteDatabase sQLiteDatabase) {
                l.f(bVar, "refHolder");
                l.f(sQLiteDatabase, "sqLiteDatabase");
                c a10 = bVar.a();
                if (a10 != null && a10.f(sQLiteDatabase)) {
                    return a10;
                }
                c cVar = new c(sQLiteDatabase);
                bVar.b(cVar);
                return cVar;
            }
        }

        /* renamed from: e1.d$c$d  reason: collision with other inner class name */
        public /* synthetic */ class C0136d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f10001a;

            /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    e1.d$c$b[] r0 = e1.d.c.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    e1.d$c$b r1 = e1.d.c.b.ON_CONFIGURE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    e1.d$c$b r1 = e1.d.c.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    e1.d$c$b r1 = e1.d.c.b.ON_UPGRADE     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    e1.d$c$b r1 = e1.d.c.b.ON_DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    e1.d$c$b r1 = e1.d.c.b.ON_OPEN     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    f10001a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: e1.d.c.C0136d.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, b bVar, h.a aVar, boolean z10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.f9670a, new e(aVar, bVar));
            l.f(context, "context");
            l.f(bVar, "dbRef");
            l.f(aVar, "callback");
            this.f9986e = context;
            this.f9987f = bVar;
            this.f9988g = aVar;
            this.f9989h = z10;
            if (str == null) {
                str = UUID.randomUUID().toString();
                l.e(str, "randomUUID().toString()");
            }
            File cacheDir = context.getCacheDir();
            l.e(cacheDir, "context.cacheDir");
            this.f9991j = new f1.a(str, cacheDir, false);
        }

        /* access modifiers changed from: private */
        public static final void e(h.a aVar, b bVar, SQLiteDatabase sQLiteDatabase) {
            l.f(aVar, "$callback");
            l.f(bVar, "$dbRef");
            C0135c cVar = f9985l;
            l.e(sQLiteDatabase, "dbObj");
            aVar.c(cVar.a(bVar, sQLiteDatabase));
        }

        private final SQLiteDatabase h(boolean z10) {
            SQLiteDatabase writableDatabase = z10 ? super.getWritableDatabase() : super.getReadableDatabase();
            l.e(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|10|12|13|14|15|16) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final android.database.sqlite.SQLiteDatabase l(boolean r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.getDatabaseName()
                if (r0 == 0) goto L_0x0031
                android.content.Context r1 = r4.f9986e
                java.io.File r1 = r1.getDatabasePath(r0)
                java.io.File r1 = r1.getParentFile()
                if (r1 == 0) goto L_0x0031
                r1.mkdirs()
                boolean r2 = r1.isDirectory()
                if (r2 != 0) goto L_0x0031
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Invalid database parent file, not a directory: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.w(r2, r1)
            L_0x0031:
                android.database.sqlite.SQLiteDatabase r5 = r4.h(r5)     // Catch:{ all -> 0x0036 }
                return r5
            L_0x0036:
                super.close()
                r1 = 500(0x1f4, double:2.47E-321)
                java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x003e }
            L_0x003e:
                android.database.sqlite.SQLiteDatabase r5 = r4.h(r5)     // Catch:{ all -> 0x0043 }
                return r5
            L_0x0043:
                r1 = move-exception
                super.close()
                boolean r2 = r1 instanceof e1.d.c.a
                if (r2 == 0) goto L_0x0070
                e1.d$c$a r1 = (e1.d.c.a) r1
                java.lang.Throwable r2 = r1.getCause()
                e1.d$c$b r1 = r1.a()
                int[] r3 = e1.d.c.C0136d.f10001a
                int r1 = r1.ordinal()
                r1 = r3[r1]
                r3 = 1
                if (r1 == r3) goto L_0x006f
                r3 = 2
                if (r1 == r3) goto L_0x006f
                r3 = 3
                if (r1 == r3) goto L_0x006f
                r3 = 4
                if (r1 == r3) goto L_0x006f
                boolean r1 = r2 instanceof android.database.sqlite.SQLiteException
                if (r1 == 0) goto L_0x006e
                goto L_0x007a
            L_0x006e:
                throw r2
            L_0x006f:
                throw r2
            L_0x0070:
                boolean r2 = r1 instanceof android.database.sqlite.SQLiteException
                if (r2 == 0) goto L_0x008b
                if (r0 == 0) goto L_0x008a
                boolean r2 = r4.f9989h
                if (r2 == 0) goto L_0x008a
            L_0x007a:
                android.content.Context r1 = r4.f9986e
                r1.deleteDatabase(r0)
                android.database.sqlite.SQLiteDatabase r5 = r4.h(r5)     // Catch:{ a -> 0x0084 }
                return r5
            L_0x0084:
                r5 = move-exception
                java.lang.Throwable r5 = r5.getCause()
                throw r5
            L_0x008a:
                throw r1
            L_0x008b:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.d.c.l(boolean):android.database.sqlite.SQLiteDatabase");
        }

        public void close() {
            try {
                f1.a.c(this.f9991j, false, 1, (Object) null);
                super.close();
                this.f9987f.b((c) null);
                this.f9992k = false;
            } finally {
                this.f9991j.d();
            }
        }

        public final d1.g f(boolean z10) {
            try {
                this.f9991j.b(!this.f9992k && getDatabaseName() != null);
                this.f9990i = false;
                SQLiteDatabase l10 = l(z10);
                if (this.f9990i) {
                    close();
                    d1.g f10 = f(z10);
                    this.f9991j.d();
                    return f10;
                }
                c g10 = g(l10);
                this.f9991j.d();
                return g10;
            } catch (Throwable th2) {
                this.f9991j.d();
                throw th2;
            }
        }

        public final c g(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            return f9985l.a(this.f9987f, sQLiteDatabase);
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "db");
            try {
                this.f9988g.b(g(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            try {
                this.f9988g.d(g(sQLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            l.f(sQLiteDatabase, "db");
            this.f9990i = true;
            try {
                this.f9988g.e(g(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            l.f(sQLiteDatabase, "db");
            if (!this.f9990i) {
                try {
                    this.f9988g.f(g(sQLiteDatabase));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f9992k = true;
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            l.f(sQLiteDatabase, "sqLiteDatabase");
            this.f9990i = true;
            try {
                this.f9988g.g(g(sQLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }
    }

    /* renamed from: e1.d$d  reason: collision with other inner class name */
    static final class C0137d extends m implements bm.a {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f10002e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0137d(d dVar) {
            super(0);
            this.f10002e = dVar;
        }

        /* renamed from: b */
        public final c a() {
            c cVar;
            if (this.f10002e.f9978f == null || !this.f10002e.f9980h) {
                cVar = new c(this.f10002e.f9977e, this.f10002e.f9978f, new b((c) null), this.f10002e.f9979g, this.f10002e.f9981i);
            } else {
                cVar = new c(this.f10002e.f9977e, new File(d1.d.a(this.f10002e.f9977e), this.f10002e.f9978f).getAbsolutePath(), new b((c) null), this.f10002e.f9979g, this.f10002e.f9981i);
            }
            d1.b.d(cVar, this.f10002e.f9983k);
            return cVar;
        }
    }

    public d(Context context, String str, h.a aVar, boolean z10, boolean z11) {
        l.f(context, "context");
        l.f(aVar, "callback");
        this.f9977e = context;
        this.f9978f = str;
        this.f9979g = aVar;
        this.f9980h = z10;
        this.f9981i = z11;
    }

    private final c n() {
        return (c) this.f9982j.getValue();
    }

    public void close() {
        if (this.f9982j.a()) {
            n().close();
        }
    }

    public String getDatabaseName() {
        return this.f9978f;
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f9982j.a()) {
            d1.b.d(n(), z10);
        }
        this.f9983k = z10;
    }

    public d1.g u0() {
        return n().f(true);
    }
}
