package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Vhclass {
    private final ApiMessage apiMessage;
    private final Data data;

    public Vhclass(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        this.apiMessage = apiMessage2;
        this.data = data2;
    }

    public static /* synthetic */ Vhclass copy$default(Vhclass vhclass, ApiMessage apiMessage2, Data data2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            apiMessage2 = vhclass.apiMessage;
        }
        if ((i10 & 2) != 0) {
            data2 = vhclass.data;
        }
        return vhclass.copy(apiMessage2, data2);
    }

    public final ApiMessage component1() {
        return this.apiMessage;
    }

    public final Data component2() {
        return this.data;
    }

    public final Vhclass copy(ApiMessage apiMessage2, Data data2) {
        l.f(apiMessage2, "apiMessage");
        l.f(data2, "data");
        return new Vhclass(apiMessage2, data2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vhclass)) {
            return false;
        }
        Vhclass vhclass = (Vhclass) obj;
        return l.a(this.apiMessage, vhclass.apiMessage) && l.a(this.data, vhclass.data);
    }

    public final ApiMessage getApiMessage() {
        return this.apiMessage;
    }

    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return (this.apiMessage.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "Vhclass(apiMessage=" + this.apiMessage + ", data=" + this.data + ')';
    }
}
