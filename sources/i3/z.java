package i3;

import android.database.Cursor;
import d3.a;
import i3.m0;
import java.util.Map;

public final /* synthetic */ class z implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f12330a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f12331b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a.C0129a f12332c;

    public /* synthetic */ z(m0 m0Var, Map map, a.C0129a aVar) {
        this.f12330a = m0Var;
        this.f12331b = map;
        this.f12332c = aVar;
    }

    public final Object apply(Object obj) {
        return this.f12330a.i1(this.f12331b, this.f12332c, (Cursor) obj);
    }
}
