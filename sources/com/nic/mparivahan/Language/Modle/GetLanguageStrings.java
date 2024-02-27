package com.nic.mparivahan.Language.Modle;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class GetLanguageStrings {
    private final List<LangJSON> langJSON;

    public GetLanguageStrings(List<LangJSON> list) {
        l.f(list, "langJSON");
        this.langJSON = list;
    }

    public static /* synthetic */ GetLanguageStrings copy$default(GetLanguageStrings getLanguageStrings, List<LangJSON> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getLanguageStrings.langJSON;
        }
        return getLanguageStrings.copy(list);
    }

    public final List<LangJSON> component1() {
        return this.langJSON;
    }

    public final GetLanguageStrings copy(List<LangJSON> list) {
        l.f(list, "langJSON");
        return new GetLanguageStrings(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetLanguageStrings) && l.a(this.langJSON, ((GetLanguageStrings) obj).langJSON);
    }

    public final List<LangJSON> getLangJSON() {
        return this.langJSON;
    }

    public int hashCode() {
        return this.langJSON.hashCode();
    }

    public String toString() {
        return "GetLanguageStrings(langJSON=" + this.langJSON + ')';
    }
}
