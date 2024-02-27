package com.nic.mparivahan.DPTNotice.DataClass;

import androidx.annotation.Keep;
import cm.g;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class NoticeListModel {
    @c("code")
    private final String code;
    @c("data")
    private final ArrayList<DPTNoticeDataModel> data;
    @c("total_challan")
    private final int total_challan;

    public NoticeListModel() {
        this((String) null, 0, (ArrayList) null, 7, (g) null);
    }

    public static /* synthetic */ NoticeListModel copy$default(NoticeListModel noticeListModel, String str, int i10, ArrayList<DPTNoticeDataModel> arrayList, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = noticeListModel.code;
        }
        if ((i11 & 2) != 0) {
            i10 = noticeListModel.total_challan;
        }
        if ((i11 & 4) != 0) {
            arrayList = noticeListModel.data;
        }
        return noticeListModel.copy(str, i10, arrayList);
    }

    public final String component1() {
        return this.code;
    }

    public final int component2() {
        return this.total_challan;
    }

    public final ArrayList<DPTNoticeDataModel> component3() {
        return this.data;
    }

    public final NoticeListModel copy(String str, int i10, ArrayList<DPTNoticeDataModel> arrayList) {
        l.f(str, "code");
        l.f(arrayList, "data");
        return new NoticeListModel(str, i10, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeListModel)) {
            return false;
        }
        NoticeListModel noticeListModel = (NoticeListModel) obj;
        return l.a(this.code, noticeListModel.code) && this.total_challan == noticeListModel.total_challan && l.a(this.data, noticeListModel.data);
    }

    public final String getCode() {
        return this.code;
    }

    public final ArrayList<DPTNoticeDataModel> getData() {
        return this.data;
    }

    public final int getTotal_challan() {
        return this.total_challan;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + Integer.hashCode(this.total_challan)) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "NoticeListModel(code=" + this.code + ", total_challan=" + this.total_challan + ", data=" + this.data + ')';
    }

    public NoticeListModel(String str, int i10, ArrayList<DPTNoticeDataModel> arrayList) {
        l.f(str, "code");
        l.f(arrayList, "data");
        this.code = str;
        this.total_challan = i10;
        this.data = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoticeListModel(String str, int i10, ArrayList arrayList, int i11, g gVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? new ArrayList() : arrayList);
    }
}
