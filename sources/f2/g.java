package f2;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public class g implements ThreadFactory {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f11322a;

    class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Runnable f11323e;

        a(Runnable runnable) {
            this.f11323e = runnable;
        }

        public void run() {
            try {
                Process.setThreadPriority(g.this.f11322a);
            } catch (Throwable unused) {
            }
            this.f11323e.run();
        }
    }

    g(int i10) {
        this.f11322a = i10;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable));
    }
}
