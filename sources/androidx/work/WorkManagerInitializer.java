package androidx.work;

import android.content.Context;
import androidx.work.a;
import g1.a;
import java.util.Collections;
import java.util.List;
import m1.m;
import m1.y;

public final class WorkManagerInitializer implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4053a = m.i("WrkMgrInitializer");

    public List a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public y b(Context context) {
        m.e().a(f4053a, "Initializing WorkManager with default configuration.");
        y.d(context, new a.C0070a().a());
        return y.c(context);
    }
}
