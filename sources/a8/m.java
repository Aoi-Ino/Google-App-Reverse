package a8;

import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import java.util.ArrayList;
import java.util.Hashtable;

public class m {

    /* renamed from: e  reason: collision with root package name */
    private static String[] f300e = {VContant.DUPLICATE_RC_PURPOSE_CODE, "1", "1033", VContant.DUPLICATE_RC_PURPOSE_CODE, "0", "1033", "1", "0", "0", "0", VContant.DUPLICATE_RC_PURPOSE_CODE, "0"};

    /* renamed from: a  reason: collision with root package name */
    private Hashtable f301a = new Hashtable();

    /* renamed from: b  reason: collision with root package name */
    private Hashtable f302b = new Hashtable();

    /* renamed from: c  reason: collision with root package name */
    public String f303c = "Cp1252";

    /* renamed from: d  reason: collision with root package name */
    public boolean f304d = false;

    public m() {
        this.f301a.put("Courier".toLowerCase(), "Courier");
        this.f301a.put("Courier-Bold".toLowerCase(), "Courier-Bold");
        this.f301a.put("Courier-Oblique".toLowerCase(), "Courier-Oblique");
        this.f301a.put("Courier-BoldOblique".toLowerCase(), "Courier-BoldOblique");
        this.f301a.put("Helvetica".toLowerCase(), "Helvetica");
        this.f301a.put("Helvetica-Bold".toLowerCase(), "Helvetica-Bold");
        this.f301a.put("Helvetica-Oblique".toLowerCase(), "Helvetica-Oblique");
        this.f301a.put("Helvetica-BoldOblique".toLowerCase(), "Helvetica-BoldOblique");
        this.f301a.put("Symbol".toLowerCase(), "Symbol");
        this.f301a.put("Times-Roman".toLowerCase(), "Times-Roman");
        this.f301a.put("Times-Bold".toLowerCase(), "Times-Bold");
        this.f301a.put("Times-Italic".toLowerCase(), "Times-Italic");
        this.f301a.put("Times-BoldItalic".toLowerCase(), "Times-BoldItalic");
        this.f301a.put("ZapfDingbats".toLowerCase(), "ZapfDingbats");
        ArrayList arrayList = new ArrayList();
        arrayList.add("Courier");
        arrayList.add("Courier-Bold");
        arrayList.add("Courier-Oblique");
        arrayList.add("Courier-BoldOblique");
        this.f302b.put("Courier".toLowerCase(), arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Helvetica");
        arrayList2.add("Helvetica-Bold");
        arrayList2.add("Helvetica-Oblique");
        arrayList2.add("Helvetica-BoldOblique");
        this.f302b.put("Helvetica".toLowerCase(), arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("Symbol");
        this.f302b.put("Symbol".toLowerCase(), arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("Times-Roman");
        arrayList4.add("Times-Bold");
        arrayList4.add("Times-Italic");
        arrayList4.add("Times-BoldItalic");
        this.f302b.put("Times".toLowerCase(), arrayList4);
        this.f302b.put("Times-Roman".toLowerCase(), arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("ZapfDingbats");
        this.f302b.put("ZapfDingbats".toLowerCase(), arrayList5);
    }

    public k a(String str, String str2, boolean z10, float f10, int i10, b bVar) {
        return b(str, str2, z10, f10, i10, bVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        return new a8.k(a8.k.b.UNDEFINED, r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c4, code lost:
        return new a8.k(a8.k.b.UNDEFINED, r0, r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        throw new a8.j(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[ExcHandler: NullPointerException (unused java.lang.NullPointerException), SYNTHETIC, Splitter:B:33:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:33:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a8.k b(java.lang.String r17, java.lang.String r18, boolean r19, float r20, int r21, a8.b r22, boolean r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            r2 = r21
            r3 = r22
            if (r17 != 0) goto L_0x0012
            a8.k r4 = new a8.k
            a8.k$b r5 = a8.k.b.UNDEFINED
            r4.<init>((a8.k.b) r5, (float) r0, (int) r2, (a8.b) r3)
            return r4
        L_0x0012:
            java.lang.String r4 = r17.toLowerCase()
            java.util.Hashtable r5 = r1.f302b
            java.lang.Object r4 = r5.get(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x007b
            r5 = 0
            r6 = -1
            if (r2 != r6) goto L_0x0026
            r7 = r5
            goto L_0x0027
        L_0x0026:
            r7 = r2
        L_0x0027:
            java.util.Iterator r4 = r4.iterator()
            r8 = r5
        L_0x002c:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L_0x0071
            java.lang.Object r8 = r4.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = r8.toLowerCase()
            java.lang.String r10 = r9.toLowerCase()
            java.lang.String r11 = "bold"
            int r10 = r10.indexOf(r11)
            r11 = 1
            if (r10 == r6) goto L_0x004b
            r10 = r11
            goto L_0x004c
        L_0x004b:
            r10 = r5
        L_0x004c:
            java.lang.String r12 = r9.toLowerCase()
            java.lang.String r13 = "italic"
            int r12 = r12.indexOf(r13)
            if (r12 != r6) goto L_0x0067
            java.lang.String r9 = r9.toLowerCase()
            java.lang.String r12 = "oblique"
            int r9 = r9.indexOf(r12)
            if (r9 == r6) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r9 = r10
            goto L_0x0069
        L_0x0067:
            r9 = r10 | 2
        L_0x0069:
            r10 = r7 & 3
            if (r10 != r9) goto L_0x006f
            r5 = r11
            goto L_0x0074
        L_0x006f:
            r8 = r9
            goto L_0x002c
        L_0x0071:
            r9 = r8
            r8 = r17
        L_0x0074:
            if (r2 == r6) goto L_0x007d
            if (r5 == 0) goto L_0x007d
            int r4 = ~r9
            r2 = r2 & r4
            goto L_0x007d
        L_0x007b:
            r8 = r17
        L_0x007d:
            r13 = 0
            r14 = 0
            r15 = 1
            r9 = r8
            r10 = r18
            r11 = r19
            r12 = r23
            e8.c r4 = e8.c.f(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ g -> 0x008c, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            goto L_0x008d
        L_0x008c:
            r4 = 0
        L_0x008d:
            if (r4 != 0) goto L_0x00cb
            java.util.Hashtable r4 = r1.f301a     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            java.lang.String r5 = r8.toLowerCase()     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            if (r5 != 0) goto L_0x00a8
            a8.k r4 = new a8.k     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            a8.k$b r5 = a8.k.b.UNDEFINED     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            r4.<init>((a8.k.b) r5, (float) r0, (int) r2, (a8.b) r3)     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            return r4
        L_0x00a6:
            r0 = move-exception
            goto L_0x00c5
        L_0x00a8:
            r9 = 0
            r10 = 0
            r6 = r18
            r7 = r19
            r8 = r23
            e8.c r4 = e8.c.e(r5, r6, r7, r8, r9, r10)     // Catch:{ g -> 0x00a6, IOException -> 0x00bd, NullPointerException -> 0x00b5 }
            goto L_0x00cb
        L_0x00b5:
            a8.k r4 = new a8.k
            a8.k$b r5 = a8.k.b.UNDEFINED
            r4.<init>((a8.k.b) r5, (float) r0, (int) r2, (a8.b) r3)
            return r4
        L_0x00bd:
            a8.k r4 = new a8.k
            a8.k$b r5 = a8.k.b.UNDEFINED
            r4.<init>((a8.k.b) r5, (float) r0, (int) r2, (a8.b) r3)
            return r4
        L_0x00c5:
            a8.j r2 = new a8.j
            r2.<init>(r0)
            throw r2
        L_0x00cb:
            a8.k r5 = new a8.k
            r5.<init>((e8.c) r4, (float) r0, (int) r2, (a8.b) r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.m.b(java.lang.String, java.lang.String, boolean, float, int, a8.b, boolean):a8.k");
    }
}
