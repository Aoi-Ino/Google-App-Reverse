package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Document {
    private final NrvDetails nrvDetails;

    /* renamed from: rc  reason: collision with root package name */
    private final String f9476rc;

    public Document(NrvDetails nrvDetails2, String str) {
        l.f(str, "rc");
        this.nrvDetails = nrvDetails2;
        this.f9476rc = str;
    }

    public static /* synthetic */ Document copy$default(Document document, NrvDetails nrvDetails2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nrvDetails2 = document.nrvDetails;
        }
        if ((i10 & 2) != 0) {
            str = document.f9476rc;
        }
        return document.copy(nrvDetails2, str);
    }

    public final NrvDetails component1() {
        return this.nrvDetails;
    }

    public final String component2() {
        return this.f9476rc;
    }

    public final Document copy(NrvDetails nrvDetails2, String str) {
        l.f(str, "rc");
        return new Document(nrvDetails2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Document)) {
            return false;
        }
        Document document = (Document) obj;
        return l.a(this.nrvDetails, document.nrvDetails) && l.a(this.f9476rc, document.f9476rc);
    }

    public final NrvDetails getNrvDetails() {
        return this.nrvDetails;
    }

    public final String getRc() {
        return this.f9476rc;
    }

    public int hashCode() {
        NrvDetails nrvDetails2 = this.nrvDetails;
        return ((nrvDetails2 == null ? 0 : nrvDetails2.hashCode()) * 31) + this.f9476rc.hashCode();
    }

    public String toString() {
        return "Document(nrvDetails=" + this.nrvDetails + ", rc=" + this.f9476rc + ')';
    }
}
