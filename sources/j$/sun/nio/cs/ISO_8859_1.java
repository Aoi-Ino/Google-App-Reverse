package j$.sun.nio.cs;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

public class ISO_8859_1 extends Charset {
    public static final ISO_8859_1 INSTANCE = new ISO_8859_1();

    private static class Decoder extends CharsetDecoder {
        private Decoder(Charset charset) {
            super(charset, 1.0f, 1.0f);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r0 = java.nio.charset.CoderResult.UNDERFLOW;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.nio.charset.CoderResult decodeArrayLoop(java.nio.ByteBuffer r9, java.nio.CharBuffer r10) {
            /*
                r8 = this;
                byte[] r0 = r9.array()
                int r1 = r9.arrayOffset()
                int r2 = r9.position()
                int r1 = r1 + r2
                int r2 = r9.arrayOffset()
                int r3 = r9.limit()
                int r2 = r2 + r3
                if (r1 > r2) goto L_0x0019
                goto L_0x001a
            L_0x0019:
                r1 = r2
            L_0x001a:
                char[] r3 = r10.array()
                int r4 = r10.arrayOffset()
                int r5 = r10.position()
                int r4 = r4 + r5
                int r5 = r10.arrayOffset()
                int r6 = r10.limit()
                int r5 = r5 + r6
                if (r4 > r5) goto L_0x0033
                goto L_0x0034
            L_0x0033:
                r4 = r5
            L_0x0034:
                if (r1 >= r2) goto L_0x0063
                byte r6 = r0[r1]     // Catch:{ all -> 0x0053 }
                if (r4 < r5) goto L_0x0055
                java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.OVERFLOW     // Catch:{ all -> 0x0053 }
            L_0x003c:
                int r2 = r9.arrayOffset()
                int r1 = r1 - r2
                java.nio.Buffer r9 = r9.position(r1)
                java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
                int r9 = r10.arrayOffset()
                int r4 = r4 - r9
                java.nio.Buffer r9 = r10.position(r4)
                java.nio.CharBuffer r9 = (java.nio.CharBuffer) r9
                return r0
            L_0x0053:
                r0 = move-exception
                goto L_0x0066
            L_0x0055:
                int r7 = r4 + 1
                r6 = r6 & 255(0xff, float:3.57E-43)
                char r6 = (char) r6
                r3[r4] = r6     // Catch:{ all -> 0x0060 }
                int r1 = r1 + 1
                r4 = r7
                goto L_0x0034
            L_0x0060:
                r0 = move-exception
                r4 = r7
                goto L_0x0066
            L_0x0063:
                java.nio.charset.CoderResult r0 = java.nio.charset.CoderResult.UNDERFLOW     // Catch:{ all -> 0x0053 }
                goto L_0x003c
            L_0x0066:
                int r2 = r9.arrayOffset()
                int r1 = r1 - r2
                java.nio.Buffer r9 = r9.position(r1)
                java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
                int r9 = r10.arrayOffset()
                int r4 = r4 - r9
                java.nio.Buffer r9 = r10.position(r4)
                java.nio.CharBuffer r9 = (java.nio.CharBuffer) r9
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.ISO_8859_1.Decoder.decodeArrayLoop(java.nio.ByteBuffer, java.nio.CharBuffer):java.nio.charset.CoderResult");
        }

        private CoderResult decodeBufferLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            CoderResult coderResult;
            int position = byteBuffer.position();
            while (true) {
                try {
                    if (!byteBuffer.hasRemaining()) {
                        coderResult = CoderResult.UNDERFLOW;
                        break;
                    }
                    byte b10 = byteBuffer.get();
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    }
                    charBuffer.put((char) (b10 & 255));
                    position++;
                } finally {
                    ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position);
                }
            }
            return coderResult;
        }

        /* access modifiers changed from: protected */
        public CoderResult decodeLoop(ByteBuffer byteBuffer, CharBuffer charBuffer) {
            return (!byteBuffer.hasArray() || !charBuffer.hasArray()) ? decodeBufferLoop(byteBuffer, charBuffer) : decodeArrayLoop(byteBuffer, charBuffer);
        }
    }

    private static class Encoder extends CharsetEncoder {
        private final Surrogate$Parser sgp;

        private Encoder(Charset charset) {
            super(charset, 1.0f, 1.0f);
            this.sgp = new Surrogate$Parser();
        }

        private CoderResult encodeArrayLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            char[] array = charBuffer.array();
            int arrayOffset = charBuffer.arrayOffset();
            int position = charBuffer.position() + arrayOffset;
            int limit = charBuffer.limit() + arrayOffset;
            if (position > limit) {
                position = limit;
            }
            byte[] array2 = byteBuffer.array();
            int arrayOffset2 = byteBuffer.arrayOffset();
            int position2 = byteBuffer.position() + arrayOffset2;
            int limit2 = byteBuffer.limit() + arrayOffset2;
            if (position2 > limit2) {
                position2 = limit2;
            }
            int i10 = limit2 - position2;
            int i11 = limit - position;
            if (i10 >= i11) {
                i10 = i11;
            }
            try {
                int encodeISOArray = encodeISOArray(array, position, array2, position2, i10);
                position += encodeISOArray;
                position2 += encodeISOArray;
                return encodeISOArray != i10 ? this.sgp.parse(array[position], array, position, limit) < 0 ? this.sgp.error() : this.sgp.unmappableResult() : i10 < i11 ? CoderResult.OVERFLOW : CoderResult.UNDERFLOW;
            } finally {
                CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position - arrayOffset);
                ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.position(position2 - arrayOffset2);
            }
        }

