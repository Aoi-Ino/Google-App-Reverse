package com.nic.mparivahan.ServiceWithdrawnScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class ReasonResultModal {
    @c("key")
    private final String key;

    public ReasonResultModal() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ ReasonResultModal copy$default(ReasonResultModal reasonResultModal, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reasonResultModal.key;
        }
        return reasonResultModal.copy(str);
    }

    public final String component1() {
        return this.key;
    }

    public final ReasonResultModal copy(String str) {
        l.f(str, "key");
        return new ReasonResultModal(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReasonResultModal) && l.a(this.key, ((ReasonResultModal) obj).key);
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.key.hashCode();
    }

    public String toString() {
        return "ReasonResultModal(key=" + this.key + ')';
    }

    public ReasonResultModal(String str) {
        l.f(str, "key");
        this.key = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReasonResultModal(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
