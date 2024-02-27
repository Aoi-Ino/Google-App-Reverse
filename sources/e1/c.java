package e1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import bm.r;
import cm.l;
import cm.m;
import d1.g;
import d1.j;
import d1.k;
import java.util.List;

public final class c implements g {

    /* renamed from: g  reason: collision with root package name */
    public static final a f9970g = new a((cm.g) null);

    /* renamed from: h  reason: collision with root package name */
    private static final String[] f9971h = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f9972i = new String[0];

    /* renamed from: e  reason: collision with root package name */
    private final SQLiteDatabase f9973e;

    /* renamed from: f  reason: collision with root package name */
    private final List f9974f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements r {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f9975e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f9975e = jVar;
        }

        /* renamed from: b */
        public final SQLiteCursor o(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f9975e;
            l.c(sQLiteQuery);
            jVar.e(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "delegate");
        this.f9973e = sQLiteDatabase;
        this.f9974f = sQLiteDatabase.getAttachedDbs();
    }

    /* access modifiers changed from: private */
    public static final Cursor g(r rVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l.f(rVar, "$tmp0");
        return (Cursor) rVar.o(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* access modifiers changed from: private */
    public static final Cursor h(j jVar, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        l.f(jVar, "$query");
        l.c(sQLiteQuery);
        jVar.e(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public k D(String str) {
        l.f(str, "sql");
        SQLiteStatement compileStatement = this.f9973e.compileStatement(str);
        l.e(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    public boolean T() {
        return this.f9973e.inTransaction();
    }

    public Cursor a0(j jVar, CancellationSignal cancellationSignal) {
        l.f(jVar, "query");
        SQLiteDatabase sQLiteDatabase = this.f9973e;
        String c10 = jVar.c();
        String[] strArr = f9972i;
        l.c(cancellationSignal);
        return d1.b.c(sQLiteDatabase, c10, strArr, (String) null, cancellationSignal, new a(jVar));
    }

    public String b() {
        return this.f9973e.getPath();
    }

    public void close() {
        this.f9973e.close();
    }

    public boolean d0() {
        return d1.b.b(this.f9973e);
    }

    public final boolean f(SQLiteDatabase sQLiteDatabase) {
        l.f(sQLiteDatabase, "sqLiteDatabase");
        return l.a(this.f9973e, sQLiteDatabase);
    }

    public void g0() {
        this.f9973e.setTransactionSuccessful();
    }

    public Cursor h0(j jVar) {
        l.f(jVar, "query");
        Cursor rawQueryWithFactory = this.f9973e.rawQueryWithFactory(new b(new b(jVar)), jVar.c(), f9972i, (String) null);
        l.e(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public void i() {
        this.f9973e.endTransaction();
    }

    public boolean isOpen() {
        return this.f9973e.isOpen();
    }

    public void j() {
        this.f9973e.beginTransaction();
    }

    public void k0(String str, Object[] objArr) {
        l.f(str, "sql");
        l.f(objArr, "bindArgs");
        this.f9973e.execSQL(str, objArr);
    }

    public void l0() {
        this.f9973e.beginTransactionNonExclusive();
    }

    public int m0(String str, int i10, ContentValues contentValues, String str2, Object[] objArr) {
        l.f(str, "table");
        l.f(contentValues, "values");
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr == null ? size : objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UPDATE ");
            sb2.append(f9971h[i10]);
            sb2.append(str);
            sb2.append(" SET ");
            int i11 = 0;
            for (String next : contentValues.keySet()) {
                sb2.append(i11 > 0 ? "," : "");
                sb2.append(next);
                objArr2[i11] = contentValues.get(next);
                sb2.append("=?");
                i11++;
            }
            if (objArr != null) {
                for (int i12 = size; i12 < length; i12++) {
                    objArr2[i12] = objArr[i12 - size];
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                sb2.append(" WHERE ");
                sb2.append(str2);
            }
            String sb3 = sb2.toString();
            l.e(sb3, "StringBuilder().apply(builderAction).toString()");
            k D = D(sb3);
            d1.a.f9661g.b(D, objArr2);
            return D.C();
        }
        throw new IllegalArgumentException("Empty values".toString());
    }

    public List r() {
        return this.f9974f;
    }

    public void w(String str) {
        l.f(str, "sql");
        this.f9973e.execSQL(str);
    }

    public Cursor w0(String str) {
        l.f(str, "query");
        return h0(new d1.a(str));
    }
}
