package e1;

import android.database.sqlite.SQLiteProgram;
import cm.l;
import d1.i;

public class g implements i {

    /* renamed from: e  reason: collision with root package name */
    private final SQLiteProgram f10005e;

    public g(SQLiteProgram sQLiteProgram) {
        l.f(sQLiteProgram, "delegate");
        this.f10005e = sQLiteProgram;
    }

    public void G(int i10) {
        this.f10005e.bindNull(i10);
    }

    public void K(int i10, double d10) {
        this.f10005e.bindDouble(i10, d10);
    }

    public void close() {
        this.f10005e.close();
    }

    public void f0(int i10, long j10) {
        this.f10005e.bindLong(i10, j10);
    }

    public void n0(int i10, byte[] bArr) {
        l.f(bArr, "value");
        this.f10005e.bindBlob(i10, bArr);
    }

    public void x(int i10, String str) {
        l.f(str, "value");
        this.f10005e.bindString(i10, str);
    }
}
