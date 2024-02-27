package t1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import lm.a0;
import lm.c1;
import s1.s;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final s f16500a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f16501b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f16502c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private final Executor f16503d = new a();

    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            c.this.f16502c.post(runnable);
        }
    }

    public c(Executor executor) {
        s sVar = new s(executor);
        this.f16500a = sVar;
        this.f16501b = c1.a(sVar);
    }

    public Executor a() {
        return this.f16503d;
    }

    public a0 d() {
        return this.f16501b;
    }

    /* renamed from: e */
    public s b() {
        return this.f16500a;
    }
}
