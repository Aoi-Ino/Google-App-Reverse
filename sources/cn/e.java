package cn;

import cm.l;
import in.h;
import vm.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final h f20286a = h.f24468i.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f20287b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f20288c = new String[64];

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f20289d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f20290e = new e();

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            l.e(binaryString, "Integer.toBinaryString(it)");
            strArr[i10] = p.v(b.q("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        f20289d = strArr;
        String[] strArr2 = f20288c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = l.m(strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f20288c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + "|" + strArr3[i13];
            strArr3[i15 | 8] = strArr3[i14] + "|" + strArr3[i13] + "|PADDED";
        }
        int length = f20288c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f20288c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f20289d[i16];
            }
        }
    }

    private e() {
    }

    public final String a(int i10, int i11) {
        String str;
        String str2;
        String str3;
        if (i11 == 0) {
            return "";
        }
        if (!(i10 == 2 || i10 == 3)) {
            if (i10 == 4 || i10 == 6) {
                return i11 == 1 ? "ACK" : f20289d[i11];
            }
            if (!(i10 == 7 || i10 == 8)) {
                String[] strArr = f20288c;
                if (i11 < strArr.length) {
                    str = strArr[i11];
                    l.c(str);
                } else {
                    str = f20289d[i11];
                }
                String str4 = str;
                if (i10 == 5 && (i11 & 4) != 0) {
                    str2 = "HEADERS";
                    str3 = "PUSH_PROMISE";
                } else if (i10 != 0 || (i11 & 32) == 0) {
                    return str4;
                } else {
                    str2 = "PRIORITY";
                    str3 = "COMPRESSED";
                }
                return p.w(str4, str2, str3, false, 4, (Object) null);
            }
        }
        return f20289d[i11];
    }

    public final String b(int i10) {
        String[] strArr = f20287b;
        return i10 < strArr.length ? strArr[i10] : b.q("0x%02x", Integer.valueOf(i10));
    }

    public final String c(boolean z10, int i10, int i11, int i12, int i13) {
        return b.q("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), b(i12), a(i12, i13));
    }
}
