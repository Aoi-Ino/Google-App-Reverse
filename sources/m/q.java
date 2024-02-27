package m;

import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private androidx.fragment.app.q f13586a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f13587b;

    public static abstract class a {
        public void a(int i10, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(b bVar) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f13588a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13589b;

        b(c cVar, int i10) {
            this.f13588a = cVar;
            this.f13589b = i10;
        }

        public int a() {
            return this.f13589b;
        }

        public c b() {
            return this.f13588a;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final Signature f13590a;

        /* renamed from: b  reason: collision with root package name */
        private final Cipher f13591b;

        /* renamed from: c  reason: collision with root package name */
        private final Mac f13592c;

        /* renamed from: d  reason: collision with root package name */
        private final IdentityCredential f13593d;

        /* renamed from: e  reason: collision with root package name */
        private final PresentationSession f13594e;

        public c(IdentityCredential identityCredential) {
            this.f13590a = null;
            this.f13591b = null;
            this.f13592c = null;
            this.f13593d = identityCredential;
            this.f13594e = null;
        }

        public Cipher a() {
            return this.f13591b;
        }

        public IdentityCredential b() {
            return this.f13593d;
        }

        public Mac c() {
            return this.f13592c;
        }

        public PresentationSession d() {
            return this.f13594e;
        }

        public Signature e() {
            return this.f13590a;
        }

        public c(PresentationSession presentationSession) {
            this.f13590a = null;
            this.f13591b = null;
            this.f13592c = null;
            this.f13593d = null;
            this.f13594e = presentationSession;
        }

        public c(Signature signature) {
            this.f13590a = signature;
            this.f13591b = null;
            this.f13592c = null;
            this.f13593d = null;
            this.f13594e = null;
        }

        public c(Cipher cipher) {
            this.f13590a = null;
            this.f13591b = cipher;
            this.f13592c = null;
            this.f13593d = null;
            this.f13594e = null;
        }

        public c(Mac mac) {
            this.f13590a = null;
            this.f13591b = null;
            this.f13592c = mac;
            this.f13593d = null;
            this.f13594e = null;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f13595a;

        /* renamed from: b  reason: collision with root package name */
        private final CharSequence f13596b;

        /* renamed from: c  reason: collision with root package name */
        private final CharSequence f13597c;

        /* renamed from: d  reason: collision with root package name */
        private final CharSequence f13598d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f13599e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f13600f;

        /* renamed from: g  reason: collision with root package name */
        private final int f13601g;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private CharSequence f13602a = null;

            /* renamed from: b  reason: collision with root package name */
            private CharSequence f13603b = null;

            /* renamed from: c  reason: collision with root package name */
            private CharSequence f13604c = null;

            /* renamed from: d  reason: collision with root package name */
            private CharSequence f13605d = null;

            /* renamed from: e  reason: collision with root package name */
            private boolean f13606e = true;

            /* renamed from: f  reason: collision with root package name */
            private boolean f13607f = false;

            /* renamed from: g  reason: collision with root package name */
            private int f13608g = 0;

            public d a() {
                if (TextUtils.isEmpty(this.f13602a)) {
                    throw new IllegalArgumentException("Title must be set and non-empty.");
                } else if (b.f(this.f13608g)) {
                    int i10 = this.f13608g;
                    boolean d10 = i10 != 0 ? b.d(i10) : this.f13607f;
                    if (TextUtils.isEmpty(this.f13605d) && !d10) {
                        throw new IllegalArgumentException("Negative text must be set and non-empty.");
                    } else if (TextUtils.isEmpty(this.f13605d) || !d10) {
                        return new d(this.f13602a, this.f13603b, this.f13604c, this.f13605d, this.f13606e, this.f13607f, this.f13608g);
                    } else {
                        throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
                    }
                } else {
                    throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + b.a(this.f13608g));
                }
            }

            public a b(int i10) {
                this.f13608g = i10;
                return this;
            }

            public a c(CharSequence charSequence) {
                this.f13604c = charSequence;
                return this;
            }

            public a d(CharSequence charSequence) {
                this.f13602a = charSequence;
                return this;
            }
        }

        d(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z10, boolean z11, int i10) {
            this.f13595a = charSequence;
            this.f13596b = charSequence2;
            this.f13597c = charSequence3;
            this.f13598d = charSequence4;
            this.f13599e = z10;
            this.f13600f = z11;
            this.f13601g = i10;
        }

        public int a() {
            return this.f13601g;
        }

        public CharSequence b() {
            return this.f13597c;
        }

        public CharSequence c() {
            CharSequence charSequence = this.f13598d;
            return charSequence != null ? charSequence : "";
        }

        public CharSequence d() {
            return this.f13596b;
        }

        public CharSequence e() {
            return this.f13595a;
        }

        public boolean f() {
            return this.f13599e;
        }

        public boolean g() {
            return this.f13600f;
        }
    }

    public q(j jVar, Executor executor, a aVar) {
        if (jVar == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        } else if (executor == null) {
            throw new IllegalArgumentException("Executor must not be null.");
        } else if (aVar != null) {
            f(true, jVar.F0(), (r) new u0(jVar).a(r.class), executor, aVar);
        } else {
            throw new IllegalArgumentException("AuthenticationCallback must not be null.");
        }
    }

    private void b(d dVar, c cVar) {
        androidx.fragment.app.q qVar = this.f13586a;
        if (qVar == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (qVar.Q0()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            d().g2(dVar, cVar);
        }
    }

    private static o c(androidx.fragment.app.q qVar) {
        return (o) qVar.h0("androidx.biometric.BiometricFragment");
    }

    private o d() {
        o c10 = c(this.f13586a);
        if (c10 != null) {
            return c10;
        }
        o N2 = o.N2(this.f13587b);
        this.f13586a.n().e(N2, "androidx.biometric.BiometricFragment").i();
        this.f13586a.d0();
        return N2;
    }

    static r e(i iVar, boolean z10) {
        x0 q10 = z10 ? iVar.q() : null;
        if (q10 == null) {
            q10 = iVar.M();
        }
        if (q10 != null) {
            return (r) new u0(q10).a(r.class);
        }
        throw new IllegalStateException("view model not found");
    }

    private void f(boolean z10, androidx.fragment.app.q qVar, r rVar, Executor executor, a aVar) {
        this.f13587b = z10;
        this.f13586a = qVar;
        if (executor != null) {
            rVar.S(executor);
        }
        rVar.R(aVar);
    }

    public void a(d dVar) {
        if (dVar != null) {
            b(dVar, (c) null);
            return;
        }
        throw new IllegalArgumentException("PromptInfo cannot be null.");
    }
}
