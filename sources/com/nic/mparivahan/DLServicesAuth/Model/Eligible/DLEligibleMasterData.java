package com.nic.mparivahan.DLServicesAuth.Model.Eligible;

import androidx.annotation.Keep;
import j7.c;
import java.io.Serializable;
import java.util.List;

@Keep
public final class DLEligibleMasterData implements Serializable {

    @Keep
    public static final class DLCOVList implements Serializable {
        private LMV lMV;
        private MCWG mCWG;

        public final LMV getLMV() {
            return this.lMV;
        }

        public final MCWG getMCWG() {
            return this.mCWG;
        }

        public final void setLMV(LMV lmv) {
            this.lMV = lmv;
        }

        public final void setMCWG(MCWG mcwg) {
            this.mCWG = mcwg;
        }
    }

    @Keep
    public static final class DlservicesValidationdto implements Serializable {
        private String Msg;
        private String ReqStatus;
        private List<Result> Result;
        private String status_code;
        private String status_desc;

        public final String getMsg() {
            return this.Msg;
        }

        public final String getReqStatus() {
            return this.ReqStatus;
        }

        public final List<Result> getResult() {
            return this.Result;
        }

        public final String getStatus_code() {
            return this.status_code;
        }

        public final String getStatus_desc() {
            return this.status_desc;
        }

        public final void setMsg(String str) {
            this.Msg = str;
        }

        public final void setReqStatus(String str) {
            this.ReqStatus = str;
        }

        public final void setResult(List<Result> list) {
            this.Result = list;
        }

        public final void setStatus_code(String str) {
            this.status_code = str;
        }

        public final void setStatus_desc(String str) {
            this.status_desc = str;
        }
    }

    @Keep
    public static final class EligibleDLSerList implements Serializable {
        @c("513")
        private String _513;
        @c("514")
        private String _514;
        @c("515")
        private String _515;
        @c("516")
        private String _516;
        @c("523")
        private String _523;
        @c("524")
        private String _524;
        @c("525")
        private String _525;
        @c("526")
        private String _526;
        @c("537")
        private String _537;
        @c("548")
        private String _548;

        public final String get_513() {
            return this._513;
        }

        public final String get_514() {
            return this._514;
        }

        public final String get_515() {
            return this._515;
        }

        public final String get_516() {
            return this._516;
        }

        public final String get_523() {
            return this._523;
        }

        public final String get_524() {
            return this._524;
        }

        public final String get_525() {
            return this._525;
        }

        public final String get_526() {
            return this._526;
        }

        public final String get_537() {
            return this._537;
        }

        public final String get_548() {
            return this._548;
        }

        public final void set_513(String str) {
            this._513 = str;
        }

        public final void set_514(String str) {
            this._514 = str;
        }

        public final void set_515(String str) {
            this._515 = str;
        }

        public final void set_516(String str) {
            this._516 = str;
        }

        public final void set_523(String str) {
            this._523 = str;
        }

        public final void set_524(String str) {
            this._524 = str;
        }

        public final void set_525(String str) {
            this._525 = str;
        }

        public final void set_526(String str) {
            this._526 = str;
        }

        public final void set_537(String str) {
            this._537 = str;
        }

        public final void set_548(String str) {
            this._548 = str;
        }
    }

    @Keep
    public static final class LMV implements Serializable {
        private String covIssueAuthCode;
        private String covabbrv;
        private String covdesc;
        private String dcCovStatus;
        private String dcCovcd;
        private String dcIssRtocode;
        private String dcIssuedt;
        private String olaName;
        private String psvBadgeElg;
        private String vecatg;

        public final String getCovIssueAuthCode() {
            return this.covIssueAuthCode;
        }

        public final String getCovabbrv() {
            return this.covabbrv;
        }

        public final String getCovdesc() {
            return this.covdesc;
        }

        public final String getDcCovStatus() {
            return this.dcCovStatus;
        }

        public final String getDcCovcd() {
            return this.dcCovcd;
        }

