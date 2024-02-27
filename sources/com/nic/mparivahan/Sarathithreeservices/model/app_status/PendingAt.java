package com.nic.mparivahan.Sarathithreeservices.model.app_status;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class PendingAt {
    private final String counter;
    private final String pending_at;
    private final String transaction;

    public PendingAt(String str, String str2, String str3) {
        l.f(str, "counter");
        l.f(str2, "pending_at");
        l.f(str3, "transaction");
        this.counter = str;
        this.pending_at = str2;
        this.transaction = str3;
    }

    public static /* synthetic */ PendingAt copy$default(PendingAt pendingAt, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pendingAt.counter;
        }
        if ((i10 & 2) != 0) {
            str2 = pendingAt.pending_at;
        }
        if ((i10 & 4) != 0) {
            str3 = pendingAt.transaction;
        }
        return pendingAt.copy(str, str2, str3);
    }

    public final String component1() {
        return this.counter;
    }

    public final String component2() {
        return this.pending_at;
    }

    public final String component3() {
        return this.transaction;
    }

    public final PendingAt copy(String str, String str2, String str3) {
        l.f(str, "counter");
        l.f(str2, "pending_at");
        l.f(str3, "transaction");
        return new PendingAt(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PendingAt)) {
            return false;
        }
        PendingAt pendingAt = (PendingAt) obj;
        return l.a(this.counter, pendingAt.counter) && l.a(this.pending_at, pendingAt.pending_at) && l.a(this.transaction, pendingAt.transaction);
    }

    public final String getCounter() {
        return this.counter;
    }

    public final String getPending_at() {
        return this.pending_at;
    }

    public final String getTransaction() {
        return this.transaction;
    }

    public int hashCode() {
        return (((this.counter.hashCode() * 31) + this.pending_at.hashCode()) * 31) + this.transaction.hashCode();
    }

    public String toString() {
        return "PendingAt(counter=" + this.counter + ", pending_at=" + this.pending_at + ", transaction=" + this.transaction + ')';
    }
}
