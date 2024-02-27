package com.nic.mparivahan.VahanEkyc;

import androidx.annotation.Keep;

@Keep
public final class AadarkycVerify {

    @Keep
    public static final class DoAadhaarResponse {
        private String aadhaarNo;
        private dOEkyc dOAuthOTP;
        private String reason;
        private String status;
        private String txnNo;

        public final String getAadhaarNo() {
            return this.aadhaarNo;
        }

        public final dOEkyc getDOAuthOTP() {
            return this.dOAuthOTP;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getStatus() {
            return this.status;
        }

        public final String getTxnNo() {
            return this.txnNo;
        }

        public final void setAadhaarNo(String str) {
            this.aadhaarNo = str;
        }

        public final void setDOAuthOTP(dOEkyc doekyc) {
            this.dOAuthOTP = doekyc;
        }

        public final void setReason(String str) {
            this.reason = str;
        }

        public final void setStatus(String str) {
            this.status = str;
        }

        public final void setTxnNo(String str) {
            this.txnNo = str;
        }
    }

    @Keep
    public static final class Response {
        private DoAadhaarResponse doAadhaarResponse;
        private String responseBody;

        public final DoAadhaarResponse getDoAadhaarResponse() {
            return this.doAadhaarResponse;
        }

        public final String getResponseBody() {
            return this.responseBody;
        }

        public final void setDoAadhaarResponse(DoAadhaarResponse doAadhaarResponse2) {
            this.doAadhaarResponse = doAadhaarResponse2;
        }

        public final void setResponseBody(String str) {
            this.responseBody = str;
        }
    }

    @Keep
    public static final class dOEkyc {
        private String last_four_mobile;
        private Boolean mobileverify = Boolean.FALSE;
        private String status;

        public final String getLast_four_mobile() {
            return this.last_four_mobile;
        }

        public final Boolean getMobileverify() {
            return this.mobileverify;
        }

        public final String getStatus() {
            return this.status;
        }

        public final void setLast_four_mobile(String str) {
            this.last_four_mobile = str;
        }

        public final void setMobileverify(Boolean bool) {
            this.mobileverify = bool;
        }

        public final void setStatus(String str) {
            this.status = str;
        }
    }
}
