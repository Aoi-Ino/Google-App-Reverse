package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class InsertedUploadDocResponse {
    @c("applicationNumber")
    private final Object applicationNumber;
    @c("insertedDocBean")
    private final List<InsertedDocBeanItem> insertedDocBean;
    @c("putUpCase")
    private final Boolean putUpCase;
    @c("responseMessage")
    private final InsertedUploadResponseMessage responseMessage;

    public InsertedUploadDocResponse() {
        this((Object) null, (List) null, (Boolean) null, (InsertedUploadResponseMessage) null, 15, (g) null);
    }

    public static /* synthetic */ InsertedUploadDocResponse copy$default(InsertedUploadDocResponse insertedUploadDocResponse, Object obj, List<InsertedDocBeanItem> list, Boolean bool, InsertedUploadResponseMessage insertedUploadResponseMessage, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = insertedUploadDocResponse.applicationNumber;
        }
        if ((i10 & 2) != 0) {
            list = insertedUploadDocResponse.insertedDocBean;
        }
        if ((i10 & 4) != 0) {
            bool = insertedUploadDocResponse.putUpCase;
        }
        if ((i10 & 8) != 0) {
            insertedUploadResponseMessage = insertedUploadDocResponse.responseMessage;
        }
        return insertedUploadDocResponse.copy(obj, list, bool, insertedUploadResponseMessage);
    }

    public final Object component1() {
        return this.applicationNumber;
    }

    public final List<InsertedDocBeanItem> component2() {
        return this.insertedDocBean;
    }

    public final Boolean component3() {
        return this.putUpCase;
    }

    public final InsertedUploadResponseMessage component4() {
        return this.responseMessage;
    }

    public final InsertedUploadDocResponse copy(Object obj, List<InsertedDocBeanItem> list, Boolean bool, InsertedUploadResponseMessage insertedUploadResponseMessage) {
        return new InsertedUploadDocResponse(obj, list, bool, insertedUploadResponseMessage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InsertedUploadDocResponse)) {
            return false;
        }
        InsertedUploadDocResponse insertedUploadDocResponse = (InsertedUploadDocResponse) obj;
        return l.a(this.applicationNumber, insertedUploadDocResponse.applicationNumber) && l.a(this.insertedDocBean, insertedUploadDocResponse.insertedDocBean) && l.a(this.putUpCase, insertedUploadDocResponse.putUpCase) && l.a(this.responseMessage, insertedUploadDocResponse.responseMessage);
    }

    public final Object getApplicationNumber() {
        return this.applicationNumber;
    }

    public final List<InsertedDocBeanItem> getInsertedDocBean() {
        return this.insertedDocBean;
    }

    public final Boolean getPutUpCase() {
        return this.putUpCase;
    }

    public final InsertedUploadResponseMessage getResponseMessage() {
        return this.responseMessage;
    }

    public int hashCode() {
        Object obj = this.applicationNumber;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        List<InsertedDocBeanItem> list = this.insertedDocBean;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.putUpCase;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        InsertedUploadResponseMessage insertedUploadResponseMessage = this.responseMessage;
        if (insertedUploadResponseMessage != null) {
            i10 = insertedUploadResponseMessage.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        return "InsertedUploadDocResponse(applicationNumber=" + this.applicationNumber + ", insertedDocBean=" + this.insertedDocBean + ", putUpCase=" + this.putUpCase + ", responseMessage=" + this.responseMessage + ')';
    }

    public InsertedUploadDocResponse(Object obj, List<InsertedDocBeanItem> list, Boolean bool, InsertedUploadResponseMessage insertedUploadResponseMessage) {
        this.applicationNumber = obj;
        this.insertedDocBean = list;
        this.putUpCase = bool;
        this.responseMessage = insertedUploadResponseMessage;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InsertedUploadDocResponse(Object obj, List list, Boolean bool, InsertedUploadResponseMessage insertedUploadResponseMessage, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : insertedUploadResponseMessage);
    }
}
