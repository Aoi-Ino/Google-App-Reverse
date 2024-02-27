package t3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public abstract class b {

    public static class a extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.String r3, android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t3.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int i10) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + t10);
        return readBundle;
    }

    public static int[] b(Parcel parcel, int i10) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + t10);
        return createIntArray;
    }

    public static Parcelable c(Parcel parcel, int i10, Parcelable.Creator creator) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + t10);
        return parcelable;
    }

    public static String d(Parcel parcel, int i10) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + t10);
        return readString;
    }

    public static ArrayList e(Parcel parcel, int i10) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + t10);
        return createStringArrayList;
    }

    public static Object[] f(Parcel parcel, int i10, Parcelable.Creator creator) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + t10);
        return createTypedArray;
    }

    public static ArrayList g(Parcel parcel, int i10, Parcelable.Creator creator) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + t10);
        return createTypedArrayList;
    }

    public static void h(Parcel parcel, int i10) {
        if (parcel.dataPosition() != i10) {
            throw new a("Overread allowed size end=" + i10, parcel);
        }
    }

    public static int i(int i10) {
        return (char) i10;
    }

    public static boolean j(Parcel parcel, int i10) {
        x(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static byte k(Parcel parcel, int i10) {
        x(parcel, i10, 4);
        return (byte) parcel.readInt();
    }

    public static double l(Parcel parcel, int i10) {
        x(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static float m(Parcel parcel, int i10) {
        x(parcel, i10, 4);
        return parcel.readFloat();
    }

    public static Float n(Parcel parcel, int i10) {
        int t10 = t(parcel, i10);
        if (t10 == 0) {
            return null;
        }
        w(parcel, i10, t10, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int o(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder p(Parcel parcel, int i10) {
        int t10 = t(parcel, i10);
        int dataPosition = parcel.dataPosition();
        if (t10 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + t10);
        return readStrongBinder;
    }

    public static int q(Parcel parcel, int i10) {
        x(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer r(Parcel parcel, int i10) {
        int t10 = t(parcel, i10);
        if (t10 == 0) {
            return null;
        }
        w(parcel, i10, t10, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long s(Parcel parcel, int i10) {
        x(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int t(Parcel parcel, int i10) {
        return (i10 & -65536) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void u(Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + t(parcel, i10));
    }

    public static int v(Parcel parcel) {
        int o10 = o(parcel);
        int t10 = t(parcel, o10);
        int dataPosition = parcel.dataPosition();
        if (i(o10) == 20293) {
            int i10 = t10 + dataPosition;
            if (i10 >= dataPosition && i10 <= parcel.dataSize()) {
                return i10;
            }
            throw new a("Size read is invalid start=" + dataPosition + " end=" + i10, parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(o10))), parcel);
    }

    private static void w(Parcel parcel, int i10, int i11, int i12) {
        if (i11 != i12) {
            String hexString = Integer.toHexString(i11);
            throw new a("Expected size " + i12 + " got " + i11 + " (0x" + hexString + ")", parcel);
        }
    }

    private static void x(Parcel parcel, int i10, int i11) {
        int t10 = t(parcel, i10);
        if (t10 != i11) {
            String hexString = Integer.toHexString(t10);
            throw new a("Expected size " + i11 + " got " + t10 + " (0x" + hexString + ")", parcel);
        }
    }
}
