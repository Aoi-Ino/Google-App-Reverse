package com.nic.mparivahan.Language.Modle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Language implements Comparable<Language> {
    private final boolean langActive;
    private final String langCode;
    private final String langIcon;
    private final int langId;
    private final String langName;
    private final int langOrder;
    private final String langUpdatedBy;
    private final String langUpdatedOn;
    private final double langVersion;

    public Language(boolean z10, String str, String str2, int i10, String str3, int i11, String str4, String str5, double d10) {
        l.f(str, "langCode");
        l.f(str2, "langIcon");
        l.f(str3, "langName");
        l.f(str4, "langUpdatedBy");
        l.f(str5, "langUpdatedOn");
        this.langActive = z10;
        this.langCode = str;
        this.langIcon = str2;
        this.langId = i10;
        this.langName = str3;
        this.langOrder = i11;
        this.langUpdatedBy = str4;
        this.langUpdatedOn = str5;
        this.langVersion = d10;
    }

    public static /* synthetic */ Language copy$default(Language language, boolean z10, String str, String str2, int i10, String str3, int i11, String str4, String str5, double d10, int i12, Object obj) {
        Language language2 = language;
        int i13 = i12;
        return language.copy((i13 & 1) != 0 ? language2.langActive : z10, (i13 & 2) != 0 ? language2.langCode : str, (i13 & 4) != 0 ? language2.langIcon : str2, (i13 & 8) != 0 ? language2.langId : i10, (i13 & 16) != 0 ? language2.langName : str3, (i13 & 32) != 0 ? language2.langOrder : i11, (i13 & 64) != 0 ? language2.langUpdatedBy : str4, (i13 & 128) != 0 ? language2.langUpdatedOn : str5, (i13 & 256) != 0 ? language2.langVersion : d10);
    }

    public int compareTo(Language language) {
        l.f(language, "other");
        int i10 = this.langOrder;
        int i11 = language.langOrder;
        if (i10 == i11) {
            return 0;
        }
        return i10 > i11 ? 1 : -1;
    }

    public final boolean component1() {
        return this.langActive;
    }

    public final String component2() {
        return this.langCode;
    }

    public final String component3() {
        return this.langIcon;
    }

    public final int component4() {
        return this.langId;
    }

    public final String component5() {
        return this.langName;
    }

    public final int component6() {
        return this.langOrder;
    }

    public final String component7() {
        return this.langUpdatedBy;
    }

    public final String component8() {
        return this.langUpdatedOn;
    }

    public final double component9() {
        return this.langVersion;
    }

    public final Language copy(boolean z10, String str, String str2, int i10, String str3, int i11, String str4, String str5, double d10) {
        l.f(str, "langCode");
        l.f(str2, "langIcon");
        String str6 = str3;
        l.f(str6, "langName");
        String str7 = str4;
        l.f(str7, "langUpdatedBy");
        String str8 = str5;
        l.f(str8, "langUpdatedOn");
        return new Language(z10, str, str2, i10, str6, i11, str7, str8, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Language)) {
            return false;
        }
        Language language = (Language) obj;
        return this.langActive == language.langActive && l.a(this.langCode, language.langCode) && l.a(this.langIcon, language.langIcon) && this.langId == language.langId && l.a(this.langName, language.langName) && this.langOrder == language.langOrder && l.a(this.langUpdatedBy, language.langUpdatedBy) && l.a(this.langUpdatedOn, language.langUpdatedOn) && Double.compare(this.langVersion, language.langVersion) == 0;
    }

    public final boolean getLangActive() {
        return this.langActive;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public final String getLangIcon() {
        return this.langIcon;
    }

    public final int getLangId() {
        return this.langId;
    }

    public final String getLangName() {
        return this.langName;
    }

    public final int getLangOrder() {
        return this.langOrder;
    }

    public final String getLangUpdatedBy() {
        return this.langUpdatedBy;
    }

    public final String getLangUpdatedOn() {
        return this.langUpdatedOn;
    }

    public final double getLangVersion() {
        return this.langVersion;
    }

    public int hashCode() {
        boolean z10 = this.langActive;
        if (z10) {
            z10 = true;
        }
        return ((((((((((((((((z10 ? 1 : 0) * true) + this.langCode.hashCode()) * 31) + this.langIcon.hashCode()) * 31) + Integer.hashCode(this.langId)) * 31) + this.langName.hashCode()) * 31) + Integer.hashCode(this.langOrder)) * 31) + this.langUpdatedBy.hashCode()) * 31) + this.langUpdatedOn.hashCode()) * 31) + Double.hashCode(this.langVersion);
    }

    public String toString() {
        return "Language(langActive=" + this.langActive + ", langCode=" + this.langCode + ", langIcon=" + this.langIcon + ", langId=" + this.langId + ", langName=" + this.langName + ", langOrder=" + this.langOrder + ", langUpdatedBy=" + this.langUpdatedBy + ", langUpdatedOn=" + this.langUpdatedOn + ", langVersion=" + this.langVersion + ')';
    }
}
