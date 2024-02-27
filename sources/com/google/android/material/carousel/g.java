package com.google.android.material.carousel;

import com.google.android.material.carousel.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r4.a;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final f f5800a;

    /* renamed from: b  reason: collision with root package name */
    private final List f5801b;

    /* renamed from: c  reason: collision with root package name */
    private final List f5802c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f5803d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f5804e;

    /* renamed from: f  reason: collision with root package name */
    private final float f5805f;

    /* renamed from: g  reason: collision with root package name */
    private final float f5806g;

    private g(f fVar, List list, List list2) {
        this.f5800a = fVar;
        this.f5801b = Collections.unmodifiableList(list);
        this.f5802c = Collections.unmodifiableList(list2);
        float f10 = ((f) list.get(list.size() - 1)).c().f5794a - fVar.c().f5794a;
        this.f5805f = f10;
        float f11 = fVar.j().f5794a - ((f) list2.get(list2.size() - 1)).j().f5794a;
        this.f5806g = f11;
        this.f5803d = m(f10, list, true);
        this.f5804e = m(f11, list2, false);
    }

    private f a(List list, float f10, float[] fArr) {
        float[] o10 = o(list, f10, fArr);
        return (f) list.get((int) (o10[0] > 0.5f ? o10[2] : o10[1]));
    }

    private static int b(f fVar, float f10) {
        for (int i10 = fVar.i(); i10 < fVar.g().size(); i10++) {
            if (f10 == ((f.c) fVar.g().get(i10)).f5796c) {
                return i10;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i10 = 0; i10 < fVar.g().size(); i10++) {
            if (!((f.c) fVar.g().get(i10)).f5798e) {
                return i10;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f10) {
        for (int b10 = fVar.b() - 1; b10 >= 0; b10--) {
            if (f10 == ((f.c) fVar.g().get(b10)).f5796c) {
                return b10;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!((f.c) fVar.g().get(size)).f5798e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar) {
        return new g(fVar, p(bVar, fVar), n(bVar, fVar));
    }

    private static float[] m(float f10, List list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            f fVar = (f) list.get(i11);
            f fVar2 = (f) list.get(i10);
            fArr[i10] = i10 == size + -1 ? 1.0f : fArr[i11] + ((z10 ? fVar2.c().f5794a - fVar.c().f5794a : fVar.j().f5794a - fVar2.j().f5794a) / f10);
            i10++;
        }
        return fArr;
    }

    private static List n(b bVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int e10 = e(fVar);
        if (!r(bVar, fVar) && e10 != -1) {
            int i10 = e10 - fVar.i();
            float a10 = (float) (bVar.f() ? bVar.a() : bVar.c());
            float f10 = fVar.c().f5795b - (fVar.c().f5797d / 2.0f);
            float f11 = 0.0f;
            if (i10 > 0 || fVar.h().f5799f <= 0.0f) {
                int i11 = 0;
                while (i11 < i10) {
                    f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                    int i12 = e10 - i11;
                    float f12 = f11 + ((f.c) fVar.g().get(i12)).f5799f;
                    int i13 = i12 + 1;
                    arrayList.add(t(fVar2, e10, i13 < fVar.g().size() ? d(fVar2, ((f.c) fVar.g().get(i13)).f5796c) + 1 : 0, f10 - f12, fVar.b() + i11 + 1, fVar.i() + i11 + 1, a10));
                    i11++;
                    f11 = f12;
                }
            } else {
                arrayList.add(u(fVar, f10 - fVar.h().f5799f, a10));
                return arrayList;
            }
        }
        return arrayList;
    }

    private static float[] o(List list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{a.b(0.0f, 1.0f, f11, f12, f10), (float) (i10 - 1), (float) i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    private static List p(b bVar, f fVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int c10 = c(fVar);
        if (!q(fVar) && c10 != -1) {
            int b10 = fVar.b() - c10;
            float a10 = (float) (bVar.f() ? bVar.a() : bVar.c());
            float f10 = fVar.c().f5795b - (fVar.c().f5797d / 2.0f);
            float f11 = 0.0f;
            if (b10 > 0 || fVar.a().f5799f <= 0.0f) {
                int i10 = 0;
                while (i10 < b10) {
                    f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                    int i11 = c10 + i10;
                    int size = fVar.g().size() - 1;
                    float f12 = f11 + ((f.c) fVar.g().get(i11)).f5799f;
                    int i12 = i11 - 1;
                    arrayList.add(t(fVar2, c10, i12 >= 0 ? b(fVar2, ((f.c) fVar.g().get(i12)).f5796c) - 1 : size, f10 + f12, (fVar.b() - i10) - 1, (fVar.i() - i10) - 1, a10));
                    i10++;
                    f11 = f12;
                }
            } else {
                arrayList.add(u(fVar, f10 + fVar.a().f5799f, a10));
                return arrayList;
            }
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().f5795b - (fVar.a().f5797d / 2.0f) >= 0.0f && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int c10 = bVar.c();
        if (bVar.f()) {
            c10 = bVar.a();
        }
        return fVar.h().f5795b + (fVar.h().f5797d / 2.0f) <= ((float) c10) && fVar.h() == fVar.k();
    }

    private static f s(List list, float f10, float[] fArr) {
        float[] o10 = o(list, f10, fArr);
        return f.l((f) list.get((int) o10[1]), (f) list.get((int) o10[2]), o10[0]);
    }

    private static f t(f fVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i11, (f.c) arrayList.remove(i10));
        f.b bVar = new f.b(fVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i14);
            float f12 = cVar.f5797d;
            bVar.e(f10 + (f12 / 2.0f), cVar.f5796c, f12, i14 >= i12 && i14 <= i13, cVar.f5798e, cVar.f5799f);
            f10 += cVar.f5797d;
            i14++;
        }
        return bVar.h();
    }

    private static f u(f fVar, float f10, float f11) {
        return t(fVar, 0, 0, f10, fVar.b(), fVar.i(), f11);
    }

    /* access modifiers changed from: package-private */
    public f g() {
        return this.f5800a;
    }

    /* access modifiers changed from: package-private */
    public f h() {
        List list = this.f5802c;
        return (f) list.get(list.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public Map i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f5800a.f();
        HashMap hashMap = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int i15 = -1;
            if (i13 >= i10) {
                break;
            }
            int i16 = z10 ? (i10 - i13) - 1 : i13;
            float f11 = ((float) i16) * f10;
            if (!z10) {
                i15 = 1;
            }
            if (f11 * ((float) i15) > ((float) i12) - this.f5806g || i13 >= i10 - this.f5802c.size()) {
                Integer valueOf = Integer.valueOf(i16);
                List list = this.f5802c;
                hashMap.put(valueOf, (f) list.get(y.a.b(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i17 = 0;
        for (int i18 = i10 - 1; i18 >= 0; i18--) {
            int i19 = z10 ? (i10 - i18) - 1 : i18;
            if (((float) i19) * f10 * ((float) (z10 ? -1 : 1)) < ((float) i11) + this.f5805f || i18 < this.f5801b.size()) {
                Integer valueOf2 = Integer.valueOf(i19);
                List list2 = this.f5801b;
                hashMap.put(valueOf2, (f) list2.get(y.a.b(i17, 0, list2.size() - 1)));
                i17++;
            }
        }
        return hashMap;
    }

    public f j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    /* access modifiers changed from: package-private */
    public f k(float f10, float f11, float f12, boolean z10) {
        float[] fArr;
        List list;
        float f13;
        float f14 = this.f5805f + f11;
        float f15 = f12 - this.f5806g;
        if (f10 < f14) {
            f13 = a.b(1.0f, 0.0f, f11, f14, f10);
            list = this.f5801b;
            fArr = this.f5803d;
        } else if (f10 <= f15) {
            return this.f5800a;
        } else {
            f13 = a.b(0.0f, 1.0f, f15, f12, f10);
            list = this.f5802c;
            fArr = this.f5804e;
        }
        return z10 ? a(list, f13, fArr) : s(list, f13, fArr);
    }

    /* access modifiers changed from: package-private */
    public f l() {
        List list = this.f5801b;
        return (f) list.get(list.size() - 1);
    }
}
