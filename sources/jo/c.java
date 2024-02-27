package jo;

public abstract class c {
    public static String a(int i10) {
        if (i10 == 5) {
            return "qTESLA-p-I";
        }
        if (i10 == 6) {
            return "qTESLA-p-III";
        }
        throw new IllegalArgumentException("unknown security category: " + i10);
    }

    static int b(int i10) {
        if (i10 == 5) {
            return 5224;
        }
        if (i10 == 6) {
            return 12392;
        }
        throw new IllegalArgumentException("unknown security category: " + i10);
    }

    static int c(int i10) {
        if (i10 == 5) {
            return 14880;
        }
        if (i10 == 6) {
            return 38432;
        }
        throw new IllegalArgumentException("unknown security category: " + i10);
    }
}
