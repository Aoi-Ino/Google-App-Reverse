package l4;

import android.os.RemoteException;
import s3.o;

public class d {

    /* renamed from: a  reason: collision with root package name */
    protected final f4.d f13273a;

    public d(f4.d dVar) {
        this.f13273a = (f4.d) o.i(dVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            return this.f13273a.k(((d) obj).f13273a);
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f13273a.Z();
        } catch (RemoteException e10) {
            throw new f(e10);
        }
    }
}
