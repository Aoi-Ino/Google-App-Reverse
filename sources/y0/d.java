package y0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import bm.l;
import cm.k;
import cm.m;
import d1.e;
import d1.f;
import d1.g;
import d1.h;
import d1.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pl.x;

public final class d implements h, g {

    /* renamed from: e  reason: collision with root package name */
    private final h f18284e;

    /* renamed from: f  reason: collision with root package name */
    public final c f18285f;

    /* renamed from: g  reason: collision with root package name */
    private final a f18286g;

    public static final class a implements d1.g {

        /* renamed from: e  reason: collision with root package name */
        private final c f18287e;

        /* renamed from: y0.d$a$a  reason: collision with other inner class name */
        static final class C0240a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final C0240a f18288e = new C0240a();

            C0240a() {
                super(1);
            }

            /* renamed from: b */
            public final List invoke(d1.g gVar) {
                cm.l.f(gVar, "obj");
                return gVar.r();
            }
        }

        static final class b extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f18289e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f18289e = str;
            }

            /* renamed from: b */
            public final Object invoke(d1.g gVar) {
                cm.l.f(gVar, "db");
                gVar.w(this.f18289e);
                return null;
            }
        }

        static final class c extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f18290e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Object[] f18291f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f18290e = str;
                this.f18291f = objArr;
            }

            /* renamed from: b */
            public final Object invoke(d1.g gVar) {
                cm.l.f(gVar, "db");
                gVar.k0(this.f18290e, this.f18291f);
                return null;
            }
        }

        /* renamed from: y0.d$a$d  reason: collision with other inner class name */
        /* synthetic */ class C0241d extends k implements l {

            /* renamed from: n  reason: collision with root package name */
            public static final C0241d f18292n = new C0241d();

            C0241d() {
                super(1, d1.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            /* renamed from: k */
            public final Boolean invoke(d1.g gVar) {
                cm.l.f(gVar, "p0");
                return Boolean.valueOf(gVar.T());
            }
        }

        static final class e extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final e f18293e = new e();

            e() {
                super(1);
            }

            /* renamed from: b */
            public final Boolean invoke(d1.g gVar) {
                cm.l.f(gVar, "db");
                return Boolean.valueOf(gVar.d0());
            }
        }

        static final class f extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final f f18294e = new f();

            f() {
                super(1);
            }

            /* renamed from: b */
            public final String invoke(d1.g gVar) {
                cm.l.f(gVar, "obj");
                return gVar.b();
            }
        }

        static final class g extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final g f18295e = new g();

            g() {
                super(1);
            }

            /* renamed from: b */
            public final Object invoke(d1.g gVar) {
                cm.l.f(gVar, "it");
                return null;
            }
        }

        static final class h extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f18296e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f18297f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ ContentValues f18298g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f18299h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ Object[] f18300i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            h(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f18296e = str;
                this.f18297f = i10;
                this.f18298g = contentValues;
                this.f18299h = str2;
                this.f18300i = objArr;
            }

            /* renamed from: b */
            public final Integer invoke(d1.g gVar) {
                cm.l.f(gVar, "db");
                return Integer.valueOf(gVar.m0(this.f18296e, this.f18297f, this.f18298g, this.f18299h, this.f18300i));
            }
        }

        public a(c cVar) {
            cm.l.f(cVar, "autoCloser");
            this.f18287e = cVar;
        }

        public d1.k D(String str) {
            cm.l.f(str, "sql");
            return new b(str, this.f18287e);
        }

        public boolean T() {
            if (this.f18287e.h() == null) {
                return false;
            }
            return ((Boolean) this.f18287e.g(C0241d.f18292n)).booleanValue();
        }

        public Cursor a0(j jVar, CancellationSignal cancellationSignal) {
            cm.l.f(jVar, "query");
            try {
                return new c(this.f18287e.j().a0(jVar, cancellationSignal), this.f18287e);
            } catch (Throwable th2) {
                this.f18287e.e();
                throw th2;
            }
        }

        public String b() {
            return (String) this.f18287e.g(f.f18294e);
        }

        public final void c() {
            this.f18287e.g(g.f18295e);
        }

        public void close() {
            this.f18287e.d();
        }

        public boolean d0() {
            return ((Boolean) this.f18287e.g(e.f18293e)).booleanValue();
        }

        public void g0() {
            x xVar;
            d1.g h10 = this.f18287e.h();
            if (h10 != null) {
                h10.g0();
                xVar = x.f30437a;
            } else {
                xVar = null;
            }
            if (xVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        public Cursor h0(j jVar) {
            cm.l.f(jVar, "query");
            try {
                return new c(this.f18287e.j().h0(jVar), this.f18287e);
            } catch (Throwable th2) {
                this.f18287e.e();
                throw th2;
            }
        }

        public void i() {
            if (this.f18287e.h() != null) {
                try {
                    d1.g h10 = this.f18287e.h();
                    cm.l.c(h10);
                    h10.i();
                } finally {
                    this.f18287e.e();
                }
            } else {
                throw new IllegalStateException("End transaction called but delegateDb is null".toString());
            }
        }

        public boolean isOpen() {
            d1.g h10 = this.f18287e.h();
            if (h10 == null) {
                return false;
            }
            return h10.isOpen();
        }

        public void j() {
            try {
                this.f18287e.j().j();
            } catch (Throwable th2) {
                this.f18287e.e();
                throw th2;
            }
        }

        public void k0(String str, Object[] objArr) {
            cm.l.f(str, "sql");
            cm.l.f(objArr, "bindArgs");
            this.f18287e.g(new c(str, objArr));
        }

        public void l0() {
            try {
                this.f18287e.j().l0();
            } catch (Throwable th2) {
                this.f18287e.e();
                throw th2;
            }
        }

        public int m0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
            cm.l.f(str, "table");
            cm.l.f(contentValues, "values");
            return ((Number) this.f18287e.g(new h(str, i10, contentValues, str2, objArr))).intValue();
        }

        public List r() {
            return (List) this.f18287e.g(C0240a.f18288e);
        }

        public void w(String str) {
            cm.l.f(str, "sql");
            this.f18287e.g(new b(str));
        }

        public Cursor w0(String str) {
            cm.l.f(str, "query");
            try {
                return new c(this.f18287e.j().w0(str), this.f18287e);
            } catch (Throwable th2) {
                this.f18287e.e();
                throw th2;
            }
        }
    }

    private static final class b implements d1.k {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final String f18301e;

        /* renamed from: f  reason: collision with root package name */
        private final c f18302f;

        /* renamed from: g  reason: collision with root package name */
        private final ArrayList f18303g = new ArrayList();

        static final class a extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final a f18304e = new a();

            a() {
                super(1);
            }

            /* renamed from: b */
            public final Long invoke(d1.k kVar) {
                cm.l.f(kVar, "obj");
                return Long.valueOf(kVar.v0());
            }
        }

        /* renamed from: y0.d$b$b  reason: collision with other inner class name */
        static final class C0242b extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ b f18305e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ l f18306f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0242b(b bVar, l lVar) {
                super(1);
                this.f18305e = bVar;
                this.f18306f = lVar;
            }

            /* renamed from: b */
            public final Object invoke(g gVar) {
                cm.l.f(gVar, "db");
                d1.k D = gVar.D(this.f18305e.f18301e);
                this.f18305e.f(D);
                return this.f18306f.invoke(D);
            }
        }

        static final class c extends m implements l {

            /* renamed from: e  reason: collision with root package name */
            public static final c f18307e = new c();

            c() {
                super(1);
            }

            /* renamed from: b */
            public final Integer invoke(d1.k kVar) {
                cm.l.f(kVar, "obj");
                return Integer.valueOf(kVar.C());
            }
        }

        public b(String str, c cVar) {
            cm.l.f(str, "sql");
            cm.l.f(cVar, "autoCloser");
            this.f18301e = str;
            this.f18302f = cVar;
        }

        /* access modifiers changed from: private */
        public final void f(d1.k kVar) {
            Iterator it = this.f18303g.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    q.r();
                }
                Object obj = this.f18303g.get(i10);
                if (obj == null) {
                    kVar.G(i11);
                } else if (obj instanceof Long) {
                    kVar.f0(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.K(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.x(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.n0(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final Object g(l lVar) {
            return this.f18302f.g(new C0242b(this, lVar));
        }

        private final void h(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f18303g.size() && (size = this.f18303g.size()) <= i11) {
                while (true) {
                    this.f18303g.add((Object) null);
                    if (size == i11) {
                        break;
                    }
                    size++;
                }
            }
            this.f18303g.set(i11, obj);
        }

        public int C() {
            return ((Number) g(c.f18307e)).intValue();
        }

        public void G(int i10) {
            h(i10, (Object) null);
        }

        public void K(int i10, double d10) {
            h(i10, Double.valueOf(d10));
        }

        public void close() {
        }

        public void f0(int i10, long j10) {
            h(i10, Long.valueOf(j10));
        }

        public void n0(int i10, byte[] bArr) {
            cm.l.f(bArr, "value");
            h(i10, bArr);
        }

        public long v0() {
            return ((Number) g(a.f18304e)).longValue();
        }

        public void x(int i10, String str) {
            cm.l.f(str, "value");
            h(i10, str);
        }
    }

    private static final class c implements Cursor {

        /* renamed from: e  reason: collision with root package name */
        private final Cursor f18308e;

        /* renamed from: f  reason: collision with root package name */
        private final c f18309f;

        public c(Cursor cursor, c cVar) {
            cm.l.f(cursor, "delegate");
            cm.l.f(cVar, "autoCloser");
            this.f18308e = cursor;
            this.f18309f = cVar;
        }

        public void close() {
            this.f18308e.close();
            this.f18309f.e();
        }

        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f18308e.copyStringToBuffer(i10, charArrayBuffer);
        }

        public void deactivate() {
            this.f18308e.deactivate();
        }

        public byte[] getBlob(int i10) {
            return this.f18308e.getBlob(i10);
        }

        public int getColumnCount() {
            return this.f18308e.getColumnCount();
        }

        public int getColumnIndex(String str) {
            return this.f18308e.getColumnIndex(str);
        }

        public int getColumnIndexOrThrow(String str) {
            return this.f18308e.getColumnIndexOrThrow(str);
        }

        public String getColumnName(int i10) {
            return this.f18308e.getColumnName(i10);
        }

        public String[] getColumnNames() {
            return this.f18308e.getColumnNames();
        }

        public int getCount() {
            return this.f18308e.getCount();
        }

        public double getDouble(int i10) {
            return this.f18308e.getDouble(i10);
        }

        public Bundle getExtras() {
            return this.f18308e.getExtras();
        }

        public float getFloat(int i10) {
            return this.f18308e.getFloat(i10);
        }

        public int getInt(int i10) {
            return this.f18308e.getInt(i10);
        }

        public long getLong(int i10) {
            return this.f18308e.getLong(i10);
        }

        public Uri getNotificationUri() {
            return d1.c.a(this.f18308e);
        }

        public List getNotificationUris() {
            return f.a(this.f18308e);
        }

        public int getPosition() {
            return this.f18308e.getPosition();
        }

        public short getShort(int i10) {
            return this.f18308e.getShort(i10);
        }

        public String getString(int i10) {
            return this.f18308e.getString(i10);
        }

        public int getType(int i10) {
            return this.f18308e.getType(i10);
        }

        public boolean getWantsAllOnMoveCalls() {
            return this.f18308e.getWantsAllOnMoveCalls();
        }

        public boolean isAfterLast() {
            return this.f18308e.isAfterLast();
        }

        public boolean isBeforeFirst() {
            return this.f18308e.isBeforeFirst();
        }

        public boolean isClosed() {
            return this.f18308e.isClosed();
        }

        public boolean isFirst() {
            return this.f18308e.isFirst();
        }

        public boolean isLast() {
            return this.f18308e.isLast();
        }

        public boolean isNull(int i10) {
            return this.f18308e.isNull(i10);
        }

        public boolean move(int i10) {
            return this.f18308e.move(i10);
        }

        public boolean moveToFirst() {
            return this.f18308e.moveToFirst();
        }

        public boolean moveToLast() {
            return this.f18308e.moveToLast();
        }

        public boolean moveToNext() {
            return this.f18308e.moveToNext();
        }

        public boolean moveToPosition(int i10) {
            return this.f18308e.moveToPosition(i10);
        }

        public boolean moveToPrevious() {
            return this.f18308e.moveToPrevious();
        }

        public void registerContentObserver(ContentObserver contentObserver) {
            this.f18308e.registerContentObserver(contentObserver);
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f18308e.registerDataSetObserver(dataSetObserver);
        }

        public boolean requery() {
            return this.f18308e.requery();
        }

        public Bundle respond(Bundle bundle) {
            return this.f18308e.respond(bundle);
        }

        public void setExtras(Bundle bundle) {
            cm.l.f(bundle, "extras");
            e.a(this.f18308e, bundle);
        }

        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f18308e.setNotificationUri(contentResolver, uri);
        }

        public void setNotificationUris(ContentResolver contentResolver, List list) {
            cm.l.f(contentResolver, "cr");
            cm.l.f(list, "uris");
            f.b(this.f18308e, contentResolver, list);
        }

        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f18308e.unregisterContentObserver(contentObserver);
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f18308e.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(h hVar, c cVar) {
        cm.l.f(hVar, "delegate");
        cm.l.f(cVar, "autoCloser");
        this.f18284e = hVar;
        this.f18285f = cVar;
        cVar.k(c());
        this.f18286g = new a(cVar);
    }

    public h c() {
        return this.f18284e;
    }

    public void close() {
        this.f18286g.close();
    }

    public String getDatabaseName() {
        return this.f18284e.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f18284e.setWriteAheadLoggingEnabled(z10);
    }

    public g u0() {
        this.f18286g.c();
        return this.f18286g;
    }
}
