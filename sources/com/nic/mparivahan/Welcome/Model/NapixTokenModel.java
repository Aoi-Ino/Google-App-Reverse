package com.nic.mparivahan.Welcome.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class NapixTokenModel {
    private final String access_token;
    private final int consented_on;
    private final int expires_in;
    private final String scope;
    private final String token_type;

    public NapixTokenModel(String str, int i10, int i11, String str2, String str3) {
        l.f(str, "access_token");
        l.f(str2, "scope");
        l.f(str3, "token_type");
        this.access_token = str;
        this.consented_on = i10;
        this.expires_in = i11;
        this.scope = str2;
        this.token_type = str3;
    }

    public static /* synthetic */ NapixTokenModel copy$default(NapixTokenModel napixTokenModel, String str, int i10, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = napixTokenModel.access_token;
        }
        if ((i12 & 2) != 0) {
            i10 = napixTokenModel.consented_on;
        }
        int i13 = i10;
        if ((i12 & 4) != 0) {
            i11 = napixTokenModel.expires_in;
        }
        int i14 = i11;
        if ((i12 & 8) != 0) {
            str2 = napixTokenModel.scope;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            str3 = napixTokenModel.token_type;
        }
        return napixTokenModel.copy(str, i13, i14, str4, str3);
    }

    public final String component1() {
        return this.access_token;
    }

    public final int component2() {
        return this.consented_on;
    }

    public final int component3() {
        return this.expires_in;
    }

    public final String component4() {
        return this.scope;
    }

    public final String component5() {
        return this.token_type;
    }

    public final NapixTokenModel copy(String str, int i10, int i11, String str2, String str3) {
        l.f(str, "access_token");
        l.f(str2, "scope");
        l.f(str3, "token_type");
        return new NapixTokenModel(str, i10, i11, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NapixTokenModel)) {
            return false;
        }
        NapixTokenModel napixTokenModel = (NapixTokenModel) obj;
        return l.a(this.access_token, napixTokenModel.access_token) && this.consented_on == napixTokenModel.consented_on && this.expires_in == napixTokenModel.expires_in && l.a(this.scope, napixTokenModel.scope) && l.a(this.token_type, napixTokenModel.token_type);
    }

    public final String getAccess_token() {
        return this.access_token;
    }

    public final int getConsented_on() {
        return this.consented_on;
    }

    public final int getExpires_in() {
        return this.expires_in;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getToken_type() {
        return this.token_type;
    }

    public int hashCode() {
        return (((((((this.access_token.hashCode() * 31) + Integer.hashCode(this.consented_on)) * 31) + Integer.hashCode(this.expires_in)) * 31) + this.scope.hashCode()) * 31) + this.token_type.hashCode();
    }

    public String toString() {
        return "NapixTokenModel(access_token=" + this.access_token + ", consented_on=" + this.consented_on + ", expires_in=" + this.expires_in + ", scope=" + this.scope + ", token_type=" + this.token_type + ')';
    }
}
