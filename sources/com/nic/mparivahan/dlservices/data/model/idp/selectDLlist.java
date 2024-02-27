package com.nic.mparivahan.dlservices.data.model.idp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class selectDLlist {

    /* renamed from: 525  reason: not valid java name */
    private final String f5525;

    public selectDLlist() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ selectDLlist copy$default(selectDLlist selectdllist, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectdllist.f5525;
        }
        return selectdllist.copy(str);
    }

    public final String component1() {
        return this.f5525;
    }

    public final selectDLlist copy(String str) {
        l.f(str, "525");
        return new selectDLlist(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof selectDLlist) && l.a(this.f5525, ((selectDLlist) obj).f5525);
    }

    public final String get525() {
        return this.f5525;
    }

    public int hashCode() {
        return this.f5525.hashCode();
    }

    public String toString() {
        return "selectDLlist(525=" + this.f5525 + ')';
    }

    public selectDLlist(String str) {
        l.f(str, "525");
        this.f5525 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ selectDLlist(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? "ISSUE International Driving Permit" : str);
    }
}
