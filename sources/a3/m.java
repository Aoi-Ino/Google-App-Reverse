package a3;

import java.util.concurrent.Executor;

class m implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Executor f184e;

    static class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final Runnable f185e;

        a(Runnable runnable) {
            this.f185e = runnable;
        }

        public void run() {
            try {
                this.f185e.run();
            } catch (Exception e10) {
                e3.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    m(Executor executor) {
        this.f184e = executor;
    }

    public void execute(Runnable runnable) {
        this.f184e.execute(new a(runnable));
    }
}
