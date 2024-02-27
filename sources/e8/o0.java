package e8;

import a8.j;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f10962a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127, 8364, 65533, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 65533, 381, 65533, 65533, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 65533, 382, 376, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255};

    /* renamed from: b  reason: collision with root package name */
    static final char[] f10963b = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', 127, 8226, 8224, 8225, 8230, 8212, 8211, 402, 8260, 8249, 8250, 8722, 8240, 8222, 8220, 8221, 8216, 8217, 8218, 8482, 64257, 64258, 321, 338, 352, 376, 381, 305, 322, 339, 353, 382, 65533, 8364, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255};

    /* renamed from: c  reason: collision with root package name */
    static final s f10964c = new s();

    /* renamed from: d  reason: collision with root package name */
    static final s f10965d = new s();

    /* renamed from: e  reason: collision with root package name */
    static HashMap f10966e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    static final HashMap f10967f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public static final byte[][] f10968g = {new byte[]{10}, new byte[]{13, 10}};

    private static class b implements o {

        /* renamed from: a  reason: collision with root package name */
        private static s f10969a = new s();

        /* renamed from: b  reason: collision with root package name */
        private static final char[] f10970b = {199, 252, 233, 226, 228, 224, 229, 231, 234, 235, 232, 239, 238, 236, 196, 197, 201, 230, 198, 244, 246, 242, 251, 249, 255, 214, 220, 162, 163, 165, 8359, 402, 225, 237, 243, 250, 241, 209, 170, 186, 191, 8976, 172, 189, 188, 161, 171, 187, 9617, 9618, 9619, 9474, 9508, 9569, 9570, 9558, 9557, 9571, 9553, 9559, 9565, 9564, 9563, 9488, 9492, 9524, 9516, 9500, 9472, 9532, 9566, 9567, 9562, 9556, 9577, 9574, 9568, 9552, 9580, 9575, 9576, 9572, 9573, 9561, 9560, 9554, 9555, 9579, 9578, 9496, 9484, 9608, 9604, 9612, 9616, 9600, 945, 223, 915, 960, 931, 963, 181, 964, 934, 920, 937, 948, 8734, 966, 949, 8745, 8801, 177, 8805, 8804, 8992, 8993, 247, 8776, 176, 8729, 183, 8730, 8319, 178, 9632, 160};

        static {
            int i10 = 0;
            while (true) {
                char[] cArr = f10970b;
                if (i10 < cArr.length) {
                    f10969a.d(cArr[i10], i10 + 128);
                    i10++;
                } else {
                    return;
                }
            }
        }

        private b() {
        }

        public byte[] a(String str, String str2) {
            int i10;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int i11 = 0;
            for (char c10 : charArray) {
                if (c10 < 128) {
                    i10 = i11 + 1;
                    bArr[i11] = (byte) c10;
                } else {
                    byte b10 = (byte) f10969a.b(c10);
                    if (b10 != 0) {
                        i10 = i11 + 1;
                        bArr[i11] = b10;
                    }
                }
                i11 = i10;
            }
            if (i11 == r0) {
                return bArr;
            }
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            return bArr2;
        }

        public byte[] b(char c10, String str) {
            if (c10 < 128) {
                return new byte[]{(byte) c10};
            }
            byte b10 = (byte) f10969a.b(c10);
            if (b10 == 0) {
                return new byte[0];
            }
            return new byte[]{b10};
        }

        public String c(byte[] bArr, String str) {
            int i10;
            char[] cArr = new char[r8];
            int i11 = 0;
            for (byte b10 : bArr) {
                byte b11 = b10 & 255;
                if (b11 >= 32) {
                    if (b11 < 128) {
                        i10 = i11 + 1;
                        cArr[i11] = (char) b11;
                    } else {
                        i10 = i11 + 1;
                        cArr[i11] = f10970b[b11 - 128];
                    }
                    i11 = i10;
                }
            }
            return new String(cArr, 0, i11);
        }
    }

    private static class c implements o {

        /* renamed from: b  reason: collision with root package name */
        private static final s f10971b = new s();

        /* renamed from: c  reason: collision with root package name */
        private static final s f10972c = new s();

        /* renamed from: d  reason: collision with root package name */
        private static final char[] f10973d = {' ', '!', 8704, '#', 8707, '%', '&', 8715, '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', 8773, 913, 914, 935, 916, 917, 934, 915, 919, 921, 977, 922, 923, 924, 925, 927, 928, 920, 929, 931, 932, 933, 962, 937, 926, 936, 918, '[', 8756, ']', 8869, '_', 773, 945, 946, 967, 948, 949, 981, 947, 951, 953, 966, 954, 955, 956, 957, 959, 960, 952, 961, 963, 964, 965, 982, 969, 958, 968, 950, '{', '|', '}', '~', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8364, 978, 8242, 8804, 8260, 8734, 402, 9827, 9830, 9829, 9824, 8596, 8592, 8593, 8594, 8595, 176, 177, 8243, 8805, 215, 8733, 8706, 8226, 247, 8800, 8801, 8776, 8230, 9474, 9472, 8629, 8501, 8465, 8476, 8472, 8855, 8853, 8709, 8745, 8746, 8835, 8839, 8836, 8834, 8838, 8712, 8713, 8736, 8711, 174, 169, 8482, 8719, 8730, 8226, 172, 8743, 8744, 8660, 8656, 8657, 8658, 8659, 9674, 9001, 0, 0, 0, 8721, 9115, 9116, 9117, 9121, 9122, 9123, 9127, 9128, 9129, 9130, 0, 9002, 8747, 8992, 9134, 8993, 9118, 9119, 9120, 9124, 9125, 9126, 9131, 9132, 9133, 0};

        /* renamed from: e  reason: collision with root package name */
        private static final char[] f10974e = {' ', 9985, 9986, 9987, 9988, 9742, 9990, 9991, 9992, 9993, 9755, 9758, 9996, 9997, 9998, 9999, 10000, 10001, 10002, 10003, 10004, 10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018, 10019, 10020, 10021, 10022, 10023, 9733, 10025, 10026, 10027, 10028, 10029, 10030, 10031, 10032, 10033, 10034, 10035, 10036, 10037, 10038, 10039, 10040, 10041, 10042, 10043, 10044, 10045, 10046, 10047, 10048, 10049, 10050, 10051, 10052, 10053, 10054, 10055, 10056, 10057, 10058, 10059, 9679, 10061, 9632, 10063, 10064, 10065, 10066, 9650, 9660, 9670, 10070, 9687, 10072, 10073, 10074, 10075, 10076, 10077, 10078, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10081, 10082, 10083, 10084, 10085, 10086, 10087, 9827, 9830, 9829, 9824, 9312, 9313, 9314, 9315, 9316, 9317, 9318, 9319, 9320, 9321, 10102, 10103, 10104, 10105, 10106, 10107, 10108, 10109, 10110, 10111, 10112, 10113, 10114, 10115, 10116, 10117, 10118, 10119, 10120, 10121, 10122, 10123, 10124, 10125, 10126, 10127, 10128, 10129, 10130, 10131, 10132, 8594, 8596, 8597, 10136, 10137, 10138, 10139, 10140, 10141, 10142, 10143, 10144, 10145, 10146, 10147, 10148, 10149, 10150, 10151, 10152, 10153, 10154, 10155, 10156, 10157, 10158, 10159, 0, 10161, 10162, 10163, 10164, 10165, 10166, 10167, 10168, 10169, 10170, 10171, 10172, 10173, 10174, 0};

        /* renamed from: a  reason: collision with root package name */
        private s f10975a;

        static {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                char[] cArr = f10973d;
                if (i11 >= cArr.length) {
                    break;
                }
                char c10 = cArr[i11];
                if (c10 != 0) {
                    f10971b.d(c10, i11 + 32);
                }
                i11++;
            }
            while (true) {
                char[] cArr2 = f10974e;
                if (i10 < cArr2.length) {
                    char c11 = cArr2[i10];
                    if (c11 != 0) {
                        f10972c.d(c11, i10 + 32);
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }

        c(boolean z10) {
            this.f10975a = z10 ? f10971b : f10972c;
        }

        public byte[] a(String str, String str2) {
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int i10 = 0;
            for (char b10 : charArray) {
                byte b11 = (byte) this.f10975a.b(b10);
                if (b11 != 0) {
                    bArr[i10] = b11;
                    i10++;
                }
            }
            if (i10 == r0) {
                return bArr;
            }
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            return bArr2;
        }

        public byte[] b(char c10, String str) {
            byte b10 = (byte) this.f10975a.b(c10);
            if (b10 == 0) {
                return new byte[0];
            }
            return new byte[]{b10};
        }

        public String c(byte[] bArr, String str) {
            return null;
        }
    }

    private static class d implements o {
        private d() {
        }

        public byte[] a(String str, String str2) {
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int i10 = 0;
            for (char c10 : charArray) {
                char c11 = 65280 & c10;
                if (c11 == 0 || c11 == 61440) {
                    bArr[i10] = (byte) c10;
                    i10++;
                }
            }
            if (i10 == r0) {
                return bArr;
            }
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, i10);
            return bArr2;
        }

        public byte[] b(char c10, String str) {
            char c11 = 65280 & c10;
            if (c11 != 0 && c11 != 61440) {
                return new byte[0];
            }
            return new byte[]{(byte) c10};
        }

        public String c(byte[] bArr, String str) {
            return null;
        }
    }

    private static class e implements o {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f10976a = {0, 35, 34, 0, 0, 0, 41, 62, 81, 42, 0, 0, 65, 63, 0, 0, 0, 0, 0, -4, 0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 86, 0, 88, 89, 0, 0, 0, 0, 0, 0, 0, 0, -75, 0, 0, 0, 0, 0, -74, 0, 0, 0, -83, -81, -84, 0, 0, 0, 0, 0, 0, 0, 0, 124, 123, 0, 0, 0, 84, 0, 0, 0, 0, 0, 0, 0, 0, -90, 0, 0, 0, 113, 114, 0, 0, 0, 117, 0, 0, 0, 0, 0, 0, 125, 126, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -127, -126, -125, -124, -123, -122, -121, -120, -119, -118, -116, -115, -114, -113, -112, -111, -110, -109, -108, -107, -24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -24, -40, 0, 0, -60, -58, 0, 0, -16, 0, 0, 0, 0, 0, 0, 0, 0, 0, -36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        private e() {
        }

        public byte[] a(String str, String str2) {
            byte b10;
            int i10;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            int i11 = 0;
            for (char c10 : charArray) {
                if (c10 == ' ') {
                    i10 = i11 + 1;
                    bArr[i11] = (byte) c10;
                } else {
                    if (c10 >= 9985 && c10 <= 10174 && (b10 = f10976a[c10 - 9984]) != 0) {
                        i10 = i11 + 1;
                        bArr[i11] = b10;
                    }
                }
                i11 = i10;
            }
            if (i11 == r0) {
                return bArr;
            }
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            return bArr2;
        }

        public byte[] b(char c10, String str) {
            byte b10;
            if (c10 == ' ') {
                return new byte[]{(byte) c10};
            } else if (c10 < 9985 || c10 > 10174 || (b10 = f10976a[c10 - 9984]) == 0) {
                return new byte[0];
            } else {
                return new byte[]{b10};
            }
        }

        public String c(byte[] bArr, String str) {
            return null;
        }
    }

    static {
        for (int i10 = 128; i10 < 161; i10++) {
            char c10 = f10962a[i10];
            if (c10 != 65533) {
                f10964c.d(c10, i10);
            }
        }
        for (int i11 = 128; i11 < 161; i11++) {
            char c11 = f10963b[i11];
            if (c11 != 65533) {
                f10965d.d(c11, i11);
            }
        }
        a("Wingdings", new e());
        a("Symbol", new c(true));
        a("ZapfDingbats", new c(false));
        a("SymbolTT", new d());
        a("Cp437", new b());
    }

    public static void a(String str, o oVar) {
        synchronized (f10966e) {
            HashMap hashMap = (HashMap) f10966e.clone();
            hashMap.put(str.toLowerCase(), oVar);
            f10966e = hashMap;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: char} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r4 <= 255) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        r4 = r2.b(r4);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] b(char r4, java.lang.String r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0083
            int r2 = r5.length()
            if (r2 != 0) goto L_0x000c
            goto L_0x0083
        L_0x000c:
            java.util.HashMap r2 = f10966e
            java.lang.String r3 = r5.toLowerCase()
            java.lang.Object r2 = r2.get(r3)
            e8.o r2 = (e8.o) r2
            if (r2 == 0) goto L_0x0021
            byte[] r2 = r2.b(r4, r5)
            if (r2 == 0) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.String r2 = "Cp1252"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x002c
            e8.s r2 = f10964c
            goto L_0x0038
        L_0x002c:
            java.lang.String r2 = "PDF"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0037
            e8.s r2 = f10965d
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x0056
            r5 = 128(0x80, float:1.794E-43)
            if (r4 < r5) goto L_0x004b
            r5 = 160(0xa0, float:2.24E-43)
            if (r4 <= r5) goto L_0x0047
            if (r4 > r3) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            int r4 = r2.b(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x0053
            byte[] r5 = new byte[r0]
            byte r4 = (byte) r4
            r5[r1] = r4
            return r5
        L_0x0053:
            byte[] r4 = new byte[r1]
            return r4
        L_0x0056:
            java.lang.String r2 = "UnicodeBig"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0073
            r5 = 4
            byte[] r5 = new byte[r5]
            r2 = -2
            r5[r1] = r2
            r1 = -1
            r5[r0] = r1
            int r0 = r4 >> 8
            byte r0 = (byte) r0
            r1 = 2
            r5[r1] = r0
            r4 = r4 & r3
            byte r4 = (byte) r4
            r0 = 3
            r5[r0] = r4
            return r5
        L_0x0073:
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ UnsupportedEncodingException -> 0x007c }
            byte[] r4 = r4.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x007c }
            return r4
        L_0x007c:
            r4 = move-exception
            a8.j r5 = new a8.j
            r5.<init>(r4)
            throw r5
        L_0x0083:
            byte[] r5 = new byte[r0]
            byte r4 = (byte) r4
            r5[r1] = r4
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.o0.b(char, java.lang.String):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: char} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r6 <= 255) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r6 = r1.b(r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] c(java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0006
            byte[] r8 = new byte[r0]
            return r8
        L_0x0006:
            if (r9 == 0) goto L_0x00ab
            int r1 = r9.length()
            if (r1 != 0) goto L_0x0010
            goto L_0x00ab
        L_0x0010:
            java.util.HashMap r1 = f10966e
            java.lang.String r2 = r9.toLowerCase()
            java.lang.Object r1 = r1.get(r2)
            e8.o r1 = (e8.o) r1
            if (r1 == 0) goto L_0x0025
            byte[] r1 = r1.a(r8, r9)
            if (r1 == 0) goto L_0x0025
            return r1
        L_0x0025:
            java.lang.String r1 = "Cp1252"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0030
            e8.s r1 = f10964c
            goto L_0x003c
        L_0x0030:
            java.lang.String r1 = "PDF"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x003b
            e8.s r1 = f10965d
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            r2 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0070
            char[] r8 = r8.toCharArray()
            int r9 = r8.length
            byte[] r3 = new byte[r9]
            r4 = r0
            r5 = r4
        L_0x0049:
            if (r4 >= r9) goto L_0x0067
            char r6 = r8[r4]
            r7 = 128(0x80, float:1.794E-43)
            if (r6 < r7) goto L_0x005c
            r7 = 160(0xa0, float:2.24E-43)
            if (r6 <= r7) goto L_0x0058
            if (r6 > r2) goto L_0x0058
            goto L_0x005c
        L_0x0058:
            int r6 = r1.b(r6)
        L_0x005c:
            if (r6 == 0) goto L_0x0064
            int r7 = r5 + 1
            byte r6 = (byte) r6
            r3[r5] = r6
            r5 = r7
        L_0x0064:
            int r4 = r4 + 1
            goto L_0x0049
        L_0x0067:
            if (r5 != r9) goto L_0x006a
            return r3
        L_0x006a:
            byte[] r8 = new byte[r5]
            java.lang.System.arraycopy(r3, r0, r8, r0, r5)
            return r8
        L_0x0070:
            java.lang.String r1 = "UnicodeBig"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x009f
            char[] r8 = r8.toCharArray()
            int r9 = r8.length
            int r1 = r8.length
            r3 = 2
            int r1 = r1 * r3
            int r1 = r1 + r3
            byte[] r1 = new byte[r1]
            r4 = -2
            r1[r0] = r4
            r4 = -1
            r5 = 1
            r1[r5] = r4
            r4 = r3
        L_0x008b:
            if (r0 >= r9) goto L_0x009e
            char r5 = r8[r0]
            int r6 = r4 + 1
            int r7 = r5 >> 8
            byte r7 = (byte) r7
            r1[r4] = r7
            int r4 = r4 + r3
            r5 = r5 & r2
            byte r5 = (byte) r5
            r1[r6] = r5
            int r0 = r0 + 1
            goto L_0x008b
        L_0x009e:
            return r1
        L_0x009f:
            byte[] r8 = r8.getBytes(r9)     // Catch:{ UnsupportedEncodingException -> 0x00a4 }
            return r8
        L_0x00a4:
            r8 = move-exception
            a8.j r9 = new a8.j
            r9.<init>(r8)
            throw r9
        L_0x00ab:
            int r9 = r8.length()
            byte[] r1 = new byte[r9]
        L_0x00b1:
            if (r0 >= r9) goto L_0x00bd
            char r2 = r8.charAt(r0)
            byte r2 = (byte) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x00b1
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.o0.c(java.lang.String, java.lang.String):byte[]");
    }

    public static final String d(byte[] bArr, String str) {
        String c10;
        if (bArr == null) {
            return "";
        }
        int i10 = 0;
        if (str == null || str.length() == 0) {
            char[] cArr = new char[bArr.length];
            while (i10 < bArr.length) {
                cArr[i10] = (char) (bArr[i10] & 255);
                i10++;
            }
            return new String(cArr);
        }
        o oVar = (o) f10966e.get(str.toLowerCase());
        if (oVar != null && (c10 = oVar.c(bArr, str)) != null) {
            return c10;
        }
        char[] cArr2 = str.equals("Cp1252") ? f10962a : str.equals("PDF") ? f10963b : null;
        if (cArr2 != null) {
            int length = bArr.length;
            char[] cArr3 = new char[length];
            while (i10 < length) {
                cArr3[i10] = cArr2[bArr[i10] & 255];
                i10++;
            }
            return new String(cArr3);
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e10) {
            throw new j(e10);
        }
    }

    public static boolean e(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= 128 && ((charAt <= 160 || charAt > 255) && !f10965d.a(charAt))) {
                return false;
            }
        }
        return true;
    }
}
