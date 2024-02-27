package com.nic.mparivahan.Language.Modle;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class LangJSON {
    private final String text_code;
    private final String text_value;

    public LangJSON(String str, String str2) {
        this.text_code = str;
        this.text_value = str2;
    }

    public static /* synthetic */ LangJSON copy$default(LangJSON langJSON, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = langJSON.text_code;
        }
        if ((i10 & 2) != 0) {
            str2 = langJSON.text_value;
        }
        return langJSON.copy(str, str2);
    }

    public final String component1() {
        return this.text_code;
    }

    public final String component2() {
        return this.text_value;
    }

    public final LangJSON copy(String str, String str2) {
        return new LangJSON(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LangJSON)) {
            return false;
        }
        LangJSON langJSON = (LangJSON) obj;
        return l.a(this.text_code, langJSON.text_code) && l.a(this.text_value, langJSON.text_value);
    }

    public final String getText_code() {
        return this.text_code;
    }

    public final String getText_value() {
        return this.text_value;
    }

    public int hashCode() {
        String str = this.text_code;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text_value;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "LangJSON(text_code=" + this.text_code + ", text_value=" + this.text_value + ')';
    }
}
