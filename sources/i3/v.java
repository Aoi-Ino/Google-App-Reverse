package i3;

import a3.o;
import android.database.Cursor;
import i3.m0;
import java.util.List;

public final /* synthetic */ class v implements m0.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m0 f12326a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f12327b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f12328c;

    public /* synthetic */ v(m0 m0Var, List list, o oVar) {
        this.f12326a = m0Var;
        this.f12327b = list;
        this.f12328c = oVar;
    }

    public final Object apply(Object obj) {
        return this.f12326a.k1(this.f12327b, this.f12328c, (Cursor) obj);
    }
}