        public final String getDcIssRtocode() {
            return this.dcIssRtocode;
        }

        public final String getDcIssuedt() {
            return this.dcIssuedt;
        }

        public final String getOlaName() {
            return this.olaName;
        }

        public final String getPsvBadgeElg() {
            return this.psvBadgeElg;
        }

        public final String getVecatg() {
            return this.vecatg;
        }

        public final void setCovIssueAuthCode(String str) {
            this.covIssueAuthCode = str;
        }

        public final void setCovabbrv(String str) {
            this.covabbrv = str;
        }

        public final void setCovdesc(String str) {
            this.covdesc = str;
        }

        public final void setDcCovStatus(String str) {
            this.dcCovStatus = str;
        }

        public final void setDcCovcd(String str) {
            this.dcCovcd = str;
        }

        public final void setDcIssRtocode(String str) {
            this.dcIssRtocode = str;
        }

        public final void setDcIssuedt(String str) {
            this.dcIssuedt = str;
        }

        public final void setOlaName(String str) {
            this.olaName = str;
        }

        public final void setPsvBadgeElg(String str) {
            this.psvBadgeElg = str;
        }

        public final void setVecatg(String str) {
            this.vecatg = str;
        }
    }

    @Keep
    public static final class MCWG implements Serializable {
        private String covIssueAuthCode;
        private String covabbrv;
        private String covdesc;
        private String dcCovStatus;
        private String dcCovcd;
        private String dcIssRtocode;
        private String dcIssuedt;
        private String olaName;
        private String psvBadgeElg;
        private String vecatg;

        public final String getCovIssueAuthCode() {
            return this.covIssueAuthCode;
        }

        public final String getCovabbrv() {
            return this.covabbrv;
        }

        public final String getCovdesc() {
            return this.covdesc;
        }

        public final String getDcCovStatus() {
            return this.dcCovStatus;
        }

        public final String getDcCovcd() {
            return this.dcCovcd;
        }

        public final String getDcIssRtocode() {
            return this.dcIssRtocode;
        }

        public final String getDcIssuedt() {
            return this.dcIssuedt;
        }

        public final String getOlaName() {
            return this.olaName;
        }

        public final String getPsvBadgeElg() {
            return this.psvBadgeElg;
        }

        public final String getVecatg() {
            return this.vecatg;
        }

        public final void setCovIssueAuthCode(String str) {
            this.covIssueAuthCode = str;
        }

        public final void setCovabbrv(String str) {
            this.covabbrv = str;
        }

        public final void setCovdesc(String str) {
            this.covdesc = str;
        }

        public final void setDcCovStatus(String str) {
            this.dcCovStatus = str;
        }

        public final void setDcCovcd(String str) {
            this.dcCovcd = str;
        }

        public final void setDcIssRtocode(String str) {
            this.dcIssRtocode = str;
        }

        public final void setDcIssuedt(String str) {
            this.dcIssuedt = str;
        }

        public final void setOlaName(String str) {
            this.olaName = str;
        }

        public final void setPsvBadgeElg(String str) {
            this.psvBadgeElg = str;
        }

        public final void setVecatg(String str) {
            this.vecatg = str;
        }
    }

    @Keep
    public static final class Result implements Serializable {
        private String AllowIDPfromIndEmb;
        private String apdNaturalName;
        private String apdPermAdd1;
        private String apdPermAdd2;
        private String apdPermAdd3;
        private int apdPermPin;
        private String apdTempAdd1;
        private String apdTempAdd2;
        private String apdTempAdd3;
        private int apdTempPin;
        private int applEmpCatg;
        private String applFirstName;
        private String applFullName;
        private String applLastName;
        private String applQualName;
        private String bioId;
        private String biocitizen;
        private String bioorgdonor;
        private String bloodGroup;
        private DLCOVList dLCOVList;
        private String dlDispatchStatus;
        private String dlEndorseAuth;
        private String dlEndorsedt;
        private String dlEndorsetime;
        private String dlIssueauth;
        private String dlIssuedt;
        private int dlLatestTrcode;
        private String dlNtValdfrDt;
        private String dlNtValdtoDt;
        private String dlPrintStatus;
        private String dlRecGenesis;
        private String dlRemarks;
        private String dlSeqno;
        private String dlStatus;
        private String dlno;
        private EligibleDLSerList eligibleDLSerList;
        private int haz_issueinstt_code;
        private String relFirstName;
        private String relLastName;
        private String relationType;

