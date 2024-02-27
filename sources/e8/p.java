package e8;

import a8.j;
import a8.y;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

class p {

    /* renamed from: a  reason: collision with root package name */
    x0 f10977a;

    /* renamed from: b  reason: collision with root package name */
    c1 f10978b;

    /* renamed from: c  reason: collision with root package name */
    c f10979c;

    /* renamed from: d  reason: collision with root package name */
    j2 f10980d;

    /* renamed from: e  reason: collision with root package name */
    i f10981e;

    /* renamed from: f  reason: collision with root package name */
    byte[] f10982f;

    /* renamed from: g  reason: collision with root package name */
    HashMap f10983g;

    /* renamed from: h  reason: collision with root package name */
    s f10984h;

    /* renamed from: i  reason: collision with root package name */
    int f10985i;

    /* renamed from: j  reason: collision with root package name */
    boolean f10986j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f10987k = true;

    p(c1 c1Var, x0 x0Var, c cVar) {
        this.f10978b = c1Var;
        this.f10977a = x0Var;
        this.f10979c = cVar;
        int m10 = cVar.m();
        this.f10985i = m10;
        if (m10 == 0 || m10 == 1) {
            this.f10982f = new byte[256];
        } else if (m10 == 2) {
            this.f10984h = new s();
            this.f10981e = (i) cVar;
        } else if (m10 == 3) {
            this.f10983g = new HashMap();
            this.f10980d = (j2) cVar;
            this.f10986j = cVar.z();
        }
    }

    /* access modifiers changed from: package-private */
    public byte[] a(String str) {
        int i10;
        int i11;
        int i12 = this.f10985i;
        if (i12 == 0 || i12 == 1) {
            byte[] b10 = this.f10979c.b(str);
            for (byte b11 : b10) {
                this.f10982f[b11 & 255] = 1;
            }
            return b10;
        }
        if (i12 == 2) {
            int length = str.length();
            for (int i13 = 0; i13 < length; i13++) {
                this.f10984h.d(this.f10981e.H(str.charAt(i13)), 0);
            }
        } else if (i12 == 3) {
            try {
                int length2 = str.length();
                char[] cArr = new char[length2];
                if (this.f10986j) {
                    byte[] c10 = o0.c(str, "symboltt");
                    int length3 = c10.length;
                    i10 = 0;
                    for (int i14 = 0; i14 < length3; i14++) {
                        int[] N = this.f10980d.N(c10[i14] & 255);
                        if (N != null) {
                            this.f10983g.put(Integer.valueOf(N[0]), new int[]{N[0], N[1], this.f10980d.s(c10[i14] & 255)});
                            cArr[i10] = (char) N[0];
                            i10++;
                        }
                    }
                } else {
                    int i15 = 0;
                    i10 = 0;
                    while (i15 < length2) {
                        if (y.g(str, i15)) {
                            i11 = y.c(str, i15);
                            i15++;
                        } else {
                            i11 = str.charAt(i15);
                        }
                        int[] N2 = this.f10980d.N(i11);
                        if (N2 != null) {
                            int i16 = N2[0];
                            Integer valueOf = Integer.valueOf(i16);
                            if (!this.f10983g.containsKey(valueOf)) {
                                this.f10983g.put(valueOf, new int[]{i16, N2[1], i11});
                            }
                            cArr[i10] = (char) i16;
                            i10++;
                        }
                        i15++;
                    }
                }
                return new String(cArr, 0, i10).getBytes("UnicodeBigUnmarked");
            } catch (UnsupportedEncodingException e10) {
                throw new j(e10);
            }
        } else if (i12 != 4) {
            if (i12 != 5) {
                return null;
            }
            return this.f10979c.b(str);
        }
        return this.f10979c.b(str);
    }

    /* access modifiers changed from: package-private */
    public c1 b() {
        return this.f10978b;
    }

    /* access modifiers changed from: package-private */
    public x0 c() {
        return this.f10977a;
    }

    public void d(boolean z10) {
        this.f10987k = z10;
    }

    /* access modifiers changed from: package-private */
    public void e(c2 c2Var) {
        try {
            int i10 = this.f10985i;
            if (i10 == 0 || i10 == 1) {
                int i11 = 0;
                while (true) {
                    if (i11 >= 256) {
                        break;
                    } else if (this.f10982f[i11] != 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
                int i12 = 255;
                int i13 = 255;
                while (true) {
                    if (i13 < i11) {
                        break;
                    } else if (this.f10982f[i13] != 0) {
                        break;
                    } else {
                        i13--;
                    }
                }
                if (i11 > 255) {
                    i11 = 255;
                } else {
                    i12 = i13;
                }
                this.f10979c.B(c2Var, this.f10977a, new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), this.f10982f, Boolean.valueOf(this.f10987k)});
            } else if (i10 == 2) {
                this.f10979c.B(c2Var, this.f10977a, new Object[]{this.f10984h});
            } else if (i10 == 3) {
                this.f10979c.B(c2Var, this.f10977a, new Object[]{this.f10983g, Boolean.valueOf(this.f10987k)});
            } else if (i10 == 5) {
                this.f10979c.B(c2Var, this.f10977a, (Object[]) null);
            }
        } catch (Exception e10) {
            throw new j(e10);
        }
    }
}
