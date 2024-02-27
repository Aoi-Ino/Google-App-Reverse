package t5;

import java.io.Closeable;
import java.io.InputStream;

public abstract class w implements Closeable {
    public abstract long c();

    /* access modifiers changed from: protected */
    public abstract InputStream e(long j10, long j11);

    public final synchronized InputStream f() {
        return e(0, c());
    }
}
