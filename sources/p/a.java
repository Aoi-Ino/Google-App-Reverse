package p;

import java.util.Arrays;
import p.b;

public class a implements b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f14493l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int f14494a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final b f14495b;

    /* renamed from: c  reason: collision with root package name */
    protected final c f14496c;

    /* renamed from: d  reason: collision with root package name */
    private int f14497d = 8;

    /* renamed from: e  reason: collision with root package name */
    private i f14498e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f14499f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f14500g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f14501h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f14502i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f14503j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14504k = false;

    a(b bVar, c cVar) {
        this.f14495b = bVar;
        this.f14496c = cVar;
    }

    public float a(int i10) {
        int i11 = this.f14502i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f14494a) {
            if (i12 == i10) {
                return this.f14501h[i11];
            }
            i11 = this.f14500g[i11];
            i12++;
        }
        return 0.0f;
    }

    public float b(b bVar, boolean z10) {
        float i10 = i(bVar.f14505a);
        c(bVar.f14505a, z10);
        b.a aVar = bVar.f14509e;
        int g10 = aVar.g();
        for (int i11 = 0; i11 < g10; i11++) {
            i h10 = aVar.h(i11);
            f(h10, aVar.i(h10) * i10, z10);
        }
        return i10;
    }

    public final float c(i iVar, boolean z10) {
        if (this.f14498e == iVar) {
            this.f14498e = null;
        }
        int i10 = this.f14502i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f14494a) {
            if (this.f14499f[i10] == iVar.f14556g) {
                if (i10 == this.f14502i) {
                    this.f14502i = this.f14500g[i10];
                } else {
                    int[] iArr = this.f14500g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.d(this.f14495b);
                }
                iVar.f14566q--;
                this.f14494a--;
                this.f14499f[i10] = -1;
                if (this.f14504k) {
                    this.f14503j = i10;
                }
                return this.f14501h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f14500g[i10];
        }
        return 0.0f;
    }

    public final void clear() {
        int i10 = this.f14502i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14494a) {
            i iVar = this.f14496c.f14514d[this.f14499f[i10]];
            if (iVar != null) {
                iVar.d(this.f14495b);
            }
            i10 = this.f14500g[i10];
            i11++;
        }
        this.f14502i = -1;
        this.f14503j = -1;
        this.f14504k = false;
        this.f14494a = 0;
    }

    public final void d(i iVar, float f10) {
        if (f10 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i10 = this.f14502i;
        if (i10 == -1) {
            this.f14502i = 0;
            this.f14501h[0] = f10;
            this.f14499f[0] = iVar.f14556g;
            this.f14500g[0] = -1;
            iVar.f14566q++;
            iVar.a(this.f14495b);
            this.f14494a++;
            if (!this.f14504k) {
                int i11 = this.f14503j + 1;
                this.f14503j = i11;
                int[] iArr = this.f14499f;
                if (i11 >= iArr.length) {
                    this.f14504k = true;
                    this.f14503j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f14494a) {
            int i14 = this.f14499f[i10];
            int i15 = iVar.f14556g;
            if (i14 == i15) {
                this.f14501h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i13 = i10;
            }
            i10 = this.f14500g[i10];
            i12++;
        }
        int i16 = this.f14503j;
        int i17 = i16 + 1;
        if (this.f14504k) {
            int[] iArr2 = this.f14499f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f14499f;
        if (i16 >= iArr3.length && this.f14494a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f14499f;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f14499f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f14497d * 2;
            this.f14497d = i19;
            this.f14504k = false;
            this.f14503j = i16 - 1;
            this.f14501h = Arrays.copyOf(this.f14501h, i19);
            this.f14499f = Arrays.copyOf(this.f14499f, this.f14497d);
            this.f14500g = Arrays.copyOf(this.f14500g, this.f14497d);
        }
        this.f14499f[i16] = iVar.f14556g;
        this.f14501h[i16] = f10;
        int[] iArr6 = this.f14500g;
        if (i13 != -1) {
            iArr6[i16] = iArr6[i13];
            iArr6[i13] = i16;
        } else {
            iArr6[i16] = this.f14502i;
            this.f14502i = i16;
        }
        iVar.f14566q++;
        iVar.a(this.f14495b);
        int i20 = this.f14494a + 1;
        this.f14494a = i20;
        if (!this.f14504k) {
            this.f14503j++;
        }
        int[] iArr7 = this.f14499f;
        if (i20 >= iArr7.length) {
            this.f14504k = true;
        }
        if (this.f14503j >= iArr7.length) {
            this.f14504k = true;
            this.f14503j = iArr7.length - 1;
        }
    }

    public boolean e(i iVar) {
        int i10 = this.f14502i;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14494a) {
            if (this.f14499f[i10] == iVar.f14556g) {
                return true;
            }
            i10 = this.f14500g[i10];
            i11++;
        }
        return false;
    }

    public void f(i iVar, float f10, boolean z10) {
        float f11 = f14493l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f14502i;
            if (i10 == -1) {
                this.f14502i = 0;
                this.f14501h[0] = f10;
                this.f14499f[0] = iVar.f14556g;
                this.f14500g[0] = -1;
                iVar.f14566q++;
                iVar.a(this.f14495b);
                this.f14494a++;
                if (!this.f14504k) {
                    int i11 = this.f14503j + 1;
                    this.f14503j = i11;
                    int[] iArr = this.f14499f;
                    if (i11 >= iArr.length) {
                        this.f14504k = true;
                        this.f14503j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f14494a) {
                int i14 = this.f14499f[i10];
                int i15 = iVar.f14556g;
                if (i14 == i15) {
                    float[] fArr = this.f14501h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f14493l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f14502i) {
                            this.f14502i = this.f14500g[i10];
                        } else {
                            int[] iArr2 = this.f14500g;
                            iArr2[i13] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.d(this.f14495b);
                        }
                        if (this.f14504k) {
                            this.f14503j = i10;
                        }
                        iVar.f14566q--;
                        this.f14494a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i13 = i10;
                }
                i10 = this.f14500g[i10];
                i12++;
            }
            int i16 = this.f14503j;
            int i17 = i16 + 1;
            if (this.f14504k) {
                int[] iArr3 = this.f14499f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f14499f;
            if (i16 >= iArr4.length && this.f14494a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f14499f;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f14499f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f14497d * 2;
                this.f14497d = i19;
                this.f14504k = false;
                this.f14503j = i16 - 1;
                this.f14501h = Arrays.copyOf(this.f14501h, i19);
                this.f14499f = Arrays.copyOf(this.f14499f, this.f14497d);
                this.f14500g = Arrays.copyOf(this.f14500g, this.f14497d);
            }
            this.f14499f[i16] = iVar.f14556g;
            this.f14501h[i16] = f10;
            int[] iArr7 = this.f14500g;
            if (i13 != -1) {
                iArr7[i16] = iArr7[i13];
                iArr7[i13] = i16;
            } else {
                iArr7[i16] = this.f14502i;
                this.f14502i = i16;
            }
            iVar.f14566q++;
            iVar.a(this.f14495b);
            this.f14494a++;
            if (!this.f14504k) {
                this.f14503j++;
            }
            int i20 = this.f14503j;
            int[] iArr8 = this.f14499f;
            if (i20 >= iArr8.length) {
                this.f14504k = true;
                this.f14503j = iArr8.length - 1;
            }
        }
    }

    public int g() {
        return this.f14494a;
    }

    public i h(int i10) {
        int i11 = this.f14502i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f14494a) {
            if (i12 == i10) {
                return this.f14496c.f14514d[this.f14499f[i11]];
            }
            i11 = this.f14500g[i11];
            i12++;
        }
        return null;
    }

    public final float i(i iVar) {
        int i10 = this.f14502i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14494a) {
            if (this.f14499f[i10] == iVar.f14556g) {
                return this.f14501h[i10];
            }
            i10 = this.f14500g[i10];
            i11++;
        }
        return 0.0f;
    }

    public void j(float f10) {
        int i10 = this.f14502i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14494a) {
            float[] fArr = this.f14501h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f14500g[i10];
            i11++;
        }
    }

    public void k() {
        int i10 = this.f14502i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14494a) {
            float[] fArr = this.f14501h;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f14500g[i10];
            i11++;
        }
    }

    public String toString() {
        int i10 = this.f14502i;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f14494a) {
            str = ((str + " -> ") + this.f14501h[i10] + " : ") + this.f14496c.f14514d[this.f14499f[i10]];
            i10 = this.f14500g[i10];
            i11++;
        }
        return str;
    }
}
