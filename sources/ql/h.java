package ql;

import cm.g;
import cm.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h extends e {

    /* renamed from: h  reason: collision with root package name */
    public static final a f30767h = new a((g) null);

    /* renamed from: i  reason: collision with root package name */
    private static final Object[] f30768i = new Object[0];

    /* renamed from: e  reason: collision with root package name */
    private int f30769e;

    /* renamed from: f  reason: collision with root package name */
    private Object[] f30770f;

    /* renamed from: g  reason: collision with root package name */
    private int f30771g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 > 0) {
                return i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            return i12;
        }
    }

    public h() {
        this.f30770f = f30768i;
    }

    private final int E(int i10) {
        if (i10 == m.x(this.f30770f)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int T(int i10) {
        return i10 < 0 ? i10 + this.f30770f.length : i10;
    }

    private final int Y(int i10) {
        Object[] objArr = this.f30770f;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void o(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f30770f.length;
        while (i10 < length && it.hasNext()) {
            this.f30770f[i10] = it.next();
            i10++;
        }
        int i11 = this.f30769e;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f30770f[i12] = it.next();
        }
        this.f30771g = size() + collection.size();
    }

    private final void r(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f30770f;
        Object[] unused = l.e(objArr2, objArr, 0, this.f30769e, objArr2.length);
        Object[] objArr3 = this.f30770f;
        int length = objArr3.length;
        int i11 = this.f30769e;
        Object[] unused2 = l.e(objArr3, objArr, length - i11, 0, i11);
        this.f30769e = 0;
        this.f30770f = objArr;
    }

    private final int s(int i10) {
        return i10 == 0 ? m.x(this.f30770f) : i10 - 1;
    }

    private final void v(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f30770f;
            if (i10 > objArr.length) {
                if (objArr == f30768i) {
                    this.f30770f = new Object[f.b(i10, 10)];
                } else {
                    r(f30767h.a(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    public final Object B() {
        if (isEmpty()) {
            return null;
        }
        return this.f30770f[this.f30769e];
    }

    public final Object F() {
        if (!isEmpty()) {
            return this.f30770f[Y(this.f30769e + q.k(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object H() {
        if (isEmpty()) {
            return null;
        }
        return this.f30770f[Y(this.f30769e + q.k(this))];
    }

    public void add(int i10, Object obj) {
        c.f30755e.b(i10, size());
        if (i10 == size()) {
            addLast(obj);
        } else if (i10 == 0) {
            addFirst(obj);
        } else {
            v(size() + 1);
            int Y = Y(this.f30769e + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int s10 = s(Y);
                int s11 = s(this.f30769e);
                int i11 = this.f30769e;
                if (s10 >= i11) {
                    Object[] objArr = this.f30770f;
                    objArr[s11] = objArr[i11];
                    Object[] unused = l.e(objArr, objArr, i11, i11 + 1, s10 + 1);
                } else {
                    Object[] objArr2 = this.f30770f;
                    Object[] unused2 = l.e(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f30770f;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    Object[] unused3 = l.e(objArr3, objArr3, 0, 1, s10 + 1);
                }
                this.f30770f[s10] = obj;
                this.f30769e = s11;
            } else {
                int Y2 = Y(this.f30769e + size());
                Object[] objArr4 = this.f30770f;
                if (Y < Y2) {
                    Object[] unused4 = l.e(objArr4, objArr4, Y + 1, Y, Y2);
                } else {
                    Object[] unused5 = l.e(objArr4, objArr4, 1, 0, Y2);
                    Object[] objArr5 = this.f30770f;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    Object[] unused6 = l.e(objArr5, objArr5, Y + 1, Y, objArr5.length - 1);
                }
                this.f30770f[Y] = obj;
            }
            this.f30771g = size() + 1;
        }
    }

    public boolean addAll(int i10, Collection collection) {
        l.f(collection, "elements");
        c.f30755e.b(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        v(size() + collection.size());
        int Y = Y(this.f30769e + size());
        int Y2 = Y(this.f30769e + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f30769e;
            int i12 = i11 - size;
            if (Y2 < i11) {
                Object[] objArr = this.f30770f;
                Object[] unused = l.e(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.f30770f;
                if (size >= Y2) {
                    Object[] unused2 = l.e(objArr2, objArr2, objArr2.length - size, 0, Y2);
                } else {
                    Object[] unused3 = l.e(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f30770f;
                    Object[] unused4 = l.e(objArr3, objArr3, 0, size, Y2);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.f30770f;
                Object[] unused5 = l.e(objArr4, objArr4, i12, i11, Y2);
            } else {
                Object[] objArr5 = this.f30770f;
                i12 += objArr5.length;
                int i13 = Y2 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    Object[] unused6 = l.e(objArr5, objArr5, i12, i11, Y2);
                } else {
                    Object[] unused7 = l.e(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.f30770f;
                    Object[] unused8 = l.e(objArr6, objArr6, 0, this.f30769e + length, Y2);
                }
            }
            this.f30769e = i12;
            o(T(Y2 - size), collection);
        } else {
            int i14 = Y2 + size;
            if (Y2 < Y) {
                int i15 = size + Y;
                Object[] objArr7 = this.f30770f;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = Y - (i15 - objArr7.length);
                        Object[] unused9 = l.e(objArr7, objArr7, 0, length2, Y);
                        Object[] objArr8 = this.f30770f;
                        Object[] unused10 = l.e(objArr8, objArr8, i14, Y2, length2);
                    }
                }
                Object[] unused11 = l.e(objArr7, objArr7, i14, Y2, Y);
            } else {
                Object[] objArr9 = this.f30770f;
                Object[] unused12 = l.e(objArr9, objArr9, size, 0, Y);
                Object[] objArr10 = this.f30770f;
                if (i14 >= objArr10.length) {
                    Object[] unused13 = l.e(objArr10, objArr10, i14 - objArr10.length, Y2, objArr10.length);
                } else {
                    Object[] unused14 = l.e(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f30770f;
                    Object[] unused15 = l.e(objArr11, objArr11, i14, Y2, objArr11.length - size);
                }
            }
            o(Y2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        v(size() + 1);
        int s10 = s(this.f30769e);
        this.f30769e = s10;
        this.f30770f[s10] = obj;
        this.f30771g = size() + 1;
    }

    public final void addLast(Object obj) {
        v(size() + 1);
        this.f30770f[Y(this.f30769e + size())] = obj;
        this.f30771g = size() + 1;
    }

    public void clear() {
        int Y = Y(this.f30769e + size());
        int i10 = this.f30769e;
        if (i10 < Y) {
            l.k(this.f30770f, (Object) null, i10, Y);
        } else if (!isEmpty()) {
            Object[] objArr = this.f30770f;
            l.k(objArr, (Object) null, this.f30769e, objArr.length);
            l.k(this.f30770f, (Object) null, 0, Y);
        }
        this.f30769e = 0;
        this.f30771g = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object e0() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public Object get(int i10) {
        c.f30755e.a(i10, size());
        return this.f30770f[Y(this.f30769e + i10)];
    }

    public int indexOf(Object obj) {
        int Y = Y(this.f30769e + size());
        int i10 = this.f30769e;
        if (i10 < Y) {
            while (i10 < Y) {
                if (!l.a(obj, this.f30770f[i10])) {
                    i10++;
                }
            }
            return -1;
        } else if (i10 < Y) {
            return -1;
        } else {
            int length = this.f30770f.length;
            while (true) {
                if (i10 >= length) {
                    int i11 = 0;
                    while (i11 < Y) {
                        if (l.a(obj, this.f30770f[i11])) {
                            i10 = i11 + this.f30770f.length;
                        } else {
                            i11++;
                        }
                    }
                    return -1;
                } else if (l.a(obj, this.f30770f[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return i10 - this.f30769e;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int l() {
        return this.f30771g;
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int Y = Y(this.f30769e + size());
        int i11 = this.f30769e;
        if (i11 < Y) {
            i10 = Y - 1;
            if (i11 <= i10) {
                while (!l.a(obj, this.f30770f[i10])) {
                    if (i10 != i11) {
                        i10--;
                    }
                }
            }
            return -1;
        }
        if (i11 > Y) {
            int i12 = Y - 1;
            while (true) {
                if (-1 >= i12) {
                    int x10 = m.x(this.f30770f);
                    int i13 = this.f30769e;
                    if (i13 <= x10) {
                        while (!l.a(obj, this.f30770f[i10])) {
                            if (i10 != i13) {
                                x10 = i10 - 1;
                            }
                        }
                    }
                } else if (l.a(obj, this.f30770f[i12])) {
                    i10 = i12 + this.f30770f.length;
                    break;
                } else {
                    i12--;
                }
            }
        }
        return -1;
        return i10 - this.f30769e;
    }

    public Object n(int i10) {
        c.f30755e.a(i10, size());
        if (i10 == q.k(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int Y = Y(this.f30769e + i10);
        Object obj = this.f30770f[Y];
        if (i10 < (size() >> 1)) {
            int i11 = this.f30769e;
            if (Y >= i11) {
                Object[] objArr = this.f30770f;
                Object[] unused = l.e(objArr, objArr, i11 + 1, i11, Y);
            } else {
                Object[] objArr2 = this.f30770f;
                Object[] unused2 = l.e(objArr2, objArr2, 1, 0, Y);
                Object[] objArr3 = this.f30770f;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f30769e;
                Object[] unused3 = l.e(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f30770f;
            int i13 = this.f30769e;
            objArr4[i13] = null;
            this.f30769e = E(i13);
        } else {
            int Y2 = Y(this.f30769e + q.k(this));
            Object[] objArr5 = this.f30770f;
            if (Y <= Y2) {
                Object[] unused4 = l.e(objArr5, objArr5, Y, Y + 1, Y2 + 1);
            } else {
                Object[] unused5 = l.e(objArr5, objArr5, Y, Y + 1, objArr5.length);
                Object[] objArr6 = this.f30770f;
                objArr6[objArr6.length - 1] = objArr6[0];
                Object[] unused6 = l.e(objArr6, objArr6, 0, 1, Y2 + 1);
            }
            this.f30770f[Y2] = null;
        }
        this.f30771g = size() - 1;
        return obj;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            cm.l.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f30770f
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f30769e
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.Y(r0)
            int r2 = r11.f30769e
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0044
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003e
            java.lang.Object[] r6 = r11.f30770f
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x003a
            java.lang.Object[] r7 = r11.f30770f
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003b
        L_0x003a:
            r1 = r4
        L_0x003b:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003e:
            java.lang.Object[] r12 = r11.f30770f
            ql.l.k(r12, r3, r5, r0)
            goto L_0x0086
        L_0x0044:
            java.lang.Object[] r5 = r11.f30770f
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0049:
            if (r2 >= r5) goto L_0x0064
            java.lang.Object[] r8 = r11.f30770f
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x0060
            java.lang.Object[] r8 = r11.f30770f
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0061
        L_0x0060:
            r7 = r4
        L_0x0061:
            int r2 = r2 + 1
            goto L_0x0049
        L_0x0064:
            int r2 = r11.Y(r6)
            r5 = r2
        L_0x0069:
            if (r1 >= r0) goto L_0x0085
            java.lang.Object[] r2 = r11.f30770f
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0081
            java.lang.Object[] r2 = r11.f30770f
            r2[r5] = r6
            int r5 = r11.E(r5)
            goto L_0x0082
        L_0x0081:
            r7 = r4
        L_0x0082:
            int r1 = r1 + 1
            goto L_0x0069
        L_0x0085:
            r1 = r7
        L_0x0086:
            if (r1 == 0) goto L_0x0091
            int r12 = r11.f30769e
            int r5 = r5 - r12
            int r12 = r11.T(r5)
            r11.f30771g = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.h.removeAll(java.util.Collection):boolean");
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f30770f;
            int i10 = this.f30769e;
            Object obj = objArr[i10];
            objArr[i10] = null;
            this.f30769e = E(i10);
            this.f30771g = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            int Y = Y(this.f30769e + q.k(this));
            Object[] objArr = this.f30770f;
            Object obj = objArr[Y];
            objArr[Y] = null;
            this.f30771g = size() - 1;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            cm.l.f(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x008e
            java.lang.Object[] r0 = r11.f30770f
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x008e
        L_0x0013:
            int r0 = r11.f30769e
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.Y(r0)
            int r2 = r11.f30769e
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f30770f
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f30770f
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f30770f
            ql.l.k(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f30770f
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f30770f
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f30770f
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.Y(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f30770f
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f30770f
            r2[r5] = r6
            int r5 = r11.E(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x008e
            int r12 = r11.f30769e
            int r5 = r5 - r12
            int r12 = r11.T(r5)
            r11.f30771g = r12
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ql.h.retainAll(java.util.Collection):boolean");
    }

    public Object set(int i10, Object obj) {
        c.f30755e.a(i10, size());
        int Y = Y(this.f30769e + i10);
        Object[] objArr = this.f30770f;
        Object obj2 = objArr[Y];
        objArr[Y] = obj;
        return obj2;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public final Object y() {
        if (!isEmpty()) {
            return this.f30770f[this.f30769e];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public h(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f30768i;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f30770f = objArr;
    }

    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        l.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        v(size() + collection.size());
        o(Y(this.f30769e + size()), collection);
        return true;
    }

    public Object[] toArray(Object[] objArr) {
        l.f(objArr, "array");
        if (objArr.length < size()) {
            objArr = j.a(objArr, size());
        }
        int Y = Y(this.f30769e + size());
        int i10 = this.f30769e;
        if (i10 < Y) {
            Object[] unused = l.g(this.f30770f, objArr, 0, i10, Y, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f30770f;
            Object[] unused2 = l.e(objArr2, objArr, 0, this.f30769e, objArr2.length);
            Object[] objArr3 = this.f30770f;
            Object[] unused3 = l.e(objArr3, objArr, objArr3.length - this.f30769e, 0, Y);
        }
        if (objArr.length > size()) {
            objArr[size()] = null;
        }
        return objArr;
    }
}
