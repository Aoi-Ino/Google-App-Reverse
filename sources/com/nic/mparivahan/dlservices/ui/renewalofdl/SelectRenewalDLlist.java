package com.nic.mparivahan.dlservices.ui.renewalofdl;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class SelectRenewalDLlist {

    /* renamed from: 537  reason: not valid java name */
    private final String f9537;

    public SelectRenewalDLlist() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ SelectRenewalDLlist copy$default(SelectRenewalDLlist selectRenewalDLlist, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectRenewalDLlist.f9537;
        }
        return selectRenewalDLlist.copy(str);
    }

    public final String component1() {
        return this.f9537;
    }

    public final SelectRenewalDLlist copy(String str) {
        l.f(str, "537");
        return new SelectRenewalDLlist(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectRenewalDLlist) && l.a(this.f9537, ((SelectRenewalDLlist) obj).f9537);
    }

    public final String get537() {
        return this.f9537;
    }

    public int hashCode() {
        return this.f9537.hashCode();
    }

    public String toString() {
        return "SelectRenewalDLlist(537=" + this.f9537 + ')';
    }

    public SelectRenewalDLlist(String str) {
        l.f(str, "537");
        this.f9537 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectRenewalDLlist(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? "RE-VALIDATION OF EXPIRED DL" : str);
    }
}
