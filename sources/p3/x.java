package p3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import s3.m1;
import s3.n1;
import s3.o;
import z3.b;
import z3.d;

abstract class x extends m1 {

    /* renamed from: b  reason: collision with root package name */
    private final int f14659b;

    protected x(byte[] bArr) {
        o.a(bArr.length == 25);
        this.f14659b = Arrays.hashCode(bArr);
    }

    protected static byte[] d(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final b b() {
        return d.l0(j());
    }

    public final boolean equals(Object obj) {
        b b10;
        if (obj != null && (obj instanceof n1)) {
            try {
                n1 n1Var = (n1) obj;
                if (n1Var.g0() != this.f14659b || (b10 = n1Var.b()) == null) {
                    return false;
                }
                return Arrays.equals(j(), (byte[]) d.j(b10));
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int g0() {
        return this.f14659b;
    }

    public final int hashCode() {
        return this.f14659b;
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] j();
}
