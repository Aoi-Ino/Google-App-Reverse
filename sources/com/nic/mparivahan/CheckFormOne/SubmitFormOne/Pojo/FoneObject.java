package com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class FoneObject {
    private final String declaringcheck;
    private final String msg;
    private final String scopea;
    private final String scopeb;
    private final String scopec;
    private final String scoped;
    private final String scopee;
    private final String scopef;

    public FoneObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str, "declaringcheck");
        l.f(str2, "msg");
        l.f(str3, "scopea");
        l.f(str4, "scopeb");
        l.f(str5, "scopec");
        l.f(str6, "scoped");
        l.f(str7, "scopee");
        l.f(str8, "scopef");
        this.declaringcheck = str;
        this.msg = str2;
        this.scopea = str3;
        this.scopeb = str4;
        this.scopec = str5;
        this.scoped = str6;
        this.scopee = str7;
        this.scopef = str8;
    }

    public static /* synthetic */ FoneObject copy$default(FoneObject foneObject, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        FoneObject foneObject2 = foneObject;
        int i11 = i10;
        return foneObject.copy((i11 & 1) != 0 ? foneObject2.declaringcheck : str, (i11 & 2) != 0 ? foneObject2.msg : str2, (i11 & 4) != 0 ? foneObject2.scopea : str3, (i11 & 8) != 0 ? foneObject2.scopeb : str4, (i11 & 16) != 0 ? foneObject2.scopec : str5, (i11 & 32) != 0 ? foneObject2.scoped : str6, (i11 & 64) != 0 ? foneObject2.scopee : str7, (i11 & 128) != 0 ? foneObject2.scopef : str8);
    }

    public final String component1() {
        return this.declaringcheck;
    }

    public final String component2() {
        return this.msg;
    }

    public final String component3() {
        return this.scopea;
    }

    public final String component4() {
        return this.scopeb;
    }

    public final String component5() {
        return this.scopec;
    }

    public final String component6() {
        return this.scoped;
    }

    public final String component7() {
        return this.scopee;
    }

    public final String component8() {
        return this.scopef;
    }

    public final FoneObject copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        l.f(str, "declaringcheck");
        l.f(str2, "msg");
        l.f(str3, "scopea");
        l.f(str4, "scopeb");
        l.f(str5, "scopec");
        String str9 = str6;
        l.f(str9, "scoped");
        String str10 = str7;
        l.f(str10, "scopee");
        String str11 = str8;
        l.f(str11, "scopef");
        return new FoneObject(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoneObject)) {
            return false;
        }
        FoneObject foneObject = (FoneObject) obj;
        return l.a(this.declaringcheck, foneObject.declaringcheck) && l.a(this.msg, foneObject.msg) && l.a(this.scopea, foneObject.scopea) && l.a(this.scopeb, foneObject.scopeb) && l.a(this.scopec, foneObject.scopec) && l.a(this.scoped, foneObject.scoped) && l.a(this.scopee, foneObject.scopee) && l.a(this.scopef, foneObject.scopef);
    }

    public final String getDeclaringcheck() {
        return this.declaringcheck;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getScopea() {
        return this.scopea;
    }

    public final String getScopeb() {
        return this.scopeb;
    }

    public final String getScopec() {
        return this.scopec;
    }

    public final String getScoped() {
        return this.scoped;
    }

    public final String getScopee() {
        return this.scopee;
    }

    public final String getScopef() {
        return this.scopef;
    }

    public int hashCode() {
        return (((((((((((((this.declaringcheck.hashCode() * 31) + this.msg.hashCode()) * 31) + this.scopea.hashCode()) * 31) + this.scopeb.hashCode()) * 31) + this.scopec.hashCode()) * 31) + this.scoped.hashCode()) * 31) + this.scopee.hashCode()) * 31) + this.scopef.hashCode();
    }

    public String toString() {
        return "FoneObject(declaringcheck=" + this.declaringcheck + ", msg=" + this.msg + ", scopea=" + this.scopea + ", scopeb=" + this.scopeb + ", scopec=" + this.scopec + ", scoped=" + this.scoped + ", scopee=" + this.scopee + ", scopef=" + this.scopef + ')';
    }
}
