package com.nic.mparivahan.dlservices.data.model.temp;

import android.net.Uri;
import androidx.annotation.Keep;
import cm.l;
import j7.c;
import java.util.ArrayList;

@Keep
public final class DocumentListItem {
    @c("abbrv")
    private final String abbrv = "";
    private String application_no;
    @c("code")
    private final String code = "";
    private String contactNo;
    private String docCode;
    private String docName;
    private String docNo = "";
    private String docStatus;
    private String docURL;
    private String docseqNo;
    private String fileNmae;
    private String fileToUpload = "";
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f21673id = "";
    private boolean isBrowseStatus;
    private boolean isDocInsertedStatus;
    private boolean isPutUpCase;
    private boolean isSelectdatestatus;
    private String issueAuthDesg = "";
    private String issueDate = "";
    @c("name")
    private final String name = "";
    private String proofCode;
    private ArrayList<ProofList> proofLists;
    private String proofName;
    private String remarks;
    private String reuploaded;
    private String stateCode;
    private String transationCode;
    private Uri uRI;
    private String verifyStatus;

    public final String getAbbrv() {
        return this.abbrv;
    }

    public final String getApplication_no() {
        return this.application_no;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getContactNo() {
        return this.contactNo;
    }

    public final String getDocCode() {
        return this.docCode;
    }

    public final String getDocName() {
        return this.docName;
    }

    public final String getDocNo() {
        return this.docNo;
    }

    public final String getDocStatus() {
        return this.docStatus;
    }

    public final String getDocURL() {
        return this.docURL;
    }

    public final String getDocseqNo() {
        return this.docseqNo;
    }

    public final String getFileNmae() {
        return this.fileNmae;
    }

    public final String getFileToUpload() {
        return this.fileToUpload;
    }

    public final String getId() {
        return this.f21673id;
    }

    public final String getIssueAuthDesg() {
        return this.issueAuthDesg;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProofCode() {
        return this.proofCode;
    }

    public final ArrayList<ProofList> getProofLists() {
        return this.proofLists;
    }

    public final String getProofName() {
        return this.proofName;
    }

    public final String getRemarks() {
        return this.remarks;
    }

    public final String getReuploaded() {
        return this.reuploaded;
    }

    public final String getStateCode() {
        return this.stateCode;
    }

    public final String getTransationCode() {
        return this.transationCode;
    }

    public final Uri getURI() {
        return this.uRI;
    }

    public final String getVerifyStatus() {
        return this.verifyStatus;
    }

    public final boolean isBrowseStatus() {
        return this.isBrowseStatus;
    }

    public final boolean isDocInsertedStatus() {
        return this.isDocInsertedStatus;
    }

    public final boolean isPutUpCase() {
        return this.isPutUpCase;
    }

    public final boolean isSelectdatestatus() {
        return this.isSelectdatestatus;
    }

    public final void setApplication_no(String str) {
        this.application_no = str;
    }

    public final void setBrowseStatus(boolean z10) {
        this.isBrowseStatus = z10;
    }

    public final void setContactNo(String str) {
        this.contactNo = str;
    }

    public final void setDocCode(String str) {
        this.docCode = str;
    }

    public final void setDocInsertedStatus(boolean z10) {
        this.isDocInsertedStatus = z10;
    }

    public final void setDocName(String str) {
        this.docName = str;
    }

    public final void setDocNo(String str) {
        l.f(str, "<set-?>");
        this.docNo = str;
    }

    public final void setDocStatus(String str) {
        this.docStatus = str;
    }

    public final void setDocURL(String str) {
        this.docURL = str;
    }

    public final void setDocseqNo(String str) {
        this.docseqNo = str;
    }

    public final void setFileNmae(String str) {
        this.fileNmae = str;
    }

    public final void setFileToUpload(String str) {
        l.f(str, "<set-?>");
        this.fileToUpload = str;
    }

    public final void setIssueAuthDesg(String str) {
        l.f(str, "<set-?>");
        this.issueAuthDesg = str;
    }

    public final void setIssueDate(String str) {
        l.f(str, "<set-?>");
        this.issueDate = str;
    }

    public final void setProofCode(String str) {
        this.proofCode = str;
    }

    public final void setProofLists(ArrayList<ProofList> arrayList) {
        this.proofLists = arrayList;
    }

    public final void setProofName(String str) {
        this.proofName = str;
    }

    public final void setPutUpCase(boolean z10) {
        this.isPutUpCase = z10;
    }

    public final void setRemarks(String str) {
        this.remarks = str;
    }

    public final void setReuploaded(String str) {
        this.reuploaded = str;
    }

    public final void setSelectdatestatus(boolean z10) {
        this.isSelectdatestatus = z10;
    }

    public final void setStateCode(String str) {
        this.stateCode = str;
    }

    public final void setTransationCode(String str) {
        this.transationCode = str;
    }

    public final void setURI(Uri uri) {
        this.uRI = uri;
    }

    public final void setVerifyStatus(String str) {
        this.verifyStatus = str;
    }
}
