package com.nic.mparivahan.VahanServices.VahanModel;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class DisposeApplErrorModel {
    private final String developerMessage;

    public DisposeApplErrorModel(String str) {
        l.f(str, "developerMessage");
        this.developerMessage = str;
    }

    public static /* synthetic */ DisposeApplErrorModel copy$default(DisposeApplErrorModel disposeApplErrorModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = disposeApplErrorModel.developerMessage;
        }
        return disposeApplErrorModel.copy(str);
    }

    public final String component1() {
        return this.developerMessage;
    }

    public final DisposeApplErrorModel copy(String str) {
        l.f(str, "developerMessage");
        return new DisposeApplErrorModel(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisposeApplErrorModel) && l.a(this.developerMessage, ((DisposeApplErrorModel) obj).developerMessage);
    }

    public final String getDeveloperMessage() {
        return this.developerMessage;
    }

    public int hashCode() {
        return this.developerMessage.hashCode();
    }

    public String toString() {
        return "DisposeApplErrorModel(developerMessage=" + this.developerMessage + ')';
    }
}
