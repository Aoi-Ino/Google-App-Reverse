package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.l;
import java.util.List;

@Keep
public final class GetSharedRecivedDoc {
    private final List<ReceivedDoc> receivedDocs;
    private final List<SharedDoc> sharedDocs;
    private final String statusCode;
    private final String statusDesc;

    public GetSharedRecivedDoc(List<ReceivedDoc> list, List<SharedDoc> list2, String str, String str2) {
        l.f(list, "receivedDocs");
        l.f(list2, "sharedDocs");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.receivedDocs = list;
        this.sharedDocs = list2;
        this.statusCode = str;
        this.statusDesc = str2;
    }

    public static /* synthetic */ GetSharedRecivedDoc copy$default(GetSharedRecivedDoc getSharedRecivedDoc, List<ReceivedDoc> list, List<SharedDoc> list2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = getSharedRecivedDoc.receivedDocs;
        }
        if ((i10 & 2) != 0) {
            list2 = getSharedRecivedDoc.sharedDocs;
        }
        if ((i10 & 4) != 0) {
            str = getSharedRecivedDoc.statusCode;
        }
        if ((i10 & 8) != 0) {
            str2 = getSharedRecivedDoc.statusDesc;
        }
        return getSharedRecivedDoc.copy(list, list2, str, str2);
    }

    public final List<ReceivedDoc> component1() {
        return this.receivedDocs;
    }

    public final List<SharedDoc> component2() {
        return this.sharedDocs;
    }

    public final String component3() {
        return this.statusCode;
    }

    public final String component4() {
        return this.statusDesc;
    }

    public final GetSharedRecivedDoc copy(List<ReceivedDoc> list, List<SharedDoc> list2, String str, String str2) {
        l.f(list, "receivedDocs");
        l.f(list2, "sharedDocs");
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new GetSharedRecivedDoc(list, list2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSharedRecivedDoc)) {
            return false;
        }
        GetSharedRecivedDoc getSharedRecivedDoc = (GetSharedRecivedDoc) obj;
        return l.a(this.receivedDocs, getSharedRecivedDoc.receivedDocs) && l.a(this.sharedDocs, getSharedRecivedDoc.sharedDocs) && l.a(this.statusCode, getSharedRecivedDoc.statusCode) && l.a(this.statusDesc, getSharedRecivedDoc.statusDesc);
    }

    public final List<ReceivedDoc> getReceivedDocs() {
        return this.receivedDocs;
    }

    public final List<SharedDoc> getSharedDocs() {
        return this.sharedDocs;
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public int hashCode() {
        return (((((this.receivedDocs.hashCode() * 31) + this.sharedDocs.hashCode()) * 31) + this.statusCode.hashCode()) * 31) + this.statusDesc.hashCode();
    }

    public String toString() {
        return "GetSharedRecivedDoc(receivedDocs=" + this.receivedDocs + ", sharedDocs=" + this.sharedDocs + ", statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ')';
    }
}
