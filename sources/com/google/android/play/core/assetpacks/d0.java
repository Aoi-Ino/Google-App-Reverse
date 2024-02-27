package com.google.android.play.core.assetpacks;

public abstract class d0 {
    public static boolean a(int i10) {
        return i10 == 1 || i10 == 7 || i10 == 2 || i10 == 3;
    }

    public static boolean b(int i10) {
        return i10 == 2 || i10 == 7 || i10 == 3;
    }

    static boolean c(int i10, int i11) {
        if (i10 == 5) {
            if (i11 != 5) {
                return true;
            }
            i10 = 5;
        }
        if (i10 == 6) {
            if (i11 != 6 && i11 != 5) {
                return true;
            }
            i10 = 6;
        }
        if (i10 == 4 && i11 != 4) {
            return true;
        }
        if (i10 == 3 && (i11 == 2 || i11 == 7 || i11 == 1 || i11 == 8)) {
            return true;
        }
        if (i10 == 2) {
            return i11 == 1 || i11 == 8;
        }
        return false;
    }

    public static boolean d(int i10) {
        return i10 == 5 || i10 == 6 || i10 == 4;
    }
}
