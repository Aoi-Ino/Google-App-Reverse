package t5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class o0 extends e0 implements p0 {
    public o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean c(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 2:
                T(parcel.readInt(), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                f(parcel.readInt(), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                a0(parcel.readInt(), (Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                t(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                k0((Bundle) f0.a(parcel, creator), (Bundle) f0.a(parcel, creator));
                return true;
            case 7:
                R((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                w((Bundle) f0.a(parcel, creator2), (Bundle) f0.a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                D((Bundle) f0.a(parcel, creator3), (Bundle) f0.a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                O((Bundle) f0.a(parcel, creator4), (Bundle) f0.a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                p((Bundle) f0.a(parcel, creator5), (Bundle) f0.a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                d0((Bundle) f0.a(parcel, creator6), (Bundle) f0.a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                M((Bundle) f0.a(parcel, creator7), (Bundle) f0.a(parcel, creator7));
                return true;
            case 15:
                a((Bundle) f0.a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
