package com.nic.mparivahan.Security.SecModle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SecurityModle {
    private final String data;

    public SecurityModle(String str) {
        this.data = str;
    }

    public static /* synthetic */ SecurityModle copy$default(SecurityModle securityModle, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = securityModle.data;
        }
        return securityModle.copy(str);
    }

    public final String component1() {
        return this.data;
    }

    public final SecurityModle copy(String str) {
        return new SecurityModle(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SecurityModle) && l.a(this.data, ((SecurityModle) obj).data);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        String str = this.data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "SecurityModle(data=" + this.data + ')';
    }
}
