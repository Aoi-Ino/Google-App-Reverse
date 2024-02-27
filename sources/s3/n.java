package s3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class n {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f16015a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f16016b;

        /* synthetic */ a(Object obj, q0 q0Var) {
            o.i(obj);
            this.f16016b = obj;
        }

        public a a(String str, Object obj) {
            List list = this.f16015a;
            o.i(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f16016b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f16015a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f16015a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, (q0) null);
    }
}
