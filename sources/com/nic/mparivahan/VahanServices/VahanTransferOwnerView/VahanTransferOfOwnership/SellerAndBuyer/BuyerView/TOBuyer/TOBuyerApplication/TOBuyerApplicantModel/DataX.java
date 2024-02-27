package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.TOBuyerApplication.TOBuyerApplicantModel;

import androidx.annotation.Keep;
import cm.l;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import ii.a;
import java.io.Serializable;
import java.util.ArrayList;

@Keep
public final class DataX implements Serializable {
    private final String applNo;
    private final String authMode;
    private final a buyerDto;
    private final String chassisNo;
    private final Durcdto durcdto;
    private final HpaDto hpaDto;
    private final HptDto hptDto;
    private final String mobileNo;
    private final int officeCode;
    private final String openDate;
    private final ArrayList<Integer> purposeCode;
    private final String regnNo;
    private final String sellerOrBuyer;
    private final String stateCode;
    private final TransferOwnershipDto transferOwnershipDto;

    public DataX(String str, String str2, a aVar, String str3, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str4, ArrayList<Integer> arrayList, String str5, String str6, String str7, String str8, TransferOwnershipDto transferOwnershipDto2) {
        l.f(str3, "mobileNo");
        l.f(arrayList, "purposeCode");
        this.applNo = str;
        this.authMode = str2;
        this.mobileNo = str3;
        this.durcdto = durcdto2;
        this.hpaDto = hpaDto2;
        this.hptDto = hptDto2;
        this.officeCode = i10;
        this.openDate = str4;
        this.purposeCode = arrayList;
        this.regnNo = str5;
        this.stateCode = str6;
        this.sellerOrBuyer = str7;
        this.chassisNo = str8;
        this.transferOwnershipDto = transferOwnershipDto2;
    }

    public static /* synthetic */ DataX copy$default(DataX dataX, String str, String str2, a aVar, String str3, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str4, ArrayList arrayList, String str5, String str6, String str7, String str8, TransferOwnershipDto transferOwnershipDto2, int i11, Object obj) {
        a aVar2;
        DataX dataX2 = dataX;
        int i12 = i11;
        String str9 = (i12 & 1) != 0 ? dataX2.applNo : str;
        String str10 = (i12 & 2) != 0 ? dataX2.authMode : str2;
        if ((i12 & 4) != 0) {
            dataX.getClass();
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        return dataX.copy(str9, str10, aVar2, (i12 & 8) != 0 ? dataX2.mobileNo : str3, (i12 & 16) != 0 ? dataX2.durcdto : durcdto2, (i12 & 32) != 0 ? dataX2.hpaDto : hpaDto2, (i12 & 64) != 0 ? dataX2.hptDto : hptDto2, (i12 & 128) != 0 ? dataX2.officeCode : i10, (i12 & 256) != 0 ? dataX2.openDate : str4, (i12 & 512) != 0 ? dataX2.purposeCode : arrayList, (i12 & 1024) != 0 ? dataX2.regnNo : str5, (i12 & 2048) != 0 ? dataX2.stateCode : str6, (i12 & 4096) != 0 ? dataX2.sellerOrBuyer : str7, (i12 & 8192) != 0 ? dataX2.chassisNo : str8, (i12 & 16384) != 0 ? dataX2.transferOwnershipDto : transferOwnershipDto2);
    }

    public final String component1() {
        return this.applNo;
    }

    public final ArrayList<Integer> component10() {
        return this.purposeCode;
    }

    public final String component11() {
        return this.regnNo;
    }

    public final String component12() {
        return this.stateCode;
    }

    public final String component13() {
        return this.sellerOrBuyer;
    }

    public final String component14() {
        return this.chassisNo;
    }

    public final TransferOwnershipDto component15() {
        return this.transferOwnershipDto;
    }

    public final String component2() {
        return this.authMode;
    }

    public final a component3() {
        return null;
    }

    public final String component4() {
        return this.mobileNo;
    }

    public final Durcdto component5() {
        return this.durcdto;
    }

    public final HpaDto component6() {
        return this.hpaDto;
    }

    public final HptDto component7() {
        return this.hptDto;
    }

    public final int component8() {
        return this.officeCode;
    }

    public final String component9() {
        return this.openDate;
    }

    public final DataX copy(String str, String str2, a aVar, String str3, Durcdto durcdto2, HpaDto hpaDto2, HptDto hptDto2, int i10, String str4, ArrayList<Integer> arrayList, String str5, String str6, String str7, String str8, TransferOwnershipDto transferOwnershipDto2) {
        String str9 = str3;
        l.f(str9, "mobileNo");
        ArrayList<Integer> arrayList2 = arrayList;
        l.f(arrayList2, "purposeCode");
        return new DataX(str, str2, aVar, str9, durcdto2, hpaDto2, hptDto2, i10, str4, arrayList2, str5, str6, str7, str8, transferOwnershipDto2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataX)) {
            return false;
        }
        DataX dataX = (DataX) obj;
        return l.a(this.applNo, dataX.applNo) && l.a(this.authMode, dataX.authMode) && l.a((Object) null, (Object) null) && l.a(this.mobileNo, dataX.mobileNo) && l.a(this.durcdto, dataX.durcdto) && l.a(this.hpaDto, dataX.hpaDto) && l.a(this.hptDto, dataX.hptDto) && this.officeCode == dataX.officeCode && l.a(this.openDate, dataX.openDate) && l.a(this.purposeCode, dataX.purposeCode) && l.a(this.regnNo, dataX.regnNo) && l.a(this.stateCode, dataX.stateCode) && l.a(this.sellerOrBuyer, dataX.sellerOrBuyer) && l.a(this.chassisNo, dataX.chassisNo) && l.a(this.transferOwnershipDto, dataX.transferOwnershipDto);
    }

