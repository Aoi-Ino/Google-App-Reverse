package t3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public abstract class c {
    public static int a(Parcel parcel) {
        return s(parcel, 20293);
    }

    public static void b(Parcel parcel, int i10) {
        t(parcel, i10);
    }

    public static void c(Parcel parcel, int i10, boolean z10) {
        u(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle != null) {
            int s10 = s(parcel, i10);
            parcel.writeBundle(bundle);
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void e(Parcel parcel, int i10, byte b10) {
        u(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void f(Parcel parcel, int i10, double d10) {
        u(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void g(Parcel parcel, int i10, float f10) {
        u(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void h(Parcel parcel, int i10, Float f10, boolean z10) {
        if (f10 != null) {
            u(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void i(Parcel parcel, int i10, IBinder iBinder, boolean z10) {
        if (iBinder != null) {
            int s10 = s(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void j(Parcel parcel, int i10, int i11) {
        u(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void k(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr != null) {
            int s10 = s(parcel, i10);
            parcel.writeIntArray(iArr);
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void l(Parcel parcel, int i10, Integer num, boolean z10) {
        if (num != null) {
            u(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void m(Parcel parcel, int i10, long j10) {
        u(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void n(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable != null) {
            int s10 = s(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void o(Parcel parcel, int i10, String str, boolean z10) {
        if (str != null) {
            int s10 = s(parcel, i10);
            parcel.writeString(str);
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void p(Parcel parcel, int i10, List list, boolean z10) {
        if (list != null) {
            int s10 = s(parcel, i10);
            parcel.writeStringList(list);
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void q(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11, boolean z10) {
        if (parcelableArr != null) {
            int s10 = s(parcel, i10);
            parcel.writeInt(r7);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    v(parcel, parcelable, i11);
                }
            }
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void r(Parcel parcel, int i10, List list, boolean z10) {
        if (list != null) {
            int s10 = s(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                Parcelable parcelable = (Parcelable) list.get(i11);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    v(parcel, parcelable, 0);
                }
            }
            t(parcel, s10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    private static int s(Parcel parcel, int i10) {
        parcel.writeInt(i10 | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void t(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    private static void u(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    private static void v(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