        public final String getAllowIDPfromIndEmb() {
            return this.AllowIDPfromIndEmb;
        }

        public final String getApdNaturalName() {
            return this.apdNaturalName;
        }

        public final String getApdPermAdd1() {
            return this.apdPermAdd1;
        }

        public final String getApdPermAdd2() {
            return this.apdPermAdd2;
        }

        public final String getApdPermAdd3() {
            return this.apdPermAdd3;
        }

        public final int getApdPermPin() {
            return this.apdPermPin;
        }

        public final String getApdTempAdd1() {
            return this.apdTempAdd1;
        }

        public final String getApdTempAdd2() {
            return this.apdTempAdd2;
        }

        public final String getApdTempAdd3() {
            return this.apdTempAdd3;
        }

        public final int getApdTempPin() {
            return this.apdTempPin;
        }

        public final int getApplEmpCatg() {
            return this.applEmpCatg;
        }

        public final String getApplFirstName() {
            return this.applFirstName;
        }

        public final String getApplFullName() {
            return this.applFullName;
        }

        public final String getApplLastName() {
            return this.applLastName;
        }

        public final String getApplQualName() {
            return this.applQualName;
        }

        public final String getBioId() {
            return this.bioId;
        }

        public final String getBiocitizen() {
            return this.biocitizen;
        }

        public final String getBioorgdonor() {
            return this.bioorgdonor;
        }

        public final String getBloodGroup() {
            return this.bloodGroup;
        }

        public final DLCOVList getDLCOVList() {
            return this.dLCOVList;
        }

        public final String getDlDispatchStatus() {
            return this.dlDispatchStatus;
        }

        public final String getDlEndorseAuth() {
            return this.dlEndorseAuth;
        }

        public final String getDlEndorsedt() {
            return this.dlEndorsedt;
        }

        public final String getDlEndorsetime() {
            return this.dlEndorsetime;
        }

        public final String getDlIssueauth() {
            return this.dlIssueauth;
        }

        public final String getDlIssuedt() {
            return this.dlIssuedt;
        }

        public final int getDlLatestTrcode() {
            return this.dlLatestTrcode;
        }

        public final String getDlNtValdfrDt() {
            return this.dlNtValdfrDt;
        }

        public final String getDlNtValdtoDt() {
            return this.dlNtValdtoDt;
        }

        public final String getDlPrintStatus() {
            return this.dlPrintStatus;
        }

        public final String getDlRecGenesis() {
            return this.dlRecGenesis;
        }

        public final String getDlRemarks() {
            return this.dlRemarks;
        }

        public final String getDlSeqno() {
            return this.dlSeqno;
        }

        public final String getDlStatus() {
            return this.dlStatus;
        }

        public final String getDlno() {
            return this.dlno;
        }

        public final EligibleDLSerList getEligibleDLSerList() {
            return this.eligibleDLSerList;
        }

        public final int getHaz_issueinstt_code() {
            return this.haz_issueinstt_code;
        }

        public final String getRelFirstName() {
            return this.relFirstName;
        }

        public final String getRelLastName() {
            return this.relLastName;
        }

        public final String getRelationType() {
            return this.relationType;
        }

        public final void setAllowIDPfromIndEmb(String str) {
            this.AllowIDPfromIndEmb = str;
        }

        public final void setApdNaturalName(String str) {
            this.apdNaturalName = str;
        }

        public final void setApdPermAdd1(String str) {
            this.apdPermAdd1 = str;
        }

        public final void setApdPermAdd2(String str) {
            this.apdPermAdd2 = str;
        }

