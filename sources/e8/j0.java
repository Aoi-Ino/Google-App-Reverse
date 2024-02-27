package e8;

import java.util.GregorianCalendar;

public class j0 extends y1 {

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f10847m = {1, 4, 0, 2, 2, -1, 5, 2, 0, 11, 2, 0, 12, 2, 0, 13, 2, 0};

    public j0() {
        this(new GregorianCalendar());
    }

    private String m(int i10, int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i10);
        while (stringBuffer.length() < i11) {
            stringBuffer.insert(0, "0");
        }
        stringBuffer.setLength(i11);
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j0(java.util.Calendar r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r1 = "D:"
            r0.<init>(r1)
            r1 = 1
            int r2 = r7.get(r1)
            r3 = 4
            java.lang.String r2 = r6.m(r2, r3)
            r0.append(r2)
            r2 = 2
            int r3 = r7.get(r2)
            int r3 = r3 + r1
            java.lang.String r1 = r6.m(r3, r2)
            r0.append(r1)
            r1 = 5
            int r1 = r7.get(r1)
            java.lang.String r1 = r6.m(r1, r2)
            r0.append(r1)
            r1 = 11
            int r1 = r7.get(r1)
            java.lang.String r1 = r6.m(r1, r2)
            r0.append(r1)
            r1 = 12
            int r1 = r7.get(r1)
            java.lang.String r1 = r6.m(r1, r2)
            r0.append(r1)
            r1 = 13
            int r1 = r7.get(r1)
            java.lang.String r1 = r6.m(r1, r2)
            r0.append(r1)
            r1 = 15
            int r3 = r7.get(r1)
            r4 = 16
            int r5 = r7.get(r4)
            int r3 = r3 + r5
            r5 = 3600000(0x36ee80, float:5.044674E-39)
            int r3 = r3 / r5
            if (r3 != 0) goto L_0x0070
            r5 = 90
        L_0x006c:
            r0.append(r5)
            goto L_0x007c
        L_0x0070:
            if (r3 >= 0) goto L_0x0079
            r5 = 45
            r0.append(r5)
            int r3 = -r3
            goto L_0x007c
        L_0x0079:
            r5 = 43
            goto L_0x006c
        L_0x007c:
            if (r3 == 0) goto L_0x00a8
            java.lang.String r5 = r6.m(r3, r2)
            r0.append(r5)
            r5 = 39
            r0.append(r5)
            int r1 = r7.get(r1)
            int r7 = r7.get(r4)
            int r1 = r1 + r7
            r7 = 60000(0xea60, float:8.4078E-41)
            int r1 = r1 / r7
            int r7 = java.lang.Math.abs(r1)
            int r3 = r3 * 60
            int r7 = r7 - r3
            java.lang.String r7 = r6.m(r7, r2)
            r0.append(r7)
            r0.append(r5)
        L_0x00a8:
            java.lang.String r7 = r0.toString()
            r6.f11081g = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.j0.<init>(java.util.Calendar):void");
    }
}
