package com.nic.mparivahan.Language.Modle;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class LanguageModle {
    private final Object langJSON;
    private final List<Language> languages;
    private final String statusCode;
    private final String statusDesc;

    public LanguageModle(Object obj, List<Language> list, String str, String str2) {
        l.f(obj, "langJSON");
        l.f(list, "languages");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.langJSON = obj;
        this.languages = list;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ LanguageModle copy$default(LanguageModle languageModle, Object obj, List<Language> list, String str, String str2, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = languageModle.langJSON;
        }
        if ((i10 & 2) != 0) {
            list = languageModle.languages;
        }
        if ((i10 & 4) != 0) {
            str = languageModle.statusCode;
        }
        if ((i10 & 8) != 0) {
            str2 = languageModle.statusDesc;
        }
        return languageModle.copy(obj, list, str, str2);
    }

    public final Object component1() {
        return this.langJSON;
    }

    public final List<Language> component2() {
        return this.languages;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final String component4() {
        return this.statusDesc;
    }

    public final LanguageModle copy(Object obj, List<Language> list, String str, String str2) {
        l.f(obj, "langJSON");
        l.f(list, "languages");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new LanguageModle(obj, list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageModle)) {
            return false;
        }
        LanguageModle languageModle = (LanguageModle) obj;
        return l.a(this.langJSON, languageModle.langJSON) && l.a(this.languages, languageModle.languages) && l.a(this.statusCode, languageModle.statusCode) && l.a(this.statusDesc, languageModle.statusDesc);
    }

    public final Object getLangJSON() {
        return this.langJSON;
    }

    public final List<Language> getLanguages() {
        return this.languages;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.langJSON.hashCode() * 31) + this.languages.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "LanguageModle(langJSON=" + this.langJSON + ", languages=" + this.languages + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
