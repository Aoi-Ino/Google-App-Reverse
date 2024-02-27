package com.nic.mparivahan.dlservices.ui.dms.uploadmodel;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.List;

@Keep
public final class DocUploadRequest {
    @c("uploadDocsBean")
    private List<UploadDocsBeanItem> uploadDocsBean;

    public DocUploadRequest() {
        this((List) null, 1, (g) null);
    }

    public static /* synthetic */ DocUploadRequest copy$default(DocUploadRequest docUploadRequest, List<UploadDocsBeanItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = docUploadRequest.uploadDocsBean;
        }
        return docUploadRequest.copy(list);
    }

    public final List<UploadDocsBeanItem> component1() {
        return this.uploadDocsBean;
    }

    public final DocUploadRequest copy(List<UploadDocsBeanItem> list) {
        return new DocUploadRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DocUploadRequest) && l.a(this.uploadDocsBean, ((DocUploadRequest) obj).uploadDocsBean);
    }

    public final List<UploadDocsBeanItem> getUploadDocsBean() {
        return this.uploadDocsBean;
    }

    public int hashCode() {
        List<UploadDocsBeanItem> list = this.uploadDocsBean;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setUploadDocsBean(List<UploadDocsBeanItem> list) {
        this.uploadDocsBean = list;
    }

    public String toString() {
        return "DocUploadRequest(uploadDocsBean=" + this.uploadDocsBean + ')';
    }

    public DocUploadRequest(List<UploadDocsBeanItem> list) {
        this.uploadDocsBean = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DocUploadRequest(List list, int i10, g gVar) {
        this((i10 & 1) != 0 ? null : list);
    }
}
