package i7;

import java.lang.reflect.Field;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Field f12486a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f12486a = field;
    }

    public String toString() {
        return this.f12486a.toString();
    }
}
