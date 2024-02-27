package com.nic.mparivahan.dlservices.data.model.temp;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class UploadDocListResponse {
    @c("applicationNumber")
    private final String applicationNumber;
    @c("dCodes")
    private final List<Integer> dCodes;
    @c("documentList")
    private final List<DocumentListItem> documentList;
    @c("proofList")
    private final List<ProofList> proofList;
    @c("responseBean")
    private final ResponseBean responseBean;
    @c("stateCode")
    private final String stateCode;

    public UploadDocListResponse(ResponseBean responseBean2, String str, List<DocumentListItem> list, List<ProofList> list2, String str2, List<Integer> list3) {
        l.f(list3, "dCodes");
        this.responseBean = responseBean2;
        this.applicationNumber = str;
        this.documentList = list;
        this.proofList = list2;
        this.stateCode = str2;
        this.dCodes = list3;
    }

    public static /* synthetic */ UploadDocListResponse copy$default(UploadDocListResponse uploadDocListResponse, ResponseBean responseBean2, String str, List<DocumentListItem> list, List<ProofList> list2, String str2, List<Integer> list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            responseBean2 = uploadDocListResponse.responseBean;
        }
        if ((i10 & 2) != 0) {
            str = uploadDocListResponse.applicationNumber;
        }
        String str3 = str;
        if ((i10 & 4) != 0) {
            list = uploadDocListResponse.documentList;
        }
        List<DocumentListItem> list4 = list;
        if ((i10 & 8) != 0) {
            list2 = uploadDocListResponse.proofList;
        }
        List<ProofList> list5 = list2;
        if ((i10 & 16) != 0) {
            str2 = uploadDocListResponse.stateCode;
        }
        String str4 = str2;
        if ((i10 & 32) != 0) {
            list3 = uploadDocListResponse.dCodes;
        }
        return uploadDocListResponse.copy(responseBean2, str3, list4, list5, str4, list3);
    }

    public final ResponseBean component1() {
        return this.responseBean;
    }

    public final String component2() {
        return this.applicationNumber;
    }

    public final List<DocumentListItem> component3() {
        return this.documentList;
    }

    public final List<ProofList> component4() {
        return this.proofList;
    }

    public final String component5() {
        return this.stateCode;
    }

    public final List<Integer> component6() {
        return this.dCodes;
    }

    public final UploadDocListResponse copy(ResponseBean responseBean2, String str, List<DocumentListItem> list, List<ProofList> list2, String str2, List<Integer> list3) {
        l.f(list3, "dCodes");
        return new UploadDocListResponse(responseBean2, str, list, list2, str2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadDocListResponse)) {
            return false;
        }
        UploadDocListResponse uploadDocListResponse = (UploadDocListResponse) obj;
        return l.a(this.responseBean, uploadDocListResponse.responseBean) && l.a(this.applicationNumber, uploadDocListResponse.applicationNumber) && l.a(this.documentList, uploadDocListResponse.documentList) && l.a(this.proofList, uploadDocListResponse.proofList) && l.a(this.stateCode, uploadDocListResponse.stateCode) && l.a(this.dCodes, uploadDocListResponse.dCodes);
    }

    public final String getApplicationNumber() {
        return this.applicationNumber;
    }

    public final List<Integer> getDCodes() {
        return this.dCodes;
    }

    public final List<DocumentListItem> getDocumentList() {
        return this.documentList;
    }

    public final List<ProofList> getProofList() {
        return this.proofList;
    }

    public final ResponseBean getResponseBean() {
        return this.responseBean;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public int hashCode() {
        ResponseBean responseBean2 = this.responseBean;
        int i10 = 0;
        int hashCode = (responseBean2 == null ? 0 : responseBean2.hashCode()) * 31;
        String str = this.applicationNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<DocumentListItem> list = this.documentList;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ProofList> list2 = this.proofList;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.stateCode;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((hashCode4 + i10) * 31) + this.dCodes.hashCode();
    }

    public String toString() {
        return "UploadDocListResponse(responseBean=" + this.responseBean + ", applicationNumber=" + this.applicationNumber + ", documentList=" + this.documentList + ", proofList=" + this.proofList + ", stateCode=" + this.stateCode + ", dCodes=" + this.dCodes + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploadDocListResponse(ResponseBean responseBean2, String str, List list, List list2, String str2, List list3, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : responseBean2, (i10 & 2) != 0 ? null : str, list, (i10 & 8) != 0 ? null : list2, (i10 & 16) != 0 ? null : str2, list3);
    }
}
