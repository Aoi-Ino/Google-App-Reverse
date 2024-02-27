package s3;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import t3.b;
import t3.c;

public final class b1 implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, gVar.f15959e);
        c.j(parcel, 2, gVar.f15960f);
        c.j(parcel, 3, gVar.f15961g);
        c.o(parcel, 4, gVar.f15962h, false);
        c.i(parcel, 5, gVar.f15963i, false);
        c.q(parcel, 6, gVar.f15964j, i10, false);
        c.d(parcel, 7, gVar.f15965k, false);
        c.n(parcel, 8, gVar.f15966l, i10, false);
        c.q(parcel, 10, gVar.f15967m, i10, false);
        c.q(parcel, 11, gVar.f15968n, i10, false);
        c.c(parcel, 12, gVar.f15969o);
        c.j(parcel, 13, gVar.f15970p);
        c.c(parcel, 14, gVar.f15971q);
        c.o(parcel, 15, gVar.c(), false);
        c.b(parcel, a10);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int v10 = b.v(parcel);
        Scope[] scopeArr = g.f15957s;
        Bundle bundle = new Bundle();
        p3.c[] cVarArr = g.f15958t;
        p3.c[] cVarArr2 = cVarArr;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        while (parcel.dataPosition() < v10) {
            int o10 = b.o(parcel);
            switch (b.i(o10)) {
                case 1:
                    i10 = b.q(parcel2, o10);
                    break;
                case 2:
                    i11 = b.q(parcel2, o10);
                    break;
                case 3:
                    i12 = b.q(parcel2, o10);
                    break;
                case 4:
                    str = b.d(parcel2, o10);
                    break;
                case 5:
                    iBinder = b.p(parcel2, o10);
                    break;
                case 6:
                    scopeArr = (Scope[]) b.f(parcel2, o10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = b.a(parcel2, o10);
                    break;
                case 8:
                    account = (Account) b.c(parcel2, o10, Account.CREATOR);
                    break;
                case 10:
                    cVarArr = (p3.c[]) b.f(parcel2, o10, p3.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (p3.c[]) b.f(parcel2, o10, p3.c.CREATOR);
                    break;
                case 12:
                    z10 = b.j(parcel2, o10);
                    break;
                case 13:
                    i13 = b.q(parcel2, o10);
                    break;
                case 14:
                    z11 = b.j(parcel2, o10);
                    break;
                case 15:
                    str2 = b.d(parcel2, o10);
                    break;
                default:
                    b.u(parcel2, o10);
                    break;
            }
        }
        b.h(parcel2, v10);
        return new g(i10, i11, i12, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z10, i13, z11, str2);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
