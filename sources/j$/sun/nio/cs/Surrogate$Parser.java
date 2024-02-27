package j$.sun.nio.cs;

import java.nio.charset.CoderResult;

public class Surrogate$Parser {
    private int character;
    private CoderResult error = CoderResult.UNDERFLOW;
    private boolean isPair;

    public CoderResult error() {
        return this.error;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int parse(char r5, java.nio.CharBuffer r6) {
        /*
            r4 = this;
            boolean r0 = java.lang.Character.isHighSurrogate(r5)
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 == 0) goto L_0x002e
            boolean r0 = r6.hasRemaining()
            if (r0 != 0) goto L_0x0014
            java.nio.charset.CoderResult r5 = java.nio.charset.CoderResult.UNDERFLOW
        L_0x0011:
            r4.error = r5
            return r3
        L_0x0014:
            char r6 = r6.get()
            boolean r0 = java.lang.Character.isLowSurrogate(r6)
            if (r0 == 0) goto L_0x0029
            int r5 = java.lang.Character.toCodePoint(r5, r6)
            r4.character = r5
            r4.isPair = r2
        L_0x0026:
            r4.error = r1
            return r5
        L_0x0029:
            java.nio.charset.CoderResult r5 = java.nio.charset.CoderResult.malformedForLength(r2)
            goto L_0x0011
        L_0x002e:
            boolean r6 = java.lang.Character.isLowSurrogate(r5)
            if (r6 == 0) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            r4.character = r5
            r6 = 0
            r4.isPair = r6
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.Surrogate$Parser.parse(char, java.nio.CharBuffer):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int parse(char r5, char[] r6, int r7, int r8) {
        /*
            r4 = this;
            boolean r0 = java.lang.Character.isHighSurrogate(r5)
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L_0x002b
            int r8 = r8 - r7
            r0 = 2
            if (r8 >= r0) goto L_0x0012
            java.nio.charset.CoderResult r5 = java.nio.charset.CoderResult.UNDERFLOW
        L_0x000f:
            r4.error = r5
            return r2
        L_0x0012:
            int r7 = r7 + r3
            char r6 = r6[r7]
            boolean r7 = java.lang.Character.isLowSurrogate(r6)
            if (r7 == 0) goto L_0x0026
            int r5 = java.lang.Character.toCodePoint(r5, r6)
            r4.character = r5
            r4.isPair = r3
        L_0x0023:
            r4.error = r1
            return r5
        L_0x0026:
            java.nio.charset.CoderResult r5 = java.nio.charset.CoderResult.malformedForLength(r3)
            goto L_0x000f
        L_0x002b:
            boolean r6 = java.lang.Character.isLowSurrogate(r5)
            if (r6 == 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            r4.character = r5
            r6 = 0
            r4.isPair = r6
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.sun.nio.cs.Surrogate$Parser.parse(char, char[], int, int):int");
    }

    public CoderResult unmappableResult() {
        return CoderResult.unmappableForLength(this.isPair ? 2 : 1);
    }
}
