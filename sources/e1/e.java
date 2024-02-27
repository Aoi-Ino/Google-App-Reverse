package e1;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import d1.h;
import e1.d;

public final /* synthetic */ class e implements DatabaseErrorHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f10003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.b f10004b;

    public /* synthetic */ e(h.a aVar, d.b bVar) {
        this.f10003a = aVar;
        this.f10004b = bVar;
    }

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        d.c.e(this.f10003a, this.f10004b, sQLiteDatabase);
    }
}