        public final void setApdPermAdd3(String str) {
            this.apdPermAdd3 = str;
        }

        public final void setApdPermPin(int i10) {
            this.apdPermPin = i10;
        }

        public final void setApdTempAdd1(String str) {
            this.apdTempAdd1 = str;
        }

        public final void setApdTempAdd2(String str) {
            this.apdTempAdd2 = str;
        }

        public final void setApdTempAdd3(String str) {
            this.apdTempAdd3 = str;
        }

        public final void setApdTempPin(int i10) {
            this.apdTempPin = i10;
        }

        public final void setApplEmpCatg(int i10) {
            this.applEmpCatg = i10;
        }

        public final void setApplFirstName(String str) {
            this.applFirstName = str;
        }

        public final void setApplFullName(String str) {
            this.applFullName = str;
        }

        public final void setApplLastName(String str) {
            this.applLastName = str;
        }

        public final void setApplQualName(String str) {
            this.applQualName = str;
        }

        public final void setBioId(String str) {
            this.bioId = str;
        }

        public final void setBiocitizen(String str) {
            this.biocitizen = str;
        }

        public final void setBioorgdonor(String str) {
            this.bioorgdonor = str;
        }

        public final void setBloodGroup(String str) {
            this.bloodGroup = str;
        }

        public final void setDLCOVList(DLCOVList dLCOVList2) {
            this.dLCOVList = dLCOVList2;
        }

        public final void setDlDispatchStatus(String str) {
            this.dlDispatchStatus = str;
        }

        public final void setDlEndorseAuth(String str) {
            this.dlEndorseAuth = str;
        }

        public final void setDlEndorsedt(String str) {
            this.dlEndorsedt = str;
        }

        public final void setDlEndorsetime(String str) {
            this.dlEndorsetime = str;
        }

        public final void setDlIssueauth(String str) {
            this.dlIssueauth = str;
        }

        public final void setDlIssuedt(String str) {
            this.dlIssuedt = str;
        }

        public final void setDlLatestTrcode(int i10) {
            this.dlLatestTrcode = i10;
        }

        public final void setDlNtValdfrDt(String str) {
            this.dlNtValdfrDt = str;
        }

        public final void setDlNtValdtoDt(String str) {
            this.dlNtValdtoDt = str;
        }

        public final void setDlPrintStatus(String str) {
            this.dlPrintStatus = str;
        }

        public final void setDlRecGenesis(String str) {
            this.dlRecGenesis = str;
        }

        public final void setDlRemarks(String str) {
            this.dlRemarks = str;
        }

        public final void setDlSeqno(String str) {
            this.dlSeqno = str;
        }

        public final void setDlStatus(String str) {
            this.dlStatus = str;
        }

        public final void setDlno(String str) {
            this.dlno = str;
        }

        public final void setEligibleDLSerList(EligibleDLSerList eligibleDLSerList2) {
            this.eligibleDLSerList = eligibleDLSerList2;
        }

        public final void setHaz_issueinstt_code(int i10) {
            this.haz_issueinstt_code = i10;
        }

        public final void setRelFirstName(String str) {
            this.relFirstName = str;
        }

        public final void setRelLastName(String str) {
            this.relLastName = str;
        }

        public final void setRelationType(String str) {
            this.relationType = str;
        }
    }

    @Keep
    public static final class Root implements Serializable {
        private DlservicesValidationdto dlservicesValidationdto;
        private String param;
        private String responseBody;

        public final DlservicesValidationdto getDlservicesValidationdto() {
            return this.dlservicesValidationdto;
        }

        public final String getParam() {
            return this.param;
        }

        public final String getResponseBody() {
            return this.responseBody;
        }

        public final void setDlservicesValidationdto(DlservicesValidationdto dlservicesValidationdto2) {
            this.dlservicesValidationdto = dlservicesValidationdto2;
        }

        public final void setParam(String str) {
            this.param = str;
        }

        public final void setResponseBody(String str) {
            this.responseBody = str;
        }
    }
}
