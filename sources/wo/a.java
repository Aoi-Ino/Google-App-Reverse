package wo;

import qn.f;
import wn.b;

public abstract class a {
    public static byte[] a(wn.a aVar, f fVar) {
        try {
            return b(new b(aVar, fVar));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(b bVar) {
        try {
            return bVar.v("DER");
        } catch (Exception unused) {
            return null;
        }
    }
}
