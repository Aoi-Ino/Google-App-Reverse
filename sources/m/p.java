package m;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final d f13582a;

    /* renamed from: b  reason: collision with root package name */
    private final BiometricManager f13583b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.core.hardware.fingerprint.a f13584c;

    private static class a {
        static int a(BiometricManager biometricManager) {
            return biometricManager.canAuthenticate();
        }

        static BiometricManager b(Context context) {
            return (BiometricManager) context.getSystemService(BiometricManager.class);
        }

        static Method c() {
            try {
                return BiometricManager.class.getMethod("canAuthenticate", new Class[]{BiometricPrompt.CryptoObject.class});
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }
    }

    private static class b {
        static int a(BiometricManager biometricManager, int i10) {
            return biometricManager.canAuthenticate(i10);
        }
    }

    private static class c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final Context f13585a;

        c(Context context) {
            this.f13585a = context.getApplicationContext();
        }

        public boolean a() {
            return y.b(this.f13585a);
        }

        public BiometricManager b() {
            return a.b(this.f13585a);
        }

        public boolean c() {
            return x.b(this.f13585a);
        }

        public boolean d() {
            return u.a(this.f13585a, Build.MODEL);
        }

        public boolean e() {
            return x.a(this.f13585a) != null;
        }

        public androidx.core.hardware.fingerprint.a f() {
            return androidx.core.hardware.fingerprint.a.b(this.f13585a);
        }
    }

    interface d {
        boolean a();

        BiometricManager b();

        boolean c();

        boolean d();

        boolean e();

        androidx.core.hardware.fingerprint.a f();
    }

    p(d dVar) {
        this.f13582a = dVar;
        int i10 = Build.VERSION.SDK_INT;
        androidx.core.hardware.fingerprint.a aVar = null;
        this.f13583b = i10 >= 29 ? dVar.b() : null;
        this.f13584c = i10 <= 29 ? dVar.f() : aVar;
    }

    private int b(int i10) {
        if (!b.f(i10)) {
            return -2;
        }
        if (i10 == 0 || !this.f13582a.e()) {
            return 12;
        }
        if (b.d(i10)) {
            return this.f13582a.c() ? 0 : 11;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 == 29) {
            return b.g(i10) ? f() : e();
        }
        if (i11 != 28) {
            return c();
        }
        if (this.f13582a.a()) {
            return d();
        }
        return 12;
    }

    private int c() {
        androidx.core.hardware.fingerprint.a aVar = this.f13584c;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        } else if (!aVar.e()) {
            return 12;
        } else {
            return !this.f13584c.d() ? 11 : 0;
        }
    }

    private int d() {
        if (!this.f13582a.c()) {
            return c();
        }
        return c() == 0 ? 0 : -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int e() {
        /*
            r5 = this;
            java.lang.String r0 = "BiometricManager"
            java.lang.reflect.Method r1 = m.p.a.c()
            if (r1 == 0) goto L_0x0040
            m.q$c r2 = m.t.a()
            android.hardware.biometrics.BiometricPrompt$CryptoObject r2 = m.t.d(r2)
            if (r2 == 0) goto L_0x0040
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            r4 = 29
            if (r3 != r4) goto L_0x0029
            android.hardware.biometrics.BiometricManager r3 = r5.f13583b     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            goto L_0x002a
        L_0x0023:
            r1 = move-exception
            goto L_0x003b
        L_0x0025:
            r1 = move-exception
            goto L_0x003b
        L_0x0027:
            r1 = move-exception
            goto L_0x003b
        L_0x0029:
            r1 = 0
        L_0x002a:
            boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            if (r2 == 0) goto L_0x0035
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            int r0 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            return r0
        L_0x0035:
            java.lang.String r1 = "Invalid return type for canAuthenticate(CryptoObject)."
            android.util.Log.w(r0, r1)     // Catch:{ IllegalAccessException -> 0x0027, IllegalArgumentException -> 0x0025, InvocationTargetException -> 0x0023 }
            goto L_0x0040
        L_0x003b:
            java.lang.String r2 = "Failed to invoke canAuthenticate(CryptoObject)."
            android.util.Log.w(r0, r2, r1)
        L_0x0040:
            int r0 = r5.f()
            m.p$d r1 = r5.f13582a
            boolean r1 = r1.d()
            if (r1 != 0) goto L_0x0053
            if (r0 == 0) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            int r0 = r5.d()
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.p.e():int");
    }

    private int f() {
        BiometricManager biometricManager = this.f13583b;
        if (biometricManager != null) {
            return a.a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }

    public static p g(Context context) {
        return new p(new c(context));
    }

    public int a(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            return b(i10);
        }
        BiometricManager biometricManager = this.f13583b;
        if (biometricManager != null) {
            return b.a(biometricManager, i10);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
