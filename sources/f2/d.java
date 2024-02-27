package f2;

import e2.h;
import i2.c;
import java.util.concurrent.FutureTask;

public class d extends FutureTask implements Comparable {

    /* renamed from: e  reason: collision with root package name */
    private final c f11320e;

    d(c cVar) {
        super(cVar, (Object) null);
        this.f11320e = cVar;
    }

    /* renamed from: b */
    public int compareTo(d dVar) {
        c cVar = this.f11320e;
        h hVar = cVar.f12240e;
        c cVar2 = dVar.f11320e;
        h hVar2 = cVar2.f12240e;
        return hVar == hVar2 ? cVar.f12241f - cVar2.f12241f : hVar2.ordinal() - hVar.ordinal();
    }
}
