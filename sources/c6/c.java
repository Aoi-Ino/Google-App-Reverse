package c6;

import android.security.keystore.KeyGenParameterSpec;
import g6.u;
import g6.w;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import y5.m;

public final class c implements m {

    /* renamed from: c  reason: collision with root package name */
    private static final String f4760c = "c";

    /* renamed from: a  reason: collision with root package name */
    private final String f4761a;

    /* renamed from: b  reason: collision with root package name */
    private KeyStore f4762b;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        String f4763a = null;

        /* renamed from: b  reason: collision with root package name */
        KeyStore f4764b = null;

        public b() {
            if (c.f()) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    this.f4764b = instance;
                    instance.load((KeyStore.LoadStoreParameter) null);
                } catch (IOException | GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }

        public c a() {
            return new c(this);
        }

        public b b(KeyStore keyStore) {
            if (keyStore != null) {
                this.f4764b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    public c() {
        this(new b());
    }

    public static void d(String str) {
        if (!new c().e(str)) {
            String b10 = w.b("android-keystore://", str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(b10, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
    }

    /* access modifiers changed from: private */
    public static boolean f() {
        return true;
    }

    private static y5.a g(y5.a aVar) {
        byte[] c10 = u.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c10, aVar.b(aVar.a(c10, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f4761a     // Catch:{ all -> 0x000e }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0010
            monitor-exit(r2)
            return r1
        L_0x000e:
            r3 = move-exception
            goto L_0x0026
        L_0x0010:
            java.lang.String r0 = r2.f4761a     // Catch:{ all -> 0x000e }
            if (r0 != 0) goto L_0x0023
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x000e }
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch:{ all -> 0x000e }
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch:{ all -> 0x000e }
            if (r3 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            monitor-exit(r2)
            return r1
        L_0x0026:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.a(java.lang.String):boolean");
    }

    public synchronized y5.a b(String str) {
        try {
            String str2 = this.f4761a;
            if (str2 != null) {
                if (!str2.equals(str)) {
                    throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", new Object[]{this.f4761a, str}));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return g(new b(w.b("android-keystore://", str), this.f4762b));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        android.util.Log.w(f4760c, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        java.lang.Thread.sleep(20);
        r0 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r2.f4762b = r0;
        r0.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return r2.f4762b.containsAlias(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        throw new java.security.GeneralSecurityException(r3);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean e(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = g6.w.b(r0, r3)     // Catch:{ all -> 0x000f }
            java.security.KeyStore r0 = r2.f4762b     // Catch:{ NullPointerException -> 0x0011 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x0011 }
            monitor-exit(r2)
            return r3
        L_0x000f:
            r3 = move-exception
            goto L_0x003a
        L_0x0011:
            java.lang.String r0 = f4760c     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x000f }
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x002a, InterruptedException -> 0x002c }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002a, InterruptedException -> 0x002c }
            r2.f4762b = r0     // Catch:{ IOException -> 0x002a, InterruptedException -> 0x002c }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002a, InterruptedException -> 0x002c }
            goto L_0x002c
        L_0x002a:
            r3 = move-exception
            goto L_0x0034
        L_0x002c:
            java.security.KeyStore r0 = r2.f4762b     // Catch:{ all -> 0x000f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x000f }
            monitor-exit(r2)
            return r3
        L_0x0034:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x000f }
            r0.<init>(r3)     // Catch:{ all -> 0x000f }
            throw r0     // Catch:{ all -> 0x000f }
        L_0x003a:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.c.e(java.lang.String):boolean");
    }

    private c(b bVar) {
        this.f4761a = bVar.f4763a;
        this.f4762b = bVar.f4764b;
    }
}
