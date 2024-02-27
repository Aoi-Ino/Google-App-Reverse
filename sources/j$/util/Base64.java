package j$.util;

import j$.sun.nio.cs.ISO_8859_1;
import java.util.Arrays;

public class Base64 {

    public static class Decoder {
        static final Decoder RFC2045 = new Decoder(false, true);
        static final Decoder RFC4648 = new Decoder(false, false);
        static final Decoder RFC4648_URLSAFE = new Decoder(true, false);
        private static final int[] fromBase64;
        private static final int[] fromBase64URL;
        private final boolean isMIME;
        private final boolean isURL;

        static {
            int[] iArr = new int[256];
            fromBase64 = iArr;
            Arrays.fill(iArr, -1);
            for (int i10 = 0; i10 < Encoder.toBase64.length; i10++) {
                fromBase64[Encoder.toBase64[i10]] = i10;
            }
            fromBase64[61] = -2;
            int[] iArr2 = new int[256];
            fromBase64URL = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i11 = 0; i11 < Encoder.toBase64URL.length; i11++) {
                fromBase64URL[Encoder.toBase64URL[i11]] = i11;
            }
            fromBase64URL[61] = -2;
        }

        private Decoder(boolean z10, boolean z11) {
            this.isURL = z10;
            this.isMIME = z11;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
            if (r19[r11] == 61) goto L_0x008e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
            if (r6 != 18) goto L_0x00dc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int decode0(byte[] r19, int r20, int r21, byte[] r22) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                boolean r2 = r0.isURL
                if (r2 == 0) goto L_0x000b
                int[] r2 = fromBase64URL
                goto L_0x000d
            L_0x000b:
                int[] r2 = fromBase64
            L_0x000d:
                r3 = 0
                r4 = 18
                r5 = r20
                r7 = r3
                r8 = r7
                r6 = r4
            L_0x0015:
                r9 = 6
                r10 = 16
                if (r5 >= r1) goto L_0x00dc
                if (r6 != r4) goto L_0x0073
                int r11 = r5 + 4
                if (r11 >= r1) goto L_0x0073
                int r11 = r1 - r5
                r11 = r11 & -4
                int r11 = r11 + r5
            L_0x0025:
                if (r5 >= r11) goto L_0x006f
                int r12 = r5 + 1
                byte r13 = r19[r5]
                r13 = r13 & 255(0xff, float:3.57E-43)
                r13 = r2[r13]
                int r14 = r5 + 2
                byte r12 = r19[r12]
                r12 = r12 & 255(0xff, float:3.57E-43)
                r12 = r2[r12]
                int r15 = r5 + 3
                byte r14 = r19[r14]
                r14 = r14 & 255(0xff, float:3.57E-43)
                r14 = r2[r14]
                int r16 = r5 + 4
                byte r15 = r19[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r2[r15]
                r17 = r13 | r12
                r17 = r17 | r14
                r17 = r17 | r15
                if (r17 >= 0) goto L_0x0050
                goto L_0x006f
            L_0x0050:
                int r5 = r13 << 18
                int r12 = r12 << 12
                r5 = r5 | r12
                int r12 = r14 << 6
                r5 = r5 | r12
                r5 = r5 | r15
                int r12 = r7 + 1
                int r13 = r5 >> 16
                byte r13 = (byte) r13
                r22[r7] = r13
                int r13 = r7 + 2
                int r14 = r5 >> 8
                byte r14 = (byte) r14
                r22[r12] = r14
                int r7 = r7 + 3
                byte r5 = (byte) r5
                r22[r13] = r5
                r5 = r16
                goto L_0x0025
            L_0x006f:
                if (r5 < r1) goto L_0x0073
                goto L_0x00dc
            L_0x0073:
                int r11 = r5 + 1
                byte r12 = r19[r5]
                r12 = r12 & 255(0xff, float:3.57E-43)
                r12 = r2[r12]
                if (r12 >= 0) goto L_0x00bd
                r13 = -2
                if (r12 != r13) goto L_0x0099
                if (r6 != r9) goto L_0x008d
                if (r11 == r1) goto L_0x0091
                int r5 = r5 + 2
                byte r3 = r19[r11]
                r11 = 61
                if (r3 != r11) goto L_0x0091
                goto L_0x008e
            L_0x008d:
                r5 = r11
            L_0x008e:
                if (r6 == r4) goto L_0x0091
                goto L_0x00dc
            L_0x0091:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Input byte array has wrong 4-byte ending unit"
                r1.<init>(r2)
                throw r1
            L_0x0099:
                boolean r9 = r0.isMIME
                if (r9 == 0) goto L_0x00a0
            L_0x009d:
                r5 = r11
                goto L_0x0015
            L_0x00a0:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                byte r2 = r19[r5]
                java.lang.String r2 = java.lang.Integer.toString(r2, r10)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Illegal base64 character "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L_0x00bd:
                int r5 = r12 << r6
                r5 = r5 | r8
                int r6 = r6 + -6
                if (r6 >= 0) goto L_0x00da
                int r6 = r7 + 1
                int r8 = r5 >> 16
                byte r8 = (byte) r8
                r22[r7] = r8
                int r8 = r7 + 2
                int r9 = r5 >> 8
                byte r9 = (byte) r9
                r22[r6] = r9
                int r7 = r7 + 3
                byte r5 = (byte) r5
                r22[r8] = r5
                r8 = r3
                r6 = r4
                goto L_0x009d
            L_0x00da:
                r8 = r5
                goto L_0x009d
            L_0x00dc:
                if (r6 != r9) goto L_0x00e7
                int r3 = r7 + 1
                int r4 = r8 >> 16
                byte r4 = (byte) r4
                r22[r7] = r4
                r7 = r3
                goto L_0x00fc
            L_0x00e7:
                if (r6 != 0) goto L_0x00f8
                int r3 = r7 + 1
                int r4 = r8 >> 16
                byte r4 = (byte) r4
                r22[r7] = r4
                int r7 = r7 + 2
                int r4 = r8 >> 8
                byte r4 = (byte) r4
                r22[r3] = r4
                goto L_0x00fc
            L_0x00f8:
                r3 = 12
                if (r6 == r3) goto L_0x0126
            L_0x00fc:
                if (r5 >= r1) goto L_0x0125
                boolean r3 = r0.isMIME
                if (r3 == 0) goto L_0x010e
                int r3 = r5 + 1
                byte r4 = r19[r5]
                r4 = r4 & 255(0xff, float:3.57E-43)
                r4 = r2[r4]
                r5 = r3
                if (r4 >= 0) goto L_0x010e
                goto L_0x00fc
            L_0x010e:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Input byte array has incorrect ending byte at "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0125:
                return r7
            L_0x0126:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Last unit does not have enough valid bits"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.Base64.Decoder.decode0(byte[], int, int, byte[]):int");
        }

