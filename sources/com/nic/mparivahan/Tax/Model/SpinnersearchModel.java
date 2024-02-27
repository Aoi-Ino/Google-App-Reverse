package com.nic.mparivahan.Tax.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class SpinnersearchModel {
    private String name;

    public SpinnersearchModel(String str) {
        l.f(str, "name");
        this.name = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        l.f(str, "<set-?>");
        this.name = str;
    }
}
