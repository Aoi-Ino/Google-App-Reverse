package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import t3.b;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int v10 = b.v(parcel);
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    i10 = b.q(parcel2, o10);
                    break;
                case 2:
                    str = b.d(parcel2, o10);
                    break;
                case 3:
                    str2 = b.d(parcel2, o10);
                    break;
                case 4:
                    str3 = b.d(parcel2, o10);
                    break;
                case 5:
                    str4 = b.d(parcel2, o10);
                    break;
                case 6:
                    uri = (Uri) b.c(parcel2, o10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.d(parcel2, o10);
                    break;
                case 8:
                    j10 = b.s(parcel2, o10);
                    break;
                case 9:
                    str6 = b.d(parcel2, o10);
                    break;
                case 10:
                    arrayList = b.g(parcel2, o10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.d(parcel2, o10);
                    break;
                case 12:
                    str8 = b.d(parcel2, o10);
                    break;
                default:
                    b.u(parcel2, o10);
                    break;
            }
        }
        b.h(parcel2, v10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
