package ka;

import java.util.ArrayList;
import java.util.function.IntPredicate;
import ka.c;

public final /* synthetic */ class a implements IntPredicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f13155a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f13156b;

    public /* synthetic */ a(ArrayList arrayList, String str) {
        this.f13155a = arrayList;
        this.f13156b = str;
    }

    public final boolean test(int i10) {
        return c.a.j(this.f13155a, this.f13156b, i10);
    }
}
