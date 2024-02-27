package e8;

import a8.g;
import a8.y;
import b8.a;
import e8.c;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

class j2 extends h2 implements Comparator {
    private static final byte[] Y = {Byte.MIN_VALUE, 64, 32, 16, 8, 4, 2, 1};
    boolean X = false;

    j2(String str, String str2, boolean z10, byte[] bArr, boolean z11) {
        String i10 = c.i(str);
        String P = h2.P(i10);
        if (i10.length() < str.length()) {
            this.E = str.substring(i10.length());
        }
        this.f10191g = str2;
        this.f10192h = z10;
        this.f10769y = P;
        this.D = "";
        if (P.length() < i10.length()) {
            this.D = i10.substring(P.length() + 1);
        }
        this.f10186b = 3;
        if ((this.f10769y.toLowerCase().endsWith(".ttf") || this.f10769y.toLowerCase().endsWith(".otf") || this.f10769y.toLowerCase().endsWith(".ttc")) && ((str2.equals("Identity-H") || str2.equals("Identity-V")) && z10)) {
            Q(bArr, z11);
            if (this.H.f10791d != 2) {
                if ((this.L == null && !this.f10194j) || (this.K == null && this.f10194j)) {
                    this.f10196l = true;
                }
                if (this.f10194j) {
                    this.f10194j = false;
                    String str3 = this.f10191g;
                    this.f10191g = "";
                    c();
                    this.f10191g = str3;
                    this.f10194j = true;
                }
                this.X = str2.endsWith("V");
                return;
            }
            throw new g(a.b("1.cannot.be.embedded.due.to.licensing.restrictions", this.f10769y + this.E));
        }
        throw new g(a.b("1.2.is.not.a.ttf.font.file", this.f10769y, this.E));
    }

    private l0 d0(x0 x0Var, String str, Object[] objArr) {
        c1 c1Var;
        c1 c1Var2;
        l0 l0Var = new l0(c1.f10473v3);
        if (this.f10770z) {
            l0Var.r(c1.f10492w9, c1.S0);
            c1Var = c1.Z;
            c1Var2 = new c1(str + this.O + "-" + this.f10191g);
        } else {
            l0Var.r(c1.f10492w9, c1.T0);
            c1Var = c1.Z;
            c1Var2 = new c1(str + this.O);
        }
        l0Var.r(c1Var, c1Var2);
        l0Var.r(c1.f10499x3, x0Var);
        if (!this.f10770z) {
            l0Var.r(c1.W0, c1.f10513y4);
        }
        l0 l0Var2 = new l0();
        l0Var2.r(c1.f10247d8, new y1("Adobe"));
        l0Var2.r(c1.L6, new y1("Identity"));
        l0Var2.r(c1.f10505x9, new f1(0));
        l0Var.r(c1.V0, l0Var2);
        if (!this.X) {
            l0Var.r(c1.f10459u2, new f1(1000));
            StringBuffer stringBuffer = new StringBuffer("[");
            int i10 = -10;
            boolean z10 = true;
            for (int[] iArr : objArr) {
                if (iArr[1] != 1000) {
                    int i11 = iArr[0];
                    if (i11 == i10 + 1) {
                        stringBuffer.append(' ');
                        stringBuffer.append(iArr[1]);
                    } else {
                        if (!z10) {
                            stringBuffer.append(']');
                        }
                        stringBuffer.append(i11);
                        stringBuffer.append('[');
                        stringBuffer.append(iArr[1]);
                        z10 = false;
                    }
                    i10 = i11;
                }
            }
            if (stringBuffer.length() > 1) {
                stringBuffer.append("]]");
                l0Var.r(c1.f10262eb, new a1(stringBuffer.toString()));
            }
        }
        return l0Var;
    }

    private l0 e0(x0 x0Var, String str, x0 x0Var2) {
        c1 c1Var;
        c1 c1Var2;
        l0 l0Var = new l0(c1.f10473v3);
        l0Var.r(c1.f10492w9, c1.f10467ua);
        if (this.f10770z) {
            c1Var = c1.Z;
            c1Var2 = new c1(str + this.O + "-" + this.f10191g);
        } else {
            c1Var = c1.Z;
            c1Var2 = new c1(str + this.O);
        }
        l0Var.r(c1Var, c1Var2);
        l0Var.r(c1.F2, new c1(this.f10191g));
        l0Var.r(c1.S1, new b0((i1) x0Var));
        if (x0Var2 != null) {
            l0Var.r(c1.f10225ba, x0Var2);
        }
        return l0Var;
    }

