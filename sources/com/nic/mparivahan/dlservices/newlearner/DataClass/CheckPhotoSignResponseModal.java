package com.nic.mparivahan.dlservices.newlearner.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;

@Keep
public final class CheckPhotoSignResponseModal {
    @c("photo")
    private String photo;
    @c("signature")
    private final String signature;

    public CheckPhotoSignResponseModal() {
        this((String) null, (String) null, 3, (g) null);
    }

    public static /* synthetic */ CheckPhotoSignResponseModal copy$default(CheckPhotoSignResponseModal checkPhotoSignResponseModal, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = checkPhotoSignResponseModal.photo;
        }
        if ((i10 & 2) != 0) {
            str2 = checkPhotoSignResponseModal.signature;
        }
        return checkPhotoSignResponseModal.copy(str, str2);
    }

    public final String component1() {
        return this.photo;
    }

    public final String component2() {
        return this.signature;
    }

    public final CheckPhotoSignResponseModal copy(String str, String str2) {
        l.f(str, "photo");
        l.f(str2, "signature");
        return new CheckPhotoSignResponseModal(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckPhotoSignResponseModal)) {
            return false;
        }
        CheckPhotoSignResponseModal checkPhotoSignResponseModal = (CheckPhotoSignResponseModal) obj;
        return l.a(this.photo, checkPhotoSignResponseModal.photo) && l.a(this.signature, checkPhotoSignResponseModal.signature);
    }

    public final String getPhoto() {
        return this.photo;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return (this.photo.hashCode() * 31) + this.signature.hashCode();
    }

    public final void setPhoto(String str) {
        l.f(str, "<set-?>");
        this.photo = str;
    }

    public String toString() {
        return "CheckPhotoSignResponseModal(photo=" + this.photo + ", signature=" + this.signature + ')';
    }

    public CheckPhotoSignResponseModal(String str, String str2) {
        l.f(str, "photo");
        l.f(str2, "signature");
        this.photo = str;
        this.signature = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckPhotoSignResponseModal(String str, String str2, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
