package p3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import s3.o;

public class n {

    /* renamed from: b  reason: collision with root package name */
    private static n f14652b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f14653a;

    public n(Context context) {
        this.f14653a = context.getApplicationContext();
    }

    public static n a(Context context) {
        o.i(context);
        synchronized (n.class) {
            try {
                if (f14652b == null) {
                    b0.a(context);
                    f14652b = new n(context);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f14652b;
    }

    static final x b(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        y yVar = new y(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if (xVarArr[i10].equals(yVar)) {
                return xVarArr[i10];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z10 ? b(packageInfo, a0.f14628a) : b(packageInfo, a0.f14628a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
