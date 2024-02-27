package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparViolationFeedback {
    private final String feedbackCreatedAt;
    private final int feedbackId;
    private final String feedbackRemarks;
    private final int feedbackViolationId;

    public MparViolationFeedback(String str, int i10, String str2, int i11) {
        l.f(str, "feedbackCreatedAt");
        l.f(str2, "feedbackRemarks");
        this.feedbackCreatedAt = str;
        this.feedbackId = i10;
        this.feedbackRemarks = str2;
        this.feedbackViolationId = i11;
    }

    public static /* synthetic */ MparViolationFeedback copy$default(MparViolationFeedback mparViolationFeedback, String str, int i10, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mparViolationFeedback.feedbackCreatedAt;
        }
        if ((i12 & 2) != 0) {
            i10 = mparViolationFeedback.feedbackId;
        }
        if ((i12 & 4) != 0) {
            str2 = mparViolationFeedback.feedbackRemarks;
        }
        if ((i12 & 8) != 0) {
            i11 = mparViolationFeedback.feedbackViolationId;
        }
        return mparViolationFeedback.copy(str, i10, str2, i11);
    }

    public final String component1() {
        return this.feedbackCreatedAt;
    }

    public final int component2() {
        return this.feedbackId;
    }

    public final String component3() {
        return this.feedbackRemarks;
    }

    public final int component4() {
        return this.feedbackViolationId;
    }

    public final MparViolationFeedback copy(String str, int i10, String str2, int i11) {
        l.f(str, "feedbackCreatedAt");
        l.f(str2, "feedbackRemarks");
        return new MparViolationFeedback(str, i10, str2, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparViolationFeedback)) {
            return false;
        }
        MparViolationFeedback mparViolationFeedback = (MparViolationFeedback) obj;
        return l.a(this.feedbackCreatedAt, mparViolationFeedback.feedbackCreatedAt) && this.feedbackId == mparViolationFeedback.feedbackId && l.a(this.feedbackRemarks, mparViolationFeedback.feedbackRemarks) && this.feedbackViolationId == mparViolationFeedback.feedbackViolationId;
    }

    public final String getFeedbackCreatedAt() {
        return this.feedbackCreatedAt;
    }

    public final int getFeedbackId() {
        return this.feedbackId;
    }

    public final String getFeedbackRemarks() {
        return this.feedbackRemarks;
    }

    public final int getFeedbackViolationId() {
        return this.feedbackViolationId;
    }

    public int hashCode() {
        return (((((this.feedbackCreatedAt.hashCode() * 31) + Integer.hashCode(this.feedbackId)) * 31) + this.feedbackRemarks.hashCode()) * 31) + Integer.hashCode(this.feedbackViolationId);
    }

    public String toString() {
        return "MparViolationFeedback(feedbackCreatedAt=" + this.feedbackCreatedAt + ", feedbackId=" + this.feedbackId + ", feedbackRemarks=" + this.feedbackRemarks + ", feedbackViolationId=" + this.feedbackViolationId + ')';
    }
}
