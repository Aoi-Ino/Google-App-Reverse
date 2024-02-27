package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import j7.c;

@Keep
public final class ProofList {
    @c("code")
    private String code;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private String f21674id;
    @c("name")
    private String name;

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.f21674id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setId(String str) {
        this.f21674id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }
}
