package u7;

import androidx.constraintlayout.widget.i;
import f.j;

public final class d {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f16952e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f  reason: collision with root package name */
    private static final d[] f16953f = a();

    /* renamed from: a  reason: collision with root package name */
    private final int f16954a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f16955b;

    /* renamed from: c  reason: collision with root package name */
    private final b[] f16956c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16957d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f16958a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16959b;

        a(int i10, int i11) {
            this.f16958a = i10;
            this.f16959b = i11;
        }

        public int a() {
            return this.f16958a;
        }

        public int b() {
            return this.f16959b;
        }
    }

    private d(int i10, int[] iArr, b bVar, b bVar2, b bVar3, b bVar4) {
        this.f16954a = i10;
        this.f16955b = iArr;
        this.f16956c = new b[]{bVar, bVar2, bVar3, bVar4};
        int b10 = bVar.b();
        a[] a10 = bVar.a();
        int i11 = 0;
        for (a aVar : a10) {
            i11 += aVar.a() * (aVar.b() + b10);
        }
        this.f16957d = i11;
    }

    private static d[] a() {
        d dVar = r0;
        d dVar2 = new d(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9)));
        d dVar3 = r17;
        d dVar4 = new d(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16)));
        d dVar5 = r25;
        d dVar6 = new d(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13)));
        d dVar7 = r28;
        d dVar8 = new d(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9)));
        d dVar9 = r20;
        d dVar10 = new d(5, new int[]{6, 30}, new b(26, new a(1, 108)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12)));
        d dVar11 = r28;
        d dVar12 = new d(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15)));
        d dVar13 = r19;
        d dVar14 = dVar;
        d dVar15 = new d(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14)));
        d dVar16 = r28;
        d dVar17 = new d(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15)));
        d dVar18 = r16;
        d dVar19 = dVar3;
        d dVar20 = new d(9, new int[]{6, 26, 46}, new b(30, new a(2, 116)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13)));
        d dVar21 = r19;
        d dVar22 = new d(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16)));
        d dVar23 = r22;
        d dVar24 = new d(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13)));
        d dVar25 = r25;
        d dVar26 = new d(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15)));
        d dVar27 = r28;
        d dVar28 = new d(13, new int[]{6, 34, 62}, new b(26, new a(4, 107)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12)));
        d dVar29 = r21;
        d dVar30 = new d(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, 115), new a(1, 116)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13)));
        d dVar31 = r24;
        d dVar32 = new d(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13)));
        d dVar33 = r27;
        d dVar34 = new d(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16)));
        d dVar35 = r30;
        d dVar36 = new d(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, 107), new a(5, 108)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15)));
        d dVar37 = r49;
        d dVar38 = new d(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15)));
        d dVar39 = r26;
        d dVar40 = new d(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, 113), new a(4, 114)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14)));
        d dVar41 = r29;
        d dVar42 = new d(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, 107), new a(5, 108)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16)));
        d dVar43 = r49;
        d dVar44 = new d(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, 116), new a(4, 117)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17)));
        d dVar45 = r29;
        d dVar46 = new d(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, 111), new a(7, 112)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13)));
        d dVar47 = r49;
        d dVar48 = new d(23, new int[]{6, 30, 54, 74, 102}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16)));
        d dVar49 = r57;
        d dVar50 = new d(24, new int[]{6, 28, 54, 80, 106}, new b(30, new a(6, 117), new a(4, 118)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17)));
        d dVar51 = r49;
        d dVar52 = new d(25, new int[]{6, 32, 58, 84, i.f1939d3}, new b(26, new a(8, 106), new a(4, 107)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16)));
        d dVar53 = r57;
        d dVar54 = new d(26, new int[]{6, 30, 58, 86, 114}, new b(28, new a(10, 114), new a(2, 115)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17)));
        d dVar55 = r49;
        d dVar56 = new d(27, new int[]{6, 34, 62, 90, 118}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16)));
        d dVar57 = r57;
        d dVar58 = new d(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, 117), new a(10, 118)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16)));
        d dVar59 = r59;
        d dVar60 = new d(29, new int[]{6, 30, 54, 78, 102, j.M0}, new b(30, new a(7, 116), new a(7, 117)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16)));
        d dVar61 = r61;
        d dVar62 = new d(30, new int[]{6, 26, 52, 78, 104, 130}, new b(30, new a(5, 115), new a(10, 116)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16)));
        d dVar63 = r63;
        d dVar64 = new d(31, new int[]{6, 30, 56, 82, 108, 134}, new b(30, new a(13, 115), new a(3, 116)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16)));
        d dVar65 = r65;
        d dVar66 = new d(32, new int[]{6, 34, 60, 86, 112, 138}, new b(30, new a(17, 115)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16)));
        d dVar67 = r57;
        d dVar68 = new d(33, new int[]{6, 30, 58, 86, 114, 142}, new b(30, new a(17, 115), new a(1, 116)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16)));
        d dVar69 = r59;
        d dVar70 = new d(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new a(13, 115), new a(6, 116)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17)));
        d dVar71 = r61;
        d dVar72 = new d(35, new int[]{6, 30, 54, 78, 102, j.M0, 150}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16)));
        d dVar73 = r63;
        d dVar74 = new d(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16)));
        d dVar75 = r65;
        d dVar76 = new d(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16)));
        d dVar77 = r57;
        d dVar78 = new d(38, new int[]{6, 32, 58, 84, i.f1939d3, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16)));
        d dVar79 = r59;
        d dVar80 = new d(39, new int[]{6, 26, 54, 82, i.f1939d3, 138, 166}, new b(30, new a(20, 117), new a(4, 118)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16)));
        d dVar81 = r61;
        d dVar82 = new d(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new b(30, new a(19, 118), new a(6, 119)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)));
        return new d[]{dVar14, dVar19, dVar5, dVar7, dVar9, dVar11, dVar13, dVar16, dVar18, dVar21, dVar23, dVar25, dVar27, dVar29, dVar31, dVar33, dVar35, dVar37, dVar39, dVar41, dVar43, dVar45, dVar47, dVar49, dVar51, dVar53, dVar55, dVar57, dVar59, dVar61, dVar63, dVar65, dVar67, dVar69, dVar71, dVar73, dVar75, dVar77, dVar79, dVar81};
    }

    public static d e(int i10) {
        if (i10 >= 1 && i10 <= 40) {
            return f16953f[i10 - 1];
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return (this.f16954a * 4) + 17;
    }

    public b c(a aVar) {
        return this.f16956c[aVar.b()];
    }

    public int d() {
        return this.f16957d;
    }

    public int f() {
        return this.f16954a;
    }

    public String toString() {
        return String.valueOf(this.f16954a);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f16960a;

        /* renamed from: b  reason: collision with root package name */
        private final a[] f16961b;

        private b(int i10, a aVar) {
            this.f16960a = i10;
            this.f16961b = new a[]{aVar};
        }

        public a[] a() {
            return this.f16961b;
        }

        public int b() {
            return this.f16960a;
        }

        public int c() {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                a[] aVarArr = this.f16961b;
                if (i10 >= aVarArr.length) {
                    return i11;
                }
                i11 += aVarArr[i10].a();
                i10++;
            }
        }

        public int d() {
            return this.f16960a * c();
        }

        private b(int i10, a aVar, a aVar2) {
            this.f16960a = i10;
            this.f16961b = new a[]{aVar, aVar2};
        }
    }
}
