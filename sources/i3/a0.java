package i3;

import a3.i;
import a3.o;
import android.database.sqlite.SQLiteDatabase;
import i3.m0;

public final /* synthetic */ class a0 implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f12264a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f12265b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f12266c;

    public /* synthetic */ a0(m0 m0Var, i iVar, o oVar) {
        this.f12264a = m0Var;
        this.f12265b = iVar;
        this.f12266c = oVar;
    }

    public final Object apply(Object obj) {
        return this.f12264a.m1(this.f12265b, this.f12266c, (SQLiteDatabase) obj);
    }
}
