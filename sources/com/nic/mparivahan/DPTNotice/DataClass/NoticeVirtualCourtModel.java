package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class NoticeVirtualCourtModel {
    @c("code")
    private final int code;
    @c("proceeding_data")
    private final ArrayList<NoticeCourtProceedingDataModel> proceeding_data;
    @c("result")
    private final ArrayList<NoticeCourtStatusModel> result;

    public NoticeVirtualCourtModel() {
        this(0, (ArrayList) null, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ NoticeVirtualCourtModel copy$default(NoticeVirtualCourtModel noticeVirtualCourtModel, int i10, ArrayList<NoticeCourtStatusModel> arrayList, ArrayList<NoticeCourtProceedingDataModel> arrayList2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = noticeVirtualCourtModel.code;
        }
        if ((i11 & 2) != 0) {
            arrayList = noticeVirtualCourtModel.result;
        }
        if ((i11 & 4) != 0) {
            arrayList2 = noticeVirtualCourtModel.proceeding_data;
        }
        return noticeVirtualCourtModel.copy(i10, arrayList, arrayList2);
    }

    public final int component1() {
        return this.code;
    }

    public final ArrayList<NoticeCourtStatusModel> component2() {
        return this.result;
    }

    public final ArrayList<NoticeCourtProceedingDataModel> component3() {
        return this.proceeding_data;
    }

    public final NoticeVirtualCourtModel copy(int i10, ArrayList<NoticeCourtStatusModel> arrayList, ArrayList<NoticeCourtProceedingDataModel> arrayList2) {
        l.f(arrayList, "result");
        l.f(arrayList2, "proceeding_data");
        return new NoticeVirtualCourtModel(i10, arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeVirtualCourtModel)) {
            return false;
        }
        NoticeVirtualCourtModel noticeVirtualCourtModel = (NoticeVirtualCourtModel) obj;
        return this.code == noticeVirtualCourtModel.code && l.a(this.result, noticeVirtualCourtModel.result) && l.a(this.proceeding_data, noticeVirtualCourtModel.proceeding_data);
    }

    public final int getCode() {
        return this.code;
    }

    public final ArrayList<NoticeCourtProceedingDataModel> getProceeding_data() {
        return this.proceeding_data;
    }

    public final ArrayList<NoticeCourtStatusModel> getResult() {
        return this.result;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.result.hashCode()) * 31) + this.proceeding_data.hashCode();
    }

    public String toString() {
        return "NoticeVirtualCourtModel(code=" + this.code + ", result=" + this.result + ", proceeding_data=" + this.proceeding_data + ')';
    }

    public NoticeVirtualCourtModel(int i10, ArrayList<NoticeCourtStatusModel> arrayList, ArrayList<NoticeCourtProceedingDataModel> arrayList2) {
        l.f(arrayList, "result");
        l.f(arrayList2, "proceeding_data");
        this.code = i10;
        this.result = arrayList;
        this.proceeding_data = arrayList2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeVirtualCourtModel(int i10, ArrayList arrayList, ArrayList arrayList2, int i11, g gVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? new ArrayList() : arrayList, (i11 & 4) != 0 ? new ArrayList() : arrayList2);
    }
}