        private int outLength(byte[] bArr, int i10, int i11) {
            int i12;
            int[] iArr = this.isURL ? fromBase64URL : fromBase64;
            int i13 = i11 - i10;
            int i14 = 0;
            if (i13 == 0) {
                return 0;
            }
            if (i13 >= 2) {
                if (this.isMIME) {
                    int i15 = 0;
                    while (true) {
                        if (i10 >= i11) {
                            break;
                        }
                        int i16 = i10 + 1;
                        byte b10 = bArr[i10] & 255;
                        if (b10 == 61) {
                            i13 -= (i11 - i16) + 1;
                            break;
                        }
                        if (iArr[b10] == -1) {
                            i15++;
                        }
                        i10 = i16;
                    }
                    i13 -= i15;
                } else if (bArr[i11 - 1] == 61) {
                    i14 = bArr[i11 - 2] == 61 ? 2 : 1;
                }
                if (i14 == 0 && (i12 = i13 & 3) != 0) {
                    i14 = 4 - i12;
                }
                return (((i13 + 3) / 4) * 3) - i14;
            } else if (this.isMIME && iArr[0] == -1) {
                return 0;
            } else {
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
        }

        public byte[] decode(String str) {
            return decode(str.getBytes(ISO_8859_1.INSTANCE));
        }

        public byte[] decode(byte[] bArr) {
            int outLength = outLength(bArr, 0, bArr.length);
            byte[] bArr2 = new byte[outLength];
            int decode0 = decode0(bArr, 0, bArr.length, bArr2);
            return decode0 != outLength ? Arrays.copyOf(bArr2, decode0) : bArr2;
        }
    }

    public static class Encoder {
        private static final byte[] CRLF;
        static final Encoder RFC2045;
        static final Encoder RFC4648 = new Encoder(false, (byte[]) null, -1, true);
        static final Encoder RFC4648_URLSAFE = new Encoder(true, (byte[]) null, -1, true);
        /* access modifiers changed from: private */
        public static final char[] toBase64 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        /* access modifiers changed from: private */
        public static final char[] toBase64URL = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        private final boolean doPadding;
        private final boolean isURL;
        private final int linemax;
        private final byte[] newline;

