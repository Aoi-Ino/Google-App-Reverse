package s3;

import com.google.android.gms.common.api.Status;
import q3.f;

public abstract class b {
    public static q3.b a(Status status) {
        return status.f() ? new f(status) : new q3.b(status);
    }
}
