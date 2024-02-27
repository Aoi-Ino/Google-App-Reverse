package com.nic.mparivahan.RC.Model;

import androidx.annotation.Keep;
import cm.g;
import cm.l;

@Keep
public final class ImpoundRcResultModel {
    private final String doc_impound_type;
    private final String document;
    private final String impound_type;

    public ImpoundRcResultModel() {
        this((String) null, (String) null, (String) null, 7, (g) null);
    }

    public static /* synthetic */ ImpoundRcResultModel copy$default(ImpoundRcResultModel impoundRcResultModel, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = impoundRcResultModel.impound_type;
        }
        if ((i10 & 2) != 0) {
            str2 = impoundRcResultModel.document;
        }
        if ((i10 & 4) != 0) {
            str3 = impoundRcResultModel.doc_impound_type;
        }
        return impoundRcResultModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.impound_type;
    }

    public final String component2() {
        return this.document;
    }

    public final String component3() {
        return this.doc_impound_type;
    }

    public final ImpoundRcResultModel copy(String str, String str2, String str3) {
        l.f(str, "impound_type");
        l.f(str2, "document");
        l.f(str3, "doc_impound_type");
        return new ImpoundRcResultModel(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImpoundRcResultModel)) {
            return false;
        }
        ImpoundRcResultModel impoundRcResultModel = (ImpoundRcResultModel) obj;
        return l.a(this.impound_type, impoundRcResultModel.impound_type) && l.a(this.document, impoundRcResultModel.document) && l.a(this.doc_impound_type, impoundRcResultModel.doc_impound_type);
    }

    public final String getDoc_impound_type() {
        return this.doc_impound_type;
    }

    public final String getDocument() {
        return this.document;
    }

    public final String getImpound_type() {
        return this.impound_type;
    }

    public int hashCode() {
        return (((this.impound_type.hashCode() * 31) + this.document.hashCode()) * 31) + this.doc_impound_type.hashCode();
    }

    public String toString() {
        return "ImpoundRcResultModel(impound_type=" + this.impound_type + ", document=" + this.document + ", doc_impound_type=" + this.doc_impound_type + ')';
    }

    public ImpoundRcResultModel(String str, String str2, String str3) {
        l.f(str, "impound_type");
        l.f(str2, "document");
        l.f(str3, "doc_impound_type");
        this.impound_type = str;
        this.document = str2;
        this.doc_impound_type = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImpoundRcResultModel(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
