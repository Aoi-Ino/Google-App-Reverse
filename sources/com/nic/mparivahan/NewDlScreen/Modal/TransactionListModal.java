package com.nic.mparivahan.NewDlScreen.Modal;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class TransactionListModal {
    @c("value")
    private String value;

    public TransactionListModal() {
        this((String) null, 1, (g) null);
    }

    public static /* synthetic */ TransactionListModal copy$default(TransactionListModal transactionListModal, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = transactionListModal.value;
        }
        return transactionListModal.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final TransactionListModal copy(String str) {
        return new TransactionListModal(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TransactionListModal) && l.a(this.value, ((TransactionListModal) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        return "TransactionListModal(value=" + this.value + ')';
    }

    public TransactionListModal(String str) {
        this.value = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TransactionListModal(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
