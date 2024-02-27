package s2;

public abstract class c {
    public static int a(float f10) {
        return ((int) (((double) f10) + 16384.999999999996d)) - 16384;
    }

    public static int b(float f10) {
        return ((int) (((double) f10) + 16384.0d)) - 16384;
    }

    public static float c(float f10, float f11, float f12) {
        if (f10 <= f11) {
            return f11;
        }
        return f10 >= f12 ? f12 : f10;
    }

    public static float d(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static int e(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static int f(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }
}