    private x1 f0(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer("/CIDInit /ProcSet findresource begin\n12 dict begin\nbegincmap\n/CIDSystemInfo\n<< /Registry (TTX+0)\n/Ordering (T42UV)\n/Supplement 0\n>> def\n/CMapName /TTX+0 def\n/CMapType 2 def\n1 begincodespacerange\n<0000><FFFF>\nendcodespacerange\n");
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            if (i10 == 0) {
                if (i11 != 0) {
                    stringBuffer.append("endbfrange\n");
                }
                i10 = Math.min(100, objArr.length - i11);
                stringBuffer.append(i10);
                stringBuffer.append(" beginbfrange\n");
            }
            i10--;
            int[] iArr = objArr[i11];
            String g02 = g0(iArr[0]);
            stringBuffer.append(g02);
            stringBuffer.append(g02);
            stringBuffer.append(g0(iArr[2]));
            stringBuffer.append(10);
        }
        stringBuffer.append("endbfrange\nendcmap\nCMapName currentdict /CMap defineresource pop\nend end\n");
        x1 x1Var = new x1(o0.c(stringBuffer.toString(), (String) null));
        x1Var.v(this.f10193i);
        return x1Var;
    }

    static String g0(int i10) {
        if (i10 < 65536) {
            return "<" + h0(i10) + ">";
        }
        int i11 = i10 - 65536;
        return "[<" + h0((i11 / 1024) + 55296) + h0((i11 % 1024) + 56320) + ">]";
    }

    private static String h0(int i10) {
        String str = "0000" + Integer.toHexString(i10);
        return str.substring(str.length() - 4);
    }

    /* access modifiers changed from: package-private */
    public void B(c2 c2Var, x0 x0Var, Object[] objArr) {
        x0 x0Var2;
        w0 n10;
        x1 x1Var;
        c2 c2Var2 = c2Var;
        HashMap hashMap = objArr[0];
        C(hashMap, true, this.f10197m);
        int[][] iArr = (int[][]) hashMap.values().toArray(new int[0][]);
        Arrays.sort(iArr, this);
        x0 x0Var3 = null;
        if (c2Var.G() == 3 || c2Var.G() == 4) {
            if (iArr.length == 0) {
                x1Var = new x1(new byte[]{Byte.MIN_VALUE});
            } else {
                byte[] bArr = new byte[((iArr[iArr.length - 1][0] / 8) + 1)];
                for (int[] iArr2 : iArr) {
                    int i10 = iArr2[0];
                    int i11 = i10 / 8;
                    bArr[i11] = (byte) (Y[i10 % 8] | bArr[i11]);
                }
                x1Var = new x1(bArr);
                x1Var.v(this.f10193i);
            }
            x0Var2 = c2Var2.n(x1Var).a();
        } else {
            x0Var2 = null;
        }
        if (this.f10770z) {
            byte[] T = T();
            if (this.f10197m || this.f10185a != null) {
                h hVar = new h(new f2(T), hashMap);
                T = hVar.N(hVar.h()[0]);
            }
            n10 = c2Var2.n(new c.a(T, "CIDFontType0C", this.f10193i));
        } else {
            byte[] h10 = (this.f10197m || this.C != 0) ? new i2(this.f10769y, new f2(this.f10768x), new HashSet(hashMap.keySet()), this.C, false, false).h() : L();
            n10 = c2Var2.n(new c.a(h10, new int[]{h10.length}, this.f10193i));
        }
        x0 a10 = n10.a();
        String h11 = this.f10197m ? c.h() : "";
        x0 a11 = c2Var2.n(d0(c2Var2.n(K(a10, h11, x0Var2)).a(), h11, iArr)).a();
        x1 f02 = f0(iArr);
        if (f02 != null) {
            x0Var3 = c2Var2.n(f02).a();
        }
        c2Var2.o(e0(a11, h11, x0Var3), x0Var);
    }

    public int[] N(int i10) {
        Object obj;
        HashMap hashMap = this.M;
        if (hashMap != null) {
            obj = hashMap.get(Integer.valueOf(i10));
        } else {
            boolean z10 = this.f10194j;
            HashMap hashMap2 = z10 ? this.K : this.L;
            if (hashMap2 == null) {
                return null;
            }
            if (z10) {
                int i11 = i10 & -256;
                if (i11 != 0 && i11 != 61440) {
                    return null;
                }
                i10 &= 255;
            }
            obj = hashMap2.get(Integer.valueOf(i10));
        }
        return (int[]) obj;
    }

    /* access modifiers changed from: package-private */
    public byte[] a(int i10) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public byte[] b(String str) {
        return null;
    }

    /* renamed from: c0 */
    public int compare(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr2[0];
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public int u(int i10) {
        String str;
        if (this.X) {
            return 1000;
        }
        if (this.f10194j) {
            int i11 = 65280 & i10;
            if (i11 != 0 && i11 != 61440) {
                return 0;
            }
            i10 &= 255;
            str = null;
        } else {
            str = this.f10191g;
        }
        return p(i10, str);
    }

    public int v(String str) {
        int i10;
        if (this.X) {
            return str.length() * 1000;
        }
        int i11 = 0;
        if (this.f10194j) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            i10 = 0;
            while (i11 < length) {
                char c10 = charArray[i11];
                char c11 = 65280 & c10;
                if (c11 == 0 || c11 == 61440) {
                    i10 += p(c10 & 255, (String) null);
                }
                i11++;
            }
        } else {
            int length2 = str.length();
            i10 = 0;
            while (i11 < length2) {
                if (y.g(str, i11)) {
                    i10 += p(y.c(str, i11), this.f10191g);
                    i11++;
                } else {
                    i10 += p(str.charAt(i11), this.f10191g);
                }
                i11++;
            }
        }
        return i10;
    }
}
