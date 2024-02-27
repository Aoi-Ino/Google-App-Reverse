package i7;

import java.math.BigInteger;
import java.util.Objects;
import k7.g;

public final class l extends g {

    /* renamed from: e  reason: collision with root package name */
    private final Object f12549e;

    public l(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f12549e = bool;
    }

    private static boolean T(l lVar) {
        Object obj = lVar.f12549e;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean B() {
        return H() ? ((Boolean) this.f12549e).booleanValue() : Boolean.parseBoolean(F());
    }

    public Number E() {
        Object obj = this.f12549e;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new g((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String F() {
        Object obj = this.f12549e;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (Y()) {
            return E().toString();
        }
        if (H()) {
            return ((Boolean) this.f12549e).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f12549e.getClass());
    }

    public boolean H() {
        return this.f12549e instanceof Boolean;
    }

    public boolean Y() {
        return this.f12549e instanceof Number;
    }

    public boolean e0() {
        return this.f12549e instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f12549e == null) {
            return lVar.f12549e == null;
        }
        if (T(this) && T(lVar)) {
            return E().longValue() == lVar.E().longValue();
        }
        Object obj2 = this.f12549e;
        if (!(obj2 instanceof Number) || !(lVar.f12549e instanceof Number)) {
            return obj2.equals(lVar.f12549e);
        }
        double doubleValue = E().doubleValue();
        double doubleValue2 = lVar.E().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f12549e == null) {
            return 31;
        }
        if (T(this)) {
            doubleToLongBits = E().longValue();
        } else {
            Object obj = this.f12549e;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(E().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public l(Number number) {
        Objects.requireNonNull(number);
        this.f12549e = number;
    }

    public l(String str) {
        Objects.requireNonNull(str);
        this.f12549e = str;
    }
}
