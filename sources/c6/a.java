package c6;

import android.content.Context;
import android.util.Log;
import c6.c;
import com.google.crypto.tink.shaded.protobuf.a0;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import y5.g;
import y5.i;
import y5.j;
import y5.k;
import y5.l;

public final class a {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f4746d = "a";

    /* renamed from: a  reason: collision with root package name */
    private final l f4747a;

    /* renamed from: b  reason: collision with root package name */
    private final y5.a f4748b;

    /* renamed from: c  reason: collision with root package name */
    private j f4749c;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private k f4750a = null;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public l f4751b = null;

        /* renamed from: c  reason: collision with root package name */
        private String f4752c = null;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public y5.a f4753d = null;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4754e = true;

        /* renamed from: f  reason: collision with root package name */
        private g f4755f = null;

        /* renamed from: g  reason: collision with root package name */
        private KeyStore f4756g = null;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public j f4757h;

        private j e() {
            y5.a aVar = this.f4753d;
            if (aVar != null) {
                try {
                    return j.j(i.j(this.f4750a, aVar));
                } catch (a0 | GeneralSecurityException e10) {
                    Log.w(a.f4746d, "cannot decrypt keyset: ", e10);
                }
            }
            return j.j(y5.b.a(this.f4750a));
        }

        private j f() {
            try {
                return e();
            } catch (FileNotFoundException e10) {
                Log.w(a.f4746d, "keyset not found, will generate a new one", e10);
                if (this.f4755f != null) {
                    j a10 = j.i().a(this.f4755f);
                    j h10 = a10.h(a10.c().g().Q(0).Q());
                    if (this.f4753d != null) {
                        h10.c().k(this.f4751b, this.f4753d);
                    } else {
                        y5.b.b(h10.c(), this.f4751b);
                    }
                    return h10;
                }
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }

        private y5.a g() {
            if (!a.d()) {
                Log.w(a.f4746d, "Android Keystore requires at least Android M");
                return null;
            }
            c a10 = this.f4756g != null ? new c.b().b(this.f4756g).a() : new c();
            boolean e10 = a10.e(this.f4752c);
            if (!e10) {
                try {
                    c.d(this.f4752c);
                } catch (GeneralSecurityException | ProviderException e11) {
                    Log.w(a.f4746d, "cannot use Android Keystore, it'll be disabled", e11);
                    return null;
                }
            }
            try {
                return a10.b(this.f4752c);
            } catch (GeneralSecurityException | ProviderException e12) {
                if (!e10) {
                    Log.w(a.f4746d, "cannot use Android Keystore, it'll be disabled", e12);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.f4752c}), e12);
            }
        }

        public synchronized a d() {
            try {
                if (this.f4752c != null) {
                    this.f4753d = g();
                }
                this.f4757h = f();
            } catch (Throwable th2) {
                throw th2;
            }
            return new a(this);
        }

        public b h(g gVar) {
            this.f4755f = gVar;
            return this;
        }

        public b i(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else if (this.f4754e) {
                this.f4752c = str;
                return this;
            } else {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
        }

        public b j(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.f4750a = new d(context, str, str2);
                this.f4751b = new e(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    private a(b bVar) {
        this.f4747a = bVar.f4751b;
        this.f4748b = bVar.f4753d;
        this.f4749c = bVar.f4757h;
    }

    /* access modifiers changed from: private */
    public static boolean d() {
        return true;
    }

    public synchronized i c() {
        return this.f4749c.c();
    }
}
