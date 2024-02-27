package jn;

import cm.l;
import in.b;
import in.e;
import in.r;
import in.v;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f24665a = b.a("0123456789abcdef");

    public static final byte[] a() {
        return f24665a;
    }

    public static final String b(e eVar, long j10) {
        l.f(eVar, "$this$readUtf8Line");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (eVar.R(j11) == ((byte) 13)) {
                String E0 = eVar.E0(j11);
                eVar.skip(2);
                return E0;
            }
        }
        String E02 = eVar.E0(j10);
        eVar.skip(1);
        return E02;
    }

    public static final int c(e eVar, r rVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        v vVar;
        int i13;
        e eVar2 = eVar;
        l.f(eVar2, "$this$selectPrefix");
        l.f(rVar, "options");
        v vVar2 = eVar2.f24463e;
        if (vVar2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = vVar2.f24499a;
        int i14 = vVar2.f24500b;
        int i15 = vVar2.f24501c;
        int[] s10 = rVar.s();
        v vVar3 = vVar2;
        int i16 = -1;
        int i17 = 0;
        loop0:
        while (true) {
            int i18 = i17 + 1;
            int i19 = s10[i17];
            int i20 = i17 + 2;
            int i21 = s10[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (vVar3 == null) {
                break;
            }
            if (i19 < 0) {
                int i22 = i20 + (i19 * -1);
                while (true) {
                    int i23 = i14 + 1;
                    int i24 = i20 + 1;
                    if ((bArr[i14] & 255) != s10[i20]) {
                        return i16;
                    }
                    boolean z11 = i24 == i22;
                    if (i23 == i15) {
                        l.c(vVar3);
                        v vVar4 = vVar3.f24504f;
                        l.c(vVar4);
                        i13 = vVar4.f24500b;
                        byte[] bArr2 = vVar4.f24499a;
                        i12 = vVar4.f24501c;
                        if (vVar4 != vVar2) {
                            byte[] bArr3 = bArr2;
                            vVar = vVar4;
                            bArr = bArr3;
                        } else if (!z11) {
                            break loop0;
                        } else {
                            bArr = bArr2;
                            vVar = null;
                        }
                    } else {
                        vVar = vVar3;
                        i12 = i15;
                        i13 = i23;
                    }
                    if (z11) {
                        i11 = s10[i24];
                        i10 = i13;
                        i15 = i12;
                        vVar3 = vVar;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    vVar3 = vVar;
                    i20 = i24;
                }
            } else {
                i10 = i14 + 1;
                byte b10 = bArr[i14] & 255;
                int i25 = i20 + i19;
                while (i20 != i25) {
                    if (b10 == s10[i20]) {
                        i11 = s10[i20 + i19];
                        if (i10 == i15) {
                            vVar3 = vVar3.f24504f;
                            l.c(vVar3);
                            i10 = vVar3.f24500b;
                            bArr = vVar3.f24499a;
                            i15 = vVar3.f24501c;
                            if (vVar3 == vVar2) {
                                vVar3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int d(e eVar, r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c(eVar, rVar, z10);
    }
}
