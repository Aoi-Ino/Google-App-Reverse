package i3;

import android.database.sqlite.SQLiteDatabase;
import d3.a;
import i3.m0;
import java.util.Map;

public final /* synthetic */ class s implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f12308a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12309b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f12310c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a.C0129a f12311d;

    public /* synthetic */ s(m0 m0Var, String str, Map map, a.C0129a aVar) {
        this.f12308a = m0Var;
        this.f12309b = str;
        this.f12310c = map;
        this.f12311d = aVar;
    }

    public final Object apply(Object obj) {
        return this.f12308a.j1(this.f12309b, this.f12310c, this.f12311d, (SQLiteDatabase) obj);
    }
}
