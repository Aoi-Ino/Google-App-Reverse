package j4;

import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import k4.b;
import l4.a;
import l4.d;
import l4.e;
import l4.f;
import s3.o;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f12698a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f12699b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f12700c = new HashMap();

    public c(b bVar) {
        this.f12698a = (b) o.i(bVar);
    }

    public final d a(e eVar) {
        try {
            o.j(eVar, "MarkerOptions must not be null.");
            f4.d W = this.f12698a.W(eVar);
            if (W != null) {
                return eVar.r() == 1 ? new a(W) : new d(W);
            }
            return null;
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public final void b(a aVar) {
        try {
            o.j(aVar, "CameraUpdate must not be null.");
            this.f12698a.V(aVar.a());
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
