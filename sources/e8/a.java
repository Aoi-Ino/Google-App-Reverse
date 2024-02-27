package e8;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[][] f10155a = {new char[]{1569, 65152}, new char[]{1570, 65153, 65154}, new char[]{1571, 65155, 65156}, new char[]{1572, 65157, 65158}, new char[]{1573, 65159, 65160}, new char[]{1574, 65161, 65162, 65163, 65164}, new char[]{1575, 65165, 65166}, new char[]{1576, 65167, 65168, 65169, 65170}, new char[]{1577, 65171, 65172}, new char[]{1578, 65173, 65174, 65175, 65176}, new char[]{1579, 65177, 65178, 65179, 65180}, new char[]{1580, 65181, 65182, 65183, 65184}, new char[]{1581, 65185, 65186, 65187, 65188}, new char[]{1582, 65189, 65190, 65191, 65192}, new char[]{1583, 65193, 65194}, new char[]{1584, 65195, 65196}, new char[]{1585, 65197, 65198}, new char[]{1586, 65199, 65200}, new char[]{1587, 65201, 65202, 65203, 65204}, new char[]{1588, 65205, 65206, 65207, 65208}, new char[]{1589, 65209, 65210, 65211, 65212}, new char[]{1590, 65213, 65214, 65215, 65216}, new char[]{1591, 65217, 65218, 65219, 65220}, new char[]{1592, 65221, 65222, 65223, 65224}, new char[]{1593, 65225, 65226, 65227, 65228}, new char[]{1594, 65229, 65230, 65231, 65232}, new char[]{1600, 1600, 1600, 1600, 1600}, new char[]{1601, 65233, 65234, 65235, 65236}, new char[]{1602, 65237, 65238, 65239, 65240}, new char[]{1603, 65241, 65242, 65243, 65244}, new char[]{1604, 65245, 65246, 65247, 65248}, new char[]{1605, 65249, 65250, 65251, 65252}, new char[]{1606, 65253, 65254, 65255, 65256}, new char[]{1607, 65257, 65258, 65259, 65260}, new char[]{1608, 65261, 65262}, new char[]{1609, 65263, 65264, 64488, 64489}, new char[]{1610, 65265, 65266, 65267, 65268}, new char[]{1649, 64336, 64337}, new char[]{1657, 64358, 64359, 64360, 64361}, new char[]{1658, 64350, 64351, 64352, 64353}, new char[]{1659, 64338, 64339, 64340, 64341}, new char[]{1662, 64342, 64343, 64344, 64345}, new char[]{1663, 64354, 64355, 64356, 64357}, new char[]{1664, 64346, 64347, 64348, 64349}, new char[]{1667, 64374, 64375, 64376, 64377}, new char[]{1668, 64370, 64371, 64372, 64373}, new char[]{1670, 64378, 64379, 64380, 64381}, new char[]{1671, 64382, 64383, 64384, 64385}, new char[]{1672, 64392, 64393}, new char[]{1676, 64388, 64389}, new char[]{1677, 64386, 64387}, new char[]{1678, 64390, 64391}, new char[]{1681, 64396, 64397}, new char[]{1688, 64394, 64395}, new char[]{1700, 64362, 64363, 64364, 64365}, new char[]{1702, 64366, 64367, 64368, 64369}, new char[]{1705, 64398, 64399, 64400, 64401}, new char[]{1709, 64467, 64468, 64469, 64470}, new char[]{1711, 64402, 64403, 64404, 64405}, new char[]{1713, 64410, 64411, 64412, 64413}, new char[]{1715, 64406, 64407, 64408, 64409}, new char[]{1722, 64414, 64415}, new char[]{1723, 64416, 64417, 64418, 64419}, new char[]{1726, 64426, 64427, 64428, 64429}, new char[]{1728, 64420, 64421}, new char[]{1729, 64422, 64423, 64424, 64425}, new char[]{1733, 64480, 64481}, new char[]{1734, 64473, 64474}, new char[]{1735, 64471, 64472}, new char[]{1736, 64475, 64476}, new char[]{1737, 64482, 64483}, new char[]{1739, 64478, 64479}, new char[]{1740, 64508, 64509, 64510, 64511}, new char[]{1744, 64484, 64485, 64486, 64487}, new char[]{1746, 64430, 64431}, new char[]{1747, 64432, 64433}};

    /* renamed from: e8.a$a  reason: collision with other inner class name */
    static class C0139a {

        /* renamed from: a  reason: collision with root package name */
        char f10156a;

        /* renamed from: b  reason: collision with root package name */
        char f10157b;

        /* renamed from: c  reason: collision with root package name */
        char f10158c;

        /* renamed from: d  reason: collision with root package name */
        int f10159d;

        /* renamed from: e  reason: collision with root package name */
        int f10160e = 1;

        C0139a() {
        }
    }

    static int a(char[] cArr, int i10, int i11, char[] cArr2, int i12, int i13, int i14) {
        char[] cArr3 = new char[i11];
        for (int i15 = (i11 + i10) - 1; i15 >= i10; i15--) {
            cArr3[i15 - i10] = cArr[i15];
        }
        StringBuffer stringBuffer = new StringBuffer(i11);
        i(cArr3, stringBuffer, i14);
        if ((i14 & 12) != 0) {
            e(stringBuffer, i14);
        }
        System.arraycopy(stringBuffer.toString().toCharArray(), 0, cArr2, i12, stringBuffer.length());
        return stringBuffer.length();
    }

    static char b(char c10, int i10) {
        if (c10 < 1569 || c10 > 1747) {
            return (c10 < 65269 || c10 > 65275) ? c10 : (char) (c10 + i10);
        }
        int length = f10155a.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) / 2;
            char[] cArr = f10155a[i12];
            char c11 = cArr[0];
            if (c10 == c11) {
                return cArr[i10 + 1];
            }
            if (c10 < c11) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return c10;
    }

    static boolean c(C0139a aVar) {
        return aVar.f10160e > 2;
    }

    static void d(StringBuffer stringBuffer, C0139a aVar, int i10) {
        int i11;
        char c10 = aVar.f10156a;
        if (c10 != 0) {
            stringBuffer.append(c10);
            int i12 = aVar.f10159d;
            aVar.f10159d = i12 - 1;
            char c11 = aVar.f10157b;
            if (c11 != 0) {
                if ((i10 & 1) == 0) {
                    stringBuffer.append(c11);
                    i11 = aVar.f10159d - 1;
                } else {
                    i11 = i12 - 2;
                }
                aVar.f10159d = i11;
            }
            char c12 = aVar.f10158c;
            if (c12 != 0) {
                if ((i10 & 1) == 0) {
                    stringBuffer.append(c12);
                }
                aVar.f10159d--;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r10.charAt(r2) == 1617) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r6 = 64610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r10.charAt(r2) == 1617) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r6 = 64609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r10.charAt(r2) == 1617) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.StringBuffer r10, int r11) {
        /*
            int r0 = r10.length()
            r1 = 0
            r2 = 1
            r3 = r0
            r4 = r1
        L_0x0008:
            if (r2 >= r0) goto L_0x012b
            r5 = r11 & 4
            if (r5 == 0) goto L_0x0048
            char r5 = r10.charAt(r4)
            r6 = 64608(0xfc60, float:9.0535E-41)
            r7 = 64609(0xfc61, float:9.0536E-41)
            r8 = 64610(0xfc62, float:9.0538E-41)
            r9 = 1617(0x651, float:2.266E-42)
            switch(r5) {
                case 1614: goto L_0x0041;
                case 1615: goto L_0x0039;
                case 1616: goto L_0x0031;
                case 1617: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x0048
        L_0x0021:
            char r5 = r10.charAt(r2)
            switch(r5) {
                case 1612: goto L_0x002d;
                case 1613: goto L_0x0029;
                case 1614: goto L_0x0049;
                case 1615: goto L_0x003f;
                case 1616: goto L_0x0037;
                default: goto L_0x0028;
            }
        L_0x0028:
            goto L_0x0048
        L_0x0029:
            r6 = 64607(0xfc5f, float:9.0534E-41)
            goto L_0x0049
        L_0x002d:
            r6 = 64606(0xfc5e, float:9.0532E-41)
            goto L_0x0049
        L_0x0031:
            char r5 = r10.charAt(r2)
            if (r5 != r9) goto L_0x0048
        L_0x0037:
            r6 = r8
            goto L_0x0049
        L_0x0039:
            char r5 = r10.charAt(r2)
            if (r5 != r9) goto L_0x0048
        L_0x003f:
            r6 = r7
            goto L_0x0049
        L_0x0041:
            char r5 = r10.charAt(r2)
            if (r5 != r9) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r6 = r1
        L_0x0049:
            r5 = r11 & 8
            if (r5 == 0) goto L_0x0116
            char r5 = r10.charAt(r4)
            r7 = 65192(0xfea8, float:9.1353E-41)
            r8 = 65188(0xfea4, float:9.1348E-41)
            r9 = 65184(0xfea0, float:9.1342E-41)
            switch(r5) {
                case 65169: goto L_0x0100;
                case 65175: goto L_0x00e9;
                case 65235: goto L_0x00db;
                case 65247: goto L_0x00b1;
                case 65251: goto L_0x0094;
                case 65255: goto L_0x0079;
                case 65256: goto L_0x005f;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0116
        L_0x005f:
            char r5 = r10.charAt(r2)
            r7 = 65198(0xfeae, float:9.1362E-41)
            if (r5 == r7) goto L_0x0074
            r7 = 65200(0xfeb0, float:9.1365E-41)
            if (r5 == r7) goto L_0x006f
            goto L_0x0116
        L_0x006f:
            r6 = 64651(0xfc8b, float:9.0595E-41)
            goto L_0x0116
        L_0x0074:
            r6 = 64650(0xfc8a, float:9.0594E-41)
            goto L_0x0116
        L_0x0079:
            char r5 = r10.charAt(r2)
            if (r5 == r9) goto L_0x008f
            if (r5 == r8) goto L_0x008a
            if (r5 == r7) goto L_0x0085
            goto L_0x0116
        L_0x0085:
            r6 = 64724(0xfcd4, float:9.0698E-41)
            goto L_0x0116
        L_0x008a:
            r6 = 64723(0xfcd3, float:9.0696E-41)
            goto L_0x0116
        L_0x008f:
            r6 = 64722(0xfcd2, float:9.0695E-41)
            goto L_0x0116
        L_0x0094:
            char r5 = r10.charAt(r2)
            switch(r5) {
                case 65184: goto L_0x00ac;
                case 65188: goto L_0x00a7;
                case 65192: goto L_0x00a2;
                case 65252: goto L_0x009d;
                default: goto L_0x009b;
            }
        L_0x009b:
            goto L_0x0116
        L_0x009d:
            r6 = 64721(0xfcd1, float:9.0693E-41)
            goto L_0x0116
        L_0x00a2:
            r6 = 64720(0xfcd0, float:9.0692E-41)
            goto L_0x0116
        L_0x00a7:
            r6 = 64719(0xfccf, float:9.069E-41)
            goto L_0x0116
        L_0x00ac:
            r6 = 64718(0xfcce, float:9.0689E-41)
            goto L_0x0116
        L_0x00b1:
            char r5 = r10.charAt(r2)
            switch(r5) {
                case 65182: goto L_0x00d7;
                case 65184: goto L_0x00d3;
                case 65186: goto L_0x00cf;
                case 65188: goto L_0x00cb;
                case 65190: goto L_0x00c7;
                case 65192: goto L_0x00c3;
                case 65250: goto L_0x00bf;
                case 65252: goto L_0x00ba;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            goto L_0x0116
        L_0x00ba:
            r6 = 64716(0xfccc, float:9.0686E-41)
            goto L_0x0116
        L_0x00bf:
            r6 = 64578(0xfc42, float:9.0493E-41)
            goto L_0x0116
        L_0x00c3:
            r6 = 64715(0xfccb, float:9.0685E-41)
            goto L_0x0116
        L_0x00c7:
            r6 = 64577(0xfc41, float:9.0492E-41)
            goto L_0x0116
        L_0x00cb:
            r6 = 64714(0xfcca, float:9.0684E-41)
            goto L_0x0116
        L_0x00cf:
            r6 = 64576(0xfc40, float:9.049E-41)
            goto L_0x0116
        L_0x00d3:
            r6 = 64713(0xfcc9, float:9.0682E-41)
            goto L_0x0116
        L_0x00d7:
            r6 = 64575(0xfc3f, float:9.0489E-41)
            goto L_0x0116
        L_0x00db:
            char r5 = r10.charAt(r2)
            r7 = 65266(0xfef2, float:9.1457E-41)
            if (r5 == r7) goto L_0x00e5
            goto L_0x0116
        L_0x00e5:
            r6 = 64562(0xfc32, float:9.047E-41)
            goto L_0x0116
        L_0x00e9:
            char r5 = r10.charAt(r2)
            if (r5 == r9) goto L_0x00fc
            if (r5 == r8) goto L_0x00f8
            if (r5 == r7) goto L_0x00f4
            goto L_0x0116
        L_0x00f4:
            r6 = 64675(0xfca3, float:9.0629E-41)
            goto L_0x0116
        L_0x00f8:
            r6 = 64674(0xfca2, float:9.0628E-41)
            goto L_0x0116
        L_0x00fc:
            r6 = 64673(0xfca1, float:9.0626E-41)
            goto L_0x0116
        L_0x0100:
            char r5 = r10.charAt(r2)
            if (r5 == r9) goto L_0x0113
            if (r5 == r8) goto L_0x010f
            if (r5 == r7) goto L_0x010b
            goto L_0x0116
        L_0x010b:
            r6 = 64670(0xfc9e, float:9.0622E-41)
            goto L_0x0116
        L_0x010f:
            r6 = 64669(0xfc9d, float:9.062E-41)
            goto L_0x0116
        L_0x0113:
            r6 = 64668(0xfc9c, float:9.0619E-41)
        L_0x0116:
            if (r6 == 0) goto L_0x0121
            r10.setCharAt(r4, r6)
            int r3 = r3 + -1
        L_0x011d:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x0121:
            int r4 = r4 + 1
            char r5 = r10.charAt(r2)
            r10.setCharAt(r4, r5)
            goto L_0x011d
        L_0x012b:
            r10.setLength(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.a.e(java.lang.StringBuffer, int):void");
    }

    static boolean f(char c10) {
        return (c10 >= 1611 && c10 <= 1621) || c10 == 1648;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r13.f10157b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        r10 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006e, code lost:
        if (r10 != 1) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0070, code lost:
        r13.f10159d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0075, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int g(char r12, e8.a.C0139a r13) {
        /*
            char r0 = r13.f10156a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = f(r12)
            r2 = 1570(0x622, float:2.2E-42)
            r3 = 1571(0x623, float:2.201E-42)
            r4 = 65271(0xfef7, float:9.1464E-41)
            r5 = 1573(0x625, float:2.204E-42)
            r6 = 65273(0xfef9, float:9.1467E-41)
            r7 = 65275(0xfefb, float:9.147E-41)
            r8 = 1575(0x627, float:2.207E-42)
            r9 = 1
            r10 = 2
            if (r0 == 0) goto L_0x0077
            char r0 = r13.f10158c
            r11 = 1617(0x651, float:2.266E-42)
            if (r0 == 0) goto L_0x0029
            if (r12 == r11) goto L_0x0029
            r0 = r10
            goto L_0x002a
        L_0x0029:
            r0 = r9
        L_0x002a:
            switch(r12) {
                case 1617: goto L_0x0067;
                case 1618: goto L_0x002d;
                case 1619: goto L_0x005f;
                case 1620: goto L_0x0041;
                case 1621: goto L_0x0030;
                default: goto L_0x002d;
            }
        L_0x002d:
            r13.f10158c = r12
            goto L_0x006d
        L_0x0030:
            char r12 = r13.f10156a
            if (r12 == r8) goto L_0x003e
            if (r12 == r7) goto L_0x003b
            r12 = 1621(0x655, float:2.272E-42)
        L_0x0038:
            r13.f10157b = r12
            goto L_0x006d
        L_0x003b:
            r13.f10156a = r6
            goto L_0x006e
        L_0x003e:
            r13.f10156a = r5
            goto L_0x006e
        L_0x0041:
            char r12 = r13.f10156a
            if (r12 == r8) goto L_0x005c
            r1 = 1740(0x6cc, float:2.438E-42)
            if (r12 == r1) goto L_0x0059
            if (r12 == r7) goto L_0x0056
            switch(r12) {
                case 1608: goto L_0x0051;
                case 1609: goto L_0x0059;
                case 1610: goto L_0x0059;
                default: goto L_0x004e;
            }
        L_0x004e:
            r12 = 1620(0x654, float:2.27E-42)
            goto L_0x0038
        L_0x0051:
            r12 = 1572(0x624, float:2.203E-42)
        L_0x0053:
            r13.f10156a = r12
            goto L_0x006e
        L_0x0056:
            r13.f10156a = r4
            goto L_0x006e
        L_0x0059:
            r12 = 1574(0x626, float:2.206E-42)
            goto L_0x0053
        L_0x005c:
            r13.f10156a = r3
            goto L_0x006e
        L_0x005f:
            char r12 = r13.f10156a
            if (r12 == r8) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            r13.f10156a = r2
            goto L_0x006e
        L_0x0067:
            char r12 = r13.f10157b
            if (r12 != 0) goto L_0x0076
            r13.f10157b = r11
        L_0x006d:
            r10 = r0
        L_0x006e:
            if (r10 != r9) goto L_0x0075
            int r12 = r13.f10159d
            int r12 = r12 + r9
            r13.f10159d = r12
        L_0x0075:
            return r10
        L_0x0076:
            return r1
        L_0x0077:
            char r0 = r13.f10158c
            if (r0 == 0) goto L_0x007c
            return r1
        L_0x007c:
            char r0 = r13.f10156a
            if (r0 == 0) goto L_0x00a1
            r9 = 1604(0x644, float:2.248E-42)
            if (r0 == r9) goto L_0x0085
            goto L_0x00aa
        L_0x0085:
            r0 = 3
            if (r12 == r2) goto L_0x009b
            if (r12 == r3) goto L_0x0098
            if (r12 == r5) goto L_0x0095
            if (r12 == r8) goto L_0x008f
            goto L_0x00aa
        L_0x008f:
            r13.f10156a = r7
        L_0x0091:
            r13.f10160e = r10
            r1 = r0
            goto L_0x00aa
        L_0x0095:
            r13.f10156a = r6
            goto L_0x0091
        L_0x0098:
            r13.f10156a = r4
            goto L_0x0091
        L_0x009b:
            r12 = 65269(0xfef5, float:9.1461E-41)
            r13.f10156a = r12
            goto L_0x0091
        L_0x00a1:
            r13.f10156a = r12
            int r12 = k(r12)
            r13.f10160e = r12
            r1 = r9
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.a.g(char, e8.a$a):int");
    }

    static void h(char[] cArr, int i10, int i11, int i12) {
        int i13 = i10 + i11;
        int i14 = i12 & 224;
        if (i14 != 0) {
            int i15 = i12 & 256;
            char c10 = i15 != 0 ? i15 != 256 ? '0' : 1776 : 1632;
            if (i14 == 32) {
                int i16 = c10 - '0';
                while (i10 < i13) {
                    char c11 = cArr[i10];
                    if (c11 <= '9' && c11 >= '0') {
                        cArr[i10] = (char) (c11 + i16);
                    }
                    i10++;
                }
            } else if (i14 == 64) {
                char c12 = (char) (c10 + 9);
                int i17 = '0' - c10;
                while (i10 < i13) {
                    char c13 = cArr[i10];
                    if (c13 <= c12 && c13 >= c10) {
                        cArr[i10] = (char) (c13 + i17);
                    }
                    i10++;
                }
            } else if (i14 == 96) {
                j(cArr, 0, i11, c10, false);
            } else if (i14 == 128) {
                j(cArr, 0, i11, c10, true);
            }
        }
    }

    static void i(char[] cArr, StringBuffer stringBuffer, int i10) {
        C0139a aVar = new C0139a();
        C0139a aVar2 = new C0139a();
        int i11 = 0;
        while (i11 < cArr.length) {
            int i12 = i11 + 1;
            char c10 = cArr[i11];
            if (g(c10, aVar2) == 0) {
                int k10 = k(c10);
                int i13 = k10 == 1 ? 0 : 2;
                if (c(aVar)) {
                    i13++;
                }
                aVar2.f10156a = b(aVar2.f10156a, i13 % aVar2.f10160e);
                d(stringBuffer, aVar, i10);
                C0139a aVar3 = new C0139a();
                aVar3.f10156a = c10;
                aVar3.f10160e = k10;
                aVar3.f10159d++;
                i11 = i12;
                C0139a aVar4 = aVar2;
                aVar2 = aVar3;
                aVar = aVar4;
            } else {
                i11 = i12;
            }
        }
        aVar2.f10156a = b(aVar2.f10156a, (c(aVar) ? 1 : 0) % aVar2.f10160e);
        d(stringBuffer, aVar, i10);
        d(stringBuffer, aVar2, i10);
    }

    static void j(char[] cArr, int i10, int i11, char c10, boolean z10) {
        char c11 = (char) (c10 - '0');
        int i12 = i11 + i10;
        while (i10 < i12) {
            char c12 = cArr[i10];
            byte d10 = e.d(c12);
            if (d10 != 0) {
                if (d10 != 8) {
                    if (d10 != 3) {
                        if (d10 == 4) {
                            z10 = true;
                        }
                    }
                } else if (z10 && c12 <= '9') {
                    cArr[i10] = (char) (c12 + c11);
                }
                i10++;
            }
            z10 = false;
            i10++;
        }
    }

    static int k(char c10) {
        if (c10 >= 1569 && c10 <= 1747 && !f(c10)) {
            int length = f10155a.length - 1;
            int i10 = 0;
            while (i10 <= length) {
                int i11 = (i10 + length) / 2;
                char[] cArr = f10155a[i11];
                char c11 = cArr[0];
                if (c10 == c11) {
                    return cArr.length - 1;
                }
                if (c10 < c11) {
                    length = i11 - 1;
                } else {
                    i10 = i11 + 1;
                }
            }
        } else if (c10 == 8205) {
            return 4;
        }
        return 1;
    }
}
