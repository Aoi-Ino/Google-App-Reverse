package y5;

import f6.c0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f18495a = new byte[0];

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f18496a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                f6.i0[] r0 = f6.i0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18496a = r0
                f6.i0 r1 = f6.i0.LEGACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18496a     // Catch:{ NoSuchFieldError -> 0x001d }
                f6.i0 r1 = f6.i0.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18496a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f6.i0 r1 = f6.i0.TINK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18496a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f6.i0 r1 = f6.i0.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.c.a.<clinit>():void");
        }
    }

    public static byte[] a(c0.c cVar) {
        ByteBuffer put;
        int i10 = a.f18496a[cVar.S().ordinal()];
        if (i10 == 1 || i10 == 2) {
            put = ByteBuffer.allocate(5).put((byte) 0);
        } else if (i10 == 3) {
            put = ByteBuffer.allocate(5).put((byte) 1);
        } else if (i10 == 4) {
            return f18495a;
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return put.putInt(cVar.R()).array();
    }
}
