package e4;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;
import t3.a;
import t3.c;

public final class u extends a {
    public static final Parcelable.Creator<u> CREATOR = new p0();

    /* renamed from: e  reason: collision with root package name */
    private final int f10085e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10086f;

    /* renamed from: g  reason: collision with root package name */
    private final String f10087g;

    /* renamed from: h  reason: collision with root package name */
    private final String f10088h;

    /* renamed from: i  reason: collision with root package name */
    private final int f10089i;

    /* renamed from: j  reason: collision with root package name */
    private final String f10090j;

    /* renamed from: k  reason: collision with root package name */
    private final u f10091k;

    /* renamed from: l  reason: collision with root package name */
    private final List f10092l;

    static {
        Process.myUid();
        Process.myPid();
    }

    u(int i10, int i11, String str, String str2, String str3, int i12, List list, u uVar) {
        this.f10085e = i10;
        this.f10086f = i11;
        this.f10087g = str;
        this.f10088h = str2;
        this.f10090j = str3;
        this.f10089i = i12;
        this.f10092l = l0.E(list);
        this.f10091k = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f10085e == uVar.f10085e && this.f10086f == uVar.f10086f && this.f10089i == uVar.f10089i && this.f10087g.equals(uVar.f10087g) && e0.a(this.f10088h, uVar.f10088h) && e0.a(this.f10090j, uVar.f10090j) && e0.a(this.f10091k, uVar.f10091k) && this.f10092l.equals(uVar.f10092l);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10085e), this.f10087g, this.f10088h, this.f10090j});
    }

    public final String toString() {
        int length = this.f10087g.length() + 18;
        String str = this.f10088h;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(this.f10085e);
        sb2.append("/");
        sb2.append(this.f10087g);
        if (this.f10088h != null) {
            sb2.append("[");
            if (this.f10088h.startsWith(this.f10087g)) {
                sb2.append(this.f10088h, this.f10087g.length(), this.f10088h.length());
            } else {
                sb2.append(this.f10088h);
            }
            sb2.append("]");
        }
        if (this.f10090j != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(this.f10090j.hashCode()));
        }
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 1, this.f10085e);
        c.j(parcel, 2, this.f10086f);
        c.o(parcel, 3, this.f10087g, false);
        c.o(parcel, 4, this.f10088h, false);
        c.j(parcel, 5, this.f10089i);
        c.o(parcel, 6, this.f10090j, false);
        c.n(parcel, 7, this.f10091k, i10, false);
        c.r(parcel, 8, this.f10092l, false);
        c.b(parcel, a10);
    }
}
