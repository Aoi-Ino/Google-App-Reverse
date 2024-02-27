package m1;

import android.content.Context;
import androidx.work.a;
import androidx.work.impl.p0;
import java.util.Collections;
import java.util.List;

public abstract class y {
    protected y() {
    }

    public static y c(Context context) {
        return p0.i(context);
    }

    public static void d(Context context, a aVar) {
        p0.d(context, aVar);
    }

    public abstract q a(List list);

    public final q b(z zVar) {
        return a(Collections.singletonList(zVar));
    }
}
