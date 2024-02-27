package i3;

import android.database.sqlite.SQLiteDatabase;
import i3.m0;

public final /* synthetic */ class i0 implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f12277a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f12278b;

    public /* synthetic */ i0(m0 m0Var, long j10) {
        this.f12277a = m0Var;
        this.f12278b = j10;
    }

    public final Object apply(Object obj) {
        return this.f12277a.W0(this.f12278b, (SQLiteDatabase) obj);
    }
}
