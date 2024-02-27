package in;

import cm.g;
import cm.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import ql.c;

public final class r extends c implements RandomAccess {

    /* renamed from: h  reason: collision with root package name */
    public static final a f24486h = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    private final h[] f24487f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f24488g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        private final void a(long j10, e eVar, int i10, List list, int i11, int i12, List list2) {
            int i13;
            int i14;
            int i15;
            int i16;
            e eVar2;
            e eVar3 = eVar;
            int i17 = i10;
            List list3 = list;
            int i18 = i11;
            int i19 = i12;
            List list4 = list2;
            if (i18 < i19) {
                int i20 = i18;
                while (i20 < i19) {
                    if (((h) list3.get(i20)).q() >= i17) {
                        i20++;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                }
                h hVar = (h) list.get(i11);
                h hVar2 = (h) list3.get(i19 - 1);
                int i21 = -1;
                if (i17 == hVar.q()) {
                    int intValue = ((Number) list4.get(i18)).intValue();
                    int i22 = i18 + 1;
                    i13 = i22;
                    i14 = intValue;
                    hVar = (h) list3.get(i22);
                } else {
                    i13 = i18;
                    i14 = -1;
                }
                if (hVar.d(i17) != hVar2.d(i17)) {
                    int i23 = 1;
                    for (int i24 = i13 + 1; i24 < i19; i24++) {
                        if (((h) list3.get(i24 - 1)).d(i17) != ((h) list3.get(i24)).d(i17)) {
                            i23++;
                        }
                    }
                    long c10 = j10 + c(eVar3) + ((long) 2) + ((long) (i23 * 2));
                    eVar3.writeInt(i23);
                    eVar3.writeInt(i14);
                    for (int i25 = i13; i25 < i19; i25++) {
                        byte d10 = ((h) list3.get(i25)).d(i17);
                        if (i25 == i13 || d10 != ((h) list3.get(i25 - 1)).d(i17)) {
                            eVar3.writeInt(d10 & 255);
                        }
                    }
                    e eVar4 = new e();
                    while (i13 < i19) {
                        byte d11 = ((h) list3.get(i13)).d(i17);
                        int i26 = i13 + 1;
                        int i27 = i26;
                        while (true) {
                            if (i27 >= i19) {
                                i15 = i19;
                                break;
                            } else if (d11 != ((h) list3.get(i27)).d(i17)) {
                                i15 = i27;
                                break;
                            } else {
                                i27++;
                            }
                        }
                        if (i26 == i15 && i17 + 1 == ((h) list3.get(i13)).q()) {
                            eVar3.writeInt(((Number) list4.get(i13)).intValue());
                            i16 = i15;
                            eVar2 = eVar4;
                        } else {
                            eVar3.writeInt(((int) (c10 + c(eVar4))) * i21);
                            i16 = i15;
                            eVar2 = eVar4;
                            a(c10, eVar4, i17 + 1, list, i13, i15, list2);
                        }
                        eVar4 = eVar2;
                        i13 = i16;
                        i21 = -1;
                    }
                    eVar3.q0(eVar4);
                    return;
                }
                int min = Math.min(hVar.q(), hVar2.q());
                int i28 = i17;
                int i29 = 0;
                while (i28 < min && hVar.d(i28) == hVar2.d(i28)) {
                    i29++;
                    i28++;
                }
                long c11 = j10 + c(eVar3) + ((long) 2) + ((long) i29) + 1;
                eVar3.writeInt(-i29);
                eVar3.writeInt(i14);
                int i30 = i17 + i29;
                while (i17 < i30) {
                    eVar3.writeInt(hVar.d(i17) & 255);
                    i17++;
                }
                if (i13 + 1 == i19) {
                    if (i30 == ((h) list3.get(i13)).q()) {
                        eVar3.writeInt(((Number) list4.get(i13)).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                e eVar5 = new e();
                eVar3.writeInt(((int) (c(eVar5) + c11)) * -1);
                a(c11, eVar5, i30, list, i13, i12, list2);
                eVar3.q0(eVar5);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        static /* synthetic */ void b(a aVar, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            aVar.a((i13 & 1) != 0 ? 0 : j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long c(e eVar) {
            return eVar.H0() / ((long) 4);
        }

        public final r d(h... hVarArr) {
            h[] hVarArr2 = hVarArr;
            l.f(hVarArr2, "byteStrings");
            int i10 = 0;
            if (hVarArr2.length == 0) {
                return new r(new h[0], new int[]{0, -1}, (g) null);
            }
            List I = m.I(hVarArr);
            u.u(I);
            ArrayList arrayList = new ArrayList(hVarArr2.length);
            for (h hVar : hVarArr2) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                List n10 = q.n((Integer[]) Arrays.copyOf(numArr, numArr.length));
                int length = hVarArr2.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    n10.set(q.h(I, hVarArr2[i11], 0, 0, 6, (Object) null), Integer.valueOf(i12));
                    i11++;
                    i12++;
                }
                if (((h) I.get(0)).q() > 0) {
                    int i13 = 0;
                    while (i13 < I.size()) {
                        h hVar2 = (h) I.get(i13);
                        int i14 = i13 + 1;
                        int i15 = i14;
                        while (i15 < I.size()) {
                            h hVar3 = (h) I.get(i15);
                            if (!hVar3.r(hVar2)) {
                                continue;
                                break;
                            }
                            if (!(hVar3.q() != hVar2.q())) {
                                throw new IllegalArgumentException(("duplicate option: " + hVar3).toString());
                            } else if (((Number) n10.get(i15)).intValue() > ((Number) n10.get(i13)).intValue()) {
                                I.remove(i15);
                                n10.remove(i15);
                            } else {
                                i15++;
                            }
                        }
                        i13 = i14;
                    }
                    e eVar = new e();
                    b(this, 0, eVar, 0, I, 0, 0, n10, 53, (Object) null);
                    int[] iArr = new int[((int) c(eVar))];
                    while (!eVar.P()) {
                        iArr[i10] = eVar.readInt();
                        i10++;
                    }
                    Object[] copyOf = Arrays.copyOf(hVarArr2, hVarArr2.length);
                    l.e(copyOf, "java.util.Arrays.copyOf(this, size)");
                    return new r((h[]) copyOf, iArr, (g) null);
                }
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    private r(h[] hVarArr, int[] iArr) {
        this.f24487f = hVarArr;
        this.f24488g = iArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return n((h) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return v((h) obj);
        }
        return -1;
    }

    public int l() {
        return this.f24487f.length;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return y((h) obj);
        }
        return -1;
    }

    public /* bridge */ boolean n(h hVar) {
        return super.contains(hVar);
    }

    /* renamed from: o */
    public h get(int i10) {
        return this.f24487f[i10];
    }

    public final h[] r() {
        return this.f24487f;
    }

    public final int[] s() {
        return this.f24488g;
    }

    public /* bridge */ int v(h hVar) {
        return super.indexOf(hVar);
    }

    public /* bridge */ int y(h hVar) {
        return super.lastIndexOf(hVar);
    }

    public /* synthetic */ r(h[] hVarArr, int[] iArr, g gVar) {
        this(hVarArr, iArr);
    }
}
