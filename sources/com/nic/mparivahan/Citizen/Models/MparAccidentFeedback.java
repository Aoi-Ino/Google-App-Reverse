package com.nic.mparivahan.Citizen.Models;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class MparAccidentFeedback {
    private final int feedbackAccidentId;
    private final String feedbackCreatedAt;
    private final int feedbackId;
    private final String feedbackRemarks;

    public MparAccidentFeedback(int i10, String str, int i11, String str2) {
        l.f(str, "feedbackCreatedAt");
        l.f(str2, "feedbackRemarks");
        this.feedbackAccidentId = i10;
        this.feedbackCreatedAt = str;
        this.feedbackId = i11;
        this.feedbackRemarks = str2;
    }

    public static /* synthetic */ MparAccidentFeedback copy$default(MparAccidentFeedback mparAccidentFeedback, int i10, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = mparAccidentFeedback.feedbackAccidentId;
        }
        if ((i12 & 2) != 0) {
            str = mparAccidentFeedback.feedbackCreatedAt;
        }
        if ((i12 & 4) != 0) {
            i11 = mparAccidentFeedback.feedbackId;
        }
        if ((i12 & 8) != 0) {
            str2 = mparAccidentFeedback.feedbackRemarks;
        }
        return mparAccidentFeedback.copy(i10, str, i11, str2);
    }

    public final int component1() {
        return this.feedbackAccidentId;
    }

    public final String component2() {
        return this.feedbackCreatedAt;
    }

    public final int component3() {
        return this.feedbackId;
    }

    public final String component4() {
        return this.feedbackRemarks;
    }

    public final MparAccidentFeedback copy(int i10, String str, int i11, String str2) {
        l.f(str, "feedbackCreatedAt");
        l.f(str2, "feedbackRemarks");
        return new MparAccidentFeedback(i10, str, i11, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MparAccidentFeedback)) {
            return false;
        }
        MparAccidentFeedback mparAccidentFeedback = (MparAccidentFeedback) obj;
        return this.feedbackAccidentId == mparAccidentFeedback.feedbackAccidentId && l.a(this.feedbackCreatedAt, mparAccidentFeedback.feedbackCreatedAt) && this.feedbackId == mparAccidentFeedback.feedbackId && l.a(this.feedbackRemarks, mparAccidentFeedback.feedbackRemarks);
    }

    public final int getFeedbackAccidentId() {
        return this.feedbackAccidentId;
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

    public int hashCode() {
        return (((((Integer.hashCode(this.feedbackAccidentId) * 31) + this.feedbackCreatedAt.hashCode()) * 31) + Integer.hashCode(this.feedbackId)) * 31) + this.feedbackRemarks.hashCode();
    }

    public String toString() {
        return "MparAccidentFeedback(feedbackAccidentId=" + this.feedbackAccidentId + ", feedbackCreatedAt=" + this.feedbackCreatedAt + ", feedbackId=" + this.feedbackId + ", feedbackRemarks=" + this.feedbackRemarks + ')';
    }
}
