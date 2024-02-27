package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2403a;

    /* renamed from: androidx.core.hardware.fingerprint.a$a  reason: collision with other inner class name */
    class C0030a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f2404a;

        C0030a(c cVar) {
            this.f2404a = cVar;
        }

        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f2404a.a(i10, charSequence);
        }

        public void onAuthenticationFailed() {
            this.f2404a.b();
        }

        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f2404a.c(i10, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f2404a.d(new d(a.f(b.b(authenticationResult))));
        }
    }

    static class b {
        static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, int i10, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i10, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        static FingerprintManager.CryptoObject b(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        public static FingerprintManager c(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        static boolean d(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        static boolean e(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        public static e f(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new e(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new e(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new e(cryptoObject.getMac());
            }
            return null;
        }

        public static FingerprintManager.CryptoObject g(e eVar) {
            if (eVar == null) {
                return null;
            }
            if (eVar.a() != null) {
                return new FingerprintManager.CryptoObject(eVar.a());
            }
            if (eVar.c() != null) {
                return new FingerprintManager.CryptoObject(eVar.c());
            }
            if (eVar.b() != null) {
                return new FingerprintManager.CryptoObject(eVar.b());
            }
            return null;
        }
    }

    public static abstract class c {
        public abstract void a(int i10, CharSequence charSequence);

        public abstract void b();

        public abstract void c(int i10, CharSequence charSequence);

        public abstract void d(d dVar);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final e f2405a;

        public d(e eVar) {
            this.f2405a = eVar;
        }

        public e a() {
            return this.f2405a;
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final Signature f2406a;

        /* renamed from: b  reason: collision with root package name */
        private final Cipher f2407b;

        /* renamed from: c  reason: collision with root package name */
        private final Mac f2408c;

        public e(Signature signature) {
            this.f2406a = signature;
            this.f2407b = null;
            this.f2408c = null;
        }

        public Cipher a() {
            return this.f2407b;
        }

        public Mac b() {
            return this.f2408c;
        }

        public Signature c() {
            return this.f2406a;
        }

        public e(Cipher cipher) {
            this.f2407b = cipher;
            this.f2406a = null;
            this.f2408c = null;
        }

        public e(Mac mac) {
            this.f2408c = mac;
            this.f2407b = null;
            this.f2406a = null;
        }
    }

    private a(Context context) {
        this.f2403a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    private static FingerprintManager c(Context context) {
        return b.c(context);
    }

    static e f(FingerprintManager.CryptoObject cryptoObject) {
        return b.f(cryptoObject);
    }

    private static FingerprintManager.AuthenticationCallback g(c cVar) {
        return new C0030a(cVar);
    }

    private static FingerprintManager.CryptoObject h(e eVar) {
        return b.g(eVar);
    }

    public void a(e eVar, int i10, androidx.core.os.e eVar2, c cVar, Handler handler) {
        FingerprintManager c10 = c(this.f2403a);
        if (c10 != null) {
            b.a(c10, h(eVar), eVar2 != null ? (CancellationSignal) eVar2.b() : null, i10, g(cVar), handler);
        }
    }

    public boolean d() {
        FingerprintManager c10 = c(this.f2403a);
        return c10 != null && b.d(c10);
    }

    public boolean e() {
        FingerprintManager c10 = c(this.f2403a);
        return c10 != null && b.e(c10);
    }
}
