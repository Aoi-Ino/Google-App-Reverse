package com.nic.mparivahan.dlservices.ui.dlextract;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class SelectedDLList {
    @c("523")
    private String jsonMember523;

    public SelectedDLList() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ SelectedDLList copy$default(SelectedDLList selectedDLList, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = selectedDLList.jsonMember523;
        }
        return selectedDLList.copy(str);
    }

    public final String component1() {
        return this.jsonMember523;
    }

    public final SelectedDLList copy(String str) {
        return new SelectedDLList(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SelectedDLList) && l.a(this.jsonMember523, ((SelectedDLList) obj).jsonMember523);
    }

    public final String getJsonMember523() {
        return this.jsonMember523;
    }

    public int hashCode() {
        String str = this.jsonMember523;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setJsonMember523(String str) {
        this.jsonMember523 = str;
    }

    public String toString() {
        return "SelectedDLList(jsonMember523=" + this.jsonMember523 + ')';
    }

    public SelectedDLList(String str) {
        this.jsonMember523 = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectedDLList(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
