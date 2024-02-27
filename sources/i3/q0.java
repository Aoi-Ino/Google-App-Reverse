package i3;

import android.database.sqlite.SQLiteDatabase;
import i3.t0;

public final /* synthetic */ class q0 implements t0.a {
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
