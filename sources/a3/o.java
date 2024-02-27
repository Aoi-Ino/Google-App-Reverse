package a3;

import a3.d;
import android.util.Base64;
import y2.e;

public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(e eVar);
    }

    public static a a() {
        return new d.b().d(e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract e d();

    public boolean e() {
        return c() != null;
    }

    public o f(e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
