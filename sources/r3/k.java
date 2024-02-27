package r3;

import com.google.android.gms.common.api.Status;
import p4.j;
import s3.b;

public abstract class k {
    public static void a(Status status, Object obj, j jVar) {
        if (status.g()) {
            jVar.c(obj);
        } else {
            jVar.b(b.a(status));
        }
    }

    public static void b(Status status, j jVar) {
        a(status, (Object) null, jVar);
    }
}
