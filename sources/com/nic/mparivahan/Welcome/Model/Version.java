package com.nic.mparivahan.Welcome.Model;

import androidx.annotation.Keep;
import cm.l;

@Keep
public final class Version {
    private final String statusCode;
    private final String statusDesc;
    private final VersionX version;

    public Version(String str, String str2, VersionX versionX) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        this.statusCode = str;
        this.statusDesc = str2;
        this.version = versionX;
    }

    public static /* synthetic */ Version copy$default(Version version2, String str, String str2, VersionX versionX, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = version2.statusCode;
        }
        if ((i10 & 2) != 0) {
            str2 = version2.statusDesc;
        }
        if ((i10 & 4) != 0) {
            versionX = version2.version;
        }
        return version2.copy(str, str2, versionX);
    }

    public final String component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.statusDesc;
    }

    public final VersionX component3() {
        return this.version;
    }

    public final Version copy(String str, String str2, VersionX versionX) {
        l.f(str, "statusCode");
        l.f(str2, "statusDesc");
        return new Version(str, str2, versionX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version2 = (Version) obj;
        return l.a(this.statusCode, version2.statusCode) && l.a(this.statusDesc, version2.statusDesc) && l.a(this.version, version2.version);
    }

    public final String getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusDesc() {
        return this.statusDesc;
    }

    public final VersionX getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = ((this.statusCode.hashCode() * 31) + this.statusDesc.hashCode()) * 31;
        VersionX versionX = this.version;
        return hashCode + (versionX == null ? 0 : versionX.hashCode());
    }

    public String toString() {
        return "Version(statusCode=" + this.statusCode + ", statusDesc=" + this.statusDesc + ", version=" + this.version + ')';
    }
}
