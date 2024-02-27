package c0;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

abstract class b {

    public interface a {
        void a(Object obj, Rect rect);
    }

    /* renamed from: c0.b$b  reason: collision with other inner class name */
    public interface C0089b {
        Object a(Object obj, int i10);

        int b(Object obj);
    }

    private static class c implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f4567a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f4568b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        private final boolean f4569c;

        /* renamed from: d  reason: collision with root package name */
        private final a f4570d;

        c(boolean z10, a aVar) {
            this.f4569c = z10;
            this.f4570d = aVar;
        }

        public int compare(Object obj, Object obj2) {
            Rect rect = this.f4567a;
            Rect rect2 = this.f4568b;
            this.f4570d.a(obj, rect);
            this.f4570d.a(obj2, rect2);
            int i10 = rect.top;
            int i11 = rect2.top;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.left;
            int i13 = rect2.left;
            if (i12 < i13) {
                return this.f4569c ? 1 : -1;
            }
            if (i12 > i13) {
                return this.f4569c ? -1 : 1;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if (i14 < i15) {
                return -1;
            }
            if (i14 > i15) {
                return 1;
            }
            int i16 = rect.right;
            int i17 = rect2.right;
            if (i16 < i17) {
                return this.f4569c ? 1 : -1;
            }
            if (i16 > i17) {
                return this.f4569c ? -1 : 1;
            }
            return 0;
        }
    }

    private static boolean a(int i10, Rect rect, Rect rect2, Rect rect3) {
        boolean b10 = b(i10, rect, rect2);
        if (b(i10, rect, rect3) || !b10) {
            return false;
        }
        if (!j(i10, rect, rect3) || i10 == 17 || i10 == 66) {
            return true;
        }
        return k(i10, rect, rect2) < m(i10, rect, rect3);
    }

    private static boolean b(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object c(java.lang.Object r7, c0.b.C0089b r8, c0.b.a r9, java.lang.Object r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L_0x003b
            r1 = 33
            if (r12 == r1) goto L_0x0034
            r1 = 66
            if (r12 == r1) goto L_0x0029
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L_0x0021
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
        L_0x001d:
            r0.offset(r2, r1)
            goto L_0x0042
        L_0x0021:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L_0x0029:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
        L_0x0030:
            r0.offset(r1, r2)
            goto L_0x0042
        L_0x0034:
            int r1 = r11.height()
            int r1 = r1 + 1
            goto L_0x001d
        L_0x003b:
            int r1 = r11.width()
            int r1 = r1 + 1
            goto L_0x0030
        L_0x0042:
            int r1 = r8.b(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L_0x004c:
            if (r2 >= r1) goto L_0x0065
            java.lang.Object r5 = r8.a(r7, r2)
            if (r5 != r10) goto L_0x0055
            goto L_0x0062
        L_0x0055:
            r9.a(r5, r3)
            boolean r6 = h(r12, r11, r3, r0)
            if (r6 == 0) goto L_0x0062
            r0.set(r3)
            r4 = r5
        L_0x0062:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.b.c(java.lang.Object, c0.b$b, c0.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static Object d(Object obj, C0089b bVar, a aVar, Object obj2, int i10, boolean z10, boolean z11) {
        int b10 = bVar.b(obj);
        ArrayList arrayList = new ArrayList(b10);
        for (int i11 = 0; i11 < b10; i11++) {
            arrayList.add(bVar.a(obj, i11));
        }
        Collections.sort(arrayList, new c(z10, aVar));
        if (i10 == 1) {
            return f(obj2, arrayList, z11);
        }
        if (i10 == 2) {
            return e(obj2, arrayList, z11);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static Object e(Object obj, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int lastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static Object f(Object obj, ArrayList arrayList, boolean z10) {
        int size = arrayList.size();
        int indexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z10 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int g(int i10, int i11) {
        return (i10 * 13 * i10) + (i11 * i11);
    }

    private static boolean h(int i10, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i10)) {
            return false;
        }
        if (i(rect, rect3, i10) && !a(i10, rect, rect2, rect3)) {
            return !a(i10, rect, rect3, rect2) && g(k(i10, rect, rect2), o(i10, rect, rect2)) < g(k(i10, rect, rect3), o(i10, rect, rect3));
        }
        return true;
    }

    private static boolean i(Rect rect, Rect rect2, int i10) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        } else if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        } else if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        } else if (i10 == 130) {
            int i17 = rect.top;
            int i18 = rect2.top;
            return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean j(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            return rect.left >= rect2.right;
        }
        if (i10 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i10 == 66) {
            return rect.right <= rect2.left;
        }
        if (i10 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int k(int i10, Rect rect, Rect rect2) {
        return Math.max(0, l(i10, rect, rect2));
    }

    private static int l(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else if (i10 == 130) {
            i11 = rect2.top;
            i12 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i11 - i12;
    }

    private static int m(int i10, Rect rect, Rect rect2) {
        return Math.max(1, n(i10, rect, rect2));
    }

    private static int n(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.left;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.top;
        } else if (i10 == 66) {
            i11 = rect2.right;
            i12 = rect.right;
        } else if (i10 == 130) {
            i11 = rect2.bottom;
            i12 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i11 - i12;
    }

    private static int o(int i10, Rect rect, Rect rect2) {
        int height;
        int i11;
        int height2;
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i11 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i11 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i11 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i11 + (height2 / 2)));
    }
}
