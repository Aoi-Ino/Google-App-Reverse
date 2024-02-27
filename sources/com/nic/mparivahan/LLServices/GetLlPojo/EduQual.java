package com.nic.mparivahan.LLServices.GetLlPojo;

import androidx.annotation.Keep;
import cm.l;
import java.io.Serializable;

@Keep
public final class EduQual implements Serializable {
    private final String qualCode;
    private final String qualDesc;

    public EduQual(String str, String str2) {
        l.f(str, "qualCode");
        l.f(str2, "qualDesc");
        this.qualCode = str;
        this.qualDesc = str2;
    }

    public static /* synthetic */ EduQual copy$default(EduQual eduQual, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = eduQual.qualCode;
        }
        if ((i10 & 2) != 0) {
            str2 = eduQual.qualDesc;
        }
        return eduQual.copy(str, str2);
    }

    public final String component1() {
        return this.qualCode;
    }

    public final String component2() {
        return this.qualDesc;
    }

    public final EduQual copy(String str, String str2) {
        l.f(str, "qualCode");
        l.f(str2, "qualDesc");
        return new EduQual(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EduQual)) {
            return false;
        }
        EduQual eduQual = (EduQual) obj;
        return l.a(this.qualCode, eduQual.qualCode) && l.a(this.qualDesc, eduQual.qualDesc);
    }

    public final String getQualCode() {
        return this.qualCode;
    }

    public final String getQualDesc() {
        return this.qualDesc;
    }

    public int hashCode() {
        return (this.qualCode.hashCode() * 31) + this.qualDesc.hashCode();
    }

    public String toString() {
        return "EduQual(qualCode=" + this.qualCode + ", qualDesc=" + this.qualDesc + ')';
    }
}
