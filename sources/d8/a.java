package d8;

public abstract class a {
    public static final String a(int i10) {
        return b(i10);
    }

    public static final String b(int i10) {
        int i11 = 0;
        int i12 = 1;
        if (i10 >= 1) {
            int i13 = i10 - 1;
            int i14 = 26;
            while (true) {
                int i15 = i14 + i11;
                if (i13 < i15) {
                    break;
                }
                i12++;
                i14 *= 26;
                i11 = i15;
            }
            int i16 = i13 - i11;
            char[] cArr = new char[i12];
            while (i12 > 0) {
                i12--;
                cArr[i12] = (char) ((i16 % 26) + 97);
                i16 /= 26;
            }
            return new String(cArr);
        }
        throw new NumberFormatException(b8.a.b("you.can.t.translate.a.negative.number.into.an.alphabetical.value", new Object[0]));
    }

    public static final String c(int i10, boolean z10) {
        return z10 ? a(i10) : d(i10);
    }

    public static final String d(int i10) {
        return b(i10).toUpperCase();
    }
}
