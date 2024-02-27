package m;

import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.os.e;

class s {

    /* renamed from: a  reason: collision with root package name */
    private final c f13636a = new a();

    /* renamed from: b  reason: collision with root package name */
    private CancellationSignal f13637b;

    /* renamed from: c  reason: collision with root package name */
    private e f13638c;

    class a implements c {
        a() {
        }

        public CancellationSignal a() {
            return b.b();
        }

        public e b() {
            return new e();
        }
    }

    private static class b {
        static void a(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    interface c {
        CancellationSignal a();

        e b();
    }

    s() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        CancellationSignal cancellationSignal = this.f13637b;
        if (cancellationSignal != null) {
            try {
                b.a(cancellationSignal);
            } catch (NullPointerException e10) {
                Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e10);
            }
            this.f13637b = null;
        }
        e eVar = this.f13638c;
        if (eVar != null) {
            try {
                eVar.a();
            } catch (NullPointerException e11) {
                Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e11);
            }
            this.f13638c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public CancellationSignal b() {
        if (this.f13637b == null) {
            this.f13637b = this.f13636a.a();
        }
        return this.f13637b;
    }

    /* access modifiers changed from: package-private */
    public e c() {
        if (this.f13638c == null) {
            this.f13638c = this.f13636a.b();
        }
        return this.f13638c;
    }
}
