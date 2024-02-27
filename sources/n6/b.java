package n6;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import m6.c;

public abstract class b extends a implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final Type f14191e;

    protected b() {
        Type a10 = a();
        this.f14191e = a10;
        c.c(!(a10 instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", a10);
    }

    public final Type b() {
        return this.f14191e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f14191e.equals(((b) obj).f14191e);
        }
        return false;
    }

    public int hashCode() {
        return this.f14191e.hashCode();
    }

    public String toString() {
        return c.a(this.f14191e);
    }
}
