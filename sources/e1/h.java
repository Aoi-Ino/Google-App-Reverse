package e1;

import android.database.sqlite.SQLiteStatement;
import cm.l;
import d1.k;

public final class h extends g implements k {

    /* renamed from: f  reason: collision with root package name */
    private final SQLiteStatement f10006f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        l.f(sQLiteStatement, "delegate");
        this.f10006f = sQLiteStatement;
    }

    public int C() {
        return this.f10006f.executeUpdateDelete();
    }

    public long v0() {
        return this.f10006f.executeInsert();
    }
}
