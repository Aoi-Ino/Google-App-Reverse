package i3;

import android.database.sqlite.SQLiteDatabase;
import i3.m0;

public final /* synthetic */ class g0 implements m0.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SQLiteDatabase f12274a;

    public /* synthetic */ g0(SQLiteDatabase sQLiteDatabase) {
        this.f12274a = sQLiteDatabase;
    }

    public final Object a() {
        return this.f12274a.beginTransaction();
    }
}
