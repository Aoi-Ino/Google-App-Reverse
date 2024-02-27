package com.nic.mparivahan.ClServices.Pojo.NewClPojo;

import androidx.annotation.Keep;
import cm.l;
import java.util.ArrayList;

@Keep
public final class NewClPojo {
    private final ArrayList<NewCLAcknowledgement> NewCLAcknowledgement;
    private final String status_code;
    private final String status_desc;

    public NewClPojo(ArrayList<NewCLAcknowledgement> arrayList, String str, String str2) {
        l.f(arrayList, "NewCLAcknowledgement");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        this.NewCLAcknowledgement = arrayList;
        this.status_code = str;
        this.status_desc = str2;
    }

    public static /* synthetic */ NewClPojo copy$default(NewClPojo newClPojo, ArrayList<NewCLAcknowledgement> arrayList, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            arrayList = newClPojo.NewCLAcknowledgement;
        }
        if ((i10 & 2) != 0) {
            str = newClPojo.status_code;
        }
        if ((i10 & 4) != 0) {
            str2 = newClPojo.status_desc;
        }
        return newClPojo.copy(arrayList, str, str2);
    }

    public final ArrayList<NewCLAcknowledgement> component1() {
        return this.NewCLAcknowledgement;
    }

    public final String component2() {
        return this.status_code;
    }

    public final String component3() {
        return this.status_desc;
    }

    public final NewClPojo copy(ArrayList<NewCLAcknowledgement> arrayList, String str, String str2) {
        l.f(arrayList, "NewCLAcknowledgement");
        l.f(str, "status_code");
        l.f(str2, "status_desc");
        return new NewClPojo(arrayList, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewClPojo)) {
            return false;
        }
        NewClPojo newClPojo = (NewClPojo) obj;
        return l.a(this.NewCLAcknowledgement, newClPojo.NewCLAcknowledgement) && l.a(this.status_code, newClPojo.status_code) && l.a(this.status_desc, newClPojo.status_desc);
    }

    public final ArrayList<NewCLAcknowledgement> getNewCLAcknowledgement() {
        return this.NewCLAcknowledgement;
    }

    public final String getStatus_code() {
        return this.status_code;
    }

    public final String getStatus_desc() {
        return this.status_desc;
    }

    public int hashCode() {
        return (((this.NewCLAcknowledgement.hashCode() * 31) + this.status_code.hashCode()) * 31) + this.status_desc.hashCode();
    }

    public String toString() {
        return "NewClPojo(NewCLAcknowledgement=" + this.NewCLAcknowledgement + ", status_code=" + this.status_code + ", status_desc=" + this.status_desc + ')';
    }
}
