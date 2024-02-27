package l7;

import com.google.gson.reflect.TypeToken;
import i7.d;
import i7.r;
import i7.s;
import j7.b;
import k7.c;

public final class e implements s {

    /* renamed from: e  reason: collision with root package name */
    private final c f13323e;

    public e(c cVar) {
        this.f13323e = cVar;
    }

    public r a(d dVar, TypeToken typeToken) {
        b bVar = (b) typeToken.getRawType().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f13323e, dVar, typeToken, bVar);
    }

    /* access modifiers changed from: package-private */
    public r b(c cVar, d dVar, TypeToken typeToken, b bVar) {
        r rVar;
        Object a10 = cVar.b(TypeToken.get(bVar.value())).a();
        boolean nullSafe = bVar.nullSafe();
        if (a10 instanceof r) {
            rVar = (r) a10;
        } else if (a10 instanceof s) {
            rVar = ((s) a10).a(dVar, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        return (rVar == null || !nullSafe) ? rVar : rVar.a();
    }
}
