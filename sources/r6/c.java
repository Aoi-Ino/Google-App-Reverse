package r6;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f15603a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f15604b;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f15605a;

        /* renamed from: b  reason: collision with root package name */
        private Map f15606b = null;

        b(String str) {
            this.f15605a = str;
        }

        public c a() {
            return new c(this.f15605a, this.f15606b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f15606b)));
        }

        public b b(Annotation annotation) {
            if (this.f15606b == null) {
                this.f15606b = new HashMap();
            }
            this.f15606b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    private c(String str, Map map) {
        this.f15603a = str;
        this.f15604b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f15603a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f15604b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f15603a.equals(cVar.f15603a) && this.f15604b.equals(cVar.f15604b);
    }

    public int hashCode() {
        return (this.f15603a.hashCode() * 31) + this.f15604b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f15603a + ", properties=" + this.f15604b.values() + "}";
    }
}
