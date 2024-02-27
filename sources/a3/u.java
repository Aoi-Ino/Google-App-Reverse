package a3;

import android.content.Context;
import i3.d;
import java.io.Closeable;

abstract class u implements Closeable {

    interface a {
        u a();

        a b(Context context);
    }

    u() {
    }

    /* access modifiers changed from: package-private */
    public abstract d c();

    public void close() {
        c().close();
    }

    /* access modifiers changed from: package-private */
    public abstract t e();
}
