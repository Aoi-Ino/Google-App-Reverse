package com.nic.mparivahan.dlservices.ui.renewalofdl.Revalidation;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class SelectRenewalCoalist {

    /* renamed from: 515  reason: not valid java name */
    private final String f7515;

    /* renamed from: 537  reason: not valid java name */
    private final String f8537;

    public SelectRenewalCoalist() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ SelectRenewalCoalist copy$default(SelectRenewalCoalist selectRenewalCoalist, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectRenewalCoalist.f8537;
        }
        if ((i10 & 2) != 0) {
            str2 = selectRenewalCoalist.f7515;
        }
        return selectRenewalCoalist.copy(str, str2);
    }

    public final String component1() {
        return this.f8537;
    }

    public final String component2() {
        return this.f7515;
    }

    public final SelectRenewalCoalist copy(String str, String str2) {
        l.f(str, "537");
        l.f(str2, "515");
        return new SelectRenewalCoalist(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectRenewalCoalist)) {
            return false;
        }
        SelectRenewalCoalist selectRenewalCoalist = (SelectRenewalCoalist) obj;
        return l.a(this.f8537, selectRenewalCoalist.f8537) && l.a(this.f7515, selectRenewalCoalist.f7515);
    }

    public final String get515() {
        return this.f7515;
    }

    public final String get537() {
        return this.f8537;
    }

    public int hashCode() {
        return (this.f8537.hashCode() * 31) + this.f7515.hashCode();
    }

    public String toString() {
        return "SelectRenewalCoalist(537=" + this.f8537 + ", 515=" + this.f7515 + ')';
    }

    public SelectRenewalCoalist(String str, String str2) {
        l.f(str, "537");
        l.f(str2, "515");
        this.f8537 = str;
        this.f7515 = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectRenewalCoalist(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "RE-VALIDATION OF EXPIRED DL" : str, (i10 & 2) != 0 ? "CHANGE OF ADDRESS IN DL" : str2);
    }
}
