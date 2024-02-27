package d1;

import android.content.Context;
import android.util.Log;
import cm.g;
import cm.l;
import java.io.Closeable;
import java.io.File;

public interface h extends Closeable {

    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final C0127a f9669b = new C0127a((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final int f9670a;

        /* renamed from: d1.h$a$a  reason: collision with other inner class name */
        public static final class C0127a {
            private C0127a() {
            }

            public /* synthetic */ C0127a(g gVar) {
                this();
            }
        }

        public a(int i10) {
            this.f9670a = i10;
        }

        private final void a(String str) {
            if (!p.o(str, ":memory:", true)) {
                int length = str.length() - 1;
                int i10 = 0;
                boolean z10 = false;
                while (i10 <= length) {
                    boolean z11 = l.h(str.charAt(!z10 ? i10 : length), 32) <= 0;
                    if (!z10) {
                        if (!z11) {
                            z10 = true;
                        } else {
                            i10++;
                        }
                    } else if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (str.subSequence(i10, length + 1).toString().length() != 0) {
                    Log.w("SupportSQLite", "deleting the database file: " + str);
                    try {
                        b.a(new File(str));
                    } catch (Exception e10) {
                        Log.w("SupportSQLite", "delete failed: ", e10);
                    }
                }
            }
        }

        public void b(g gVar) {
            l.f(gVar, "db");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r1 != null) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
            r4 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
            if (r4.hasNext() != false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
            r1 = ((android.util.Pair) r4.next()).second;
            cm.l.e(r1, "p.second");
            a((java.lang.String) r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
            r4 = r4.b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
            if (r4 != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
            a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003a */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0038 A[ExcHandler: all (r2v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
          PHI: (r1v12 java.util.List) = (r1v4 java.util.List), (r1v5 java.util.List), (r1v5 java.util.List) binds: [B:6:0x0033, B:9:0x003a, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:6:0x0033] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(d1.g r4) {
            /*
                r3 = this;
                java.lang.String r0 = "p.second"
                java.lang.String r1 = "db"
                cm.l.f(r4, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Corruption reported by sqlite on database: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r2 = ".path"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SupportSQLite"
                android.util.Log.e(r2, r1)
                boolean r1 = r4.isOpen()
                if (r1 != 0) goto L_0x0032
                java.lang.String r4 = r4.b()
                if (r4 == 0) goto L_0x0031
                r3.a(r4)
            L_0x0031:
                return
            L_0x0032:
                r1 = 0
                java.util.List r1 = r4.r()     // Catch:{ SQLiteException -> 0x003a, all -> 0x0038 }
                goto L_0x003a
            L_0x0038:
                r2 = move-exception
                goto L_0x003e
            L_0x003a:
                r4.close()     // Catch:{ IOException -> 0x0067, all -> 0x0038 }
                goto L_0x0067
            L_0x003e:
                if (r1 == 0) goto L_0x005d
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x0046:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x0066
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                cm.l.e(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x0046
            L_0x005d:
                java.lang.String r4 = r4.b()
                if (r4 == 0) goto L_0x0066
                r3.a(r4)
            L_0x0066:
                throw r2
            L_0x0067:
                if (r1 == 0) goto L_0x0086
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r4 = r1.iterator()
            L_0x006f:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L_0x008f
                java.lang.Object r1 = r4.next()
                android.util.Pair r1 = (android.util.Pair) r1
                java.lang.Object r1 = r1.second
                cm.l.e(r1, r0)
                java.lang.String r1 = (java.lang.String) r1
                r3.a(r1)
                goto L_0x006f
            L_0x0086:
                java.lang.String r4 = r4.b()
                if (r4 == 0) goto L_0x008f
                r3.a(r4)
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.h.a.c(d1.g):void");
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g gVar) {
            l.f(gVar, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    public static final class b {

        /* renamed from: f  reason: collision with root package name */
        public static final C0128b f9671f = new C0128b((g) null);

        /* renamed from: a  reason: collision with root package name */
        public final Context f9672a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9673b;

        /* renamed from: c  reason: collision with root package name */
        public final a f9674c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f9675d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f9676e;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private final Context f9677a;

            /* renamed from: b  reason: collision with root package name */
            private String f9678b;

            /* renamed from: c  reason: collision with root package name */
            private a f9679c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f9680d;

            /* renamed from: e  reason: collision with root package name */
            private boolean f9681e;

            public a(Context context) {
                l.f(context, "context");
                this.f9677a = context;
            }

            public a a(boolean z10) {
                this.f9681e = z10;
                return this;
            }

            public b b() {
                String str;
                a aVar = this.f9679c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
                } else if (!this.f9680d || ((str = this.f9678b) != null && str.length() != 0)) {
                    return new b(this.f9677a, this.f9678b, aVar, this.f9680d, this.f9681e);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
            }

            public a c(a aVar) {
                l.f(aVar, "callback");
                this.f9679c = aVar;
                return this;
            }

            public a d(String str) {
                this.f9678b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f9680d = z10;
                return this;
            }
        }

        /* renamed from: d1.h$b$b  reason: collision with other inner class name */
        public static final class C0128b {
            private C0128b() {
            }

            public /* synthetic */ C0128b(g gVar) {
                this();
            }

            public final a a(Context context) {
                l.f(context, "context");
                return new a(context);
            }
        }

        public b(Context context, String str, a aVar, boolean z10, boolean z11) {
            l.f(context, "context");
            l.f(aVar, "callback");
            this.f9672a = context;
            this.f9673b = str;
            this.f9674c = aVar;
            this.f9675d = z10;
            this.f9676e = z11;
        }

        public static final a a(Context context) {
            return f9671f.a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);

    g u0();
}
