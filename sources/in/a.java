package in;

import cm.l;
import in.h;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f24445a;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f24446b;

    static {
        h.a aVar = h.f24468i;
        f24445a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").e();
        f24446b = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").e();
    }

    public static final String a(byte[] bArr, byte[] bArr2) {
        l.f(bArr, "$this$encodeBase64");
        l.f(bArr2, "map");
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            int i12 = i10 + 2;
            byte b11 = bArr[i10 + 1];
            i10 += 3;
            byte b12 = bArr[i12];
            bArr3[i11] = bArr2[(b10 & 255) >> 2];
            bArr3[i11 + 1] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i13 = i11 + 3;
            bArr3[i11 + 2] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i11 += 4;
            bArr3[i13] = bArr2[b12 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i10];
            bArr3[i11] = bArr2[(b13 & 255) >> 2];
            bArr3[i11 + 1] = bArr2[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr3[i11 + 2] = b14;
            bArr3[i11 + 3] = b14;
        } else if (length2 == 2) {
            int i14 = i10 + 1;
            byte b15 = bArr[i10];
            byte b16 = bArr[i14];
            bArr3[i11] = bArr2[(b15 & 255) >> 2];
            bArr3[i11 + 1] = bArr2[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr3[i11 + 2] = bArr2[(b16 & 15) << 2];
            bArr3[i11 + 3] = (byte) 61;
        }
        return b.b(bArr3);
    }

    public static /* synthetic */ String b(byte[] bArr, byte[] bArr2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bArr2 = f24445a;
        }
        return a(bArr, bArr2);
    }
}
