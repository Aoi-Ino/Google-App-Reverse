package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DistictModleItem {
    private final String descr;
    private final int dist_cd;
    private final String state_cd;

    public DistictModleItem(String str, int i10, String str2) {
        l.f(str, "descr");
        l.f(str2, "state_cd");
        this.descr = str;
        this.dist_cd = i10;
        this.state_cd = str2;
    }

    public static /* synthetic */ DistictModleItem copy$default(DistictModleItem distictModleItem, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = distictModleItem.descr;
        }
        if ((i11 & 2) != 0) {
            i10 = distictModleItem.dist_cd;
        }
        if ((i11 & 4) != 0) {
            str2 = distictModleItem.state_cd;
        }
        return distictModleItem.copy(str, i10, str2);
    }

    public final String component1() {
        return this.descr;
    }

    public final int component2() {
        return this.dist_cd;
    }

    public final String component3() {
        return this.state_cd;
    }

    public final DistictModleItem copy(String str, int i10, String str2) {
        l.f(str, "descr");
        l.f(str2, "state_cd");
        return new DistictModleItem(str, i10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistictModleItem)) {
            return false;
        }
        DistictModleItem distictModleItem = (DistictModleItem) obj;
        return l.a(this.descr, distictModleItem.descr) && this.dist_cd == distictModleItem.dist_cd && l.a(this.state_cd, distictModleItem.state_cd);
    }

    public final String getDescr() {
        return this.descr;
    }

    public final int getDist_cd() {
        return this.dist_cd;
    }

    public final String getState_cd() {
        return this.state_cd;
    }

    public int hashCode() {
        return (((this.descr.hashCode() * 31) + Integer.hashCode(this.dist_cd)) * 31) + this.state_cd.hashCode();
    }

    public String toString() {
        return "DistictModleItem(descr=" + this.descr + ", dist_cd=" + this.dist_cd + ", state_cd=" + this.state_cd + ')';
    }
}