        private CoderResult encodeBufferLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            CoderResult coderResult;
            int position = charBuffer.position();
            while (true) {
                try {
                    if (!charBuffer.hasRemaining()) {
                        coderResult = CoderResult.UNDERFLOW;
                        break;
                    }
                    char c10 = charBuffer.get();
                    if (c10 > 255) {
                        coderResult = this.sgp.parse(c10, charBuffer) < 0 ? this.sgp.error() : this.sgp.unmappableResult();
                    } else if (!byteBuffer.hasRemaining()) {
                        coderResult = CoderResult.OVERFLOW;
                        break;
                    } else {
                        byteBuffer.put((byte) c10);
                        position++;
                    }
                } finally {
                    CharBuffer charBuffer2 = (CharBuffer) charBuffer.position(position);
                }
            }
            return coderResult;
        }

        private static int encodeISOArray(char[] cArr, int i10, byte[] bArr, int i11, int i12) {
            if (i12 <= 0) {
                return 0;
            }
            encodeISOArrayCheck(cArr, i10, bArr, i11, i12);
            return implEncodeISOArray(cArr, i10, bArr, i11, i12);
        }

        private static void encodeISOArrayCheck(char[] cArr, int i10, byte[] bArr, int i11, int i12) {
            Objects.requireNonNull(cArr);
            Objects.requireNonNull(bArr);
            if (i10 < 0 || i10 >= cArr.length) {
                throw new ArrayIndexOutOfBoundsException(i10);
            } else if (i11 < 0 || i11 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i11);
            } else {
                int i13 = (i10 + i12) - 1;
                if (i13 < 0 || i13 >= cArr.length) {
                    throw new ArrayIndexOutOfBoundsException(i13);
                }
                int i14 = (i11 + i12) - 1;
                if (i14 < 0 || i14 >= bArr.length) {
                    throw new ArrayIndexOutOfBoundsException(i14);
                }
            }
        }

        private static int implEncodeISOArray(char[] cArr, int i10, byte[] bArr, int i11, int i12) {
            int i13 = 0;
            while (i13 < i12) {
                int i14 = i10 + 1;
                char c10 = cArr[i10];
                if (c10 > 255) {
                    break;
                }
                bArr[i11] = (byte) c10;
                i13++;
                i10 = i14;
                i11++;
            }
            return i13;
        }

        public boolean canEncode(char c10) {
            return c10 <= 255;
        }

        /* access modifiers changed from: protected */
        public CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
            return (!charBuffer.hasArray() || !byteBuffer.hasArray()) ? encodeBufferLoop(charBuffer, byteBuffer) : encodeArrayLoop(charBuffer, byteBuffer);
        }

        public boolean isLegalReplacement(byte[] bArr) {
            return true;
        }
    }

    public ISO_8859_1() {
        super("ISO-8859-1", StandardCharsets.aliases_ISO_8859_1());
    }

    public boolean contains(Charset charset) {
        return charset instanceof ISO_8859_1;
    }

    public CharsetDecoder newDecoder() {
        return new Decoder(this);
    }

    public CharsetEncoder newEncoder() {
        return new Encoder(this);
    }
}