        static {
            byte[] bArr = {13, 10};
            CRLF = bArr;
            RFC2045 = new Encoder(false, bArr, 76, true);
        }

        private Encoder(boolean z10, byte[] bArr, int i10, boolean z11) {
            this.isURL = z10;
            this.newline = bArr;
            this.linemax = i10;
            this.doPadding = z11;
        }

        private int encode0(byte[] bArr, int i10, int i11, byte[] bArr2) {
            int i12 = i11;
            char[] cArr = this.isURL ? toBase64URL : toBase64;
            int i13 = ((i12 - i10) / 3) * 3;
            int i14 = i10 + i13;
            int i15 = this.linemax;
            if (i15 > 0 && i13 > (i15 / 4) * 3) {
                i13 = (i15 / 4) * 3;
            }
            int i16 = i13;
            int i17 = i10;
            int i18 = 0;
            while (i17 < i14) {
                int min = Math.min(i17 + i16, i14);
                encodeBlock(bArr, i17, min, bArr2, i18, this.isURL);
                int i19 = ((min - i17) / 3) * 4;
                i18 += i19;
                if (i19 == this.linemax && min < i12) {
                    byte[] bArr3 = this.newline;
                    int length = bArr3.length;
                    int i20 = 0;
                    while (i20 < length) {
                        bArr2[i18] = bArr3[i20];
                        i20++;
                        i18++;
                    }
                }
                i17 = min;
            }
            if (i17 >= i12) {
                return i18;
            }
            int i21 = i17 + 1;
            byte b10 = bArr[i17] & 255;
            int i22 = i18 + 1;
            bArr2[i18] = (byte) cArr[b10 >> 2];
            if (i21 == i12) {
                int i23 = i18 + 2;
                bArr2[i22] = (byte) cArr[(b10 << 4) & 63];
                if (!this.doPadding) {
                    return i23;
                }
                int i24 = i18 + 3;
                bArr2[i23] = 61;
                int i25 = i18 + 4;
                bArr2[i24] = 61;
                return i25;
            }
            byte b11 = bArr[i21] & 255;
            bArr2[i22] = (byte) cArr[((b10 << 4) & 63) | (b11 >> 4)];
            int i26 = i18 + 3;
            bArr2[i18 + 2] = (byte) cArr[(b11 << 2) & 63];
            if (!this.doPadding) {
                return i26;
            }
            int i27 = i18 + 4;
            bArr2[i26] = 61;
            return i27;
        }

        private void encodeBlock(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, boolean z10) {
            char[] cArr = z10 ? toBase64URL : toBase64;
            while (i10 < i11) {
                int i13 = i10 + 2;
                int i14 = (bArr[i10 + 1] & 255) << 8;
                i10 += 3;
                byte b10 = i14 | ((bArr[i10] & 255) << 16) | (bArr[i13] & 255);
                bArr2[i12] = (byte) cArr[(b10 >>> 18) & 63];
                bArr2[i12 + 1] = (byte) cArr[(b10 >>> 12) & 63];
                int i15 = i12 + 3;
                bArr2[i12 + 2] = (byte) cArr[(b10 >>> 6) & 63];
                i12 += 4;
                bArr2[i15] = (byte) cArr[b10 & 63];
            }
        }

        private final int outLength(int i10) {
            int i11;
            if (this.doPadding) {
                i11 = ((i10 + 2) / 3) * 4;
            } else {
                int i12 = i10 % 3;
                i11 = ((i10 / 3) * 4) + (i12 == 0 ? 0 : i12 + 1);
            }
            int i13 = this.linemax;
            return i13 > 0 ? i11 + (((i11 - 1) / i13) * this.newline.length) : i11;
        }

        public byte[] encode(byte[] bArr) {
            int outLength = outLength(bArr.length);
            byte[] bArr2 = new byte[outLength];
            int encode0 = encode0(bArr, 0, bArr.length, bArr2);
            return encode0 != outLength ? Arrays.copyOf(bArr2, encode0) : bArr2;
        }

        public String encodeToString(byte[] bArr) {
            byte[] encode = encode(bArr);
            return new String(encode, 0, 0, encode.length);
        }
    }

    public static Decoder getDecoder() {
        return Decoder.RFC4648;
    }

    public static Encoder getEncoder() {
        return Encoder.RFC4648;
    }
}