    public final String getApplNo() {
        return this.applNo;
    }

    public final String getAuthMode() {
        return this.authMode;
    }

    public final a getBuyerDto() {
        return null;
    }

    public final String getChassisNo() {
        return this.chassisNo;
    }

    public final Durcdto getDurcdto() {
        return this.durcdto;
    }

    public final HpaDto getHpaDto() {
        return this.hpaDto;
    }

    public final HptDto getHptDto() {
        return this.hptDto;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final int getOfficeCode() {
        return this.officeCode;
    }

    public final String getOpenDate() {
        return this.openDate;
    }

    public final ArrayList<Integer> getPurposeCode() {
        return this.purposeCode;
    }

    public final String getRegnNo() {
        return this.regnNo;
    }

    public final String getSellerOrBuyer() {
        return this.sellerOrBuyer;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final TransferOwnershipDto getTransferOwnershipDto() {
        return this.transferOwnershipDto;
    }

    public int hashCode() {
        String str = this.applNo;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authMode;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 961) + this.mobileNo.hashCode()) * 31;
        Durcdto durcdto2 = this.durcdto;
        int hashCode3 = (hashCode2 + (durcdto2 == null ? 0 : durcdto2.hashCode())) * 31;
        HpaDto hpaDto2 = this.hpaDto;
        int hashCode4 = (hashCode3 + (hpaDto2 == null ? 0 : hpaDto2.hashCode())) * 31;
        HptDto hptDto2 = this.hptDto;
        int hashCode5 = (((hashCode4 + (hptDto2 == null ? 0 : hptDto2.hashCode())) * 31) + Integer.hashCode(this.officeCode)) * 31;
        String str3 = this.openDate;
        int hashCode6 = (((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.purposeCode.hashCode()) * 31;
        String str4 = this.regnNo;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.stateCode;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sellerOrBuyer;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.chassisNo;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        TransferOwnershipDto transferOwnershipDto2 = this.transferOwnershipDto;
        if (transferOwnershipDto2 != null) {
            i10 = transferOwnershipDto2.hashCode();
        }
        return hashCode10 + i10;
    }

    public String toString() {
        return "DataX(applNo=" + this.applNo + ", authMode=" + this.authMode + ", buyerDto=" + null + ", mobileNo=" + this.mobileNo + ", durcdto=" + this.durcdto + ", hpaDto=" + this.hpaDto + ", hptDto=" + this.hptDto + ", officeCode=" + this.officeCode + ", openDate=" + this.openDate + ", purposeCode=" + this.purposeCode + ", regnNo=" + this.regnNo + ", stateCode=" + this.stateCode + ", sellerOrBuyer=" + this.sellerOrBuyer + ", chassisNo=" + this.chassisNo + ", transferOwnershipDto=" + this.transferOwnershipDto + ')';
    }
}
