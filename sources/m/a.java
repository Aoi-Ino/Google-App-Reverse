package m;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.os.Build;
import androidx.core.hardware.fingerprint.a;
import m.q;

class a {

    /* renamed from: a  reason: collision with root package name */
    private BiometricPrompt$AuthenticationCallback f13553a;

    /* renamed from: b  reason: collision with root package name */
    private a.c f13554b;

    /* renamed from: c  reason: collision with root package name */
    final d f13555c;

    /* renamed from: m.a$a  reason: collision with other inner class name */
    class C0182a extends a.c {
        C0182a() {
        }

        public void a(int i10, CharSequence charSequence) {
            a.this.f13555c.a(i10, charSequence);
        }

        public void b() {
            a.this.f13555c.b();
        }

        public void c(int i10, CharSequence charSequence) {
            a.this.f13555c.c(charSequence);
        }

        public void d(a.d dVar) {
            a.this.f13555c.d(new q.b(dVar != null ? t.c(dVar.a()) : null, 2));
        }
    }

    private static class b {

        /* renamed from: m.a$b$a  reason: collision with other inner class name */
        class C0183a extends BiometricPrompt$AuthenticationCallback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f13557a;

            C0183a(d dVar) {
                this.f13557a = dVar;
            }

            public void onAuthenticationError(int i10, CharSequence charSequence) {
                this.f13557a.a(i10, charSequence);
            }

            public void onAuthenticationFailed() {
                this.f13557a.b();
            }

            public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            }

            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                q.c b10 = authenticationResult != null ? t.b(b.b(authenticationResult)) : null;
                int i10 = Build.VERSION.SDK_INT;
                int i11 = -1;
                if (i10 >= 30) {
                    if (authenticationResult != null) {
                        i11 = c.a(authenticationResult);
                    }
                } else if (i10 != 29) {
                    i11 = 2;
                }
                this.f13557a.d(new q.b(b10, i11));
            }
        }

        static BiometricPrompt$AuthenticationCallback a(d dVar) {
            return new C0183a(dVar);
        }

        static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getCryptoObject();
        }
    }

    private static class c {
        static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
            return authenticationResult.getAuthenticationType();
        }
    }

    static class d {
        d() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a(int i10, CharSequence charSequence);

        /* access modifiers changed from: package-private */
        public abstract void b();

        /* access modifiers changed from: package-private */
        public abstract void c(CharSequence charSequence);

        /* access modifiers changed from: package-private */
        public abstract void d(q.b bVar);
    }

    a(d dVar) {
        this.f13555c = dVar;
    }

    /* access modifiers changed from: package-private */
    public BiometricPrompt$AuthenticationCallback a() {
        if (this.f13553a == null) {
            this.f13553a = b.a(this.f13555c);
        }
        return this.f13553a;
    }

    /* access modifiers changed from: package-private */
    public a.c b() {
        if (this.f13554b == null) {
            this.f13554b = new C0182a();
        }
        return this.f13554b;
    }
}
