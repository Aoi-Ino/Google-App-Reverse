package d3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    private static final d f9728c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f9729a;

    /* renamed from: b  reason: collision with root package name */
    private final List f9730b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f9731a = "";

        /* renamed from: b  reason: collision with root package name */
        private List f9732b = new ArrayList();

        a() {
        }

        public d a() {
            return new d(this.f9731a, Collections.unmodifiableList(this.f9732b));
        }

        public a b(List list) {
            this.f9732b = list;
            return this;
        }

        public a c(String str) {
            this.f9731a = str;
            return this;
        }
    }

    d(String str, List list) {
        this.f9729a = str;
        this.f9730b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f9730b;
    }

    public String b() {
        return this.f9729a;
    }
}
