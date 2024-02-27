package u6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import r6.d;
import r6.e;
import s6.b;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Map f16921a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f16922b;

    /* renamed from: c  reason: collision with root package name */
    private final d f16923c;

    public static final class a implements b {

        /* renamed from: d  reason: collision with root package name */
        private static final d f16924d = new g();

        /* renamed from: a  reason: collision with root package name */
        private final Map f16925a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private final Map f16926b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private d f16927c = f16924d;

        /* access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, e eVar) {
            throw new r6.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f16925a), new HashMap(this.f16926b), this.f16927c);
        }

        public a d(s6.a aVar) {
            aVar.a(this);
            return this;
        }

        /* renamed from: f */
        public a a(Class cls, d dVar) {
            this.f16925a.put(cls, dVar);
            this.f16926b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, d dVar) {
        this.f16921a = map;
        this.f16922b = map2;
        this.f16923c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f16921a, this.f16922b, this.f16923c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
