package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public abstract class h {

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        int f2378a;

        /* renamed from: b  reason: collision with root package name */
        boolean f2379b;

        a() {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public char f2380a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f2381b;

        b(char c10, float[] fArr) {
            this.f2380a = c10;
            this.f2381b = fArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0215, code lost:
            if (r12[r7 + 4] == 0.0f) goto L_0x021a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0217, code lost:
            r23 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x021a, code lost:
            r23 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x021c, code lost:
            r24 = r7;
            c(r25, r9, r8, r3, r4, r5, r6, r15, r22, r23);
            r9 = r9 + r12[r13];
            r8 = r8 + r12[r14];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0234, code lost:
            r3 = r8;
            r2 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0238, code lost:
            r24 = r7;
            r10.lineTo(r9, r12[r24]);
            r8 = r12[r24];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0244, code lost:
            r24 = r7;
            r7 = r24 + 1;
            r2 = r24 + 2;
            r4 = r24 + 3;
            r10.quadTo(r12[r24], r12[r7], r12[r2], r12[r4]);
            r0 = r12[r24];
            r1 = r12[r7];
            r9 = r12[r2];
            r8 = r12[r4];
            r2 = r0;
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0263, code lost:
            r24 = r7;
            r10.lineTo(r12[r24], r8);
            r9 = r12[r24];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x026f, code lost:
            r24 = r7;
            r7 = r24 + 2;
            r8 = r24 + 3;
            r9 = r24 + 4;
            r11 = r24 + 5;
            r25.cubicTo(r12[r24], r12[r24 + 1], r12[r7], r12[r8], r12[r9], r12[r11]);
            r9 = r12[r9];
            r0 = r12[r11];
            r1 = r12[r7];
            r2 = r12[r8];
            r8 = r0;
            r3 = r2;
            r2 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0298, code lost:
            r24 = r7;
            r15 = r8;
            r11 = r9;
            r13 = r24 + 5;
            r3 = r12[r13];
            r14 = r24 + 6;
            r4 = r12[r14];
            r5 = r12[r24];
            r6 = r12[r24 + 1];
            r7 = r12[r24 + 2];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b5, code lost:
            if (r12[r24 + 3] == 0.0f) goto L_0x02b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b7, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b9, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x02c0, code lost:
            if (r12[r24 + 4] == 0.0f) goto L_0x02c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c2, code lost:
            r9 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c4, code lost:
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x02c5, code lost:
            c(r25, r11, r15, r3, r4, r5, r6, r7, r8, r9);
            r9 = r12[r13];
            r8 = r12[r14];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d2, code lost:
            r7 = r24 + r19;
            r0 = r28;
            r11 = r0;
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
            if (r7 >= r12.length) goto L_0x02dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x02dc, code lost:
            r26[r13] = r9;
            r26[1] = r8;
            r26[2] = r2;
            r26[3] = r3;
            r26[4] = r20;
            r26[5] = r21;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ed, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
            if (r11 == 'A') goto L_0x0298;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
            if (r11 == 'C') goto L_0x026f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
            if (r11 == 'H') goto L_0x0263;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (r11 == 'Q') goto L_0x0244;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
            if (r11 == 'V') goto L_0x0238;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
            if (r11 == 'a') goto L_0x01eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
            if (r11 == 'c') goto L_0x01c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
            if (r11 == 'h') goto L_0x01b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
            if (r11 == 'q') goto L_0x019a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
            r19 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
            if (r11 == 'v') goto L_0x0190;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
            if (r11 == 'L') goto L_0x0181;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
            if (r11 == 'M') goto L_0x016f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
            if (r11 == 'S') goto L_0x013b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
            if (r11 == 'T') goto L_0x0118;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
            if (r11 == 'l') goto L_0x0107;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
            if (r11 == 'm') goto L_0x00ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x008a, code lost:
            if (r11 == 's') goto L_0x00b6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x008c, code lost:
            if (r11 == 't') goto L_0x0092;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
            r24 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0092, code lost:
            if (r0 == 'q') goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
            if (r0 == 't') goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0096, code lost:
            if (r0 == 'Q') goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
            if (r0 != 'T') goto L_0x009b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
            r0 = 0.0f;
            r4 = 0.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x009e, code lost:
            r4 = r9 - r2;
            r0 = r8 - r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a2, code lost:
            r2 = r7 + 1;
            r10.rQuadTo(r4, r0, r12[r7], r12[r2]);
            r4 = r4 + r9;
            r0 = r0 + r8;
            r9 = r9 + r12[r7];
            r8 = r8 + r12[r2];
            r3 = r0;
            r2 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b6, code lost:
            if (r0 == 'c') goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b8, code lost:
            if (r0 == 's') goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bc, code lost:
            if (r0 == 'C') goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c0, code lost:
            if (r0 != 'S') goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c3, code lost:
            r1 = 0.0f;
            r2 = 0.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c6, code lost:
            r0 = r9 - r2;
            r2 = r8 - r3;
            r1 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cc, code lost:
            r13 = r7 + 1;
            r14 = r7 + 2;
            r15 = r7 + 3;
            r25.rCubicTo(r1, r2, r12[r7], r12[r13], r12[r14], r12[r15]);
            r0 = r12[r7] + r9;
            r1 = r12[r13] + r8;
            r9 = r9 + r12[r14];
            r2 = r12[r15];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ea, code lost:
            r8 = r8 + r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00eb, code lost:
            r2 = r0;
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ee, code lost:
            r0 = r12[r7];
            r9 = r9 + r0;
            r1 = r12[r7 + 1];
            r8 = r8 + r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f6, code lost:
            if (r7 <= 0) goto L_0x00fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f8, code lost:
            r10.rLineTo(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fc, code lost:
            r10.rMoveTo(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ff, code lost:
            r24 = r7;
            r21 = r8;
            r20 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0107, code lost:
            r1 = r7 + 1;
            r10.rLineTo(r12[r7], r12[r1]);
            r9 = r9 + r12[r7];
            r0 = r12[r1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x0115, code lost:
            r8 = r8 + r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0118, code lost:
            if (r0 == 'q') goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x011a, code lost:
            if (r0 == 't') goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x011c, code lost:
            if (r0 == 'Q') goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x011e, code lost:
            if (r0 != 'T') goto L_0x0126;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0120, code lost:
            r9 = (r9 * 2.0f) - r2;
            r8 = (r8 * 2.0f) - r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0126, code lost:
            r1 = r7 + 1;
            r10.quadTo(r9, r8, r12[r7], r12[r1]);
            r24 = r7;
            r3 = r8;
            r2 = r9;
            r9 = r12[r7];
            r8 = r12[r1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x013b, code lost:
            if (r0 == 'c') goto L_0x014b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x013d, code lost:
            if (r0 == 's') goto L_0x014b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
            r19 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0141, code lost:
            if (r0 == 'C') goto L_0x014b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x0145, code lost:
            if (r0 != 'S') goto L_0x0148;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x0148, code lost:
            r2 = r8;
            r1 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x014b, code lost:
            r9 = (r9 * 2.0f) - r2;
            r8 = (r8 * 2.0f) - r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x0152, code lost:
            r8 = r7 + 1;
            r9 = r7 + 2;
            r13 = r7 + 3;
            r25.cubicTo(r1, r2, r12[r7], r12[r8], r12[r9], r12[r13]);
            r0 = r12[r7];
            r1 = r12[r8];
            r9 = r12[r9];
            r8 = r12[r13];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x016f, code lost:
            r9 = r12[r7];
            r8 = r12[r7 + 1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0175, code lost:
            if (r7 <= 0) goto L_0x017c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0177, code lost:
            r10.lineTo(r9, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x017c, code lost:
            r10.moveTo(r9, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0181, code lost:
            r1 = r7 + 1;
            r10.lineTo(r12[r7], r12[r1]);
            r9 = r12[r7];
            r8 = r12[r1];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0190, code lost:
            r10.rLineTo(0.0f, r12[r7]);
            r0 = r12[r7];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x019a, code lost:
            r1 = r7 + 1;
            r3 = r7 + 2;
            r5 = r7 + 3;
            r10.rQuadTo(r12[r7], r12[r1], r12[r3], r12[r5]);
            r0 = r12[r7] + r9;
            r1 = r12[r1] + r8;
            r9 = r9 + r12[r3];
            r2 = r12[r5];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b8, code lost:
            r10.rLineTo(r12[r7], 0.0f);
            r9 = r9 + r12[r7];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x01c3, code lost:
            r13 = r7 + 2;
            r14 = r7 + 3;
            r15 = r7 + 4;
            r22 = r7 + 5;
            r25.rCubicTo(r12[r7], r12[r7 + 1], r12[r13], r12[r14], r12[r15], r12[r22]);
            r0 = r12[r13] + r9;
            r1 = r12[r14] + r8;
            r9 = r9 + r12[r15];
            r2 = r12[r22];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x01eb, code lost:
            r13 = r7 + 5;
            r3 = r12[r13] + r9;
            r14 = r7 + 6;
            r4 = r12[r14] + r8;
            r5 = r12[r7];
            r6 = r12[r7 + 1];
            r15 = r12[r7 + 2];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0208, code lost:
            if (r12[r7 + 3] == 0.0f) goto L_0x020d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x020a, code lost:
            r22 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x020d, code lost:
            r22 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
            r9 = r0;
            r8 = r1;
            r20 = r4;
            r21 = r5;
            r7 = 0;
            r0 = r27;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void a(android.graphics.Path r25, float[] r26, char r27, char r28, float[] r29) {
            /*
                r10 = r25
                r11 = r28
                r12 = r29
                r13 = 0
                r0 = r26[r13]
                r14 = 1
                r1 = r26[r14]
                r15 = 2
                r2 = r26[r15]
                r16 = 3
                r3 = r26[r16]
                r17 = 4
                r4 = r26[r17]
                r18 = 5
                r5 = r26[r18]
                switch(r11) {
                    case 65: goto L_0x0036;
                    case 67: goto L_0x0032;
                    case 72: goto L_0x002f;
                    case 76: goto L_0x001e;
                    case 77: goto L_0x001e;
                    case 81: goto L_0x002c;
                    case 83: goto L_0x002c;
                    case 84: goto L_0x001e;
                    case 86: goto L_0x002f;
                    case 90: goto L_0x0021;
                    case 97: goto L_0x0036;
                    case 99: goto L_0x0032;
                    case 104: goto L_0x002f;
                    case 108: goto L_0x001e;
                    case 109: goto L_0x001e;
                    case 113: goto L_0x002c;
                    case 115: goto L_0x002c;
                    case 116: goto L_0x001e;
                    case 118: goto L_0x002f;
                    case 122: goto L_0x0021;
                    default: goto L_0x001e;
                }
            L_0x001e:
                r19 = r15
                goto L_0x0038
            L_0x0021:
                r25.close()
                r10.moveTo(r4, r5)
                r0 = r4
                r2 = r0
                r1 = r5
                r3 = r1
                goto L_0x001e
            L_0x002c:
                r19 = r17
                goto L_0x0038
            L_0x002f:
                r19 = r14
                goto L_0x0038
            L_0x0032:
                r6 = 6
            L_0x0033:
                r19 = r6
                goto L_0x0038
            L_0x0036:
                r6 = 7
                goto L_0x0033
            L_0x0038:
                r9 = r0
                r8 = r1
                r20 = r4
                r21 = r5
                r7 = r13
                r0 = r27
            L_0x0041:
                int r1 = r12.length
                if (r7 >= r1) goto L_0x02dc
                r1 = 65
                if (r11 == r1) goto L_0x0298
                r1 = 67
                if (r11 == r1) goto L_0x026f
                r5 = 72
                if (r11 == r5) goto L_0x0263
                r5 = 81
                if (r11 == r5) goto L_0x0244
                r6 = 86
                if (r11 == r6) goto L_0x0238
                r6 = 97
                if (r11 == r6) goto L_0x01eb
                r6 = 99
                if (r11 == r6) goto L_0x01c3
                r15 = 104(0x68, float:1.46E-43)
                if (r11 == r15) goto L_0x01b8
                r15 = 113(0x71, float:1.58E-43)
                if (r11 == r15) goto L_0x019a
                r14 = 118(0x76, float:1.65E-43)
                if (r11 == r14) goto L_0x0190
                r14 = 76
                if (r11 == r14) goto L_0x0181
                r14 = 77
                if (r11 == r14) goto L_0x016f
                r14 = 115(0x73, float:1.61E-43)
                r13 = 83
                r22 = 1073741824(0x40000000, float:2.0)
                if (r11 == r13) goto L_0x013b
                r4 = 116(0x74, float:1.63E-43)
                r13 = 84
                if (r11 == r13) goto L_0x0118
                r1 = 108(0x6c, float:1.51E-43)
                if (r11 == r1) goto L_0x0107
                r1 = 109(0x6d, float:1.53E-43)
                if (r11 == r1) goto L_0x00ee
                if (r11 == r14) goto L_0x00b6
                if (r11 == r4) goto L_0x0092
            L_0x008e:
                r24 = r7
                goto L_0x02d2
            L_0x0092:
                if (r0 == r15) goto L_0x009e
                if (r0 == r4) goto L_0x009e
                if (r0 == r5) goto L_0x009e
                if (r0 != r13) goto L_0x009b
                goto L_0x009e
            L_0x009b:
                r0 = 0
                r4 = 0
                goto L_0x00a2
            L_0x009e:
                float r4 = r9 - r2
                float r0 = r8 - r3
            L_0x00a2:
                r1 = r12[r7]
                int r2 = r7 + 1
                r3 = r12[r2]
                r10.rQuadTo(r4, r0, r1, r3)
                float r4 = r4 + r9
                float r0 = r0 + r8
                r1 = r12[r7]
                float r9 = r9 + r1
                r1 = r12[r2]
                float r8 = r8 + r1
                r3 = r0
                r2 = r4
                goto L_0x008e
            L_0x00b6:
                if (r0 == r6) goto L_0x00c6
                if (r0 == r14) goto L_0x00c6
                r1 = 67
                if (r0 == r1) goto L_0x00c6
                r1 = 83
                if (r0 != r1) goto L_0x00c3
                goto L_0x00c6
            L_0x00c3:
                r1 = 0
                r2 = 0
                goto L_0x00cc
            L_0x00c6:
                float r0 = r9 - r2
                float r1 = r8 - r3
                r2 = r1
                r1 = r0
            L_0x00cc:
                r3 = r12[r7]
                int r13 = r7 + 1
                r4 = r12[r13]
                int r14 = r7 + 2
                r5 = r12[r14]
                int r15 = r7 + 3
                r6 = r12[r15]
                r0 = r25
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r7]
                float r0 = r0 + r9
                r1 = r12[r13]
                float r1 = r1 + r8
                r2 = r12[r14]
                float r9 = r9 + r2
                r2 = r12[r15]
            L_0x00ea:
                float r8 = r8 + r2
            L_0x00eb:
                r2 = r0
                r3 = r1
                goto L_0x008e
            L_0x00ee:
                r0 = r12[r7]
                float r9 = r9 + r0
                int r1 = r7 + 1
                r1 = r12[r1]
                float r8 = r8 + r1
                if (r7 <= 0) goto L_0x00fc
                r10.rLineTo(r0, r1)
                goto L_0x008e
            L_0x00fc:
                r10.rMoveTo(r0, r1)
            L_0x00ff:
                r24 = r7
                r21 = r8
                r20 = r9
                goto L_0x02d2
            L_0x0107:
                r0 = r12[r7]
                int r1 = r7 + 1
                r4 = r12[r1]
                r10.rLineTo(r0, r4)
                r0 = r12[r7]
                float r9 = r9 + r0
                r0 = r12[r1]
            L_0x0115:
                float r8 = r8 + r0
                goto L_0x008e
            L_0x0118:
                if (r0 == r15) goto L_0x0120
                if (r0 == r4) goto L_0x0120
                if (r0 == r5) goto L_0x0120
                if (r0 != r13) goto L_0x0126
            L_0x0120:
                float r9 = r9 * r22
                float r9 = r9 - r2
                float r8 = r8 * r22
                float r8 = r8 - r3
            L_0x0126:
                r0 = r12[r7]
                int r1 = r7 + 1
                r2 = r12[r1]
                r10.quadTo(r9, r8, r0, r2)
                r0 = r12[r7]
                r1 = r12[r1]
                r24 = r7
                r3 = r8
                r2 = r9
                r9 = r0
                r8 = r1
                goto L_0x02d2
            L_0x013b:
                if (r0 == r6) goto L_0x014b
                if (r0 == r14) goto L_0x014b
                r1 = 67
                if (r0 == r1) goto L_0x014b
                r1 = 83
                if (r0 != r1) goto L_0x0148
                goto L_0x014b
            L_0x0148:
                r2 = r8
                r1 = r9
                goto L_0x0152
            L_0x014b:
                float r9 = r9 * r22
                float r9 = r9 - r2
                float r8 = r8 * r22
                float r8 = r8 - r3
                goto L_0x0148
            L_0x0152:
                r3 = r12[r7]
                int r8 = r7 + 1
                r4 = r12[r8]
                int r9 = r7 + 2
                r5 = r12[r9]
                int r13 = r7 + 3
                r6 = r12[r13]
                r0 = r25
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r7]
                r1 = r12[r8]
                r9 = r12[r9]
                r8 = r12[r13]
                goto L_0x00eb
            L_0x016f:
                r9 = r12[r7]
                int r0 = r7 + 1
                r8 = r12[r0]
                if (r7 <= 0) goto L_0x017c
                r10.lineTo(r9, r8)
                goto L_0x008e
            L_0x017c:
                r10.moveTo(r9, r8)
                goto L_0x00ff
            L_0x0181:
                r0 = r12[r7]
                int r1 = r7 + 1
                r4 = r12[r1]
                r10.lineTo(r0, r4)
                r9 = r12[r7]
                r8 = r12[r1]
                goto L_0x008e
            L_0x0190:
                r0 = r12[r7]
                r1 = 0
                r10.rLineTo(r1, r0)
                r0 = r12[r7]
                goto L_0x0115
            L_0x019a:
                r0 = r12[r7]
                int r1 = r7 + 1
                r2 = r12[r1]
                int r3 = r7 + 2
                r4 = r12[r3]
                int r5 = r7 + 3
                r6 = r12[r5]
                r10.rQuadTo(r0, r2, r4, r6)
                r0 = r12[r7]
                float r0 = r0 + r9
                r1 = r12[r1]
                float r1 = r1 + r8
                r2 = r12[r3]
                float r9 = r9 + r2
                r2 = r12[r5]
                goto L_0x00ea
            L_0x01b8:
                r0 = r12[r7]
                r1 = 0
                r10.rLineTo(r0, r1)
                r0 = r12[r7]
                float r9 = r9 + r0
                goto L_0x008e
            L_0x01c3:
                r1 = r12[r7]
                int r0 = r7 + 1
                r2 = r12[r0]
                int r13 = r7 + 2
                r3 = r12[r13]
                int r14 = r7 + 3
                r4 = r12[r14]
                int r15 = r7 + 4
                r5 = r12[r15]
                int r22 = r7 + 5
                r6 = r12[r22]
                r0 = r25
                r0.rCubicTo(r1, r2, r3, r4, r5, r6)
                r0 = r12[r13]
                float r0 = r0 + r9
                r1 = r12[r14]
                float r1 = r1 + r8
                r2 = r12[r15]
                float r9 = r9 + r2
                r2 = r12[r22]
                goto L_0x00ea
            L_0x01eb:
                int r13 = r7 + 5
                r0 = r12[r13]
                float r3 = r0 + r9
                int r14 = r7 + 6
                r0 = r12[r14]
                float r4 = r0 + r8
                r5 = r12[r7]
                int r0 = r7 + 1
                r6 = r12[r0]
                int r0 = r7 + 2
                r15 = r12[r0]
                int r0 = r7 + 3
                r0 = r12[r0]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x020d
                r22 = 1
                goto L_0x020f
            L_0x020d:
                r22 = 0
            L_0x020f:
                int r0 = r7 + 4
                r0 = r12[r0]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x021a
                r23 = 1
                goto L_0x021c
            L_0x021a:
                r23 = 0
            L_0x021c:
                r0 = r25
                r1 = r9
                r2 = r8
                r24 = r7
                r7 = r15
                r15 = r8
                r8 = r22
                r11 = r9
                r9 = r23
                c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0 = r12[r13]
                float r9 = r11 + r0
                r0 = r12[r14]
                float r8 = r15 + r0
            L_0x0234:
                r3 = r8
                r2 = r9
                goto L_0x02d2
            L_0x0238:
                r24 = r7
                r11 = r9
                r0 = r12[r24]
                r10.lineTo(r11, r0)
                r8 = r12[r24]
                goto L_0x02d2
            L_0x0244:
                r24 = r7
                r0 = r12[r24]
                int r7 = r24 + 1
                r1 = r12[r7]
                int r2 = r24 + 2
                r3 = r12[r2]
                int r4 = r24 + 3
                r5 = r12[r4]
                r10.quadTo(r0, r1, r3, r5)
                r0 = r12[r24]
                r1 = r12[r7]
                r9 = r12[r2]
                r8 = r12[r4]
                r2 = r0
                r3 = r1
                goto L_0x02d2
            L_0x0263:
                r24 = r7
                r15 = r8
                r0 = r12[r24]
                r10.lineTo(r0, r15)
                r9 = r12[r24]
                goto L_0x02d2
            L_0x026f:
                r24 = r7
                r1 = r12[r24]
                int r7 = r24 + 1
                r2 = r12[r7]
                int r7 = r24 + 2
                r3 = r12[r7]
                int r8 = r24 + 3
                r4 = r12[r8]
                int r9 = r24 + 4
                r5 = r12[r9]
                int r11 = r24 + 5
                r6 = r12[r11]
                r0 = r25
                r0.cubicTo(r1, r2, r3, r4, r5, r6)
                r9 = r12[r9]
                r0 = r12[r11]
                r1 = r12[r7]
                r2 = r12[r8]
                r8 = r0
                r3 = r2
                r2 = r1
                goto L_0x02d2
            L_0x0298:
                r24 = r7
                r15 = r8
                r11 = r9
                int r13 = r24 + 5
                r3 = r12[r13]
                int r14 = r24 + 6
                r4 = r12[r14]
                r5 = r12[r24]
                int r7 = r24 + 1
                r6 = r12[r7]
                int r7 = r24 + 2
                r7 = r12[r7]
                int r0 = r24 + 3
                r0 = r12[r0]
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x02b9
                r8 = 1
                goto L_0x02ba
            L_0x02b9:
                r8 = 0
            L_0x02ba:
                int r0 = r24 + 4
                r0 = r12[r0]
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L_0x02c4
                r9 = 1
                goto L_0x02c5
            L_0x02c4:
                r9 = 0
            L_0x02c5:
                r0 = r25
                r1 = r11
                r2 = r15
                c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r9 = r12[r13]
                r8 = r12[r14]
                goto L_0x0234
            L_0x02d2:
                int r7 = r24 + r19
                r0 = r28
                r11 = r0
                r13 = 0
                r14 = 1
                r15 = 2
                goto L_0x0041
            L_0x02dc:
                r15 = r8
                r11 = r9
                r0 = r13
                r26[r0] = r11
                r0 = 1
                r26[r0] = r15
                r0 = 2
                r26[r0] = r2
                r26[r16] = r3
                r26[r17] = r20
                r26[r18] = r21
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.h.b.a(android.graphics.Path, float[], char, char, float[]):void");
        }

        private static void b(Path path, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
            double d19 = d12;
            int ceil = (int) Math.ceil(Math.abs((d18 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d16);
            double sin = Math.sin(d16);
            double cos2 = Math.cos(d17);
            double sin2 = Math.sin(d17);
            double d20 = -d19;
            double d21 = d20 * cos;
            double d22 = d13 * sin;
            double d23 = (d21 * sin2) - (d22 * cos2);
            double d24 = d20 * sin;
            double d25 = d13 * cos;
            double d26 = (sin2 * d24) + (cos2 * d25);
            double d27 = d18 / ((double) ceil);
            double d28 = d26;
            double d29 = d23;
            int i10 = 0;
            double d30 = d14;
            double d31 = d15;
            double d32 = d17;
            while (i10 < ceil) {
                double d33 = d32 + d27;
                double sin3 = Math.sin(d33);
                double cos3 = Math.cos(d33);
                double d34 = (d10 + ((d19 * cos) * cos3)) - (d22 * sin3);
                double d35 = d11 + (d19 * sin * cos3) + (d25 * sin3);
                double d36 = (d21 * sin3) - (d22 * cos3);
                double d37 = (sin3 * d24) + (cos3 * d25);
                double d38 = d33 - d32;
                double tan = Math.tan(d38 / 2.0d);
                double sin4 = (Math.sin(d38) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d39 = d30 + (d29 * sin4);
                double d40 = sin;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d39, (float) (d31 + (d28 * sin4)), (float) (d34 - (sin4 * d36)), (float) (d35 - (sin4 * d37)), (float) d34, (float) d35);
                i10++;
                d27 = d27;
                sin = d40;
                d30 = d34;
                d24 = d24;
                cos = cos;
                d32 = d33;
                d28 = d37;
                d29 = d36;
                ceil = ceil;
                d31 = d35;
                d19 = d12;
            }
        }

        private static void c(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            float f17 = f10;
            float f18 = f12;
            float f19 = f14;
            boolean z12 = z11;
            double radians = Math.toRadians((double) f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d12 = (double) f17;
            double d13 = d12 * cos;
            double d14 = d12;
            double d15 = (double) f11;
            double d16 = (double) f19;
            double d17 = (d13 + (d15 * sin)) / d16;
            double d18 = (((double) (-f17)) * sin) + (d15 * cos);
            double d19 = d15;
            double d20 = (double) f15;
            double d21 = d18 / d20;
            double d22 = (double) f13;
            double d23 = ((((double) f18) * cos) + (d22 * sin)) / d16;
            double d24 = d16;
            double d25 = ((((double) (-f18)) * sin) + (d22 * cos)) / d20;
            double d26 = d17 - d23;
            double d27 = d21 - d25;
            double d28 = (d17 + d23) / 2.0d;
            double d29 = (d21 + d25) / 2.0d;
            double d30 = sin;
            double d31 = (d26 * d26) + (d27 * d27);
            if (d31 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d32 = (1.0d / d31) - 0.25d;
            if (d32 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d31);
                float sqrt = (float) (Math.sqrt(d31) / 1.99999d);
                c(path, f10, f11, f12, f13, f19 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d32);
            double d33 = d26 * sqrt2;
            double d34 = sqrt2 * d27;
            boolean z13 = z11;
            if (z10 == z13) {
                d11 = d28 - d34;
                d10 = d29 + d33;
            } else {
                d11 = d28 + d34;
                d10 = d29 - d33;
            }
            double atan2 = Math.atan2(d21 - d10, d17 - d11);
            double atan22 = Math.atan2(d25 - d10, d23 - d11) - atan2;
            int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z13 != (i10 >= 0)) {
                atan22 = i10 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d35 = d11 * d24;
            double d36 = d10 * d20;
            b(path, (d35 * cos) - (d36 * d30), (d35 * d30) + (d36 * cos), d24, d20, d14, d19, radians, atan2, atan22);
        }

        public static void d(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c10 = 'm';
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                b bVar = bVarArr[i10];
                a(path, fArr, c10, bVar.f2380a, bVar.f2381b);
                c10 = bVarArr[i10].f2380a;
            }
        }

        b(b bVar) {
            this.f2380a = bVar.f2380a;
            float[] fArr = bVar.f2381b;
            this.f2381b = h.c(fArr, 0, fArr.length);
        }
    }

    private static void a(ArrayList arrayList, char c10, float[] fArr) {
        arrayList.add(new b(c10, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            b bVar = bVarArr[i10];
            char c10 = bVar.f2380a;
            b bVar2 = bVarArr2[i10];
            if (c10 != bVar2.f2380a || bVar.f2381b.length != bVar2.f2381b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] c(float[] fArr, int i10, int i11) {
        if (i10 <= i11) {
            int length = fArr.length;
            if (i10 < 0 || i10 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = i11 - i10;
            int min = Math.min(i12, length - i10);
            float[] fArr2 = new float[i12];
            System.arraycopy(fArr, i10, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 1;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i(str, i10);
            String trim = str.substring(i11, i12).trim();
            if (trim.length() > 0) {
                a(arrayList, trim.charAt(0), h(trim));
            }
            i11 = i12;
            i10 = i12 + 1;
        }
        if (i10 - i11 == 1 && i11 < str.length()) {
            a(arrayList, str.charAt(i11), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] d10 = d(str);
        if (d10 == null) {
            return null;
        }
        try {
            b.d(d10, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing " + str, e10);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = new b(bVarArr[i10]);
        }
        return bVarArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r10.f2379b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r2 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[LOOP:0: B:1:0x0007->B:19:0x0037, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void g(java.lang.String r8, int r9, androidx.core.graphics.h.a r10) {
        /*
            r0 = 0
            r10.f2379b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003a
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0029
            r6 = 69
            if (r5 == r6) goto L_0x0033
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0033
            switch(r5) {
                case 44: goto L_0x0029;
                case 45: goto L_0x002c;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0031
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = r0
            r3 = r7
            goto L_0x0034
        L_0x0027:
            r10.f2379b = r7
        L_0x0029:
            r2 = r0
            r4 = r7
            goto L_0x0034
        L_0x002c:
            if (r1 == r9) goto L_0x0031
            if (r2 != 0) goto L_0x0031
            goto L_0x0027
        L_0x0031:
            r2 = r0
            goto L_0x0034
        L_0x0033:
            r2 = r7
        L_0x0034:
            if (r4 == 0) goto L_0x0037
            goto L_0x003a
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003a:
            r10.f2378a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.h.g(java.lang.String, int, androidx.core.graphics.h$a):void");
    }

    private static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i10 = 1;
            int i11 = 0;
            while (i10 < length) {
                g(str, i10, aVar);
                int i12 = aVar.f2378a;
                if (i10 < i12) {
                    fArr[i11] = Float.parseFloat(str.substring(i10, i12));
                    i11++;
                }
                i10 = aVar.f2379b ? i12 : i12 + 1;
            }
            return c(fArr, 0, i11);
        } catch (NumberFormatException e10) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e10);
        }
    }

    private static int i(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i10;
            }
            i10++;
        }
        return i10;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i10 = 0; i10 < bVarArr2.length; i10++) {
            bVarArr[i10].f2380a = bVarArr2[i10].f2380a;
            int i11 = 0;
            while (true) {
                float[] fArr = bVarArr2[i10].f2381b;
                if (i11 >= fArr.length) {
                    break;
                }
                bVarArr[i10].f2381b[i11] = fArr[i11];
                i11++;
            }
        }
    }
}
