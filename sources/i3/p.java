package i3;

import android.database.sqlite.SQLiteDatabase;
import i3.m0;

public final /* synthetic */ class p implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f12303a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12304b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f12305c;

    public /* synthetic */ p(m0 m0Var, String str, String str2) {
        this.f12303a = m0Var;
        this.f12304b = str;
        this.f12305c = str2;
    }

    public final Object apply(Object obj) {
        return this.f12303a.p1(this.f12304b, this.f12305c, (SQLiteDatabase) obj);
    }
}
