package y5;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList f18515a = new CopyOnWriteArrayList();

    public static m a(String str) {
        Iterator it = f18515a.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (mVar.a(str)) {
                return mVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
